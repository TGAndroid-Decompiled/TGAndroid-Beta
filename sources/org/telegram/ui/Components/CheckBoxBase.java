package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextPaint;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.Theme;

public class CheckBoxBase {
    private static Paint forbidPaint;
    private static Paint paint;
    public long animationDuration;
    private boolean attachedToWindow;
    private int background2ColorKey;
    private int backgroundColor;
    private int backgroundColorKey;
    private Paint backgroundPaint;
    private int backgroundType;
    private ObjectAnimator checkAnimator;
    private Paint checkPaint;
    private String checkedText;
    private GenericProvider circlePaintProvider;
    private float customRadius;
    private float customRadiusFactor;
    private boolean cutCheck;
    private boolean drawUnchecked;
    private boolean forbidden;
    private boolean isChecked;
    private MessageDrawable messageDrawable;
    private View parentView;
    private float progress;
    private ProgressDelegate progressDelegate;
    private Theme.ResourcesProvider resourcesProvider;
    private float size;
    private int strokeBackgroundKey;
    private int strokeBackgroundWidth;
    private TextPaint textPaint;
    private boolean useDefaultCheck;
    public Rect bounds = new Rect();
    private RectF rect = new RectF();
    public float checkScale = 1.0f;
    private float alpha = 1.0f;
    private Path path = new Path();
    private boolean enabled = true;
    private float backgroundAlpha = 1.0f;
    private int checkColorKey = Theme.key_checkboxCheck;

    public interface ProgressDelegate {
        void setProgress(float f);
    }

    public void setAlpha(float f) {
        if (this.alpha == f) {
            return;
        }
        this.alpha = f;
        invalidate();
    }

    public void setCuttingCheck(boolean z) {
        if (this.cutCheck == z) {
            return;
        }
        this.cutCheck = z;
        this.checkPaint.setXfermode(z ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
        invalidate();
    }

    public CheckBoxBase(View view, int i, Theme.ResourcesProvider resourcesProvider) {
        int i2 = Theme.key_chat_serviceBackground;
        this.backgroundColorKey = i2;
        this.background2ColorKey = i2;
        this.strokeBackgroundKey = Theme.key_dialogBackground;
        this.strokeBackgroundWidth = -1;
        this.customRadius = 0.0f;
        this.customRadiusFactor = 1.0f;
        this.drawUnchecked = true;
        this.circlePaintProvider = new GenericProvider() {
            @Override
            public final Object provide(Object obj) {
                return CheckBoxBase.paint;
            }
        };
        this.animationDuration = 200L;
        this.resourcesProvider = resourcesProvider;
        this.parentView = view;
        this.size = i;
        if (paint == null) {
            paint = new Paint(1);
        }
        Paint paint2 = new Paint(1);
        this.checkPaint = paint2;
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = this.checkPaint;
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        this.checkPaint.setStrokeJoin(Paint.Join.ROUND);
        this.checkPaint.setStrokeWidth(AndroidUtilities.dp(1.9f));
        Paint paint4 = new Paint(1);
        this.backgroundPaint = paint4;
        paint4.setStyle(style);
        this.backgroundPaint.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public void setSize(float f) {
        if (this.size == f) {
            return;
        }
        this.size = f;
        invalidate();
    }

    public void setParentView(View view) {
        this.parentView = view;
    }

    public View getParentView() {
        return this.parentView;
    }

    public void setResourcesProvider(Theme.ResourcesProvider resourcesProvider) {
        if (this.resourcesProvider == resourcesProvider) {
            return;
        }
        this.resourcesProvider = resourcesProvider;
        invalidate();
    }

    public void onAttachedToWindow() {
        this.attachedToWindow = true;
    }

    public void onDetachedFromWindow() {
        this.attachedToWindow = false;
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i3 + i;
        int i6 = i4 + i2;
        Rect rect = this.bounds;
        if (rect.left == i && rect.top == i2 && rect.right == i5 && rect.bottom == i6) {
            return;
        }
        rect.left = i;
        rect.top = i2;
        rect.right = i5;
        rect.bottom = i6;
        invalidate();
    }

    public void setCustomRadius(float f) {
        if (this.customRadius == f) {
            return;
        }
        this.customRadius = f;
        invalidate();
    }

    public void setCustomRadiusFactor(float f) {
        if (this.customRadiusFactor == f) {
            return;
        }
        this.customRadiusFactor = f;
        invalidate();
    }

    public void setDrawUnchecked(boolean z) {
        if (this.drawUnchecked == z) {
            return;
        }
        this.drawUnchecked = z;
        invalidate();
    }

    public boolean getDrawUnchecked() {
        return this.drawUnchecked;
    }

    public void setProgress(float f) {
        if (this.progress == f) {
            return;
        }
        this.progress = f;
        invalidate();
        ProgressDelegate progressDelegate = this.progressDelegate;
        if (progressDelegate != null) {
            progressDelegate.setProgress(f);
        }
    }

    public void setForbidden(boolean z) {
        if (this.forbidden == z) {
            return;
        }
        this.forbidden = z;
        invalidate();
    }

    private void invalidate() {
        View view = this.parentView;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.parentView.getParent()).invalidate();
        }
        this.parentView.invalidate();
    }

    public void setProgressDelegate(ProgressDelegate progressDelegate) {
        this.progressDelegate = progressDelegate;
    }

    public float getProgress() {
        return this.progress;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public void setEnabled(boolean z) {
        if (this.enabled == z) {
            return;
        }
        this.enabled = z;
        invalidate();
    }

    public void setBackgroundType(int i) {
        if (this.backgroundType == i) {
            return;
        }
        this.backgroundType = i;
        if (i == 12 || i == 13) {
            this.backgroundPaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        } else if (i == 4 || i == 5) {
            this.backgroundPaint.setStrokeWidth(AndroidUtilities.dp(1.9f));
            if (i == 5) {
                this.checkPaint.setStrokeWidth(AndroidUtilities.dp(1.5f));
            }
        } else if (i == 3) {
            this.backgroundPaint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        } else if (i != 0) {
            this.backgroundPaint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        }
        invalidate();
    }

    public void cancelCheckAnimator() {
        ObjectAnimator objectAnimator = this.checkAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.checkAnimator = null;
        }
    }

    private void animateToCheckedState(boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", z ? 1.0f : 0.0f);
        this.checkAnimator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (animator.equals(CheckBoxBase.this.checkAnimator)) {
                    CheckBoxBase.this.checkAnimator = null;
                }
                if (CheckBoxBase.this.isChecked) {
                    return;
                }
                CheckBoxBase.this.checkedText = null;
            }
        });
        this.checkAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        this.checkAnimator.setDuration(this.animationDuration);
        this.checkAnimator.start();
    }

    public void setColor(int i, int i2, int i3) {
        if (this.backgroundColorKey == i && this.background2ColorKey == i2 && this.checkColorKey == i3) {
            return;
        }
        this.backgroundColorKey = i;
        this.background2ColorKey = i2;
        this.checkColorKey = i3;
        invalidate();
    }

    public void setStrokeBackgroundColor(int i) {
        if (this.strokeBackgroundKey == i) {
            return;
        }
        this.strokeBackgroundKey = i;
        invalidate();
    }

    public void setBackgroundColor(int i) {
        if (this.backgroundColor == i) {
            return;
        }
        this.backgroundColor = i;
        invalidate();
    }

    public void setBackgroundDrawable(MessageDrawable messageDrawable) {
        if (this.messageDrawable == messageDrawable) {
            return;
        }
        this.messageDrawable = messageDrawable;
        invalidate();
    }

    public void setUseDefaultCheck(boolean z) {
        if (this.useDefaultCheck == z) {
            return;
        }
        this.useDefaultCheck = z;
        invalidate();
    }

    public void setBackgroundAlpha(float f) {
        if (this.backgroundAlpha == f) {
            return;
        }
        this.backgroundAlpha = f;
        invalidate();
    }

    public void setNum(int i) {
        String str;
        if (i >= 0) {
            str = "" + (i + 1);
        } else {
            str = this.checkAnimator != null ? this.checkedText : null;
        }
        String str2 = this.checkedText;
        if (str2 == null) {
            if (str == null) {
                return;
            }
        } else if (str2.equals(str)) {
            return;
        }
        this.checkedText = str;
        invalidate();
    }

    public void setChecked(boolean z, boolean z2) {
        setChecked(-1, z, z2);
    }

    public void setChecked(int i, boolean z, boolean z2) {
        if (i >= 0) {
            String str = "" + (i + 1);
            String str2 = this.checkedText;
            if (str2 == null || !str2.equals(str)) {
                this.checkedText = str;
                invalidate();
            }
        }
        if (z == this.isChecked) {
            return;
        }
        this.isChecked = z;
        if (this.attachedToWindow && z2) {
            animateToCheckedState(z);
        } else {
            cancelCheckAnimator();
            setProgress(z ? 1.0f : 0.0f);
        }
    }

    public void draw(Canvas canvas) {
        float fDp;
        float f;
        float f2;
        int iCenterX;
        int iCenterY;
        boolean z;
        float f3;
        int i;
        int i2;
        int i3;
        float f4;
        float f5;
        float f6;
        Canvas canvas2;
        int i4;
        int i5;
        int i6;
        char c;
        int i7;
        int i8;
        float f7;
        int i9;
        int i10;
        float f8;
        int i11;
        int i12;
        float f9;
        boolean z2;
        int i13;
        int length;
        float f10;
        float f11;
        float fDp2;
        boolean z3;
        Paint paint2;
        int i14;
        int alpha;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        float fDp3 = AndroidUtilities.dp(this.size / 2.0f);
        int i23 = this.backgroundType;
        if (i23 == 12 || i23 == 13) {
            fDp3 = AndroidUtilities.dp(10.0f);
        } else {
            if (i23 != 0 && i23 != 11) {
                fDp = fDp3 - AndroidUtilities.dp(0.2f);
            }
            if (this.forbidden) {
                f = 1.0f;
            } else {
                f = this.progress;
            }
            if (f >= 0.5f) {
                f2 = 1.0f;
            } else {
                f2 = f / 0.5f;
            }
            iCenterX = this.bounds.centerX();
            iCenterY = this.bounds.centerY();
            if (this.cutCheck || f2 <= 0.0f || f < 0.5f || this.forbidden || this.checkedText != null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                float f12 = iCenterX;
                float f13 = f;
                float f14 = f12 - fDp3;
                float f15 = iCenterY;
                float f16 = f15 - fDp3;
                float f17 = f12 + fDp3;
                float f18 = f15 + fDp3;
                f3 = f13;
                i = iCenterX;
                i2 = iCenterY;
                i3 = 12;
                f4 = 2.0f;
                f5 = 0.0f;
                f6 = 1.0f;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(f14, f16, f17, f18, 255, 31);
            } else {
                f3 = f;
                i = iCenterX;
                i2 = iCenterY;
                i3 = 12;
                f4 = 2.0f;
                f5 = 0.0f;
                f6 = 1.0f;
                canvas2 = canvas;
            }
            i4 = this.backgroundColorKey;
            if (i4 >= 0) {
                if (this.drawUnchecked) {
                    i22 = this.backgroundType;
                    if (i22 != i3 || i22 == 13) {
                        paint.setColor(getThemedColor(i4));
                        paint.setAlpha((int) (this.backgroundAlpha * 255.0f));
                        this.backgroundPaint.setColor(getThemedColor(this.checkColorKey));
                    } else if (i22 == 6 || i22 == 7) {
                        paint.setColor(getThemedColor(this.background2ColorKey));
                        this.backgroundPaint.setColor(getThemedColor(this.checkColorKey));
                    } else if (i22 == 10 || i22 == 14) {
                        this.backgroundPaint.setColor(getThemedColor(this.background2ColorKey));
                    } else {
                        paint.setColor((Theme.getServiceMessageColor() & 16777215) | 671088640);
                        this.backgroundPaint.setColor(getThemedColor(this.checkColorKey));
                    }
                } else {
                    Paint paint3 = this.backgroundPaint;
                    i21 = this.background2ColorKey;
                    if (i21 < 0) {
                        i21 = this.checkColorKey;
                    }
                    paint3.setColor(AndroidUtilities.getOffsetColor(16777215, getThemedColor(i21), f3, this.backgroundAlpha));
                }
            } else {
                if (this.drawUnchecked) {
                    paint.setColor(Color.argb((int) (this.backgroundAlpha * 25.0f), 0, 0, 0));
                    if (this.backgroundType == 8) {
                        this.backgroundPaint.setColor(getThemedColor(this.background2ColorKey));
                    } else {
                        i5 = -1;
                        this.backgroundPaint.setColor(AndroidUtilities.getOffsetColor(-1, getThemedColor(this.checkColorKey), f3, this.backgroundAlpha));
                    }
                } else {
                    i5 = -1;
                    if (this.backgroundColor != 0) {
                        this.backgroundPaint.setColor(0);
                    } else {
                        Paint paint4 = this.backgroundPaint;
                        i6 = this.background2ColorKey;
                        if (i6 < 0) {
                            i6 = this.checkColorKey;
                        }
                        c = 0;
                        paint4.setColor(AndroidUtilities.getOffsetColor(16777215, getThemedColor(i6), f3, this.backgroundAlpha));
                    }
                    if (this.drawUnchecked || (i20 = this.backgroundType) < 0 || i20 == i3 || i20 == 13) {
                        i7 = 8;
                        i8 = 10;
                        f7 = 1.5f;
                    } else if (i20 != 8 && i20 != 10 && i20 != 14) {
                        if (i20 == 6 || i20 == 7) {
                            float f19 = i;
                            float f20 = i2;
                            canvas2.drawCircle(f19, f20, fDp3 - AndroidUtilities.dp(f6), paint);
                            canvas2.drawCircle(f19, f20, fDp3 - AndroidUtilities.dp(1.5f), this.backgroundPaint);
                        } else {
                            canvas2.drawCircle(i, i2, fDp3, paint);
                        }
                        i7 = 8;
                        i8 = 10;
                        f7 = 1.5f;
                    } else if (this.customRadius > f5) {
                        float fDp4 = fDp3 - AndroidUtilities.dp(1.5f);
                        float fLerp = AndroidUtilities.lerp(fDp4, this.customRadius, this.customRadiusFactor);
                        float f21 = i;
                        float f22 = i2;
                        i7 = 8;
                        i8 = 10;
                        f7 = 1.5f;
                        canvas2.drawRoundRect(f21 - fDp4, f22 - fDp4, f21 + fDp4, f22 + fDp4, fLerp, fLerp, this.backgroundPaint);
                    } else {
                        i7 = 8;
                        i8 = 10;
                        f7 = 1.5f;
                        canvas2.drawCircle(i, i2, fDp3 - AndroidUtilities.dp(1.5f), this.backgroundPaint);
                    }
                    paint.setColor(getThemedColor(this.checkColorKey));
                    i9 = this.backgroundType;
                    if (i9 == i5 && i9 != 7 && i9 != i7 && i9 != 9 && i9 != i8 && i9 != 14) {
                        if (i9 == 12 || i9 == 13) {
                            i10 = 6;
                            this.backgroundPaint.setStyle(Paint.Style.FILL);
                            MessageDrawable messageDrawable = this.messageDrawable;
                            if (messageDrawable != null && messageDrawable.hasGradient()) {
                                Shader gradientShader = this.messageDrawable.getGradientShader();
                                Matrix matrix = this.messageDrawable.getMatrix();
                                matrix.reset();
                                this.messageDrawable.applyMatrixScale();
                                matrix.postTranslate(0.0f, (-this.messageDrawable.getTopY()) + this.bounds.top);
                                gradientShader.setLocalMatrix(matrix);
                                this.backgroundPaint.setShader(gradientShader);
                            } else {
                                this.backgroundPaint.setShader(null);
                            }
                            canvas2.drawCircle(i, i2, (fDp3 - AndroidUtilities.dp(f6)) * this.backgroundAlpha, this.backgroundPaint);
                            this.backgroundPaint.setStyle(Paint.Style.STROKE);
                        } else if (i9 == 0 || i9 == 11) {
                            i10 = 6;
                            canvas2.drawCircle(i, i2, fDp3, this.backgroundPaint);
                        } else {
                            float f23 = i;
                            float f24 = i2;
                            this.rect.set(f23 - fDp, f24 - fDp, f23 + fDp, f24 + fDp);
                            int i24 = this.backgroundType;
                            i10 = 6;
                            if (i24 == 6) {
                                i16 = (int) ((-360.0f) * f3);
                                i17 = 0;
                            } else if (i24 == 1) {
                                i16 = (int) ((-270.0f) * f3);
                                i17 = -90;
                            } else {
                                i16 = (int) (270.0f * f3);
                                if (LocaleController.isRTL) {
                                    i16 = -i16;
                                }
                                i17 = 90;
                            }
                            if (i24 == 6) {
                                int themedColor = getThemedColor(this.strokeBackgroundKey);
                                int iAlpha = Color.alpha(themedColor);
                                this.backgroundPaint.setColor(themedColor);
                                this.backgroundPaint.setAlpha((int) (iAlpha * f3));
                                i19 = i17;
                                i18 = i16;
                                canvas2.drawArc(this.rect, i17, i16, false, this.backgroundPaint);
                                int themedColor2 = getThemedColor(Theme.key_chat_attachPhotoBackground);
                                int iAlpha2 = Color.alpha(themedColor2);
                                this.backgroundPaint.setColor(themedColor2);
                                this.backgroundPaint.setAlpha((int) (iAlpha2 * f3));
                            } else {
                                i18 = i16;
                                i19 = i17;
                            }
                            canvas2 = canvas;
                            canvas2.drawArc(this.rect, i19, i18, false, this.backgroundPaint);
                        }
                        if (f2 > f5) {
                            if (f3 < 0.5f) {
                                f8 = 0.0f;
                            } else {
                                f8 = (f3 - 0.5f) / 0.5f;
                            }
                            i11 = this.backgroundType;
                            if (i11 == 9) {
                                paint.setColor(getThemedColor(this.background2ColorKey));
                            } else if (i11 != 11 || i11 == i10 || i11 == 7 || i11 == 10 || ((!this.drawUnchecked && this.backgroundColorKey >= 0) || i11 == 14)) {
                                paint.setColor(getThemedColor(this.backgroundColorKey));
                            } else {
                                int i25 = this.backgroundColor;
                                if (i25 != 0) {
                                    paint.setColor(i25);
                                } else {
                                    paint.setColor(getThemedColor(this.enabled ? Theme.key_checkbox : Theme.key_checkboxDisabled));
                                }
                            }
                            if (this.forbidden) {
                                paint.setColor(this.backgroundPaint.getColor());
                            } else if (this.alpha < f6) {
                                paint.setColor(ColorUtils.blendARGB(this.backgroundPaint.getColor(), paint.getColor(), this.alpha));
                            }
                            if (this.useDefaultCheck && (i15 = this.checkColorKey) >= 0) {
                                this.checkPaint.setColor(getThemedColor(i15));
                            } else {
                                this.checkPaint.setColor(getThemedColor(Theme.key_checkboxCheck));
                            }
                            if (this.alpha < f6 && Theme.isCurrentThemeDark()) {
                                this.checkPaint.setColor(ColorUtils.blendARGB(paint.getColor(), this.checkPaint.getColor(), this.alpha));
                            }
                            if (this.backgroundType != -1) {
                                fDp2 = AndroidUtilities.dp(this.size) / f4;
                                int iSave = canvas2.save();
                                canvas2.translate(i - fDp2, i2 - fDp2);
                                if (f2 < f6) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    canvas2.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.size), AndroidUtilities.dp(this.size), 255, 31);
                                }
                                paint2 = (Paint) this.circlePaintProvider.provide(null);
                                i14 = this.backgroundType;
                                if (i14 != 12 || i14 == 13) {
                                    canvas2 = canvas;
                                    alpha = paint2.getAlpha();
                                    paint2.setAlpha((int) (f2 * 255.0f));
                                    canvas2.drawCircle(fDp2, fDp2, fDp3 * f2, paint2);
                                    if (paint2 != paint) {
                                        paint2.setAlpha(alpha);
                                    }
                                } else if (this.customRadius > 0.0f) {
                                    float fDp5 = fDp3 - AndroidUtilities.dp(0.5f);
                                    float fLerp2 = AndroidUtilities.lerp(fDp5, this.customRadius, this.customRadiusFactor);
                                    float f25 = fDp2 - fDp5;
                                    float f26 = fDp2 + fDp5;
                                    canvas.drawRoundRect(f25, f25, f26, f26, fLerp2, fLerp2, paint2);
                                    float f27 = fDp5 * (f6 - f2);
                                    float fLerp3 = AndroidUtilities.lerp(f27, this.customRadius, this.customRadiusFactor);
                                    if (!z3 || f27 <= 0.0f) {
                                        canvas2 = canvas;
                                    } else {
                                        float f28 = fDp2 - f27;
                                        float f29 = fDp2 + f27;
                                        canvas2 = canvas;
                                        canvas2.drawRoundRect(f28, f28, f29, f29, fLerp3, fLerp3, Theme.PAINT_CLEAR);
                                    }
                                } else {
                                    canvas2 = canvas;
                                    float fDp6 = fDp3 - AndroidUtilities.dp(0.5f);
                                    canvas2.drawCircle(fDp2, fDp2, fDp6, paint2);
                                    float f30 = fDp6 * (f6 - f2);
                                    if (z3 && f30 > 0.0f) {
                                        canvas2.drawCircle(fDp2, fDp2, f30, Theme.PAINT_CLEAR);
                                    }
                                }
                                canvas2.restoreToCount(iSave);
                            }
                            if (this.forbidden) {
                                if (forbidPaint == null) {
                                    Paint paint5 = new Paint(1);
                                    forbidPaint = paint5;
                                    paint5.setStyle(Paint.Style.STROKE);
                                    forbidPaint.setStrokeCap(Paint.Cap.ROUND);
                                    forbidPaint.setStrokeJoin(Paint.Join.ROUND);
                                    Paint paint6 = forbidPaint;
                                    float fDp7 = AndroidUtilities.dp(0.66f);
                                    float fDp8 = AndroidUtilities.dp(4.0f);
                                    float[] fArr = new float[2];
                                    fArr[c] = fDp7;
                                    fArr[1] = fDp8;
                                    paint6.setPathEffect(new DashPathEffect(fArr, 0.0f));
                                }
                                forbidPaint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                                forbidPaint.setColor(getThemedColor(Theme.key_switchTrack));
                                canvas2.drawCircle(i, i2, AndroidUtilities.dp(9.0f), forbidPaint);
                            } else if (f8 != 0.0f) {
                                if (this.checkedText != null) {
                                    if (this.textPaint == null) {
                                        i13 = 1;
                                        TextPaint textPaint = new TextPaint(1);
                                        this.textPaint = textPaint;
                                        textPaint.setTypeface(AndroidUtilities.bold());
                                    } else {
                                        i13 = 1;
                                    }
                                    length = this.checkedText.length();
                                    if (length != 0 || length == i13 || length == 2) {
                                        f10 = 14.0f;
                                        f11 = 18.0f;
                                    } else if (length != 3) {
                                        f10 = 8.0f;
                                        f11 = 15.75f;
                                    } else {
                                        f11 = 16.5f;
                                        f10 = 10.0f;
                                    }
                                    this.textPaint.setTextSize(AndroidUtilities.dp(f10));
                                    this.textPaint.setColor(getThemedColor(this.checkColorKey));
                                    canvas2.save();
                                    float f31 = i;
                                    canvas2.scale(f8, 1.0f, f31, i2);
                                    String str = this.checkedText;
                                    canvas2.drawText(str, f31 - (this.textPaint.measureText(str) / f4), AndroidUtilities.dp(f11), this.textPaint);
                                    canvas2.restore();
                                } else {
                                    this.path.reset();
                                    i12 = this.backgroundType;
                                    if (i12 == -1) {
                                        f9 = 1.4f;
                                    } else if (i12 == 5) {
                                        f9 = 0.8f;
                                    } else {
                                        f9 = 1.0f;
                                    }
                                    float fDp9 = AndroidUtilities.dp(f9 * 9.0f) * f8;
                                    float fDp10 = AndroidUtilities.dp(f9 * 4.0f) * f8;
                                    int iDp = i - AndroidUtilities.dp(f7);
                                    int iDp2 = AndroidUtilities.dp(4.0f) + i2;
                                    float fSqrt = (float) Math.sqrt((fDp10 * fDp10) / f4);
                                    float f32 = iDp;
                                    float f33 = iDp2;
                                    this.path.moveTo(f32 - fSqrt, f33 - fSqrt);
                                    this.path.lineTo(f32, f33);
                                    float fSqrt2 = (float) Math.sqrt((fDp9 * fDp9) / f4);
                                    this.path.lineTo(f32 + fSqrt2, f33 - fSqrt2);
                                    if (z && this.checkScale == 1.0f) {
                                        z2 = false;
                                    } else {
                                        canvas2.save();
                                        float f34 = this.checkScale;
                                        canvas2.scale(f34, f34, i, i2);
                                        z2 = true;
                                    }
                                    canvas2.drawPath(this.path, this.checkPaint);
                                    if (z2) {
                                        canvas2.restore();
                                    }
                                }
                            }
                        }
                        if (z) {
                            canvas2.restore();
                        }
                    }
                    i10 = 6;
                    f5 = 0.0f;
                    if (f2 > f5) {
                        if (f3 < 0.5f) {
                            f8 = 0.0f;
                        } else {
                            f8 = (f3 - 0.5f) / 0.5f;
                        }
                        i11 = this.backgroundType;
                        if (i11 == 9) {
                            paint.setColor(getThemedColor(this.background2ColorKey));
                        } else if (i11 != 11) {
                            paint.setColor(getThemedColor(this.backgroundColorKey));
                        } else {
                            paint.setColor(getThemedColor(this.backgroundColorKey));
                        }
                        if (this.forbidden) {
                            paint.setColor(this.backgroundPaint.getColor());
                        } else if (this.alpha < f6) {
                            paint.setColor(ColorUtils.blendARGB(this.backgroundPaint.getColor(), paint.getColor(), this.alpha));
                        }
                        if (this.useDefaultCheck) {
                            this.checkPaint.setColor(getThemedColor(Theme.key_checkboxCheck));
                        } else {
                            this.checkPaint.setColor(getThemedColor(Theme.key_checkboxCheck));
                        }
                        if (this.alpha < f6) {
                            this.checkPaint.setColor(ColorUtils.blendARGB(paint.getColor(), this.checkPaint.getColor(), this.alpha));
                        }
                        if (this.backgroundType != -1) {
                            fDp2 = AndroidUtilities.dp(this.size) / f4;
                            int iSave2 = canvas2.save();
                            canvas2.translate(i - fDp2, i2 - fDp2);
                            if (f2 < f6) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                canvas2.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.size), AndroidUtilities.dp(this.size), 255, 31);
                            }
                            paint2 = (Paint) this.circlePaintProvider.provide(null);
                            i14 = this.backgroundType;
                            if (i14 != 12) {
                                canvas2 = canvas;
                                alpha = paint2.getAlpha();
                                paint2.setAlpha((int) (f2 * 255.0f));
                                canvas2.drawCircle(fDp2, fDp2, fDp3 * f2, paint2);
                                if (paint2 != paint) {
                                    paint2.setAlpha(alpha);
                                }
                            } else {
                                canvas2 = canvas;
                                alpha = paint2.getAlpha();
                                paint2.setAlpha((int) (f2 * 255.0f));
                                canvas2.drawCircle(fDp2, fDp2, fDp3 * f2, paint2);
                                if (paint2 != paint) {
                                    paint2.setAlpha(alpha);
                                }
                            }
                            canvas2.restoreToCount(iSave2);
                        }
                        if (this.forbidden) {
                            if (forbidPaint == null) {
                                Paint paint7 = new Paint(1);
                                forbidPaint = paint7;
                                paint7.setStyle(Paint.Style.STROKE);
                                forbidPaint.setStrokeCap(Paint.Cap.ROUND);
                                forbidPaint.setStrokeJoin(Paint.Join.ROUND);
                                Paint paint8 = forbidPaint;
                                float fDp11 = AndroidUtilities.dp(0.66f);
                                float fDp12 = AndroidUtilities.dp(4.0f);
                                float[] fArr2 = new float[2];
                                fArr2[c] = fDp11;
                                fArr2[1] = fDp12;
                                paint8.setPathEffect(new DashPathEffect(fArr2, 0.0f));
                            }
                            forbidPaint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                            forbidPaint.setColor(getThemedColor(Theme.key_switchTrack));
                            canvas2.drawCircle(i, i2, AndroidUtilities.dp(9.0f), forbidPaint);
                        } else if (f8 != 0.0f) {
                            if (this.checkedText != null) {
                                if (this.textPaint == null) {
                                    i13 = 1;
                                    TextPaint textPaint2 = new TextPaint(1);
                                    this.textPaint = textPaint2;
                                    textPaint2.setTypeface(AndroidUtilities.bold());
                                } else {
                                    i13 = 1;
                                }
                                length = this.checkedText.length();
                                if (length != 0) {
                                    f10 = 14.0f;
                                    f11 = 18.0f;
                                } else {
                                    f10 = 14.0f;
                                    f11 = 18.0f;
                                }
                                this.textPaint.setTextSize(AndroidUtilities.dp(f10));
                                this.textPaint.setColor(getThemedColor(this.checkColorKey));
                                canvas2.save();
                                float f35 = i;
                                canvas2.scale(f8, 1.0f, f35, i2);
                                String str2 = this.checkedText;
                                canvas2.drawText(str2, f35 - (this.textPaint.measureText(str2) / f4), AndroidUtilities.dp(f11), this.textPaint);
                                canvas2.restore();
                            } else {
                                this.path.reset();
                                i12 = this.backgroundType;
                                if (i12 == -1) {
                                    f9 = 1.4f;
                                } else if (i12 == 5) {
                                    f9 = 0.8f;
                                } else {
                                    f9 = 1.0f;
                                }
                                float fDp13 = AndroidUtilities.dp(f9 * 9.0f) * f8;
                                float fDp14 = AndroidUtilities.dp(f9 * 4.0f) * f8;
                                int iDp3 = i - AndroidUtilities.dp(f7);
                                int iDp4 = AndroidUtilities.dp(4.0f) + i2;
                                float fSqrt3 = (float) Math.sqrt((fDp14 * fDp14) / f4);
                                float f36 = iDp3;
                                float f37 = iDp4;
                                this.path.moveTo(f36 - fSqrt3, f37 - fSqrt3);
                                this.path.lineTo(f36, f37);
                                float fSqrt4 = (float) Math.sqrt((fDp13 * fDp13) / f4);
                                this.path.lineTo(f36 + fSqrt4, f37 - fSqrt4);
                                if (z) {
                                    canvas2.save();
                                    float f38 = this.checkScale;
                                    canvas2.scale(f38, f38, i, i2);
                                    z2 = true;
                                } else {
                                    canvas2.save();
                                    float f39 = this.checkScale;
                                    canvas2.scale(f39, f39, i, i2);
                                    z2 = true;
                                }
                                canvas2.drawPath(this.path, this.checkPaint);
                                if (z2) {
                                    canvas2.restore();
                                }
                            }
                        }
                    }
                    if (z) {
                        canvas2.restore();
                    }
                }
                c = 0;
                if (this.drawUnchecked) {
                    i7 = 8;
                    i8 = 10;
                    f7 = 1.5f;
                } else {
                    i7 = 8;
                    i8 = 10;
                    f7 = 1.5f;
                }
                paint.setColor(getThemedColor(this.checkColorKey));
                i9 = this.backgroundType;
                if (i9 == i5) {
                    i10 = 6;
                    f5 = 0.0f;
                } else {
                    i10 = 6;
                    f5 = 0.0f;
                }
                if (f2 > f5) {
                    if (f3 < 0.5f) {
                        f8 = 0.0f;
                    } else {
                        f8 = (f3 - 0.5f) / 0.5f;
                    }
                    i11 = this.backgroundType;
                    if (i11 == 9) {
                        paint.setColor(getThemedColor(this.background2ColorKey));
                    } else if (i11 != 11) {
                        paint.setColor(getThemedColor(this.backgroundColorKey));
                    } else {
                        paint.setColor(getThemedColor(this.backgroundColorKey));
                    }
                    if (this.forbidden) {
                        paint.setColor(this.backgroundPaint.getColor());
                    } else if (this.alpha < f6) {
                        paint.setColor(ColorUtils.blendARGB(this.backgroundPaint.getColor(), paint.getColor(), this.alpha));
                    }
                    if (this.useDefaultCheck) {
                        this.checkPaint.setColor(getThemedColor(Theme.key_checkboxCheck));
                    } else {
                        this.checkPaint.setColor(getThemedColor(Theme.key_checkboxCheck));
                    }
                    if (this.alpha < f6) {
                        this.checkPaint.setColor(ColorUtils.blendARGB(paint.getColor(), this.checkPaint.getColor(), this.alpha));
                    }
                    if (this.backgroundType != -1) {
                        fDp2 = AndroidUtilities.dp(this.size) / f4;
                        int iSave3 = canvas2.save();
                        canvas2.translate(i - fDp2, i2 - fDp2);
                        if (f2 < f6) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            canvas2.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.size), AndroidUtilities.dp(this.size), 255, 31);
                        }
                        paint2 = (Paint) this.circlePaintProvider.provide(null);
                        i14 = this.backgroundType;
                        if (i14 != 12) {
                            canvas2 = canvas;
                            alpha = paint2.getAlpha();
                            paint2.setAlpha((int) (f2 * 255.0f));
                            canvas2.drawCircle(fDp2, fDp2, fDp3 * f2, paint2);
                            if (paint2 != paint) {
                                paint2.setAlpha(alpha);
                            }
                        } else {
                            canvas2 = canvas;
                            alpha = paint2.getAlpha();
                            paint2.setAlpha((int) (f2 * 255.0f));
                            canvas2.drawCircle(fDp2, fDp2, fDp3 * f2, paint2);
                            if (paint2 != paint) {
                                paint2.setAlpha(alpha);
                            }
                        }
                        canvas2.restoreToCount(iSave3);
                    }
                    if (this.forbidden) {
                        if (forbidPaint == null) {
                            Paint paint9 = new Paint(1);
                            forbidPaint = paint9;
                            paint9.setStyle(Paint.Style.STROKE);
                            forbidPaint.setStrokeCap(Paint.Cap.ROUND);
                            forbidPaint.setStrokeJoin(Paint.Join.ROUND);
                            Paint paint10 = forbidPaint;
                            float fDp15 = AndroidUtilities.dp(0.66f);
                            float fDp16 = AndroidUtilities.dp(4.0f);
                            float[] fArr3 = new float[2];
                            fArr3[c] = fDp15;
                            fArr3[1] = fDp16;
                            paint10.setPathEffect(new DashPathEffect(fArr3, 0.0f));
                        }
                        forbidPaint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                        forbidPaint.setColor(getThemedColor(Theme.key_switchTrack));
                        canvas2.drawCircle(i, i2, AndroidUtilities.dp(9.0f), forbidPaint);
                    } else if (f8 != 0.0f) {
                        if (this.checkedText != null) {
                            if (this.textPaint == null) {
                                i13 = 1;
                                TextPaint textPaint3 = new TextPaint(1);
                                this.textPaint = textPaint3;
                                textPaint3.setTypeface(AndroidUtilities.bold());
                            } else {
                                i13 = 1;
                            }
                            length = this.checkedText.length();
                            if (length != 0) {
                                f10 = 14.0f;
                                f11 = 18.0f;
                            } else {
                                f10 = 14.0f;
                                f11 = 18.0f;
                            }
                            this.textPaint.setTextSize(AndroidUtilities.dp(f10));
                            this.textPaint.setColor(getThemedColor(this.checkColorKey));
                            canvas2.save();
                            float f310 = i;
                            canvas2.scale(f8, 1.0f, f310, i2);
                            String str3 = this.checkedText;
                            canvas2.drawText(str3, f310 - (this.textPaint.measureText(str3) / f4), AndroidUtilities.dp(f11), this.textPaint);
                            canvas2.restore();
                        } else {
                            this.path.reset();
                            i12 = this.backgroundType;
                            if (i12 == -1) {
                                f9 = 1.4f;
                            } else if (i12 == 5) {
                                f9 = 0.8f;
                            } else {
                                f9 = 1.0f;
                            }
                            float fDp17 = AndroidUtilities.dp(f9 * 9.0f) * f8;
                            float fDp18 = AndroidUtilities.dp(f9 * 4.0f) * f8;
                            int iDp5 = i - AndroidUtilities.dp(f7);
                            int iDp6 = AndroidUtilities.dp(4.0f) + i2;
                            float fSqrt5 = (float) Math.sqrt((fDp18 * fDp18) / f4);
                            float f311 = iDp5;
                            float f312 = iDp6;
                            this.path.moveTo(f311 - fSqrt5, f312 - fSqrt5);
                            this.path.lineTo(f311, f312);
                            float fSqrt6 = (float) Math.sqrt((fDp17 * fDp17) / f4);
                            this.path.lineTo(f311 + fSqrt6, f312 - fSqrt6);
                            if (z) {
                                canvas2.save();
                                float f313 = this.checkScale;
                                canvas2.scale(f313, f313, i, i2);
                                z2 = true;
                            } else {
                                canvas2.save();
                                float f314 = this.checkScale;
                                canvas2.scale(f314, f314, i, i2);
                                z2 = true;
                            }
                            canvas2.drawPath(this.path, this.checkPaint);
                            if (z2) {
                                canvas2.restore();
                            }
                        }
                    }
                }
                if (z) {
                    canvas2.restore();
                }
            }
            i5 = -1;
            c = 0;
            if (this.drawUnchecked) {
                i7 = 8;
                i8 = 10;
                f7 = 1.5f;
            } else {
                i7 = 8;
                i8 = 10;
                f7 = 1.5f;
            }
            paint.setColor(getThemedColor(this.checkColorKey));
            i9 = this.backgroundType;
            if (i9 == i5) {
                i10 = 6;
                f5 = 0.0f;
            } else {
                i10 = 6;
                f5 = 0.0f;
            }
            if (f2 > f5) {
                if (f3 < 0.5f) {
                    f8 = 0.0f;
                } else {
                    f8 = (f3 - 0.5f) / 0.5f;
                }
                i11 = this.backgroundType;
                if (i11 == 9) {
                    paint.setColor(getThemedColor(this.background2ColorKey));
                } else if (i11 != 11) {
                    paint.setColor(getThemedColor(this.backgroundColorKey));
                } else {
                    paint.setColor(getThemedColor(this.backgroundColorKey));
                }
                if (this.forbidden) {
                    paint.setColor(this.backgroundPaint.getColor());
                } else if (this.alpha < f6) {
                    paint.setColor(ColorUtils.blendARGB(this.backgroundPaint.getColor(), paint.getColor(), this.alpha));
                }
                if (this.useDefaultCheck) {
                    this.checkPaint.setColor(getThemedColor(Theme.key_checkboxCheck));
                } else {
                    this.checkPaint.setColor(getThemedColor(Theme.key_checkboxCheck));
                }
                if (this.alpha < f6) {
                    this.checkPaint.setColor(ColorUtils.blendARGB(paint.getColor(), this.checkPaint.getColor(), this.alpha));
                }
                if (this.backgroundType != -1) {
                    fDp2 = AndroidUtilities.dp(this.size) / f4;
                    int iSave4 = canvas2.save();
                    canvas2.translate(i - fDp2, i2 - fDp2);
                    if (f2 < f6) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        canvas2.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.size), AndroidUtilities.dp(this.size), 255, 31);
                    }
                    paint2 = (Paint) this.circlePaintProvider.provide(null);
                    i14 = this.backgroundType;
                    if (i14 != 12) {
                        canvas2 = canvas;
                        alpha = paint2.getAlpha();
                        paint2.setAlpha((int) (f2 * 255.0f));
                        canvas2.drawCircle(fDp2, fDp2, fDp3 * f2, paint2);
                        if (paint2 != paint) {
                            paint2.setAlpha(alpha);
                        }
                    } else {
                        canvas2 = canvas;
                        alpha = paint2.getAlpha();
                        paint2.setAlpha((int) (f2 * 255.0f));
                        canvas2.drawCircle(fDp2, fDp2, fDp3 * f2, paint2);
                        if (paint2 != paint) {
                            paint2.setAlpha(alpha);
                        }
                    }
                    canvas2.restoreToCount(iSave4);
                }
                if (this.forbidden) {
                    if (forbidPaint == null) {
                        Paint paint11 = new Paint(1);
                        forbidPaint = paint11;
                        paint11.setStyle(Paint.Style.STROKE);
                        forbidPaint.setStrokeCap(Paint.Cap.ROUND);
                        forbidPaint.setStrokeJoin(Paint.Join.ROUND);
                        Paint paint12 = forbidPaint;
                        float fDp19 = AndroidUtilities.dp(0.66f);
                        float fDp110 = AndroidUtilities.dp(4.0f);
                        float[] fArr4 = new float[2];
                        fArr4[c] = fDp19;
                        fArr4[1] = fDp110;
                        paint12.setPathEffect(new DashPathEffect(fArr4, 0.0f));
                    }
                    forbidPaint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                    forbidPaint.setColor(getThemedColor(Theme.key_switchTrack));
                    canvas2.drawCircle(i, i2, AndroidUtilities.dp(9.0f), forbidPaint);
                } else if (f8 != 0.0f) {
                    if (this.checkedText != null) {
                        if (this.textPaint == null) {
                            i13 = 1;
                            TextPaint textPaint4 = new TextPaint(1);
                            this.textPaint = textPaint4;
                            textPaint4.setTypeface(AndroidUtilities.bold());
                        } else {
                            i13 = 1;
                        }
                        length = this.checkedText.length();
                        if (length != 0) {
                            f10 = 14.0f;
                            f11 = 18.0f;
                        } else {
                            f10 = 14.0f;
                            f11 = 18.0f;
                        }
                        this.textPaint.setTextSize(AndroidUtilities.dp(f10));
                        this.textPaint.setColor(getThemedColor(this.checkColorKey));
                        canvas2.save();
                        float f315 = i;
                        canvas2.scale(f8, 1.0f, f315, i2);
                        String str4 = this.checkedText;
                        canvas2.drawText(str4, f315 - (this.textPaint.measureText(str4) / f4), AndroidUtilities.dp(f11), this.textPaint);
                        canvas2.restore();
                    } else {
                        this.path.reset();
                        i12 = this.backgroundType;
                        if (i12 == -1) {
                            f9 = 1.4f;
                        } else if (i12 == 5) {
                            f9 = 0.8f;
                        } else {
                            f9 = 1.0f;
                        }
                        float fDp111 = AndroidUtilities.dp(f9 * 9.0f) * f8;
                        float fDp112 = AndroidUtilities.dp(f9 * 4.0f) * f8;
                        int iDp7 = i - AndroidUtilities.dp(f7);
                        int iDp8 = AndroidUtilities.dp(4.0f) + i2;
                        float fSqrt7 = (float) Math.sqrt((fDp112 * fDp112) / f4);
                        float f316 = iDp7;
                        float f317 = iDp8;
                        this.path.moveTo(f316 - fSqrt7, f317 - fSqrt7);
                        this.path.lineTo(f316, f317);
                        float fSqrt8 = (float) Math.sqrt((fDp111 * fDp111) / f4);
                        this.path.lineTo(f316 + fSqrt8, f317 - fSqrt8);
                        if (z) {
                            canvas2.save();
                            float f318 = this.checkScale;
                            canvas2.scale(f318, f318, i, i2);
                            z2 = true;
                        } else {
                            canvas2.save();
                            float f319 = this.checkScale;
                            canvas2.scale(f319, f319, i, i2);
                            z2 = true;
                        }
                        canvas2.drawPath(this.path, this.checkPaint);
                        if (z2) {
                            canvas2.restore();
                        }
                    }
                }
            }
            if (z) {
                canvas2.restore();
            }
        }
        fDp = fDp3;
        if (this.forbidden) {
            f = 1.0f;
        } else {
            f = this.progress;
        }
        if (f >= 0.5f) {
            f2 = 1.0f;
        } else {
            f2 = f / 0.5f;
        }
        iCenterX = this.bounds.centerX();
        iCenterY = this.bounds.centerY();
        if (this.cutCheck) {
            z = false;
        } else {
            z = false;
        }
        if (z) {
            float f110 = iCenterX;
            float f111 = f;
            float f112 = f110 - fDp3;
            float f113 = iCenterY;
            float f114 = f113 - fDp3;
            float f115 = f110 + fDp3;
            float f116 = f113 + fDp3;
            f3 = f111;
            i = iCenterX;
            i2 = iCenterY;
            i3 = 12;
            f4 = 2.0f;
            f5 = 0.0f;
            f6 = 1.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(f112, f114, f115, f116, 255, 31);
        } else {
            f3 = f;
            i = iCenterX;
            i2 = iCenterY;
            i3 = 12;
            f4 = 2.0f;
            f5 = 0.0f;
            f6 = 1.0f;
            canvas2 = canvas;
        }
        i4 = this.backgroundColorKey;
        if (i4 >= 0) {
            if (this.drawUnchecked) {
                i22 = this.backgroundType;
                if (i22 != i3) {
                    paint.setColor(getThemedColor(i4));
                    paint.setAlpha((int) (this.backgroundAlpha * 255.0f));
                    this.backgroundPaint.setColor(getThemedColor(this.checkColorKey));
                } else {
                    paint.setColor(getThemedColor(i4));
                    paint.setAlpha((int) (this.backgroundAlpha * 255.0f));
                    this.backgroundPaint.setColor(getThemedColor(this.checkColorKey));
                }
            } else {
                Paint paint13 = this.backgroundPaint;
                i21 = this.background2ColorKey;
                if (i21 < 0) {
                    i21 = this.checkColorKey;
                }
                paint13.setColor(AndroidUtilities.getOffsetColor(16777215, getThemedColor(i21), f3, this.backgroundAlpha));
            }
        } else {
            if (this.drawUnchecked) {
                paint.setColor(Color.argb((int) (this.backgroundAlpha * 25.0f), 0, 0, 0));
                if (this.backgroundType == 8) {
                    this.backgroundPaint.setColor(getThemedColor(this.background2ColorKey));
                } else {
                    i5 = -1;
                    this.backgroundPaint.setColor(AndroidUtilities.getOffsetColor(-1, getThemedColor(this.checkColorKey), f3, this.backgroundAlpha));
                }
            } else {
                i5 = -1;
                if (this.backgroundColor != 0) {
                    this.backgroundPaint.setColor(0);
                } else {
                    Paint paint14 = this.backgroundPaint;
                    i6 = this.background2ColorKey;
                    if (i6 < 0) {
                        i6 = this.checkColorKey;
                    }
                    c = 0;
                    paint14.setColor(AndroidUtilities.getOffsetColor(16777215, getThemedColor(i6), f3, this.backgroundAlpha));
                }
                if (this.drawUnchecked) {
                    i7 = 8;
                    i8 = 10;
                    f7 = 1.5f;
                } else {
                    i7 = 8;
                    i8 = 10;
                    f7 = 1.5f;
                }
                paint.setColor(getThemedColor(this.checkColorKey));
                i9 = this.backgroundType;
                if (i9 == i5) {
                    i10 = 6;
                    f5 = 0.0f;
                } else {
                    i10 = 6;
                    f5 = 0.0f;
                }
                if (f2 > f5) {
                    if (f3 < 0.5f) {
                        f8 = 0.0f;
                    } else {
                        f8 = (f3 - 0.5f) / 0.5f;
                    }
                    i11 = this.backgroundType;
                    if (i11 == 9) {
                        paint.setColor(getThemedColor(this.background2ColorKey));
                    } else if (i11 != 11) {
                        paint.setColor(getThemedColor(this.backgroundColorKey));
                    } else {
                        paint.setColor(getThemedColor(this.backgroundColorKey));
                    }
                    if (this.forbidden) {
                        paint.setColor(this.backgroundPaint.getColor());
                    } else if (this.alpha < f6) {
                        paint.setColor(ColorUtils.blendARGB(this.backgroundPaint.getColor(), paint.getColor(), this.alpha));
                    }
                    if (this.useDefaultCheck) {
                        this.checkPaint.setColor(getThemedColor(Theme.key_checkboxCheck));
                    } else {
                        this.checkPaint.setColor(getThemedColor(Theme.key_checkboxCheck));
                    }
                    if (this.alpha < f6) {
                        this.checkPaint.setColor(ColorUtils.blendARGB(paint.getColor(), this.checkPaint.getColor(), this.alpha));
                    }
                    if (this.backgroundType != -1) {
                        fDp2 = AndroidUtilities.dp(this.size) / f4;
                        int iSave5 = canvas2.save();
                        canvas2.translate(i - fDp2, i2 - fDp2);
                        if (f2 < f6) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            canvas2.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.size), AndroidUtilities.dp(this.size), 255, 31);
                        }
                        paint2 = (Paint) this.circlePaintProvider.provide(null);
                        i14 = this.backgroundType;
                        if (i14 != 12) {
                            canvas2 = canvas;
                            alpha = paint2.getAlpha();
                            paint2.setAlpha((int) (f2 * 255.0f));
                            canvas2.drawCircle(fDp2, fDp2, fDp3 * f2, paint2);
                            if (paint2 != paint) {
                                paint2.setAlpha(alpha);
                            }
                        } else {
                            canvas2 = canvas;
                            alpha = paint2.getAlpha();
                            paint2.setAlpha((int) (f2 * 255.0f));
                            canvas2.drawCircle(fDp2, fDp2, fDp3 * f2, paint2);
                            if (paint2 != paint) {
                                paint2.setAlpha(alpha);
                            }
                        }
                        canvas2.restoreToCount(iSave5);
                    }
                    if (this.forbidden) {
                        if (forbidPaint == null) {
                            Paint paint15 = new Paint(1);
                            forbidPaint = paint15;
                            paint15.setStyle(Paint.Style.STROKE);
                            forbidPaint.setStrokeCap(Paint.Cap.ROUND);
                            forbidPaint.setStrokeJoin(Paint.Join.ROUND);
                            Paint paint16 = forbidPaint;
                            float fDp113 = AndroidUtilities.dp(0.66f);
                            float fDp114 = AndroidUtilities.dp(4.0f);
                            float[] fArr5 = new float[2];
                            fArr5[c] = fDp113;
                            fArr5[1] = fDp114;
                            paint16.setPathEffect(new DashPathEffect(fArr5, 0.0f));
                        }
                        forbidPaint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                        forbidPaint.setColor(getThemedColor(Theme.key_switchTrack));
                        canvas2.drawCircle(i, i2, AndroidUtilities.dp(9.0f), forbidPaint);
                    } else if (f8 != 0.0f) {
                        if (this.checkedText != null) {
                            if (this.textPaint == null) {
                                i13 = 1;
                                TextPaint textPaint5 = new TextPaint(1);
                                this.textPaint = textPaint5;
                                textPaint5.setTypeface(AndroidUtilities.bold());
                            } else {
                                i13 = 1;
                            }
                            length = this.checkedText.length();
                            if (length != 0) {
                                f10 = 14.0f;
                                f11 = 18.0f;
                            } else {
                                f10 = 14.0f;
                                f11 = 18.0f;
                            }
                            this.textPaint.setTextSize(AndroidUtilities.dp(f10));
                            this.textPaint.setColor(getThemedColor(this.checkColorKey));
                            canvas2.save();
                            float f3110 = i;
                            canvas2.scale(f8, 1.0f, f3110, i2);
                            String str5 = this.checkedText;
                            canvas2.drawText(str5, f3110 - (this.textPaint.measureText(str5) / f4), AndroidUtilities.dp(f11), this.textPaint);
                            canvas2.restore();
                        } else {
                            this.path.reset();
                            i12 = this.backgroundType;
                            if (i12 == -1) {
                                f9 = 1.4f;
                            } else if (i12 == 5) {
                                f9 = 0.8f;
                            } else {
                                f9 = 1.0f;
                            }
                            float fDp115 = AndroidUtilities.dp(f9 * 9.0f) * f8;
                            float fDp116 = AndroidUtilities.dp(f9 * 4.0f) * f8;
                            int iDp9 = i - AndroidUtilities.dp(f7);
                            int iDp10 = AndroidUtilities.dp(4.0f) + i2;
                            float fSqrt9 = (float) Math.sqrt((fDp116 * fDp116) / f4);
                            float f3111 = iDp9;
                            float f3112 = iDp10;
                            this.path.moveTo(f3111 - fSqrt9, f3112 - fSqrt9);
                            this.path.lineTo(f3111, f3112);
                            float fSqrt10 = (float) Math.sqrt((fDp115 * fDp115) / f4);
                            this.path.lineTo(f3111 + fSqrt10, f3112 - fSqrt10);
                            if (z) {
                                canvas2.save();
                                float f3113 = this.checkScale;
                                canvas2.scale(f3113, f3113, i, i2);
                                z2 = true;
                            } else {
                                canvas2.save();
                                float f3114 = this.checkScale;
                                canvas2.scale(f3114, f3114, i, i2);
                                z2 = true;
                            }
                            canvas2.drawPath(this.path, this.checkPaint);
                            if (z2) {
                                canvas2.restore();
                            }
                        }
                    }
                }
                if (z) {
                    canvas2.restore();
                }
            }
            c = 0;
            if (this.drawUnchecked) {
                i7 = 8;
                i8 = 10;
                f7 = 1.5f;
            } else {
                i7 = 8;
                i8 = 10;
                f7 = 1.5f;
            }
            paint.setColor(getThemedColor(this.checkColorKey));
            i9 = this.backgroundType;
            if (i9 == i5) {
                i10 = 6;
                f5 = 0.0f;
            } else {
                i10 = 6;
                f5 = 0.0f;
            }
            if (f2 > f5) {
                if (f3 < 0.5f) {
                    f8 = 0.0f;
                } else {
                    f8 = (f3 - 0.5f) / 0.5f;
                }
                i11 = this.backgroundType;
                if (i11 == 9) {
                    paint.setColor(getThemedColor(this.background2ColorKey));
                } else if (i11 != 11) {
                    paint.setColor(getThemedColor(this.backgroundColorKey));
                } else {
                    paint.setColor(getThemedColor(this.backgroundColorKey));
                }
                if (this.forbidden) {
                    paint.setColor(this.backgroundPaint.getColor());
                } else if (this.alpha < f6) {
                    paint.setColor(ColorUtils.blendARGB(this.backgroundPaint.getColor(), paint.getColor(), this.alpha));
                }
                if (this.useDefaultCheck) {
                    this.checkPaint.setColor(getThemedColor(Theme.key_checkboxCheck));
                } else {
                    this.checkPaint.setColor(getThemedColor(Theme.key_checkboxCheck));
                }
                if (this.alpha < f6) {
                    this.checkPaint.setColor(ColorUtils.blendARGB(paint.getColor(), this.checkPaint.getColor(), this.alpha));
                }
                if (this.backgroundType != -1) {
                    fDp2 = AndroidUtilities.dp(this.size) / f4;
                    int iSave6 = canvas2.save();
                    canvas2.translate(i - fDp2, i2 - fDp2);
                    if (f2 < f6) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        canvas2.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.size), AndroidUtilities.dp(this.size), 255, 31);
                    }
                    paint2 = (Paint) this.circlePaintProvider.provide(null);
                    i14 = this.backgroundType;
                    if (i14 != 12) {
                        canvas2 = canvas;
                        alpha = paint2.getAlpha();
                        paint2.setAlpha((int) (f2 * 255.0f));
                        canvas2.drawCircle(fDp2, fDp2, fDp3 * f2, paint2);
                        if (paint2 != paint) {
                            paint2.setAlpha(alpha);
                        }
                    } else {
                        canvas2 = canvas;
                        alpha = paint2.getAlpha();
                        paint2.setAlpha((int) (f2 * 255.0f));
                        canvas2.drawCircle(fDp2, fDp2, fDp3 * f2, paint2);
                        if (paint2 != paint) {
                            paint2.setAlpha(alpha);
                        }
                    }
                    canvas2.restoreToCount(iSave6);
                }
                if (this.forbidden) {
                    if (forbidPaint == null) {
                        Paint paint17 = new Paint(1);
                        forbidPaint = paint17;
                        paint17.setStyle(Paint.Style.STROKE);
                        forbidPaint.setStrokeCap(Paint.Cap.ROUND);
                        forbidPaint.setStrokeJoin(Paint.Join.ROUND);
                        Paint paint18 = forbidPaint;
                        float fDp117 = AndroidUtilities.dp(0.66f);
                        float fDp118 = AndroidUtilities.dp(4.0f);
                        float[] fArr6 = new float[2];
                        fArr6[c] = fDp117;
                        fArr6[1] = fDp118;
                        paint18.setPathEffect(new DashPathEffect(fArr6, 0.0f));
                    }
                    forbidPaint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                    forbidPaint.setColor(getThemedColor(Theme.key_switchTrack));
                    canvas2.drawCircle(i, i2, AndroidUtilities.dp(9.0f), forbidPaint);
                } else if (f8 != 0.0f) {
                    if (this.checkedText != null) {
                        if (this.textPaint == null) {
                            i13 = 1;
                            TextPaint textPaint6 = new TextPaint(1);
                            this.textPaint = textPaint6;
                            textPaint6.setTypeface(AndroidUtilities.bold());
                        } else {
                            i13 = 1;
                        }
                        length = this.checkedText.length();
                        if (length != 0) {
                            f10 = 14.0f;
                            f11 = 18.0f;
                        } else {
                            f10 = 14.0f;
                            f11 = 18.0f;
                        }
                        this.textPaint.setTextSize(AndroidUtilities.dp(f10));
                        this.textPaint.setColor(getThemedColor(this.checkColorKey));
                        canvas2.save();
                        float f3115 = i;
                        canvas2.scale(f8, 1.0f, f3115, i2);
                        String str6 = this.checkedText;
                        canvas2.drawText(str6, f3115 - (this.textPaint.measureText(str6) / f4), AndroidUtilities.dp(f11), this.textPaint);
                        canvas2.restore();
                    } else {
                        this.path.reset();
                        i12 = this.backgroundType;
                        if (i12 == -1) {
                            f9 = 1.4f;
                        } else if (i12 == 5) {
                            f9 = 0.8f;
                        } else {
                            f9 = 1.0f;
                        }
                        float fDp119 = AndroidUtilities.dp(f9 * 9.0f) * f8;
                        float fDp1110 = AndroidUtilities.dp(f9 * 4.0f) * f8;
                        int iDp11 = i - AndroidUtilities.dp(f7);
                        int iDp12 = AndroidUtilities.dp(4.0f) + i2;
                        float fSqrt11 = (float) Math.sqrt((fDp1110 * fDp1110) / f4);
                        float f3116 = iDp11;
                        float f3117 = iDp12;
                        this.path.moveTo(f3116 - fSqrt11, f3117 - fSqrt11);
                        this.path.lineTo(f3116, f3117);
                        float fSqrt12 = (float) Math.sqrt((fDp119 * fDp119) / f4);
                        this.path.lineTo(f3116 + fSqrt12, f3117 - fSqrt12);
                        if (z) {
                            canvas2.save();
                            float f3118 = this.checkScale;
                            canvas2.scale(f3118, f3118, i, i2);
                            z2 = true;
                        } else {
                            canvas2.save();
                            float f3119 = this.checkScale;
                            canvas2.scale(f3119, f3119, i, i2);
                            z2 = true;
                        }
                        canvas2.drawPath(this.path, this.checkPaint);
                        if (z2) {
                            canvas2.restore();
                        }
                    }
                }
            }
            if (z) {
                canvas2.restore();
            }
        }
        i5 = -1;
        c = 0;
        if (this.drawUnchecked) {
            i7 = 8;
            i8 = 10;
            f7 = 1.5f;
        } else {
            i7 = 8;
            i8 = 10;
            f7 = 1.5f;
        }
        paint.setColor(getThemedColor(this.checkColorKey));
        i9 = this.backgroundType;
        if (i9 == i5) {
            i10 = 6;
            f5 = 0.0f;
        } else {
            i10 = 6;
            f5 = 0.0f;
        }
        if (f2 > f5) {
            if (f3 < 0.5f) {
                f8 = 0.0f;
            } else {
                f8 = (f3 - 0.5f) / 0.5f;
            }
            i11 = this.backgroundType;
            if (i11 == 9) {
                paint.setColor(getThemedColor(this.background2ColorKey));
            } else if (i11 != 11) {
                paint.setColor(getThemedColor(this.backgroundColorKey));
            } else {
                paint.setColor(getThemedColor(this.backgroundColorKey));
            }
            if (this.forbidden) {
                paint.setColor(this.backgroundPaint.getColor());
            } else if (this.alpha < f6) {
                paint.setColor(ColorUtils.blendARGB(this.backgroundPaint.getColor(), paint.getColor(), this.alpha));
            }
            if (this.useDefaultCheck) {
                this.checkPaint.setColor(getThemedColor(Theme.key_checkboxCheck));
            } else {
                this.checkPaint.setColor(getThemedColor(Theme.key_checkboxCheck));
            }
            if (this.alpha < f6) {
                this.checkPaint.setColor(ColorUtils.blendARGB(paint.getColor(), this.checkPaint.getColor(), this.alpha));
            }
            if (this.backgroundType != -1) {
                fDp2 = AndroidUtilities.dp(this.size) / f4;
                int iSave7 = canvas2.save();
                canvas2.translate(i - fDp2, i2 - fDp2);
                if (f2 < f6) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.size), AndroidUtilities.dp(this.size), 255, 31);
                }
                paint2 = (Paint) this.circlePaintProvider.provide(null);
                i14 = this.backgroundType;
                if (i14 != 12) {
                    canvas2 = canvas;
                    alpha = paint2.getAlpha();
                    paint2.setAlpha((int) (f2 * 255.0f));
                    canvas2.drawCircle(fDp2, fDp2, fDp3 * f2, paint2);
                    if (paint2 != paint) {
                        paint2.setAlpha(alpha);
                    }
                } else {
                    canvas2 = canvas;
                    alpha = paint2.getAlpha();
                    paint2.setAlpha((int) (f2 * 255.0f));
                    canvas2.drawCircle(fDp2, fDp2, fDp3 * f2, paint2);
                    if (paint2 != paint) {
                        paint2.setAlpha(alpha);
                    }
                }
                canvas2.restoreToCount(iSave7);
            }
            if (this.forbidden) {
                if (forbidPaint == null) {
                    Paint paint19 = new Paint(1);
                    forbidPaint = paint19;
                    paint19.setStyle(Paint.Style.STROKE);
                    forbidPaint.setStrokeCap(Paint.Cap.ROUND);
                    forbidPaint.setStrokeJoin(Paint.Join.ROUND);
                    Paint paint110 = forbidPaint;
                    float fDp1111 = AndroidUtilities.dp(0.66f);
                    float fDp1112 = AndroidUtilities.dp(4.0f);
                    float[] fArr7 = new float[2];
                    fArr7[c] = fDp1111;
                    fArr7[1] = fDp1112;
                    paint110.setPathEffect(new DashPathEffect(fArr7, 0.0f));
                }
                forbidPaint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                forbidPaint.setColor(getThemedColor(Theme.key_switchTrack));
                canvas2.drawCircle(i, i2, AndroidUtilities.dp(9.0f), forbidPaint);
            } else if (f8 != 0.0f) {
                if (this.checkedText != null) {
                    if (this.textPaint == null) {
                        i13 = 1;
                        TextPaint textPaint7 = new TextPaint(1);
                        this.textPaint = textPaint7;
                        textPaint7.setTypeface(AndroidUtilities.bold());
                    } else {
                        i13 = 1;
                    }
                    length = this.checkedText.length();
                    if (length != 0) {
                        f10 = 14.0f;
                        f11 = 18.0f;
                    } else {
                        f10 = 14.0f;
                        f11 = 18.0f;
                    }
                    this.textPaint.setTextSize(AndroidUtilities.dp(f10));
                    this.textPaint.setColor(getThemedColor(this.checkColorKey));
                    canvas2.save();
                    float f31110 = i;
                    canvas2.scale(f8, 1.0f, f31110, i2);
                    String str7 = this.checkedText;
                    canvas2.drawText(str7, f31110 - (this.textPaint.measureText(str7) / f4), AndroidUtilities.dp(f11), this.textPaint);
                    canvas2.restore();
                } else {
                    this.path.reset();
                    i12 = this.backgroundType;
                    if (i12 == -1) {
                        f9 = 1.4f;
                    } else if (i12 == 5) {
                        f9 = 0.8f;
                    } else {
                        f9 = 1.0f;
                    }
                    float fDp1113 = AndroidUtilities.dp(f9 * 9.0f) * f8;
                    float fDp1114 = AndroidUtilities.dp(f9 * 4.0f) * f8;
                    int iDp13 = i - AndroidUtilities.dp(f7);
                    int iDp14 = AndroidUtilities.dp(4.0f) + i2;
                    float fSqrt13 = (float) Math.sqrt((fDp1114 * fDp1114) / f4);
                    float f31111 = iDp13;
                    float f31112 = iDp14;
                    this.path.moveTo(f31111 - fSqrt13, f31112 - fSqrt13);
                    this.path.lineTo(f31111, f31112);
                    float fSqrt14 = (float) Math.sqrt((fDp1113 * fDp1113) / f4);
                    this.path.lineTo(f31111 + fSqrt14, f31112 - fSqrt14);
                    if (z) {
                        canvas2.save();
                        float f31113 = this.checkScale;
                        canvas2.scale(f31113, f31113, i, i2);
                        z2 = true;
                    } else {
                        canvas2.save();
                        float f31114 = this.checkScale;
                        canvas2.scale(f31114, f31114, i, i2);
                        z2 = true;
                    }
                    canvas2.drawPath(this.path, this.checkPaint);
                    if (z2) {
                        canvas2.restore();
                    }
                }
            }
        }
        if (z) {
            canvas2.restore();
        }
    }

    public void setCirclePaintProvider(GenericProvider genericProvider) {
        if (this.circlePaintProvider == genericProvider) {
            return;
        }
        this.circlePaintProvider = genericProvider;
        invalidate();
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
