package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;

public final class TopicExceptionCell extends FrameLayout {
    public final BackupImageView backupImageView;
    public boolean drawDivider;
    public final TextView subtitle;
    public final TextView title;

    public TopicExceptionCell(Context context) {
        super(context);
        BackupImageView backupImageView = new BackupImageView(context);
        this.backupImageView = backupImageView;
        addView(backupImageView, LayoutHelper.createFrame(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.title = textView;
        textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(1);
        addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.subtitle = textView2;
        textView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false));
        textView2.setTextSize(1, 14.0f);
        addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.drawDivider) {
            canvas.drawLine(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
