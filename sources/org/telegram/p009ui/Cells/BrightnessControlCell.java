package org.telegram.p009ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.SeekBarView;

public class BrightnessControlCell extends FrameLayout {
    private ImageView leftImageView;
    private ImageView rightImageView;
    private SeekBarView seekBarView;

    protected void didChangedValue(float f) {
    }

    public BrightnessControlCell(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.leftImageView = imageView;
        imageView.setImageResource(C1072R.C1073drawable.msg_brightness_low);
        addView(this.leftImageView, LayoutHelper.createFrame(24, 24.0f, 51, 17.0f, 12.0f, 0.0f, 0.0f));
        SeekBarView seekBarView = new SeekBarView(this, context, true, null) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.seekBarView = seekBarView;
        seekBarView.setReportChanges(true);
        this.seekBarView.setDelegate(new SeekBarView.SeekBarViewDelegate() {
            @Override
            public CharSequence getContentDescription() {
                return " ";
            }

            @Override
            public int getStepsCount() {
                return SeekBarView.SeekBarViewDelegate.CC.$default$getStepsCount(this);
            }

            @Override
            public void onSeekBarPressed(boolean z) {
            }

            @Override
            public void onSeekBarDrag(boolean z, float f) {
                BrightnessControlCell.this.didChangedValue(f);
            }
        });
        this.seekBarView.setImportantForAccessibility(2);
        addView(this.seekBarView, LayoutHelper.createFrame(-1, 38.0f, 51, 54.0f, 5.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.rightImageView = imageView2;
        imageView2.setImageResource(C1072R.C1073drawable.msg_brightness_high);
        addView(this.rightImageView, LayoutHelper.createFrame(24, 24.0f, 53, 0.0f, 12.0f, 17.0f, 0.0f));
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.leftImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteGrayIcon"), PorterDuff.Mode.MULTIPLY));
        this.rightImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteGrayIcon"), PorterDuff.Mode.MULTIPLY));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(48.0f), 1073741824));
    }

    public void setProgress(float f) {
        this.seekBarView.setProgress(f);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.seekBarView.getSeekBarAccessibilityDelegate().onInitializeAccessibilityNodeInfoInternal(this, accessibilityNodeInfo);
    }

    @Override
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        return super.performAccessibilityAction(i, bundle) || this.seekBarView.getSeekBarAccessibilityDelegate().performAccessibilityActionInternal(this, i, bundle);
    }
}
