package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.LayoutHelper;

public abstract class BrightnessControlCell extends FrameLayout {
    public final ImageView leftImageView;
    public final ImageView rightImageView;
    public final MaxFileSizeCell.AnonymousClass1 seekBarView;
    public final int size;

    public BrightnessControlCell(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.leftImageView = imageView;
        addView(imageView, LayoutHelper.createFrame(24, 24.0f, 51, 17.0f, 12.0f, 0.0f, 0.0f));
        MaxFileSizeCell.AnonymousClass1 anonymousClass1 = new MaxFileSizeCell.AnonymousClass1(1, context, null, true);
        this.seekBarView = anonymousClass1;
        anonymousClass1.setReportChanges(true);
        anonymousClass1.setDelegate(new ChatActivity.AnonymousClass1(this, 19));
        anonymousClass1.setImportantForAccessibility(2);
        addView(anonymousClass1, LayoutHelper.createFrame(-1, 38.0f, 51, 54.0f, 5.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.rightImageView = imageView2;
        addView(imageView2, LayoutHelper.createFrame(24, 24.0f, 53, 0.0f, 12.0f, 17.0f, 0.0f));
        imageView.setImageResource(R.drawable.msg_brightness_low);
        imageView2.setImageResource(R.drawable.msg_brightness_high);
        this.size = 48;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ImageView imageView = this.leftImageView;
        int i = Theme.key_windowBackgroundWhiteGrayIcon;
        int color = Theme.getColor(null, i, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
        this.rightImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), mode));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.seekBarView.getSeekBarAccessibilityDelegate().onInitializeAccessibilityNodeInfoInternal(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.size), 1073741824));
    }

    @Override
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        return super.performAccessibilityAction(i, bundle) || this.seekBarView.getSeekBarAccessibilityDelegate().performAccessibilityActionInternal(this, i, bundle);
    }

    public void setProgress(float f) {
        this.seekBarView.setProgress(f);
    }
}
