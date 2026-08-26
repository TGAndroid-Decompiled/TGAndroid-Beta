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
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SeekBarView;

public abstract class BrightnessControlCell extends FrameLayout {
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_WALLPAPER_DIM = 1;
    private ImageView leftImageView;
    Theme.ResourcesProvider resourcesProvider;
    private ImageView rightImageView;
    public final SeekBarView seekBarView;
    private final int size;
    private int type;

    public BrightnessControlCell(Context context, int i) {
        super(context);
        this.type = i;
        this.resourcesProvider = null;
        ImageView imageView = new ImageView(context);
        this.leftImageView = imageView;
        addView(imageView, LayoutHelper.createFrame(24, 24.0f, 51, 17.0f, 12.0f, 0.0f, 0.0f));
        MaxFileSizeCell.AnonymousClass1 anonymousClass1 = new MaxFileSizeCell.AnonymousClass1(context, 1);
        this.seekBarView = anonymousClass1;
        anonymousClass1.setReportChanges(true);
        anonymousClass1.setDelegate(new SeekBarView.SeekBarViewDelegate() {
            @Override
            public final CharSequence getContentDescription() {
                return " ";
            }

            @Override
            public final int getStepsCount() {
                return SeekBarView.SeekBarViewDelegate.CC.$default$getStepsCount(this);
            }

            @Override
            public final boolean needVisuallyDivideSteps() {
                return SeekBarView.SeekBarViewDelegate.CC.$default$needVisuallyDivideSteps(this);
            }

            @Override
            public final void onSeekBarDrag(boolean z, float f) {
                BrightnessControlCell.this.didChangedValue(f);
            }

            @Override
            public final void onSeekBarPressed(boolean z) {
            }
        });
        anonymousClass1.setImportantForAccessibility(2);
        addView(anonymousClass1, LayoutHelper.createFrame(-1, 38.0f, 51, 54.0f, 5.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.rightImageView = imageView2;
        addView(imageView2, LayoutHelper.createFrame(24, 24.0f, 53, 0.0f, 12.0f, 17.0f, 0.0f));
        if (i == 0) {
            this.leftImageView.setImageResource(R.drawable.msg_brightness_low);
            this.rightImageView.setImageResource(R.drawable.msg_brightness_high);
            this.size = 48;
        } else {
            this.leftImageView.setImageResource(R.drawable.msg_brightness_high);
            this.rightImageView.setImageResource(R.drawable.msg_brightness_low);
            this.size = 43;
        }
    }

    public abstract void didChangedValue(float f);

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ImageView imageView = this.leftImageView;
        int i = Theme.key_windowBackgroundWhiteGrayIcon;
        int color = Theme.getColor(i, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
        this.rightImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, this.resourcesProvider), mode));
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.seekBarView.getSeekBarAccessibilityDelegate().onInitializeAccessibilityNodeInfoInternal(this, accessibilityNodeInfo);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.size), 1073741824));
    }

    @Override
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        return super.performAccessibilityAction(i, bundle) || this.seekBarView.getSeekBarAccessibilityDelegate().performAccessibilityActionInternal(this, i, bundle);
    }

    public void setProgress(float f) {
        this.seekBarView.setProgress(f);
    }
}
