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
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
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

    private void fetchDialogs() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.quickforward.QuickShareSelectorOverlayLayout.fetchDialogs():void");
    }

    private static String key(ChatMessageCell chatMessageCell) {
        MessageObject messageObject = chatMessageCell.getMessageObject();
        if (messageObject == null) {
            return null;
        }
        return messageObject.getChatId() + "_" + messageObject.getId();
    }

    public void lambda$open$0(String str) {
        this.drawablesForRemove.add(str);
        invalidate();
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

    public void close(ChatMessageCell chatMessageCell, Bulletin bulletin) {
        QuickShareSelectorDrawable quickShareSelectorDrawable = (QuickShareSelectorDrawable) this.drawableHashMap.get(key(chatMessageCell));
        if (quickShareSelectorDrawable != null) {
            quickShareSelectorDrawable.close(bulletin);
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

    @Override
    public void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (drawable instanceof QuickShareSelectorDrawable) {
            invalidate();
        }
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

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Iterator it = this.drawableHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((QuickShareSelectorDrawable) ((Map.Entry) it.next()).getValue()).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void onTouchMoveEvent(ChatMessageCell chatMessageCell, float f, float f2) {
        QuickShareSelectorDrawable quickShareSelectorDrawable = (QuickShareSelectorDrawable) this.drawableHashMap.get(key(chatMessageCell));
        if (quickShareSelectorDrawable != null) {
            quickShareSelectorDrawable.onTouchMoveEvent(f, f2);
        }
    }

    public void open(ChatMessageCell chatMessageCell) {
        fetchDialogs();
        final String key = key(chatMessageCell);
        if (key == null) {
            return;
        }
        QuickShareSelectorDrawable quickShareSelectorDrawable = new QuickShareSelectorDrawable(this, chatMessageCell, removeDuplicates(this.dialogs), key, new Runnable() {
            @Override
            public final void run() {
                QuickShareSelectorOverlayLayout.this.lambda$open$0(key);
            }
        });
        quickShareSelectorDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        quickShareSelectorDrawable.setCallback(this);
        if (this.drawableHashMap.containsKey(key)) {
            return;
        }
        this.drawableHashMap.put(key, quickShareSelectorDrawable);
    }
}
