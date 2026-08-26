package org.telegram.ui.Components.voip;

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
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.PhotoViewer$41$1;
import org.telegram.ui.SecretVoicePlayer$$ExternalSyntheticLambda1;

public class VoIPToggleButton extends FrameLayout {
    public boolean animateBackground;
    public int animateToBackgroundColor;
    public int animationDelay;
    public int backgroundCheck1;
    public int backgroundCheck2;
    public int backgroundColor;
    public ValueAnimator checkAnimator;
    public boolean checkable;
    public boolean checked;
    public float checkedProgress;
    public final Paint circlePaint;
    public float crossOffset;
    public final Paint crossPaint;
    public float crossProgress;
    public int currentBackgroundColor;
    public int currentIconColor;
    public int currentIconRes;
    public String currentText;
    public final float diameter;
    public boolean drawBackground;
    public boolean drawCross;
    public boolean drawRipple;
    public final Drawable[] icon;
    public boolean iconChangeColor;
    public float pressedScale;
    public ValueAnimator pressedScaleAnimator;
    public ValueAnimator replaceAnimator;
    public int replaceColorFrom;
    public float replaceProgress;
    public BaseCell.RippleDrawableSafe rippleDrawable;
    public final FrameLayout textLayoutContainer;
    public final TextView[] textView;
    public final Paint xRefPaint;

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
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.rippleDrawable;
        if (rippleDrawableSafe != null) {
            rippleDrawableSafe.setState(getDrawableState());
        }
    }

    public View getTextView() {
        return this.textView[0];
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.rippleDrawable;
        if (rippleDrawableSafe != null) {
            rippleDrawableSafe.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        canvas.save();
        float f2 = this.pressedScale;
        float f3 = 2.0f;
        canvas.scale(f2, f2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        boolean z = this.animateBackground;
        Paint paint = this.circlePaint;
        if (z) {
            float f4 = this.replaceProgress;
            if (f4 != 0.0f) {
                paint.setColor(ColorUtils.blendARGB(f4, this.backgroundColor, this.animateToBackgroundColor));
            } else {
                paint.setColor(this.backgroundColor);
            }
        } else {
            paint.setColor(this.backgroundColor);
        }
        float width = getWidth() / 2.0f;
        float f5 = this.diameter;
        float fDp = AndroidUtilities.dp(f5) / 2.0f;
        float fDp2 = AndroidUtilities.dp(f5) / 2.0f;
        if (this.drawBackground) {
            canvas.drawCircle(width, fDp, fDp2, paint);
        }
        if (this.rippleDrawable == null) {
            BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(f5), 0, -16777216);
            this.rippleDrawable = rippleDrawableSafeCreateSimpleSelectorCircleDrawable;
            rippleDrawableSafeCreateSimpleSelectorCircleDrawable.setCallback(this);
        }
        if (this.drawRipple) {
            this.rippleDrawable.setBounds((int) (width - fDp2), (int) (fDp - fDp2), (int) (width + fDp2), (int) (fDp2 + fDp));
            this.rippleDrawable.draw(canvas);
        }
        if (this.currentIconRes != 0) {
            boolean z2 = this.drawCross;
            Paint paint2 = this.crossPaint;
            Drawable[] drawableArr = this.icon;
            if (!z2 && this.crossProgress == 0.0f) {
                int i = 0;
                while (true) {
                    if (i >= ((this.replaceProgress == 0.0f || this.iconChangeColor) ? 1 : 2)) {
                        break;
                    }
                    if (drawableArr[i] != null) {
                        canvas.save();
                        float f6 = this.replaceProgress;
                        if (f6 == 0.0f || this.iconChangeColor || drawableArr[0] == null || drawableArr[1] == null) {
                            if (this.iconChangeColor) {
                                int iBlendARGB = ColorUtils.blendARGB(f6, this.replaceColorFrom, this.currentIconColor);
                                drawableArr[i].setColorFilter(new PorterDuffColorFilter(iBlendARGB, PorterDuff.Mode.MULTIPLY));
                                paint2.setColor(iBlendARGB);
                            }
                            drawableArr[i].setAlpha(255);
                        } else {
                            if (i == 0) {
                                f6 = 1.0f - f6;
                            }
                            canvas.scale(f6, f6, width, fDp);
                            drawableArr[i].setAlpha((int) (f6 * 255.0f));
                        }
                        Drawable drawable = drawableArr[i];
                        drawable.setBounds((int) (width - (drawable.getIntrinsicWidth() / f3)), (int) (fDp - (drawableArr[i].getIntrinsicHeight() / f3)), (int) ((drawableArr[i].getIntrinsicWidth() / f3) + width), (int) ((drawableArr[i].getIntrinsicHeight() / 2.0f) + fDp));
                        drawableArr[i].draw(canvas);
                        canvas.restore();
                    }
                    i++;
                    f3 = 2.0f;
                }
            } else {
                if (this.iconChangeColor) {
                    int iBlendARGB2 = ColorUtils.blendARGB(this.replaceProgress, this.replaceColorFrom, this.currentIconColor);
                    drawableArr[0].setColorFilter(new PorterDuffColorFilter(iBlendARGB2, PorterDuff.Mode.MULTIPLY));
                    paint2.setColor(iBlendARGB2);
                }
                drawableArr[0].setAlpha(255);
                float f7 = this.replaceProgress;
                if (f7 != 0.0f && this.iconChangeColor) {
                    int iBlendARGB3 = ColorUtils.blendARGB(f7, this.replaceColorFrom, this.currentIconColor);
                    drawableArr[0].setColorFilter(new PorterDuffColorFilter(iBlendARGB3, PorterDuff.Mode.MULTIPLY));
                    paint2.setColor(iBlendARGB3);
                }
                drawableArr[0].setAlpha(255);
                boolean z3 = this.drawCross;
                if (z3) {
                    float f8 = this.crossProgress;
                    if (f8 < 1.0f) {
                        float f9 = f8 + 0.08f;
                        this.crossProgress = f9;
                        if (f9 > 1.0f) {
                            this.crossProgress = 1.0f;
                        } else {
                            invalidate();
                        }
                    } else if (!z3) {
                        f = this.crossProgress - 0.08f;
                        this.crossProgress = f;
                        if (f < 0.0f) {
                            this.crossProgress = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                } else if (!z3) {
                    f = this.crossProgress - 0.08f;
                    this.crossProgress = f;
                    if (f < 0.0f) {
                        this.crossProgress = 0.0f;
                    } else {
                        invalidate();
                    }
                }
                if (this.crossProgress > 0.0f) {
                    int intrinsicWidth = (int) (width - (drawableArr[0].getIntrinsicWidth() / 2.0f));
                    int intrinsicHeight = (int) (fDp - (drawableArr[0].getIntrinsicHeight() / 2.0f));
                    float fDpf2 = AndroidUtilities.dpf2(8.0f) + intrinsicWidth + this.crossOffset;
                    float fDpf3 = AndroidUtilities.dpf2(8.0f) + intrinsicHeight;
                    float fDp3 = fDpf2 - AndroidUtilities.dp(1.0f);
                    float fDp4 = AndroidUtilities.dp(17.0f);
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                    float interpolation = (cubicBezierInterpolator.getInterpolation(this.crossProgress) * fDp4) + fDp3;
                    float interpolation2 = (cubicBezierInterpolator.getInterpolation(this.crossProgress) * AndroidUtilities.dp(17.0f)) + fDpf3;
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    Drawable drawable2 = drawableArr[0];
                    drawable2.setBounds((int) (width - (drawable2.getIntrinsicWidth() / 2.0f)), (int) (fDp - (drawableArr[0].getIntrinsicHeight() / 2.0f)), (int) ((drawableArr[0].getIntrinsicWidth() / 2.0f) + width), (int) ((drawableArr[0].getIntrinsicHeight() / 2.0f) + fDp));
                    drawableArr[0].draw(canvas);
                    canvas.drawLine(fDpf2, fDpf3 - AndroidUtilities.dp(2.0f), interpolation, interpolation2 - AndroidUtilities.dp(2.0f), this.xRefPaint);
                    canvas.drawLine(fDpf2, fDpf3, interpolation, interpolation2, paint2);
                    canvas.restore();
                } else {
                    Drawable drawable3 = drawableArr[0];
                    drawable3.setBounds((int) (width - (drawable3.getIntrinsicWidth() / 2.0f)), (int) (fDp - (drawableArr[0].getIntrinsicHeight() / 2.0f)), (int) ((drawableArr[0].getIntrinsicWidth() / 2.0f) + width), (int) ((drawableArr[0].getIntrinsicHeight() / 2.0f) + fDp));
                    drawableArr[0].draw(canvas);
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
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

    public final void setBackgroundColor(int i, int i2) {
        this.backgroundCheck1 = i;
        this.backgroundCheck2 = i2;
        this.backgroundColor = ColorUtils.blendARGB(this.checkedProgress, i, i2);
        invalidate();
    }

    public void setCheckable(boolean z) {
        this.checkable = z;
    }

    public final void setChecked(boolean z, boolean z2) {
        int i = 1;
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
            this.checkAnimator.addListener(new PhotoViewer$41$1(this, i));
            this.checkAnimator.setDuration(150L);
            this.checkAnimator.start();
        }
    }

    public void setCrossOffset(float f) {
        this.crossOffset = f;
    }

    public final void setData() {
        setData(0, 0, 0, 1.0f, true, "Text", false, false);
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

    public final void showText(boolean z, boolean z2) {
        FrameLayout frameLayout = this.textLayoutContainer;
        if (!z2) {
            frameLayout.animate().cancel();
            frameLayout.setAlpha(z ? 1.0f : 0.0f);
        } else {
            float f = z ? 1.0f : 0.0f;
            if (frameLayout.getAlpha() != f) {
                frameLayout.animate().alpha(f).start();
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.rippleDrawable == drawable || super.verifyDrawable(drawable);
    }

    public final void setData(int i, int i2, int i3, float f, boolean z, String str, boolean z2, boolean z3) {
        boolean z4;
        String str2;
        if (getVisibility() != 0) {
            setVisibility(0);
            z4 = false;
        } else {
            z4 = z3;
        }
        if (this.currentIconRes == i && this.currentIconColor == i2 && ((this.checkable || this.currentBackgroundColor == i3) && (str2 = this.currentText) != null && str2.equals(str) && z2 == this.drawCross)) {
            return;
        }
        if (this.rippleDrawable == null || z) {
            int iAlpha = Color.alpha(i3);
            float f2 = this.diameter;
            if (iAlpha != 255 || AndroidUtilities.computePerceivedBrightness(i3) <= 0.5d) {
                BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(f2), 0, ColorUtils.setAlphaComponent(-1, (int) (76.5f * f)));
                this.rippleDrawable = rippleDrawableSafeCreateSimpleSelectorCircleDrawable;
                rippleDrawableSafeCreateSimpleSelectorCircleDrawable.setCallback(this);
            } else {
                BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorCircleDrawable2 = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(f2), 0, ColorUtils.setAlphaComponent(-16777216, (int) (25.5f * f)));
                this.rippleDrawable = rippleDrawableSafeCreateSimpleSelectorCircleDrawable2;
                rippleDrawableSafeCreateSimpleSelectorCircleDrawable2.setCallback(this);
            }
        }
        ValueAnimator valueAnimator = this.replaceAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.animateBackground = this.currentBackgroundColor != i3;
        boolean z5 = this.currentIconRes == i;
        this.iconChangeColor = z5;
        if (z5) {
            this.replaceColorFrom = this.currentIconColor;
        }
        this.currentIconRes = i;
        this.currentIconColor = i2;
        this.currentBackgroundColor = i3;
        this.currentText = str;
        this.drawCross = z2;
        Drawable[] drawableArr = this.icon;
        TextView[] textViewArr = this.textView;
        if (!z4) {
            if (i != 0) {
                Drawable drawableMutate = getContext().getDrawable(i).mutate();
                drawableArr[0] = drawableMutate;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
            }
            this.crossPaint.setColor(i2);
            if (!this.checkable) {
                this.backgroundColor = i3;
            }
            textViewArr[0].setText(str);
            this.crossProgress = this.drawCross ? 1.0f : 0.0f;
            this.iconChangeColor = false;
            this.replaceProgress = 0.0f;
            invalidate();
            return;
        }
        if (!z5 && i != 0) {
            Drawable drawableMutate2 = getContext().getDrawable(i).mutate();
            drawableArr[1] = drawableMutate2;
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        }
        if (!this.checkable) {
            this.animateToBackgroundColor = i3;
        }
        boolean zEquals = textViewArr[0].getText().toString().equals(str);
        boolean z6 = !zEquals;
        if (zEquals) {
            textViewArr[0].setText(str);
        } else {
            textViewArr[1].setText(str);
            textViewArr[1].setVisibility(0);
            textViewArr[1].setAlpha(0.0f);
            textViewArr[1].setScaleX(0.0f);
            textViewArr[1].setScaleY(0.0f);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.replaceAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new SecretVoicePlayer$$ExternalSyntheticLambda1(9, this, z6));
        this.replaceAnimator.addListener(new LoginActivity.AnonymousClass9(15, this, z6));
        this.replaceAnimator.setDuration(150L).start();
        invalidate();
    }
}
