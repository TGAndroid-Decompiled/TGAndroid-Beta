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

    public static Paint lambda$new$0(Void r0) {
        return paint;
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
                return CheckBoxBase.lambda$new$0((Void) obj);
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
        float f;
        float fDp;
        float f2;
        float f3;
        int iCenterX;
        int iCenterY;
        boolean z;
        float f4;
        int i;
        int i2;
        float f5;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f6;
        int i8;
        float f7;
        int i9;
        float f8;
        float f9;
        boolean z2;
        int i10;
        int length;
        float f10;
        float f11;
        float fDp2;
        boolean z3;
        Paint paint2;
        int i11;
        int alpha;
        int i12;
        MessageDrawable messageDrawable;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        float fDp3 = AndroidUtilities.dp(this.size / 2.0f);
        int i19 = this.backgroundType;
        if (i19 == 12 || i19 == 13) {
            fDp3 = AndroidUtilities.dp(10.0f);
        } else {
            if (i19 != 0 && i19 != 11) {
                f = fDp3;
                fDp = fDp3 - AndroidUtilities.dp(0.2f);
            }
            if (this.forbidden) {
                f2 = 1.0f;
            } else {
                f2 = this.progress;
            }
            if (f2 >= 0.5f) {
                f3 = 1.0f;
            } else {
                f3 = f2 / 0.5f;
            }
            iCenterX = this.bounds.centerX();
            iCenterY = this.bounds.centerY();
            if (this.cutCheck || f3 <= 0.0f || f2 < 0.5f || this.forbidden || this.checkedText != null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                float f12 = iCenterX;
                float f13 = iCenterY;
                f5 = 1.0f;
                f4 = f2;
                i = 12;
                i2 = 13;
                canvas.saveLayerAlpha(f12 - f, f13 - f, f12 + f, f13 + f, 255, 31);
            } else {
                f4 = f2;
                i = 12;
                i2 = 13;
                f5 = 1.0f;
            }
            i3 = this.backgroundColorKey;
            if (i3 >= 0) {
                if (this.drawUnchecked) {
                    i18 = this.backgroundType;
                    if (i18 != i || i18 == i2) {
                        paint.setColor(getThemedColor(i3));
                        paint.setAlpha((int) (this.backgroundAlpha * 255.0f));
                        this.backgroundPaint.setColor(getThemedColor(this.checkColorKey));
                    } else if (i18 == 6 || i18 == 7) {
                        paint.setColor(getThemedColor(this.background2ColorKey));
                        this.backgroundPaint.setColor(getThemedColor(this.checkColorKey));
                    } else if (i18 == 10 || i18 == 14) {
                        this.backgroundPaint.setColor(getThemedColor(this.background2ColorKey));
                    } else {
                        paint.setColor((16777215 & Theme.getServiceMessageColor()) | 671088640);
                        this.backgroundPaint.setColor(getThemedColor(this.checkColorKey));
                    }
                } else {
                    Paint paint3 = this.backgroundPaint;
                    i17 = this.background2ColorKey;
                    if (i17 < 0) {
                        i17 = this.checkColorKey;
                    }
                    paint3.setColor(AndroidUtilities.getOffsetColor(16777215, getThemedColor(i17), f4, this.backgroundAlpha));
                }
            } else if (this.drawUnchecked) {
                paint.setColor(Color.argb((int) (this.backgroundAlpha * 25.0f), 0, 0, 0));
                if (this.backgroundType == 8) {
                    this.backgroundPaint.setColor(getThemedColor(this.background2ColorKey));
                } else {
                    this.backgroundPaint.setColor(AndroidUtilities.getOffsetColor(-1, getThemedColor(this.checkColorKey), f4, this.backgroundAlpha));
                }
            } else if (this.backgroundColor != 0) {
                this.backgroundPaint.setColor(0);
            } else {
                Paint paint4 = this.backgroundPaint;
                i4 = this.background2ColorKey;
                if (i4 < 0) {
                    i4 = this.checkColorKey;
                }
                paint4.setColor(AndroidUtilities.getOffsetColor(16777215, getThemedColor(i4), f4, this.backgroundAlpha));
            }
            if (this.drawUnchecked || (i16 = this.backgroundType) < 0 || i16 == i || i16 == i2) {
                i5 = -1;
                i6 = 7;
            } else if (i16 != 8 && i16 != 10 && i16 != 14) {
                if (i16 == 6 || i16 == 7) {
                    float f14 = iCenterX;
                    float f15 = iCenterY;
                    canvas.drawCircle(f14, f15, f - AndroidUtilities.dp(f5), paint);
                    canvas.drawCircle(f14, f15, f - AndroidUtilities.dp(1.5f), this.backgroundPaint);
                } else {
                    canvas.drawCircle(iCenterX, iCenterY, f, paint);
                }
                i5 = -1;
                i6 = 7;
            } else if (this.customRadius > 0.0f) {
                float fDp4 = f - AndroidUtilities.dp(1.5f);
                float fLerp = AndroidUtilities.lerp(fDp4, this.customRadius, this.customRadiusFactor);
                float f16 = iCenterX;
                float f17 = iCenterY;
                i6 = 7;
                i5 = -1;
                canvas.drawRoundRect(f16 - fDp4, f17 - fDp4, f16 + fDp4, f17 + fDp4, fLerp, fLerp, this.backgroundPaint);
            } else {
                i5 = -1;
                i6 = 7;
                canvas.drawCircle(iCenterX, iCenterY, f - AndroidUtilities.dp(1.5f), this.backgroundPaint);
            }
            paint.setColor(getThemedColor(this.checkColorKey));
            i7 = this.backgroundType;
            if (i7 != i5 && i7 != i6 && i7 != 8 && i7 != 9 && i7 != 10 && i7 != 14) {
                if (i7 != 12 || i7 == 13) {
                    this.backgroundPaint.setStyle(Paint.Style.FILL);
                    messageDrawable = this.messageDrawable;
                    if (messageDrawable == null && messageDrawable.hasGradient()) {
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
                    canvas.drawCircle(iCenterX, iCenterY, (f - AndroidUtilities.dp(f5)) * this.backgroundAlpha, this.backgroundPaint);
                    this.backgroundPaint.setStyle(Paint.Style.STROKE);
                } else if (i7 == 0 || i7 == 11) {
                    canvas.drawCircle(iCenterX, iCenterY, f, this.backgroundPaint);
                } else {
                    float f18 = iCenterX;
                    float f19 = iCenterY;
                    this.rect.set(f18 - fDp, f19 - fDp, f18 + fDp, f19 + fDp);
                    int i20 = this.backgroundType;
                    if (i20 == 6) {
                        i13 = (int) (f4 * (-360.0f));
                        i14 = 0;
                    } else if (i20 == 1) {
                        i14 = -90;
                        i13 = (int) (f4 * (-270.0f));
                    } else {
                        int i21 = (int) (f4 * 270.0f);
                        if (LocaleController.isRTL) {
                            i21 = -i21;
                        }
                        i13 = i21;
                        i14 = 90;
                    }
                    if (i20 == 6) {
                        int themedColor = getThemedColor(this.strokeBackgroundKey);
                        int iAlpha = Color.alpha(themedColor);
                        this.backgroundPaint.setColor(themedColor);
                        this.backgroundPaint.setAlpha((int) (iAlpha * f4));
                        i15 = i13;
                        canvas.drawArc(this.rect, i14, i13, false, this.backgroundPaint);
                        int themedColor2 = getThemedColor(Theme.key_chat_attachPhotoBackground);
                        int iAlpha2 = Color.alpha(themedColor2);
                        this.backgroundPaint.setColor(themedColor2);
                        this.backgroundPaint.setAlpha((int) (iAlpha2 * f4));
                    } else {
                        i15 = i13;
                    }
                    canvas.drawArc(this.rect, i14, i15, false, this.backgroundPaint);
                }
            }
            if (f3 > 0.0f) {
                if (f4 < 0.5f) {
                    f6 = 0.0f;
                } else {
                    f6 = (f4 - 0.5f) / 0.5f;
                }
                i8 = this.backgroundType;
                if (i8 == 9) {
                    paint.setColor(getThemedColor(this.background2ColorKey));
                } else if (i8 != 11 || i8 == 6 || i8 == 7 || i8 == 10 || ((!this.drawUnchecked && this.backgroundColorKey >= 0) || i8 == 14)) {
                    paint.setColor(getThemedColor(this.backgroundColorKey));
                } else {
                    int i22 = this.backgroundColor;
                    if (i22 != 0) {
                        paint.setColor(i22);
                    } else {
                        paint.setColor(getThemedColor(this.enabled ? Theme.key_checkbox : Theme.key_checkboxDisabled));
                    }
                }
                if (this.forbidden) {
                    paint.setColor(this.backgroundPaint.getColor());
                    f7 = 1.0f;
                } else {
                    f7 = 1.0f;
                    if (this.alpha < 1.0f) {
                        paint.setColor(ColorUtils.blendARGB(this.backgroundPaint.getColor(), paint.getColor(), this.alpha));
                    }
                }
                if (this.useDefaultCheck && (i12 = this.checkColorKey) >= 0) {
                    this.checkPaint.setColor(getThemedColor(i12));
                } else {
                    this.checkPaint.setColor(getThemedColor(Theme.key_checkboxCheck));
                }
                if (this.alpha < f7 && Theme.isCurrentThemeDark()) {
                    this.checkPaint.setColor(ColorUtils.blendARGB(paint.getColor(), this.checkPaint.getColor(), this.alpha));
                }
                if (this.backgroundType != -1) {
                    fDp2 = AndroidUtilities.dp(this.size) / 2.0f;
                    int iSave = canvas.save();
                    canvas.translate(iCenterX - fDp2, iCenterY - fDp2);
                    if (f3 < f7) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.size), AndroidUtilities.dp(this.size), 255, 31);
                    }
                    paint2 = (Paint) this.circlePaintProvider.provide(null);
                    i11 = this.backgroundType;
                    if (i11 != 12 || i11 == 13) {
                        alpha = paint2.getAlpha();
                        paint2.setAlpha((int) (f3 * 255.0f));
                        canvas.drawCircle(fDp2, fDp2, f * f3, paint2);
                        if (paint2 != paint) {
                            paint2.setAlpha(alpha);
                        }
                    } else if (this.customRadius > 0.0f) {
                        float fDp5 = f - AndroidUtilities.dp(0.5f);
                        float fLerp2 = AndroidUtilities.lerp(fDp5, this.customRadius, this.customRadiusFactor);
                        float f20 = fDp2 - fDp5;
                        float f21 = fDp2 + fDp5;
                        canvas.drawRoundRect(f20, f20, f21, f21, fLerp2, fLerp2, paint2);
                        float f22 = fDp5 * (f7 - f3);
                        float fLerp3 = AndroidUtilities.lerp(f22, this.customRadius, this.customRadiusFactor);
                        if (z3 && f22 > 0.0f) {
                            float f23 = fDp2 - f22;
                            float f24 = fDp2 + f22;
                            canvas.drawRoundRect(f23, f23, f24, f24, fLerp3, fLerp3, Theme.PAINT_CLEAR);
                        }
                    } else {
                        float fDp6 = f - AndroidUtilities.dp(0.5f);
                        canvas.drawCircle(fDp2, fDp2, fDp6, paint2);
                        float f25 = fDp6 * (f7 - f3);
                        if (z3 && f25 > 0.0f) {
                            canvas.drawCircle(fDp2, fDp2, f25, Theme.PAINT_CLEAR);
                        }
                    }
                    canvas.restoreToCount(iSave);
                }
                if (this.forbidden) {
                    if (forbidPaint == null) {
                        Paint paint5 = new Paint(1);
                        forbidPaint = paint5;
                        paint5.setStyle(Paint.Style.STROKE);
                        forbidPaint.setStrokeCap(Paint.Cap.ROUND);
                        forbidPaint.setStrokeJoin(Paint.Join.ROUND);
                        forbidPaint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f)}, 0.0f));
                    }
                    forbidPaint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                    forbidPaint.setColor(getThemedColor(Theme.key_switchTrack));
                    canvas.drawCircle(iCenterX, iCenterY, AndroidUtilities.dp(9.0f), forbidPaint);
                } else if (f6 != 0.0f) {
                    if (this.checkedText != null) {
                        if (this.textPaint == null) {
                            i10 = 1;
                            TextPaint textPaint = new TextPaint(1);
                            this.textPaint = textPaint;
                            textPaint.setTypeface(AndroidUtilities.bold());
                        } else {
                            i10 = 1;
                        }
                        length = this.checkedText.length();
                        if (length != 0 || length == i10 || length == 2) {
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
                        canvas.save();
                        float f26 = iCenterX;
                        canvas.scale(f6, f7, f26, iCenterY);
                        String str = this.checkedText;
                        canvas.drawText(str, f26 - (this.textPaint.measureText(str) / 2.0f), AndroidUtilities.dp(f11), this.textPaint);
                        canvas.restore();
                    } else {
                        this.path.reset();
                        i9 = this.backgroundType;
                        if (i9 == -1) {
                            f9 = 1.4f;
                        } else {
                            if (i9 == 5) {
                                f9 = 0.8f;
                            } else {
                                f8 = 9.0f;
                                f9 = 1.0f;
                            }
                            float fDp7 = AndroidUtilities.dp(f8 * f9) * f6;
                            float fDp8 = AndroidUtilities.dp(f9 * 4.0f) * f6;
                            int iDp = iCenterX - AndroidUtilities.dp(1.5f);
                            int iDp2 = AndroidUtilities.dp(4.0f) + iCenterY;
                            float fSqrt = (float) Math.sqrt((fDp8 * fDp8) / 2.0f);
                            float f27 = iDp;
                            float f28 = iDp2;
                            this.path.moveTo(f27 - fSqrt, f28 - fSqrt);
                            this.path.lineTo(f27, f28);
                            float fSqrt2 = (float) Math.sqrt((fDp7 * fDp7) / 2.0f);
                            this.path.lineTo(f27 + fSqrt2, f28 - fSqrt2);
                            if (z && this.checkScale == f7) {
                                z2 = false;
                            } else {
                                canvas.save();
                                float f29 = this.checkScale;
                                canvas.scale(f29, f29, iCenterX, iCenterY);
                                z2 = true;
                            }
                            canvas.drawPath(this.path, this.checkPaint);
                            if (z2) {
                                canvas.restore();
                            }
                        }
                        f8 = 9.0f;
                        float fDp9 = AndroidUtilities.dp(f8 * f9) * f6;
                        float fDp10 = AndroidUtilities.dp(f9 * 4.0f) * f6;
                        int iDp3 = iCenterX - AndroidUtilities.dp(1.5f);
                        int iDp4 = AndroidUtilities.dp(4.0f) + iCenterY;
                        float fSqrt3 = (float) Math.sqrt((fDp10 * fDp10) / 2.0f);
                        float f210 = iDp3;
                        float f211 = iDp4;
                        this.path.moveTo(f210 - fSqrt3, f211 - fSqrt3);
                        this.path.lineTo(f210, f211);
                        float fSqrt4 = (float) Math.sqrt((fDp9 * fDp9) / 2.0f);
                        this.path.lineTo(f210 + fSqrt4, f211 - fSqrt4);
                        if (z) {
                            canvas.save();
                            float f212 = this.checkScale;
                            canvas.scale(f212, f212, iCenterX, iCenterY);
                            z2 = true;
                        } else {
                            canvas.save();
                            float f213 = this.checkScale;
                            canvas.scale(f213, f213, iCenterX, iCenterY);
                            z2 = true;
                        }
                        canvas.drawPath(this.path, this.checkPaint);
                        if (z2) {
                            canvas.restore();
                        }
                    }
                }
            }
            if (z) {
                canvas.restore();
            }
        }
        f = fDp3;
        fDp = f;
        if (this.forbidden) {
            f2 = 1.0f;
        } else {
            f2 = this.progress;
        }
        if (f2 >= 0.5f) {
            f3 = 1.0f;
        } else {
            f3 = f2 / 0.5f;
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
            float f111 = iCenterY;
            f5 = 1.0f;
            f4 = f2;
            i = 12;
            i2 = 13;
            canvas.saveLayerAlpha(f110 - f, f111 - f, f110 + f, f111 + f, 255, 31);
        } else {
            f4 = f2;
            i = 12;
            i2 = 13;
            f5 = 1.0f;
        }
        i3 = this.backgroundColorKey;
        if (i3 >= 0) {
            if (this.drawUnchecked) {
                i18 = this.backgroundType;
                if (i18 != i) {
                    paint.setColor(getThemedColor(i3));
                    paint.setAlpha((int) (this.backgroundAlpha * 255.0f));
                    this.backgroundPaint.setColor(getThemedColor(this.checkColorKey));
                } else {
                    paint.setColor(getThemedColor(i3));
                    paint.setAlpha((int) (this.backgroundAlpha * 255.0f));
                    this.backgroundPaint.setColor(getThemedColor(this.checkColorKey));
                }
            } else {
                Paint paint6 = this.backgroundPaint;
                i17 = this.background2ColorKey;
                if (i17 < 0) {
                    i17 = this.checkColorKey;
                }
                paint6.setColor(AndroidUtilities.getOffsetColor(16777215, getThemedColor(i17), f4, this.backgroundAlpha));
            }
        } else if (this.drawUnchecked) {
            paint.setColor(Color.argb((int) (this.backgroundAlpha * 25.0f), 0, 0, 0));
            if (this.backgroundType == 8) {
                this.backgroundPaint.setColor(getThemedColor(this.background2ColorKey));
            } else {
                this.backgroundPaint.setColor(AndroidUtilities.getOffsetColor(-1, getThemedColor(this.checkColorKey), f4, this.backgroundAlpha));
            }
        } else if (this.backgroundColor != 0) {
            this.backgroundPaint.setColor(0);
        } else {
            Paint paint7 = this.backgroundPaint;
            i4 = this.background2ColorKey;
            if (i4 < 0) {
                i4 = this.checkColorKey;
            }
            paint7.setColor(AndroidUtilities.getOffsetColor(16777215, getThemedColor(i4), f4, this.backgroundAlpha));
        }
        if (this.drawUnchecked) {
            i5 = -1;
            i6 = 7;
        } else {
            i5 = -1;
            i6 = 7;
        }
        paint.setColor(getThemedColor(this.checkColorKey));
        i7 = this.backgroundType;
        if (i7 != i5) {
            if (i7 != 12) {
                this.backgroundPaint.setStyle(Paint.Style.FILL);
                messageDrawable = this.messageDrawable;
                if (messageDrawable == null) {
                    this.backgroundPaint.setShader(null);
                } else {
                    this.backgroundPaint.setShader(null);
                }
                canvas.drawCircle(iCenterX, iCenterY, (f - AndroidUtilities.dp(f5)) * this.backgroundAlpha, this.backgroundPaint);
                this.backgroundPaint.setStyle(Paint.Style.STROKE);
            } else {
                this.backgroundPaint.setStyle(Paint.Style.FILL);
                messageDrawable = this.messageDrawable;
                if (messageDrawable == null) {
                    this.backgroundPaint.setShader(null);
                } else {
                    this.backgroundPaint.setShader(null);
                }
                canvas.drawCircle(iCenterX, iCenterY, (f - AndroidUtilities.dp(f5)) * this.backgroundAlpha, this.backgroundPaint);
                this.backgroundPaint.setStyle(Paint.Style.STROKE);
            }
        }
        if (f3 > 0.0f) {
            if (f4 < 0.5f) {
                f6 = 0.0f;
            } else {
                f6 = (f4 - 0.5f) / 0.5f;
            }
            i8 = this.backgroundType;
            if (i8 == 9) {
                paint.setColor(getThemedColor(this.background2ColorKey));
            } else if (i8 != 11) {
                paint.setColor(getThemedColor(this.backgroundColorKey));
            } else {
                paint.setColor(getThemedColor(this.backgroundColorKey));
            }
            if (this.forbidden) {
                paint.setColor(this.backgroundPaint.getColor());
                f7 = 1.0f;
            } else {
                f7 = 1.0f;
                if (this.alpha < 1.0f) {
                    paint.setColor(ColorUtils.blendARGB(this.backgroundPaint.getColor(), paint.getColor(), this.alpha));
                }
            }
            if (this.useDefaultCheck) {
                this.checkPaint.setColor(getThemedColor(Theme.key_checkboxCheck));
            } else {
                this.checkPaint.setColor(getThemedColor(Theme.key_checkboxCheck));
            }
            if (this.alpha < f7) {
                this.checkPaint.setColor(ColorUtils.blendARGB(paint.getColor(), this.checkPaint.getColor(), this.alpha));
            }
            if (this.backgroundType != -1) {
                fDp2 = AndroidUtilities.dp(this.size) / 2.0f;
                int iSave2 = canvas.save();
                canvas.translate(iCenterX - fDp2, iCenterY - fDp2);
                if (f3 < f7) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.size), AndroidUtilities.dp(this.size), 255, 31);
                }
                paint2 = (Paint) this.circlePaintProvider.provide(null);
                i11 = this.backgroundType;
                if (i11 != 12) {
                    alpha = paint2.getAlpha();
                    paint2.setAlpha((int) (f3 * 255.0f));
                    canvas.drawCircle(fDp2, fDp2, f * f3, paint2);
                    if (paint2 != paint) {
                        paint2.setAlpha(alpha);
                    }
                } else {
                    alpha = paint2.getAlpha();
                    paint2.setAlpha((int) (f3 * 255.0f));
                    canvas.drawCircle(fDp2, fDp2, f * f3, paint2);
                    if (paint2 != paint) {
                        paint2.setAlpha(alpha);
                    }
                }
                canvas.restoreToCount(iSave2);
            }
            if (this.forbidden) {
                if (forbidPaint == null) {
                    Paint paint8 = new Paint(1);
                    forbidPaint = paint8;
                    paint8.setStyle(Paint.Style.STROKE);
                    forbidPaint.setStrokeCap(Paint.Cap.ROUND);
                    forbidPaint.setStrokeJoin(Paint.Join.ROUND);
                    forbidPaint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f)}, 0.0f));
                }
                forbidPaint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                forbidPaint.setColor(getThemedColor(Theme.key_switchTrack));
                canvas.drawCircle(iCenterX, iCenterY, AndroidUtilities.dp(9.0f), forbidPaint);
            } else if (f6 != 0.0f) {
                if (this.checkedText != null) {
                    if (this.textPaint == null) {
                        i10 = 1;
                        TextPaint textPaint2 = new TextPaint(1);
                        this.textPaint = textPaint2;
                        textPaint2.setTypeface(AndroidUtilities.bold());
                    } else {
                        i10 = 1;
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
                    canvas.save();
                    float f214 = iCenterX;
                    canvas.scale(f6, f7, f214, iCenterY);
                    String str2 = this.checkedText;
                    canvas.drawText(str2, f214 - (this.textPaint.measureText(str2) / 2.0f), AndroidUtilities.dp(f11), this.textPaint);
                    canvas.restore();
                } else {
                    this.path.reset();
                    i9 = this.backgroundType;
                    if (i9 == -1) {
                        f9 = 1.4f;
                    } else {
                        if (i9 == 5) {
                            f9 = 0.8f;
                        } else {
                            f8 = 9.0f;
                            f9 = 1.0f;
                        }
                        float fDp11 = AndroidUtilities.dp(f8 * f9) * f6;
                        float fDp12 = AndroidUtilities.dp(f9 * 4.0f) * f6;
                        int iDp5 = iCenterX - AndroidUtilities.dp(1.5f);
                        int iDp6 = AndroidUtilities.dp(4.0f) + iCenterY;
                        float fSqrt5 = (float) Math.sqrt((fDp12 * fDp12) / 2.0f);
                        float f215 = iDp5;
                        float f216 = iDp6;
                        this.path.moveTo(f215 - fSqrt5, f216 - fSqrt5);
                        this.path.lineTo(f215, f216);
                        float fSqrt6 = (float) Math.sqrt((fDp11 * fDp11) / 2.0f);
                        this.path.lineTo(f215 + fSqrt6, f216 - fSqrt6);
                        if (z) {
                            canvas.save();
                            float f217 = this.checkScale;
                            canvas.scale(f217, f217, iCenterX, iCenterY);
                            z2 = true;
                        } else {
                            canvas.save();
                            float f218 = this.checkScale;
                            canvas.scale(f218, f218, iCenterX, iCenterY);
                            z2 = true;
                        }
                        canvas.drawPath(this.path, this.checkPaint);
                        if (z2) {
                            canvas.restore();
                        }
                    }
                    f8 = 9.0f;
                    float fDp13 = AndroidUtilities.dp(f8 * f9) * f6;
                    float fDp14 = AndroidUtilities.dp(f9 * 4.0f) * f6;
                    int iDp7 = iCenterX - AndroidUtilities.dp(1.5f);
                    int iDp8 = AndroidUtilities.dp(4.0f) + iCenterY;
                    float fSqrt7 = (float) Math.sqrt((fDp14 * fDp14) / 2.0f);
                    float f219 = iDp7;
                    float f2110 = iDp8;
                    this.path.moveTo(f219 - fSqrt7, f2110 - fSqrt7);
                    this.path.lineTo(f219, f2110);
                    float fSqrt8 = (float) Math.sqrt((fDp13 * fDp13) / 2.0f);
                    this.path.lineTo(f219 + fSqrt8, f2110 - fSqrt8);
                    if (z) {
                        canvas.save();
                        float f2111 = this.checkScale;
                        canvas.scale(f2111, f2111, iCenterX, iCenterY);
                        z2 = true;
                    } else {
                        canvas.save();
                        float f2112 = this.checkScale;
                        canvas.scale(f2112, f2112, iCenterX, iCenterY);
                        z2 = true;
                    }
                    canvas.drawPath(this.path, this.checkPaint);
                    if (z2) {
                        canvas.restore();
                    }
                }
            }
        }
        if (z) {
            canvas.restore();
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
