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
import com.google.android.gms.internal.mlkit_vision_common.zzkp;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda51;

public final class ReactedHeaderView extends FrameLayout {
    public final AvatarsImageView avatarsImageView;
    public final int currentAccount;
    public int fixedWidth;
    public final FlickerLoadingView flickerLoadingView;
    public final ImageView iconView;
    public boolean ignoreLayout;
    public final MessageObject message;
    public final BackupImageView reactView;
    public Consumer seenCallback;
    public final ArrayList seenUsers;
    public final TextView titleView;
    public final ArrayList users;

    public final class UserSeen {
        public int date;
        public final long dialogId;
        public final TLObject user;

        public UserSeen(int i, TLObject tLObject) {
            this.user = tLObject;
            this.date = i;
            if (tLObject instanceof TLRPC.User) {
                this.dialogId = ((TLRPC.User) tLObject).id;
            } else if (tLObject instanceof TLRPC.Chat) {
                this.dialogId = -((TLRPC.Chat) tLObject).id;
            }
        }
    }

    public ReactedHeaderView(Context context, int i, MessageObject messageObject) {
        super(context);
        this.seenUsers = new ArrayList();
        this.users = new ArrayList();
        this.currentAccount = i;
        this.message = messageObject;
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
        this.flickerLoadingView = flickerLoadingView;
        int i2 = Theme.key_actionBarDefaultSubmenuBackground;
        int i3 = Theme.key_listSelector;
        flickerLoadingView.colorKey1 = i2;
        flickerLoadingView.colorKey2 = i3;
        flickerLoadingView.colorKey3 = -1;
        flickerLoadingView.invalidate();
        flickerLoadingView.setViewType(13);
        flickerLoadingView.setIsSingleCell(false);
        addView(flickerLoadingView, LayoutHelper.createFrame(-1.0f, -2));
        TextView textView = new TextView(context);
        this.titleView = textView;
        zzkp.m(16.0f, Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false), textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 40.0f, 0.0f, 62.0f, 0.0f));
        AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
        this.avatarsImageView = avatarsImageView;
        avatarsImageView.setStyle(11);
        avatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(avatarsImageView, LayoutHelper.createFrameRelatively(56.0f, -1.0f, 8388629, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.iconView = imageView;
        addView(imageView, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable drawableMutate = context.getDrawable(R.drawable.msg_reactions).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItemIcon, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(drawableMutate);
        imageView.setVisibility(8);
        BackupImageView backupImageView = new BackupImageView(context);
        this.reactView = backupImageView;
        addView(backupImageView, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        textView.setAlpha(0.0f);
        avatarsImageView.setAlpha(0.0f);
        setBackground(Theme.getSelectorDrawable(false));
    }

    public List<UserSeen> getSeenUsers() {
        return this.seenUsers;
    }

    public final void loadReactions() {
        int i = this.currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.message;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = 3;
        tL_messages_getMessageReactionsList.reaction = null;
        tL_messages_getMessageReactionsList.offset = null;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getMessageReactionsList, new CallLogActivity$$ExternalSyntheticLambda1(this, 29), 64);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i);
        MessageObject messageObject = this.message;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(messageObject.getChatId()));
        TLRPC.ChatFull chatFull = messagesController.getChatFull(messageObject.getChatId());
        if (chat == null || !messageObject.isOutOwner() || !messageObject.isSent() || messageObject.isEditing() || messageObject.isSending() || messageObject.isSendError() || messageObject.isContentUnread() || messageObject.isUnread() || ConnectionsManager.getInstance(i).getCurrentTime() - messageObject.messageOwner.date >= 604800 || ((!ChatObject.isMegagroup(chat) && ChatObject.isChannel(chat)) || chatFull == null || chatFull.participants_count > MessagesController.getInstance(i).chatReadMarkSizeThreshold || (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
            loadReactions();
            return;
        }
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
        tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i).getInputPeer(messageObject.getDialogId());
        TLRPC.Peer peer = messageObject.messageOwner.from_id;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getMessageReadParticipants, new LaunchActivity$$ExternalSyntheticLambda51(this, peer != null ? peer.user_id : 0L, chat, 3), 64);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = this.fixedWidth;
        if (i3 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        FlickerLoadingView flickerLoadingView = this.flickerLoadingView;
        if (flickerLoadingView.getVisibility() != 0) {
            super.onMeasure(i, i2);
            return;
        }
        this.ignoreLayout = true;
        flickerLoadingView.setVisibility(8);
        super.onMeasure(i, i2);
        flickerLoadingView.getLayoutParams().width = getMeasuredWidth();
        flickerLoadingView.setVisibility(0);
        this.ignoreLayout = false;
        super.onMeasure(i, i2);
    }

    @Override
    public final void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    public void setSeenCallback(Consumer consumer) {
        this.seenCallback = consumer;
    }
}
