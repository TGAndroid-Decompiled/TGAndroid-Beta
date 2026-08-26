package org.telegram.ui.Components;

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

public final class CheckBoxBase {
    public static Paint forbidPaint;
    public static Paint paint;
    public long animationDuration;
    public boolean attachedToWindow;
    public int background2ColorKey;
    public int backgroundColor;
    public int backgroundColorKey;
    public final Paint backgroundPaint;
    public int backgroundType;
    public ObjectAnimator checkAnimator;
    public final Paint checkPaint;
    public String checkedText;
    public GenericProvider circlePaintProvider;
    public float customRadius;
    public float customRadiusFactor;
    public boolean cutCheck;
    public boolean drawUnchecked;
    public boolean forbidden;
    public boolean isChecked;
    public MessageDrawable messageDrawable;
    public View parentView;
    public float progress;
    public ProgressDelegate progressDelegate;
    public Theme.ResourcesProvider resourcesProvider;
    public float size;
    public int strokeBackgroundKey;
    public TextPaint textPaint;
    public boolean useDefaultCheck;
    public final Rect bounds = new Rect();
    public final RectF rect = new RectF();
    public float checkScale = 1.0f;
    public float alpha = 1.0f;
    public final Path path = new Path();
    public boolean enabled = true;
    public float backgroundAlpha = 1.0f;
    public int checkColorKey = Theme.key_checkboxCheck;

    public interface ProgressDelegate {
        void setProgress();
    }

    public CheckBoxBase(Theme.ResourcesProvider resourcesProvider, View view, int i) {
        int i2 = Theme.key_chat_serviceBackground;
        this.backgroundColorKey = i2;
        this.background2ColorKey = i2;
        this.strokeBackgroundKey = Theme.key_dialogBackground;
        this.customRadius = 0.0f;
        this.customRadiusFactor = 1.0f;
        this.drawUnchecked = true;
        this.circlePaintProvider = new EmojiView$$ExternalSyntheticLambda21(26);
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
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.9f));
        Paint paint3 = new Paint(1);
        this.backgroundPaint = paint3;
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void draw(Canvas canvas) {
        float fDp;
        float f;
        float f2;
        int iCenterX;
        int iCenterY;
        boolean z;
        float f3;
        int i;
        int i2;
        float f4;
        float f5;
        Canvas canvas2;
        int i3;
        Paint paint2;
        int i4;
        int i5;
        int i6;
        int i7;
        float f6;
        int i8;
        boolean z2;
        Paint paint3;
        boolean z3;
        int i9;
        float f7;
        int i10;
        int length;
        float f8;
        float f9;
        float fDp2;
        boolean z4;
        Paint paint4;
        int i11;
        int alpha;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        float fDp3 = AndroidUtilities.dp(this.size / 2.0f);
        int i19 = this.backgroundType;
        if (i19 != 12 && i19 != 13) {
            if (i19 != 0 && i19 != 11) {
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
            Rect rect = this.bounds;
            iCenterX = rect.centerX();
            iCenterY = rect.centerY();
            if (this.cutCheck || f2 <= 0.0f || f < 0.5f || this.forbidden || this.checkedText != null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                float f10 = iCenterX;
                float f11 = f;
                float f12 = f10 - fDp3;
                float f13 = iCenterY;
                float f14 = f13 - fDp3;
                float f15 = f10 + fDp3;
                float f16 = f13 + fDp3;
                f3 = f11;
                i = iCenterX;
                i2 = iCenterY;
                f4 = 1.0f;
                f5 = 0.0f;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(f12, f14, f15, f16, 255, 31);
            } else {
                f3 = f;
                i = iCenterX;
                i2 = iCenterY;
                f4 = 1.0f;
                f5 = 0.0f;
                canvas2 = canvas;
            }
            i3 = this.backgroundColorKey;
            paint2 = this.backgroundPaint;
            if (i3 >= 0) {
                if (this.drawUnchecked) {
                    i18 = this.backgroundType;
                    if (i18 != 12 || i18 == 13) {
                        paint.setColor(Theme.getColor(i3, this.resourcesProvider));
                        paint.setAlpha((int) (this.backgroundAlpha * 255.0f));
                        paint2.setColor(Theme.getColor(this.checkColorKey, this.resourcesProvider));
                    } else if (i18 == 6 || i18 == 7) {
                        paint.setColor(Theme.getColor(this.background2ColorKey, this.resourcesProvider));
                        paint2.setColor(Theme.getColor(this.checkColorKey, this.resourcesProvider));
                    } else if (i18 == 10 || i18 == 14) {
                        paint2.setColor(Theme.getColor(this.background2ColorKey, this.resourcesProvider));
                    } else {
                        Paint paint5 = paint;
                        int iIndexOfKey = Theme.currentColors.indexOfKey(Theme.key_chat_serviceBackground);
                        paint5.setColor(((iIndexOfKey >= 0 ? Theme.currentColors.valueAt(iIndexOfKey) : Theme.serviceMessageColor) & 16777215) | 671088640);
                        paint2.setColor(Theme.getColor(this.checkColorKey, this.resourcesProvider));
                    }
                } else {
                    i17 = this.background2ColorKey;
                    if (i17 < 0) {
                        i17 = this.checkColorKey;
                    }
                    paint2.setColor(AndroidUtilities.getOffsetColor(16777215, Theme.getColor(i17, this.resourcesProvider), f3, this.backgroundAlpha));
                }
            } else if (this.drawUnchecked) {
                paint.setColor(Color.argb((int) (this.backgroundAlpha * 25.0f), 0, 0, 0));
                if (this.backgroundType == 8) {
                    paint2.setColor(Theme.getColor(this.background2ColorKey, this.resourcesProvider));
                } else {
                    paint2.setColor(AndroidUtilities.getOffsetColor(-1, Theme.getColor(this.checkColorKey, this.resourcesProvider), f3, this.backgroundAlpha));
                }
            } else if (this.backgroundColor != 0) {
                paint2.setColor(0);
            } else {
                i4 = this.background2ColorKey;
                if (i4 < 0) {
                    i4 = this.checkColorKey;
                }
                paint2.setColor(AndroidUtilities.getOffsetColor(16777215, Theme.getColor(i4, this.resourcesProvider), f3, this.backgroundAlpha));
            }
            if (this.drawUnchecked || (i16 = this.backgroundType) < 0 || i16 == 12 || i16 == 13) {
                i5 = -1;
                i6 = 7;
            } else if (i16 != 8 && i16 != 10 && i16 != 14) {
                if (i16 == 6 || i16 == 7) {
                    float f17 = i;
                    float f18 = i2;
                    canvas2.drawCircle(f17, f18, fDp3 - AndroidUtilities.dp(f4), paint);
                    canvas2.drawCircle(f17, f18, fDp3 - AndroidUtilities.dp(1.5f), paint2);
                } else {
                    canvas2.drawCircle(i, i2, fDp3, paint);
                }
                i5 = -1;
                i6 = 7;
            } else if (this.customRadius > f5) {
                float fDp4 = fDp3 - AndroidUtilities.dp(1.5f);
                float fLerp = AndroidUtilities.lerp(fDp4, this.customRadius, this.customRadiusFactor);
                float f19 = i;
                float f20 = i2;
                i5 = -1;
                i6 = 7;
                canvas2.drawRoundRect(f19 - fDp4, f20 - fDp4, f19 + fDp4, fDp4 + f20, fLerp, fLerp, paint2);
                paint2 = paint2;
            } else {
                i5 = -1;
                i6 = 7;
                canvas2.drawCircle(i, i2, fDp3 - AndroidUtilities.dp(1.5f), paint2);
            }
            paint.setColor(Theme.getColor(this.checkColorKey, this.resourcesProvider));
            i7 = this.backgroundType;
            if (i7 != i5 || i7 == i6 || i7 == 8 || i7 == 9 || i7 == 10 || i7 == 14) {
                f5 = 0.0f;
            } else if (i7 == 12 || i7 == 13) {
                paint2.setStyle(Paint.Style.FILL);
                MessageDrawable messageDrawable = this.messageDrawable;
                if (messageDrawable == null || !messageDrawable.hasGradient()) {
                    paint2.setShader(null);
                } else {
                    MessageDrawable messageDrawable2 = this.messageDrawable;
                    Shader shader = messageDrawable2.gradientShader;
                    Matrix matrix = messageDrawable2.matrix;
                    matrix.reset();
                    this.messageDrawable.applyMatrixScale();
                    matrix.postTranslate(0.0f, (-this.messageDrawable.topY) + rect.top);
                    shader.setLocalMatrix(matrix);
                    paint2.setShader(shader);
                }
                canvas2.drawCircle(i, i2, (fDp3 - AndroidUtilities.dp(f4)) * this.backgroundAlpha, paint2);
                paint2.setStyle(Paint.Style.STROKE);
                f5 = 0.0f;
            } else if (i7 == 0 || i7 == 11) {
                canvas2.drawCircle(i, i2, fDp3, paint2);
            } else {
                RectF rectF = this.rect;
                float f21 = i;
                float f22 = i2;
                rectF.set(f21 - fDp, f22 - fDp, f21 + fDp, f22 + fDp);
                int i20 = this.backgroundType;
                if (i20 == 6) {
                    i13 = (int) ((-360.0f) * f3);
                    i14 = 0;
                } else if (i20 == 1) {
                    i13 = (int) ((-270.0f) * f3);
                    i14 = -90;
                } else {
                    int i21 = (int) (270.0f * f3);
                    if (LocaleController.isRTL) {
                        i21 = -i21;
                    }
                    i13 = i21;
                    i14 = 90;
                }
                if (i20 == 6) {
                    int color = Theme.getColor(this.strokeBackgroundKey, this.resourcesProvider);
                    int iAlpha = Color.alpha(color);
                    paint2.setColor(color);
                    paint2.setAlpha((int) (iAlpha * f3));
                    i15 = i14;
                    canvas2.drawArc(rectF, i14, i13, false, paint2);
                    int color2 = Theme.getColor(Theme.key_chat_attachPhotoBackground, this.resourcesProvider);
                    int iAlpha2 = Color.alpha(color2);
                    paint2.setColor(color2);
                    paint2.setAlpha((int) (iAlpha2 * f3));
                } else {
                    i15 = i14;
                }
                canvas2 = canvas;
                canvas2.drawArc(rectF, i15, i13, false, paint2);
            }
            if (f2 > f5) {
                if (f3 < 0.5f) {
                    f6 = 0.0f;
                } else {
                    f6 = (f3 - 0.5f) / 0.5f;
                }
                i8 = this.backgroundType;
                if (i8 == 9) {
                    paint.setColor(Theme.getColor(this.background2ColorKey, this.resourcesProvider));
                } else if (i8 != 11 || i8 == 6 || i8 == i6 || i8 == 10 || ((!this.drawUnchecked && this.backgroundColorKey >= 0) || i8 == 14)) {
                    paint.setColor(Theme.getColor(this.backgroundColorKey, this.resourcesProvider));
                } else {
                    int i22 = this.backgroundColor;
                    if (i22 != 0) {
                        paint.setColor(i22);
                    } else {
                        paint.setColor(Theme.getColor(this.enabled ? Theme.key_checkbox : Theme.key_checkboxDisabled, this.resourcesProvider));
                    }
                }
                if (this.forbidden) {
                    paint.setColor(paint2.getColor());
                } else if (this.alpha < f4) {
                    paint.setColor(ColorUtils.blendARGB(this.alpha, paint2.getColor(), paint.getColor()));
                }
                z2 = this.useDefaultCheck;
                paint3 = this.checkPaint;
                if (!z2 || (i12 = this.checkColorKey) < 0) {
                    paint3.setColor(Theme.getColor(Theme.key_checkboxCheck, this.resourcesProvider));
                } else {
                    paint3.setColor(Theme.getColor(i12, this.resourcesProvider));
                }
                if (this.alpha < f4 && Theme.currentTheme.isDark()) {
                    paint3.setColor(ColorUtils.blendARGB(this.alpha, paint.getColor(), paint3.getColor()));
                }
                if (this.backgroundType != -1) {
                    fDp2 = AndroidUtilities.dp(this.size) / 2.0f;
                    int iSave = canvas2.save();
                    canvas2.translate(i - fDp2, i2 - fDp2);
                    if (f2 < f4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        canvas2.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.size), AndroidUtilities.dp(this.size), 255, 31);
                    }
                    paint4 = (Paint) this.circlePaintProvider.provide(null);
                    i11 = this.backgroundType;
                    if (i11 != 12 || i11 == 13) {
                        canvas2 = canvas;
                        alpha = paint4.getAlpha();
                        paint4.setAlpha((int) (f2 * 255.0f));
                        canvas2.drawCircle(fDp2, fDp2, fDp3 * f2, paint4);
                        if (paint4 != paint) {
                            paint4.setAlpha(alpha);
                        }
                    } else if (this.customRadius > 0.0f) {
                        float fDp5 = fDp3 - AndroidUtilities.dp(0.5f);
                        float fLerp2 = AndroidUtilities.lerp(fDp5, this.customRadius, this.customRadiusFactor);
                        float f23 = fDp2 - fDp5;
                        float f24 = fDp2 + fDp5;
                        canvas.drawRoundRect(f23, f23, f24, f24, fLerp2, fLerp2, paint4);
                        float f25 = (f4 - f2) * fDp5;
                        float fLerp3 = AndroidUtilities.lerp(f25, this.customRadius, this.customRadiusFactor);
                        if (!z4 || f25 <= 0.0f) {
                            canvas2 = canvas;
                        } else {
                            float f26 = fDp2 - f25;
                            float f27 = fDp2 + f25;
                            canvas2 = canvas;
                            canvas2.drawRoundRect(f26, f26, f27, f27, fLerp3, fLerp3, Theme.PAINT_CLEAR);
                        }
                    } else {
                        canvas2 = canvas;
                        float fDp6 = fDp3 - AndroidUtilities.dp(0.5f);
                        canvas2.drawCircle(fDp2, fDp2, fDp6, paint4);
                        float f28 = (f4 - f2) * fDp6;
                        if (z4 && f28 > 0.0f) {
                            canvas2.drawCircle(fDp2, fDp2, f28, Theme.PAINT_CLEAR);
                        }
                    }
                    canvas2.restoreToCount(iSave);
                }
                if (this.forbidden) {
                    if (forbidPaint == null) {
                        Paint paint6 = new Paint(1);
                        forbidPaint = paint6;
                        paint6.setStyle(Paint.Style.STROKE);
                        forbidPaint.setStrokeCap(Paint.Cap.ROUND);
                        forbidPaint.setStrokeJoin(Paint.Join.ROUND);
                        forbidPaint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f)}, 0.0f));
                    }
                    forbidPaint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                    forbidPaint.setColor(Theme.getColor(Theme.key_switchTrack, this.resourcesProvider));
                    canvas2.drawCircle(i, i2, AndroidUtilities.dp(9.0f), forbidPaint);
                } else {
                    z3 = false;
                    if (f6 != 0.0f) {
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
                                f8 = 14.0f;
                                f9 = 18.0f;
                            } else if (length != 3) {
                                f8 = 8.0f;
                                f9 = 15.75f;
                            } else {
                                f9 = 16.5f;
                                f8 = 10.0f;
                            }
                            this.textPaint.setTextSize(AndroidUtilities.dp(f8));
                            this.textPaint.setColor(Theme.getColor(this.checkColorKey, this.resourcesProvider));
                            canvas2.save();
                            float f29 = i;
                            canvas2.scale(f6, 1.0f, f29, i2);
                            String str = this.checkedText;
                            canvas2.drawText(str, f29 - (this.textPaint.measureText(str) / 2.0f), AndroidUtilities.dp(f9), this.textPaint);
                            canvas2.restore();
                        } else {
                            Path path = this.path;
                            path.reset();
                            i9 = this.backgroundType;
                            if (i9 == -1) {
                                f7 = 1.4f;
                            } else if (i9 == 5) {
                                f7 = 0.8f;
                            } else {
                                f7 = 1.0f;
                            }
                            float fDp7 = AndroidUtilities.dp(9.0f * f7) * f6;
                            float fDp8 = AndroidUtilities.dp(f7 * 4.0f) * f6;
                            int iDp = i - AndroidUtilities.dp(1.5f);
                            int iDp2 = AndroidUtilities.dp(4.0f) + i2;
                            float fSqrt = (float) Math.sqrt((fDp8 * fDp8) / 2.0f);
                            float f30 = iDp;
                            float f31 = iDp2;
                            path.moveTo(f30 - fSqrt, f31 - fSqrt);
                            path.lineTo(f30, f31);
                            float fSqrt2 = (float) Math.sqrt((fDp7 * fDp7) / 2.0f);
                            path.lineTo(f30 + fSqrt2, f31 - fSqrt2);
                            if (z || this.checkScale != 1.0f) {
                                canvas2.save();
                                float f32 = this.checkScale;
                                canvas2.scale(f32, f32, i, i2);
                                z3 = true;
                            }
                            canvas2.drawPath(path, paint3);
                            if (z3) {
                                canvas2.restore();
                            }
                        }
                    }
                }
            }
            if (z) {
                canvas2.restore();
            }
        }
        fDp3 = AndroidUtilities.dp(10.0f);
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
        Rect rect2 = this.bounds;
        iCenterX = rect2.centerX();
        iCenterY = rect2.centerY();
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
            f4 = 1.0f;
            f5 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(f112, f114, f115, f116, 255, 31);
        } else {
            f3 = f;
            i = iCenterX;
            i2 = iCenterY;
            f4 = 1.0f;
            f5 = 0.0f;
            canvas2 = canvas;
        }
        i3 = this.backgroundColorKey;
        paint2 = this.backgroundPaint;
        if (i3 >= 0) {
            if (this.drawUnchecked) {
                i18 = this.backgroundType;
                if (i18 != 12) {
                    paint.setColor(Theme.getColor(i3, this.resourcesProvider));
                    paint.setAlpha((int) (this.backgroundAlpha * 255.0f));
                    paint2.setColor(Theme.getColor(this.checkColorKey, this.resourcesProvider));
                } else {
                    paint.setColor(Theme.getColor(i3, this.resourcesProvider));
                    paint.setAlpha((int) (this.backgroundAlpha * 255.0f));
                    paint2.setColor(Theme.getColor(this.checkColorKey, this.resourcesProvider));
                }
            } else {
                i17 = this.background2ColorKey;
                if (i17 < 0) {
                    i17 = this.checkColorKey;
                }
                paint2.setColor(AndroidUtilities.getOffsetColor(16777215, Theme.getColor(i17, this.resourcesProvider), f3, this.backgroundAlpha));
            }
        } else if (this.drawUnchecked) {
            paint.setColor(Color.argb((int) (this.backgroundAlpha * 25.0f), 0, 0, 0));
            if (this.backgroundType == 8) {
                paint2.setColor(Theme.getColor(this.background2ColorKey, this.resourcesProvider));
            } else {
                paint2.setColor(AndroidUtilities.getOffsetColor(-1, Theme.getColor(this.checkColorKey, this.resourcesProvider), f3, this.backgroundAlpha));
            }
        } else if (this.backgroundColor != 0) {
            paint2.setColor(0);
        } else {
            i4 = this.background2ColorKey;
            if (i4 < 0) {
                i4 = this.checkColorKey;
            }
            paint2.setColor(AndroidUtilities.getOffsetColor(16777215, Theme.getColor(i4, this.resourcesProvider), f3, this.backgroundAlpha));
        }
        if (this.drawUnchecked) {
            i5 = -1;
            i6 = 7;
        } else {
            i5 = -1;
            i6 = 7;
        }
        paint.setColor(Theme.getColor(this.checkColorKey, this.resourcesProvider));
        i7 = this.backgroundType;
        if (i7 != i5) {
            f5 = 0.0f;
        } else {
            f5 = 0.0f;
        }
        if (f2 > f5) {
            if (f3 < 0.5f) {
                f6 = 0.0f;
            } else {
                f6 = (f3 - 0.5f) / 0.5f;
            }
            i8 = this.backgroundType;
            if (i8 == 9) {
                paint.setColor(Theme.getColor(this.background2ColorKey, this.resourcesProvider));
            } else if (i8 != 11) {
                paint.setColor(Theme.getColor(this.backgroundColorKey, this.resourcesProvider));
            } else {
                paint.setColor(Theme.getColor(this.backgroundColorKey, this.resourcesProvider));
            }
            if (this.forbidden) {
                paint.setColor(paint2.getColor());
            } else if (this.alpha < f4) {
                paint.setColor(ColorUtils.blendARGB(this.alpha, paint2.getColor(), paint.getColor()));
            }
            z2 = this.useDefaultCheck;
            paint3 = this.checkPaint;
            if (z2) {
                paint3.setColor(Theme.getColor(Theme.key_checkboxCheck, this.resourcesProvider));
            } else {
                paint3.setColor(Theme.getColor(Theme.key_checkboxCheck, this.resourcesProvider));
            }
            if (this.alpha < f4) {
                paint3.setColor(ColorUtils.blendARGB(this.alpha, paint.getColor(), paint3.getColor()));
            }
            if (this.backgroundType != -1) {
                fDp2 = AndroidUtilities.dp(this.size) / 2.0f;
                int iSave2 = canvas2.save();
                canvas2.translate(i - fDp2, i2 - fDp2);
                if (f2 < f4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.size), AndroidUtilities.dp(this.size), 255, 31);
                }
                paint4 = (Paint) this.circlePaintProvider.provide(null);
                i11 = this.backgroundType;
                if (i11 != 12) {
                    canvas2 = canvas;
                    alpha = paint4.getAlpha();
                    paint4.setAlpha((int) (f2 * 255.0f));
                    canvas2.drawCircle(fDp2, fDp2, fDp3 * f2, paint4);
                    if (paint4 != paint) {
                        paint4.setAlpha(alpha);
                    }
                } else {
                    canvas2 = canvas;
                    alpha = paint4.getAlpha();
                    paint4.setAlpha((int) (f2 * 255.0f));
                    canvas2.drawCircle(fDp2, fDp2, fDp3 * f2, paint4);
                    if (paint4 != paint) {
                        paint4.setAlpha(alpha);
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
                    forbidPaint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f)}, 0.0f));
                }
                forbidPaint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                forbidPaint.setColor(Theme.getColor(Theme.key_switchTrack, this.resourcesProvider));
                canvas2.drawCircle(i, i2, AndroidUtilities.dp(9.0f), forbidPaint);
            } else {
                z3 = false;
                if (f6 != 0.0f) {
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
                            f8 = 14.0f;
                            f9 = 18.0f;
                        } else {
                            f8 = 14.0f;
                            f9 = 18.0f;
                        }
                        this.textPaint.setTextSize(AndroidUtilities.dp(f8));
                        this.textPaint.setColor(Theme.getColor(this.checkColorKey, this.resourcesProvider));
                        canvas2.save();
                        float f210 = i;
                        canvas2.scale(f6, 1.0f, f210, i2);
                        String str2 = this.checkedText;
                        canvas2.drawText(str2, f210 - (this.textPaint.measureText(str2) / 2.0f), AndroidUtilities.dp(f9), this.textPaint);
                        canvas2.restore();
                    } else {
                        Path path2 = this.path;
                        path2.reset();
                        i9 = this.backgroundType;
                        if (i9 == -1) {
                            f7 = 1.4f;
                        } else if (i9 == 5) {
                            f7 = 0.8f;
                        } else {
                            f7 = 1.0f;
                        }
                        float fDp9 = AndroidUtilities.dp(9.0f * f7) * f6;
                        float fDp10 = AndroidUtilities.dp(f7 * 4.0f) * f6;
                        int iDp3 = i - AndroidUtilities.dp(1.5f);
                        int iDp4 = AndroidUtilities.dp(4.0f) + i2;
                        float fSqrt3 = (float) Math.sqrt((fDp10 * fDp10) / 2.0f);
                        float f33 = iDp3;
                        float f34 = iDp4;
                        path2.moveTo(f33 - fSqrt3, f34 - fSqrt3);
                        path2.lineTo(f33, f34);
                        float fSqrt4 = (float) Math.sqrt((fDp9 * fDp9) / 2.0f);
                        path2.lineTo(f33 + fSqrt4, f34 - fSqrt4);
                        if (z) {
                            canvas2.save();
                            float f35 = this.checkScale;
                            canvas2.scale(f35, f35, i, i2);
                            z3 = true;
                        } else {
                            canvas2.save();
                            float f36 = this.checkScale;
                            canvas2.scale(f36, f36, i, i2);
                            z3 = true;
                        }
                        canvas2.drawPath(path2, paint3);
                        if (z3) {
                            canvas2.restore();
                        }
                    }
                }
            }
        }
        if (z) {
            canvas2.restore();
        }
    }

    public final float getProgress() {
        return this.progress;
    }

    public final void invalidate() {
        View view = this.parentView;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.parentView.getParent()).invalidate();
        }
        this.parentView.invalidate();
    }

    public final void setBackgroundType(int i) {
        if (this.backgroundType == i) {
            return;
        }
        this.backgroundType = i;
        Paint paint2 = this.backgroundPaint;
        if (i == 12 || i == 13) {
            paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
        } else if (i == 4 || i == 5) {
            paint2.setStrokeWidth(AndroidUtilities.dp(1.9f));
            if (i == 5) {
                this.checkPaint.setStrokeWidth(AndroidUtilities.dp(1.5f));
            }
        } else if (i == 3) {
            paint2.setStrokeWidth(AndroidUtilities.dp(3.0f));
        } else if (i != 0) {
            paint2.setStrokeWidth(AndroidUtilities.dp(1.5f));
        }
        invalidate();
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
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

    public final void setChecked(boolean z, boolean z2) {
        setChecked(-1, z, z2);
    }

    public final void setColor(int i, int i2, int i3) {
        if (this.backgroundColorKey == i && this.background2ColorKey == i2 && this.checkColorKey == i3) {
            return;
        }
        this.backgroundColorKey = i;
        this.background2ColorKey = i2;
        this.checkColorKey = i3;
        invalidate();
    }

    public final void setCustomRadius(float f) {
        if (this.customRadius == f) {
            return;
        }
        this.customRadius = f;
        invalidate();
    }

    public final void setCuttingCheck(boolean z) {
        if (this.cutCheck == z) {
            return;
        }
        this.cutCheck = z;
        this.checkPaint.setXfermode(z ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
        invalidate();
    }

    public final void setDrawUnchecked(boolean z) {
        if (this.drawUnchecked == z) {
            return;
        }
        this.drawUnchecked = z;
        invalidate();
    }

    public final void setSize(float f) {
        if (this.size == f) {
            return;
        }
        this.size = f;
        invalidate();
    }

    public final void setChecked(int i, boolean z, boolean z2) {
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
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", z ? 1.0f : 0.0f);
            this.checkAnimator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.addListener(new CheckBox.AnonymousClass1(this, 21));
            this.checkAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.checkAnimator.setDuration(this.animationDuration);
            this.checkAnimator.start();
            return;
        }
        ObjectAnimator objectAnimator = this.checkAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.checkAnimator = null;
        }
        float f = z ? 1.0f : 0.0f;
        if (this.progress == f) {
            return;
        }
        this.progress = f;
        invalidate();
        ProgressDelegate progressDelegate = this.progressDelegate;
        if (progressDelegate != null) {
            progressDelegate.setProgress();
        }
    }
}
