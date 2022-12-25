package org.telegram.p009ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.AnimationProperties;
import org.telegram.p009ui.Components.CheckBox2;
import org.telegram.p009ui.Components.LayoutHelper;

public class TextCheckbox2Cell extends FrameLayout {
    private int animatedColorBackground;
    private Paint animationPaint;
    private float animationProgress;
    public CheckBox2 checkbox;
    private int height;
    private boolean isMultiline;
    private float lastTouchX;
    private boolean needDivider;
    private TextView textView;
    private TextView valueTextView;

    static {
        new AnimationProperties.FloatProperty<TextCheckbox2Cell>("animationProgress") {
            @Override
            public void setValue(TextCheckbox2Cell textCheckbox2Cell, float f) {
                textCheckbox2Cell.setAnimationProgress(f);
                textCheckbox2Cell.invalidate();
            }

            @Override
            public Float get(TextCheckbox2Cell textCheckbox2Cell) {
                return Float.valueOf(textCheckbox2Cell.animationProgress);
            }
        };
    }

    public TextCheckbox2Cell(Context context) {
        this(context, 21);
    }

    public TextCheckbox2Cell(Context context, int i) {
        this(context, i, false);
    }

    public TextCheckbox2Cell(Context context, int i, boolean z) {
        super(context);
        this.height = 50;
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextColor(Theme.getColor(z ? "dialogTextBlack" : "windowBackgroundWhiteBlackText"));
        this.textView.setTextSize(1, 16.0f);
        this.textView.setLines(1);
        this.textView.setMaxLines(1);
        this.textView.setSingleLine(true);
        this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        this.textView.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView2 = this.textView;
        boolean z2 = LocaleController.isRTL;
        addView(textView2, LayoutHelper.createFrame(-1, -1.0f, (z2 ? 5 : 3) | 48, z2 ? i : 64.0f, 0.0f, z2 ? 64.0f : i, 0.0f));
        TextView textView3 = new TextView(context);
        this.valueTextView = textView3;
        textView3.setTextColor(Theme.getColor(z ? "dialogIcon" : "windowBackgroundWhiteGrayText2"));
        this.valueTextView.setTextSize(1, 13.0f);
        this.valueTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        this.valueTextView.setLines(1);
        this.valueTextView.setMaxLines(1);
        this.valueTextView.setSingleLine(true);
        this.valueTextView.setPadding(0, 0, 0, 0);
        this.valueTextView.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView4 = this.valueTextView;
        boolean z3 = LocaleController.isRTL;
        addView(textView4, LayoutHelper.createFrame(-2, -2.0f, (z3 ? 5 : 3) | 48, z3 ? i : 64.0f, 36.0f, z3 ? 64.0f : i, 0.0f));
        CheckBox2 checkBox2 = new CheckBox2(context, 21);
        this.checkbox = checkBox2;
        checkBox2.setDrawUnchecked(true);
        this.checkbox.setDrawBackgroundAsArc(10);
        this.checkbox.setDuration(100L);
        this.checkbox.setColor("radioBackgroundChecked", "checkboxDisabled", "checkboxCheck");
        addView(this.checkbox, LayoutHelper.createFrame(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        if (this.isMultiline) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(this.valueTextView.getVisibility() == 0 ? 64.0f : this.height) + (this.needDivider ? 1 : 0), 1073741824));
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.lastTouchX = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    public void setTypeface(Typeface typeface) {
        this.textView.setTypeface(typeface);
    }

    public void setHeight(int i) {
        this.height = i;
    }

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
    }

    public void setTextAndValue(String str, String str2, boolean z, boolean z2) {
        this.textView.setText(str);
        this.valueTextView.setText(str2);
        this.needDivider = z2;
        this.valueTextView.setVisibility(0);
        this.isMultiline = z;
        if (z) {
            this.valueTextView.setLines(0);
            this.valueTextView.setMaxLines(0);
            this.valueTextView.setSingleLine(false);
            this.valueTextView.setEllipsize(null);
            this.valueTextView.setPadding(0, 0, 0, AndroidUtilities.m35dp(11.0f));
        } else {
            this.valueTextView.setLines(1);
            this.valueTextView.setMaxLines(1);
            this.valueTextView.setSingleLine(true);
            this.valueTextView.setEllipsize(TextUtils.TruncateAt.END);
            this.valueTextView.setPadding(0, 0, 0, 0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = AndroidUtilities.m35dp(10.0f);
        this.textView.setLayoutParams(layoutParams);
        setWillNotDraw(true ^ z2);
    }

    public void setChecked(boolean z) {
        this.checkbox.setChecked(z, true);
    }

    @Override
    public void setBackgroundColor(int i) {
        clearAnimation();
        this.animatedColorBackground = 0;
        super.setBackgroundColor(i);
    }

    public void setAnimationProgress(float f) {
        this.animationProgress = f;
        Math.max(this.lastTouchX, getMeasuredWidth() - this.lastTouchX);
        AndroidUtilities.m35dp(40.0f);
        int measuredHeight = getMeasuredHeight() / 2;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.animatedColorBackground != 0) {
            canvas.drawCircle(this.lastTouchX, getMeasuredHeight() / 2, (Math.max(this.lastTouchX, getMeasuredWidth() - this.lastTouchX) + AndroidUtilities.m35dp(40.0f)) * this.animationProgress, this.animationPaint);
        }
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.m35dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.m35dp(64.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.checkbox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.checkbox.isChecked());
        StringBuilder sb = new StringBuilder();
        sb.append(this.textView.getText());
        if (this.valueTextView != null) {
            sb.append("\n");
            sb.append(this.valueTextView.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }
}
