package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.util.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.Theme;

public class ReactedHeaderView extends FrameLayout {
    private AvatarsImageView avatarsImageView;
    private int currentAccount;
    private long dialogId;
    private int fixedWidth;
    private FlickerLoadingView flickerLoadingView;
    private ImageView iconView;
    private boolean ignoreLayout;
    private boolean isLoaded;
    private MessageObject message;
    private BackupImageView reactView;
    private Consumer seenCallback;
    private List<UserSeen> seenUsers;
    private TextView titleView;
    private List<UserSeen> users;

    public ReactedHeaderView(Context context, int i, MessageObject messageObject, long j) {
        super(context);
        this.seenUsers = new ArrayList();
        this.users = new ArrayList();
        this.currentAccount = i;
        this.message = messageObject;
        this.dialogId = j;
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        this.flickerLoadingView = flickerLoadingView;
        flickerLoadingView.setColors(Theme.key_actionBarDefaultSubmenuBackground, Theme.key_listSelector, -1);
        this.flickerLoadingView.setViewType(13);
        this.flickerLoadingView.setIsSingleCell(false);
        addView(this.flickerLoadingView, LayoutHelper.createFrame(-2, -1.0f));
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
        this.titleView.setTextSize(1, 16.0f);
        this.titleView.setLines(1);
        this.titleView.setEllipsize(TextUtils.TruncateAt.END);
        addView(this.titleView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 40.0f, 0.0f, 62.0f, 0.0f));
        AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
        this.avatarsImageView = avatarsImageView;
        avatarsImageView.setStyle(11);
        this.avatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(this.avatarsImageView, LayoutHelper.createFrameRelatively(56.0f, -1.0f, 8388629, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.iconView = imageView;
        addView(imageView, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable drawableMutate = context.getDrawable(R.drawable.msg_reactions).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItemIcon, false), PorterDuff.Mode.MULTIPLY));
        this.iconView.setImageDrawable(drawableMutate);
        this.iconView.setVisibility(8);
        BackupImageView backupImageView = new BackupImageView(context);
        this.reactView = backupImageView;
        addView(backupImageView, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        this.titleView.setAlpha(0.0f);
        this.avatarsImageView.setAlpha(0.0f);
        setBackground(Theme.getSelectorDrawable(false));
    }

    public void lambda$loadReactions$6(int i, TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList) {
        String pluralString;
        String strValueOf;
        if (this.seenUsers.isEmpty() || this.seenUsers.size() < i) {
            pluralString = LocaleController.formatPluralString("ReactionsCount", i, new Object[0]);
        } else {
            if (i == this.seenUsers.size()) {
                strValueOf = String.valueOf(i);
            } else {
                strValueOf = i + "/" + this.seenUsers.size();
            }
            pluralString = String.format(LocaleController.getPluralString("Reacted", i), strValueOf);
        }
        if (getMeasuredWidth() > 0) {
            this.fixedWidth = getMeasuredWidth();
        }
        this.titleView.setText(pluralString);
        TLRPC.TL_messageReactions tL_messageReactions = this.message.messageOwner.reactions;
        if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
            Iterator<TLRPC.TL_availableReaction> it = MediaDataController.getInstance(this.currentAccount).getReactionsList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.iconView.setVisibility(0);
                    this.iconView.setAlpha(0.0f);
                    this.iconView.animate().alpha(1.0f).start();
                    break;
                }
                TLRPC.TL_availableReaction next = it.next();
                if (next.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                    this.reactView.setImage(ImageLocation.getForDocument(next.center_icon), "40_40_lastreactframe", "webp", (Drawable) null, next);
                    this.reactView.setVisibility(0);
                    this.reactView.setAlpha(0.0f);
                    this.reactView.animate().alpha(1.0f).start();
                    this.iconView.setVisibility(8);
                    break;
                }
            }
        } else {
            this.iconView.setVisibility(0);
            this.iconView.setAlpha(0.0f);
            this.iconView.animate().alpha(1.0f).start();
            break;
        }
        ArrayList<TLRPC.User> arrayList = tL_messages_messageReactionsList.users;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            TLRPC.User user = arrayList.get(i2);
            i2++;
            TLRPC.User user2 = user;
            TLRPC.Peer peer = this.message.messageOwner.from_id;
            if (peer != null && user2.id != peer.user_id) {
                int i3 = 0;
                while (true) {
                    if (i3 >= this.users.size()) {
                        this.users.add(new UserSeen(user2, 0));
                        break;
                    } else if (this.users.get(i3).dialogId == user2.id) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        ArrayList<TLRPC.Chat> arrayList2 = tL_messages_messageReactionsList.chats;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            TLRPC.Chat chat = arrayList2.get(i4);
            i4++;
            TLRPC.Chat chat2 = chat;
            TLRPC.Peer peer2 = this.message.messageOwner.from_id;
            if (peer2 != null && chat2.id != peer2.user_id) {
                int i5 = 0;
                while (true) {
                    if (i5 >= this.users.size()) {
                        this.users.add(new UserSeen(chat2, 0));
                        break;
                    } else if (this.users.get(i5).dialogId == (-chat2.id)) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        }
        updateView();
    }

    public void lambda$loadReactions$7(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
            TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
            int i = tL_messages_messageReactionsList.count;
            tL_messages_messageReactionsList.users.size();
            post(new SlotsDrawable$$ExternalSyntheticLambda9(this, i, tL_messages_messageReactionsList, 17));
        }
    }

    public void lambda$onAttachedToWindow$0(List list) {
        this.seenUsers.addAll(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserSeen userSeen = (UserSeen) it.next();
            int i = 0;
            while (true) {
                if (i >= this.users.size()) {
                    this.users.add(userSeen);
                    break;
                } else {
                    if (MessageObject.getObjectPeerId(this.users.get(i).user) == MessageObject.getObjectPeerId(userSeen.user)) {
                        if (userSeen.date <= 0) {
                            break;
                        }
                        this.users.get(i).date = userSeen.date;
                        break;
                    }
                    i++;
                }
            }
        }
        Consumer consumer = this.seenCallback;
        if (consumer != null) {
            consumer.accept(list);
        }
        loadReactions();
    }

    public void lambda$onAttachedToWindow$1(TLObject tLObject, List list, List list2, List list3, Runnable runnable) {
        if (tLObject != null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            for (int i = 0; i < tL_channels_channelParticipants.users.size(); i++) {
                TLRPC.User user = tL_channels_channelParticipants.users.get(i);
                MessagesController.getInstance(this.currentAccount).putUser(user, false);
                int iIndexOf = list.indexOf(Long.valueOf(user.id));
                if (!user.self && iIndexOf >= 0) {
                    list2.add(new UserSeen(user, ((Integer) list3.get(iIndexOf)).intValue()));
                }
            }
        }
        runnable.run();
    }

    public void lambda$onAttachedToWindow$2(List list, List list2, List list3, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ReactedHeaderView$$ExternalSyntheticLambda1(this, tLObject, list, list2, list3, runnable, 0));
    }

    public void lambda$onAttachedToWindow$3(TLObject tLObject, List list, List list2, List list3, Runnable runnable) {
        if (tLObject != null) {
            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
            for (int i = 0; i < tL_messages_chatFull.users.size(); i++) {
                TLRPC.User user = tL_messages_chatFull.users.get(i);
                MessagesController.getInstance(this.currentAccount).putUser(user, false);
                int iIndexOf = list.indexOf(Long.valueOf(user.id));
                if (!user.self && iIndexOf >= 0) {
                    list2.add(new UserSeen(user, ((Integer) list3.get(iIndexOf)).intValue()));
                }
            }
        }
        runnable.run();
    }

    public void lambda$onAttachedToWindow$4(List list, List list2, List list3, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ReactedHeaderView$$ExternalSyntheticLambda1(this, tLObject, list, list2, list3, runnable, 1));
    }

    public void lambda$onAttachedToWindow$5(long j, TLRPC.Chat chat, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof Vector) {
            final ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            ArrayList<T> arrayList3 = ((Vector) tLObject).objects;
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                if (obj instanceof Long) {
                    Long l = (Long) obj;
                    if (j != l.longValue()) {
                        arrayList.add(l);
                        arrayList2.add(0);
                    }
                } else if (obj instanceof TLRPC.TL_readParticipantDate) {
                    TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj;
                    long j2 = tL_readParticipantDate.user_id;
                    int i2 = tL_readParticipantDate.date;
                    if (j != j2) {
                        arrayList.add(Long.valueOf(j2));
                        arrayList2.add(Integer.valueOf(i2));
                    }
                }
            }
            arrayList.add(Long.valueOf(j));
            arrayList2.add(0);
            final ArrayList arrayList4 = new ArrayList();
            final UndoView$$ExternalSyntheticLambda3 undoView$$ExternalSyntheticLambda3 = new UndoView$$ExternalSyntheticLambda3(10, this, arrayList4);
            if (!ChatObject.isChannel(chat)) {
                TLRPC.TL_messages_getFullChat tL_messages_getFullChat = new TLRPC.TL_messages_getFullChat();
                tL_messages_getFullChat.chat_id = chat.id;
                final int i3 = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getFullChat, new RequestDelegate(this) {
                    public final ReactedHeaderView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                        switch (i3) {
                            case 0:
                                this.f$0.lambda$onAttachedToWindow$2(arrayList, arrayList4, arrayList2, undoView$$ExternalSyntheticLambda3, tLObject2, tL_error2);
                                break;
                            default:
                                this.f$0.lambda$onAttachedToWindow$4(arrayList, arrayList4, arrayList2, undoView$$ExternalSyntheticLambda3, tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                return;
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.limit = MessagesController.getInstance(this.currentAccount).chatReadMarkSizeThreshold;
            tL_channels_getParticipants.offset = 0;
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            tL_channels_getParticipants.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(chat.id);
            final int i4 = 0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new RequestDelegate(this) {
                public final ReactedHeaderView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                    switch (i4) {
                        case 0:
                            this.f$0.lambda$onAttachedToWindow$2(arrayList, arrayList4, arrayList2, undoView$$ExternalSyntheticLambda3, tLObject2, tL_error2);
                            break;
                        default:
                            this.f$0.lambda$onAttachedToWindow$4(arrayList, arrayList4, arrayList2, undoView$$ExternalSyntheticLambda3, tLObject2, tL_error2);
                            break;
                    }
                }
            });
        }
    }

    private void loadReactions() {
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(this.message.getDialogId());
        tL_messages_getMessageReactionsList.id = this.message.getId();
        tL_messages_getMessageReactionsList.limit = 3;
        tL_messages_getMessageReactionsList.reaction = null;
        tL_messages_getMessageReactionsList.offset = null;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessageReactionsList, new UndoView$$ExternalSyntheticLambda0(this, 13), 64);
    }

    private void updateView() {
        int iDp;
        float fDp;
        setEnabled(this.users.size() > 0);
        for (int i = 0; i < 3; i++) {
            if (i < this.users.size()) {
                this.avatarsImageView.setObject(i, this.currentAccount, this.users.get(i).user);
            } else {
                this.avatarsImageView.setObject(i, this.currentAccount, null);
            }
        }
        int size = this.users.size();
        if (size != 1) {
            if (size != 2) {
                fDp = 0.0f;
            } else {
                iDp = AndroidUtilities.dp(12.0f);
            }
            AvatarsImageView avatarsImageView = this.avatarsImageView;
            if (LocaleController.isRTL) {
                fDp = AndroidUtilities.dp(12.0f);
            }
            avatarsImageView.setTranslationX(fDp);
            this.avatarsImageView.commitTransition(false);
            this.titleView.animate().alpha(1.0f).setDuration(220L).start();
            this.avatarsImageView.animate().alpha(1.0f).setDuration(220L).start();
            this.flickerLoadingView.animate().alpha(0.0f).setDuration(220L).setListener(new HideViewAfterAnimation(this.flickerLoadingView)).start();
        }
        iDp = AndroidUtilities.dp(24.0f);
        fDp = iDp;
        AvatarsImageView avatarsImageView2 = this.avatarsImageView;
        if (LocaleController.isRTL) {
            fDp = AndroidUtilities.dp(12.0f);
        }
        avatarsImageView2.setTranslationX(fDp);
        this.avatarsImageView.commitTransition(false);
        this.titleView.animate().alpha(1.0f).setDuration(220L).start();
        this.avatarsImageView.animate().alpha(1.0f).setDuration(220L).start();
        this.flickerLoadingView.animate().alpha(0.0f).setDuration(220L).setListener(new HideViewAfterAnimation(this.flickerLoadingView)).start();
    }

    public List<UserSeen> getSeenUsers() {
        return this.seenUsers;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isLoaded) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        final TLRPC.Chat chat = messagesController.getChat(Long.valueOf(this.message.getChatId()));
        TLRPC.ChatFull chatFull = messagesController.getChatFull(this.message.getChatId());
        if (chat == null || !this.message.isOutOwner() || !this.message.isSent() || this.message.isEditing() || this.message.isSending() || this.message.isSendError() || this.message.isContentUnread() || this.message.isUnread() || ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.message.messageOwner.date >= 604800 || ((!ChatObject.isMegagroup(chat) && ChatObject.isChannel(chat)) || chatFull == null || chatFull.participants_count > MessagesController.getInstance(this.currentAccount).chatReadMarkSizeThreshold || (this.message.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
            loadReactions();
            return;
        }
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = this.message.getId();
        tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.message.getDialogId());
        TLRPC.Peer peer = this.message.messageOwner.from_id;
        final long j = peer != null ? peer.user_id : 0L;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessageReadParticipants, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$onAttachedToWindow$5(j, chat, tLObject, tL_error);
            }
        }, 64);
    }

    @Override
    public void onMeasure(int i, int i2) {
        int i3 = this.fixedWidth;
        if (i3 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        if (this.flickerLoadingView.getVisibility() != 0) {
            super.onMeasure(i, i2);
            return;
        }
        this.ignoreLayout = true;
        this.flickerLoadingView.setVisibility(8);
        super.onMeasure(i, i2);
        this.flickerLoadingView.getLayoutParams().width = getMeasuredWidth();
        this.flickerLoadingView.setVisibility(0);
        this.ignoreLayout = false;
        super.onMeasure(i, i2);
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    public void setSeenCallback(Consumer consumer) {
        this.seenCallback = consumer;
    }

    public static class UserSeen {
        public int date;
        long dialogId;
        public TLObject user;

        public UserSeen(TLRPC.User user) {
            this.date = 0;
            this.user = user;
            this.dialogId = user.id;
        }

        public UserSeen(TLObject tLObject, int i) {
            this.user = tLObject;
            this.date = i;
            if (tLObject instanceof TLRPC.User) {
                this.dialogId = ((TLRPC.User) tLObject).id;
            } else if (tLObject instanceof TLRPC.Chat) {
                this.dialogId = -((TLRPC.Chat) tLObject).id;
            }
        }
    }
}
