package org.telegram.ui.Cells;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.Forum.ForumBubbleDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LetterDrawable;
public class ShareTopicCell extends FrameLayout {
    private int currentAccount;
    private long currentDialog;
    private long currentTopic;
    private BackupImageView imageView;
    private TextView nameTextView;
    private final Theme.ResourcesProvider resourcesProvider;

    public ShareTopicCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(this.imageView, LayoutHelper.createFrame(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.nameTextView = textView;
        textView.setTextColor(getThemedColor("dialogTextBlack"));
        this.nameTextView.setTextSize(1, 12.0f);
        this.nameTextView.setMaxLines(2);
        this.nameTextView.setGravity(49);
        this.nameTextView.setLines(2);
        this.nameTextView.setEllipsize(TextUtils.TruncateAt.END);
        addView(this.nameTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        setBackground(Theme.createRadSelectorDrawable(Theme.getColor("listSelectorSDK21"), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(103.0f), 1073741824));
    }

    public void setTopic(TLRPC$Dialog tLRPC$Dialog, TLRPC$TL_forumTopic tLRPC$TL_forumTopic, boolean z, CharSequence charSequence) {
        if (tLRPC$Dialog == null) {
            return;
        }
        TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-tLRPC$Dialog.id));
        if (charSequence != null) {
            this.nameTextView.setText(charSequence);
        } else if (chat != null) {
            this.nameTextView.setText(tLRPC$TL_forumTopic.title);
        } else {
            this.nameTextView.setText("");
        }
        if (tLRPC$TL_forumTopic.icon_emoji_id != 0) {
            this.imageView.setImageDrawable(null);
            this.imageView.setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(13, UserConfig.selectedAccount, tLRPC$TL_forumTopic.icon_emoji_id));
        } else {
            this.imageView.setAnimatedEmojiDrawable(null);
            ForumBubbleDrawable forumBubbleDrawable = new ForumBubbleDrawable(tLRPC$TL_forumTopic.icon_color);
            LetterDrawable letterDrawable = new LetterDrawable(null, 1);
            String upperCase = tLRPC$TL_forumTopic.title.trim().toUpperCase();
            letterDrawable.setTitle(upperCase.length() >= 1 ? upperCase.substring(0, 1) : "");
            letterDrawable.scale = 1.8f;
            CombinedDrawable combinedDrawable = new CombinedDrawable(forumBubbleDrawable, letterDrawable, 0, 0);
            combinedDrawable.setFullsize(true);
            this.imageView.setImageDrawable(combinedDrawable);
        }
        this.imageView.setRoundRadius(AndroidUtilities.dp((chat == null || !chat.forum || z) ? 28.0f : 16.0f));
        this.currentDialog = tLRPC$Dialog.id;
        this.currentTopic = tLRPC$TL_forumTopic.id;
    }

    public long getCurrentDialog() {
        return this.currentDialog;
    }

    public long getCurrentTopic() {
        return this.currentTopic;
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}
