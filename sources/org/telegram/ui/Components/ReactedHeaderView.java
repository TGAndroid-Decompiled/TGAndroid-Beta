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
import androidx.core.content.ContextCompat;
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
    private List seenUsers;
    private TextView titleView;
    private List users;

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
        textView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem));
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
        Drawable drawableMutate = ContextCompat.getDrawable(context, R.drawable.msg_reactions).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon), PorterDuff.Mode.MULTIPLY));
        this.iconView.setImageDrawable(drawableMutate);
        this.iconView.setVisibility(8);
        BackupImageView backupImageView = new BackupImageView(context);
        this.reactView = backupImageView;
        addView(backupImageView, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        this.titleView.setAlpha(0.0f);
        this.avatarsImageView.setAlpha(0.0f);
        setBackground(Theme.getSelectorDrawable(false));
    }

    public void setSeenCallback(Consumer consumer) {
        this.seenCallback = consumer;
    }

    public static class UserSeen {
        public int date;
        long dialogId;
        public TLObject user;

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

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isLoaded) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        final TLRPC.Chat chat = messagesController.getChat(Long.valueOf(this.message.getChatId()));
        TLRPC.ChatFull chatFull = messagesController.getChatFull(this.message.getChatId());
        if (chat != null && this.message.isOutOwner() && this.message.isSent() && !this.message.isEditing() && !this.message.isSending() && !this.message.isSendError() && !this.message.isContentUnread() && !this.message.isUnread() && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.message.messageOwner.date < 604800 && ((ChatObject.isMegagroup(chat) || !ChatObject.isChannel(chat)) && chatFull != null && chatFull.participants_count <= MessagesController.getInstance(this.currentAccount).chatReadMarkSizeThreshold && !(this.message.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
            TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
            tL_messages_getMessageReadParticipants.msg_id = this.message.getId();
            tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.message.getDialogId());
            TLRPC.Peer peer = this.message.messageOwner.from_id;
            final long j = peer != null ? peer.user_id : 0L;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessageReadParticipants, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ReactedHeaderView.$r8$lambda$IHIYwVtDG2ExOUQV83nv2ZSuID8(this.f$0, j, chat, tLObject, tL_error);
                }
            }, 64);
            return;
        }
        loadReactions();
    }

    public static void $r8$lambda$IHIYwVtDG2ExOUQV83nv2ZSuID8(final ReactedHeaderView reactedHeaderView, long j, TLRPC.Chat chat, TLObject tLObject, TLRPC.TL_error tL_error) {
        reactedHeaderView.getClass();
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
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    ReactedHeaderView.$r8$lambda$9qpietCFqwkxZJotd3Y1Ec2G3XE(this.f$0, arrayList4);
                }
            };
            if (ChatObject.isChannel(chat)) {
                TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                tL_channels_getParticipants.limit = MessagesController.getInstance(reactedHeaderView.currentAccount).chatReadMarkSizeThreshold;
                tL_channels_getParticipants.offset = 0;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                tL_channels_getParticipants.channel = MessagesController.getInstance(reactedHeaderView.currentAccount).getInputChannel(chat.id);
                ConnectionsManager.getInstance(reactedHeaderView.currentAccount).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                        ReactedHeaderView.$r8$lambda$G9XSZJSzmE9HNk3lYBZc8ApRTUI(this.f$0, arrayList, arrayList4, arrayList2, runnable, tLObject2, tL_error2);
                    }
                });
                return;
            }
            TLRPC.TL_messages_getFullChat tL_messages_getFullChat = new TLRPC.TL_messages_getFullChat();
            tL_messages_getFullChat.chat_id = chat.id;
            ConnectionsManager.getInstance(reactedHeaderView.currentAccount).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                    ReactedHeaderView.$r8$lambda$WLVShuvP6GvdSaClK7TG0rrcNn0(this.f$0, arrayList, arrayList4, arrayList2, runnable, tLObject2, tL_error2);
                }
            });
        }
    }

    public static void $r8$lambda$9qpietCFqwkxZJotd3Y1Ec2G3XE(ReactedHeaderView reactedHeaderView, List list) {
        reactedHeaderView.seenUsers.addAll(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserSeen userSeen = (UserSeen) it.next();
            int i = 0;
            while (true) {
                if (i >= reactedHeaderView.users.size()) {
                    reactedHeaderView.users.add(userSeen);
                    break;
                } else {
                    if (MessageObject.getObjectPeerId(((UserSeen) reactedHeaderView.users.get(i)).user) == MessageObject.getObjectPeerId(userSeen.user)) {
                        if (userSeen.date <= 0) {
                            break;
                        }
                        ((UserSeen) reactedHeaderView.users.get(i)).date = userSeen.date;
                        break;
                    }
                    i++;
                }
            }
        }
        Consumer consumer = reactedHeaderView.seenCallback;
        if (consumer != null) {
            consumer.accept(list);
        }
        reactedHeaderView.loadReactions();
    }

    public static void $r8$lambda$G9XSZJSzmE9HNk3lYBZc8ApRTUI(final ReactedHeaderView reactedHeaderView, final List list, final List list2, final List list3, final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
        reactedHeaderView.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ReactedHeaderView.$r8$lambda$6k5yybSRTWlcMqMcmyrsNuMQwm8(this.f$0, tLObject, list, list2, list3, runnable);
            }
        });
    }

    public static void $r8$lambda$6k5yybSRTWlcMqMcmyrsNuMQwm8(ReactedHeaderView reactedHeaderView, TLObject tLObject, List list, List list2, List list3, Runnable runnable) {
        reactedHeaderView.getClass();
        if (tLObject != null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            for (int i = 0; i < tL_channels_channelParticipants.users.size(); i++) {
                TLRPC.User user = tL_channels_channelParticipants.users.get(i);
                MessagesController.getInstance(reactedHeaderView.currentAccount).putUser(user, false);
                int iIndexOf = list.indexOf(Long.valueOf(user.id));
                if (!user.self && iIndexOf >= 0) {
                    list2.add(new UserSeen(user, ((Integer) list3.get(iIndexOf)).intValue()));
                }
            }
        }
        runnable.run();
    }

    public static void $r8$lambda$WLVShuvP6GvdSaClK7TG0rrcNn0(final ReactedHeaderView reactedHeaderView, final List list, final List list2, final List list3, final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
        reactedHeaderView.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ReactedHeaderView.$r8$lambda$cVjtk1SNKfBKvSh8e4JLYcDzKxw(this.f$0, tLObject, list, list2, list3, runnable);
            }
        });
    }

    public static void $r8$lambda$cVjtk1SNKfBKvSh8e4JLYcDzKxw(ReactedHeaderView reactedHeaderView, TLObject tLObject, List list, List list2, List list3, Runnable runnable) {
        reactedHeaderView.getClass();
        if (tLObject != null) {
            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
            for (int i = 0; i < tL_messages_chatFull.users.size(); i++) {
                TLRPC.User user = tL_messages_chatFull.users.get(i);
                MessagesController.getInstance(reactedHeaderView.currentAccount).putUser(user, false);
                int iIndexOf = list.indexOf(Long.valueOf(user.id));
                if (!user.self && iIndexOf >= 0) {
                    list2.add(new UserSeen(user, ((Integer) list3.get(iIndexOf)).intValue()));
                }
            }
        }
        runnable.run();
    }

    private void loadReactions() {
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(this.message.getDialogId());
        tL_messages_getMessageReactionsList.id = this.message.getId();
        tL_messages_getMessageReactionsList.limit = 3;
        tL_messages_getMessageReactionsList.reaction = null;
        tL_messages_getMessageReactionsList.offset = null;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessageReactionsList, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ReactedHeaderView.m2686$r8$lambda$oTvvU_Q8jECjqksT8415vGaDS0(this.f$0, tLObject, tL_error);
            }
        }, 64);
    }

    public static void m2686$r8$lambda$oTvvU_Q8jECjqksT8415vGaDS0(final ReactedHeaderView reactedHeaderView, TLObject tLObject, TLRPC.TL_error tL_error) {
        reactedHeaderView.getClass();
        if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
            final TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
            final int i = tL_messages_messageReactionsList.count;
            tL_messages_messageReactionsList.users.size();
            reactedHeaderView.post(new Runnable() {
                @Override
                public final void run() {
                    ReactedHeaderView.m2685$r8$lambda$DLZ2RF5EmgOFwQ1ufTuC7qqf8Y(this.f$0, i, tL_messages_messageReactionsList);
                }
            });
        }
    }

    public static void m2685$r8$lambda$DLZ2RF5EmgOFwQ1ufTuC7qqf8Y(ReactedHeaderView reactedHeaderView, int i, TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList) {
        String pluralString;
        String strValueOf;
        if (reactedHeaderView.seenUsers.isEmpty() || reactedHeaderView.seenUsers.size() < i) {
            pluralString = LocaleController.formatPluralString("ReactionsCount", i, new Object[0]);
        } else {
            if (i == reactedHeaderView.seenUsers.size()) {
                strValueOf = String.valueOf(i);
            } else {
                strValueOf = i + "/" + reactedHeaderView.seenUsers.size();
            }
            pluralString = String.format(LocaleController.getPluralString("Reacted", i), strValueOf);
        }
        if (reactedHeaderView.getMeasuredWidth() > 0) {
            reactedHeaderView.fixedWidth = reactedHeaderView.getMeasuredWidth();
        }
        reactedHeaderView.titleView.setText(pluralString);
        TLRPC.TL_messageReactions tL_messageReactions = reactedHeaderView.message.messageOwner.reactions;
        if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
            Iterator<TLRPC.TL_availableReaction> it = MediaDataController.getInstance(reactedHeaderView.currentAccount).getReactionsList().iterator();
            while (true) {
                if (it.hasNext()) {
                    TLRPC.TL_availableReaction next = it.next();
                    if (next.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                        reactedHeaderView.reactView.setImage(ImageLocation.getForDocument(next.center_icon), "40_40_lastreactframe", "webp", (Drawable) null, next);
                        reactedHeaderView.reactView.setVisibility(0);
                        reactedHeaderView.reactView.setAlpha(0.0f);
                        reactedHeaderView.reactView.animate().alpha(1.0f).start();
                        reactedHeaderView.iconView.setVisibility(8);
                        break;
                    }
                } else {
                    reactedHeaderView.iconView.setVisibility(0);
                    reactedHeaderView.iconView.setAlpha(0.0f);
                    reactedHeaderView.iconView.animate().alpha(1.0f).start();
                    break;
                }
            }
        } else {
            reactedHeaderView.iconView.setVisibility(0);
            reactedHeaderView.iconView.setAlpha(0.0f);
            reactedHeaderView.iconView.animate().alpha(1.0f).start();
            break;
        }
        ArrayList<TLRPC.User> arrayList = tL_messages_messageReactionsList.users;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            TLRPC.User user = arrayList.get(i2);
            i2++;
            TLRPC.User user2 = user;
            TLRPC.Peer peer = reactedHeaderView.message.messageOwner.from_id;
            if (peer != null && user2.id != peer.user_id) {
                int i3 = 0;
                while (true) {
                    if (i3 >= reactedHeaderView.users.size()) {
                        reactedHeaderView.users.add(new UserSeen(user2, 0));
                        break;
                    } else if (((UserSeen) reactedHeaderView.users.get(i3)).dialogId == user2.id) {
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
            TLRPC.Peer peer2 = reactedHeaderView.message.messageOwner.from_id;
            if (peer2 != null && chat2.id != peer2.user_id) {
                int i5 = 0;
                while (true) {
                    if (i5 >= reactedHeaderView.users.size()) {
                        reactedHeaderView.users.add(new UserSeen(chat2, 0));
                        break;
                    } else if (((UserSeen) reactedHeaderView.users.get(i5)).dialogId == (-chat2.id)) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        }
        reactedHeaderView.updateView();
    }

    public List<UserSeen> getSeenUsers() {
        return this.seenUsers;
    }

    private void updateView() {
        int iDp;
        float fDp;
        setEnabled(this.users.size() > 0);
        for (int i = 0; i < 3; i++) {
            if (i < this.users.size()) {
                this.avatarsImageView.setObject(i, this.currentAccount, ((UserSeen) this.users.get(i)).user);
            } else {
                this.avatarsImageView.setObject(i, this.currentAccount, null);
            }
        }
        int size = this.users.size();
        if (size == 1) {
            iDp = AndroidUtilities.dp(24.0f);
        } else {
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

    @Override
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int i3 = this.fixedWidth;
        if (i3 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        if (this.flickerLoadingView.getVisibility() == 0) {
            this.ignoreLayout = true;
            this.flickerLoadingView.setVisibility(8);
            super.onMeasure(i, i2);
            this.flickerLoadingView.getLayoutParams().width = getMeasuredWidth();
            this.flickerLoadingView.setVisibility(0);
            this.ignoreLayout = false;
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }
}
