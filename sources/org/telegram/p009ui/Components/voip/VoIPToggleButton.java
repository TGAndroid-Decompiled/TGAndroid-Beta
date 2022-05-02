package org.telegram.p009ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.LayoutHelper;

public class VoIPToggleButton extends FrameLayout {
    private boolean animateBackground;
    int animateToBackgroundColor;
    public int animationDelay;
    private int backgroundCheck1;
    private int backgroundCheck2;
    int backgroundColor;
    private Paint bitmapPaint;
    private ValueAnimator checkAnimator;
    private boolean checkable;
    private boolean checkableForAccessibility;
    private boolean checked;
    private float checkedProgress;
    Paint circlePaint;
    private float crossOffset;
    private Paint crossPaint;
    private float crossProgress;
    int currentBackgroundColor;
    int currentIconColor;
    int currentIconRes;
    String currentText;
    private boolean drawBackground;
    private boolean drawCross;
    Drawable[] icon;
    private boolean iconChangeColor;
    private float radius;
    ValueAnimator replaceAnimator;
    private int replaceColorFrom;
    float replaceProgress;
    Drawable rippleDrawable;
    FrameLayout textLayoutContainer;
    TextView[] textView;
    private Paint xRefPaint;

    public VoIPToggleButton(Context context) {
        this(context, 52.0f);
    }

    public VoIPToggleButton(Context context, float f) {
        super(context);
        this.circlePaint = new Paint(1);
        this.drawBackground = true;
        this.icon = new Drawable[2];
        this.textView = new TextView[2];
        this.crossPaint = new Paint(1);
        this.xRefPaint = new Paint(1);
        this.bitmapPaint = new Paint(1);
        this.radius = f;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.textLayoutContainer = frameLayout;
        addView(frameLayout);
        for (int i = 0; i < 2; i++) {
            TextView textView = new TextView(context);
            textView.setGravity(1);
            textView.setTextSize(1, 11.0f);
            textView.setTextColor(-1);
            textView.setImportantForAccessibility(2);
            this.textLayoutContainer.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 4.0f + f, 0.0f, 0.0f));
            this.textView[i] = textView;
        }
        this.textView[1].setVisibility(8);
        this.xRefPaint.setColor(-16777216);
        this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.xRefPaint.setStrokeWidth(AndroidUtilities.m34dp(3.0f));
        this.crossPaint.setStrokeWidth(AndroidUtilities.m34dp(2.0f));
        this.crossPaint.setStrokeCap(Paint.Cap.ROUND);
        this.bitmapPaint.setFilterBitmap(true);
    }

    public void setTextSize(int i) {
        for (int i2 = 0; i2 < 2; i2++) {
            this.textView[i2].setTextSize(1, i);
        }
    }

    public void setDrawBackground(boolean z) {
        this.drawBackground = z;
    }

    @Override
    @android.annotation.SuppressLint({"DrawAllocation"})
    protected void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.voip.VoIPToggleButton.onDraw(android.graphics.Canvas):void");
    }

    public void setBackgroundColor(int i, int i2) {
        this.backgroundCheck1 = i;
        this.backgroundCheck2 = i2;
        this.backgroundColor = ColorUtils.blendARGB(i, i2, this.checkedProgress);
        invalidate();
    }

    public void setData(int i, int i2, int i3, String str, boolean z, boolean z2) {
        setData(i, i2, i3, 1.0f, true, str, z, z2);
    }

    public void setEnabled(boolean z, boolean z2) {
        super.setEnabled(z);
        float f = 1.0f;
        if (z2) {
            ViewPropertyAnimator animate = animate();
            if (!z) {
                f = 0.5f;
            }
            animate.alpha(f).setDuration(180L).start();
            return;
        }
        clearAnimation();
        if (!z) {
            f = 0.5f;
        }
        setAlpha(f);
    }

    public void setData(int i, int i2, int i3, float f, boolean z, String str, boolean z2, boolean z3) {
        String str2;
        if (getVisibility() != 0) {
            setVisibility(0);
            z3 = false;
        }
        if (this.currentIconRes != i || this.currentIconColor != i2 || ((!this.checkable && this.currentBackgroundColor != i3) || (str2 = this.currentText) == null || !str2.equals(str) || z2 != this.drawCross)) {
            if (this.rippleDrawable == null || z) {
                if (Color.alpha(i3) != 255 || AndroidUtilities.computePerceivedBrightness(i3) <= 0.5d) {
                    Drawable createSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.m34dp(this.radius), 0, ColorUtils.setAlphaComponent(-1, (int) (f * 76.5f)));
                    this.rippleDrawable = createSimpleSelectorCircleDrawable;
                    createSimpleSelectorCircleDrawable.setCallback(this);
                } else {
                    Drawable createSimpleSelectorCircleDrawable2 = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.m34dp(this.radius), 0, ColorUtils.setAlphaComponent(-16777216, (int) (f * 25.5f)));
                    this.rippleDrawable = createSimpleSelectorCircleDrawable2;
                    createSimpleSelectorCircleDrawable2.setCallback(this);
                }
            }
            ValueAnimator valueAnimator = this.replaceAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.animateBackground = this.currentBackgroundColor != i3;
            boolean z4 = this.currentIconRes == i;
            this.iconChangeColor = z4;
            if (z4) {
                this.replaceColorFrom = this.currentIconColor;
            }
            this.currentIconRes = i;
            this.currentIconColor = i2;
            this.currentBackgroundColor = i3;
            this.currentText = str;
            this.drawCross = z2;
            if (!z3) {
                if (i != 0) {
                    this.icon[0] = ContextCompat.getDrawable(getContext(), i).mutate();
                    this.icon[0].setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
                }
                this.crossPaint.setColor(i2);
                if (!this.checkable) {
                    this.backgroundColor = i3;
                }
                this.textView[0].setText(str);
                this.crossProgress = this.drawCross ? 1.0f : 0.0f;
                this.iconChangeColor = false;
                this.replaceProgress = 0.0f;
                invalidate();
                return;
            }
            if (!z4 && i != 0) {
                this.icon[1] = ContextCompat.getDrawable(getContext(), i).mutate();
                this.icon[1].setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
            }
            if (!this.checkable) {
                this.animateToBackgroundColor = i3;
            }
            final boolean z5 = !this.textView[0].getText().toString().equals(str);
            if (!z5) {
                this.textView[0].setText(str);
            } else {
                this.textView[1].setText(str);
                this.textView[1].setVisibility(0);
                this.textView[1].setAlpha(0.0f);
                this.textView[1].setScaleX(0.0f);
                this.textView[1].setScaleY(0.0f);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.replaceAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    VoIPToggleButton.this.lambda$setData$0(z5, valueAnimator2);
                }
            });
            this.replaceAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    VoIPToggleButton voIPToggleButton = VoIPToggleButton.this;
                    voIPToggleButton.replaceAnimator = null;
                    if (z5) {
                        TextView[] textViewArr = voIPToggleButton.textView;
                        TextView textView = textViewArr[0];
                        textViewArr[0] = textViewArr[1];
                        textViewArr[1] = textView;
                        textViewArr[1].setVisibility(8);
                    }
                    if (!VoIPToggleButton.this.iconChangeColor) {
                        Drawable[] drawableArr = VoIPToggleButton.this.icon;
                        if (drawableArr[1] != null) {
                            drawableArr[0] = drawableArr[1];
                            drawableArr[1] = null;
                        }
                    }
                    VoIPToggleButton.this.iconChangeColor = false;
                    if (!VoIPToggleButton.this.checkable) {
                        VoIPToggleButton voIPToggleButton2 = VoIPToggleButton.this;
                        voIPToggleButton2.backgroundColor = voIPToggleButton2.animateToBackgroundColor;
                    }
                    VoIPToggleButton voIPToggleButton3 = VoIPToggleButton.this;
                    voIPToggleButton3.replaceProgress = 0.0f;
                    voIPToggleButton3.invalidate();
                }
            });
            this.replaceAnimator.setDuration(150L).start();
            invalidate();
        }
    }

    public void lambda$setData$0(boolean z, ValueAnimator valueAnimator) {
        this.replaceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
        if (z) {
            this.textView[0].setAlpha(1.0f - this.replaceProgress);
            this.textView[0].setScaleX(1.0f - this.replaceProgress);
            this.textView[0].setScaleY(1.0f - this.replaceProgress);
            this.textView[1].setAlpha(this.replaceProgress);
            this.textView[1].setScaleX(this.replaceProgress);
            this.textView[1].setScaleY(this.replaceProgress);
        }
    }

    public void setCrossOffset(float f) {
        this.crossOffset = f;
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.rippleDrawable;
        if (drawable != null) {
            drawable.setState(getDrawableState());
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        return this.rippleDrawable == drawable || super.verifyDrawable(drawable);
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.rippleDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void setCheckableForAccessibility(boolean z) {
        this.checkableForAccessibility = z;
    }

    public void setCheckable(boolean z) {
        this.checkable = z;
    }

    public void setChecked(boolean z, boolean z2) {
        if (this.checked != z) {
            this.checked = z;
            if (this.checkable) {
                float f = 1.0f;
                if (z2) {
                    ValueAnimator valueAnimator = this.checkAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        this.checkAnimator.cancel();
                    }
                    float[] fArr = new float[2];
                    fArr[0] = this.checkedProgress;
                    if (!this.checked) {
                        f = 0.0f;
                    }
                    fArr[1] = f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.checkAnimator = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            VoIPToggleButton.this.lambda$setChecked$1(valueAnimator2);
                        }
                    });
                    this.checkAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            VoIPToggleButton voIPToggleButton = VoIPToggleButton.this;
                            voIPToggleButton.checkedProgress = voIPToggleButton.checked ? 1.0f : 0.0f;
                            VoIPToggleButton voIPToggleButton2 = VoIPToggleButton.this;
                            voIPToggleButton2.setBackgroundColor(voIPToggleButton2.backgroundCheck1, VoIPToggleButton.this.backgroundCheck2);
                        }
                    });
                    this.checkAnimator.setDuration(150L);
                    this.checkAnimator.start();
                    return;
                }
                if (!z) {
                    f = 0.0f;
                }
                this.checkedProgress = f;
                setBackgroundColor(this.backgroundCheck1, this.backgroundCheck2);
            }
        }
    }

    public void lambda$setChecked$1(ValueAnimator valueAnimator) {
        this.checkedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        setBackgroundColor(this.backgroundCheck1, this.backgroundCheck2);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.currentText);
        if (this.checkable || this.checkableForAccessibility) {
            accessibilityNodeInfo.setClassName(ToggleButton.class.getName());
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.checked);
            return;
        }
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void shakeView() {
        AndroidUtilities.shakeView(this.textView[0], 2.0f, 0);
        AndroidUtilities.shakeView(this.textView[1], 2.0f, 0);
    }

    public void showText(boolean z, boolean z2) {
        float f = 1.0f;
        if (z2) {
            if (!z) {
                f = 0.0f;
            }
            if (this.textLayoutContainer.getAlpha() != f) {
                this.textLayoutContainer.animate().alpha(f).start();
                return;
            }
            return;
        }
        this.textLayoutContainer.animate().cancel();
        FrameLayout frameLayout = this.textLayoutContainer;
        if (!z) {
            f = 0.0f;
        }
        frameLayout.setAlpha(f);
    }
}
