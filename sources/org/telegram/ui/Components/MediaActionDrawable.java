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
        int i2;
        float fDp2;
        float fDp3;
        float fDp4;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        Rect rect;
        int i3;
        int i4;
        int i5;
        float f11;
        float fMin;
        float fCenterX;
        float fCenterY;
        float fDp5;
        int iMin;
        float f12;
        float f13;
        float fCenterX2;
        float fDp6;
        float f14;
        float f15;
        int iCenterY;
        int iCenterY2;
        int i6;
        int i7;
        int i8;
        float f16;
        float fMax;
        Path[] pathArr;
        Path[] pathArr2;
        Path[] pathArr3;
        Path[] pathArr4;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        int i9;
        float f17;
        Path[] pathArr5;
        Path[] pathArr6;
        int i10;
        int i11;
        float f18;
        int i12;
        int i13;
        int i14;
        float f19;
        int i15;
        int i16;
        int i17;
        float f20;
        int i18;
        int i19;
        boolean z;
        float f21;
        int i20;
        float f22;
        int i21;
        float f23;
        float fMin2;
        int iDp;
        int iDp2;
        float f24;
        float f25;
        float f26;
        Path[] pathArr7;
        Path[] pathArr8;
        long j;
        long j2;
        int i22;
        float f27;
        float f28;
        float f29;
        float f30;
        int i23;
        float f31;
        float f32;
        int i24;
        Path path;
        Path path2;
        Path path3;
        int i25;
        Path path4;
        Path path5;
        int i26;
        int i27;
        int i28;
        int i29;
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
        int i30 = this.nextIcon;
        if (i30 == 4) {
            int i31 = this.currentIcon;
            if (i31 == 3 || i31 == 14) {
                i = 0;
            } else {
                iSave = canvas.save();
                float f33 = 1.0f - this.transitionProgress;
                canvas.scale(f33, f33, iCenterX, iCenterY3);
                i = iSave;
            }
        } else if ((i30 == 6 || i30 == 10) && this.currentIcon == 4) {
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
            float fDp7 = f35 - (AndroidUtilities.dp(9.0f) * this.scale);
            float fDp8 = (AndroidUtilities.dp(9.0f) * this.scale) + f35;
            float fDp9 = (AndroidUtilities.dp(12.0f) * this.scale) + f35;
            int i32 = this.currentIcon;
            if ((i32 == 3 || i32 == 14) && this.nextIcon == 2) {
                this.paint.setAlpha((int) (Math.min(1.0f, this.transitionProgress / 0.5f) * 255.0f));
                f = this.transitionProgress;
                fDp = (AndroidUtilities.dp(12.0f) * this.scale) + f35;
            } else {
                int i33 = this.nextIcon;
                if (i33 != 3 && i33 != 14 && i33 != 2) {
                    this.paint.setAlpha((int) (Math.min(1.0f, this.savedTransitionProgress / 0.5f) * 255.0f * (1.0f - this.transitionProgress)));
                    f = this.savedTransitionProgress;
                } else {
                    this.paint.setAlpha(255);
                    f = this.transitionProgress;
                }
                fDp = (AndroidUtilities.dp(1.0f) * this.scale) + f35;
            }
            if (this.animatingTransition) {
                int i34 = this.nextIcon;
                if (i34 == 2 || f <= 0.5f) {
                    i2 = iCenterX;
                    if (i34 == 2) {
                        f8 = 1.0f - f;
                    } else {
                        f8 = f / 0.5f;
                        f = 1.0f - f8;
                    }
                    fDp7 += (fDp - fDp7) * f8;
                    fDp8 += (fDp9 - fDp8) * f8;
                    float f36 = i2;
                    fDp2 = f36 - ((AndroidUtilities.dp(8.0f) * f) * this.scale);
                    fDp3 = f36 + (AndroidUtilities.dp(8.0f) * f * this.scale);
                    fDp4 = AndroidUtilities.dp(8.0f) * f;
                    f2 = this.scale;
                } else {
                    float fDp10 = AndroidUtilities.dp(13.0f);
                    float f37 = this.scale;
                    float fDp11 = (fDp10 * f37 * f37) + (this.isMini ? AndroidUtilities.dp(2.0f) : 0);
                    float f38 = f - 0.5f;
                    float f39 = f38 / 0.5f;
                    if (f38 > 0.2f) {
                        f10 = (f38 - 0.2f) / 0.3f;
                        f9 = 1.0f;
                    } else {
                        f9 = f38 / 0.2f;
                        f10 = 0.0f;
                    }
                    float f40 = iCenterX;
                    float f41 = f40 - fDp11;
                    float f42 = fDp11 / 2.0f;
                    this.rect.set(f41, fDp9 - f42, f40, f42 + fDp9);
                    float f43 = f10 * 100.0f;
                    i = i;
                    iCenterY3 = iCenterY3;
                    i2 = iCenterX;
                    canvas.drawArc(this.rect, f43, (f39 * 104.0f) - f43, false, this.paint);
                    float f44 = fDp + ((fDp9 - fDp) * f9);
                    if (f10 > 0.0f) {
                        float f45 = this.nextIcon == 14 ? 0.0f : (-45.0f) * (1.0f - f10);
                        float fDp12 = AndroidUtilities.dp(7.0f) * f10 * this.scale;
                        int iMin2 = (int) (f10 * 255.0f);
                        int i35 = this.nextIcon;
                        if (i35 != 3 && i35 != 14 && i35 != 2) {
                            iMin2 = (int) (iMin2 * (1.0f - Math.min(1.0f, this.transitionProgress / 0.5f)));
                        }
                        int i36 = iMin2;
                        if (f45 != 0.0f) {
                            canvas.save();
                            canvas.rotate(f45, f40, f35);
                        }
                        if (i36 != 0) {
                            this.paint.setAlpha(i36);
                            if (this.nextIcon == 14) {
                                this.paint3.setAlpha(i36);
                                this.rect.set(i2 - AndroidUtilities.dp(3.5f), iCenterY3 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + i2, AndroidUtilities.dp(3.5f) + iCenterY3);
                                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.paint3);
                                this.paint.setAlpha((int) (i36 * 0.15f));
                                int iDp3 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                                this.rect.set(bounds.left + iDp3, bounds.top + iDp3, bounds.right - iDp3, bounds.bottom - iDp3);
                                canvas.drawArc(this.rect, 0.0f, 360.0f, false, this.paint);
                                this.paint.setAlpha(i36);
                                rect = bounds;
                            } else {
                                rect = bounds;
                                float f46 = f40 - fDp12;
                                float f47 = f35 - fDp12;
                                float f48 = f40 + fDp12;
                                float f49 = f35 + fDp12;
                                canvas.drawLine(f46, f47, f48, f49, this.paint);
                                canvas.drawLine(f48, f47, f46, f49, this.paint);
                            }
                        } else {
                            rect = bounds;
                        }
                        if (f45 != 0.0f) {
                            canvas.restore();
                        }
                    } else {
                        rect = bounds;
                    }
                    f4 = f40;
                    f6 = f44;
                    f5 = f4;
                    bounds = rect;
                    f3 = fDp9;
                }
                if (f6 != f3) {
                    float f50 = i2;
                    canvas.drawLine(f50, f6, f50, f3, this.paint);
                }
                f7 = i2;
                if (f5 != f7) {
                    float f51 = fDp9;
                    float f52 = f3;
                    canvas.drawLine(f5, f51, f7, f52, this.paint);
                    canvas.drawLine(f4, f51, f7, f52, this.paint);
                }
            } else {
                i2 = iCenterX;
                float f53 = i2;
                fDp2 = f53 - (AndroidUtilities.dp(8.0f) * this.scale);
                fDp3 = f53 + (AndroidUtilities.dp(8.0f) * this.scale);
                fDp4 = AndroidUtilities.dp(8.0f);
                f2 = this.scale;
            }
            f3 = fDp8;
            f4 = fDp3;
            f5 = fDp2;
            fDp9 = fDp8 - (fDp4 * f2);
            f6 = fDp7;
            if (f6 != f3) {
                float f54 = i2;
                canvas.drawLine(f54, f6, f54, f3, this.paint);
            }
            f7 = i2;
            if (f5 != f7) {
                float f55 = fDp9;
                float f56 = f3;
                canvas.drawLine(f5, f55, f7, f56, this.paint);
                canvas.drawLine(f4, f55, f7, f56, this.paint);
            }
        } else {
            i2 = iCenterX;
            bounds = bounds;
            i = i;
            iCenterY3 = iCenterY3;
        }
        int i37 = this.currentIcon;
        if (i37 == 3 || i37 == 14 || (i37 == 4 && ((i29 = this.nextIcon) == 14 || i29 == 3))) {
            applyShaderMatrix(false);
            int i38 = this.nextIcon;
            if (i38 == 2) {
                float f57 = this.transitionProgress;
                if (f57 <= 0.5f) {
                    float f58 = 1.0f - (f57 / 0.5f);
                    fDp6 = AndroidUtilities.dp(7.0f) * f58 * this.scale;
                    i8 = (int) (f58 * 255.0f);
                } else {
                    fDp6 = 0.0f;
                    i8 = 0;
                }
                iMin = i8;
                f11 = 1.0f;
                fCenterY = 0.0f;
                fCenterX2 = 0.0f;
                f13 = 0.0f;
                f12 = 1.0f;
                i3 = 8;
                i4 = 9;
            } else {
                if (i38 != 15 && i38 != 0) {
                    if (i38 != 1 && i38 != 5) {
                        i3 = 8;
                        i4 = 9;
                        if (i38 != 8 && i38 != 9 && i38 != 7) {
                            i5 = 6;
                            if (i38 != 6) {
                                if (i38 == 4) {
                                    float f59 = 1.0f - this.transitionProgress;
                                    float fDp13 = AndroidUtilities.dp(7.0f) * this.scale;
                                    int i39 = (int) (f59 * 255.0f);
                                    if (this.currentIcon == 14) {
                                        fCenterX2 = bounds.left;
                                        iCenterY2 = bounds.top;
                                    } else {
                                        fCenterX2 = bounds.centerX();
                                        iCenterY2 = bounds.centerY();
                                    }
                                    float f60 = iCenterY2;
                                    f12 = f59;
                                    fDp6 = fDp13;
                                    f11 = 1.0f;
                                    f13 = 0.0f;
                                    iMin = i39;
                                    fCenterY = f60;
                                } else if (i38 == 14 || i38 == 3) {
                                    float f61 = this.transitionProgress;
                                    float f62 = 1.0f - f61;
                                    if (this.currentIcon == 4) {
                                        f15 = f61;
                                        f14 = 0.0f;
                                    } else {
                                        f14 = 45.0f * f62;
                                        f15 = 1.0f;
                                    }
                                    fDp5 = AndroidUtilities.dp(7.0f) * this.scale;
                                    iMin = (int) (f61 * 255.0f);
                                    if (this.nextIcon == 14) {
                                        fCenterX = bounds.left;
                                        iCenterY = bounds.top;
                                    } else {
                                        fCenterX = bounds.centerX();
                                        iCenterY = bounds.centerY();
                                    }
                                    f12 = f15;
                                    fCenterY = iCenterY;
                                    f13 = f14;
                                    f11 = 1.0f;
                                } else {
                                    fDp6 = AndroidUtilities.dp(7.0f) * this.scale;
                                    f11 = 1.0f;
                                    fCenterY = 0.0f;
                                    fCenterX2 = 0.0f;
                                    f13 = 0.0f;
                                    iMin = 255;
                                    f12 = 1.0f;
                                }
                            }
                            float f63 = fDp5;
                            fCenterX2 = fCenterX;
                            fDp6 = f63;
                        }
                        if (i38 == i5) {
                            f11 = 1.0f;
                            fMin = Math.min(1.0f, this.transitionProgress / 0.5f);
                        } else {
                            f11 = 1.0f;
                            fMin = this.transitionProgress;
                        }
                        float f64 = f11 - fMin;
                        fCenterX = bounds.centerX();
                        fCenterY = bounds.centerY();
                        fDp5 = AndroidUtilities.dp(7.0f) * f64 * this.scale;
                        iMin = (int) (Math.min(f11, f64 * 2.0f) * 255.0f);
                        f12 = f64;
                        f13 = 0.0f;
                        float f65 = fDp5;
                        fCenterX2 = fCenterX;
                        fDp6 = f65;
                    }
                    i5 = 6;
                    if (i38 == i5) {
                        f11 = 1.0f;
                        fMin = Math.min(1.0f, this.transitionProgress / 0.5f);
                    } else {
                        f11 = 1.0f;
                        fMin = this.transitionProgress;
                    }
                    float f66 = f11 - fMin;
                    fCenterX = bounds.centerX();
                    fCenterY = bounds.centerY();
                    fDp5 = AndroidUtilities.dp(7.0f) * f66 * this.scale;
                    iMin = (int) (Math.min(f11, f66 * 2.0f) * 255.0f);
                    f12 = f66;
                    f13 = 0.0f;
                    float f67 = fDp5;
                    fCenterX2 = fCenterX;
                    fDp6 = f67;
                }
                i3 = 8;
                i4 = 9;
                i5 = 6;
                if (i38 == i5) {
                    f11 = 1.0f;
                    fMin = Math.min(1.0f, this.transitionProgress / 0.5f);
                } else {
                    f11 = 1.0f;
                    fMin = this.transitionProgress;
                }
                float f68 = f11 - fMin;
                fCenterX = bounds.centerX();
                fCenterY = bounds.centerY();
                fDp5 = AndroidUtilities.dp(7.0f) * f68 * this.scale;
                iMin = (int) (Math.min(f11, f68 * 2.0f) * 255.0f);
                f12 = f68;
                f13 = 0.0f;
                float f69 = fDp5;
                fCenterX2 = fCenterX;
                fDp6 = f69;
            }
            if (f12 != f11) {
                canvas.save();
                canvas.scale(f12, f12, fCenterX2, fCenterY);
            }
            if (f13 != 0.0f) {
                canvas.save();
                canvas.rotate(f13, i2, iCenterY3);
            }
            if (iMin != 0) {
                float f70 = iMin;
                this.paint.setAlpha((int) (this.overrideAlpha * f70));
                if (this.currentIcon == 14 || this.nextIcon == 14) {
                    i6 = 7;
                    this.paint3.setAlpha((int) (f70 * this.overrideAlpha));
                    this.rect.set(i2 - AndroidUtilities.dp(3.5f), iCenterY3 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + i2, AndroidUtilities.dp(3.5f) + iCenterY3);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.paint3);
                } else {
                    float f71 = i2;
                    float f72 = f71 - fDp6;
                    float f73 = iCenterY3;
                    float f74 = f73 - fDp6;
                    float f75 = f71 + fDp6;
                    float f76 = f73 + fDp6;
                    i6 = 7;
                    canvas.drawLine(f72, f74, f75, f76, this.paint);
                    canvas.drawLine(f75, f74, f72, f76, this.paint);
                }
            } else {
                i6 = 7;
            }
            if (f13 != 0.0f) {
                canvas.restore();
            }
            if (f12 != f11) {
                canvas.restore();
            }
            int i40 = this.currentIcon;
            if ((i40 == 3 || i40 == 14 || (i40 == 4 && ((i7 = this.nextIcon) == 14 || i7 == 3))) && iMin != 0) {
                float fMax2 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                int iDp4 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                this.rect.set(bounds.left + iDp4, bounds.top + iDp4, bounds.right - iDp4, bounds.bottom - iDp4);
                int i41 = this.currentIcon;
                if (i41 == 14 || (i41 == 4 && this.nextIcon == 14)) {
                    this.paint.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                    canvas.drawArc(this.rect, 0.0f, 360.0f, false, this.paint);
                    this.paint.setAlpha(iMin);
                }
                canvas.drawArc(this.rect, this.downloadRadOffset, fMax2, false, this.paint);
            }
        } else {
            if (i37 == 10 || this.nextIcon == 10 || i37 == 13) {
                int i42 = this.nextIcon;
                int i43 = (i42 == 4 || i42 == 6) ? (int) ((1.0f - this.transitionProgress) * 255.0f) : 255;
                if (i43 != 0) {
                    applyShaderMatrix(false);
                    this.paint.setAlpha((int) (i43 * this.overrideAlpha));
                    float fMax3 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                    int iDp5 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                    this.rect.set(bounds.left + iDp5, bounds.top + iDp5, bounds.right - iDp5, bounds.bottom - iDp5);
                    canvas.drawArc(this.rect, this.downloadRadOffset, fMax3, false, this.paint);
                }
            }
            i6 = 7;
            i3 = 8;
            i4 = 9;
        }
        int i44 = this.currentIcon;
        if (i44 == this.nextIcon) {
            f16 = 1.0f;
            fMax = 1.0f;
        } else if (i44 == 4 || i44 == 3 || i44 == 14) {
            float f77 = this.transitionProgress;
            f16 = f77;
            fMax = 1.0f - f77;
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
            pathArr3 = pathArr;
            pathArr4 = pathArr2;
            if (i45 == i6) {
                drawable2 = Theme.chat_flameIcon;
                drawable = null;
            } else {
                if (this.currentIcon == i6) {
                    drawable = Theme.chat_flameIcon;
                } else {
                    drawable = null;
                }
                drawable2 = null;
            }
            if (i45 == i3) {
                drawable2 = Theme.chat_gifIcon;
            } else if (this.currentIcon == i3) {
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
                int iDp7 = i2 - AndroidUtilities.dp(3.0f);
                if (this.currentIcon != this.nextIcon) {
                    canvas.save();
                    float f78 = this.transitionProgress;
                    canvas.scale(f78, f78, i2, iCenterY3);
                }
                float f79 = iDp7;
                f17 = fMax;
                float f80 = iDp6;
                pathArr5 = pathArr4;
                pathArr6 = pathArr3;
                canvas.drawLine(iDp7 - AndroidUtilities.dp(6.0f), iDp6 - AndroidUtilities.dp(6.0f), f79, f80, this.paint);
                canvas.drawLine(f79, f80, iDp7 + AndroidUtilities.dp(12.0f), iDp6 - AndroidUtilities.dp(12.0f), this.paint);
                if (this.currentIcon != this.nextIcon) {
                    canvas.restore();
                }
            } else {
                pathArr5 = pathArr4;
                pathArr6 = pathArr3;
                f17 = fMax;
            }
            if (this.currentIcon != 12 || this.nextIcon == 12) {
                applyShaderMatrix(false);
                i10 = this.currentIcon;
                i11 = this.nextIcon;
                if (i10 == i11) {
                    f18 = 1.0f;
                } else if (i11 == 13) {
                    f18 = this.transitionProgress;
                } else {
                    f18 = 1.0f - this.transitionProgress;
                }
                Paint paint2 = this.paint;
                if (i10 == i11) {
                    i12 = 255;
                } else {
                    i12 = (int) (f18 * 255.0f);
                }
                paint2.setAlpha(i12);
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.currentIcon != this.nextIcon) {
                    canvas.save();
                    canvas.scale(f18, f18, i2, iCenterY3);
                }
                float fDp14 = AndroidUtilities.dp(7.0f) * this.scale;
                float f81 = i2;
                float f82 = f81 - fDp14;
                float f83 = iCenterY3;
                float f84 = f83 - fDp14;
                float f85 = f81 + fDp14;
                float f86 = f83 + fDp14;
                canvas.drawLine(f82, f84, f85, f86, this.paint);
                canvas.drawLine(f85, f84, f82, f86, this.paint);
                if (this.currentIcon != this.nextIcon) {
                    canvas.restore();
                }
            }
            if (this.currentIcon != 13 || this.nextIcon == 13) {
                applyShaderMatrix(false);
                i13 = this.currentIcon;
                i14 = this.nextIcon;
                if (i13 == i14) {
                    f19 = 1.0f;
                } else if (i14 == 13) {
                    f19 = this.transitionProgress;
                } else {
                    f19 = 1.0f - this.transitionProgress;
                }
                this.textPaint.setAlpha((int) (f19 * 255.0f));
                int iDp8 = iCenterY3 + AndroidUtilities.dp(5.0f);
                int i46 = i2 - (this.percentStringWidth / 2);
                if (this.currentIcon != this.nextIcon) {
                    canvas.save();
                    canvas.scale(f19, f19, i2, iCenterY3);
                }
                i15 = (int) (this.animatedDownloadProgress * 100.0f);
                if (this.percentString != null || i15 != this.lastPercent) {
                    this.lastPercent = i15;
                    String str = String.format("%d%%", Integer.valueOf(i15));
                    this.percentString = str;
                    this.percentStringWidth = (int) Math.ceil(this.textPaint.measureText(str));
                }
                canvas.drawText(this.percentString, i46, iDp8, this.textPaint);
                if (this.currentIcon != this.nextIcon) {
                    canvas.restore();
                }
            }
            i16 = this.currentIcon;
            if (i16 != 0 || i16 == 1 || (i28 = this.nextIcon) == 0 || i28 == 1) {
                if ((i16 == 0 || this.nextIcon != 1) && !(i16 == 1 && this.nextIcon == 0)) {
                    i17 = 1;
                    if (i16 == 1) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                } else if (this.animatingTransition) {
                    if (this.nextIcon == 0) {
                        f20 = 1.0f - this.transitionProgress;
                    } else {
                        f20 = this.transitionProgress;
                    }
                    i17 = 1;
                } else {
                    i17 = 1;
                    if (this.nextIcon == 1) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                }
                i18 = this.nextIcon;
                if ((i18 != 0 || i18 == i17) && (i16 == 0 || i16 == i17)) {
                    i19 = 255;
                    this.paint2.setAlpha(255);
                    z = true;
                } else {
                    if (i18 == 4) {
                        this.paint2.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                    } else {
                        this.paint2.setAlpha(i16 == i18 ? 255 : (int) (this.transitionProgress * 255.0f));
                    }
                    z = true;
                    i19 = 255;
                }
                applyShaderMatrix(z);
                canvas.save();
                canvas.translate(bounds.centerX() + (AndroidUtilities.dp(1.0f) * (1.0f - f20)), bounds.centerY());
                f21 = f20 * 500.0f;
                i20 = this.currentIcon;
                if (i20 == 1) {
                    f22 = 90.0f;
                } else {
                    f22 = 0.0f;
                }
                if (i20 == 0 || this.nextIcon != 1) {
                    if (i20 == 1 && this.nextIcon == 0) {
                        if (f21 < 100.0f) {
                            interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                        } else if (f21 < 484.0f) {
                            interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                        } else {
                            f22 = 90.0f;
                        }
                    }
                    canvas.rotate(f22);
                    i21 = this.currentIcon;
                    if ((i21 == 0 && i21 != 1) || i21 == 4) {
                        canvas.scale(f16, f16);
                    }
                    Theme.playPauseAnimator.draw(canvas, this.paint2, f21);
                    canvas.scale(1.0f, -1.0f);
                    Theme.playPauseAnimator.draw(canvas, this.paint2, f21);
                    canvas.restore();
                } else {
                    if (f21 < 384.0f) {
                        interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 384.0f) * 95.0f;
                    } else if (f21 < 484.0f) {
                        interpolation = 95.0f - (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 384.0f) / 100.0f) * 5.0f);
                    }
                    f21 += 100.0f;
                }
                f22 = interpolation;
                canvas.rotate(f22);
                i21 = this.currentIcon;
                if (i21 == 0) {
                    canvas.scale(f16, f16);
                } else {
                    canvas.scale(f16, f16);
                }
                Theme.playPauseAnimator.draw(canvas, this.paint2, f21);
                canvas.scale(1.0f, -1.0f);
                Theme.playPauseAnimator.draw(canvas, this.paint2, f21);
                canvas.restore();
            } else {
                i19 = 255;
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
                    this.paint.setAlpha(i19);
                    f23 = f25;
                } else {
                    if (this.nextIcon != 6) {
                        this.paint.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                    } else {
                        this.paint.setAlpha(i19);
                    }
                    f23 = 1.0f;
                    fMin2 = 0.0f;
                }
                iDp = iCenterY3 + AndroidUtilities.dp(7.0f);
                iDp2 = i2 - AndroidUtilities.dp(3.0f);
                if (fMin2 < 1.0f) {
                    canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin2), iDp - (AndroidUtilities.dp(6.0f) * fMin2), this.paint);
                }
                if (f23 > 0.0f) {
                    float f87 = iDp2;
                    float f88 = iDp;
                    canvas.drawLine(f87, f88, f87 + (AndroidUtilities.dp(12.0f) * f23), f88 - (AndroidUtilities.dp(12.0f) * f23), this.paint);
                }
            } else {
                f16 = f16;
            }
            if (drawable3 != null && drawable3 != drawable4) {
                int intrinsicWidth = (int) (drawable3.getIntrinsicWidth() * f17);
                int intrinsicHeight = (int) (drawable3.getIntrinsicHeight() * f17);
                drawable3.setColorFilter(this.colorFilter);
                if (this.currentIcon == this.nextIcon) {
                    i27 = 255;
                } else {
                    i27 = (int) ((1.0f - this.transitionProgress) * 255.0f);
                }
                drawable3.setAlpha(i27);
                int i47 = intrinsicWidth / 2;
                int i48 = intrinsicHeight / 2;
                drawable3.setBounds(i2 - i47, iCenterY3 - i48, i47 + i2, i48 + iCenterY3);
                drawable3.draw(canvas);
            }
            if (drawable4 != null) {
                int intrinsicWidth2 = (int) (drawable4.getIntrinsicWidth() * f16);
                int intrinsicHeight2 = (int) (drawable4.getIntrinsicHeight() * f16);
                drawable4.setColorFilter(this.colorFilter);
                if (this.currentIcon == this.nextIcon) {
                    i26 = 255;
                } else {
                    i26 = (int) (this.transitionProgress * 255.0f);
                }
                drawable4.setAlpha(i26);
                int i49 = intrinsicWidth2 / 2;
                int i50 = intrinsicHeight2 / 2;
                drawable4.setBounds(i2 - i49, iCenterY3 - i50, i49 + i2, i50 + iCenterY3);
                drawable4.draw(canvas);
            }
            pathArr7 = pathArr5;
            pathArr8 = pathArr6;
            if (pathArr7 != null && pathArr7 != pathArr8) {
                int iDp9 = AndroidUtilities.dp(24.0f);
                this.paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                Paint paint3 = this.paint2;
                if (this.currentIcon == this.nextIcon) {
                    i25 = 255;
                } else {
                    i25 = (int) ((1.0f - this.transitionProgress) * 255.0f);
                }
                paint3.setAlpha(i25);
                applyShaderMatrix(true);
                canvas.save();
                canvas.translate(i2, iCenterY3);
                float f89 = f17;
                canvas.scale(f89, f89);
                float f90 = (-iDp9) / 2;
                canvas.translate(f90, f90);
                path4 = pathArr7[0];
                if (path4 != null) {
                    canvas.drawPath(path4, this.paint2);
                }
                path5 = pathArr7[1];
                if (path5 != null) {
                    canvas.drawPath(path5, this.backPaint);
                }
                canvas.restore();
            }
            if (pathArr8 != null) {
                int iDp10 = AndroidUtilities.dp(24.0f);
                if (this.currentIcon == this.nextIcon) {
                    i24 = 255;
                } else {
                    i24 = (int) (this.transitionProgress * 255.0f);
                }
                this.paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                this.paint2.setAlpha(i24);
                applyShaderMatrix(true);
                canvas.save();
                canvas.translate(i2, iCenterY3);
                float f91 = f16;
                canvas.scale(f91, f91);
                float f92 = (-iDp10) / 2;
                canvas.translate(f92, f92);
                path = pathArr8[0];
                if (path != null) {
                    canvas.drawPath(path, this.paint2);
                }
                if (pathArr8.length >= 3 && (path3 = pathArr8[2]) != null) {
                    canvas.drawPath(path3, this.paint);
                }
                path2 = pathArr8[1];
                if (path2 != null) {
                    if (i24 != 255) {
                        int alpha = this.backPaint.getAlpha();
                        this.backPaint.setAlpha((int) (alpha * (i24 / 255.0f)));
                        canvas.drawPath(pathArr8[1], this.backPaint);
                        this.backPaint.setAlpha(alpha);
                    } else {
                        canvas.drawPath(path2, this.backPaint);
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
            i22 = this.currentIcon;
            if (i22 != 3 || i22 == 14 || ((i22 == 4 && this.nextIcon == 14) || i22 == 10 || i22 == 13)) {
                float f93 = this.downloadRadOffset + ((360 * j2) / 2500.0f);
                this.downloadRadOffset = f93;
                this.downloadRadOffset = getCircleValue(f93);
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
            i23 = i;
            if (i23 >= 1) {
                canvas.restoreToCount(i23);
            }
        }
        pathArr2 = null;
        if (i45 == 5) {
            pathArr = Theme.chat_filePath;
        } else if (this.currentIcon == 5) {
            pathArr2 = Theme.chat_filePath;
        }
        pathArr3 = pathArr;
        pathArr4 = pathArr2;
        if (i45 == i6) {
            drawable2 = Theme.chat_flameIcon;
            drawable = null;
        } else {
            if (this.currentIcon == i6) {
                drawable = Theme.chat_flameIcon;
            } else {
                drawable = null;
            }
            drawable2 = null;
        }
        if (i45 == i3) {
            drawable2 = Theme.chat_gifIcon;
        } else if (this.currentIcon == i3) {
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
            int iDp12 = i2 - AndroidUtilities.dp(3.0f);
            if (this.currentIcon != this.nextIcon) {
                canvas.save();
                float f710 = this.transitionProgress;
                canvas.scale(f710, f710, i2, iCenterY3);
            }
            float f711 = iDp12;
            f17 = fMax;
            float f810 = iDp11;
            pathArr5 = pathArr4;
            pathArr6 = pathArr3;
            canvas.drawLine(iDp12 - AndroidUtilities.dp(6.0f), iDp11 - AndroidUtilities.dp(6.0f), f711, f810, this.paint);
            canvas.drawLine(f711, f810, iDp12 + AndroidUtilities.dp(12.0f), iDp11 - AndroidUtilities.dp(12.0f), this.paint);
            if (this.currentIcon != this.nextIcon) {
                canvas.restore();
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
            int iDp14 = i2 - AndroidUtilities.dp(3.0f);
            if (this.currentIcon != this.nextIcon) {
                canvas.save();
                float f712 = this.transitionProgress;
                canvas.scale(f712, f712, i2, iCenterY3);
            }
            float f713 = iDp14;
            f17 = fMax;
            float f811 = iDp13;
            pathArr5 = pathArr4;
            pathArr6 = pathArr3;
            canvas.drawLine(iDp14 - AndroidUtilities.dp(6.0f), iDp13 - AndroidUtilities.dp(6.0f), f713, f811, this.paint);
            canvas.drawLine(f713, f811, iDp14 + AndroidUtilities.dp(12.0f), iDp13 - AndroidUtilities.dp(12.0f), this.paint);
            if (this.currentIcon != this.nextIcon) {
                canvas.restore();
            }
        }
        if (this.currentIcon != 12) {
            applyShaderMatrix(false);
            i10 = this.currentIcon;
            i11 = this.nextIcon;
            if (i10 == i11) {
                f18 = 1.0f;
            } else if (i11 == 13) {
                f18 = this.transitionProgress;
            } else {
                f18 = 1.0f - this.transitionProgress;
            }
            Paint paint6 = this.paint;
            if (i10 == i11) {
                i12 = 255;
            } else {
                i12 = (int) (f18 * 255.0f);
            }
            paint6.setAlpha(i12);
            AndroidUtilities.dp(7.0f);
            AndroidUtilities.dp(3.0f);
            if (this.currentIcon != this.nextIcon) {
                canvas.save();
                canvas.scale(f18, f18, i2, iCenterY3);
            }
            float fDp15 = AndroidUtilities.dp(7.0f) * this.scale;
            float f812 = i2;
            float f813 = f812 - fDp15;
            float f814 = iCenterY3;
            float f815 = f814 - fDp15;
            float f816 = f812 + fDp15;
            float f817 = f814 + fDp15;
            canvas.drawLine(f813, f815, f816, f817, this.paint);
            canvas.drawLine(f816, f815, f813, f817, this.paint);
            if (this.currentIcon != this.nextIcon) {
                canvas.restore();
            }
        } else {
            applyShaderMatrix(false);
            i10 = this.currentIcon;
            i11 = this.nextIcon;
            if (i10 == i11) {
                f18 = 1.0f;
            } else if (i11 == 13) {
                f18 = this.transitionProgress;
            } else {
                f18 = 1.0f - this.transitionProgress;
            }
            Paint paint7 = this.paint;
            if (i10 == i11) {
                i12 = 255;
            } else {
                i12 = (int) (f18 * 255.0f);
            }
            paint7.setAlpha(i12);
            AndroidUtilities.dp(7.0f);
            AndroidUtilities.dp(3.0f);
            if (this.currentIcon != this.nextIcon) {
                canvas.save();
                canvas.scale(f18, f18, i2, iCenterY3);
            }
            float fDp16 = AndroidUtilities.dp(7.0f) * this.scale;
            float f818 = i2;
            float f819 = f818 - fDp16;
            float f8110 = iCenterY3;
            float f8111 = f8110 - fDp16;
            float f8112 = f818 + fDp16;
            float f8113 = f8110 + fDp16;
            canvas.drawLine(f819, f8111, f8112, f8113, this.paint);
            canvas.drawLine(f8112, f8111, f819, f8113, this.paint);
            if (this.currentIcon != this.nextIcon) {
                canvas.restore();
            }
        }
        if (this.currentIcon != 13) {
            applyShaderMatrix(false);
            i13 = this.currentIcon;
            i14 = this.nextIcon;
            if (i13 == i14) {
                f19 = 1.0f;
            } else if (i14 == 13) {
                f19 = this.transitionProgress;
            } else {
                f19 = 1.0f - this.transitionProgress;
            }
            this.textPaint.setAlpha((int) (f19 * 255.0f));
            int iDp15 = iCenterY3 + AndroidUtilities.dp(5.0f);
            int i410 = i2 - (this.percentStringWidth / 2);
            if (this.currentIcon != this.nextIcon) {
                canvas.save();
                canvas.scale(f19, f19, i2, iCenterY3);
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
            canvas.drawText(this.percentString, i410, iDp15, this.textPaint);
            if (this.currentIcon != this.nextIcon) {
                canvas.restore();
            }
        } else {
            applyShaderMatrix(false);
            i13 = this.currentIcon;
            i14 = this.nextIcon;
            if (i13 == i14) {
                f19 = 1.0f;
            } else if (i14 == 13) {
                f19 = this.transitionProgress;
            } else {
                f19 = 1.0f - this.transitionProgress;
            }
            this.textPaint.setAlpha((int) (f19 * 255.0f));
            int iDp16 = iCenterY3 + AndroidUtilities.dp(5.0f);
            int i411 = i2 - (this.percentStringWidth / 2);
            if (this.currentIcon != this.nextIcon) {
                canvas.save();
                canvas.scale(f19, f19, i2, iCenterY3);
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
            canvas.drawText(this.percentString, i411, iDp16, this.textPaint);
            if (this.currentIcon != this.nextIcon) {
                canvas.restore();
            }
        }
        i16 = this.currentIcon;
        if (i16 != 0) {
            if (i16 == 0) {
                i17 = 1;
                if (i16 == 1) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                i18 = this.nextIcon;
                if (i18 != 0) {
                    i19 = 255;
                    this.paint2.setAlpha(255);
                    z = true;
                } else {
                    i19 = 255;
                    this.paint2.setAlpha(255);
                    z = true;
                }
                applyShaderMatrix(z);
                canvas.save();
                canvas.translate(bounds.centerX() + (AndroidUtilities.dp(1.0f) * (1.0f - f20)), bounds.centerY());
                f21 = f20 * 500.0f;
                i20 = this.currentIcon;
                if (i20 == 1) {
                    f22 = 90.0f;
                } else {
                    f22 = 0.0f;
                }
                if (i20 == 0) {
                    if (i20 == 1) {
                        if (f21 < 100.0f) {
                            interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                        } else if (f21 < 484.0f) {
                            interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                        } else {
                            f22 = 90.0f;
                        }
                        f22 = interpolation;
                    }
                } else if (i20 == 1) {
                    if (f21 < 100.0f) {
                        interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                    } else if (f21 < 484.0f) {
                        interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                    } else {
                        f22 = 90.0f;
                    }
                    f22 = interpolation;
                }
                canvas.rotate(f22);
                i21 = this.currentIcon;
                if (i21 == 0) {
                    canvas.scale(f16, f16);
                } else {
                    canvas.scale(f16, f16);
                }
                Theme.playPauseAnimator.draw(canvas, this.paint2, f21);
                canvas.scale(1.0f, -1.0f);
                Theme.playPauseAnimator.draw(canvas, this.paint2, f21);
                canvas.restore();
            } else {
                i17 = 1;
                if (i16 == 1) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                i18 = this.nextIcon;
                if (i18 != 0) {
                    i19 = 255;
                    this.paint2.setAlpha(255);
                    z = true;
                } else {
                    i19 = 255;
                    this.paint2.setAlpha(255);
                    z = true;
                }
                applyShaderMatrix(z);
                canvas.save();
                canvas.translate(bounds.centerX() + (AndroidUtilities.dp(1.0f) * (1.0f - f20)), bounds.centerY());
                f21 = f20 * 500.0f;
                i20 = this.currentIcon;
                if (i20 == 1) {
                    f22 = 90.0f;
                } else {
                    f22 = 0.0f;
                }
                if (i20 == 0) {
                    if (i20 == 1) {
                        if (f21 < 100.0f) {
                            interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                        } else if (f21 < 484.0f) {
                            interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                        } else {
                            f22 = 90.0f;
                        }
                        f22 = interpolation;
                    }
                } else if (i20 == 1) {
                    if (f21 < 100.0f) {
                        interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                    } else if (f21 < 484.0f) {
                        interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                    } else {
                        f22 = 90.0f;
                    }
                    f22 = interpolation;
                }
                canvas.rotate(f22);
                i21 = this.currentIcon;
                if (i21 == 0) {
                    canvas.scale(f16, f16);
                } else {
                    canvas.scale(f16, f16);
                }
                Theme.playPauseAnimator.draw(canvas, this.paint2, f21);
                canvas.scale(1.0f, -1.0f);
                Theme.playPauseAnimator.draw(canvas, this.paint2, f21);
                canvas.restore();
            }
        } else if (i16 == 0) {
            i17 = 1;
            if (i16 == 1) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            i18 = this.nextIcon;
            if (i18 != 0) {
                i19 = 255;
                this.paint2.setAlpha(255);
                z = true;
            } else {
                i19 = 255;
                this.paint2.setAlpha(255);
                z = true;
            }
            applyShaderMatrix(z);
            canvas.save();
            canvas.translate(bounds.centerX() + (AndroidUtilities.dp(1.0f) * (1.0f - f20)), bounds.centerY());
            f21 = f20 * 500.0f;
            i20 = this.currentIcon;
            if (i20 == 1) {
                f22 = 90.0f;
            } else {
                f22 = 0.0f;
            }
            if (i20 == 0) {
                if (i20 == 1) {
                    if (f21 < 100.0f) {
                        interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                    } else if (f21 < 484.0f) {
                        interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                    } else {
                        f22 = 90.0f;
                    }
                    f22 = interpolation;
                }
            } else if (i20 == 1) {
                if (f21 < 100.0f) {
                    interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                } else if (f21 < 484.0f) {
                    interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                } else {
                    f22 = 90.0f;
                }
                f22 = interpolation;
            }
            canvas.rotate(f22);
            i21 = this.currentIcon;
            if (i21 == 0) {
                canvas.scale(f16, f16);
            } else {
                canvas.scale(f16, f16);
            }
            Theme.playPauseAnimator.draw(canvas, this.paint2, f21);
            canvas.scale(1.0f, -1.0f);
            Theme.playPauseAnimator.draw(canvas, this.paint2, f21);
            canvas.restore();
        } else {
            i17 = 1;
            if (i16 == 1) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            i18 = this.nextIcon;
            if (i18 != 0) {
                i19 = 255;
                this.paint2.setAlpha(255);
                z = true;
            } else {
                i19 = 255;
                this.paint2.setAlpha(255);
                z = true;
            }
            applyShaderMatrix(z);
            canvas.save();
            canvas.translate(bounds.centerX() + (AndroidUtilities.dp(1.0f) * (1.0f - f20)), bounds.centerY());
            f21 = f20 * 500.0f;
            i20 = this.currentIcon;
            if (i20 == 1) {
                f22 = 90.0f;
            } else {
                f22 = 0.0f;
            }
            if (i20 == 0) {
                if (i20 == 1) {
                    if (f21 < 100.0f) {
                        interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                    } else if (f21 < 484.0f) {
                        interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                    } else {
                        f22 = 90.0f;
                    }
                    f22 = interpolation;
                }
            } else if (i20 == 1) {
                if (f21 < 100.0f) {
                    interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                } else if (f21 < 484.0f) {
                    interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                } else {
                    f22 = 90.0f;
                }
                f22 = interpolation;
            }
            canvas.rotate(f22);
            i21 = this.currentIcon;
            if (i21 == 0) {
                canvas.scale(f16, f16);
            } else {
                canvas.scale(f16, f16);
            }
            Theme.playPauseAnimator.draw(canvas, this.paint2, f21);
            canvas.scale(1.0f, -1.0f);
            Theme.playPauseAnimator.draw(canvas, this.paint2, f21);
            canvas.restore();
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
                this.paint.setAlpha(i19);
                f23 = f25;
            } else {
                if (this.nextIcon != 6) {
                    this.paint.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                } else {
                    this.paint.setAlpha(i19);
                }
                f23 = 1.0f;
                fMin2 = 0.0f;
            }
            iDp = iCenterY3 + AndroidUtilities.dp(7.0f);
            iDp2 = i2 - AndroidUtilities.dp(3.0f);
            if (fMin2 < 1.0f) {
                canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin2), iDp - (AndroidUtilities.dp(6.0f) * fMin2), this.paint);
            }
            if (f23 > 0.0f) {
                float f820 = iDp2;
                float f821 = iDp;
                canvas.drawLine(f820, f821, f820 + (AndroidUtilities.dp(12.0f) * f23), f821 - (AndroidUtilities.dp(12.0f) * f23), this.paint);
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
                this.paint.setAlpha(i19);
                f23 = f25;
            } else {
                if (this.nextIcon != 6) {
                    this.paint.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                } else {
                    this.paint.setAlpha(i19);
                }
                f23 = 1.0f;
                fMin2 = 0.0f;
            }
            iDp = iCenterY3 + AndroidUtilities.dp(7.0f);
            iDp2 = i2 - AndroidUtilities.dp(3.0f);
            if (fMin2 < 1.0f) {
                canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin2), iDp - (AndroidUtilities.dp(6.0f) * fMin2), this.paint);
            }
            if (f23 > 0.0f) {
                float f822 = iDp2;
                float f823 = iDp;
                canvas.drawLine(f822, f823, f822 + (AndroidUtilities.dp(12.0f) * f23), f823 - (AndroidUtilities.dp(12.0f) * f23), this.paint);
            }
        }
        if (drawable3 != null) {
            int intrinsicWidth3 = (int) (drawable3.getIntrinsicWidth() * f17);
            int intrinsicHeight3 = (int) (drawable3.getIntrinsicHeight() * f17);
            drawable3.setColorFilter(this.colorFilter);
            if (this.currentIcon == this.nextIcon) {
                i27 = 255;
            } else {
                i27 = (int) ((1.0f - this.transitionProgress) * 255.0f);
            }
            drawable3.setAlpha(i27);
            int i412 = intrinsicWidth3 / 2;
            int i413 = intrinsicHeight3 / 2;
            drawable3.setBounds(i2 - i412, iCenterY3 - i413, i412 + i2, i413 + iCenterY3);
            drawable3.draw(canvas);
        }
        if (drawable4 != null) {
            int intrinsicWidth4 = (int) (drawable4.getIntrinsicWidth() * f16);
            int intrinsicHeight4 = (int) (drawable4.getIntrinsicHeight() * f16);
            drawable4.setColorFilter(this.colorFilter);
            if (this.currentIcon == this.nextIcon) {
                i26 = 255;
            } else {
                i26 = (int) (this.transitionProgress * 255.0f);
            }
            drawable4.setAlpha(i26);
            int i414 = intrinsicWidth4 / 2;
            int i51 = intrinsicHeight4 / 2;
            drawable4.setBounds(i2 - i414, iCenterY3 - i51, i414 + i2, i51 + iCenterY3);
            drawable4.draw(canvas);
        }
        pathArr7 = pathArr5;
        pathArr8 = pathArr6;
        if (pathArr7 != null) {
            int iDp17 = AndroidUtilities.dp(24.0f);
            this.paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            Paint paint8 = this.paint2;
            if (this.currentIcon == this.nextIcon) {
                i25 = 255;
            } else {
                i25 = (int) ((1.0f - this.transitionProgress) * 255.0f);
            }
            paint8.setAlpha(i25);
            applyShaderMatrix(true);
            canvas.save();
            canvas.translate(i2, iCenterY3);
            float f824 = f17;
            canvas.scale(f824, f824);
            float f94 = (-iDp17) / 2;
            canvas.translate(f94, f94);
            path4 = pathArr7[0];
            if (path4 != null) {
                canvas.drawPath(path4, this.paint2);
            }
            path5 = pathArr7[1];
            if (path5 != null) {
                canvas.drawPath(path5, this.backPaint);
            }
            canvas.restore();
        }
        if (pathArr8 != null) {
            int iDp18 = AndroidUtilities.dp(24.0f);
            if (this.currentIcon == this.nextIcon) {
                i24 = 255;
            } else {
                i24 = (int) (this.transitionProgress * 255.0f);
            }
            this.paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.paint2.setAlpha(i24);
            applyShaderMatrix(true);
            canvas.save();
            canvas.translate(i2, iCenterY3);
            float f95 = f16;
            canvas.scale(f95, f95);
            float f96 = (-iDp18) / 2;
            canvas.translate(f96, f96);
            path = pathArr8[0];
            if (path != null) {
                canvas.drawPath(path, this.paint2);
            }
            if (pathArr8.length >= 3) {
                canvas.drawPath(path3, this.paint);
            }
            path2 = pathArr8[1];
            if (path2 != null) {
                if (i24 != 255) {
                    int alpha2 = this.backPaint.getAlpha();
                    this.backPaint.setAlpha((int) (alpha2 * (i24 / 255.0f)));
                    canvas.drawPath(pathArr8[1], this.backPaint);
                    this.backPaint.setAlpha(alpha2);
                } else {
                    canvas.drawPath(path2, this.backPaint);
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
        i22 = this.currentIcon;
        if (i22 != 3) {
            float f97 = this.downloadRadOffset + ((360 * j2) / 2500.0f);
            this.downloadRadOffset = f97;
            this.downloadRadOffset = getCircleValue(f97);
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
            float f98 = this.downloadRadOffset + ((360 * j2) / 2500.0f);
            this.downloadRadOffset = f98;
            this.downloadRadOffset = getCircleValue(f98);
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
        i23 = i;
        if (i23 >= 1) {
            canvas.restoreToCount(i23);
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
