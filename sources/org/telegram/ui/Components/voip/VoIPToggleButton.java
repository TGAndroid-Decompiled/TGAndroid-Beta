package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;

public class VoIPToggleButton extends FrameLayout {
    private boolean animateBackground;
    int animateToBackgroundColor;
    public int animationDelay;
    private int backgroundCheck1;
    private int backgroundCheck2;
    int backgroundColor;
    private ValueAnimator checkAnimator;
    private boolean checkable;
    private boolean checked;
    private float checkedProgress;
    Paint circlePaint;
    private float crossOffset;
    private final Paint crossPaint;
    private float crossProgress;
    int currentBackgroundColor;
    int currentIconColor;
    int currentIconRes;
    String currentText;
    private final float diameter;
    private boolean drawBackground;
    private boolean drawCross;
    private boolean drawRipple;
    Drawable[] icon;
    private boolean iconChangeColor;
    private float pressedScale;
    private ValueAnimator pressedScaleAnimator;
    ValueAnimator replaceAnimator;
    private int replaceColorFrom;
    float replaceProgress;
    Drawable rippleDrawable;
    FrameLayout textLayoutContainer;
    TextView[] textView;
    private final Paint xRefPaint;

    public VoIPToggleButton(Context context, float f) {
        super(context);
        this.circlePaint = new Paint(1);
        this.drawBackground = true;
        this.drawRipple = true;
        this.icon = new Drawable[2];
        this.textView = new TextView[2];
        this.crossPaint = new Paint(1);
        this.xRefPaint = new Paint(1);
        this.pressedScale = 1.0f;
        this.diameter = f;
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
            this.textLayoutContainer.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, f + 6.0f, 0.0f, 0.0f));
            this.textView[i] = textView;
        }
        this.textView[1].setVisibility(8);
        this.xRefPaint.setColor(-16777216);
        this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.xRefPaint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        this.crossPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.crossPaint.setStrokeCap(Paint.Cap.ROUND);
    }

    public void setTextSize(int i) {
        for (int i2 = 0; i2 < 2; i2++) {
            this.textView[i2].setTextSize(1, i);
        }
    }

    public void setDrawBackground(boolean z) {
        this.drawBackground = z;
    }

    public void setDrawRipple(boolean z) {
        this.drawRipple = z;
    }

    public void setPressedBtn(boolean z) {
        ValueAnimator valueAnimator = this.pressedScaleAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.pressedScale, z ? 0.8f : 1.0f);
        this.pressedScaleAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                VoIPToggleButton.m3010$r8$lambda$LHVBRsfkg8ePZAAg_eXxZyuiL8(this.f$0, valueAnimator2);
            }
        });
        this.pressedScaleAnimator.setDuration(150L);
        this.pressedScaleAnimator.start();
    }

    public static void m3010$r8$lambda$LHVBRsfkg8ePZAAg_eXxZyuiL8(VoIPToggleButton voIPToggleButton, ValueAnimator valueAnimator) {
        voIPToggleButton.getClass();
        voIPToggleButton.pressedScale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        voIPToggleButton.invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float f;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f2 = this.pressedScale;
        canvas2.scale(f2, f2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        if (this.animateBackground) {
            float f3 = this.replaceProgress;
            if (f3 != 0.0f) {
                this.circlePaint.setColor(ColorUtils.blendARGB(this.backgroundColor, this.animateToBackgroundColor, f3));
            } else {
                this.circlePaint.setColor(this.backgroundColor);
            }
        } else {
            this.circlePaint.setColor(this.backgroundColor);
        }
        float width = getWidth() / 2.0f;
        float fDp = AndroidUtilities.dp(this.diameter) / 2.0f;
        float fDp2 = AndroidUtilities.dp(this.diameter) / 2.0f;
        if (this.drawBackground) {
            canvas2.drawCircle(width, fDp, fDp2, this.circlePaint);
        }
        if (this.rippleDrawable == null) {
            Drawable drawableCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(this.diameter), 0, -16777216);
            this.rippleDrawable = drawableCreateSimpleSelectorCircleDrawable;
            drawableCreateSimpleSelectorCircleDrawable.setCallback(this);
        }
        if (this.drawRipple) {
            this.rippleDrawable.setBounds((int) (width - fDp2), (int) (fDp - fDp2), (int) (width + fDp2), (int) (fDp2 + fDp));
            this.rippleDrawable.draw(canvas2);
        }
        if (this.currentIconRes != 0) {
            if (!this.drawCross && this.crossProgress == 0.0f) {
                int i = 0;
                while (true) {
                    if (i >= ((this.replaceProgress == 0.0f || this.iconChangeColor) ? 1 : 2)) {
                        break;
                    }
                    if (this.icon[i] != null) {
                        canvas2.save();
                        float f4 = this.replaceProgress;
                        if (f4 == 0.0f || this.iconChangeColor) {
                            if (this.iconChangeColor) {
                                int iBlendARGB = ColorUtils.blendARGB(this.replaceColorFrom, this.currentIconColor, f4);
                                this.icon[i].setColorFilter(new PorterDuffColorFilter(iBlendARGB, PorterDuff.Mode.MULTIPLY));
                                this.crossPaint.setColor(iBlendARGB);
                            }
                            this.icon[i].setAlpha(255);
                        } else {
                            Drawable[] drawableArr = this.icon;
                            if (drawableArr[0] != null && drawableArr[1] != null) {
                                if (i == 0) {
                                    f4 = 1.0f - f4;
                                }
                                canvas2.scale(f4, f4, width, fDp);
                                this.icon[i].setAlpha((int) (f4 * 255.0f));
                            } else {
                                if (this.iconChangeColor) {
                                    int iBlendARGB2 = ColorUtils.blendARGB(this.replaceColorFrom, this.currentIconColor, f4);
                                    this.icon[i].setColorFilter(new PorterDuffColorFilter(iBlendARGB2, PorterDuff.Mode.MULTIPLY));
                                    this.crossPaint.setColor(iBlendARGB2);
                                }
                                this.icon[i].setAlpha(255);
                            }
                        }
                        Drawable drawable = this.icon[i];
                        drawable.setBounds((int) (width - (drawable.getIntrinsicWidth() / 2.0f)), (int) (fDp - (this.icon[i].getIntrinsicHeight() / 2.0f)), (int) ((this.icon[i].getIntrinsicWidth() / 2.0f) + width), (int) ((this.icon[i].getIntrinsicHeight() / 2.0f) + fDp));
                        this.icon[i].draw(canvas2);
                        canvas2.restore();
                    }
                    i++;
                }
            } else {
                if (this.iconChangeColor) {
                    int iBlendARGB3 = ColorUtils.blendARGB(this.replaceColorFrom, this.currentIconColor, this.replaceProgress);
                    this.icon[0].setColorFilter(new PorterDuffColorFilter(iBlendARGB3, PorterDuff.Mode.MULTIPLY));
                    this.crossPaint.setColor(iBlendARGB3);
                }
                this.icon[0].setAlpha(255);
                float f5 = this.replaceProgress;
                if (f5 != 0.0f && this.iconChangeColor) {
                    int iBlendARGB4 = ColorUtils.blendARGB(this.replaceColorFrom, this.currentIconColor, f5);
                    this.icon[0].setColorFilter(new PorterDuffColorFilter(iBlendARGB4, PorterDuff.Mode.MULTIPLY));
                    this.crossPaint.setColor(iBlendARGB4);
                }
                this.icon[0].setAlpha(255);
                boolean z = this.drawCross;
                if (z) {
                    float f6 = this.crossProgress;
                    if (f6 < 1.0f) {
                        float f7 = f6 + 0.08f;
                        this.crossProgress = f7;
                        if (f7 > 1.0f) {
                            this.crossProgress = 1.0f;
                        } else {
                            invalidate();
                        }
                    } else if (!z) {
                        f = this.crossProgress - 0.08f;
                        this.crossProgress = f;
                        if (f < 0.0f) {
                            this.crossProgress = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                } else if (!z) {
                    f = this.crossProgress - 0.08f;
                    this.crossProgress = f;
                    if (f < 0.0f) {
                        this.crossProgress = 0.0f;
                    } else {
                        invalidate();
                    }
                }
                if (this.crossProgress > 0.0f) {
                    int intrinsicWidth = (int) (width - (this.icon[0].getIntrinsicWidth() / 2.0f));
                    int intrinsicHeight = (int) (fDp - (this.icon[0].getIntrinsicHeight() / 2.0f));
                    float fDpf2 = intrinsicWidth + AndroidUtilities.dpf2(8.0f) + this.crossOffset;
                    float fDpf3 = intrinsicHeight + AndroidUtilities.dpf2(8.0f);
                    float fDp3 = fDpf2 - AndroidUtilities.dp(1.0f);
                    float fDp4 = AndroidUtilities.dp(17.0f);
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                    float interpolation = fDp3 + (fDp4 * cubicBezierInterpolator.getInterpolation(this.crossProgress));
                    float fDp5 = fDpf3 + (AndroidUtilities.dp(17.0f) * cubicBezierInterpolator.getInterpolation(this.crossProgress));
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    Drawable drawable2 = this.icon[0];
                    drawable2.setBounds((int) (width - (drawable2.getIntrinsicWidth() / 2.0f)), (int) (fDp - (this.icon[0].getIntrinsicHeight() / 2.0f)), (int) (width + (this.icon[0].getIntrinsicWidth() / 2.0f)), (int) (fDp + (this.icon[0].getIntrinsicHeight() / 2.0f)));
                    this.icon[0].draw(canvas2);
                    canvas2.drawLine(fDpf2, fDpf3 - AndroidUtilities.dp(2.0f), interpolation, fDp5 - AndroidUtilities.dp(2.0f), this.xRefPaint);
                    canvas2 = canvas;
                    canvas2.drawLine(fDpf2, fDpf3, interpolation, fDp5, this.crossPaint);
                    canvas2.restore();
                } else {
                    Drawable drawable3 = this.icon[0];
                    drawable3.setBounds((int) (width - (drawable3.getIntrinsicWidth() / 2.0f)), (int) (fDp - (this.icon[0].getIntrinsicHeight() / 2.0f)), (int) (width + (this.icon[0].getIntrinsicWidth() / 2.0f)), (int) (fDp + (this.icon[0].getIntrinsicHeight() / 2.0f)));
                    this.icon[0].draw(canvas2);
                }
            }
        }
        canvas2.restore();
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

    public void setData(int i, int i2, int i3, float f, boolean z, String str, boolean z2, boolean z3) {
        String str2;
        if (getVisibility() != 0) {
            setVisibility(0);
            z3 = false;
        }
        if (this.currentIconRes == i && this.currentIconColor == i2 && ((this.checkable || this.currentBackgroundColor == i3) && (str2 = this.currentText) != null && str2.equals(str) && z2 == this.drawCross)) {
            return;
        }
        if (this.rippleDrawable == null || z) {
            if (Color.alpha(i3) == 255 && AndroidUtilities.computePerceivedBrightness(i3) > 0.5d) {
                Drawable drawableCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(this.diameter), 0, ColorUtils.setAlphaComponent(-16777216, (int) (f * 25.5f)));
                this.rippleDrawable = drawableCreateSimpleSelectorCircleDrawable;
                drawableCreateSimpleSelectorCircleDrawable.setCallback(this);
            } else {
                Drawable drawableCreateSimpleSelectorCircleDrawable2 = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(this.diameter), 0, ColorUtils.setAlphaComponent(-1, (int) (f * 76.5f)));
                this.rippleDrawable = drawableCreateSimpleSelectorCircleDrawable2;
                drawableCreateSimpleSelectorCircleDrawable2.setCallback(this);
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
        boolean zEquals = this.textView[0].getText().toString().equals(str);
        final boolean z5 = !zEquals;
        if (zEquals) {
            this.textView[0].setText(str);
        } else {
            this.textView[1].setText(str);
            this.textView[1].setVisibility(0);
            this.textView[1].setAlpha(0.0f);
            this.textView[1].setScaleX(0.0f);
            this.textView[1].setScaleY(0.0f);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.replaceAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                VoIPToggleButton.$r8$lambda$Dh0lprCeNQ4A7Wwg3OnwBBlV_yw(this.f$0, z5, valueAnimator2);
            }
        });
        this.replaceAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                Drawable[] drawableArr;
                Drawable drawable;
                VoIPToggleButton voIPToggleButton = VoIPToggleButton.this;
                voIPToggleButton.replaceAnimator = null;
                if (z5) {
                    TextView[] textViewArr = voIPToggleButton.textView;
                    TextView textView = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView;
                    textView.setVisibility(8);
                }
                if (!VoIPToggleButton.this.iconChangeColor && (drawable = (drawableArr = VoIPToggleButton.this.icon)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
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

    public static void $r8$lambda$Dh0lprCeNQ4A7Wwg3OnwBBlV_yw(VoIPToggleButton voIPToggleButton, boolean z, ValueAnimator valueAnimator) {
        voIPToggleButton.getClass();
        voIPToggleButton.replaceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        voIPToggleButton.invalidate();
        if (z) {
            voIPToggleButton.textView[0].setAlpha(1.0f - voIPToggleButton.replaceProgress);
            voIPToggleButton.textView[0].setScaleX(1.0f - voIPToggleButton.replaceProgress);
            voIPToggleButton.textView[0].setScaleY(1.0f - voIPToggleButton.replaceProgress);
            voIPToggleButton.textView[1].setAlpha(voIPToggleButton.replaceProgress);
            voIPToggleButton.textView[1].setScaleX(voIPToggleButton.replaceProgress);
            voIPToggleButton.textView[1].setScaleY(voIPToggleButton.replaceProgress);
        }
    }

    public void setCrossOffset(float f) {
        this.crossOffset = f;
    }

    public View getTextView() {
        return this.textView[0];
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

    public void setCheckable(boolean z) {
        this.checkable = z;
    }

    public void setChecked(boolean z, boolean z2) {
        if (this.checked == z) {
            return;
        }
        this.checked = z;
        if (this.checkable) {
            if (z2) {
                ValueAnimator valueAnimator = this.checkAnimator;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.checkAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.checkedProgress, this.checked ? 1.0f : 0.0f);
                this.checkAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        VoIPToggleButton.$r8$lambda$jE7JEw5vVkeG7U3fo6FTl_C5YyU(this.f$0, valueAnimator2);
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
            this.checkedProgress = z ? 1.0f : 0.0f;
            setBackgroundColor(this.backgroundCheck1, this.backgroundCheck2);
        }
    }

    public static void $r8$lambda$jE7JEw5vVkeG7U3fo6FTl_C5YyU(VoIPToggleButton voIPToggleButton, ValueAnimator valueAnimator) {
        voIPToggleButton.getClass();
        voIPToggleButton.checkedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        voIPToggleButton.setBackgroundColor(voIPToggleButton.backgroundCheck1, voIPToggleButton.backgroundCheck2);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.currentText);
        if (this.checkable) {
            accessibilityNodeInfo.setClassName(ToggleButton.class.getName());
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.checked);
            return;
        }
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void shakeView() {
        AndroidUtilities.shakeView(this.textView[0]);
        AndroidUtilities.shakeView(this.textView[1]);
    }

    public void showText(boolean z, boolean z2) {
        if (!z2) {
            this.textLayoutContainer.animate().cancel();
            this.textLayoutContainer.setAlpha(z ? 1.0f : 0.0f);
        } else {
            float f = z ? 1.0f : 0.0f;
            if (this.textLayoutContainer.getAlpha() != f) {
                this.textLayoutContainer.animate().alpha(f).start();
            }
        }
    }
}
