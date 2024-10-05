package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.Switch;

public class TextCheckCell extends FrameLayout {
    public static final Property ANIMATION_PROGRESS = new AnimationProperties.FloatProperty("animationProgress") {
        @Override
        public Float get(TextCheckCell textCheckCell) {
            return Float.valueOf(textCheckCell.animationProgress);
        }

        @Override
        public void setValue(TextCheckCell textCheckCell, float f) {
            textCheckCell.setAnimationProgress(f);
            textCheckCell.invalidate();
        }
    };
    private int animatedColorBackground;
    private Paint animationPaint;
    private float animationProgress;
    private ObjectAnimator animator;
    boolean attached;
    private Switch checkBox;
    private boolean drawCheckRipple;
    private int height;
    ImageView imageView;
    private boolean isAnimatingToThumbInsteadOfTouch;
    private boolean isMultiline;
    private boolean isRTL;
    public int itemId;
    private float lastTouchX;
    private boolean needDivider;
    private int padding;
    private Theme.ResourcesProvider resourcesProvider;
    private TextView textView;
    private TextView valueTextView;

    public TextCheckCell(Context context) {
        this(context, 21);
    }

    public TextCheckCell(Context context, int i) {
        this(context, i, false, null);
    }

    public TextCheckCell(Context context, int i, boolean z) {
        this(context, i, z, null);
    }

    public TextCheckCell(Context context, int i, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.height = 50;
        this.resourcesProvider = resourcesProvider;
        this.padding = i;
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextColor(Theme.getColor(z ? Theme.key_dialogTextBlack : Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        this.textView.setTextSize(1, 16.0f);
        this.textView.setLines(1);
        this.textView.setMaxLines(1);
        this.textView.setSingleLine(true);
        this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        TextView textView2 = this.textView;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView textView3 = this.textView;
        boolean z2 = LocaleController.isRTL;
        addView(textView3, LayoutHelper.createFrame(-1, -1.0f, (z2 ? 5 : 3) | 48, z2 ? 70.0f : i, 0.0f, z2 ? i : 70.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.valueTextView = textView4;
        textView4.setTextColor(Theme.getColor(z ? Theme.key_dialogIcon : Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
        this.valueTextView.setTextSize(1, 13.0f);
        this.valueTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        this.valueTextView.setLines(1);
        this.valueTextView.setMaxLines(1);
        this.valueTextView.setSingleLine(true);
        this.valueTextView.setPadding(0, 0, 0, 0);
        this.valueTextView.setEllipsize(truncateAt);
        TextView textView5 = this.valueTextView;
        boolean z3 = LocaleController.isRTL;
        addView(textView5, LayoutHelper.createFrame(-2, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 70.0f : i, 35.0f, z3 ? i : 70.0f, 0.0f));
        Switch r2 = new Switch(context, resourcesProvider);
        this.checkBox = r2;
        int i2 = Theme.key_switchTrack;
        int i3 = Theme.key_switchTrackChecked;
        int i4 = Theme.key_windowBackgroundWhite;
        r2.setColors(i2, i3, i4, i4);
        addView(this.checkBox, LayoutHelper.createFrame(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
        this.isRTL = LocaleController.isRTL;
    }

    public TextCheckCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(context, 21, false, resourcesProvider);
    }

    private float getLastTouchX() {
        if (this.isAnimatingToThumbInsteadOfTouch) {
            return LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : getMeasuredWidth() - AndroidUtilities.dp(42.0f);
        }
        return this.lastTouchX;
    }

    public void setAnimationProgress(float f) {
        this.animationProgress = f;
        float lastTouchX = getLastTouchX();
        float max = Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + AndroidUtilities.dp(40.0f);
        this.checkBox.setOverrideColorProgress(lastTouchX, getMeasuredHeight() / 2, max * this.animationProgress);
    }

    public Switch getCheckBox() {
        return this.checkBox;
    }

    public boolean isChecked() {
        return this.checkBox.isChecked();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        float dp;
        float measuredHeight;
        int measuredWidth;
        int i;
        float f;
        int dp2;
        if (this.animatedColorBackground != 0) {
            float lastTouchX = getLastTouchX();
            canvas.drawCircle(lastTouchX, getMeasuredHeight() / 2, (Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + AndroidUtilities.dp(40.0f)) * this.animationProgress, this.animationPaint);
        }
        if (this.needDivider) {
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            Paint paint = resourcesProvider != null ? resourcesProvider.getPaint("paintDivider") : Theme.dividerPaint;
            if (paint != null) {
                if (this.imageView != null) {
                    dp = LocaleController.isRTL ? 0.0f : this.padding;
                    measuredHeight = getMeasuredHeight() - 1;
                    i = getMeasuredWidth();
                    if (LocaleController.isRTL) {
                        f = measuredHeight;
                        dp2 = this.padding;
                        measuredWidth = i;
                    }
                    f = measuredHeight;
                    measuredWidth = i;
                    dp2 = 0;
                } else {
                    dp = LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f);
                    measuredHeight = getMeasuredHeight() - 1;
                    measuredWidth = getMeasuredWidth();
                    if (LocaleController.isRTL) {
                        f = measuredHeight;
                        dp2 = AndroidUtilities.dp(20.0f);
                    } else {
                        i = measuredWidth;
                        f = measuredHeight;
                        measuredWidth = i;
                        dp2 = 0;
                    }
                }
                canvas.drawLine(dp, f, measuredWidth - dp2, getMeasuredHeight() - 1, paint);
            }
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.checkBox.isChecked());
        StringBuilder sb = new StringBuilder();
        sb.append(this.textView.getText());
        if (!TextUtils.isEmpty(this.valueTextView.getText())) {
            sb.append('\n');
            sb.append(this.valueTextView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int makeMeasureSpec;
        boolean z = this.isMultiline;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (z) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.valueTextView.getVisibility() == 0 ? 64.0f : this.height) + (this.needDivider ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec2, makeMeasureSpec);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.lastTouchX = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    public void setAnimatingToThumbInsteadOfTouch(boolean z) {
        this.isAnimatingToThumbInsteadOfTouch = z;
    }

    @Override
    public void setBackgroundColor(int i) {
        if (this.animatedColorBackground != i) {
            clearAnimation();
            this.animatedColorBackground = 0;
            super.setBackgroundColor(i);
        }
    }

    public void setBackgroundColorAnimated(boolean z, final int i) {
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.animator = null;
        }
        int i2 = this.animatedColorBackground;
        if (i2 != 0) {
            setBackgroundColor(i2);
        }
        if (this.animationPaint == null) {
            this.animationPaint = new Paint(1);
        }
        this.checkBox.setOverrideColor(z ? 1 : 2);
        this.animatedColorBackground = i;
        this.animationPaint.setColor(i);
        this.animationProgress = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<TextCheckCell, Float>) ANIMATION_PROGRESS, 0.0f, 1.0f);
        this.animator = ofFloat;
        ofFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                TextCheckCell.this.animatedColorBackground = 0;
                TextCheckCell.this.setBackgroundColor(i);
                TextCheckCell.this.invalidate();
            }
        });
        this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        this.animator.setDuration(240L).start();
    }

    public void setBackgroundColorAnimatedReverse(final int i) {
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.animator = null;
        }
        int i2 = this.animatedColorBackground;
        if (i2 == 0) {
            i2 = getBackground() instanceof ColorDrawable ? ((ColorDrawable) getBackground()).getColor() : 0;
        }
        if (this.animationPaint == null) {
            this.animationPaint = new Paint(1);
        }
        this.animationPaint.setColor(i2);
        setBackgroundColor(i);
        this.checkBox.setOverrideColor(1);
        this.animatedColorBackground = i;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, (Property<TextCheckCell, Float>) ANIMATION_PROGRESS, 1.0f, 0.0f).setDuration(240L);
        this.animator = duration;
        duration.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                TextCheckCell.this.setBackgroundColor(i);
                TextCheckCell.this.animatedColorBackground = 0;
                TextCheckCell.this.invalidate();
            }
        });
        this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        this.animator.start();
    }

    public void setCheckBoxIcon(int i) {
        this.checkBox.setIcon(i);
    }

    public void setChecked(boolean z) {
        this.checkBox.setChecked(z, true);
    }

    public void setColorfullIcon(int i, int i2) {
        if (this.imageView == null) {
            RLottieImageView rLottieImageView = new RLottieImageView(getContext());
            this.imageView = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.imageView, LayoutHelper.createFrame(29, 29.0f, (LocaleController.isRTL ? 5 : 3) | 16, 19.0f, 0.0f, 19.0f, 0.0f));
            this.padding = AndroidUtilities.dp(65.0f);
            ((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams()).leftMargin = LocaleController.isRTL ? 70 : this.padding;
            ((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams()).rightMargin = LocaleController.isRTL ? this.padding : 70;
        }
        this.imageView.setVisibility(0);
        this.imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.imageView.setImageResource(i2);
        this.imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.imageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), i));
    }

    public void setColors(int i, int i2, int i3, int i4, int i5) {
        this.textView.setTextColor(Theme.getColor(i, this.resourcesProvider));
        this.checkBox.setColors(i2, i3, i4, i5);
        this.textView.setTag(Integer.valueOf(i));
    }

    public void setDivider(boolean z) {
        this.needDivider = z;
        setWillNotDraw(!z);
    }

    public void setDrawCheckRipple(boolean z) {
        this.drawCheckRipple = z;
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.checkBox.setEnabled(z);
    }

    public void setEnabled(boolean z, ArrayList arrayList) {
        super.setEnabled(z);
        if (arrayList == null) {
            this.textView.setAlpha(z ? 1.0f : 0.5f);
            this.checkBox.setAlpha(z ? 1.0f : 0.5f);
            if (this.valueTextView.getVisibility() == 0) {
                this.valueTextView.setAlpha(z ? 1.0f : 0.5f);
                return;
            }
            return;
        }
        TextView textView = this.textView;
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, z ? 1.0f : 0.5f));
        arrayList.add(ObjectAnimator.ofFloat(this.checkBox, (Property<Switch, Float>) property, z ? 1.0f : 0.5f));
        if (this.valueTextView.getVisibility() == 0) {
            arrayList.add(ObjectAnimator.ofFloat(this.valueTextView, (Property<TextView, Float>) property, z ? 1.0f : 0.5f));
        }
    }

    public void setHeight(int i) {
        this.height = i;
    }

    @Override
    public void setPressed(boolean z) {
        if (this.drawCheckRipple) {
            this.checkBox.setDrawRipple(z);
        }
        super.setPressed(z);
    }

    public void setTextAndCheck(CharSequence charSequence, boolean z, boolean z2) {
        AvatarSpan.checkSpansParent(charSequence, this);
        this.textView.setText(charSequence);
        this.isMultiline = false;
        this.checkBox.setVisibility(0);
        this.checkBox.setChecked(z, this.attached);
        this.needDivider = z2;
        this.valueTextView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        this.textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z2);
    }

    public void setTextAndValueAndCheck(String str, String str2, boolean z, boolean z2, boolean z3) {
        AvatarSpan.checkSpansParent(str, this);
        this.textView.setText(str);
        this.valueTextView.setText(str2);
        this.checkBox.setVisibility(0);
        this.checkBox.setChecked(z, false);
        this.needDivider = z3;
        this.valueTextView.setVisibility(0);
        this.isMultiline = z2;
        TextView textView = this.valueTextView;
        if (z2) {
            textView.setLines(0);
            this.valueTextView.setMaxLines(0);
            this.valueTextView.setSingleLine(false);
            this.valueTextView.setEllipsize(null);
            this.valueTextView.setPadding(0, 0, 0, AndroidUtilities.dp(11.0f));
        } else {
            textView.setLines(1);
            this.valueTextView.setMaxLines(1);
            this.valueTextView.setSingleLine(true);
            this.valueTextView.setEllipsize(TextUtils.TruncateAt.END);
            this.valueTextView.setPadding(0, 0, 0, 0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = AndroidUtilities.dp(10.0f);
        this.textView.setLayoutParams(layoutParams);
        setWillNotDraw(true ^ z3);
    }

    public void setTypeface(Typeface typeface) {
        this.textView.setTypeface(typeface);
    }

    public void updateRTL() {
        boolean z = this.isRTL;
        boolean z2 = LocaleController.isRTL;
        if (z == z2) {
            return;
        }
        this.isRTL = z2;
        this.textView.setGravity((z2 ? 5 : 3) | 16);
        removeView(this.textView);
        TextView textView = this.textView;
        boolean z3 = LocaleController.isRTL;
        addView(textView, LayoutHelper.createFrame(-1, -1.0f, (z3 ? 5 : 3) | 48, z3 ? 70.0f : this.padding, 0.0f, z3 ? this.padding : 70.0f, 0.0f));
        this.valueTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        removeView(this.valueTextView);
        TextView textView2 = this.valueTextView;
        boolean z4 = LocaleController.isRTL;
        addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (z4 ? 5 : 3) | 48, z4 ? 64.0f : this.padding, 36.0f, z4 ? this.padding : 64.0f, 0.0f));
        removeView(this.checkBox);
        addView(this.checkBox, LayoutHelper.createFrame(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
    }
}
