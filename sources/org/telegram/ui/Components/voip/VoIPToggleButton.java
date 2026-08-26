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
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda13;
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

    @Override
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.rippleDrawable;
        if (drawable != null) {
            drawable.setState(getDrawableState());
        }
    }

    public View getTextView() {
        return this.textView[0];
    }

    public boolean isChecked() {
        return this.checked;
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.rippleDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void lambda$setChecked$2(ValueAnimator valueAnimator) {
        this.checkedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        setBackgroundColor(this.backgroundCheck1, this.backgroundCheck2);
    }

    public final void lambda$setData$1(boolean z, ValueAnimator valueAnimator) {
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

    public final void lambda$setPressedBtn$0(ValueAnimator valueAnimator) {
        this.pressedScale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f2 = this.pressedScale;
        canvas2.scale(f2, f2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        if (this.animateBackground) {
            float f3 = this.replaceProgress;
            if (f3 != 0.0f) {
                this.circlePaint.setColor(ColorUtils.blendARGB(f3, this.backgroundColor, this.animateToBackgroundColor));
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
            BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(this.diameter), 0, -16777216);
            this.rippleDrawable = rippleDrawableSafeCreateSimpleSelectorCircleDrawable;
            rippleDrawableSafeCreateSimpleSelectorCircleDrawable.setCallback(this);
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
                                int iBlendARGB = ColorUtils.blendARGB(f4, this.replaceColorFrom, this.currentIconColor);
                                this.icon[i].setColorFilter(new PorterDuffColorFilter(iBlendARGB, PorterDuff.Mode.MULTIPLY));
                                this.crossPaint.setColor(iBlendARGB);
                            }
                            this.icon[i].setAlpha(255);
                        } else {
                            Drawable[] drawableArr = this.icon;
                            if (drawableArr[0] == null || drawableArr[1] == null) {
                                if (this.iconChangeColor) {
                                    int iBlendARGB2 = ColorUtils.blendARGB(f4, this.replaceColorFrom, this.currentIconColor);
                                    this.icon[i].setColorFilter(new PorterDuffColorFilter(iBlendARGB2, PorterDuff.Mode.MULTIPLY));
                                    this.crossPaint.setColor(iBlendARGB2);
                                }
                                this.icon[i].setAlpha(255);
                            } else {
                                if (i == 0) {
                                    f4 = 1.0f - f4;
                                }
                                canvas2.scale(f4, f4, width, fDp);
                                this.icon[i].setAlpha((int) (f4 * 255.0f));
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
                    int iBlendARGB3 = ColorUtils.blendARGB(this.replaceProgress, this.replaceColorFrom, this.currentIconColor);
                    this.icon[0].setColorFilter(new PorterDuffColorFilter(iBlendARGB3, PorterDuff.Mode.MULTIPLY));
                    this.crossPaint.setColor(iBlendARGB3);
                }
                this.icon[0].setAlpha(255);
                float f5 = this.replaceProgress;
                if (f5 != 0.0f && this.iconChangeColor) {
                    int iBlendARGB4 = ColorUtils.blendARGB(f5, this.replaceColorFrom, this.currentIconColor);
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
                    float fDpf2 = AndroidUtilities.dpf2(8.0f) + intrinsicWidth + this.crossOffset;
                    float fDpf3 = AndroidUtilities.dpf2(8.0f) + intrinsicHeight;
                    float fDp3 = fDpf2 - AndroidUtilities.dp(1.0f);
                    float fDp4 = AndroidUtilities.dp(17.0f);
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                    float interpolation = (cubicBezierInterpolator.getInterpolation(this.crossProgress) * fDp4) + fDp3;
                    float interpolation2 = (cubicBezierInterpolator.getInterpolation(this.crossProgress) * AndroidUtilities.dp(17.0f)) + fDpf3;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    Drawable drawable2 = this.icon[0];
                    drawable2.setBounds((int) (width - (drawable2.getIntrinsicWidth() / 2.0f)), (int) (fDp - (this.icon[0].getIntrinsicHeight() / 2.0f)), (int) ((this.icon[0].getIntrinsicWidth() / 2.0f) + width), (int) ((this.icon[0].getIntrinsicHeight() / 2.0f) + fDp));
                    this.icon[0].draw(canvas2);
                    canvas2.drawLine(fDpf2, fDpf3 - AndroidUtilities.dp(2.0f), interpolation, interpolation2 - AndroidUtilities.dp(2.0f), this.xRefPaint);
                    canvas2 = canvas;
                    canvas2.drawLine(fDpf2, fDpf3, interpolation, interpolation2, this.crossPaint);
                    canvas2.restore();
                } else {
                    Drawable drawable3 = this.icon[0];
                    drawable3.setBounds((int) (width - (drawable3.getIntrinsicWidth() / 2.0f)), (int) (fDp - (this.icon[0].getIntrinsicHeight() / 2.0f)), (int) ((this.icon[0].getIntrinsicWidth() / 2.0f) + width), (int) ((this.icon[0].getIntrinsicHeight() / 2.0f) + fDp));
                    this.icon[0].draw(canvas2);
                }
            }
        }
        canvas2.restore();
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.currentText);
        if (!this.checkable) {
            accessibilityNodeInfo.setClassName(Button.class.getName());
            return;
        }
        accessibilityNodeInfo.setClassName(ToggleButton.class.getName());
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.checked);
    }

    public void setBackgroundColor(int i, int i2) {
        this.backgroundCheck1 = i;
        this.backgroundCheck2 = i2;
        this.backgroundColor = ColorUtils.blendARGB(this.checkedProgress, i, i2);
        invalidate();
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
            if (!z2) {
                this.checkedProgress = z ? 1.0f : 0.0f;
                setBackgroundColor(this.backgroundCheck1, this.backgroundCheck2);
                return;
            }
            ValueAnimator valueAnimator = this.checkAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.checkAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.checkedProgress, this.checked ? 1.0f : 0.0f);
            this.checkAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new VoIPToggleButton$$ExternalSyntheticLambda0(this, 0));
            this.checkAnimator.addListener(new VoIPWindowView.AnonymousClass1(this, 7));
            this.checkAnimator.setDuration(150L);
            this.checkAnimator.start();
        }
    }

    public void setCrossOffset(float f) {
        this.crossOffset = f;
    }

    public void setData(int i, int i2, int i3, String str, boolean z, boolean z2) {
        setData(i, i2, i3, 1.0f, true, str, z, z2);
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
        valueAnimatorOfFloat.addUpdateListener(new VoIPToggleButton$$ExternalSyntheticLambda0(this, 1));
        this.pressedScaleAnimator.setDuration(150L);
        this.pressedScaleAnimator.start();
    }

    public void setTextSize(int i) {
        for (int i2 = 0; i2 < 2; i2++) {
            this.textView[i2].setTextSize(1, i);
        }
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

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        return this.rippleDrawable == drawable || super.verifyDrawable(drawable);
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
            if (Color.alpha(i3) != 255 || AndroidUtilities.computePerceivedBrightness(i3) <= 0.5d) {
                BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(this.diameter), 0, ColorUtils.setAlphaComponent(-1, (int) (f * 76.5f)));
                this.rippleDrawable = rippleDrawableSafeCreateSimpleSelectorCircleDrawable;
                rippleDrawableSafeCreateSimpleSelectorCircleDrawable.setCallback(this);
            } else {
                BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorCircleDrawable2 = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(this.diameter), 0, ColorUtils.setAlphaComponent(-16777216, (int) (f * 25.5f)));
                this.rippleDrawable = rippleDrawableSafeCreateSimpleSelectorCircleDrawable2;
                rippleDrawableSafeCreateSimpleSelectorCircleDrawable2.setCallback(this);
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
                this.icon[0] = getContext().getDrawable(i).mutate();
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
            this.icon[1] = getContext().getDrawable(i).mutate();
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
        valueAnimatorOfFloat.addUpdateListener(new ChatMessageCell$$ExternalSyntheticLambda13(this, z5, 4));
        this.replaceAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public final void onAnimationEnd(Animator animator) {
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
                if (!voIPToggleButton.iconChangeColor && (drawable = (drawableArr = voIPToggleButton.icon)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                voIPToggleButton.iconChangeColor = false;
                if (!voIPToggleButton.checkable) {
                    voIPToggleButton.backgroundColor = voIPToggleButton.animateToBackgroundColor;
                }
                voIPToggleButton.replaceProgress = 0.0f;
                voIPToggleButton.invalidate();
            }
        });
        this.replaceAnimator.setDuration(150L).start();
        invalidate();
    }
}
