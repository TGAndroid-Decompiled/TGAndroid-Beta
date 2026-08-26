package org.telegram.ui.Cells;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.Forum.ForumBubbleDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LetterDrawable;

public final class ShareTopicCell extends FrameLayout {
    public final AnonymousClass1 avatarDrawable;
    public final int currentAccount;
    public long currentDialog;
    public long currentTopic;
    public final BackupImageView imageView;
    public final TextView nameTextView;
    public final Theme.ResourcesProvider resourcesProvider;

    public final class AnonymousClass1 extends AvatarDrawable {
        public final int $r8$classId;
        public final FrameLayout this$0;

        public AnonymousClass1(FrameLayout frameLayout, Theme.ResourcesProvider resourcesProvider, int i) {
            super(resourcesProvider);
            this.$r8$classId = i;
            this.this$0 = frameLayout;
        }

        @Override
        public final void invalidateSelf() {
            switch (this.$r8$classId) {
                case 0:
                    super.invalidateSelf();
                    ((ShareTopicCell) this.this$0).imageView.invalidate();
                    break;
                default:
                    super.invalidateSelf();
                    ((ShareDialogCell) this.this$0).imageView.invalidate();
                    break;
            }
        }
    }

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
        OKLCH.m(Theme.key_dialogTextBlack, resourcesProvider, textView, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, LayoutHelper.createFrame(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.avatarDrawable = new AnonymousClass1(this, resourcesProvider, 0);
        setBackground(Theme.createRadSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    public long getCurrentDialog() {
        return this.currentDialog;
    }

    public long getCurrentTopic() {
        return this.currentTopic;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(103.0f), 1073741824));
    }

    public void setAsNewBotForumTopic(boolean z) {
        this.nameTextView.setText(LocaleController.getString(z ? R.string.ShareSendToNewTopic : R.string.ShareSendToOffTopic));
        BackupImageView backupImageView = this.imageView;
        backupImageView.setAnimatedEmojiDrawable(null);
        ForumBubbleDrawable forumBubbleDrawable = new ForumBubbleDrawable(ForumBubbleDrawable.serverSupportedColor[0]);
        LetterDrawable letterDrawable = new LetterDrawable(1, null);
        letterDrawable.setTitle("");
        letterDrawable.scale = 1.8f;
        CombinedDrawable combinedDrawable = new CombinedDrawable(forumBubbleDrawable, letterDrawable, 0, 0);
        combinedDrawable.fullSize = true;
        backupImageView.setImageDrawable(combinedDrawable);
    }
}
