package org.telegram.ui.Cells;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.Forum.ForumBubbleDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LetterDrawable;

public class ShareTopicCell extends FrameLayout {
    private final AvatarDrawable avatarDrawable;
    private final int currentAccount;
    private long currentDialog;
    private long currentTopic;
    private final BackupImageView imageView;
    private final TextView nameTextView;
    private final Theme.ResourcesProvider resourcesProvider;

    public ShareTopicCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(backupImageView, LayoutHelper.createFrame(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.nameTextView = textView;
        textView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, LayoutHelper.createFrame(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.avatarDrawable = new AvatarDrawable(resourcesProvider) {
            @Override
            public void invalidateSelf() {
                super.invalidateSelf();
                ShareTopicCell.this.imageView.invalidate();
            }
        };
        setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(103.0f), 1073741824));
    }

    public void setAsNewBotForumTopic(boolean z) {
        this.nameTextView.setText(LocaleController.getString(z ? R.string.ShareSendToNewTopic : R.string.ShareSendToOffTopic));
        this.imageView.setAnimatedEmojiDrawable(null);
        ForumBubbleDrawable forumBubbleDrawable = new ForumBubbleDrawable(ForumBubbleDrawable.serverSupportedColor[0]);
        LetterDrawable letterDrawable = new LetterDrawable(null, 1);
        letterDrawable.setTitle("");
        letterDrawable.scale = 1.8f;
        CombinedDrawable combinedDrawable = new CombinedDrawable(forumBubbleDrawable, letterDrawable, 0, 0);
        combinedDrawable.setFullsize(true);
        this.imageView.setImageDrawable(combinedDrawable);
    }

    public void setTopic(TLRPC.Dialog dialog, TLRPC.TL_forumTopic tL_forumTopic, boolean z, CharSequence charSequence) {
        if (dialog == null) {
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
        if (charSequence != null) {
            this.nameTextView.setText(charSequence);
        } else if (dialog.id > 0) {
            this.nameTextView.setText(tL_forumTopic.title);
        } else if (chat != null) {
            if (chat.monoforum) {
                this.nameTextView.setText(MessagesController.getInstance(this.currentAccount).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)));
            } else {
                this.nameTextView.setText(tL_forumTopic.title);
            }
        } else {
            this.nameTextView.setText("");
        }
        if (ChatObject.isMonoForum(chat)) {
            this.imageView.setAnimatedEmojiDrawable(null);
            this.imageView.setImageDrawable(null);
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (DialogObject.isUserDialog(peerDialogId)) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                this.nameTextView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
                this.avatarDrawable.setInfo(this.currentAccount, user);
                if (charSequence != null) {
                    this.nameTextView.setText(charSequence);
                } else if (user != null) {
                    this.nameTextView.setText(ContactsController.formatName(user.first_name, user.last_name));
                } else {
                    this.nameTextView.setText("");
                }
                this.imageView.setForUserOrChat(user, this.avatarDrawable);
                this.imageView.setRoundRadius(AndroidUtilities.dp(28.0f));
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(peerDialogId));
                if (charSequence != null) {
                    this.nameTextView.setText(charSequence);
                } else if (chat2 != null) {
                    this.nameTextView.setText(chat2.title);
                } else {
                    this.nameTextView.setText("");
                }
                this.avatarDrawable.setInfo(this.currentAccount, chat2);
                this.imageView.setForUserOrChat(chat, this.avatarDrawable);
            }
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            this.imageView.setImageDrawable(null);
            this.imageView.setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(13, UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id));
        } else {
            this.imageView.setAnimatedEmojiDrawable(null);
            ForumBubbleDrawable forumBubbleDrawable = new ForumBubbleDrawable(tL_forumTopic.icon_color);
            LetterDrawable letterDrawable = new LetterDrawable(null, 1);
            String upperCase = tL_forumTopic.title.trim().toUpperCase();
            letterDrawable.setTitle(upperCase.length() >= 1 ? upperCase.substring(0, 1) : "");
            letterDrawable.scale = 1.8f;
            CombinedDrawable combinedDrawable = new CombinedDrawable(forumBubbleDrawable, letterDrawable, 0, 0);
            combinedDrawable.setFullsize(true);
            this.imageView.setImageDrawable(combinedDrawable);
        }
        this.imageView.setRoundRadius((chat == null || !chat.forum || z) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
        this.currentDialog = dialog.id;
        this.currentTopic = tL_forumTopic.id;
    }

    public long getCurrentDialog() {
        return this.currentDialog;
    }

    public long getCurrentTopic() {
        return this.currentTopic;
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
