package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.Theme;

public class MediaActionDrawable extends Drawable {
    private float animatedDownloadProgress;
    private boolean animatingTransition;
    private ColorFilter colorFilter;
    private int currentIcon;
    private MediaActionDrawableDelegate delegate;
    private float downloadProgress;
    private float downloadProgressAnimationStart;
    private float downloadProgressTime;
    private float downloadRadOffset;
    private LinearGradient gradientDrawable;
    private Matrix gradientMatrix;
    private boolean hasOverlayImage;
    private boolean isMini;
    private long lastAnimationTime;
    private MessageDrawable messageDrawable;
    private int nextIcon;
    private String percentString;
    private int percentStringWidth;
    private float savedTransitionProgress;
    private TextPaint textPaint = new TextPaint(1);
    public Paint paint = new Paint(1);
    private Paint backPaint = new Paint(1);
    public Paint paint2 = new Paint(1);
    private Paint paint3 = new Paint(1);
    private RectF rect = new RectF();
    private float scale = 1.0f;
    private DecelerateInterpolator interpolator = new DecelerateInterpolator();
    private float transitionAnimationTime = 400.0f;
    private int lastPercent = -1;
    private float overrideAlpha = 1.0f;
    private float transitionProgress = 1.0f;

    public interface MediaActionDrawableDelegate {
        void invalidate();
    }

    public static float getCircleValue(float f) {
        while (f > 360.0f) {
            f -= 360.0f;
        }
        return f;
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i) {
    }

    public MediaActionDrawable() {
        this.paint.setColor(-1);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint3.setColor(-1);
        this.textPaint.setTypeface(AndroidUtilities.bold());
        this.textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.textPaint.setColor(-1);
        this.paint2.setColor(-1);
    }

    public void setOverrideAlpha(float f) {
        this.overrideAlpha = f;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        this.paint2.setColorFilter(colorFilter);
        this.paint3.setColorFilter(colorFilter);
        this.textPaint.setColorFilter(colorFilter);
    }

    public void setColor(int i) {
        int i2 = (-16777216) | i;
        this.paint.setColor(i2);
        this.paint2.setColor(i2);
        this.paint3.setColor(i2);
        this.textPaint.setColor(i2);
        this.colorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY);
    }

    public void setBackColor(int i) {
        this.backPaint.setColor(i | (-16777216));
    }

    public void setMini(boolean z) {
        this.isMini = z;
        this.paint.setStrokeWidth(AndroidUtilities.dp(z ? 2.0f : 3.0f));
    }

    public void setDelegate(MediaActionDrawableDelegate mediaActionDrawableDelegate) {
        this.delegate = mediaActionDrawableDelegate;
    }

    public boolean setIcon(int i, boolean z) {
        int i2;
        int i3;
        if (this.currentIcon == i && (i3 = this.nextIcon) != i) {
            this.currentIcon = i3;
            this.transitionProgress = 1.0f;
        }
        if (z) {
            int i4 = this.currentIcon;
            if (i4 == i || (i2 = this.nextIcon) == i) {
                return false;
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
                return false;
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
        return true;
    }

    public int getCurrentIcon() {
        return this.nextIcon;
    }

    public int getPreviousIcon() {
        return this.currentIcon;
    }

    public void setProgress(float f, boolean z) {
        if (this.downloadProgress == f) {
            return;
        }
        if (!z) {
            this.animatedDownloadProgress = f;
            this.downloadProgressAnimationStart = f;
        } else {
            if (this.animatedDownloadProgress > f) {
                this.animatedDownloadProgress = f;
            }
            this.downloadProgressAnimationStart = this.animatedDownloadProgress;
        }
        this.downloadProgress = f;
        this.downloadProgressTime = 0.0f;
        invalidateSelf();
    }

    public float getProgress() {
        return this.downloadProgress;
    }

    public float getTransitionProgress() {
        if (this.animatingTransition) {
            return this.transitionProgress;
        }
        return 1.0f;
    }

    public void setBackgroundDrawable(MessageDrawable messageDrawable) {
        this.messageDrawable = messageDrawable;
    }

    public void setHasOverlayImage(boolean z) {
        this.hasOverlayImage = z;
    }

    @Override
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float intrinsicWidth = (i3 - i) / getIntrinsicWidth();
        this.scale = intrinsicWidth;
        if (intrinsicWidth < 0.7f) {
            this.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public void invalidateSelf() {
        super.invalidateSelf();
        MediaActionDrawableDelegate mediaActionDrawableDelegate = this.delegate;
        if (mediaActionDrawableDelegate != null) {
            mediaActionDrawableDelegate.invalidate();
        }
    }

    public void applyShaderMatrix(boolean z) {
        MessageDrawable messageDrawable = this.messageDrawable;
        if (messageDrawable == null || !messageDrawable.hasGradient() || this.hasOverlayImage) {
            return;
        }
        Rect bounds = getBounds();
        Shader gradientShader = this.messageDrawable.getGradientShader();
        Matrix matrix = this.messageDrawable.getMatrix();
        matrix.reset();
        this.messageDrawable.applyMatrixScale();
        if (z) {
            matrix.postTranslate(-bounds.centerX(), (-this.messageDrawable.getTopY()) + bounds.top);
        } else {
            matrix.postTranslate(0.0f, -this.messageDrawable.getTopY());
        }
        gradientShader.setLocalMatrix(matrix);
    }

    @Override
    public void draw(Canvas canvas) {
        int iSave;
        int i;
        float f;
        float fDp;
        float f2;
        int i2;
        float fDp2;
        float fDp3;
        float fDp4;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i3;
        float f8;
        float f9;
        float f10;
        Canvas canvas2;
        int i4;
        int i5;
        int i6;
        float f11;
        float fMin;
        float fCenterY;
        float fCenterX;
        float fDp5;
        int iMin;
        float f12;
        float f13;
        float f14;
        float f15;
        float fCenterX2;
        int iCenterY;
        int iCenterY2;
        int i7;
        int i8;
        float f16;
        float fMax;
        Path[] pathArr;
        Path[] pathArr2;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        int i9;
        Rect rect;
        Path[] pathArr3;
        Path[] pathArr4;
        int i10;
        int i11;
        float f17;
        int i12;
        int i13;
        int i14;
        float f18;
        int i15;
        int i16;
        int i17;
        float f19;
        int i18;
        float f20;
        int i19;
        float f21;
        int i20;
        float fMin2;
        float f22;
        int iDp;
        int iDp2;
        float f23;
        float f24;
        float f25;
        float f26;
        long j;
        long j2;
        int i21;
        float f27;
        float f28;
        float f29;
        float f30;
        int i22;
        float f31;
        float f32;
        int i23;
        Path path;
        Path path2;
        Path path3;
        int i24;
        Path path4;
        Path path5;
        int i25;
        int i26;
        int i27;
        int i28;
        float interpolation = 90.0f;
        Rect bounds = getBounds();
        MessageDrawable messageDrawable = this.messageDrawable;
        if (messageDrawable != null && messageDrawable.hasGradient() && !this.hasOverlayImage) {
            Shader gradientShader = this.messageDrawable.getGradientShader();
            this.paint.setShader(gradientShader);
            this.paint2.setShader(gradientShader);
            this.paint3.setShader(gradientShader);
        } else if (this.gradientDrawable != null && !this.hasOverlayImage) {
            this.gradientMatrix.reset();
            this.gradientMatrix.setTranslate(0.0f, bounds.top);
            this.gradientDrawable.setLocalMatrix(this.gradientMatrix);
            this.paint.setShader(this.gradientDrawable);
            this.paint2.setShader(this.gradientDrawable);
            this.paint3.setShader(this.gradientDrawable);
        } else {
            this.paint.setShader(null);
            this.paint2.setShader(null);
            this.paint3.setShader(null);
        }
        int iCenterX = bounds.centerX();
        int iCenterY3 = bounds.centerY();
        int i29 = this.nextIcon;
        if (i29 == 4) {
            int i30 = this.currentIcon;
            if (i30 == 3 || i30 == 14) {
                i = 0;
            } else {
                iSave = canvas.save();
                float f33 = 1.0f - this.transitionProgress;
                canvas.scale(f33, f33, iCenterX, iCenterY3);
                i = iSave;
            }
        } else if ((i29 == 6 || i29 == 10) && this.currentIcon == 4) {
            iSave = canvas.save();
            float f34 = this.transitionProgress;
            canvas.scale(f34, f34, iCenterX, iCenterY3);
            i = iSave;
        } else {
            i = 0;
        }
        AndroidUtilities.dp(3.0f);
        if (this.currentIcon == 2 || this.nextIcon == 2) {
            applyShaderMatrix(false);
            float f35 = iCenterY3;
            float fDp6 = f35 - (AndroidUtilities.dp(9.0f) * this.scale);
            float fDp7 = (AndroidUtilities.dp(9.0f) * this.scale) + f35;
            float fDp8 = (AndroidUtilities.dp(12.0f) * this.scale) + f35;
            int i31 = this.currentIcon;
            if ((i31 == 3 || i31 == 14) && this.nextIcon == 2) {
                this.paint.setAlpha((int) (Math.min(1.0f, this.transitionProgress / 0.5f) * 255.0f));
                f = this.transitionProgress;
                fDp = AndroidUtilities.dp(12.0f);
                f2 = this.scale;
            } else {
                int i32 = this.nextIcon;
                if (i32 != 3 && i32 != 14 && i32 != 2) {
                    this.paint.setAlpha((int) (Math.min(1.0f, this.savedTransitionProgress / 0.5f) * 255.0f * (1.0f - this.transitionProgress)));
                    f = this.savedTransitionProgress;
                } else {
                    this.paint.setAlpha(255);
                    f = this.transitionProgress;
                }
                fDp = AndroidUtilities.dp(1.0f);
                f2 = this.scale;
            }
            float f36 = (fDp * f2) + f35;
            if (this.animatingTransition) {
                int i33 = this.nextIcon;
                if (i33 != 2) {
                    if (f <= 0.5f) {
                        i3 = 2;
                        i2 = 8;
                    } else {
                        float fDp9 = AndroidUtilities.dp(13.0f);
                        float f37 = this.scale;
                        float fDp10 = (fDp9 * f37 * f37) + (this.isMini ? AndroidUtilities.dp(2.0f) : 0);
                        float f38 = f - 0.5f;
                        float f39 = f38 / 0.5f;
                        if (f38 > 0.2f) {
                            f10 = (f38 - 0.2f) / 0.3f;
                            f9 = 1.0f;
                        } else {
                            f9 = f38 / 0.2f;
                            f10 = 0.0f;
                        }
                        fDp2 = iCenterX;
                        float f40 = fDp2 - fDp10;
                        float f41 = fDp10 / 2.0f;
                        this.rect.set(f40, fDp8 - f41, fDp2, f41 + fDp8);
                        float f42 = f10 * 100.0f;
                        iCenterY3 = iCenterY3;
                        f4 = fDp8;
                        i2 = 8;
                        canvas.drawArc(this.rect, f42, (f39 * 104.0f) - f42, false, this.paint);
                        float f43 = f36 + ((f4 - f36) * f9);
                        if (f10 > 0.0f) {
                            float f44 = this.nextIcon == 14 ? 0.0f : (1.0f - f10) * (-45.0f);
                            float fDp11 = AndroidUtilities.dp(7.0f) * f10 * this.scale;
                            int iMin2 = (int) (f10 * 255.0f);
                            int i34 = this.nextIcon;
                            if (i34 != 3 && i34 != 14 && i34 != 2) {
                                iMin2 = (int) (iMin2 * (1.0f - Math.min(1.0f, this.transitionProgress / 0.5f)));
                            }
                            int i35 = iMin2;
                            if (f44 != 0.0f) {
                                canvas.save();
                                canvas.rotate(f44, fDp2, f35);
                            }
                            if (i35 != 0) {
                                this.paint.setAlpha(i35);
                                if (this.nextIcon == 14) {
                                    this.paint3.setAlpha(i35);
                                    this.rect.set(iCenterX - AndroidUtilities.dp(3.5f), iCenterY3 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + iCenterX, AndroidUtilities.dp(3.5f) + iCenterY3);
                                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.paint3);
                                    this.paint.setAlpha((int) (i35 * 0.15f));
                                    int iDp3 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                                    this.rect.set(bounds.left + iDp3, bounds.top + iDp3, bounds.right - iDp3, bounds.bottom - iDp3);
                                    canvas.drawArc(this.rect, 0.0f, 360.0f, false, this.paint);
                                    this.paint.setAlpha(i35);
                                } else {
                                    float f45 = fDp2 - fDp11;
                                    float f46 = f35 - fDp11;
                                    float f47 = fDp2 + fDp11;
                                    float f48 = f35 + fDp11;
                                    canvas.drawLine(f45, f46, f47, f48, this.paint);
                                    canvas.drawLine(f47, f46, f45, f48, this.paint);
                                }
                            }
                            if (f44 != 0.0f) {
                                canvas.restore();
                            }
                        }
                        iCenterX = iCenterX;
                        fDp6 = f43;
                        f5 = fDp2;
                        f6 = f4;
                    }
                    if (fDp6 != f6) {
                        float f49 = iCenterX;
                        canvas.drawLine(f49, fDp6, f49, f6, this.paint);
                    }
                    f7 = iCenterX;
                    if (fDp2 != f7) {
                        float f50 = f4;
                        canvas.drawLine(fDp2, f50, f7, f6, this.paint);
                        canvas.drawLine(f5, f50, f7, f6, this.paint);
                    }
                } else {
                    i2 = 8;
                    i3 = 2;
                }
                if (i33 == i3) {
                    f8 = 1.0f - f;
                } else {
                    f8 = f / 0.5f;
                    f = 1.0f - f8;
                }
                fDp6 += (f36 - fDp6) * f8;
                fDp7 += (fDp8 - fDp7) * f8;
                float f51 = iCenterX;
                fDp2 = f51 - ((AndroidUtilities.dp(8.0f) * f) * this.scale);
                fDp3 = f51 + (AndroidUtilities.dp(8.0f) * f * this.scale);
                fDp4 = AndroidUtilities.dp(8.0f) * f;
                f3 = this.scale;
            } else {
                iCenterX = iCenterX;
                iCenterY3 = iCenterY3;
                i2 = 8;
                float f52 = iCenterX;
                fDp2 = f52 - (AndroidUtilities.dp(8.0f) * this.scale);
                fDp3 = f52 + (AndroidUtilities.dp(8.0f) * this.scale);
                fDp4 = AndroidUtilities.dp(8.0f);
                f3 = this.scale;
            }
            f5 = fDp3;
            f4 = fDp7 - (fDp4 * f3);
            f6 = fDp7;
            if (fDp6 != f6) {
                float f410 = iCenterX;
                canvas.drawLine(f410, fDp6, f410, f6, this.paint);
            }
            f7 = iCenterX;
            if (fDp2 != f7) {
                float f53 = f4;
                canvas.drawLine(fDp2, f53, f7, f6, this.paint);
                canvas.drawLine(f5, f53, f7, f6, this.paint);
            }
        } else {
            iCenterX = iCenterX;
            iCenterY3 = iCenterY3;
            i2 = 8;
        }
        int i36 = this.currentIcon;
        if (i36 == 3 || i36 == 14 || (i36 == 4 && ((i28 = this.nextIcon) == 14 || i28 == 3))) {
            canvas2 = canvas;
            applyShaderMatrix(false);
            int i37 = this.nextIcon;
            if (i37 == 2) {
                float f54 = this.transitionProgress;
                if (f54 <= 0.5f) {
                    float f55 = 1.0f - (f54 / 0.5f);
                    i8 = (int) (f55 * 255.0f);
                    fDp5 = AndroidUtilities.dp(7.0f) * f55 * this.scale;
                } else {
                    fDp5 = 0.0f;
                    i8 = 0;
                }
                iMin = i8;
                fCenterY = 0.0f;
                fCenterX = 0.0f;
                f13 = 0.0f;
                f12 = 1.0f;
                i4 = 9;
                i5 = 7;
            } else {
                if (i37 == 15 || i37 == 0 || i37 == 1 || i37 == 5 || i37 == i2) {
                    i4 = 9;
                    i5 = 7;
                } else {
                    i4 = 9;
                    i5 = 7;
                    if (i37 != 9) {
                        i6 = 6;
                        if (i37 != 7 && i37 != 6) {
                            if (i37 == 4) {
                                float f56 = 1.0f - this.transitionProgress;
                                float fDp12 = AndroidUtilities.dp(7.0f) * this.scale;
                                int i38 = (int) (f56 * 255.0f);
                                if (this.currentIcon == 14) {
                                    fCenterX = bounds.left;
                                    iCenterY2 = bounds.top;
                                } else {
                                    fCenterX = bounds.centerX();
                                    iCenterY2 = bounds.centerY();
                                }
                                f12 = f56;
                                fDp5 = fDp12;
                                fCenterY = iCenterY2;
                                iMin = i38;
                            } else if (i37 == 14 || i37 == 3) {
                                float f57 = this.transitionProgress;
                                float f58 = 1.0f - f57;
                                if (this.currentIcon == 4) {
                                    f15 = f57;
                                    f14 = 0.0f;
                                } else {
                                    f14 = f58 * 45.0f;
                                    f15 = 1.0f;
                                }
                                float fDp13 = AndroidUtilities.dp(7.0f) * this.scale;
                                int i39 = (int) (f57 * 255.0f);
                                if (this.nextIcon == 14) {
                                    fCenterX2 = bounds.left;
                                    iCenterY = bounds.top;
                                } else {
                                    fCenterX2 = bounds.centerX();
                                    iCenterY = bounds.centerY();
                                }
                                float f59 = f15;
                                fCenterX = fCenterX2;
                                fDp5 = fDp13;
                                f13 = f14;
                                fCenterY = iCenterY;
                                iMin = i39;
                                f12 = f59;
                            } else {
                                fDp5 = AndroidUtilities.dp(7.0f) * this.scale;
                                fCenterY = 0.0f;
                                fCenterX = 0.0f;
                                f13 = 0.0f;
                                f12 = 1.0f;
                                iMin = 255;
                            }
                        }
                        f13 = 0.0f;
                    }
                    if (i37 == i6) {
                        f11 = 1.0f;
                        fMin = Math.min(1.0f, this.transitionProgress / 0.5f);
                    } else {
                        f11 = 1.0f;
                        fMin = this.transitionProgress;
                    }
                    float f60 = f11 - fMin;
                    float fCenterX3 = bounds.centerX();
                    fCenterY = bounds.centerY();
                    fCenterX = fCenterX3;
                    fDp5 = AndroidUtilities.dp(7.0f) * f60 * this.scale;
                    iMin = (int) (Math.min(f11, f60 * 2.0f) * 255.0f);
                    f12 = f60;
                    f13 = 0.0f;
                }
                i6 = 6;
                if (i37 == i6) {
                    f11 = 1.0f;
                    fMin = Math.min(1.0f, this.transitionProgress / 0.5f);
                } else {
                    f11 = 1.0f;
                    fMin = this.transitionProgress;
                }
                float f61 = f11 - fMin;
                float fCenterX4 = bounds.centerX();
                fCenterY = bounds.centerY();
                fCenterX = fCenterX4;
                fDp5 = AndroidUtilities.dp(7.0f) * f61 * this.scale;
                iMin = (int) (Math.min(f11, f61 * 2.0f) * 255.0f);
                f12 = f61;
                f13 = 0.0f;
            }
            if (f12 != 1.0f) {
                canvas2.save();
                canvas2.scale(f12, f12, fCenterX, fCenterY);
            }
            if (f13 != 0.0f) {
                canvas2.save();
                canvas2.rotate(f13, iCenterX, iCenterY3);
            }
            if (iMin != 0) {
                float f62 = iMin;
                this.paint.setAlpha((int) (this.overrideAlpha * f62));
                if (this.currentIcon == 14 || this.nextIcon == 14) {
                    this.paint3.setAlpha((int) (f62 * this.overrideAlpha));
                    this.rect.set(iCenterX - AndroidUtilities.dp(3.5f), iCenterY3 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + iCenterX, AndroidUtilities.dp(3.5f) + iCenterY3);
                    canvas2.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.paint3);
                } else {
                    float f63 = iCenterX;
                    float f64 = f63 - fDp5;
                    float f65 = iCenterY3;
                    float f66 = f65 - fDp5;
                    float f67 = f63 + fDp5;
                    float f68 = f65 + fDp5;
                    canvas2.drawLine(f64, f66, f67, f68, this.paint);
                    canvas2 = canvas;
                    canvas2.drawLine(f67, f66, f64, f68, this.paint);
                }
            }
            if (f13 != 0.0f) {
                canvas2.restore();
            }
            if (f12 != 1.0f) {
                canvas2.restore();
            }
            int i40 = this.currentIcon;
            if ((i40 == 3 || i40 == 14 || (i40 == 4 && ((i7 = this.nextIcon) == 14 || i7 == 3))) && iMin != 0) {
                float fMax2 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                int iDp4 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                this.rect.set(bounds.left + iDp4, bounds.top + iDp4, bounds.right - iDp4, bounds.bottom - iDp4);
                int i41 = this.currentIcon;
                if (i41 == 14 || (i41 == 4 && this.nextIcon == 14)) {
                    this.paint.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                    canvas2.drawArc(this.rect, 0.0f, 360.0f, false, this.paint);
                    this.paint.setAlpha(iMin);
                }
                canvas2 = canvas;
                canvas2.drawArc(this.rect, this.downloadRadOffset, fMax2, false, this.paint);
            }
        } else {
            if (i36 == 10 || this.nextIcon == 10 || i36 == 13) {
                int i42 = this.nextIcon;
                int i43 = (i42 == 4 || i42 == 6) ? (int) ((1.0f - this.transitionProgress) * 255.0f) : 255;
                if (i43 != 0) {
                    applyShaderMatrix(false);
                    this.paint.setAlpha((int) (i43 * this.overrideAlpha));
                    float fMax3 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                    int iDp5 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                    this.rect.set(bounds.left + iDp5, bounds.top + iDp5, bounds.right - iDp5, bounds.bottom - iDp5);
                    canvas2 = canvas;
                    canvas2.drawArc(this.rect, this.downloadRadOffset, fMax3, false, this.paint);
                } else {
                    canvas2 = canvas;
                }
            } else {
                canvas2 = canvas;
            }
            i4 = 9;
            i5 = 7;
        }
        int i44 = this.currentIcon;
        if (i44 == this.nextIcon) {
            f16 = 1.0f;
            fMax = 1.0f;
        } else if (i44 == 4 || i44 == 3 || i44 == 14) {
            float f69 = this.transitionProgress;
            f16 = f69;
            fMax = 1.0f - f69;
        } else {
            float fMin3 = Math.min(1.0f, this.transitionProgress / 0.5f);
            fMax = Math.max(0.0f, 1.0f - (this.transitionProgress / 0.5f));
            f16 = fMin3;
        }
        int i45 = this.nextIcon;
        if (i45 == 15) {
            pathArr = Theme.chat_updatePath;
        } else {
            if (this.currentIcon == 15) {
                pathArr2 = Theme.chat_updatePath;
                pathArr = null;
            } else {
                pathArr = null;
            }
            if (i45 == 5) {
                pathArr = Theme.chat_filePath;
            } else if (this.currentIcon == 5) {
                pathArr2 = Theme.chat_filePath;
            }
            if (i45 == i5) {
                drawable2 = Theme.chat_flameIcon;
                drawable = null;
            } else {
                if (this.currentIcon == i5) {
                    drawable = Theme.chat_flameIcon;
                } else {
                    drawable = null;
                }
                drawable2 = null;
            }
            if (i45 == i2) {
                drawable2 = Theme.chat_gifIcon;
            } else if (this.currentIcon == i2) {
                drawable = Theme.chat_gifIcon;
            }
            drawable3 = drawable;
            drawable4 = drawable2;
            if (this.currentIcon != i4 || i45 == i4) {
                applyShaderMatrix(false);
                Paint paint = this.paint;
                if (this.currentIcon == this.nextIcon) {
                    i9 = 255;
                } else {
                    i9 = (int) (this.transitionProgress * 255.0f);
                }
                paint.setAlpha(i9);
                int iDp6 = iCenterY3 + AndroidUtilities.dp(7.0f);
                int iDp7 = iCenterX - AndroidUtilities.dp(3.0f);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.save();
                    float f70 = this.transitionProgress;
                    canvas2.scale(f70, f70, iCenterX, iCenterY3);
                }
                float fDp14 = iDp7 - AndroidUtilities.dp(6.0f);
                float fDp15 = iDp6 - AndroidUtilities.dp(6.0f);
                Path[] pathArr5 = pathArr2;
                float f71 = iDp7;
                float f72 = iDp6;
                rect = bounds;
                pathArr3 = pathArr;
                pathArr4 = pathArr5;
                canvas2.drawLine(fDp14, fDp15, f71, f72, this.paint);
                canvas2 = canvas;
                canvas2.drawLine(f71, f72, iDp7 + AndroidUtilities.dp(12.0f), iDp6 - AndroidUtilities.dp(12.0f), this.paint);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.restore();
                }
            } else {
                pathArr4 = pathArr2;
                rect = bounds;
                pathArr3 = pathArr;
            }
            if (this.currentIcon != 12 || this.nextIcon == 12) {
                applyShaderMatrix(false);
                i10 = this.currentIcon;
                i11 = this.nextIcon;
                if (i10 == i11) {
                    f17 = 1.0f;
                } else if (i11 == 13) {
                    f17 = this.transitionProgress;
                } else {
                    f17 = 1.0f - this.transitionProgress;
                }
                Paint paint2 = this.paint;
                if (i10 == i11) {
                    i12 = 255;
                } else {
                    i12 = (int) (f17 * 255.0f);
                }
                paint2.setAlpha(i12);
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.save();
                    canvas2.scale(f17, f17, iCenterX, iCenterY3);
                }
                float fDp16 = AndroidUtilities.dp(7.0f) * this.scale;
                float f73 = iCenterX;
                float f74 = f73 - fDp16;
                float f75 = iCenterY3;
                float f76 = f75 - fDp16;
                float f77 = f73 + fDp16;
                float f78 = f75 + fDp16;
                canvas2.drawLine(f74, f76, f77, f78, this.paint);
                canvas2 = canvas;
                canvas2.drawLine(f77, f76, f74, f78, this.paint);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.restore();
                }
            }
            if (this.currentIcon != 13 || this.nextIcon == 13) {
                applyShaderMatrix(false);
                i13 = this.currentIcon;
                i14 = this.nextIcon;
                if (i13 == i14) {
                    f18 = 1.0f;
                } else if (i14 == 13) {
                    f18 = this.transitionProgress;
                } else {
                    f18 = 1.0f - this.transitionProgress;
                }
                this.textPaint.setAlpha((int) (f18 * 255.0f));
                int iDp8 = iCenterY3 + AndroidUtilities.dp(5.0f);
                int i46 = iCenterX - (this.percentStringWidth / 2);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.save();
                    canvas2.scale(f18, f18, iCenterX, iCenterY3);
                }
                i15 = (int) (this.animatedDownloadProgress * 100.0f);
                if (this.percentString != null || i15 != this.lastPercent) {
                    this.lastPercent = i15;
                    String str = String.format("%d%%", Integer.valueOf(i15));
                    this.percentString = str;
                    this.percentStringWidth = (int) Math.ceil(this.textPaint.measureText(str));
                }
                canvas2.drawText(this.percentString, i46, iDp8, this.textPaint);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.restore();
                }
            }
            i16 = this.currentIcon;
            if (i16 != 0 || i16 == 1 || (i27 = this.nextIcon) == 0 || i27 == 1) {
                if ((i16 == 0 || this.nextIcon != 1) && !(i16 == 1 && this.nextIcon == 0)) {
                    i17 = 1;
                    if (i16 == 1) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                } else if (this.animatingTransition) {
                    if (this.nextIcon == 0) {
                        f19 = 1.0f - this.transitionProgress;
                    } else {
                        f19 = this.transitionProgress;
                    }
                    i17 = 1;
                } else {
                    i17 = 1;
                    if (this.nextIcon == 1) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                }
                i18 = this.nextIcon;
                if ((i18 != 0 || i18 == i17) && (i16 == 0 || i16 == i17)) {
                    this.paint2.setAlpha(255);
                } else if (i18 == 4) {
                    this.paint2.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                } else {
                    this.paint2.setAlpha(i16 == i18 ? 255 : (int) (this.transitionProgress * 255.0f));
                }
                applyShaderMatrix(true);
                canvas2.save();
                canvas2.translate(rect.centerX() + (AndroidUtilities.dp(1.0f) * (1.0f - f19)), rect.centerY());
                f20 = f19 * 500.0f;
                i19 = this.currentIcon;
                if (i19 == 1) {
                    f21 = 90.0f;
                } else {
                    f21 = 0.0f;
                }
                if (i19 == 0 || this.nextIcon != 1) {
                    if (i19 == 1 && this.nextIcon == 0) {
                        if (f20 < 100.0f) {
                            interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f20 / 100.0f) * (-5.0f);
                        } else if (f20 < 484.0f) {
                            interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f20 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                        } else {
                            f21 = 90.0f;
                        }
                    }
                    canvas2.rotate(f21);
                    i20 = this.currentIcon;
                    if ((i20 == 0 && i20 != 1) || i20 == 4) {
                        canvas2.scale(f16, f16);
                    }
                    Theme.playPauseAnimator.draw(canvas2, this.paint2, f20);
                    canvas2.scale(1.0f, -1.0f);
                    Theme.playPauseAnimator.draw(canvas2, this.paint2, f20);
                    canvas2.restore();
                } else {
                    if (f20 < 384.0f) {
                        interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f20 / 384.0f) * 95.0f;
                    } else if (f20 < 484.0f) {
                        interpolation = 95.0f - (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f20 - 384.0f) / 100.0f) * 5.0f);
                    }
                    f20 += 100.0f;
                }
                f21 = interpolation;
                canvas2.rotate(f21);
                i20 = this.currentIcon;
                if (i20 == 0) {
                    canvas2.scale(f16, f16);
                } else {
                    canvas2.scale(f16, f16);
                }
                Theme.playPauseAnimator.draw(canvas2, this.paint2, f20);
                canvas2.scale(1.0f, -1.0f);
                Theme.playPauseAnimator.draw(canvas2, this.paint2, f20);
                canvas2.restore();
            }
            if (this.currentIcon != 6 || this.nextIcon == 6) {
                applyShaderMatrix(false);
                if (this.currentIcon != 6) {
                    f24 = this.transitionProgress;
                    if (f24 > 0.5f) {
                        f26 = (f24 - 0.5f) / 0.5f;
                        fMin2 = 1.0f - Math.min(1.0f, f26 / 0.5f);
                        if (f26 > 0.5f) {
                            f25 = (f26 - 0.5f) / 0.5f;
                        } else {
                            f25 = 0.0f;
                        }
                    } else {
                        f25 = 0.0f;
                        fMin2 = 1.0f;
                    }
                    this.paint.setAlpha(255);
                    f22 = f25;
                } else {
                    if (this.nextIcon != 6) {
                        this.paint.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                    } else {
                        this.paint.setAlpha(255);
                    }
                    fMin2 = 0.0f;
                    f22 = 1.0f;
                }
                iDp = AndroidUtilities.dp(7.0f) + iCenterY3;
                iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                if (fMin2 < 1.0f) {
                    f23 = f16;
                    canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin2), iDp - (AndroidUtilities.dp(6.0f) * fMin2), this.paint);
                } else {
                    f23 = f16;
                }
                if (f22 > 0.0f) {
                    float f79 = iDp2;
                    float f80 = iDp;
                    canvas2 = canvas;
                    canvas2.drawLine(f79, f80, f79 + (AndroidUtilities.dp(12.0f) * f22), f80 - (AndroidUtilities.dp(12.0f) * f22), this.paint);
                } else {
                    canvas2 = canvas;
                }
            } else {
                f23 = f16;
                i = i;
            }
            if (drawable3 != null && drawable3 != drawable4) {
                int intrinsicWidth = (int) (drawable3.getIntrinsicWidth() * fMax);
                int intrinsicHeight = (int) (drawable3.getIntrinsicHeight() * fMax);
                drawable3.setColorFilter(this.colorFilter);
                if (this.currentIcon == this.nextIcon) {
                    i26 = 255;
                } else {
                    i26 = (int) ((1.0f - this.transitionProgress) * 255.0f);
                }
                drawable3.setAlpha(i26);
                int i47 = intrinsicWidth / 2;
                int i48 = intrinsicHeight / 2;
                drawable3.setBounds(iCenterX - i47, iCenterY3 - i48, i47 + iCenterX, i48 + iCenterY3);
                drawable3.draw(canvas2);
            }
            if (drawable4 != null) {
                int intrinsicWidth2 = (int) (drawable4.getIntrinsicWidth() * f23);
                int intrinsicHeight2 = (int) (drawable4.getIntrinsicHeight() * f23);
                drawable4.setColorFilter(this.colorFilter);
                if (this.currentIcon == this.nextIcon) {
                    i25 = 255;
                } else {
                    i25 = (int) (this.transitionProgress * 255.0f);
                }
                drawable4.setAlpha(i25);
                int i49 = intrinsicWidth2 / 2;
                int i50 = intrinsicHeight2 / 2;
                drawable4.setBounds(iCenterX - i49, iCenterY3 - i50, i49 + iCenterX, i50 + iCenterY3);
                drawable4.draw(canvas2);
            }
            if (pathArr4 != null && pathArr4 != pathArr3) {
                int iDp9 = AndroidUtilities.dp(24.0f);
                this.paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                Paint paint3 = this.paint2;
                if (this.currentIcon == this.nextIcon) {
                    i24 = 255;
                } else {
                    i24 = (int) ((1.0f - this.transitionProgress) * 255.0f);
                }
                paint3.setAlpha(i24);
                applyShaderMatrix(true);
                canvas2.save();
                canvas2.translate(iCenterX, iCenterY3);
                canvas2.scale(fMax, fMax);
                float f81 = (-iDp9) / 2;
                canvas2.translate(f81, f81);
                path4 = pathArr4[0];
                if (path4 != null) {
                    canvas2.drawPath(path4, this.paint2);
                }
                path5 = pathArr4[1];
                if (path5 != null) {
                    canvas2.drawPath(path5, this.backPaint);
                }
                canvas2.restore();
            }
            if (pathArr3 != null) {
                int iDp10 = AndroidUtilities.dp(24.0f);
                if (this.currentIcon == this.nextIcon) {
                    i23 = 255;
                } else {
                    i23 = (int) (this.transitionProgress * 255.0f);
                }
                this.paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                this.paint2.setAlpha(i23);
                applyShaderMatrix(true);
                canvas2.save();
                canvas2.translate(iCenterX, iCenterY3);
                float f82 = f23;
                canvas2.scale(f82, f82);
                float f83 = (-iDp10) / 2;
                canvas2.translate(f83, f83);
                path = pathArr3[0];
                if (path != null) {
                    canvas2.drawPath(path, this.paint2);
                }
                if (pathArr3.length >= 3 && (path3 = pathArr3[2]) != null) {
                    canvas2.drawPath(path3, this.paint);
                }
                path2 = pathArr3[1];
                if (path2 != null) {
                    if (i23 != 255) {
                        int alpha = this.backPaint.getAlpha();
                        this.backPaint.setAlpha((int) (alpha * (i23 / 255.0f)));
                        canvas2.drawPath(pathArr3[1], this.backPaint);
                        this.backPaint.setAlpha(alpha);
                    } else {
                        canvas2.drawPath(path2, this.backPaint);
                    }
                }
                canvas2.restore();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            j = jCurrentTimeMillis - this.lastAnimationTime;
            if (j > 17) {
                j2 = 17;
            } else {
                j2 = j;
            }
            this.lastAnimationTime = jCurrentTimeMillis;
            i21 = this.currentIcon;
            if (i21 != 3 || i21 == 14 || ((i21 == 4 && this.nextIcon == 14) || i21 == 10 || i21 == 13)) {
                float f84 = this.downloadRadOffset + ((360 * j2) / 2500.0f);
                this.downloadRadOffset = f84;
                this.downloadRadOffset = getCircleValue(f84);
                if (this.nextIcon != 2) {
                    f27 = this.downloadProgress;
                    f28 = this.downloadProgressAnimationStart;
                    f29 = f27 - f28;
                    if (f29 > 0.0f) {
                        f30 = this.downloadProgressTime + j2;
                        this.downloadProgressTime = f30;
                        if (f30 >= 200.0f) {
                            this.animatedDownloadProgress = f27;
                            this.downloadProgressAnimationStart = f27;
                            this.downloadProgressTime = 0.0f;
                        } else {
                            this.animatedDownloadProgress = f28 + (f29 * this.interpolator.getInterpolation(f30 / 200.0f));
                        }
                    }
                }
                invalidateSelf();
            }
            if (this.animatingTransition) {
                f31 = this.transitionProgress;
                if (f31 < 1.0f) {
                    f32 = f31 + (j2 / this.transitionAnimationTime);
                    this.transitionProgress = f32;
                    if (f32 >= 1.0f) {
                        this.currentIcon = this.nextIcon;
                        this.transitionProgress = 1.0f;
                        this.animatingTransition = false;
                    }
                    invalidateSelf();
                }
            }
            i22 = i;
            if (i22 >= 1) {
                canvas2.restoreToCount(i22);
            }
        }
        pathArr2 = null;
        if (i45 == 5) {
            pathArr = Theme.chat_filePath;
        } else if (this.currentIcon == 5) {
            pathArr2 = Theme.chat_filePath;
        }
        if (i45 == i5) {
            drawable2 = Theme.chat_flameIcon;
            drawable = null;
        } else {
            if (this.currentIcon == i5) {
                drawable = Theme.chat_flameIcon;
            } else {
                drawable = null;
            }
            drawable2 = null;
        }
        if (i45 == i2) {
            drawable2 = Theme.chat_gifIcon;
        } else if (this.currentIcon == i2) {
            drawable = Theme.chat_gifIcon;
        }
        drawable3 = drawable;
        drawable4 = drawable2;
        if (this.currentIcon != i4) {
            applyShaderMatrix(false);
            Paint paint4 = this.paint;
            if (this.currentIcon == this.nextIcon) {
                i9 = 255;
            } else {
                i9 = (int) (this.transitionProgress * 255.0f);
            }
            paint4.setAlpha(i9);
            int iDp11 = iCenterY3 + AndroidUtilities.dp(7.0f);
            int iDp12 = iCenterX - AndroidUtilities.dp(3.0f);
            if (this.currentIcon != this.nextIcon) {
                canvas2.save();
                float f710 = this.transitionProgress;
                canvas2.scale(f710, f710, iCenterX, iCenterY3);
            }
            float fDp17 = iDp12 - AndroidUtilities.dp(6.0f);
            float fDp18 = iDp11 - AndroidUtilities.dp(6.0f);
            Path[] pathArr6 = pathArr2;
            float f711 = iDp12;
            float f712 = iDp11;
            rect = bounds;
            pathArr3 = pathArr;
            pathArr4 = pathArr6;
            canvas2.drawLine(fDp17, fDp18, f711, f712, this.paint);
            canvas2 = canvas;
            canvas2.drawLine(f711, f712, iDp12 + AndroidUtilities.dp(12.0f), iDp11 - AndroidUtilities.dp(12.0f), this.paint);
            if (this.currentIcon != this.nextIcon) {
                canvas2.restore();
            }
        } else {
            applyShaderMatrix(false);
            Paint paint5 = this.paint;
            if (this.currentIcon == this.nextIcon) {
                i9 = 255;
            } else {
                i9 = (int) (this.transitionProgress * 255.0f);
            }
            paint5.setAlpha(i9);
            int iDp13 = iCenterY3 + AndroidUtilities.dp(7.0f);
            int iDp14 = iCenterX - AndroidUtilities.dp(3.0f);
            if (this.currentIcon != this.nextIcon) {
                canvas2.save();
                float f713 = this.transitionProgress;
                canvas2.scale(f713, f713, iCenterX, iCenterY3);
            }
            float fDp19 = iDp14 - AndroidUtilities.dp(6.0f);
            float fDp110 = iDp13 - AndroidUtilities.dp(6.0f);
            Path[] pathArr7 = pathArr2;
            float f714 = iDp14;
            float f715 = iDp13;
            rect = bounds;
            pathArr3 = pathArr;
            pathArr4 = pathArr7;
            canvas2.drawLine(fDp19, fDp110, f714, f715, this.paint);
            canvas2 = canvas;
            canvas2.drawLine(f714, f715, iDp14 + AndroidUtilities.dp(12.0f), iDp13 - AndroidUtilities.dp(12.0f), this.paint);
            if (this.currentIcon != this.nextIcon) {
                canvas2.restore();
            }
        }
        if (this.currentIcon != 12) {
            applyShaderMatrix(false);
            i10 = this.currentIcon;
            i11 = this.nextIcon;
            if (i10 == i11) {
                f17 = 1.0f;
            } else if (i11 == 13) {
                f17 = this.transitionProgress;
            } else {
                f17 = 1.0f - this.transitionProgress;
            }
            Paint paint6 = this.paint;
            if (i10 == i11) {
                i12 = 255;
            } else {
                i12 = (int) (f17 * 255.0f);
            }
            paint6.setAlpha(i12);
            AndroidUtilities.dp(7.0f);
            AndroidUtilities.dp(3.0f);
            if (this.currentIcon != this.nextIcon) {
                canvas2.save();
                canvas2.scale(f17, f17, iCenterX, iCenterY3);
            }
            float fDp111 = AndroidUtilities.dp(7.0f) * this.scale;
            float f716 = iCenterX;
            float f717 = f716 - fDp111;
            float f718 = iCenterY3;
            float f719 = f718 - fDp111;
            float f720 = f716 + fDp111;
            float f721 = f718 + fDp111;
            canvas2.drawLine(f717, f719, f720, f721, this.paint);
            canvas2 = canvas;
            canvas2.drawLine(f720, f719, f717, f721, this.paint);
            if (this.currentIcon != this.nextIcon) {
                canvas2.restore();
            }
        } else {
            applyShaderMatrix(false);
            i10 = this.currentIcon;
            i11 = this.nextIcon;
            if (i10 == i11) {
                f17 = 1.0f;
            } else if (i11 == 13) {
                f17 = this.transitionProgress;
            } else {
                f17 = 1.0f - this.transitionProgress;
            }
            Paint paint7 = this.paint;
            if (i10 == i11) {
                i12 = 255;
            } else {
                i12 = (int) (f17 * 255.0f);
            }
            paint7.setAlpha(i12);
            AndroidUtilities.dp(7.0f);
            AndroidUtilities.dp(3.0f);
            if (this.currentIcon != this.nextIcon) {
                canvas2.save();
                canvas2.scale(f17, f17, iCenterX, iCenterY3);
            }
            float fDp112 = AndroidUtilities.dp(7.0f) * this.scale;
            float f7110 = iCenterX;
            float f7111 = f7110 - fDp112;
            float f7112 = iCenterY3;
            float f7113 = f7112 - fDp112;
            float f722 = f7110 + fDp112;
            float f723 = f7112 + fDp112;
            canvas2.drawLine(f7111, f7113, f722, f723, this.paint);
            canvas2 = canvas;
            canvas2.drawLine(f722, f7113, f7111, f723, this.paint);
            if (this.currentIcon != this.nextIcon) {
                canvas2.restore();
            }
        }
        if (this.currentIcon != 13) {
            applyShaderMatrix(false);
            i13 = this.currentIcon;
            i14 = this.nextIcon;
            if (i13 == i14) {
                f18 = 1.0f;
            } else if (i14 == 13) {
                f18 = this.transitionProgress;
            } else {
                f18 = 1.0f - this.transitionProgress;
            }
            this.textPaint.setAlpha((int) (f18 * 255.0f));
            int iDp15 = iCenterY3 + AndroidUtilities.dp(5.0f);
            int i410 = iCenterX - (this.percentStringWidth / 2);
            if (this.currentIcon != this.nextIcon) {
                canvas2.save();
                canvas2.scale(f18, f18, iCenterX, iCenterY3);
            }
            i15 = (int) (this.animatedDownloadProgress * 100.0f);
            if (this.percentString != null) {
                this.lastPercent = i15;
                String str2 = String.format("%d%%", Integer.valueOf(i15));
                this.percentString = str2;
                this.percentStringWidth = (int) Math.ceil(this.textPaint.measureText(str2));
            } else {
                this.lastPercent = i15;
                String str3 = String.format("%d%%", Integer.valueOf(i15));
                this.percentString = str3;
                this.percentStringWidth = (int) Math.ceil(this.textPaint.measureText(str3));
            }
            canvas2.drawText(this.percentString, i410, iDp15, this.textPaint);
            if (this.currentIcon != this.nextIcon) {
                canvas2.restore();
            }
        } else {
            applyShaderMatrix(false);
            i13 = this.currentIcon;
            i14 = this.nextIcon;
            if (i13 == i14) {
                f18 = 1.0f;
            } else if (i14 == 13) {
                f18 = this.transitionProgress;
            } else {
                f18 = 1.0f - this.transitionProgress;
            }
            this.textPaint.setAlpha((int) (f18 * 255.0f));
            int iDp16 = iCenterY3 + AndroidUtilities.dp(5.0f);
            int i411 = iCenterX - (this.percentStringWidth / 2);
            if (this.currentIcon != this.nextIcon) {
                canvas2.save();
                canvas2.scale(f18, f18, iCenterX, iCenterY3);
            }
            i15 = (int) (this.animatedDownloadProgress * 100.0f);
            if (this.percentString != null) {
                this.lastPercent = i15;
                String str4 = String.format("%d%%", Integer.valueOf(i15));
                this.percentString = str4;
                this.percentStringWidth = (int) Math.ceil(this.textPaint.measureText(str4));
            } else {
                this.lastPercent = i15;
                String str5 = String.format("%d%%", Integer.valueOf(i15));
                this.percentString = str5;
                this.percentStringWidth = (int) Math.ceil(this.textPaint.measureText(str5));
            }
            canvas2.drawText(this.percentString, i411, iDp16, this.textPaint);
            if (this.currentIcon != this.nextIcon) {
                canvas2.restore();
            }
        }
        i16 = this.currentIcon;
        if (i16 != 0) {
            if (i16 == 0) {
                i17 = 1;
                if (i16 == 1) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                i18 = this.nextIcon;
                if (i18 != 0) {
                    this.paint2.setAlpha(255);
                } else {
                    this.paint2.setAlpha(255);
                }
                applyShaderMatrix(true);
                canvas2.save();
                canvas2.translate(rect.centerX() + (AndroidUtilities.dp(1.0f) * (1.0f - f19)), rect.centerY());
                f20 = f19 * 500.0f;
                i19 = this.currentIcon;
                if (i19 == 1) {
                    f21 = 90.0f;
                } else {
                    f21 = 0.0f;
                }
                if (i19 == 0) {
                    if (i19 == 1) {
                        if (f20 < 100.0f) {
                            interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f20 / 100.0f) * (-5.0f);
                        } else if (f20 < 484.0f) {
                            interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f20 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                        } else {
                            f21 = 90.0f;
                        }
                        f21 = interpolation;
                    }
                } else if (i19 == 1) {
                    if (f20 < 100.0f) {
                        interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f20 / 100.0f) * (-5.0f);
                    } else if (f20 < 484.0f) {
                        interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f20 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                    } else {
                        f21 = 90.0f;
                    }
                    f21 = interpolation;
                }
                canvas2.rotate(f21);
                i20 = this.currentIcon;
                if (i20 == 0) {
                    canvas2.scale(f16, f16);
                } else {
                    canvas2.scale(f16, f16);
                }
                Theme.playPauseAnimator.draw(canvas2, this.paint2, f20);
                canvas2.scale(1.0f, -1.0f);
                Theme.playPauseAnimator.draw(canvas2, this.paint2, f20);
                canvas2.restore();
            } else {
                i17 = 1;
                if (i16 == 1) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                i18 = this.nextIcon;
                if (i18 != 0) {
                    this.paint2.setAlpha(255);
                } else {
                    this.paint2.setAlpha(255);
                }
                applyShaderMatrix(true);
                canvas2.save();
                canvas2.translate(rect.centerX() + (AndroidUtilities.dp(1.0f) * (1.0f - f19)), rect.centerY());
                f20 = f19 * 500.0f;
                i19 = this.currentIcon;
                if (i19 == 1) {
                    f21 = 90.0f;
                } else {
                    f21 = 0.0f;
                }
                if (i19 == 0) {
                    if (i19 == 1) {
                        if (f20 < 100.0f) {
                            interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f20 / 100.0f) * (-5.0f);
                        } else if (f20 < 484.0f) {
                            interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f20 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                        } else {
                            f21 = 90.0f;
                        }
                        f21 = interpolation;
                    }
                } else if (i19 == 1) {
                    if (f20 < 100.0f) {
                        interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f20 / 100.0f) * (-5.0f);
                    } else if (f20 < 484.0f) {
                        interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f20 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                    } else {
                        f21 = 90.0f;
                    }
                    f21 = interpolation;
                }
                canvas2.rotate(f21);
                i20 = this.currentIcon;
                if (i20 == 0) {
                    canvas2.scale(f16, f16);
                } else {
                    canvas2.scale(f16, f16);
                }
                Theme.playPauseAnimator.draw(canvas2, this.paint2, f20);
                canvas2.scale(1.0f, -1.0f);
                Theme.playPauseAnimator.draw(canvas2, this.paint2, f20);
                canvas2.restore();
            }
        } else if (i16 == 0) {
            i17 = 1;
            if (i16 == 1) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            i18 = this.nextIcon;
            if (i18 != 0) {
                this.paint2.setAlpha(255);
            } else {
                this.paint2.setAlpha(255);
            }
            applyShaderMatrix(true);
            canvas2.save();
            canvas2.translate(rect.centerX() + (AndroidUtilities.dp(1.0f) * (1.0f - f19)), rect.centerY());
            f20 = f19 * 500.0f;
            i19 = this.currentIcon;
            if (i19 == 1) {
                f21 = 90.0f;
            } else {
                f21 = 0.0f;
            }
            if (i19 == 0) {
                if (i19 == 1) {
                    if (f20 < 100.0f) {
                        interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f20 / 100.0f) * (-5.0f);
                    } else if (f20 < 484.0f) {
                        interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f20 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                    } else {
                        f21 = 90.0f;
                    }
                    f21 = interpolation;
                }
            } else if (i19 == 1) {
                if (f20 < 100.0f) {
                    interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f20 / 100.0f) * (-5.0f);
                } else if (f20 < 484.0f) {
                    interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f20 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                } else {
                    f21 = 90.0f;
                }
                f21 = interpolation;
            }
            canvas2.rotate(f21);
            i20 = this.currentIcon;
            if (i20 == 0) {
                canvas2.scale(f16, f16);
            } else {
                canvas2.scale(f16, f16);
            }
            Theme.playPauseAnimator.draw(canvas2, this.paint2, f20);
            canvas2.scale(1.0f, -1.0f);
            Theme.playPauseAnimator.draw(canvas2, this.paint2, f20);
            canvas2.restore();
        } else {
            i17 = 1;
            if (i16 == 1) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            i18 = this.nextIcon;
            if (i18 != 0) {
                this.paint2.setAlpha(255);
            } else {
                this.paint2.setAlpha(255);
            }
            applyShaderMatrix(true);
            canvas2.save();
            canvas2.translate(rect.centerX() + (AndroidUtilities.dp(1.0f) * (1.0f - f19)), rect.centerY());
            f20 = f19 * 500.0f;
            i19 = this.currentIcon;
            if (i19 == 1) {
                f21 = 90.0f;
            } else {
                f21 = 0.0f;
            }
            if (i19 == 0) {
                if (i19 == 1) {
                    if (f20 < 100.0f) {
                        interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f20 / 100.0f) * (-5.0f);
                    } else if (f20 < 484.0f) {
                        interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f20 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                    } else {
                        f21 = 90.0f;
                    }
                    f21 = interpolation;
                }
            } else if (i19 == 1) {
                if (f20 < 100.0f) {
                    interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f20 / 100.0f) * (-5.0f);
                } else if (f20 < 484.0f) {
                    interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f20 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                } else {
                    f21 = 90.0f;
                }
                f21 = interpolation;
            }
            canvas2.rotate(f21);
            i20 = this.currentIcon;
            if (i20 == 0) {
                canvas2.scale(f16, f16);
            } else {
                canvas2.scale(f16, f16);
            }
            Theme.playPauseAnimator.draw(canvas2, this.paint2, f20);
            canvas2.scale(1.0f, -1.0f);
            Theme.playPauseAnimator.draw(canvas2, this.paint2, f20);
            canvas2.restore();
        }
        if (this.currentIcon != 6) {
            applyShaderMatrix(false);
            if (this.currentIcon != 6) {
                f24 = this.transitionProgress;
                if (f24 > 0.5f) {
                    f26 = (f24 - 0.5f) / 0.5f;
                    fMin2 = 1.0f - Math.min(1.0f, f26 / 0.5f);
                    if (f26 > 0.5f) {
                        f25 = (f26 - 0.5f) / 0.5f;
                    } else {
                        f25 = 0.0f;
                    }
                } else {
                    f25 = 0.0f;
                    fMin2 = 1.0f;
                }
                this.paint.setAlpha(255);
                f22 = f25;
            } else {
                if (this.nextIcon != 6) {
                    this.paint.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                } else {
                    this.paint.setAlpha(255);
                }
                fMin2 = 0.0f;
                f22 = 1.0f;
            }
            iDp = AndroidUtilities.dp(7.0f) + iCenterY3;
            iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
            if (fMin2 < 1.0f) {
                f23 = f16;
                canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin2), iDp - (AndroidUtilities.dp(6.0f) * fMin2), this.paint);
            } else {
                f23 = f16;
            }
            if (f22 > 0.0f) {
                float f724 = iDp2;
                float f85 = iDp;
                canvas2 = canvas;
                canvas2.drawLine(f724, f85, f724 + (AndroidUtilities.dp(12.0f) * f22), f85 - (AndroidUtilities.dp(12.0f) * f22), this.paint);
            } else {
                canvas2 = canvas;
            }
        } else {
            applyShaderMatrix(false);
            if (this.currentIcon != 6) {
                f24 = this.transitionProgress;
                if (f24 > 0.5f) {
                    f26 = (f24 - 0.5f) / 0.5f;
                    fMin2 = 1.0f - Math.min(1.0f, f26 / 0.5f);
                    if (f26 > 0.5f) {
                        f25 = (f26 - 0.5f) / 0.5f;
                    } else {
                        f25 = 0.0f;
                    }
                } else {
                    f25 = 0.0f;
                    fMin2 = 1.0f;
                }
                this.paint.setAlpha(255);
                f22 = f25;
            } else {
                if (this.nextIcon != 6) {
                    this.paint.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                } else {
                    this.paint.setAlpha(255);
                }
                fMin2 = 0.0f;
                f22 = 1.0f;
            }
            iDp = AndroidUtilities.dp(7.0f) + iCenterY3;
            iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
            if (fMin2 < 1.0f) {
                f23 = f16;
                canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin2), iDp - (AndroidUtilities.dp(6.0f) * fMin2), this.paint);
            } else {
                f23 = f16;
            }
            if (f22 > 0.0f) {
                float f725 = iDp2;
                float f86 = iDp;
                canvas2 = canvas;
                canvas2.drawLine(f725, f86, f725 + (AndroidUtilities.dp(12.0f) * f22), f86 - (AndroidUtilities.dp(12.0f) * f22), this.paint);
            } else {
                canvas2 = canvas;
            }
        }
        if (drawable3 != null) {
            int intrinsicWidth3 = (int) (drawable3.getIntrinsicWidth() * fMax);
            int intrinsicHeight3 = (int) (drawable3.getIntrinsicHeight() * fMax);
            drawable3.setColorFilter(this.colorFilter);
            if (this.currentIcon == this.nextIcon) {
                i26 = 255;
            } else {
                i26 = (int) ((1.0f - this.transitionProgress) * 255.0f);
            }
            drawable3.setAlpha(i26);
            int i412 = intrinsicWidth3 / 2;
            int i413 = intrinsicHeight3 / 2;
            drawable3.setBounds(iCenterX - i412, iCenterY3 - i413, i412 + iCenterX, i413 + iCenterY3);
            drawable3.draw(canvas2);
        }
        if (drawable4 != null) {
            int intrinsicWidth4 = (int) (drawable4.getIntrinsicWidth() * f23);
            int intrinsicHeight4 = (int) (drawable4.getIntrinsicHeight() * f23);
            drawable4.setColorFilter(this.colorFilter);
            if (this.currentIcon == this.nextIcon) {
                i25 = 255;
            } else {
                i25 = (int) (this.transitionProgress * 255.0f);
            }
            drawable4.setAlpha(i25);
            int i414 = intrinsicWidth4 / 2;
            int i51 = intrinsicHeight4 / 2;
            drawable4.setBounds(iCenterX - i414, iCenterY3 - i51, i414 + iCenterX, i51 + iCenterY3);
            drawable4.draw(canvas2);
        }
        if (pathArr4 != null) {
            int iDp17 = AndroidUtilities.dp(24.0f);
            this.paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            Paint paint8 = this.paint2;
            if (this.currentIcon == this.nextIcon) {
                i24 = 255;
            } else {
                i24 = (int) ((1.0f - this.transitionProgress) * 255.0f);
            }
            paint8.setAlpha(i24);
            applyShaderMatrix(true);
            canvas2.save();
            canvas2.translate(iCenterX, iCenterY3);
            canvas2.scale(fMax, fMax);
            float f87 = (-iDp17) / 2;
            canvas2.translate(f87, f87);
            path4 = pathArr4[0];
            if (path4 != null) {
                canvas2.drawPath(path4, this.paint2);
            }
            path5 = pathArr4[1];
            if (path5 != null) {
                canvas2.drawPath(path5, this.backPaint);
            }
            canvas2.restore();
        }
        if (pathArr3 != null) {
            int iDp18 = AndroidUtilities.dp(24.0f);
            if (this.currentIcon == this.nextIcon) {
                i23 = 255;
            } else {
                i23 = (int) (this.transitionProgress * 255.0f);
            }
            this.paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.paint2.setAlpha(i23);
            applyShaderMatrix(true);
            canvas2.save();
            canvas2.translate(iCenterX, iCenterY3);
            float f88 = f23;
            canvas2.scale(f88, f88);
            float f89 = (-iDp18) / 2;
            canvas2.translate(f89, f89);
            path = pathArr3[0];
            if (path != null) {
                canvas2.drawPath(path, this.paint2);
            }
            if (pathArr3.length >= 3) {
                canvas2.drawPath(path3, this.paint);
            }
            path2 = pathArr3[1];
            if (path2 != null) {
                if (i23 != 255) {
                    int alpha2 = this.backPaint.getAlpha();
                    this.backPaint.setAlpha((int) (alpha2 * (i23 / 255.0f)));
                    canvas2.drawPath(pathArr3[1], this.backPaint);
                    this.backPaint.setAlpha(alpha2);
                } else {
                    canvas2.drawPath(path2, this.backPaint);
                }
            }
            canvas2.restore();
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        j = jCurrentTimeMillis2 - this.lastAnimationTime;
        if (j > 17) {
            j2 = 17;
        } else {
            j2 = j;
        }
        this.lastAnimationTime = jCurrentTimeMillis2;
        i21 = this.currentIcon;
        if (i21 != 3) {
            float f810 = this.downloadRadOffset + ((360 * j2) / 2500.0f);
            this.downloadRadOffset = f810;
            this.downloadRadOffset = getCircleValue(f810);
            if (this.nextIcon != 2) {
                f27 = this.downloadProgress;
                f28 = this.downloadProgressAnimationStart;
                f29 = f27 - f28;
                if (f29 > 0.0f) {
                    f30 = this.downloadProgressTime + j2;
                    this.downloadProgressTime = f30;
                    if (f30 >= 200.0f) {
                        this.animatedDownloadProgress = f27;
                        this.downloadProgressAnimationStart = f27;
                        this.downloadProgressTime = 0.0f;
                    } else {
                        this.animatedDownloadProgress = f28 + (f29 * this.interpolator.getInterpolation(f30 / 200.0f));
                    }
                }
            }
            invalidateSelf();
        } else {
            float f811 = this.downloadRadOffset + ((360 * j2) / 2500.0f);
            this.downloadRadOffset = f811;
            this.downloadRadOffset = getCircleValue(f811);
            if (this.nextIcon != 2) {
                f27 = this.downloadProgress;
                f28 = this.downloadProgressAnimationStart;
                f29 = f27 - f28;
                if (f29 > 0.0f) {
                    f30 = this.downloadProgressTime + j2;
                    this.downloadProgressTime = f30;
                    if (f30 >= 200.0f) {
                        this.animatedDownloadProgress = f27;
                        this.downloadProgressAnimationStart = f27;
                        this.downloadProgressTime = 0.0f;
                    } else {
                        this.animatedDownloadProgress = f28 + (f29 * this.interpolator.getInterpolation(f30 / 200.0f));
                    }
                }
            }
            invalidateSelf();
        }
        if (this.animatingTransition) {
            f31 = this.transitionProgress;
            if (f31 < 1.0f) {
                f32 = f31 + (j2 / this.transitionAnimationTime);
                this.transitionProgress = f32;
                if (f32 >= 1.0f) {
                    this.currentIcon = this.nextIcon;
                    this.transitionProgress = 1.0f;
                    this.animatingTransition = false;
                }
                invalidateSelf();
            }
        }
        i22 = i;
        if (i22 >= 1) {
            canvas2.restoreToCount(i22);
        }
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public int getMinimumWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public int getMinimumHeight() {
        return AndroidUtilities.dp(48.0f);
    }
}
