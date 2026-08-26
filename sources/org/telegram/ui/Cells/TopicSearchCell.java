package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.LayoutHelper;

public final class TopicSearchCell extends FrameLayout {
    public final BackupImageView backupImageView;
    public boolean drawDivider;
    public final TextView textView;
    public TLRPC.TL_forumTopic topic;

    public TopicSearchCell(Context context) {
        super(context);
        BackupImageView backupImageView = new BackupImageView(context);
        this.backupImageView = backupImageView;
        TextView textView = new TextView(context);
        this.textView = textView;
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(textView, Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false), 1, 16.0f);
        if (LocaleController.isRTL) {
            addView(backupImageView, LayoutHelper.createFrame(30, 30.0f, 21, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 21, 12.0f, 0.0f, 56.0f, 0.0f));
        } else {
            addView(backupImageView, LayoutHelper.createFrame(30, 30.0f, 16, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 16, 56.0f, 0.0f, 12.0f, 0.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.drawDivider) {
            int iDp = AndroidUtilities.dp(56.0f);
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - iDp, getMeasuredHeight() - 1, Theme.dividerPaint);
            } else {
                canvas.drawLine(iDp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }
    }

    public TLRPC.TL_forumTopic getTopic() {
        return this.topic;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic) {
        this.topic = tL_forumTopic;
        boolean zIsEmpty = TextUtils.isEmpty(tL_forumTopic.searchQuery);
        TextView textView = this.textView;
        if (zIsEmpty) {
            textView.setText(AndroidUtilities.removeDiacritics(tL_forumTopic.title));
        } else {
            textView.setText(AndroidUtilities.highlightText(AndroidUtilities.removeDiacritics(tL_forumTopic.title), tL_forumTopic.searchQuery, (Theme.ResourcesProvider) null));
        }
        BackupImageView backupImageView = this.backupImageView;
        ForumUtilities.setTopicIcon(backupImageView, tL_forumTopic, false, false, null);
        if (backupImageView == null || backupImageView.getImageReceiver() == null || !(backupImageView.getImageReceiver().getDrawable() instanceof ForumUtilities.GeneralTopicDrawable)) {
            return;
        }
        ((ForumUtilities.GeneralTopicDrawable) backupImageView.getImageReceiver().getDrawable()).setColor(Theme.getColor(null, Theme.key_chats_archiveBackground, false));
    }
}
