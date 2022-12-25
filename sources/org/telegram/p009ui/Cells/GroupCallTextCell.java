package org.telegram.p009ui.Cells;

import android.content.Context;
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
import org.telegram.p009ui.ActionBar.SimpleTextView;
import org.telegram.p009ui.ActionBar.Theme;

public class GroupCallTextCell extends FrameLayout {
    private Paint dividerPaint;
    private int imageLeft;
    private ImageView imageView;
    private int leftPadding;
    private boolean needDivider;
    private int offsetFromImage;
    private SimpleTextView textView;
    private ImageView valueImageView;
    private SimpleTextView valueTextView;

    public GroupCallTextCell(Context context) {
        this(context, 23, false);
    }

    public GroupCallTextCell(Context context, int i, boolean z) {
        super(context);
        this.offsetFromImage = 67;
        this.imageLeft = 18;
        Paint paint = new Paint();
        this.dividerPaint = paint;
        paint.setColor(Theme.getColor("voipgroup_actionBar"));
        this.leftPadding = i;
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.textView = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor(z ? "dialogTextBlack" : "windowBackgroundWhiteBlackText"));
        this.textView.setTextSize(16);
        this.textView.setGravity(LocaleController.isRTL ? 5 : 3);
        this.textView.setImportantForAccessibility(2);
        addView(this.textView);
        SimpleTextView simpleTextView2 = new SimpleTextView(context);
        this.valueTextView = simpleTextView2;
        simpleTextView2.setTextColor(Theme.getColor(z ? "dialogTextBlue2" : "windowBackgroundWhiteValueText"));
        this.valueTextView.setTextSize(16);
        this.valueTextView.setGravity(LocaleController.isRTL ? 3 : 5);
        this.valueTextView.setImportantForAccessibility(2);
        addView(this.valueTextView);
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(z ? "dialogIcon" : "windowBackgroundWhiteGrayIcon"), PorterDuff.Mode.MULTIPLY));
        addView(this.imageView);
        ImageView imageView2 = new ImageView(context);
        this.valueImageView = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(this.valueImageView);
        setFocusable(true);
    }

    public SimpleTextView getTextView() {
        return this.textView;
    }

    public SimpleTextView getValueTextView() {
        return this.valueTextView;
    }

    public ImageView getValueImageView() {
        return this.valueImageView;
    }

    @Override
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int m35dp = AndroidUtilities.m35dp(48.0f);
        this.valueTextView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.m35dp(this.leftPadding), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(20.0f), 1073741824));
        this.textView.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.m35dp(this.leftPadding + 71)) - this.valueTextView.getTextWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(20.0f), 1073741824));
        if (this.imageView.getVisibility() == 0) {
            this.imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(m35dp, Integer.MIN_VALUE));
        }
        if (this.valueImageView.getVisibility() == 0) {
            this.valueImageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(m35dp, Integer.MIN_VALUE));
        }
        setMeasuredDimension(size, AndroidUtilities.m35dp(50.0f) + (this.needDivider ? 1 : 0));
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int m35dp;
        int i5 = i4 - i2;
        int i6 = i3 - i;
        int textHeight = (i5 - this.valueTextView.getTextHeight()) / 2;
        int m35dp2 = LocaleController.isRTL ? AndroidUtilities.m35dp(this.leftPadding) : 0;
        SimpleTextView simpleTextView = this.valueTextView;
        simpleTextView.layout(m35dp2, textHeight, simpleTextView.getMeasuredWidth() + m35dp2, this.valueTextView.getMeasuredHeight() + textHeight);
        int textHeight2 = (i5 - this.textView.getTextHeight()) / 2;
        if (LocaleController.isRTL) {
            m35dp = (getMeasuredWidth() - this.textView.getMeasuredWidth()) - AndroidUtilities.m35dp(this.imageView.getVisibility() == 0 ? this.offsetFromImage : this.leftPadding);
        } else {
            m35dp = AndroidUtilities.m35dp(this.imageView.getVisibility() == 0 ? this.offsetFromImage : this.leftPadding);
        }
        SimpleTextView simpleTextView2 = this.textView;
        simpleTextView2.layout(m35dp, textHeight2, simpleTextView2.getMeasuredWidth() + m35dp, this.textView.getMeasuredHeight() + textHeight2);
        if (this.imageView.getVisibility() == 0) {
            int m35dp3 = AndroidUtilities.m35dp(5.0f);
            int m35dp4 = !LocaleController.isRTL ? AndroidUtilities.m35dp(this.imageLeft) : (i6 - this.imageView.getMeasuredWidth()) - AndroidUtilities.m35dp(this.imageLeft);
            ImageView imageView = this.imageView;
            imageView.layout(m35dp4, m35dp3, imageView.getMeasuredWidth() + m35dp4, this.imageView.getMeasuredHeight() + m35dp3);
        }
        if (this.valueImageView.getVisibility() == 0) {
            int measuredHeight = (i5 - this.valueImageView.getMeasuredHeight()) / 2;
            int m35dp5 = LocaleController.isRTL ? AndroidUtilities.m35dp(23.0f) : (i6 - this.valueImageView.getMeasuredWidth()) - AndroidUtilities.m35dp(23.0f);
            ImageView imageView2 = this.valueImageView;
            imageView2.layout(m35dp5, measuredHeight, imageView2.getMeasuredWidth() + m35dp5, this.valueImageView.getMeasuredHeight() + measuredHeight);
        }
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(i);
    }

    public void setColors(int i, int i2) {
        this.textView.setTextColor(i2);
        this.textView.setTag(null);
        this.imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        this.imageView.setTag(null);
    }

    public void setTextAndIcon(String str, int i, boolean z) {
        this.textView.setText(str);
        this.valueTextView.setText(null);
        this.imageView.setImageResource(i);
        this.imageView.setVisibility(0);
        this.valueTextView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        this.imageView.setPadding(0, AndroidUtilities.m35dp(7.0f), 0, 0);
        this.needDivider = z;
        setWillNotDraw(!z);
    }

    public void setOffsetFromImage(int i) {
        this.offsetFromImage = i;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float m35dp;
        int i;
        if (this.needDivider) {
            if (LocaleController.isRTL) {
                m35dp = 0.0f;
            } else {
                m35dp = AndroidUtilities.m35dp(this.imageView.getVisibility() == 0 ? 68.0f : 20.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i = AndroidUtilities.m35dp(this.imageView.getVisibility() != 0 ? 20.0f : 68.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(m35dp, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, this.dividerPaint);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.textView.getText();
        if (TextUtils.isEmpty(text)) {
            return;
        }
        CharSequence text2 = this.valueTextView.getText();
        if (!TextUtils.isEmpty(text2)) {
            accessibilityNodeInfo.setText(((Object) text) + ": " + ((Object) text2));
            return;
        }
        accessibilityNodeInfo.setText(text);
    }
}
