package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.LaunchActivity;

public abstract class GroupCallTextCell extends FrameLayout {
    public final Paint dividerPaint;
    public final int imageLeft;
    public final ImageView imageView;
    public final int leftPadding;
    public boolean needDivider;
    public int offsetFromImage;
    public final SimpleTextView textView;
    public final ImageView valueImageView;
    public final SimpleTextView valueTextView;

    public GroupCallTextCell(LaunchActivity launchActivity) {
        super(launchActivity);
        this.offsetFromImage = 67;
        this.imageLeft = 18;
        Paint paint = new Paint();
        this.dividerPaint = paint;
        paint.setColor(Theme.getColor(null, Theme.key_voipgroup_actionBar, false));
        this.leftPadding = 23;
        SimpleTextView simpleTextView = new SimpleTextView(launchActivity);
        this.textView = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        simpleTextView.setTextSize(16);
        simpleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        simpleTextView.setImportantForAccessibility(2);
        addView(simpleTextView);
        SimpleTextView simpleTextView2 = new SimpleTextView(launchActivity);
        this.valueTextView = simpleTextView2;
        simpleTextView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
        simpleTextView2.setTextSize(16);
        simpleTextView2.setGravity(LocaleController.isRTL ? 3 : 5);
        simpleTextView2.setImportantForAccessibility(2);
        addView(simpleTextView2);
        ImageView imageView = new ImageView(launchActivity);
        this.imageView = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayIcon, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView);
        ImageView imageView2 = new ImageView(launchActivity);
        this.valueImageView = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2);
        setFocusable(true);
    }

    public SimpleTextView getTextView() {
        return this.textView;
    }

    public ImageView getValueImageView() {
        return this.valueImageView;
    }

    public SimpleTextView getValueTextView() {
        return this.valueTextView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float fDp;
        int iDp;
        if (this.needDivider) {
            boolean z = LocaleController.isRTL;
            ImageView imageView = this.imageView;
            if (z) {
                fDp = 0.0f;
            } else {
                fDp = AndroidUtilities.dp(imageView.getVisibility() == 0 ? 68.0f : 20.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                iDp = AndroidUtilities.dp(imageView.getVisibility() == 0 ? 68.0f : 20.0f);
            } else {
                iDp = 0;
            }
            canvas.drawLine(fDp, measuredHeight, measuredWidth - iDp, getMeasuredHeight() - 1, this.dividerPaint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.textView.getText();
        if (TextUtils.isEmpty(text)) {
            return;
        }
        CharSequence text2 = this.valueTextView.getText();
        if (TextUtils.isEmpty(text2)) {
            accessibilityNodeInfo.setText(text);
            return;
        }
        accessibilityNodeInfo.setText(((Object) text) + ": " + ((Object) text2));
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iDp;
        int i5 = i4 - i2;
        int i6 = i3 - i;
        SimpleTextView simpleTextView = this.valueTextView;
        int textHeight = (i5 - simpleTextView.getTextHeight()) / 2;
        boolean z2 = LocaleController.isRTL;
        int i7 = this.leftPadding;
        int iDp2 = z2 ? AndroidUtilities.dp(i7) : 0;
        simpleTextView.layout(iDp2, textHeight, simpleTextView.getMeasuredWidth() + iDp2, simpleTextView.getMeasuredHeight() + textHeight);
        SimpleTextView simpleTextView2 = this.textView;
        int textHeight2 = (i5 - simpleTextView2.getTextHeight()) / 2;
        boolean z3 = LocaleController.isRTL;
        ImageView imageView = this.imageView;
        if (z3) {
            int measuredWidth = getMeasuredWidth() - simpleTextView2.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                i7 = this.offsetFromImage;
            }
            iDp = measuredWidth - AndroidUtilities.dp(i7);
        } else {
            iDp = AndroidUtilities.dp(imageView.getVisibility() == 0 ? this.offsetFromImage : i7);
        }
        simpleTextView2.layout(iDp, textHeight2, simpleTextView2.getMeasuredWidth() + iDp, simpleTextView2.getMeasuredHeight() + textHeight2);
        if (imageView.getVisibility() == 0) {
            int iDp3 = AndroidUtilities.dp(5.0f);
            boolean z4 = LocaleController.isRTL;
            int i8 = this.imageLeft;
            int iDp4 = !z4 ? AndroidUtilities.dp(i8) : (i6 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(i8);
            imageView.layout(iDp4, iDp3, imageView.getMeasuredWidth() + iDp4, imageView.getMeasuredHeight() + iDp3);
        }
        ImageView imageView2 = this.valueImageView;
        if (imageView2.getVisibility() == 0) {
            int measuredHeight = (i5 - imageView2.getMeasuredHeight()) / 2;
            int iDp5 = LocaleController.isRTL ? AndroidUtilities.dp(23.0f) : (i6 - imageView2.getMeasuredWidth()) - AndroidUtilities.dp(23.0f);
            imageView2.layout(iDp5, measuredHeight, imageView2.getMeasuredWidth() + iDp5, imageView2.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iDp = AndroidUtilities.dp(48.0f);
        SimpleTextView simpleTextView = this.valueTextView;
        int i3 = this.leftPadding;
        simpleTextView.measure(OKLCH.m(size, i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.textView.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(i3 + 71)) - simpleTextView.getTextWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        ImageView imageView = this.imageView;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        }
        ImageView imageView2 = this.valueImageView;
        if (imageView2.getVisibility() == 0) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        }
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f) + (this.needDivider ? 1 : 0));
    }

    public final void setColors(int i, int i2) {
        SimpleTextView simpleTextView = this.textView;
        simpleTextView.setTextColor(i2);
        simpleTextView.setTag(null);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.imageView;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setTag(null);
    }

    public void setOffsetFromImage(int i) {
        this.offsetFromImage = i;
    }

    public final void setTextAndIcon(int i, String str, boolean z) {
        this.textView.setText(str, false);
        SimpleTextView simpleTextView = this.valueTextView;
        simpleTextView.setText(null, false);
        ImageView imageView = this.imageView;
        imageView.setImageResource(i);
        imageView.setVisibility(0);
        simpleTextView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        imageView.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.needDivider = z;
        setWillNotDraw(!z);
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(i);
    }
}
