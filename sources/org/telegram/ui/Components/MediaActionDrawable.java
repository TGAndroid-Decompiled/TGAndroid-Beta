package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.Theme;

public final class MediaActionDrawable extends Drawable {
    public float animatedDownloadProgress;
    public boolean animatingTransition;
    public final Paint backPaint;
    public PorterDuffColorFilter colorFilter;
    public int currentIcon;
    public RadialProgress2$$ExternalSyntheticLambda0 delegate;
    public float downloadProgress;
    public float downloadProgressAnimationStart;
    public float downloadProgressTime;
    public float downloadRadOffset;
    public boolean hasOverlayImage;
    public final DecelerateInterpolator interpolator;
    public boolean isMini;
    public long lastAnimationTime;
    public int lastPercent;
    public MessageDrawable messageDrawable;
    public int nextIcon;
    public float overrideAlpha;
    public final Paint paint;
    public final Paint paint2;
    public final Paint paint3;
    public String percentString;
    public int percentStringWidth;
    public final RectF rect;
    public float savedTransitionProgress;
    public float scale;
    public final TextPaint textPaint;
    public float transitionAnimationTime;
    public float transitionProgress;

    public MediaActionDrawable() {
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        Paint paint = new Paint(1);
        this.paint = paint;
        this.backPaint = new Paint(1);
        Paint paint2 = new Paint(1);
        this.paint2 = paint2;
        Paint paint3 = new Paint(1);
        this.paint3 = paint3;
        this.rect = new RectF();
        this.scale = 1.0f;
        this.interpolator = new DecelerateInterpolator();
        this.transitionAnimationTime = 400.0f;
        this.lastPercent = -1;
        this.overrideAlpha = 1.0f;
        this.transitionProgress = 1.0f;
        paint.setColor(-1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        paint2.setColor(-1);
    }

    public final void applyShaderMatrix(boolean z) {
        MessageDrawable messageDrawable = this.messageDrawable;
        if (messageDrawable == null || !messageDrawable.hasGradient() || this.hasOverlayImage) {
            return;
        }
        Rect bounds = getBounds();
        MessageDrawable messageDrawable2 = this.messageDrawable;
        Shader shader = messageDrawable2.gradientShader;
        Matrix matrix = messageDrawable2.matrix;
        matrix.reset();
        this.messageDrawable.applyMatrixScale();
        if (z) {
            matrix.postTranslate(-bounds.centerX(), (-this.messageDrawable.topY) + bounds.top);
        } else {
            matrix.postTranslate(0.0f, -this.messageDrawable.topY);
        }
        shader.setLocalMatrix(matrix);
    }

    @Override
    public final void draw(Canvas canvas) {
        int iSave;
        int i;
        float f;
        float f2;
        float fDp;
        int i2;
        Drawable drawable;
        Paint paint;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        int i3;
        boolean z;
        int i4;
        float f11;
        float fMax;
        int i5;
        Path[] pathArr;
        Path[] pathArr2;
        Path[] pathArr3;
        Path[] pathArr4;
        Drawable drawable2;
        Drawable drawable3;
        int i6;
        Drawable drawable4;
        int i7;
        int i8;
        float f12;
        int i9;
        int i10;
        int i11;
        float f13;
        TextPaint textPaint;
        float f14;
        Rect rect;
        float f15;
        int i12;
        int i13;
        int i14;
        float f16;
        int i15;
        Paint paint2;
        int i16;
        float f17;
        float interpolation;
        int i17;
        float fMin;
        float f18;
        int iDp;
        int iDp2;
        float f19;
        float f20;
        float f21;
        Paint paint3;
        int i18;
        long j;
        long j2;
        int i19;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        int i20;
        float f27;
        float f28;
        int i21;
        Path path;
        Path path2;
        Path path3;
        int i22;
        int i23;
        int i24;
        int i25;
        float f29;
        float fMin2;
        float fCenterX;
        int iMin;
        float f30;
        float f31;
        float fCenterY;
        float fDp2;
        float f32;
        float f33;
        int iCenterY;
        RectF rectF;
        int i26;
        int i27;
        RectF rectF2;
        int i28;
        float f34;
        int i29;
        int i30;
        Rect bounds = getBounds();
        MessageDrawable messageDrawable = this.messageDrawable;
        Paint paint4 = this.paint3;
        Paint paint5 = this.paint2;
        Paint paint6 = this.paint;
        if (messageDrawable == null || !messageDrawable.hasGradient() || this.hasOverlayImage) {
            paint6.setShader(null);
            paint5.setShader(null);
            paint4.setShader(null);
        } else {
            Shader shader = this.messageDrawable.gradientShader;
            paint6.setShader(shader);
            paint5.setShader(shader);
            paint4.setShader(shader);
        }
        int iCenterX = bounds.centerX();
        int iCenterY2 = bounds.centerY();
        int i31 = this.nextIcon;
        if (i31 == 4) {
            int i32 = this.currentIcon;
            if (i32 == 3 || i32 == 14) {
                i = 0;
            } else {
                iSave = canvas.save();
                float f35 = 1.0f - this.transitionProgress;
                canvas.scale(f35, f35, iCenterX, iCenterY2);
                i = iSave;
            }
        } else if ((i31 == 6 || i31 == 10) && this.currentIcon == 4) {
            iSave = canvas.save();
            float f36 = this.transitionProgress;
            canvas.scale(f36, f36, iCenterX, iCenterY2);
            i = iSave;
        } else {
            i = 0;
        }
        AndroidUtilities.dp(3.0f);
        int i33 = this.currentIcon;
        RectF rectF3 = this.rect;
        if (i33 == 2 || this.nextIcon == 2) {
            applyShaderMatrix(false);
            float f37 = iCenterY2;
            f = 0.0f;
            float fDp3 = f37 - (AndroidUtilities.dp(9.0f) * this.scale);
            float fDp4 = (AndroidUtilities.dp(9.0f) * this.scale) + f37;
            float fDp5 = (AndroidUtilities.dp(12.0f) * this.scale) + f37;
            int i34 = this.currentIcon;
            if ((i34 == 3 || i34 == 14) && this.nextIcon == 2) {
                paint6.setAlpha((int) (Math.min(1.0f, this.transitionProgress / 0.5f) * 255.0f));
                f2 = this.transitionProgress;
                fDp = (AndroidUtilities.dp(12.0f) * this.scale) + f37;
            } else {
                int i35 = this.nextIcon;
                if (i35 == 3 || i35 == 14 || i35 == 2) {
                    paint6.setAlpha(255);
                    f10 = this.transitionProgress;
                } else {
                    paint6.setAlpha((int) ((1.0f - this.transitionProgress) * Math.min(1.0f, this.savedTransitionProgress / 0.5f) * 255.0f));
                    f10 = this.savedTransitionProgress;
                }
                f2 = f10;
                fDp = (AndroidUtilities.dp(1.0f) * this.scale) + f37;
            }
            if (this.animatingTransition) {
                int i36 = this.nextIcon;
                paint = paint4;
                int i37 = 2;
                if (i36 == 2) {
                    i2 = i;
                } else if (f2 <= 0.5f) {
                    i2 = i;
                    i37 = 2;
                } else {
                    float fDp6 = AndroidUtilities.dp(13.0f);
                    float f38 = this.scale;
                    float fDp7 = (fDp6 * f38 * f38) + (this.isMini ? AndroidUtilities.dp(2.0f) : 0);
                    float f39 = f2 - 0.5f;
                    float f40 = f39 / 0.5f;
                    if (f39 > 0.2f) {
                        f9 = (f39 - 0.2f) / 0.3f;
                        f8 = 1.0f;
                    } else {
                        f8 = f39 / 0.2f;
                        f9 = 0.0f;
                    }
                    f6 = iCenterX;
                    float f41 = fDp7 / 2.0f;
                    rectF3.set(f6 - fDp7, fDp5 - f41, f6, fDp5 + f41);
                    float f42 = f9 * 100.0f;
                    float f43 = f9;
                    drawable = null;
                    paint = paint;
                    i2 = i;
                    iCenterX = iCenterX;
                    canvas.drawArc(rectF3, f42, (104.0f * f40) - f42, false, paint6);
                    float fM = DiffUtil.m(fDp5, fDp, f8, fDp);
                    if (f43 > 0.0f) {
                        float f44 = this.nextIcon == 14 ? 0.0f : (1.0f - f43) * (-45.0f);
                        float fDp8 = AndroidUtilities.dp(7.0f) * f43 * this.scale;
                        int iMin2 = (int) (f43 * 255.0f);
                        int i38 = this.nextIcon;
                        if (i38 != 3 && i38 != 14 && i38 != 2) {
                            iMin2 = (int) (iMin2 * (1.0f - Math.min(1.0f, this.transitionProgress / 0.5f)));
                        }
                        int i39 = iMin2;
                        if (f44 != 0.0f) {
                            canvas.save();
                            canvas.rotate(f44, f6, f37);
                        }
                        if (i39 != 0) {
                            paint6.setAlpha(i39);
                            if (this.nextIcon == 14) {
                                paint.setAlpha(i39);
                                rectF3.set(iCenterX - AndroidUtilities.dp(3.5f), iCenterY2 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + iCenterX, AndroidUtilities.dp(3.5f) + iCenterY2);
                                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint);
                                paint6.setAlpha((int) (i39 * 0.15f));
                                int iDp3 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                                rectF3.set(bounds.left + iDp3, bounds.top + iDp3, bounds.right - iDp3, bounds.bottom - iDp3);
                                canvas.drawArc(rectF3, 0.0f, 360.0f, false, paint6);
                                paint6.setAlpha(i39);
                                rectF3 = rectF3;
                            } else {
                                float f45 = f6 - fDp8;
                                float f46 = f37 - fDp8;
                                float f47 = f6 + fDp8;
                                float f48 = f37 + fDp8;
                                rectF3 = rectF3;
                                canvas.drawLine(f45, f46, f47, f48, paint6);
                                canvas.drawLine(f47, f46, f45, f48, paint6);
                            }
                        } else {
                            rectF3 = rectF3;
                        }
                        if (f44 != 0.0f) {
                            canvas.restore();
                        }
                    } else {
                        rectF3 = rectF3;
                    }
                    f3 = fM;
                    f4 = fDp5;
                    f5 = f6;
                }
                drawable = null;
                if (i36 == i37) {
                    f7 = 1.0f - f2;
                } else {
                    f7 = f2 / 0.5f;
                    f2 = 1.0f - f7;
                }
                float fM2 = DiffUtil.m(fDp, fDp3, f7, fDp3);
                float fM3 = DiffUtil.m(fDp5, fDp4, f7, fDp4);
                float f49 = iCenterX;
                float fDp9 = f49 - ((AndroidUtilities.dp(8.0f) * f2) * this.scale);
                float fDp10 = f49 + (AndroidUtilities.dp(8.0f) * f2 * this.scale);
                fDp5 = fM3 - ((AndroidUtilities.dp(8.0f) * f2) * this.scale);
                f4 = fM3;
                f6 = fDp9;
                f3 = fM2;
                f5 = fDp10;
            } else {
                i2 = i;
                rectF3 = rectF3;
                drawable = null;
                iCenterX = iCenterX;
                paint = paint4;
                float f50 = iCenterX;
                float fDp11 = f50 - (AndroidUtilities.dp(8.0f) * this.scale);
                float fDp12 = f50 + (AndroidUtilities.dp(8.0f) * this.scale);
                fDp5 = fDp4 - (AndroidUtilities.dp(8.0f) * this.scale);
                f3 = fDp3;
                f4 = fDp4;
                f5 = fDp12;
                f6 = fDp11;
            }
            if (f3 != f4) {
                float f51 = iCenterX;
                canvas.drawLine(f51, f3, f51, f4, paint6);
            }
            float f52 = iCenterX;
            if (f6 != f52) {
                float f53 = fDp5;
                canvas.drawLine(f6, f53, f52, f4, paint6);
                canvas.drawLine(f5, f53, f52, f4, paint6);
            }
        } else {
            paint5 = paint5;
            i2 = i;
            rectF3 = rectF3;
            drawable = null;
            f = 0.0f;
            iCenterX = iCenterX;
            paint = paint4;
        }
        int i40 = this.currentIcon;
        if (i40 != 3 && i40 != 14) {
            if (i40 == 4 && ((i30 = this.nextIcon) == 14 || i30 == 3)) {
                z = false;
                i3 = 15;
            } else if (i40 == 10 || this.nextIcon == 10 || i40 == 13) {
                int i41 = this.nextIcon;
                int i42 = (i41 == 4 || i41 == 6) ? (int) ((1.0f - this.transitionProgress) * 255.0f) : 255;
                if (i42 != 0) {
                    applyShaderMatrix(false);
                    paint6.setAlpha((int) (i42 * this.overrideAlpha));
                    float fMax2 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                    int iDp4 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                    rectF3.set(bounds.left + iDp4, bounds.top + iDp4, bounds.right - iDp4, bounds.bottom - iDp4);
                    canvas = canvas;
                    RectF rectF4 = rectF3;
                    i3 = 15;
                    canvas.drawArc(rectF4, this.downloadRadOffset, fMax2, false, paint6);
                } else {
                    i3 = 15;
                    canvas = canvas;
                }
            } else {
                canvas = canvas;
                i3 = 15;
            }
            i4 = this.currentIcon;
            if (i4 == this.nextIcon) {
                fMax = 1.0f;
                f11 = 1.0f;
            } else if (i4 != 4 || i4 == 3 || i4 == 14) {
                float f54 = this.transitionProgress;
                f11 = f54;
                fMax = 1.0f - f54;
            } else {
                float fMin3 = Math.min(1.0f, this.transitionProgress / 0.5f);
                fMax = Math.max(0.0f, 1.0f - (this.transitionProgress / 0.5f));
                f11 = fMin3;
            }
            i5 = this.nextIcon;
            if (i5 == i3) {
                pathArr2 = Theme.chat_updatePath;
                pathArr = drawable;
            } else if (this.currentIcon == i3) {
                pathArr = Theme.chat_updatePath;
                pathArr2 = drawable;
            } else {
                pathArr = drawable;
                pathArr2 = pathArr;
            }
            if (i5 == 5) {
                pathArr2 = Theme.chat_filePath;
            } else if (this.currentIcon == 5) {
                pathArr = Theme.chat_filePath;
            }
            pathArr3 = pathArr;
            pathArr4 = pathArr2;
            if (i5 == 7) {
                drawable2 = Theme.chat_flameIcon;
            } else if (this.currentIcon == 7) {
                Drawable drawable5 = drawable;
                drawable = Theme.chat_flameIcon;
                drawable2 = drawable5;
            } else {
                drawable2 = drawable;
            }
            if (i5 == 8) {
                drawable2 = Theme.chat_gifIcon;
            } else if (this.currentIcon == 8) {
                drawable = Theme.chat_gifIcon;
            }
            drawable3 = drawable2;
            if (this.currentIcon != 9 || i5 == 9) {
                applyShaderMatrix(false);
                if (this.currentIcon == this.nextIcon) {
                    i6 = 255;
                } else {
                    i6 = (int) (this.transitionProgress * 255.0f);
                }
                paint6.setAlpha(i6);
                int iDp5 = AndroidUtilities.dp(7.0f) + iCenterY2;
                int iDp6 = iCenterX - AndroidUtilities.dp(3.0f);
                if (this.currentIcon != this.nextIcon) {
                    canvas.save();
                    float f55 = this.transitionProgress;
                    canvas.scale(f55, f55, iCenterX, iCenterY2);
                }
                float f56 = iDp6;
                float f57 = iDp5;
                drawable4 = drawable;
                canvas.drawLine(iDp6 - AndroidUtilities.dp(6.0f), iDp5 - AndroidUtilities.dp(6.0f), f56, f57, paint6);
                canvas = canvas;
                canvas.drawLine(f56, f57, AndroidUtilities.dp(12.0f) + iDp6, iDp5 - AndroidUtilities.dp(12.0f), paint6);
                if (this.currentIcon != this.nextIcon) {
                    canvas.restore();
                }
            } else {
                drawable4 = drawable;
            }
            if (this.currentIcon != 12 || this.nextIcon == 12) {
                applyShaderMatrix(false);
                i7 = this.currentIcon;
                i8 = this.nextIcon;
                if (i7 == i8) {
                    f12 = 1.0f;
                } else if (i8 == 13) {
                    f12 = this.transitionProgress;
                } else {
                    f12 = 1.0f - this.transitionProgress;
                }
                if (i7 == i8) {
                    i9 = 255;
                } else {
                    i9 = (int) (f12 * 255.0f);
                }
                paint6.setAlpha(i9);
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.currentIcon != this.nextIcon) {
                    canvas.save();
                    canvas.scale(f12, f12, iCenterX, iCenterY2);
                }
                float fDp13 = AndroidUtilities.dp(7.0f) * this.scale;
                float f58 = iCenterX;
                float f59 = f58 - fDp13;
                float f60 = iCenterY2;
                float f61 = f60 - fDp13;
                float f62 = f58 + fDp13;
                float f63 = f60 + fDp13;
                canvas.drawLine(f59, f61, f62, f63, paint6);
                canvas.drawLine(f62, f61, f59, f63, paint6);
                if (this.currentIcon != this.nextIcon) {
                    canvas.restore();
                }
            }
            if (this.currentIcon != 13 || this.nextIcon == 13) {
                applyShaderMatrix(false);
                i10 = this.currentIcon;
                i11 = this.nextIcon;
                if (i10 == i11) {
                    f13 = 1.0f;
                } else if (i11 == 13) {
                    f13 = this.transitionProgress;
                } else {
                    f13 = 1.0f - this.transitionProgress;
                }
                textPaint = this.textPaint;
                textPaint.setAlpha((int) (f13 * 255.0f));
                int iDp7 = AndroidUtilities.dp(5.0f) + iCenterY2;
                f14 = 5.0f;
                int i43 = iCenterX - (this.percentStringWidth / 2);
                rect = bounds;
                f15 = fMax;
                if (this.currentIcon != this.nextIcon) {
                    canvas.save();
                    canvas.scale(f13, f13, iCenterX, iCenterY2);
                }
                i12 = (int) (this.animatedDownloadProgress * 100.0f);
                if (this.percentString != null || i12 != this.lastPercent) {
                    this.lastPercent = i12;
                    String str = String.format("%d%%", Integer.valueOf(i12));
                    this.percentString = str;
                    this.percentStringWidth = (int) Math.ceil(textPaint.measureText(str));
                }
                canvas.drawText(this.percentString, i43, iDp7, textPaint);
                if (this.currentIcon != this.nextIcon) {
                    canvas.restore();
                }
            } else {
                f15 = fMax;
                rect = bounds;
                f14 = 5.0f;
                iCenterY2 = iCenterY2;
            }
            i13 = this.currentIcon;
            i14 = 1;
            if (i13 != 0 || i13 == 1 || (i24 = this.nextIcon) == 0 || i24 == 1) {
                if (i13 == 0 || this.nextIcon != 1) {
                    if (i13 == 1) {
                        if (this.nextIcon != 0) {
                            i14 = 1;
                        } else if (this.animatingTransition) {
                            if (this.nextIcon == 0) {
                                f16 = 1.0f - this.transitionProgress;
                            } else {
                                f16 = this.transitionProgress;
                            }
                            i14 = 1;
                        } else {
                            i14 = 1;
                            if (this.nextIcon == 1) {
                                f16 = 1.0f;
                            } else {
                                f16 = 0.0f;
                            }
                        }
                    }
                    if (i13 == i14) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                } else if (this.animatingTransition) {
                    if (this.nextIcon == 0) {
                        f16 = 1.0f - this.transitionProgress;
                    } else {
                        f16 = this.transitionProgress;
                    }
                    i14 = 1;
                } else {
                    i14 = 1;
                    if (this.nextIcon == 1) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                }
                i15 = this.nextIcon;
                if ((i15 != 0 || i15 == i14) && (i13 == 0 || i13 == i14)) {
                    paint2 = paint5;
                    paint2.setAlpha(255);
                } else if (i15 == 4) {
                    paint2 = paint5;
                    paint2.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                } else {
                    paint2 = paint5;
                    paint2.setAlpha(i13 == i15 ? 255 : (int) (this.transitionProgress * 255.0f));
                }
                applyShaderMatrix(true);
                canvas.save();
                canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                float f64 = f16 * 500.0f;
                i16 = this.currentIcon;
                if (i16 == 1) {
                    f17 = 90.0f;
                } else {
                    f17 = 0.0f;
                }
                if (i16 != 0 && this.nextIcon == 1) {
                    if (f64 < 384.0f) {
                        interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f64 / 384.0f) * 95.0f;
                    } else {
                        interpolation = f64 < 484.0f ? 95.0f - (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f64 - 384.0f) / 100.0f) * f14) : 90.0f;
                    }
                    f64 += 100.0f;
                } else if (i16 == 1 || this.nextIcon != 0) {
                    interpolation = f17;
                } else if (f64 < 100.0f) {
                    interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f64 / 100.0f) * (-5.0f);
                } else {
                    interpolation = f64 < 484.0f ? (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f64 - 100.0f) / 384.0f) * 95.0f) - 5.0f : 90.0f;
                }
                canvas.rotate(interpolation);
                i17 = this.currentIcon;
                if ((i17 == 0 && i17 != 1) || i17 == 4) {
                    canvas.scale(f11, f11);
                }
                Theme.playPauseAnimator.draw(canvas, paint2, f64);
                canvas.scale(1.0f, -1.0f);
                Theme.playPauseAnimator.draw(canvas, paint2, f64);
                canvas.restore();
            } else {
                paint2 = paint5;
            }
            if (this.currentIcon != 6 || this.nextIcon == 6) {
                applyShaderMatrix(false);
                if (this.currentIcon != 6) {
                    f19 = this.transitionProgress;
                    if (f19 > 0.5f) {
                        f21 = (f19 - 0.5f) / 0.5f;
                        fMin = 1.0f - Math.min(1.0f, f21 / 0.5f);
                        if (f21 > 0.5f) {
                            f20 = (f21 - 0.5f) / 0.5f;
                        } else {
                            f20 = 0.0f;
                        }
                    } else {
                        f20 = 0.0f;
                        fMin = 1.0f;
                    }
                    paint6.setAlpha(255);
                    f18 = f20;
                } else {
                    if (this.nextIcon != 6) {
                        paint6.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                    } else {
                        paint6.setAlpha(255);
                    }
                    fMin = 0.0f;
                    f18 = 1.0f;
                }
                iDp = AndroidUtilities.dp(7.0f) + iCenterY2;
                iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                if (fMin < 1.0f) {
                    canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin), iDp - (AndroidUtilities.dp(6.0f) * fMin), paint6);
                }
                if (f18 > 0.0f) {
                    float f65 = iDp2;
                    float f66 = iDp;
                    canvas = canvas;
                    canvas.drawLine(f65, f66, (AndroidUtilities.dp(12.0f) * f18) + f65, f66 - (AndroidUtilities.dp(12.0f) * f18), paint6);
                } else {
                    canvas = canvas;
                }
            } else {
                iCenterY2 = iCenterY2;
            }
            if (drawable4 != null && drawable4 != drawable3) {
                int intrinsicWidth = (int) (drawable4.getIntrinsicWidth() * f15);
                int intrinsicHeight = (int) (drawable4.getIntrinsicHeight() * f15);
                drawable4.setColorFilter(this.colorFilter);
                if (this.currentIcon == this.nextIcon) {
                    i23 = 255;
                } else {
                    i23 = (int) ((1.0f - this.transitionProgress) * 255.0f);
                }
                drawable4.setAlpha(i23);
                int i44 = intrinsicWidth / 2;
                int i45 = intrinsicHeight / 2;
                drawable4.setBounds(iCenterX - i44, iCenterY2 - i45, i44 + iCenterX, iCenterY2 + i45);
                drawable4.draw(canvas);
            }
            if (drawable3 != null) {
                int intrinsicWidth2 = (int) (drawable3.getIntrinsicWidth() * f11);
                int intrinsicHeight2 = (int) (drawable3.getIntrinsicHeight() * f11);
                drawable3.setColorFilter(this.colorFilter);
                if (this.currentIcon == this.nextIcon) {
                    i22 = 255;
                } else {
                    i22 = (int) (this.transitionProgress * 255.0f);
                }
                drawable3.setAlpha(i22);
                int i46 = intrinsicWidth2 / 2;
                int i47 = intrinsicHeight2 / 2;
                drawable3.setBounds(iCenterX - i46, iCenterY2 - i47, i46 + iCenterX, iCenterY2 + i47);
                drawable3.draw(canvas);
            }
            paint3 = this.backPaint;
            if (pathArr3 != null || pathArr3 == pathArr4) {
                i18 = iCenterY2;
            } else {
                int iDp8 = AndroidUtilities.dp(24.0f);
                paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                paint2.setAlpha(this.currentIcon == this.nextIcon ? 255 : (int) ((1.0f - this.transitionProgress) * 255.0f));
                applyShaderMatrix(true);
                canvas.save();
                i18 = iCenterY2;
                canvas.translate(iCenterX, i18);
                float f67 = f15;
                canvas.scale(f67, f67);
                float f68 = (-iDp8) / 2;
                canvas.translate(f68, f68);
                Path path4 = pathArr3[0];
                if (path4 != null) {
                    canvas.drawPath(path4, paint2);
                }
                Path path5 = pathArr3[1];
                if (path5 != null) {
                    canvas.drawPath(path5, paint3);
                }
                canvas.restore();
            }
            if (pathArr4 != null) {
                int iDp9 = AndroidUtilities.dp(24.0f);
                if (this.currentIcon == this.nextIcon) {
                    i21 = 255;
                } else {
                    i21 = (int) (this.transitionProgress * 255.0f);
                }
                paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                paint2.setAlpha(i21);
                applyShaderMatrix(true);
                canvas.save();
                canvas.translate(iCenterX, i18);
                canvas.scale(f11, f11);
                float f69 = (-iDp9) / 2;
                canvas.translate(f69, f69);
                path = pathArr4[0];
                if (path != null) {
                    canvas.drawPath(path, paint2);
                }
                if (pathArr4.length >= 3 && (path3 = pathArr4[2]) != null) {
                    canvas.drawPath(path3, paint6);
                }
                path2 = pathArr4[1];
                if (path2 != null) {
                    if (i21 != 255) {
                        int alpha = paint3.getAlpha();
                        paint3.setAlpha((int) ((i21 / 255.0f) * alpha));
                        canvas.drawPath(pathArr4[1], paint3);
                        paint3.setAlpha(alpha);
                    } else {
                        canvas.drawPath(path2, paint3);
                    }
                }
                canvas.restore();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            j = jCurrentTimeMillis - this.lastAnimationTime;
            if (j > 17) {
                j2 = 17;
            } else {
                j2 = j;
            }
            this.lastAnimationTime = jCurrentTimeMillis;
            i19 = this.currentIcon;
            if (i19 != 3 || i19 == 14 || ((i19 == 4 && this.nextIcon == 14) || i19 == 10 || i19 == 13)) {
                f22 = ((360 * j2) / 2500.0f) + this.downloadRadOffset;
                this.downloadRadOffset = f22;
                while (f22 > 360.0f) {
                    f22 -= 360.0f;
                }
                this.downloadRadOffset = f22;
                if (this.nextIcon != 2) {
                    f23 = this.downloadProgress;
                    f24 = this.downloadProgressAnimationStart;
                    f25 = f23 - f24;
                    if (f25 > 0.0f) {
                        f26 = this.downloadProgressTime + j2;
                        this.downloadProgressTime = f26;
                        if (f26 >= 200.0f) {
                            this.animatedDownloadProgress = f23;
                            this.downloadProgressAnimationStart = f23;
                            this.downloadProgressTime = 0.0f;
                        } else {
                            this.animatedDownloadProgress = (this.interpolator.getInterpolation(f26 / 200.0f) * f25) + f24;
                        }
                    }
                }
                invalidateSelf();
            }
            if (this.animatingTransition) {
                f27 = this.transitionProgress;
                if (f27 < 1.0f) {
                    f28 = (j2 / this.transitionAnimationTime) + f27;
                    this.transitionProgress = f28;
                    if (f28 >= 1.0f) {
                        this.currentIcon = this.nextIcon;
                        this.transitionProgress = 1.0f;
                        this.animatingTransition = false;
                    }
                    invalidateSelf();
                }
            }
            i20 = i2;
            if (i20 >= 1) {
                canvas.restoreToCount(i20);
            }
        }
        i3 = 15;
        z = false;
        applyShaderMatrix(z);
        int i48 = this.nextIcon;
        if (i48 != 2) {
            if (i48 != i3 && i48 != 0 && i48 != 1 && i48 != 5 && i48 != 8 && i48 != 9 && i48 != 7) {
                i25 = 6;
                if (i48 != 6) {
                    if (i48 == 4) {
                        f30 = 1.0f - this.transitionProgress;
                        fDp2 = AndroidUtilities.dp(7.0f) * this.scale;
                        int i49 = (int) (f30 * 255.0f);
                        if (this.currentIcon == 14) {
                            fCenterX = bounds.left;
                            fCenterY = bounds.top;
                        } else {
                            fCenterX = bounds.centerX();
                            fCenterY = bounds.centerY();
                        }
                        iMin = i49;
                        f32 = 0.0f;
                    } else if (i48 == 14 || i48 == 3) {
                        float f70 = this.transitionProgress;
                        float f71 = 1.0f - f70;
                        if (this.currentIcon == 4) {
                            f33 = f70;
                            f32 = 0.0f;
                        } else {
                            f32 = f71 * 45.0f;
                            f33 = 1.0f;
                        }
                        float fDp14 = AndroidUtilities.dp(7.0f) * this.scale;
                        int i50 = (int) (f70 * 255.0f);
                        if (this.nextIcon == 14) {
                            fCenterX = bounds.left;
                            iCenterY = bounds.top;
                        } else {
                            fCenterX = bounds.centerX();
                            iCenterY = bounds.centerY();
                        }
                        float f72 = iCenterY;
                        iMin = i50;
                        f30 = f33;
                        fDp2 = fDp14;
                        fCenterY = f72;
                    } else {
                        fDp2 = this.scale * AndroidUtilities.dp(7.0f);
                        f30 = 1.0f;
                        f32 = 0.0f;
                        fCenterY = 0.0f;
                        fCenterX = 0.0f;
                        iMin = 255;
                    }
                }
                if (f30 != f31) {
                    canvas.save();
                    canvas.scale(f30, f30, fCenterX, fCenterY);
                }
                if (f32 != f) {
                    canvas.save();
                    canvas.rotate(f32, iCenterX, iCenterY2);
                }
                if (iMin != 0) {
                    f34 = iMin;
                    paint6.setAlpha((int) (this.overrideAlpha * f34));
                    if (this.currentIcon != 14 || this.nextIcon == 14) {
                        rectF = rectF3;
                        paint.setAlpha((int) (f34 * this.overrideAlpha));
                        rectF.set(iCenterX - AndroidUtilities.dp(3.5f), iCenterY2 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + iCenterX, AndroidUtilities.dp(3.5f) + iCenterY2);
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint);
                    } else {
                        float f73 = iCenterX;
                        float f74 = f73 - fDp2;
                        float f75 = iCenterY2;
                        float f76 = f75 - fDp2;
                        float f77 = f73 + fDp2;
                        float f78 = f75 + fDp2;
                        rectF = rectF3;
                        canvas.drawLine(f74, f76, f77, f78, paint6);
                        canvas.drawLine(f77, f76, f74, f78, paint6);
                    }
                } else {
                    rectF = rectF3;
                }
                if (f32 != f) {
                    canvas.restore();
                }
                if (f30 != f31) {
                    canvas.restore();
                }
                i26 = this.currentIcon;
                if ((i26 != 3 || i26 == 14 || (i26 == 4 && ((i28 = this.nextIcon) == 14 || i28 == 3))) && iMin != 0) {
                    float fMax3 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                    int iDp10 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                    rectF.set(bounds.left + iDp10, bounds.top + iDp10, bounds.right - iDp10, bounds.bottom - iDp10);
                    i27 = this.currentIcon;
                    if (i27 != 14 || (i27 == 4 && this.nextIcon == 14)) {
                        paint6.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                        rectF2 = rectF;
                        canvas.drawArc(rectF2, 0.0f, 360.0f, false, paint6);
                        paint6.setAlpha(iMin);
                    } else {
                        rectF2 = rectF;
                    }
                    canvas = canvas;
                    canvas.drawArc(rectF2, this.downloadRadOffset, fMax3, false, paint6);
                }
                i4 = this.currentIcon;
                if (i4 == this.nextIcon) {
                    fMax = 1.0f;
                    f11 = 1.0f;
                } else if (i4 != 4) {
                    float f510 = this.transitionProgress;
                    f11 = f510;
                    fMax = 1.0f - f510;
                } else {
                    float f511 = this.transitionProgress;
                    f11 = f511;
                    fMax = 1.0f - f511;
                }
                i5 = this.nextIcon;
                if (i5 == i3) {
                    pathArr2 = Theme.chat_updatePath;
                    pathArr = drawable;
                } else if (this.currentIcon == i3) {
                    pathArr = Theme.chat_updatePath;
                    pathArr2 = drawable;
                } else {
                    pathArr = drawable;
                    pathArr2 = pathArr;
                }
                if (i5 == 5) {
                    pathArr2 = Theme.chat_filePath;
                } else if (this.currentIcon == 5) {
                    pathArr = Theme.chat_filePath;
                }
                pathArr3 = pathArr;
                pathArr4 = pathArr2;
                if (i5 == 7) {
                    drawable2 = Theme.chat_flameIcon;
                } else if (this.currentIcon == 7) {
                    Drawable drawable6 = drawable;
                    drawable = Theme.chat_flameIcon;
                    drawable2 = drawable6;
                } else {
                    drawable2 = drawable;
                }
                if (i5 == 8) {
                    drawable2 = Theme.chat_gifIcon;
                } else if (this.currentIcon == 8) {
                    drawable = Theme.chat_gifIcon;
                }
                drawable3 = drawable2;
                if (this.currentIcon != 9) {
                    applyShaderMatrix(false);
                    if (this.currentIcon == this.nextIcon) {
                        i6 = 255;
                    } else {
                        i6 = (int) (this.transitionProgress * 255.0f);
                    }
                    paint6.setAlpha(i6);
                    int iDp11 = AndroidUtilities.dp(7.0f) + iCenterY2;
                    int iDp12 = iCenterX - AndroidUtilities.dp(3.0f);
                    if (this.currentIcon != this.nextIcon) {
                        canvas.save();
                        float f512 = this.transitionProgress;
                        canvas.scale(f512, f512, iCenterX, iCenterY2);
                    }
                    float f513 = iDp12;
                    float f514 = iDp11;
                    drawable4 = drawable;
                    canvas.drawLine(iDp12 - AndroidUtilities.dp(6.0f), iDp11 - AndroidUtilities.dp(6.0f), f513, f514, paint6);
                    canvas = canvas;
                    canvas.drawLine(f513, f514, AndroidUtilities.dp(12.0f) + iDp12, iDp11 - AndroidUtilities.dp(12.0f), paint6);
                    if (this.currentIcon != this.nextIcon) {
                        canvas.restore();
                    }
                } else {
                    applyShaderMatrix(false);
                    if (this.currentIcon == this.nextIcon) {
                        i6 = 255;
                    } else {
                        i6 = (int) (this.transitionProgress * 255.0f);
                    }
                    paint6.setAlpha(i6);
                    int iDp13 = AndroidUtilities.dp(7.0f) + iCenterY2;
                    int iDp14 = iCenterX - AndroidUtilities.dp(3.0f);
                    if (this.currentIcon != this.nextIcon) {
                        canvas.save();
                        float f515 = this.transitionProgress;
                        canvas.scale(f515, f515, iCenterX, iCenterY2);
                    }
                    float f516 = iDp14;
                    float f517 = iDp13;
                    drawable4 = drawable;
                    canvas.drawLine(iDp14 - AndroidUtilities.dp(6.0f), iDp13 - AndroidUtilities.dp(6.0f), f516, f517, paint6);
                    canvas = canvas;
                    canvas.drawLine(f516, f517, AndroidUtilities.dp(12.0f) + iDp14, iDp13 - AndroidUtilities.dp(12.0f), paint6);
                    if (this.currentIcon != this.nextIcon) {
                        canvas.restore();
                    }
                }
                if (this.currentIcon != 12) {
                    applyShaderMatrix(false);
                    i7 = this.currentIcon;
                    i8 = this.nextIcon;
                    if (i7 == i8) {
                        f12 = 1.0f;
                    } else if (i8 == 13) {
                        f12 = this.transitionProgress;
                    } else {
                        f12 = 1.0f - this.transitionProgress;
                    }
                    if (i7 == i8) {
                        i9 = 255;
                    } else {
                        i9 = (int) (f12 * 255.0f);
                    }
                    paint6.setAlpha(i9);
                    AndroidUtilities.dp(7.0f);
                    AndroidUtilities.dp(3.0f);
                    if (this.currentIcon != this.nextIcon) {
                        canvas.save();
                        canvas.scale(f12, f12, iCenterX, iCenterY2);
                    }
                    float fDp15 = AndroidUtilities.dp(7.0f) * this.scale;
                    float f518 = iCenterX;
                    float f519 = f518 - fDp15;
                    float f610 = iCenterY2;
                    float f611 = f610 - fDp15;
                    float f612 = f518 + fDp15;
                    float f613 = f610 + fDp15;
                    canvas.drawLine(f519, f611, f612, f613, paint6);
                    canvas.drawLine(f612, f611, f519, f613, paint6);
                    if (this.currentIcon != this.nextIcon) {
                        canvas.restore();
                    }
                } else {
                    applyShaderMatrix(false);
                    i7 = this.currentIcon;
                    i8 = this.nextIcon;
                    if (i7 == i8) {
                        f12 = 1.0f;
                    } else if (i8 == 13) {
                        f12 = this.transitionProgress;
                    } else {
                        f12 = 1.0f - this.transitionProgress;
                    }
                    if (i7 == i8) {
                        i9 = 255;
                    } else {
                        i9 = (int) (f12 * 255.0f);
                    }
                    paint6.setAlpha(i9);
                    AndroidUtilities.dp(7.0f);
                    AndroidUtilities.dp(3.0f);
                    if (this.currentIcon != this.nextIcon) {
                        canvas.save();
                        canvas.scale(f12, f12, iCenterX, iCenterY2);
                    }
                    float fDp16 = AndroidUtilities.dp(7.0f) * this.scale;
                    float f5110 = iCenterX;
                    float f5111 = f5110 - fDp16;
                    float f614 = iCenterY2;
                    float f615 = f614 - fDp16;
                    float f616 = f5110 + fDp16;
                    float f617 = f614 + fDp16;
                    canvas.drawLine(f5111, f615, f616, f617, paint6);
                    canvas.drawLine(f616, f615, f5111, f617, paint6);
                    if (this.currentIcon != this.nextIcon) {
                        canvas.restore();
                    }
                }
                if (this.currentIcon != 13) {
                    applyShaderMatrix(false);
                    i10 = this.currentIcon;
                    i11 = this.nextIcon;
                    if (i10 == i11) {
                        f13 = 1.0f;
                    } else if (i11 == 13) {
                        f13 = this.transitionProgress;
                    } else {
                        f13 = 1.0f - this.transitionProgress;
                    }
                    textPaint = this.textPaint;
                    textPaint.setAlpha((int) (f13 * 255.0f));
                    int iDp15 = AndroidUtilities.dp(5.0f) + iCenterY2;
                    f14 = 5.0f;
                    int i410 = iCenterX - (this.percentStringWidth / 2);
                    rect = bounds;
                    f15 = fMax;
                    if (this.currentIcon != this.nextIcon) {
                        canvas.save();
                        canvas.scale(f13, f13, iCenterX, iCenterY2);
                    }
                    i12 = (int) (this.animatedDownloadProgress * 100.0f);
                    if (this.percentString != null) {
                        this.lastPercent = i12;
                        String str2 = String.format("%d%%", Integer.valueOf(i12));
                        this.percentString = str2;
                        this.percentStringWidth = (int) Math.ceil(textPaint.measureText(str2));
                    } else {
                        this.lastPercent = i12;
                        String str3 = String.format("%d%%", Integer.valueOf(i12));
                        this.percentString = str3;
                        this.percentStringWidth = (int) Math.ceil(textPaint.measureText(str3));
                    }
                    canvas.drawText(this.percentString, i410, iDp15, textPaint);
                    if (this.currentIcon != this.nextIcon) {
                        canvas.restore();
                    }
                } else {
                    applyShaderMatrix(false);
                    i10 = this.currentIcon;
                    i11 = this.nextIcon;
                    if (i10 == i11) {
                        f13 = 1.0f;
                    } else if (i11 == 13) {
                        f13 = this.transitionProgress;
                    } else {
                        f13 = 1.0f - this.transitionProgress;
                    }
                    textPaint = this.textPaint;
                    textPaint.setAlpha((int) (f13 * 255.0f));
                    int iDp16 = AndroidUtilities.dp(5.0f) + iCenterY2;
                    f14 = 5.0f;
                    int i411 = iCenterX - (this.percentStringWidth / 2);
                    rect = bounds;
                    f15 = fMax;
                    if (this.currentIcon != this.nextIcon) {
                        canvas.save();
                        canvas.scale(f13, f13, iCenterX, iCenterY2);
                    }
                    i12 = (int) (this.animatedDownloadProgress * 100.0f);
                    if (this.percentString != null) {
                        this.lastPercent = i12;
                        String str4 = String.format("%d%%", Integer.valueOf(i12));
                        this.percentString = str4;
                        this.percentStringWidth = (int) Math.ceil(textPaint.measureText(str4));
                    } else {
                        this.lastPercent = i12;
                        String str5 = String.format("%d%%", Integer.valueOf(i12));
                        this.percentString = str5;
                        this.percentStringWidth = (int) Math.ceil(textPaint.measureText(str5));
                    }
                    canvas.drawText(this.percentString, i411, iDp16, textPaint);
                    if (this.currentIcon != this.nextIcon) {
                        canvas.restore();
                    }
                }
                i13 = this.currentIcon;
                i14 = 1;
                if (i13 != 0) {
                    if (i13 == 0) {
                        if (i13 == 1) {
                            if (this.nextIcon != 0) {
                                i14 = 1;
                            } else if (this.animatingTransition) {
                                if (this.nextIcon == 0) {
                                    f16 = 1.0f - this.transitionProgress;
                                } else {
                                    f16 = this.transitionProgress;
                                }
                                i14 = 1;
                            } else {
                                i14 = 1;
                                if (this.nextIcon == 1) {
                                    f16 = 1.0f;
                                } else {
                                    f16 = 0.0f;
                                }
                            }
                            i15 = this.nextIcon;
                            if (i15 != 0) {
                                paint2 = paint5;
                                paint2.setAlpha(255);
                            } else {
                                paint2 = paint5;
                                paint2.setAlpha(255);
                            }
                            applyShaderMatrix(true);
                            canvas.save();
                            canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                            float f618 = f16 * 500.0f;
                            i16 = this.currentIcon;
                            if (i16 == 1) {
                                f17 = 90.0f;
                            } else {
                                f17 = 0.0f;
                            }
                            if (i16 != 0) {
                                if (i16 == 1) {
                                    interpolation = f17;
                                } else {
                                    interpolation = f17;
                                }
                            } else if (i16 == 1) {
                                interpolation = f17;
                            } else {
                                interpolation = f17;
                            }
                            canvas.rotate(interpolation);
                            i17 = this.currentIcon;
                            if (i17 == 0) {
                                canvas.scale(f11, f11);
                            } else {
                                canvas.scale(f11, f11);
                            }
                            Theme.playPauseAnimator.draw(canvas, paint2, f618);
                            canvas.scale(1.0f, -1.0f);
                            Theme.playPauseAnimator.draw(canvas, paint2, f618);
                            canvas.restore();
                        }
                        if (i13 == i14) {
                            f16 = 1.0f;
                        } else {
                            f16 = 0.0f;
                        }
                        i15 = this.nextIcon;
                        if (i15 != 0) {
                            paint2 = paint5;
                            paint2.setAlpha(255);
                        } else {
                            paint2 = paint5;
                            paint2.setAlpha(255);
                        }
                        applyShaderMatrix(true);
                        canvas.save();
                        canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                        float f619 = f16 * 500.0f;
                        i16 = this.currentIcon;
                        if (i16 == 1) {
                            f17 = 90.0f;
                        } else {
                            f17 = 0.0f;
                        }
                        if (i16 != 0) {
                            if (i16 == 1) {
                                interpolation = f17;
                            } else {
                                interpolation = f17;
                            }
                        } else if (i16 == 1) {
                            interpolation = f17;
                        } else {
                            interpolation = f17;
                        }
                        canvas.rotate(interpolation);
                        i17 = this.currentIcon;
                        if (i17 == 0) {
                            canvas.scale(f11, f11);
                        } else {
                            canvas.scale(f11, f11);
                        }
                        Theme.playPauseAnimator.draw(canvas, paint2, f619);
                        canvas.scale(1.0f, -1.0f);
                        Theme.playPauseAnimator.draw(canvas, paint2, f619);
                        canvas.restore();
                    } else {
                        if (i13 == 1) {
                            if (this.nextIcon != 0) {
                                i14 = 1;
                            } else if (this.animatingTransition) {
                                if (this.nextIcon == 0) {
                                    f16 = 1.0f - this.transitionProgress;
                                } else {
                                    f16 = this.transitionProgress;
                                }
                                i14 = 1;
                            } else {
                                i14 = 1;
                                if (this.nextIcon == 1) {
                                    f16 = 1.0f;
                                } else {
                                    f16 = 0.0f;
                                }
                            }
                            i15 = this.nextIcon;
                            if (i15 != 0) {
                                paint2 = paint5;
                                paint2.setAlpha(255);
                            } else {
                                paint2 = paint5;
                                paint2.setAlpha(255);
                            }
                            applyShaderMatrix(true);
                            canvas.save();
                            canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                            float f6110 = f16 * 500.0f;
                            i16 = this.currentIcon;
                            if (i16 == 1) {
                                f17 = 90.0f;
                            } else {
                                f17 = 0.0f;
                            }
                            if (i16 != 0) {
                                if (i16 == 1) {
                                    interpolation = f17;
                                } else {
                                    interpolation = f17;
                                }
                            } else if (i16 == 1) {
                                interpolation = f17;
                            } else {
                                interpolation = f17;
                            }
                            canvas.rotate(interpolation);
                            i17 = this.currentIcon;
                            if (i17 == 0) {
                                canvas.scale(f11, f11);
                            } else {
                                canvas.scale(f11, f11);
                            }
                            Theme.playPauseAnimator.draw(canvas, paint2, f6110);
                            canvas.scale(1.0f, -1.0f);
                            Theme.playPauseAnimator.draw(canvas, paint2, f6110);
                            canvas.restore();
                        }
                        if (i13 == i14) {
                            f16 = 1.0f;
                        } else {
                            f16 = 0.0f;
                        }
                        i15 = this.nextIcon;
                        if (i15 != 0) {
                            paint2 = paint5;
                            paint2.setAlpha(255);
                        } else {
                            paint2 = paint5;
                            paint2.setAlpha(255);
                        }
                        applyShaderMatrix(true);
                        canvas.save();
                        canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                        float f6111 = f16 * 500.0f;
                        i16 = this.currentIcon;
                        if (i16 == 1) {
                            f17 = 90.0f;
                        } else {
                            f17 = 0.0f;
                        }
                        if (i16 != 0) {
                            if (i16 == 1) {
                                interpolation = f17;
                            } else {
                                interpolation = f17;
                            }
                        } else if (i16 == 1) {
                            interpolation = f17;
                        } else {
                            interpolation = f17;
                        }
                        canvas.rotate(interpolation);
                        i17 = this.currentIcon;
                        if (i17 == 0) {
                            canvas.scale(f11, f11);
                        } else {
                            canvas.scale(f11, f11);
                        }
                        Theme.playPauseAnimator.draw(canvas, paint2, f6111);
                        canvas.scale(1.0f, -1.0f);
                        Theme.playPauseAnimator.draw(canvas, paint2, f6111);
                        canvas.restore();
                    }
                } else if (i13 == 0) {
                    if (i13 == 1) {
                        if (this.nextIcon != 0) {
                            i14 = 1;
                        } else if (this.animatingTransition) {
                            if (this.nextIcon == 0) {
                                f16 = 1.0f - this.transitionProgress;
                            } else {
                                f16 = this.transitionProgress;
                            }
                            i14 = 1;
                        } else {
                            i14 = 1;
                            if (this.nextIcon == 1) {
                                f16 = 1.0f;
                            } else {
                                f16 = 0.0f;
                            }
                        }
                        i15 = this.nextIcon;
                        if (i15 != 0) {
                            paint2 = paint5;
                            paint2.setAlpha(255);
                        } else {
                            paint2 = paint5;
                            paint2.setAlpha(255);
                        }
                        applyShaderMatrix(true);
                        canvas.save();
                        canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                        float f6112 = f16 * 500.0f;
                        i16 = this.currentIcon;
                        if (i16 == 1) {
                            f17 = 90.0f;
                        } else {
                            f17 = 0.0f;
                        }
                        if (i16 != 0) {
                            if (i16 == 1) {
                                interpolation = f17;
                            } else {
                                interpolation = f17;
                            }
                        } else if (i16 == 1) {
                            interpolation = f17;
                        } else {
                            interpolation = f17;
                        }
                        canvas.rotate(interpolation);
                        i17 = this.currentIcon;
                        if (i17 == 0) {
                            canvas.scale(f11, f11);
                        } else {
                            canvas.scale(f11, f11);
                        }
                        Theme.playPauseAnimator.draw(canvas, paint2, f6112);
                        canvas.scale(1.0f, -1.0f);
                        Theme.playPauseAnimator.draw(canvas, paint2, f6112);
                        canvas.restore();
                    }
                    if (i13 == i14) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    i15 = this.nextIcon;
                    if (i15 != 0) {
                        paint2 = paint5;
                        paint2.setAlpha(255);
                    } else {
                        paint2 = paint5;
                        paint2.setAlpha(255);
                    }
                    applyShaderMatrix(true);
                    canvas.save();
                    canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                    float f6113 = f16 * 500.0f;
                    i16 = this.currentIcon;
                    if (i16 == 1) {
                        f17 = 90.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    if (i16 != 0) {
                        if (i16 == 1) {
                            interpolation = f17;
                        } else {
                            interpolation = f17;
                        }
                    } else if (i16 == 1) {
                        interpolation = f17;
                    } else {
                        interpolation = f17;
                    }
                    canvas.rotate(interpolation);
                    i17 = this.currentIcon;
                    if (i17 == 0) {
                        canvas.scale(f11, f11);
                    } else {
                        canvas.scale(f11, f11);
                    }
                    Theme.playPauseAnimator.draw(canvas, paint2, f6113);
                    canvas.scale(1.0f, -1.0f);
                    Theme.playPauseAnimator.draw(canvas, paint2, f6113);
                    canvas.restore();
                } else {
                    if (i13 == 1) {
                        if (this.nextIcon != 0) {
                            i14 = 1;
                        } else if (this.animatingTransition) {
                            if (this.nextIcon == 0) {
                                f16 = 1.0f - this.transitionProgress;
                            } else {
                                f16 = this.transitionProgress;
                            }
                            i14 = 1;
                        } else {
                            i14 = 1;
                            if (this.nextIcon == 1) {
                                f16 = 1.0f;
                            } else {
                                f16 = 0.0f;
                            }
                        }
                        i15 = this.nextIcon;
                        if (i15 != 0) {
                            paint2 = paint5;
                            paint2.setAlpha(255);
                        } else {
                            paint2 = paint5;
                            paint2.setAlpha(255);
                        }
                        applyShaderMatrix(true);
                        canvas.save();
                        canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                        float f6114 = f16 * 500.0f;
                        i16 = this.currentIcon;
                        if (i16 == 1) {
                            f17 = 90.0f;
                        } else {
                            f17 = 0.0f;
                        }
                        if (i16 != 0) {
                            if (i16 == 1) {
                                interpolation = f17;
                            } else {
                                interpolation = f17;
                            }
                        } else if (i16 == 1) {
                            interpolation = f17;
                        } else {
                            interpolation = f17;
                        }
                        canvas.rotate(interpolation);
                        i17 = this.currentIcon;
                        if (i17 == 0) {
                            canvas.scale(f11, f11);
                        } else {
                            canvas.scale(f11, f11);
                        }
                        Theme.playPauseAnimator.draw(canvas, paint2, f6114);
                        canvas.scale(1.0f, -1.0f);
                        Theme.playPauseAnimator.draw(canvas, paint2, f6114);
                        canvas.restore();
                    }
                    if (i13 == i14) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    i15 = this.nextIcon;
                    if (i15 != 0) {
                        paint2 = paint5;
                        paint2.setAlpha(255);
                    } else {
                        paint2 = paint5;
                        paint2.setAlpha(255);
                    }
                    applyShaderMatrix(true);
                    canvas.save();
                    canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                    float f6115 = f16 * 500.0f;
                    i16 = this.currentIcon;
                    if (i16 == 1) {
                        f17 = 90.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    if (i16 != 0) {
                        if (i16 == 1) {
                            interpolation = f17;
                        } else {
                            interpolation = f17;
                        }
                    } else if (i16 == 1) {
                        interpolation = f17;
                    } else {
                        interpolation = f17;
                    }
                    canvas.rotate(interpolation);
                    i17 = this.currentIcon;
                    if (i17 == 0) {
                        canvas.scale(f11, f11);
                    } else {
                        canvas.scale(f11, f11);
                    }
                    Theme.playPauseAnimator.draw(canvas, paint2, f6115);
                    canvas.scale(1.0f, -1.0f);
                    Theme.playPauseAnimator.draw(canvas, paint2, f6115);
                    canvas.restore();
                }
                if (this.currentIcon != 6) {
                    applyShaderMatrix(false);
                    if (this.currentIcon != 6) {
                        f19 = this.transitionProgress;
                        if (f19 > 0.5f) {
                            f21 = (f19 - 0.5f) / 0.5f;
                            fMin = 1.0f - Math.min(1.0f, f21 / 0.5f);
                            if (f21 > 0.5f) {
                                f20 = (f21 - 0.5f) / 0.5f;
                            } else {
                                f20 = 0.0f;
                            }
                        } else {
                            f20 = 0.0f;
                            fMin = 1.0f;
                        }
                        paint6.setAlpha(255);
                        f18 = f20;
                    } else {
                        if (this.nextIcon != 6) {
                            paint6.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                        } else {
                            paint6.setAlpha(255);
                        }
                        fMin = 0.0f;
                        f18 = 1.0f;
                    }
                    iDp = AndroidUtilities.dp(7.0f) + iCenterY2;
                    iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                    if (fMin < 1.0f) {
                        canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin), iDp - (AndroidUtilities.dp(6.0f) * fMin), paint6);
                    }
                    if (f18 > 0.0f) {
                        float f620 = iDp2;
                        float f621 = iDp;
                        canvas = canvas;
                        canvas.drawLine(f620, f621, (AndroidUtilities.dp(12.0f) * f18) + f620, f621 - (AndroidUtilities.dp(12.0f) * f18), paint6);
                    } else {
                        canvas = canvas;
                    }
                } else {
                    applyShaderMatrix(false);
                    if (this.currentIcon != 6) {
                        f19 = this.transitionProgress;
                        if (f19 > 0.5f) {
                            f21 = (f19 - 0.5f) / 0.5f;
                            fMin = 1.0f - Math.min(1.0f, f21 / 0.5f);
                            if (f21 > 0.5f) {
                                f20 = (f21 - 0.5f) / 0.5f;
                            } else {
                                f20 = 0.0f;
                            }
                        } else {
                            f20 = 0.0f;
                            fMin = 1.0f;
                        }
                        paint6.setAlpha(255);
                        f18 = f20;
                    } else {
                        if (this.nextIcon != 6) {
                            paint6.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                        } else {
                            paint6.setAlpha(255);
                        }
                        fMin = 0.0f;
                        f18 = 1.0f;
                    }
                    iDp = AndroidUtilities.dp(7.0f) + iCenterY2;
                    iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                    if (fMin < 1.0f) {
                        canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin), iDp - (AndroidUtilities.dp(6.0f) * fMin), paint6);
                    }
                    if (f18 > 0.0f) {
                        float f622 = iDp2;
                        float f623 = iDp;
                        canvas = canvas;
                        canvas.drawLine(f622, f623, (AndroidUtilities.dp(12.0f) * f18) + f622, f623 - (AndroidUtilities.dp(12.0f) * f18), paint6);
                    } else {
                        canvas = canvas;
                    }
                }
                if (drawable4 != null) {
                    int intrinsicWidth3 = (int) (drawable4.getIntrinsicWidth() * f15);
                    int intrinsicHeight3 = (int) (drawable4.getIntrinsicHeight() * f15);
                    drawable4.setColorFilter(this.colorFilter);
                    if (this.currentIcon == this.nextIcon) {
                        i23 = 255;
                    } else {
                        i23 = (int) ((1.0f - this.transitionProgress) * 255.0f);
                    }
                    drawable4.setAlpha(i23);
                    int i412 = intrinsicWidth3 / 2;
                    int i413 = intrinsicHeight3 / 2;
                    drawable4.setBounds(iCenterX - i412, iCenterY2 - i413, i412 + iCenterX, iCenterY2 + i413);
                    drawable4.draw(canvas);
                }
                if (drawable3 != null) {
                    int intrinsicWidth4 = (int) (drawable3.getIntrinsicWidth() * f11);
                    int intrinsicHeight4 = (int) (drawable3.getIntrinsicHeight() * f11);
                    drawable3.setColorFilter(this.colorFilter);
                    if (this.currentIcon == this.nextIcon) {
                        i22 = 255;
                    } else {
                        i22 = (int) (this.transitionProgress * 255.0f);
                    }
                    drawable3.setAlpha(i22);
                    int i414 = intrinsicWidth4 / 2;
                    int i415 = intrinsicHeight4 / 2;
                    drawable3.setBounds(iCenterX - i414, iCenterY2 - i415, i414 + iCenterX, iCenterY2 + i415);
                    drawable3.draw(canvas);
                }
                paint3 = this.backPaint;
                if (pathArr3 != null) {
                    i18 = iCenterY2;
                } else {
                    i18 = iCenterY2;
                }
                if (pathArr4 != null) {
                    int iDp17 = AndroidUtilities.dp(24.0f);
                    if (this.currentIcon == this.nextIcon) {
                        i21 = 255;
                    } else {
                        i21 = (int) (this.transitionProgress * 255.0f);
                    }
                    paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                    paint2.setAlpha(i21);
                    applyShaderMatrix(true);
                    canvas.save();
                    canvas.translate(iCenterX, i18);
                    canvas.scale(f11, f11);
                    float f624 = (-iDp17) / 2;
                    canvas.translate(f624, f624);
                    path = pathArr4[0];
                    if (path != null) {
                        canvas.drawPath(path, paint2);
                    }
                    if (pathArr4.length >= 3) {
                        canvas.drawPath(path3, paint6);
                    }
                    path2 = pathArr4[1];
                    if (path2 != null) {
                        if (i21 != 255) {
                            int alpha2 = paint3.getAlpha();
                            paint3.setAlpha((int) ((i21 / 255.0f) * alpha2));
                            canvas.drawPath(pathArr4[1], paint3);
                            paint3.setAlpha(alpha2);
                        } else {
                            canvas.drawPath(path2, paint3);
                        }
                    }
                    canvas.restore();
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                j = jCurrentTimeMillis2 - this.lastAnimationTime;
                if (j > 17) {
                    j2 = 17;
                } else {
                    j2 = j;
                }
                this.lastAnimationTime = jCurrentTimeMillis2;
                i19 = this.currentIcon;
                if (i19 != 3) {
                    f22 = ((360 * j2) / 2500.0f) + this.downloadRadOffset;
                    this.downloadRadOffset = f22;
                    while (f22 > 360.0f) {
                        f22 -= 360.0f;
                    }
                    this.downloadRadOffset = f22;
                    if (this.nextIcon != 2) {
                        f23 = this.downloadProgress;
                        f24 = this.downloadProgressAnimationStart;
                        f25 = f23 - f24;
                        if (f25 > 0.0f) {
                            f26 = this.downloadProgressTime + j2;
                            this.downloadProgressTime = f26;
                            if (f26 >= 200.0f) {
                                this.animatedDownloadProgress = f23;
                                this.downloadProgressAnimationStart = f23;
                                this.downloadProgressTime = 0.0f;
                            } else {
                                this.animatedDownloadProgress = (this.interpolator.getInterpolation(f26 / 200.0f) * f25) + f24;
                            }
                        }
                    }
                    invalidateSelf();
                } else {
                    f22 = ((360 * j2) / 2500.0f) + this.downloadRadOffset;
                    this.downloadRadOffset = f22;
                    while (f22 > 360.0f) {
                        f22 -= 360.0f;
                    }
                    this.downloadRadOffset = f22;
                    if (this.nextIcon != 2) {
                        f23 = this.downloadProgress;
                        f24 = this.downloadProgressAnimationStart;
                        f25 = f23 - f24;
                        if (f25 > 0.0f) {
                            f26 = this.downloadProgressTime + j2;
                            this.downloadProgressTime = f26;
                            if (f26 >= 200.0f) {
                                this.animatedDownloadProgress = f23;
                                this.downloadProgressAnimationStart = f23;
                                this.downloadProgressTime = 0.0f;
                            } else {
                                this.animatedDownloadProgress = (this.interpolator.getInterpolation(f26 / 200.0f) * f25) + f24;
                            }
                        }
                    }
                    invalidateSelf();
                }
                if (this.animatingTransition) {
                    f27 = this.transitionProgress;
                    if (f27 < 1.0f) {
                        f28 = (j2 / this.transitionAnimationTime) + f27;
                        this.transitionProgress = f28;
                        if (f28 >= 1.0f) {
                            this.currentIcon = this.nextIcon;
                            this.transitionProgress = 1.0f;
                            this.animatingTransition = false;
                        }
                        invalidateSelf();
                    }
                }
                i20 = i2;
                if (i20 >= 1) {
                    canvas.restoreToCount(i20);
                }
            }
            i25 = 6;
            if (i48 == i25) {
                f29 = 1.0f;
                fMin2 = Math.min(1.0f, this.transitionProgress / 0.5f);
            } else {
                f29 = 1.0f;
                fMin2 = this.transitionProgress;
            }
            float f79 = f29 - fMin2;
            float fCenterX2 = bounds.centerX();
            float fCenterY2 = bounds.centerY();
            float fDp17 = AndroidUtilities.dp(7.0f) * f79 * this.scale;
            fCenterX = fCenterX2;
            iMin = (int) (Math.min(f29, f79 * 2.0f) * 255.0f);
            f30 = f79;
            f31 = 1.0f;
            fCenterY = fCenterY2;
            fDp2 = fDp17;
            f32 = 0.0f;
            if (f30 != f31) {
                canvas.save();
                canvas.scale(f30, f30, fCenterX, fCenterY);
            }
            if (f32 != f) {
                canvas.save();
                canvas.rotate(f32, iCenterX, iCenterY2);
            }
            if (iMin != 0) {
                f34 = iMin;
                paint6.setAlpha((int) (this.overrideAlpha * f34));
                if (this.currentIcon != 14) {
                    rectF = rectF3;
                    paint.setAlpha((int) (f34 * this.overrideAlpha));
                    rectF.set(iCenterX - AndroidUtilities.dp(3.5f), iCenterY2 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + iCenterX, AndroidUtilities.dp(3.5f) + iCenterY2);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint);
                } else {
                    rectF = rectF3;
                    paint.setAlpha((int) (f34 * this.overrideAlpha));
                    rectF.set(iCenterX - AndroidUtilities.dp(3.5f), iCenterY2 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + iCenterX, AndroidUtilities.dp(3.5f) + iCenterY2);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint);
                }
            } else {
                rectF = rectF3;
            }
            if (f32 != f) {
                canvas.restore();
            }
            if (f30 != f31) {
                canvas.restore();
            }
            i26 = this.currentIcon;
            if (i26 != 3) {
                float fMax4 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                int iDp18 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                rectF.set(bounds.left + iDp18, bounds.top + iDp18, bounds.right - iDp18, bounds.bottom - iDp18);
                i27 = this.currentIcon;
                if (i27 != 14) {
                    paint6.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                    rectF2 = rectF;
                    canvas.drawArc(rectF2, 0.0f, 360.0f, false, paint6);
                    paint6.setAlpha(iMin);
                } else {
                    paint6.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                    rectF2 = rectF;
                    canvas.drawArc(rectF2, 0.0f, 360.0f, false, paint6);
                    paint6.setAlpha(iMin);
                }
                canvas = canvas;
                canvas.drawArc(rectF2, this.downloadRadOffset, fMax4, false, paint6);
            } else {
                float fMax5 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                int iDp19 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                rectF.set(bounds.left + iDp19, bounds.top + iDp19, bounds.right - iDp19, bounds.bottom - iDp19);
                i27 = this.currentIcon;
                if (i27 != 14) {
                    paint6.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                    rectF2 = rectF;
                    canvas.drawArc(rectF2, 0.0f, 360.0f, false, paint6);
                    paint6.setAlpha(iMin);
                } else {
                    paint6.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                    rectF2 = rectF;
                    canvas.drawArc(rectF2, 0.0f, 360.0f, false, paint6);
                    paint6.setAlpha(iMin);
                }
                canvas = canvas;
                canvas.drawArc(rectF2, this.downloadRadOffset, fMax5, false, paint6);
            }
            i4 = this.currentIcon;
            if (i4 == this.nextIcon) {
                fMax = 1.0f;
                f11 = 1.0f;
            } else if (i4 != 4) {
                float f5112 = this.transitionProgress;
                f11 = f5112;
                fMax = 1.0f - f5112;
            } else {
                float f5113 = this.transitionProgress;
                f11 = f5113;
                fMax = 1.0f - f5113;
            }
            i5 = this.nextIcon;
            if (i5 == i3) {
                pathArr2 = Theme.chat_updatePath;
                pathArr = drawable;
            } else if (this.currentIcon == i3) {
                pathArr = Theme.chat_updatePath;
                pathArr2 = drawable;
            } else {
                pathArr = drawable;
                pathArr2 = pathArr;
            }
            if (i5 == 5) {
                pathArr2 = Theme.chat_filePath;
            } else if (this.currentIcon == 5) {
                pathArr = Theme.chat_filePath;
            }
            pathArr3 = pathArr;
            pathArr4 = pathArr2;
            if (i5 == 7) {
                drawable2 = Theme.chat_flameIcon;
            } else if (this.currentIcon == 7) {
                Drawable drawable7 = drawable;
                drawable = Theme.chat_flameIcon;
                drawable2 = drawable7;
            } else {
                drawable2 = drawable;
            }
            if (i5 == 8) {
                drawable2 = Theme.chat_gifIcon;
            } else if (this.currentIcon == 8) {
                drawable = Theme.chat_gifIcon;
            }
            drawable3 = drawable2;
            if (this.currentIcon != 9) {
                applyShaderMatrix(false);
                if (this.currentIcon == this.nextIcon) {
                    i6 = 255;
                } else {
                    i6 = (int) (this.transitionProgress * 255.0f);
                }
                paint6.setAlpha(i6);
                int iDp110 = AndroidUtilities.dp(7.0f) + iCenterY2;
                int iDp111 = iCenterX - AndroidUtilities.dp(3.0f);
                if (this.currentIcon != this.nextIcon) {
                    canvas.save();
                    float f5114 = this.transitionProgress;
                    canvas.scale(f5114, f5114, iCenterX, iCenterY2);
                }
                float f5115 = iDp111;
                float f5116 = iDp110;
                drawable4 = drawable;
                canvas.drawLine(iDp111 - AndroidUtilities.dp(6.0f), iDp110 - AndroidUtilities.dp(6.0f), f5115, f5116, paint6);
                canvas = canvas;
                canvas.drawLine(f5115, f5116, AndroidUtilities.dp(12.0f) + iDp111, iDp110 - AndroidUtilities.dp(12.0f), paint6);
                if (this.currentIcon != this.nextIcon) {
                    canvas.restore();
                }
            } else {
                applyShaderMatrix(false);
                if (this.currentIcon == this.nextIcon) {
                    i6 = 255;
                } else {
                    i6 = (int) (this.transitionProgress * 255.0f);
                }
                paint6.setAlpha(i6);
                int iDp112 = AndroidUtilities.dp(7.0f) + iCenterY2;
                int iDp113 = iCenterX - AndroidUtilities.dp(3.0f);
                if (this.currentIcon != this.nextIcon) {
                    canvas.save();
                    float f5117 = this.transitionProgress;
                    canvas.scale(f5117, f5117, iCenterX, iCenterY2);
                }
                float f5118 = iDp113;
                float f5119 = iDp112;
                drawable4 = drawable;
                canvas.drawLine(iDp113 - AndroidUtilities.dp(6.0f), iDp112 - AndroidUtilities.dp(6.0f), f5118, f5119, paint6);
                canvas = canvas;
                canvas.drawLine(f5118, f5119, AndroidUtilities.dp(12.0f) + iDp113, iDp112 - AndroidUtilities.dp(12.0f), paint6);
                if (this.currentIcon != this.nextIcon) {
                    canvas.restore();
                }
            }
            if (this.currentIcon != 12) {
                applyShaderMatrix(false);
                i7 = this.currentIcon;
                i8 = this.nextIcon;
                if (i7 == i8) {
                    f12 = 1.0f;
                } else if (i8 == 13) {
                    f12 = this.transitionProgress;
                } else {
                    f12 = 1.0f - this.transitionProgress;
                }
                if (i7 == i8) {
                    i9 = 255;
                } else {
                    i9 = (int) (f12 * 255.0f);
                }
                paint6.setAlpha(i9);
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.currentIcon != this.nextIcon) {
                    canvas.save();
                    canvas.scale(f12, f12, iCenterX, iCenterY2);
                }
                float fDp18 = AndroidUtilities.dp(7.0f) * this.scale;
                float f51110 = iCenterX;
                float f51111 = f51110 - fDp18;
                float f6116 = iCenterY2;
                float f6117 = f6116 - fDp18;
                float f6118 = f51110 + fDp18;
                float f6119 = f6116 + fDp18;
                canvas.drawLine(f51111, f6117, f6118, f6119, paint6);
                canvas.drawLine(f6118, f6117, f51111, f6119, paint6);
                if (this.currentIcon != this.nextIcon) {
                    canvas.restore();
                }
            } else {
                applyShaderMatrix(false);
                i7 = this.currentIcon;
                i8 = this.nextIcon;
                if (i7 == i8) {
                    f12 = 1.0f;
                } else if (i8 == 13) {
                    f12 = this.transitionProgress;
                } else {
                    f12 = 1.0f - this.transitionProgress;
                }
                if (i7 == i8) {
                    i9 = 255;
                } else {
                    i9 = (int) (f12 * 255.0f);
                }
                paint6.setAlpha(i9);
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.currentIcon != this.nextIcon) {
                    canvas.save();
                    canvas.scale(f12, f12, iCenterX, iCenterY2);
                }
                float fDp19 = AndroidUtilities.dp(7.0f) * this.scale;
                float f51112 = iCenterX;
                float f51113 = f51112 - fDp19;
                float f61110 = iCenterY2;
                float f61111 = f61110 - fDp19;
                float f61112 = f51112 + fDp19;
                float f61113 = f61110 + fDp19;
                canvas.drawLine(f51113, f61111, f61112, f61113, paint6);
                canvas.drawLine(f61112, f61111, f51113, f61113, paint6);
                if (this.currentIcon != this.nextIcon) {
                    canvas.restore();
                }
            }
            if (this.currentIcon != 13) {
                applyShaderMatrix(false);
                i10 = this.currentIcon;
                i11 = this.nextIcon;
                if (i10 == i11) {
                    f13 = 1.0f;
                } else if (i11 == 13) {
                    f13 = this.transitionProgress;
                } else {
                    f13 = 1.0f - this.transitionProgress;
                }
                textPaint = this.textPaint;
                textPaint.setAlpha((int) (f13 * 255.0f));
                int iDp114 = AndroidUtilities.dp(5.0f) + iCenterY2;
                f14 = 5.0f;
                int i416 = iCenterX - (this.percentStringWidth / 2);
                rect = bounds;
                f15 = fMax;
                if (this.currentIcon != this.nextIcon) {
                    canvas.save();
                    canvas.scale(f13, f13, iCenterX, iCenterY2);
                }
                i12 = (int) (this.animatedDownloadProgress * 100.0f);
                if (this.percentString != null) {
                    this.lastPercent = i12;
                    String str6 = String.format("%d%%", Integer.valueOf(i12));
                    this.percentString = str6;
                    this.percentStringWidth = (int) Math.ceil(textPaint.measureText(str6));
                } else {
                    this.lastPercent = i12;
                    String str7 = String.format("%d%%", Integer.valueOf(i12));
                    this.percentString = str7;
                    this.percentStringWidth = (int) Math.ceil(textPaint.measureText(str7));
                }
                canvas.drawText(this.percentString, i416, iDp114, textPaint);
                if (this.currentIcon != this.nextIcon) {
                    canvas.restore();
                }
            } else {
                applyShaderMatrix(false);
                i10 = this.currentIcon;
                i11 = this.nextIcon;
                if (i10 == i11) {
                    f13 = 1.0f;
                } else if (i11 == 13) {
                    f13 = this.transitionProgress;
                } else {
                    f13 = 1.0f - this.transitionProgress;
                }
                textPaint = this.textPaint;
                textPaint.setAlpha((int) (f13 * 255.0f));
                int iDp115 = AndroidUtilities.dp(5.0f) + iCenterY2;
                f14 = 5.0f;
                int i417 = iCenterX - (this.percentStringWidth / 2);
                rect = bounds;
                f15 = fMax;
                if (this.currentIcon != this.nextIcon) {
                    canvas.save();
                    canvas.scale(f13, f13, iCenterX, iCenterY2);
                }
                i12 = (int) (this.animatedDownloadProgress * 100.0f);
                if (this.percentString != null) {
                    this.lastPercent = i12;
                    String str8 = String.format("%d%%", Integer.valueOf(i12));
                    this.percentString = str8;
                    this.percentStringWidth = (int) Math.ceil(textPaint.measureText(str8));
                } else {
                    this.lastPercent = i12;
                    String str9 = String.format("%d%%", Integer.valueOf(i12));
                    this.percentString = str9;
                    this.percentStringWidth = (int) Math.ceil(textPaint.measureText(str9));
                }
                canvas.drawText(this.percentString, i417, iDp115, textPaint);
                if (this.currentIcon != this.nextIcon) {
                    canvas.restore();
                }
            }
            i13 = this.currentIcon;
            i14 = 1;
            if (i13 != 0) {
                if (i13 == 0) {
                    if (i13 == 1) {
                        if (this.nextIcon != 0) {
                            i14 = 1;
                        } else if (this.animatingTransition) {
                            if (this.nextIcon == 0) {
                                f16 = 1.0f - this.transitionProgress;
                            } else {
                                f16 = this.transitionProgress;
                            }
                            i14 = 1;
                        } else {
                            i14 = 1;
                            if (this.nextIcon == 1) {
                                f16 = 1.0f;
                            } else {
                                f16 = 0.0f;
                            }
                        }
                        i15 = this.nextIcon;
                        if (i15 != 0) {
                            paint2 = paint5;
                            paint2.setAlpha(255);
                        } else {
                            paint2 = paint5;
                            paint2.setAlpha(255);
                        }
                        applyShaderMatrix(true);
                        canvas.save();
                        canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                        float f61114 = f16 * 500.0f;
                        i16 = this.currentIcon;
                        if (i16 == 1) {
                            f17 = 90.0f;
                        } else {
                            f17 = 0.0f;
                        }
                        if (i16 != 0) {
                            if (i16 == 1) {
                                interpolation = f17;
                            } else {
                                interpolation = f17;
                            }
                        } else if (i16 == 1) {
                            interpolation = f17;
                        } else {
                            interpolation = f17;
                        }
                        canvas.rotate(interpolation);
                        i17 = this.currentIcon;
                        if (i17 == 0) {
                            canvas.scale(f11, f11);
                        } else {
                            canvas.scale(f11, f11);
                        }
                        Theme.playPauseAnimator.draw(canvas, paint2, f61114);
                        canvas.scale(1.0f, -1.0f);
                        Theme.playPauseAnimator.draw(canvas, paint2, f61114);
                        canvas.restore();
                    }
                    if (i13 == i14) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    i15 = this.nextIcon;
                    if (i15 != 0) {
                        paint2 = paint5;
                        paint2.setAlpha(255);
                    } else {
                        paint2 = paint5;
                        paint2.setAlpha(255);
                    }
                    applyShaderMatrix(true);
                    canvas.save();
                    canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                    float f61115 = f16 * 500.0f;
                    i16 = this.currentIcon;
                    if (i16 == 1) {
                        f17 = 90.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    if (i16 != 0) {
                        if (i16 == 1) {
                            interpolation = f17;
                        } else {
                            interpolation = f17;
                        }
                    } else if (i16 == 1) {
                        interpolation = f17;
                    } else {
                        interpolation = f17;
                    }
                    canvas.rotate(interpolation);
                    i17 = this.currentIcon;
                    if (i17 == 0) {
                        canvas.scale(f11, f11);
                    } else {
                        canvas.scale(f11, f11);
                    }
                    Theme.playPauseAnimator.draw(canvas, paint2, f61115);
                    canvas.scale(1.0f, -1.0f);
                    Theme.playPauseAnimator.draw(canvas, paint2, f61115);
                    canvas.restore();
                } else {
                    if (i13 == 1) {
                        if (this.nextIcon != 0) {
                            i14 = 1;
                        } else if (this.animatingTransition) {
                            if (this.nextIcon == 0) {
                                f16 = 1.0f - this.transitionProgress;
                            } else {
                                f16 = this.transitionProgress;
                            }
                            i14 = 1;
                        } else {
                            i14 = 1;
                            if (this.nextIcon == 1) {
                                f16 = 1.0f;
                            } else {
                                f16 = 0.0f;
                            }
                        }
                        i15 = this.nextIcon;
                        if (i15 != 0) {
                            paint2 = paint5;
                            paint2.setAlpha(255);
                        } else {
                            paint2 = paint5;
                            paint2.setAlpha(255);
                        }
                        applyShaderMatrix(true);
                        canvas.save();
                        canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                        float f61116 = f16 * 500.0f;
                        i16 = this.currentIcon;
                        if (i16 == 1) {
                            f17 = 90.0f;
                        } else {
                            f17 = 0.0f;
                        }
                        if (i16 != 0) {
                            if (i16 == 1) {
                                interpolation = f17;
                            } else {
                                interpolation = f17;
                            }
                        } else if (i16 == 1) {
                            interpolation = f17;
                        } else {
                            interpolation = f17;
                        }
                        canvas.rotate(interpolation);
                        i17 = this.currentIcon;
                        if (i17 == 0) {
                            canvas.scale(f11, f11);
                        } else {
                            canvas.scale(f11, f11);
                        }
                        Theme.playPauseAnimator.draw(canvas, paint2, f61116);
                        canvas.scale(1.0f, -1.0f);
                        Theme.playPauseAnimator.draw(canvas, paint2, f61116);
                        canvas.restore();
                    }
                    if (i13 == i14) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    i15 = this.nextIcon;
                    if (i15 != 0) {
                        paint2 = paint5;
                        paint2.setAlpha(255);
                    } else {
                        paint2 = paint5;
                        paint2.setAlpha(255);
                    }
                    applyShaderMatrix(true);
                    canvas.save();
                    canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                    float f61117 = f16 * 500.0f;
                    i16 = this.currentIcon;
                    if (i16 == 1) {
                        f17 = 90.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    if (i16 != 0) {
                        if (i16 == 1) {
                            interpolation = f17;
                        } else {
                            interpolation = f17;
                        }
                    } else if (i16 == 1) {
                        interpolation = f17;
                    } else {
                        interpolation = f17;
                    }
                    canvas.rotate(interpolation);
                    i17 = this.currentIcon;
                    if (i17 == 0) {
                        canvas.scale(f11, f11);
                    } else {
                        canvas.scale(f11, f11);
                    }
                    Theme.playPauseAnimator.draw(canvas, paint2, f61117);
                    canvas.scale(1.0f, -1.0f);
                    Theme.playPauseAnimator.draw(canvas, paint2, f61117);
                    canvas.restore();
                }
            } else if (i13 == 0) {
                if (i13 == 1) {
                    if (this.nextIcon != 0) {
                        i14 = 1;
                    } else if (this.animatingTransition) {
                        if (this.nextIcon == 0) {
                            f16 = 1.0f - this.transitionProgress;
                        } else {
                            f16 = this.transitionProgress;
                        }
                        i14 = 1;
                    } else {
                        i14 = 1;
                        if (this.nextIcon == 1) {
                            f16 = 1.0f;
                        } else {
                            f16 = 0.0f;
                        }
                    }
                    i15 = this.nextIcon;
                    if (i15 != 0) {
                        paint2 = paint5;
                        paint2.setAlpha(255);
                    } else {
                        paint2 = paint5;
                        paint2.setAlpha(255);
                    }
                    applyShaderMatrix(true);
                    canvas.save();
                    canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                    float f61118 = f16 * 500.0f;
                    i16 = this.currentIcon;
                    if (i16 == 1) {
                        f17 = 90.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    if (i16 != 0) {
                        if (i16 == 1) {
                            interpolation = f17;
                        } else {
                            interpolation = f17;
                        }
                    } else if (i16 == 1) {
                        interpolation = f17;
                    } else {
                        interpolation = f17;
                    }
                    canvas.rotate(interpolation);
                    i17 = this.currentIcon;
                    if (i17 == 0) {
                        canvas.scale(f11, f11);
                    } else {
                        canvas.scale(f11, f11);
                    }
                    Theme.playPauseAnimator.draw(canvas, paint2, f61118);
                    canvas.scale(1.0f, -1.0f);
                    Theme.playPauseAnimator.draw(canvas, paint2, f61118);
                    canvas.restore();
                }
                if (i13 == i14) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                i15 = this.nextIcon;
                if (i15 != 0) {
                    paint2 = paint5;
                    paint2.setAlpha(255);
                } else {
                    paint2 = paint5;
                    paint2.setAlpha(255);
                }
                applyShaderMatrix(true);
                canvas.save();
                canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                float f61119 = f16 * 500.0f;
                i16 = this.currentIcon;
                if (i16 == 1) {
                    f17 = 90.0f;
                } else {
                    f17 = 0.0f;
                }
                if (i16 != 0) {
                    if (i16 == 1) {
                        interpolation = f17;
                    } else {
                        interpolation = f17;
                    }
                } else if (i16 == 1) {
                    interpolation = f17;
                } else {
                    interpolation = f17;
                }
                canvas.rotate(interpolation);
                i17 = this.currentIcon;
                if (i17 == 0) {
                    canvas.scale(f11, f11);
                } else {
                    canvas.scale(f11, f11);
                }
                Theme.playPauseAnimator.draw(canvas, paint2, f61119);
                canvas.scale(1.0f, -1.0f);
                Theme.playPauseAnimator.draw(canvas, paint2, f61119);
                canvas.restore();
            } else {
                if (i13 == 1) {
                    if (this.nextIcon != 0) {
                        i14 = 1;
                    } else if (this.animatingTransition) {
                        if (this.nextIcon == 0) {
                            f16 = 1.0f - this.transitionProgress;
                        } else {
                            f16 = this.transitionProgress;
                        }
                        i14 = 1;
                    } else {
                        i14 = 1;
                        if (this.nextIcon == 1) {
                            f16 = 1.0f;
                        } else {
                            f16 = 0.0f;
                        }
                    }
                    i15 = this.nextIcon;
                    if (i15 != 0) {
                        paint2 = paint5;
                        paint2.setAlpha(255);
                    } else {
                        paint2 = paint5;
                        paint2.setAlpha(255);
                    }
                    applyShaderMatrix(true);
                    canvas.save();
                    canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                    float f611110 = f16 * 500.0f;
                    i16 = this.currentIcon;
                    if (i16 == 1) {
                        f17 = 90.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    if (i16 != 0) {
                        if (i16 == 1) {
                            interpolation = f17;
                        } else {
                            interpolation = f17;
                        }
                    } else if (i16 == 1) {
                        interpolation = f17;
                    } else {
                        interpolation = f17;
                    }
                    canvas.rotate(interpolation);
                    i17 = this.currentIcon;
                    if (i17 == 0) {
                        canvas.scale(f11, f11);
                    } else {
                        canvas.scale(f11, f11);
                    }
                    Theme.playPauseAnimator.draw(canvas, paint2, f611110);
                    canvas.scale(1.0f, -1.0f);
                    Theme.playPauseAnimator.draw(canvas, paint2, f611110);
                    canvas.restore();
                }
                if (i13 == i14) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                i15 = this.nextIcon;
                if (i15 != 0) {
                    paint2 = paint5;
                    paint2.setAlpha(255);
                } else {
                    paint2 = paint5;
                    paint2.setAlpha(255);
                }
                applyShaderMatrix(true);
                canvas.save();
                canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                float f611111 = f16 * 500.0f;
                i16 = this.currentIcon;
                if (i16 == 1) {
                    f17 = 90.0f;
                } else {
                    f17 = 0.0f;
                }
                if (i16 != 0) {
                    if (i16 == 1) {
                        interpolation = f17;
                    } else {
                        interpolation = f17;
                    }
                } else if (i16 == 1) {
                    interpolation = f17;
                } else {
                    interpolation = f17;
                }
                canvas.rotate(interpolation);
                i17 = this.currentIcon;
                if (i17 == 0) {
                    canvas.scale(f11, f11);
                } else {
                    canvas.scale(f11, f11);
                }
                Theme.playPauseAnimator.draw(canvas, paint2, f611111);
                canvas.scale(1.0f, -1.0f);
                Theme.playPauseAnimator.draw(canvas, paint2, f611111);
                canvas.restore();
            }
            if (this.currentIcon != 6) {
                applyShaderMatrix(false);
                if (this.currentIcon != 6) {
                    f19 = this.transitionProgress;
                    if (f19 > 0.5f) {
                        f21 = (f19 - 0.5f) / 0.5f;
                        fMin = 1.0f - Math.min(1.0f, f21 / 0.5f);
                        if (f21 > 0.5f) {
                            f20 = (f21 - 0.5f) / 0.5f;
                        } else {
                            f20 = 0.0f;
                        }
                    } else {
                        f20 = 0.0f;
                        fMin = 1.0f;
                    }
                    paint6.setAlpha(255);
                    f18 = f20;
                } else {
                    if (this.nextIcon != 6) {
                        paint6.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                    } else {
                        paint6.setAlpha(255);
                    }
                    fMin = 0.0f;
                    f18 = 1.0f;
                }
                iDp = AndroidUtilities.dp(7.0f) + iCenterY2;
                iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                if (fMin < 1.0f) {
                    canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin), iDp - (AndroidUtilities.dp(6.0f) * fMin), paint6);
                }
                if (f18 > 0.0f) {
                    float f625 = iDp2;
                    float f626 = iDp;
                    canvas = canvas;
                    canvas.drawLine(f625, f626, (AndroidUtilities.dp(12.0f) * f18) + f625, f626 - (AndroidUtilities.dp(12.0f) * f18), paint6);
                } else {
                    canvas = canvas;
                }
            } else {
                applyShaderMatrix(false);
                if (this.currentIcon != 6) {
                    f19 = this.transitionProgress;
                    if (f19 > 0.5f) {
                        f21 = (f19 - 0.5f) / 0.5f;
                        fMin = 1.0f - Math.min(1.0f, f21 / 0.5f);
                        if (f21 > 0.5f) {
                            f20 = (f21 - 0.5f) / 0.5f;
                        } else {
                            f20 = 0.0f;
                        }
                    } else {
                        f20 = 0.0f;
                        fMin = 1.0f;
                    }
                    paint6.setAlpha(255);
                    f18 = f20;
                } else {
                    if (this.nextIcon != 6) {
                        paint6.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                    } else {
                        paint6.setAlpha(255);
                    }
                    fMin = 0.0f;
                    f18 = 1.0f;
                }
                iDp = AndroidUtilities.dp(7.0f) + iCenterY2;
                iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                if (fMin < 1.0f) {
                    canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin), iDp - (AndroidUtilities.dp(6.0f) * fMin), paint6);
                }
                if (f18 > 0.0f) {
                    float f627 = iDp2;
                    float f628 = iDp;
                    canvas = canvas;
                    canvas.drawLine(f627, f628, (AndroidUtilities.dp(12.0f) * f18) + f627, f628 - (AndroidUtilities.dp(12.0f) * f18), paint6);
                } else {
                    canvas = canvas;
                }
            }
            if (drawable4 != null) {
                int intrinsicWidth5 = (int) (drawable4.getIntrinsicWidth() * f15);
                int intrinsicHeight5 = (int) (drawable4.getIntrinsicHeight() * f15);
                drawable4.setColorFilter(this.colorFilter);
                if (this.currentIcon == this.nextIcon) {
                    i23 = 255;
                } else {
                    i23 = (int) ((1.0f - this.transitionProgress) * 255.0f);
                }
                drawable4.setAlpha(i23);
                int i418 = intrinsicWidth5 / 2;
                int i419 = intrinsicHeight5 / 2;
                drawable4.setBounds(iCenterX - i418, iCenterY2 - i419, i418 + iCenterX, iCenterY2 + i419);
                drawable4.draw(canvas);
            }
            if (drawable3 != null) {
                int intrinsicWidth6 = (int) (drawable3.getIntrinsicWidth() * f11);
                int intrinsicHeight6 = (int) (drawable3.getIntrinsicHeight() * f11);
                drawable3.setColorFilter(this.colorFilter);
                if (this.currentIcon == this.nextIcon) {
                    i22 = 255;
                } else {
                    i22 = (int) (this.transitionProgress * 255.0f);
                }
                drawable3.setAlpha(i22);
                int i4110 = intrinsicWidth6 / 2;
                int i4111 = intrinsicHeight6 / 2;
                drawable3.setBounds(iCenterX - i4110, iCenterY2 - i4111, i4110 + iCenterX, iCenterY2 + i4111);
                drawable3.draw(canvas);
            }
            paint3 = this.backPaint;
            if (pathArr3 != null) {
                i18 = iCenterY2;
            } else {
                i18 = iCenterY2;
            }
            if (pathArr4 != null) {
                int iDp116 = AndroidUtilities.dp(24.0f);
                if (this.currentIcon == this.nextIcon) {
                    i21 = 255;
                } else {
                    i21 = (int) (this.transitionProgress * 255.0f);
                }
                paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                paint2.setAlpha(i21);
                applyShaderMatrix(true);
                canvas.save();
                canvas.translate(iCenterX, i18);
                canvas.scale(f11, f11);
                float f629 = (-iDp116) / 2;
                canvas.translate(f629, f629);
                path = pathArr4[0];
                if (path != null) {
                    canvas.drawPath(path, paint2);
                }
                if (pathArr4.length >= 3) {
                    canvas.drawPath(path3, paint6);
                }
                path2 = pathArr4[1];
                if (path2 != null) {
                    if (i21 != 255) {
                        int alpha3 = paint3.getAlpha();
                        paint3.setAlpha((int) ((i21 / 255.0f) * alpha3));
                        canvas.drawPath(pathArr4[1], paint3);
                        paint3.setAlpha(alpha3);
                    } else {
                        canvas.drawPath(path2, paint3);
                    }
                }
                canvas.restore();
            }
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            j = jCurrentTimeMillis3 - this.lastAnimationTime;
            if (j > 17) {
                j2 = 17;
            } else {
                j2 = j;
            }
            this.lastAnimationTime = jCurrentTimeMillis3;
            i19 = this.currentIcon;
            if (i19 != 3) {
                f22 = ((360 * j2) / 2500.0f) + this.downloadRadOffset;
                this.downloadRadOffset = f22;
                while (f22 > 360.0f) {
                    f22 -= 360.0f;
                }
                this.downloadRadOffset = f22;
                if (this.nextIcon != 2) {
                    f23 = this.downloadProgress;
                    f24 = this.downloadProgressAnimationStart;
                    f25 = f23 - f24;
                    if (f25 > 0.0f) {
                        f26 = this.downloadProgressTime + j2;
                        this.downloadProgressTime = f26;
                        if (f26 >= 200.0f) {
                            this.animatedDownloadProgress = f23;
                            this.downloadProgressAnimationStart = f23;
                            this.downloadProgressTime = 0.0f;
                        } else {
                            this.animatedDownloadProgress = (this.interpolator.getInterpolation(f26 / 200.0f) * f25) + f24;
                        }
                    }
                }
                invalidateSelf();
            } else {
                f22 = ((360 * j2) / 2500.0f) + this.downloadRadOffset;
                this.downloadRadOffset = f22;
                while (f22 > 360.0f) {
                    f22 -= 360.0f;
                }
                this.downloadRadOffset = f22;
                if (this.nextIcon != 2) {
                    f23 = this.downloadProgress;
                    f24 = this.downloadProgressAnimationStart;
                    f25 = f23 - f24;
                    if (f25 > 0.0f) {
                        f26 = this.downloadProgressTime + j2;
                        this.downloadProgressTime = f26;
                        if (f26 >= 200.0f) {
                            this.animatedDownloadProgress = f23;
                            this.downloadProgressAnimationStart = f23;
                            this.downloadProgressTime = 0.0f;
                        } else {
                            this.animatedDownloadProgress = (this.interpolator.getInterpolation(f26 / 200.0f) * f25) + f24;
                        }
                    }
                }
                invalidateSelf();
            }
            if (this.animatingTransition) {
                f27 = this.transitionProgress;
                if (f27 < 1.0f) {
                    f28 = (j2 / this.transitionAnimationTime) + f27;
                    this.transitionProgress = f28;
                    if (f28 >= 1.0f) {
                        this.currentIcon = this.nextIcon;
                        this.transitionProgress = 1.0f;
                        this.animatingTransition = false;
                    }
                    invalidateSelf();
                }
            }
            i20 = i2;
            if (i20 >= 1) {
                canvas.restoreToCount(i20);
            }
        }
        float f80 = this.transitionProgress;
        if (f80 <= 0.5f) {
            float f81 = 1.0f - (f80 / 0.5f);
            fDp2 = AndroidUtilities.dp(7.0f) * f81 * this.scale;
            i29 = (int) (f81 * 255.0f);
        } else {
            i29 = 0;
            fDp2 = 0.0f;
        }
        iMin = i29;
        f30 = 1.0f;
        f32 = 0.0f;
        fCenterY = 0.0f;
        fCenterX = 0.0f;
        f31 = 1.0f;
        if (f30 != f31) {
            canvas.save();
            canvas.scale(f30, f30, fCenterX, fCenterY);
        }
        if (f32 != f) {
            canvas.save();
            canvas.rotate(f32, iCenterX, iCenterY2);
        }
        if (iMin != 0) {
            f34 = iMin;
            paint6.setAlpha((int) (this.overrideAlpha * f34));
            if (this.currentIcon != 14) {
                rectF = rectF3;
                paint.setAlpha((int) (f34 * this.overrideAlpha));
                rectF.set(iCenterX - AndroidUtilities.dp(3.5f), iCenterY2 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + iCenterX, AndroidUtilities.dp(3.5f) + iCenterY2);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint);
            } else {
                rectF = rectF3;
                paint.setAlpha((int) (f34 * this.overrideAlpha));
                rectF.set(iCenterX - AndroidUtilities.dp(3.5f), iCenterY2 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + iCenterX, AndroidUtilities.dp(3.5f) + iCenterY2);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint);
            }
        } else {
            rectF = rectF3;
        }
        if (f32 != f) {
            canvas.restore();
        }
        if (f30 != f31) {
            canvas.restore();
        }
        i26 = this.currentIcon;
        if (i26 != 3) {
            float fMax6 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
            int iDp117 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
            rectF.set(bounds.left + iDp117, bounds.top + iDp117, bounds.right - iDp117, bounds.bottom - iDp117);
            i27 = this.currentIcon;
            if (i27 != 14) {
                paint6.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                rectF2 = rectF;
                canvas.drawArc(rectF2, 0.0f, 360.0f, false, paint6);
                paint6.setAlpha(iMin);
            } else {
                paint6.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                rectF2 = rectF;
                canvas.drawArc(rectF2, 0.0f, 360.0f, false, paint6);
                paint6.setAlpha(iMin);
            }
            canvas = canvas;
            canvas.drawArc(rectF2, this.downloadRadOffset, fMax6, false, paint6);
        } else {
            float fMax7 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
            int iDp118 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
            rectF.set(bounds.left + iDp118, bounds.top + iDp118, bounds.right - iDp118, bounds.bottom - iDp118);
            i27 = this.currentIcon;
            if (i27 != 14) {
                paint6.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                rectF2 = rectF;
                canvas.drawArc(rectF2, 0.0f, 360.0f, false, paint6);
                paint6.setAlpha(iMin);
            } else {
                paint6.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                rectF2 = rectF;
                canvas.drawArc(rectF2, 0.0f, 360.0f, false, paint6);
                paint6.setAlpha(iMin);
            }
            canvas = canvas;
            canvas.drawArc(rectF2, this.downloadRadOffset, fMax7, false, paint6);
        }
        i4 = this.currentIcon;
        if (i4 == this.nextIcon) {
            fMax = 1.0f;
            f11 = 1.0f;
        } else if (i4 != 4) {
            float f51114 = this.transitionProgress;
            f11 = f51114;
            fMax = 1.0f - f51114;
        } else {
            float f51115 = this.transitionProgress;
            f11 = f51115;
            fMax = 1.0f - f51115;
        }
        i5 = this.nextIcon;
        if (i5 == i3) {
            pathArr2 = Theme.chat_updatePath;
            pathArr = drawable;
        } else if (this.currentIcon == i3) {
            pathArr = Theme.chat_updatePath;
            pathArr2 = drawable;
        } else {
            pathArr = drawable;
            pathArr2 = pathArr;
        }
        if (i5 == 5) {
            pathArr2 = Theme.chat_filePath;
        } else if (this.currentIcon == 5) {
            pathArr = Theme.chat_filePath;
        }
        pathArr3 = pathArr;
        pathArr4 = pathArr2;
        if (i5 == 7) {
            drawable2 = Theme.chat_flameIcon;
        } else if (this.currentIcon == 7) {
            Drawable drawable8 = drawable;
            drawable = Theme.chat_flameIcon;
            drawable2 = drawable8;
        } else {
            drawable2 = drawable;
        }
        if (i5 == 8) {
            drawable2 = Theme.chat_gifIcon;
        } else if (this.currentIcon == 8) {
            drawable = Theme.chat_gifIcon;
        }
        drawable3 = drawable2;
        if (this.currentIcon != 9) {
            applyShaderMatrix(false);
            if (this.currentIcon == this.nextIcon) {
                i6 = 255;
            } else {
                i6 = (int) (this.transitionProgress * 255.0f);
            }
            paint6.setAlpha(i6);
            int iDp119 = AndroidUtilities.dp(7.0f) + iCenterY2;
            int iDp1110 = iCenterX - AndroidUtilities.dp(3.0f);
            if (this.currentIcon != this.nextIcon) {
                canvas.save();
                float f51116 = this.transitionProgress;
                canvas.scale(f51116, f51116, iCenterX, iCenterY2);
            }
            float f51117 = iDp1110;
            float f51118 = iDp119;
            drawable4 = drawable;
            canvas.drawLine(iDp1110 - AndroidUtilities.dp(6.0f), iDp119 - AndroidUtilities.dp(6.0f), f51117, f51118, paint6);
            canvas = canvas;
            canvas.drawLine(f51117, f51118, AndroidUtilities.dp(12.0f) + iDp1110, iDp119 - AndroidUtilities.dp(12.0f), paint6);
            if (this.currentIcon != this.nextIcon) {
                canvas.restore();
            }
        } else {
            applyShaderMatrix(false);
            if (this.currentIcon == this.nextIcon) {
                i6 = 255;
            } else {
                i6 = (int) (this.transitionProgress * 255.0f);
            }
            paint6.setAlpha(i6);
            int iDp1111 = AndroidUtilities.dp(7.0f) + iCenterY2;
            int iDp1112 = iCenterX - AndroidUtilities.dp(3.0f);
            if (this.currentIcon != this.nextIcon) {
                canvas.save();
                float f51119 = this.transitionProgress;
                canvas.scale(f51119, f51119, iCenterX, iCenterY2);
            }
            float f511110 = iDp1112;
            float f511111 = iDp1111;
            drawable4 = drawable;
            canvas.drawLine(iDp1112 - AndroidUtilities.dp(6.0f), iDp1111 - AndroidUtilities.dp(6.0f), f511110, f511111, paint6);
            canvas = canvas;
            canvas.drawLine(f511110, f511111, AndroidUtilities.dp(12.0f) + iDp1112, iDp1111 - AndroidUtilities.dp(12.0f), paint6);
            if (this.currentIcon != this.nextIcon) {
                canvas.restore();
            }
        }
        if (this.currentIcon != 12) {
            applyShaderMatrix(false);
            i7 = this.currentIcon;
            i8 = this.nextIcon;
            if (i7 == i8) {
                f12 = 1.0f;
            } else if (i8 == 13) {
                f12 = this.transitionProgress;
            } else {
                f12 = 1.0f - this.transitionProgress;
            }
            if (i7 == i8) {
                i9 = 255;
            } else {
                i9 = (int) (f12 * 255.0f);
            }
            paint6.setAlpha(i9);
            AndroidUtilities.dp(7.0f);
            AndroidUtilities.dp(3.0f);
            if (this.currentIcon != this.nextIcon) {
                canvas.save();
                canvas.scale(f12, f12, iCenterX, iCenterY2);
            }
            float fDp110 = AndroidUtilities.dp(7.0f) * this.scale;
            float f511112 = iCenterX;
            float f511113 = f511112 - fDp110;
            float f611112 = iCenterY2;
            float f611113 = f611112 - fDp110;
            float f611114 = f511112 + fDp110;
            float f611115 = f611112 + fDp110;
            canvas.drawLine(f511113, f611113, f611114, f611115, paint6);
            canvas.drawLine(f611114, f611113, f511113, f611115, paint6);
            if (this.currentIcon != this.nextIcon) {
                canvas.restore();
            }
        } else {
            applyShaderMatrix(false);
            i7 = this.currentIcon;
            i8 = this.nextIcon;
            if (i7 == i8) {
                f12 = 1.0f;
            } else if (i8 == 13) {
                f12 = this.transitionProgress;
            } else {
                f12 = 1.0f - this.transitionProgress;
            }
            if (i7 == i8) {
                i9 = 255;
            } else {
                i9 = (int) (f12 * 255.0f);
            }
            paint6.setAlpha(i9);
            AndroidUtilities.dp(7.0f);
            AndroidUtilities.dp(3.0f);
            if (this.currentIcon != this.nextIcon) {
                canvas.save();
                canvas.scale(f12, f12, iCenterX, iCenterY2);
            }
            float fDp111 = AndroidUtilities.dp(7.0f) * this.scale;
            float f511114 = iCenterX;
            float f511115 = f511114 - fDp111;
            float f611116 = iCenterY2;
            float f611117 = f611116 - fDp111;
            float f611118 = f511114 + fDp111;
            float f611119 = f611116 + fDp111;
            canvas.drawLine(f511115, f611117, f611118, f611119, paint6);
            canvas.drawLine(f611118, f611117, f511115, f611119, paint6);
            if (this.currentIcon != this.nextIcon) {
                canvas.restore();
            }
        }
        if (this.currentIcon != 13) {
            applyShaderMatrix(false);
            i10 = this.currentIcon;
            i11 = this.nextIcon;
            if (i10 == i11) {
                f13 = 1.0f;
            } else if (i11 == 13) {
                f13 = this.transitionProgress;
            } else {
                f13 = 1.0f - this.transitionProgress;
            }
            textPaint = this.textPaint;
            textPaint.setAlpha((int) (f13 * 255.0f));
            int iDp1113 = AndroidUtilities.dp(5.0f) + iCenterY2;
            f14 = 5.0f;
            int i4112 = iCenterX - (this.percentStringWidth / 2);
            rect = bounds;
            f15 = fMax;
            if (this.currentIcon != this.nextIcon) {
                canvas.save();
                canvas.scale(f13, f13, iCenterX, iCenterY2);
            }
            i12 = (int) (this.animatedDownloadProgress * 100.0f);
            if (this.percentString != null) {
                this.lastPercent = i12;
                String str10 = String.format("%d%%", Integer.valueOf(i12));
                this.percentString = str10;
                this.percentStringWidth = (int) Math.ceil(textPaint.measureText(str10));
            } else {
                this.lastPercent = i12;
                String str11 = String.format("%d%%", Integer.valueOf(i12));
                this.percentString = str11;
                this.percentStringWidth = (int) Math.ceil(textPaint.measureText(str11));
            }
            canvas.drawText(this.percentString, i4112, iDp1113, textPaint);
            if (this.currentIcon != this.nextIcon) {
                canvas.restore();
            }
        } else {
            applyShaderMatrix(false);
            i10 = this.currentIcon;
            i11 = this.nextIcon;
            if (i10 == i11) {
                f13 = 1.0f;
            } else if (i11 == 13) {
                f13 = this.transitionProgress;
            } else {
                f13 = 1.0f - this.transitionProgress;
            }
            textPaint = this.textPaint;
            textPaint.setAlpha((int) (f13 * 255.0f));
            int iDp1114 = AndroidUtilities.dp(5.0f) + iCenterY2;
            f14 = 5.0f;
            int i4113 = iCenterX - (this.percentStringWidth / 2);
            rect = bounds;
            f15 = fMax;
            if (this.currentIcon != this.nextIcon) {
                canvas.save();
                canvas.scale(f13, f13, iCenterX, iCenterY2);
            }
            i12 = (int) (this.animatedDownloadProgress * 100.0f);
            if (this.percentString != null) {
                this.lastPercent = i12;
                String str12 = String.format("%d%%", Integer.valueOf(i12));
                this.percentString = str12;
                this.percentStringWidth = (int) Math.ceil(textPaint.measureText(str12));
            } else {
                this.lastPercent = i12;
                String str13 = String.format("%d%%", Integer.valueOf(i12));
                this.percentString = str13;
                this.percentStringWidth = (int) Math.ceil(textPaint.measureText(str13));
            }
            canvas.drawText(this.percentString, i4113, iDp1114, textPaint);
            if (this.currentIcon != this.nextIcon) {
                canvas.restore();
            }
        }
        i13 = this.currentIcon;
        i14 = 1;
        if (i13 != 0) {
            if (i13 == 0) {
                if (i13 == 1) {
                    if (this.nextIcon != 0) {
                        i14 = 1;
                    } else if (this.animatingTransition) {
                        if (this.nextIcon == 0) {
                            f16 = 1.0f - this.transitionProgress;
                        } else {
                            f16 = this.transitionProgress;
                        }
                        i14 = 1;
                    } else {
                        i14 = 1;
                        if (this.nextIcon == 1) {
                            f16 = 1.0f;
                        } else {
                            f16 = 0.0f;
                        }
                    }
                    i15 = this.nextIcon;
                    if (i15 != 0) {
                        paint2 = paint5;
                        paint2.setAlpha(255);
                    } else {
                        paint2 = paint5;
                        paint2.setAlpha(255);
                    }
                    applyShaderMatrix(true);
                    canvas.save();
                    canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                    float f6111110 = f16 * 500.0f;
                    i16 = this.currentIcon;
                    if (i16 == 1) {
                        f17 = 90.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    if (i16 != 0) {
                        if (i16 == 1) {
                            interpolation = f17;
                        } else {
                            interpolation = f17;
                        }
                    } else if (i16 == 1) {
                        interpolation = f17;
                    } else {
                        interpolation = f17;
                    }
                    canvas.rotate(interpolation);
                    i17 = this.currentIcon;
                    if (i17 == 0) {
                        canvas.scale(f11, f11);
                    } else {
                        canvas.scale(f11, f11);
                    }
                    Theme.playPauseAnimator.draw(canvas, paint2, f6111110);
                    canvas.scale(1.0f, -1.0f);
                    Theme.playPauseAnimator.draw(canvas, paint2, f6111110);
                    canvas.restore();
                }
                if (i13 == i14) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                i15 = this.nextIcon;
                if (i15 != 0) {
                    paint2 = paint5;
                    paint2.setAlpha(255);
                } else {
                    paint2 = paint5;
                    paint2.setAlpha(255);
                }
                applyShaderMatrix(true);
                canvas.save();
                canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                float f6111111 = f16 * 500.0f;
                i16 = this.currentIcon;
                if (i16 == 1) {
                    f17 = 90.0f;
                } else {
                    f17 = 0.0f;
                }
                if (i16 != 0) {
                    if (i16 == 1) {
                        interpolation = f17;
                    } else {
                        interpolation = f17;
                    }
                } else if (i16 == 1) {
                    interpolation = f17;
                } else {
                    interpolation = f17;
                }
                canvas.rotate(interpolation);
                i17 = this.currentIcon;
                if (i17 == 0) {
                    canvas.scale(f11, f11);
                } else {
                    canvas.scale(f11, f11);
                }
                Theme.playPauseAnimator.draw(canvas, paint2, f6111111);
                canvas.scale(1.0f, -1.0f);
                Theme.playPauseAnimator.draw(canvas, paint2, f6111111);
                canvas.restore();
            } else {
                if (i13 == 1) {
                    if (this.nextIcon != 0) {
                        i14 = 1;
                    } else if (this.animatingTransition) {
                        if (this.nextIcon == 0) {
                            f16 = 1.0f - this.transitionProgress;
                        } else {
                            f16 = this.transitionProgress;
                        }
                        i14 = 1;
                    } else {
                        i14 = 1;
                        if (this.nextIcon == 1) {
                            f16 = 1.0f;
                        } else {
                            f16 = 0.0f;
                        }
                    }
                    i15 = this.nextIcon;
                    if (i15 != 0) {
                        paint2 = paint5;
                        paint2.setAlpha(255);
                    } else {
                        paint2 = paint5;
                        paint2.setAlpha(255);
                    }
                    applyShaderMatrix(true);
                    canvas.save();
                    canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                    float f6111112 = f16 * 500.0f;
                    i16 = this.currentIcon;
                    if (i16 == 1) {
                        f17 = 90.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    if (i16 != 0) {
                        if (i16 == 1) {
                            interpolation = f17;
                        } else {
                            interpolation = f17;
                        }
                    } else if (i16 == 1) {
                        interpolation = f17;
                    } else {
                        interpolation = f17;
                    }
                    canvas.rotate(interpolation);
                    i17 = this.currentIcon;
                    if (i17 == 0) {
                        canvas.scale(f11, f11);
                    } else {
                        canvas.scale(f11, f11);
                    }
                    Theme.playPauseAnimator.draw(canvas, paint2, f6111112);
                    canvas.scale(1.0f, -1.0f);
                    Theme.playPauseAnimator.draw(canvas, paint2, f6111112);
                    canvas.restore();
                }
                if (i13 == i14) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                i15 = this.nextIcon;
                if (i15 != 0) {
                    paint2 = paint5;
                    paint2.setAlpha(255);
                } else {
                    paint2 = paint5;
                    paint2.setAlpha(255);
                }
                applyShaderMatrix(true);
                canvas.save();
                canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                float f6111113 = f16 * 500.0f;
                i16 = this.currentIcon;
                if (i16 == 1) {
                    f17 = 90.0f;
                } else {
                    f17 = 0.0f;
                }
                if (i16 != 0) {
                    if (i16 == 1) {
                        interpolation = f17;
                    } else {
                        interpolation = f17;
                    }
                } else if (i16 == 1) {
                    interpolation = f17;
                } else {
                    interpolation = f17;
                }
                canvas.rotate(interpolation);
                i17 = this.currentIcon;
                if (i17 == 0) {
                    canvas.scale(f11, f11);
                } else {
                    canvas.scale(f11, f11);
                }
                Theme.playPauseAnimator.draw(canvas, paint2, f6111113);
                canvas.scale(1.0f, -1.0f);
                Theme.playPauseAnimator.draw(canvas, paint2, f6111113);
                canvas.restore();
            }
        } else if (i13 == 0) {
            if (i13 == 1) {
                if (this.nextIcon != 0) {
                    i14 = 1;
                } else if (this.animatingTransition) {
                    if (this.nextIcon == 0) {
                        f16 = 1.0f - this.transitionProgress;
                    } else {
                        f16 = this.transitionProgress;
                    }
                    i14 = 1;
                } else {
                    i14 = 1;
                    if (this.nextIcon == 1) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                }
                i15 = this.nextIcon;
                if (i15 != 0) {
                    paint2 = paint5;
                    paint2.setAlpha(255);
                } else {
                    paint2 = paint5;
                    paint2.setAlpha(255);
                }
                applyShaderMatrix(true);
                canvas.save();
                canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                float f6111114 = f16 * 500.0f;
                i16 = this.currentIcon;
                if (i16 == 1) {
                    f17 = 90.0f;
                } else {
                    f17 = 0.0f;
                }
                if (i16 != 0) {
                    if (i16 == 1) {
                        interpolation = f17;
                    } else {
                        interpolation = f17;
                    }
                } else if (i16 == 1) {
                    interpolation = f17;
                } else {
                    interpolation = f17;
                }
                canvas.rotate(interpolation);
                i17 = this.currentIcon;
                if (i17 == 0) {
                    canvas.scale(f11, f11);
                } else {
                    canvas.scale(f11, f11);
                }
                Theme.playPauseAnimator.draw(canvas, paint2, f6111114);
                canvas.scale(1.0f, -1.0f);
                Theme.playPauseAnimator.draw(canvas, paint2, f6111114);
                canvas.restore();
            }
            if (i13 == i14) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            i15 = this.nextIcon;
            if (i15 != 0) {
                paint2 = paint5;
                paint2.setAlpha(255);
            } else {
                paint2 = paint5;
                paint2.setAlpha(255);
            }
            applyShaderMatrix(true);
            canvas.save();
            canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
            float f6111115 = f16 * 500.0f;
            i16 = this.currentIcon;
            if (i16 == 1) {
                f17 = 90.0f;
            } else {
                f17 = 0.0f;
            }
            if (i16 != 0) {
                if (i16 == 1) {
                    interpolation = f17;
                } else {
                    interpolation = f17;
                }
            } else if (i16 == 1) {
                interpolation = f17;
            } else {
                interpolation = f17;
            }
            canvas.rotate(interpolation);
            i17 = this.currentIcon;
            if (i17 == 0) {
                canvas.scale(f11, f11);
            } else {
                canvas.scale(f11, f11);
            }
            Theme.playPauseAnimator.draw(canvas, paint2, f6111115);
            canvas.scale(1.0f, -1.0f);
            Theme.playPauseAnimator.draw(canvas, paint2, f6111115);
            canvas.restore();
        } else {
            if (i13 == 1) {
                if (this.nextIcon != 0) {
                    i14 = 1;
                } else if (this.animatingTransition) {
                    if (this.nextIcon == 0) {
                        f16 = 1.0f - this.transitionProgress;
                    } else {
                        f16 = this.transitionProgress;
                    }
                    i14 = 1;
                } else {
                    i14 = 1;
                    if (this.nextIcon == 1) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                }
                i15 = this.nextIcon;
                if (i15 != 0) {
                    paint2 = paint5;
                    paint2.setAlpha(255);
                } else {
                    paint2 = paint5;
                    paint2.setAlpha(255);
                }
                applyShaderMatrix(true);
                canvas.save();
                canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                float f6111116 = f16 * 500.0f;
                i16 = this.currentIcon;
                if (i16 == 1) {
                    f17 = 90.0f;
                } else {
                    f17 = 0.0f;
                }
                if (i16 != 0) {
                    if (i16 == 1) {
                        interpolation = f17;
                    } else {
                        interpolation = f17;
                    }
                } else if (i16 == 1) {
                    interpolation = f17;
                } else {
                    interpolation = f17;
                }
                canvas.rotate(interpolation);
                i17 = this.currentIcon;
                if (i17 == 0) {
                    canvas.scale(f11, f11);
                } else {
                    canvas.scale(f11, f11);
                }
                Theme.playPauseAnimator.draw(canvas, paint2, f6111116);
                canvas.scale(1.0f, -1.0f);
                Theme.playPauseAnimator.draw(canvas, paint2, f6111116);
                canvas.restore();
            }
            if (i13 == i14) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            i15 = this.nextIcon;
            if (i15 != 0) {
                paint2 = paint5;
                paint2.setAlpha(255);
            } else {
                paint2 = paint5;
                paint2.setAlpha(255);
            }
            applyShaderMatrix(true);
            canvas.save();
            canvas.translate(DiffUtil.m(1.0f, f16, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
            float f6111117 = f16 * 500.0f;
            i16 = this.currentIcon;
            if (i16 == 1) {
                f17 = 90.0f;
            } else {
                f17 = 0.0f;
            }
            if (i16 != 0) {
                if (i16 == 1) {
                    interpolation = f17;
                } else {
                    interpolation = f17;
                }
            } else if (i16 == 1) {
                interpolation = f17;
            } else {
                interpolation = f17;
            }
            canvas.rotate(interpolation);
            i17 = this.currentIcon;
            if (i17 == 0) {
                canvas.scale(f11, f11);
            } else {
                canvas.scale(f11, f11);
            }
            Theme.playPauseAnimator.draw(canvas, paint2, f6111117);
            canvas.scale(1.0f, -1.0f);
            Theme.playPauseAnimator.draw(canvas, paint2, f6111117);
            canvas.restore();
        }
        if (this.currentIcon != 6) {
            applyShaderMatrix(false);
            if (this.currentIcon != 6) {
                f19 = this.transitionProgress;
                if (f19 > 0.5f) {
                    f21 = (f19 - 0.5f) / 0.5f;
                    fMin = 1.0f - Math.min(1.0f, f21 / 0.5f);
                    if (f21 > 0.5f) {
                        f20 = (f21 - 0.5f) / 0.5f;
                    } else {
                        f20 = 0.0f;
                    }
                } else {
                    f20 = 0.0f;
                    fMin = 1.0f;
                }
                paint6.setAlpha(255);
                f18 = f20;
            } else {
                if (this.nextIcon != 6) {
                    paint6.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                } else {
                    paint6.setAlpha(255);
                }
                fMin = 0.0f;
                f18 = 1.0f;
            }
            iDp = AndroidUtilities.dp(7.0f) + iCenterY2;
            iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
            if (fMin < 1.0f) {
                canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin), iDp - (AndroidUtilities.dp(6.0f) * fMin), paint6);
            }
            if (f18 > 0.0f) {
                float f6210 = iDp2;
                float f6211 = iDp;
                canvas = canvas;
                canvas.drawLine(f6210, f6211, (AndroidUtilities.dp(12.0f) * f18) + f6210, f6211 - (AndroidUtilities.dp(12.0f) * f18), paint6);
            } else {
                canvas = canvas;
            }
        } else {
            applyShaderMatrix(false);
            if (this.currentIcon != 6) {
                f19 = this.transitionProgress;
                if (f19 > 0.5f) {
                    f21 = (f19 - 0.5f) / 0.5f;
                    fMin = 1.0f - Math.min(1.0f, f21 / 0.5f);
                    if (f21 > 0.5f) {
                        f20 = (f21 - 0.5f) / 0.5f;
                    } else {
                        f20 = 0.0f;
                    }
                } else {
                    f20 = 0.0f;
                    fMin = 1.0f;
                }
                paint6.setAlpha(255);
                f18 = f20;
            } else {
                if (this.nextIcon != 6) {
                    paint6.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                } else {
                    paint6.setAlpha(255);
                }
                fMin = 0.0f;
                f18 = 1.0f;
            }
            iDp = AndroidUtilities.dp(7.0f) + iCenterY2;
            iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
            if (fMin < 1.0f) {
                canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin), iDp - (AndroidUtilities.dp(6.0f) * fMin), paint6);
            }
            if (f18 > 0.0f) {
                float f6212 = iDp2;
                float f6213 = iDp;
                canvas = canvas;
                canvas.drawLine(f6212, f6213, (AndroidUtilities.dp(12.0f) * f18) + f6212, f6213 - (AndroidUtilities.dp(12.0f) * f18), paint6);
            } else {
                canvas = canvas;
            }
        }
        if (drawable4 != null) {
            int intrinsicWidth7 = (int) (drawable4.getIntrinsicWidth() * f15);
            int intrinsicHeight7 = (int) (drawable4.getIntrinsicHeight() * f15);
            drawable4.setColorFilter(this.colorFilter);
            if (this.currentIcon == this.nextIcon) {
                i23 = 255;
            } else {
                i23 = (int) ((1.0f - this.transitionProgress) * 255.0f);
            }
            drawable4.setAlpha(i23);
            int i4114 = intrinsicWidth7 / 2;
            int i4115 = intrinsicHeight7 / 2;
            drawable4.setBounds(iCenterX - i4114, iCenterY2 - i4115, i4114 + iCenterX, iCenterY2 + i4115);
            drawable4.draw(canvas);
        }
        if (drawable3 != null) {
            int intrinsicWidth8 = (int) (drawable3.getIntrinsicWidth() * f11);
            int intrinsicHeight8 = (int) (drawable3.getIntrinsicHeight() * f11);
            drawable3.setColorFilter(this.colorFilter);
            if (this.currentIcon == this.nextIcon) {
                i22 = 255;
            } else {
                i22 = (int) (this.transitionProgress * 255.0f);
            }
            drawable3.setAlpha(i22);
            int i4116 = intrinsicWidth8 / 2;
            int i4117 = intrinsicHeight8 / 2;
            drawable3.setBounds(iCenterX - i4116, iCenterY2 - i4117, i4116 + iCenterX, iCenterY2 + i4117);
            drawable3.draw(canvas);
        }
        paint3 = this.backPaint;
        if (pathArr3 != null) {
            i18 = iCenterY2;
        } else {
            i18 = iCenterY2;
        }
        if (pathArr4 != null) {
            int iDp1115 = AndroidUtilities.dp(24.0f);
            if (this.currentIcon == this.nextIcon) {
                i21 = 255;
            } else {
                i21 = (int) (this.transitionProgress * 255.0f);
            }
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            paint2.setAlpha(i21);
            applyShaderMatrix(true);
            canvas.save();
            canvas.translate(iCenterX, i18);
            canvas.scale(f11, f11);
            float f6214 = (-iDp1115) / 2;
            canvas.translate(f6214, f6214);
            path = pathArr4[0];
            if (path != null) {
                canvas.drawPath(path, paint2);
            }
            if (pathArr4.length >= 3) {
                canvas.drawPath(path3, paint6);
            }
            path2 = pathArr4[1];
            if (path2 != null) {
                if (i21 != 255) {
                    int alpha4 = paint3.getAlpha();
                    paint3.setAlpha((int) ((i21 / 255.0f) * alpha4));
                    canvas.drawPath(pathArr4[1], paint3);
                    paint3.setAlpha(alpha4);
                } else {
                    canvas.drawPath(path2, paint3);
                }
            }
            canvas.restore();
        }
        long jCurrentTimeMillis4 = System.currentTimeMillis();
        j = jCurrentTimeMillis4 - this.lastAnimationTime;
        if (j > 17) {
            j2 = 17;
        } else {
            j2 = j;
        }
        this.lastAnimationTime = jCurrentTimeMillis4;
        i19 = this.currentIcon;
        if (i19 != 3) {
            f22 = ((360 * j2) / 2500.0f) + this.downloadRadOffset;
            this.downloadRadOffset = f22;
            while (f22 > 360.0f) {
                f22 -= 360.0f;
            }
            this.downloadRadOffset = f22;
            if (this.nextIcon != 2) {
                f23 = this.downloadProgress;
                f24 = this.downloadProgressAnimationStart;
                f25 = f23 - f24;
                if (f25 > 0.0f) {
                    f26 = this.downloadProgressTime + j2;
                    this.downloadProgressTime = f26;
                    if (f26 >= 200.0f) {
                        this.animatedDownloadProgress = f23;
                        this.downloadProgressAnimationStart = f23;
                        this.downloadProgressTime = 0.0f;
                    } else {
                        this.animatedDownloadProgress = (this.interpolator.getInterpolation(f26 / 200.0f) * f25) + f24;
                    }
                }
            }
            invalidateSelf();
        } else {
            f22 = ((360 * j2) / 2500.0f) + this.downloadRadOffset;
            this.downloadRadOffset = f22;
            while (f22 > 360.0f) {
                f22 -= 360.0f;
            }
            this.downloadRadOffset = f22;
            if (this.nextIcon != 2) {
                f23 = this.downloadProgress;
                f24 = this.downloadProgressAnimationStart;
                f25 = f23 - f24;
                if (f25 > 0.0f) {
                    f26 = this.downloadProgressTime + j2;
                    this.downloadProgressTime = f26;
                    if (f26 >= 200.0f) {
                        this.animatedDownloadProgress = f23;
                        this.downloadProgressAnimationStart = f23;
                        this.downloadProgressTime = 0.0f;
                    } else {
                        this.animatedDownloadProgress = (this.interpolator.getInterpolation(f26 / 200.0f) * f25) + f24;
                    }
                }
            }
            invalidateSelf();
        }
        if (this.animatingTransition) {
            f27 = this.transitionProgress;
            if (f27 < 1.0f) {
                f28 = (j2 / this.transitionAnimationTime) + f27;
                this.transitionProgress = f28;
                if (f28 >= 1.0f) {
                    this.currentIcon = this.nextIcon;
                    this.transitionProgress = 1.0f;
                    this.animatingTransition = false;
                }
                invalidateSelf();
            }
        }
        i20 = i2;
        if (i20 >= 1) {
            canvas.restoreToCount(i20);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getMinimumHeight() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getMinimumWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final float getTransitionProgress() {
        if (this.animatingTransition) {
            return this.transitionProgress;
        }
        return 1.0f;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        RadialProgress2$$ExternalSyntheticLambda0 radialProgress2$$ExternalSyntheticLambda0 = this.delegate;
        if (radialProgress2$$ExternalSyntheticLambda0 != null) {
            radialProgress2$$ExternalSyntheticLambda0.f$0.invalidate();
        }
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float fDp = (i3 - i) / AndroidUtilities.dp(48.0f);
        this.scale = fDp;
        if (fDp < 0.7f) {
            this.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void setColor(int i) {
        int i2 = (-16777216) | i;
        this.paint.setColor(i2);
        this.paint2.setColor(i2);
        this.paint3.setColor(i2);
        this.textPaint.setColor(i2);
        this.colorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        this.paint2.setColorFilter(colorFilter);
        this.paint3.setColorFilter(colorFilter);
        this.textPaint.setColorFilter(colorFilter);
    }

    public final void setIcon(int i, boolean z) {
        int i2;
        int i3;
        if (this.currentIcon == i && (i3 = this.nextIcon) != i) {
            this.currentIcon = i3;
            this.transitionProgress = 1.0f;
        }
        if (z) {
            int i4 = this.currentIcon;
            if (i4 == i || (i2 = this.nextIcon) == i) {
                return;
            }
            if ((i4 == 0 && i == 1) || (i4 == 1 && i == 0)) {
                this.transitionAnimationTime = 300.0f;
            } else if (i4 == 2 && (i == 3 || i == 14)) {
                this.transitionAnimationTime = 400.0f;
            } else if (i4 != 4 && i == 6) {
                this.transitionAnimationTime = 360.0f;
            } else if ((i4 == 4 && i == 14) || (i4 == 14 && i == 4)) {
                this.transitionAnimationTime = 160.0f;
            } else {
                this.transitionAnimationTime = 220.0f;
            }
            if (this.animatingTransition) {
                this.currentIcon = i2;
            }
            this.animatingTransition = true;
            this.nextIcon = i;
            this.savedTransitionProgress = this.transitionProgress;
            this.transitionProgress = 0.0f;
        } else {
            if (this.currentIcon == i) {
                return;
            }
            this.animatingTransition = false;
            this.nextIcon = i;
            this.currentIcon = i;
            this.savedTransitionProgress = this.transitionProgress;
            this.transitionProgress = 1.0f;
        }
        if (i == 3 || i == 14) {
            this.downloadRadOffset = 112.0f;
            this.animatedDownloadProgress = 0.0f;
            this.downloadProgressAnimationStart = 0.0f;
            this.downloadProgressTime = 0.0f;
        }
        invalidateSelf();
    }
}
