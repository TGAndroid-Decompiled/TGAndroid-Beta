package org.telegram.ui.Components.quickforward;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.Bulletin;

public class QuickShareSelectorOverlayLayout extends View {
    private final int currentAccount;
    private final ArrayList dialogs;
    private final HashMap drawableHashMap;
    private final ArrayList drawablesForRemove;

    public QuickShareSelectorOverlayLayout(Context context) {
        super(context);
        this.drawableHashMap = new HashMap();
        this.drawablesForRemove = new ArrayList();
        this.dialogs = new ArrayList();
        this.currentAccount = UserConfig.selectedAccount;
    }

    public void open(ChatMessageCell chatMessageCell) {
        fetchDialogs();
        final String strKey = key(chatMessageCell);
        if (strKey == null) {
            return;
        }
        QuickShareSelectorDrawable quickShareSelectorDrawable = new QuickShareSelectorDrawable(this, chatMessageCell, removeDuplicates(this.dialogs), strKey, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$open$0(strKey);
            }
        });
        quickShareSelectorDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        quickShareSelectorDrawable.setCallback(this);
        if (this.drawableHashMap.containsKey(strKey)) {
            return;
        }
        this.drawableHashMap.put(strKey, quickShareSelectorDrawable);
    }

    public void lambda$open$0(String str) {
        this.drawablesForRemove.add(str);
        invalidate();
    }

    public boolean isActive() {
        Iterator it = this.drawableHashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (((QuickShareSelectorDrawable) ((Map.Entry) it.next()).getValue()).isActive()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (drawable instanceof QuickShareSelectorDrawable) {
            invalidate();
        }
    }

    public void onTouchMoveEvent(ChatMessageCell chatMessageCell, float f, float f2) {
        QuickShareSelectorDrawable quickShareSelectorDrawable = (QuickShareSelectorDrawable) this.drawableHashMap.get(key(chatMessageCell));
        if (quickShareSelectorDrawable != null) {
            quickShareSelectorDrawable.onTouchMoveEvent(f, f2);
        }
    }

    public long getSelectedDialogId(ChatMessageCell chatMessageCell) {
        QuickShareSelectorDrawable quickShareSelectorDrawable = (QuickShareSelectorDrawable) this.drawableHashMap.get(key(chatMessageCell));
        if (quickShareSelectorDrawable != null) {
            return quickShareSelectorDrawable.getSelectedDialogId();
        }
        return 0L;
    }

    public MessageObject getSelectedMessageObject(ChatMessageCell chatMessageCell) {
        QuickShareSelectorDrawable quickShareSelectorDrawable = (QuickShareSelectorDrawable) this.drawableHashMap.get(key(chatMessageCell));
        if (quickShareSelectorDrawable != null) {
            return quickShareSelectorDrawable.messageObject;
        }
        return null;
    }

    public void close(ChatMessageCell chatMessageCell, Bulletin bulletin) {
        QuickShareSelectorDrawable quickShareSelectorDrawable = (QuickShareSelectorDrawable) this.drawableHashMap.get(key(chatMessageCell));
        if (quickShareSelectorDrawable != null) {
            quickShareSelectorDrawable.close(bulletin);
        }
    }

    @Override
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.drawableHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((QuickShareSelectorDrawable) ((Map.Entry) it.next()).getValue()).destroy();
        }
        this.drawableHashMap.clear();
        this.drawablesForRemove.clear();
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Iterator it = this.drawableHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((QuickShareSelectorDrawable) ((Map.Entry) it.next()).getValue()).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator it = this.drawableHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((QuickShareSelectorDrawable) ((Map.Entry) it.next()).getValue()).draw(canvas);
        }
        if (this.drawablesForRemove.isEmpty()) {
            return;
        }
        Iterator it2 = this.drawablesForRemove.iterator();
        while (it2.hasNext()) {
            QuickShareSelectorDrawable quickShareSelectorDrawable = (QuickShareSelectorDrawable) this.drawableHashMap.remove((String) it2.next());
            if (quickShareSelectorDrawable != null) {
                quickShareSelectorDrawable.destroy();
            }
        }
        this.drawablesForRemove.clear();
    }

    private void fetchDialogs() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        this.dialogs.clear();
        UserConfig userConfig = UserConfig.getInstance(this.currentAccount);
        long j = userConfig.clientUserId;
        this.dialogs.add(Long.valueOf(j));
        if (userConfig.suggestContacts) {
            Iterator<TLRPC.TL_topPeer> it = MediaDataController.getInstance(this.currentAccount).hints.iterator();
            while (it.hasNext()) {
                TLRPC.TL_topPeer next = it.next();
                long j2 = next.peer.user_id;
                if (j2 != 0 && MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(next.peer.user_id)) != null) {
                    this.dialogs.add(Long.valueOf(j2));
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
        for (int i = 0; i < allDialogs.size(); i++) {
            TLRPC.Dialog dialog = allDialogs.get(i);
            if (dialog instanceof TLRPC.TL_dialog) {
                long j3 = dialog.id;
                if (j3 != j && !DialogObject.isEncryptedDialog(j3)) {
                    if (DialogObject.isUserDialog(dialog.id)) {
                        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.id));
                        if (user != null && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.id)) {
                            if (dialog.folder_id == 1) {
                                arrayList.add(Long.valueOf(dialog.id));
                            } else {
                                this.dialogs.add(Long.valueOf(dialog.id));
                            }
                        }
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
                        if (chat != null && !chat.forum && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                            if (dialog.folder_id == 1) {
                                arrayList.add(Long.valueOf(dialog.id));
                            } else {
                                this.dialogs.add(Long.valueOf(dialog.id));
                            }
                        }
                    }
                }
            }
        }
        this.dialogs.addAll(arrayList);
    }

    private static String key(ChatMessageCell chatMessageCell) {
        MessageObject messageObject = chatMessageCell.getMessageObject();
        if (messageObject == null) {
            return null;
        }
        return messageObject.getChatId() + "_" + messageObject.getId();
    }

    private static ArrayList removeDuplicates(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            if (hashSet.add(l) && DialogObject.isUserDialog(l.longValue())) {
                arrayList2.add(l);
            }
        }
        return arrayList2;
    }
}
