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
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.Theme;

public class MediaActionDrawable extends Drawable {
    private static final float CANCEL_TO_CHECK_STAGE1 = 0.5f;
    private static final float CANCEL_TO_CHECK_STAGE2 = 0.5f;
    private static final float DOWNLOAD_TO_CANCEL_STAGE1 = 0.5f;
    private static final float DOWNLOAD_TO_CANCEL_STAGE2 = 0.2f;
    private static final float DOWNLOAD_TO_CANCEL_STAGE3 = 0.3f;
    private static final float EPS = 0.001f;
    public static final int ICON_CANCEL = 3;
    public static final int ICON_CANCEL_FILL = 14;
    public static final int ICON_CANCEL_NOPROFRESS = 12;
    public static final int ICON_CANCEL_PERCENT = 13;
    public static final int ICON_CHECK = 6;
    public static final int ICON_DOWNLOAD = 2;
    public static final int ICON_EMPTY = 10;
    public static final int ICON_EMPTY_NOPROGRESS = 11;
    public static final int ICON_FILE = 5;
    public static final int ICON_FIRE = 7;
    public static final int ICON_GIF = 8;
    public static final int ICON_NONE = 4;
    public static final int ICON_PAUSE = 1;
    public static final int ICON_PLAY = 0;
    public static final int ICON_SECRETCHECK = 9;
    public static final int ICON_UPDATE = 15;
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

    public static float getCircleValue(float f) {
        while (f > 360.0f) {
            f -= 360.0f;
        }
        return f;
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
        int i3;
        float f7;
        float f8;
        float f9;
        Canvas canvas2;
        int i4;
        int i5;
        int i6;
        float f10;
        float fMin;
        float fCenterY;
        float fCenterX;
        float fDp5;
        int iMin;
        float f11;
        float f12;
        float f13;
        float f14;
        float fCenterX2;
        int iCenterY;
        float f15;
        int iCenterY2;
        int i7;
        int i8;
        int i9;
        float f16;
        int i10;
        float f17;
        float fMax;
        Path[] pathArr;
        Path[] pathArr2;
        Path[] pathArr3;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        int i11;
        Path[] pathArr4;
        int i12;
        int i13;
        float f18;
        int i14;
        int i15;
        int i16;
        float f19;
        int i17;
        int i18;
        int i19;
        float f20;
        int i20;
        float f21;
        int i21;
        float f22;
        int i22;
        float fMin2;
        float f23;
        int iDp;
        int iDp2;
        float f24;
        float f25;
        float f26;
        float f27;
        long j;
        long j2;
        int i23;
        float f28;
        float f29;
        float f30;
        float f31;
        int i24;
        float f32;
        float f33;
        int i25;
        Path path;
        Path path2;
        Path path3;
        int i26;
        Path path4;
        Path path5;
        int i27;
        int i28;
        int i29;
        int i30;
        float interpolation = 90.0f;
        Rect bounds = getBounds();
        MessageDrawable messageDrawable = this.messageDrawable;
        if (messageDrawable != null && messageDrawable.hasGradient() && !this.hasOverlayImage) {
            Shader gradientShader = this.messageDrawable.getGradientShader();
            this.paint.setShader(gradientShader);
            this.paint2.setShader(gradientShader);
            this.paint3.setShader(gradientShader);
        } else if (this.gradientDrawable == null || this.hasOverlayImage) {
            this.paint.setShader(null);
            this.paint2.setShader(null);
            this.paint3.setShader(null);
        } else {
            this.gradientMatrix.reset();
            this.gradientMatrix.setTranslate(0.0f, bounds.top);
            this.gradientDrawable.setLocalMatrix(this.gradientMatrix);
            this.paint.setShader(this.gradientDrawable);
            this.paint2.setShader(this.gradientDrawable);
            this.paint3.setShader(this.gradientDrawable);
        }
        int iCenterX = bounds.centerX();
        int iCenterY3 = bounds.centerY();
        int i31 = this.nextIcon;
        if (i31 == 4) {
            int i32 = this.currentIcon;
            if (i32 == 3 || i32 == 14) {
                i = 0;
            } else {
                iSave = canvas.save();
                float f34 = 1.0f - this.transitionProgress;
                canvas.scale(f34, f34, iCenterX, iCenterY3);
                i = iSave;
            }
        } else if ((i31 == 6 || i31 == 10) && this.currentIcon == 4) {
            iSave = canvas.save();
            float f35 = this.transitionProgress;
            canvas.scale(f35, f35, iCenterX, iCenterY3);
            i = iSave;
        } else {
            i = 0;
        }
        AndroidUtilities.dp(3.0f);
        if (this.currentIcon == 2 || this.nextIcon == 2) {
            applyShaderMatrix(false);
            float f36 = iCenterY3;
            float fDp6 = f36 - (AndroidUtilities.dp(9.0f) * this.scale);
            float fDp7 = (AndroidUtilities.dp(9.0f) * this.scale) + f36;
            float fDp8 = (AndroidUtilities.dp(12.0f) * this.scale) + f36;
            int i33 = this.currentIcon;
            if ((i33 == 3 || i33 == 14) && this.nextIcon == 2) {
                this.paint.setAlpha((int) (Math.min(1.0f, this.transitionProgress / 0.5f) * 255.0f));
                f = this.transitionProgress;
                fDp = AndroidUtilities.dp(12.0f);
                f2 = this.scale;
            } else {
                int i34 = this.nextIcon;
                if (i34 == 3 || i34 == 14 || i34 == 2) {
                    this.paint.setAlpha(255);
                    f = this.transitionProgress;
                } else {
                    this.paint.setAlpha((int) ((1.0f - this.transitionProgress) * Math.min(1.0f, this.savedTransitionProgress / 0.5f) * 255.0f));
                    f = this.savedTransitionProgress;
                }
                fDp = AndroidUtilities.dp(1.0f);
                f2 = this.scale;
            }
            float f37 = (fDp * f2) + f36;
            if (this.animatingTransition) {
                int i35 = this.nextIcon;
                if (i35 != 2) {
                    if (f <= 0.5f) {
                        i3 = 2;
                        i2 = 8;
                    } else {
                        float fDp9 = AndroidUtilities.dp(13.0f);
                        float f38 = this.scale;
                        float fDp10 = (fDp9 * f38 * f38) + (this.isMini ? AndroidUtilities.dp(2.0f) : 0);
                        float f39 = f - 0.5f;
                        float f40 = f39 / 0.5f;
                        if (f39 > 0.2f) {
                            f9 = (f39 - 0.2f) / 0.3f;
                            f8 = 1.0f;
                        } else {
                            f8 = f39 / 0.2f;
                            f9 = 0.0f;
                        }
                        fDp2 = iCenterX;
                        float f41 = fDp2 - fDp10;
                        float f42 = fDp10 / 2.0f;
                        this.rect.set(f41, fDp8 - f42, fDp2, f42 + fDp8);
                        float f43 = f9 * 100.0f;
                        iCenterY3 = iCenterY3;
                        i = i;
                        i2 = 8;
                        canvas.drawArc(this.rect, f43, (f40 * 104.0f) - f43, false, this.paint);
                        float fM = DiffUtil.m(fDp8, f37, f8, f37);
                        if (f9 > 0.0f) {
                            float f44 = this.nextIcon == 14 ? 0.0f : (1.0f - f9) * (-45.0f);
                            float fDp11 = AndroidUtilities.dp(7.0f) * f9 * this.scale;
                            int iMin2 = (int) (f9 * 255.0f);
                            int i36 = this.nextIcon;
                            if (i36 != 3 && i36 != 14 && i36 != 2) {
                                iMin2 = (int) (iMin2 * (1.0f - Math.min(1.0f, this.transitionProgress / 0.5f)));
                            }
                            int i37 = iMin2;
                            if (f44 != 0.0f) {
                                canvas.save();
                                canvas.rotate(f44, fDp2, f36);
                            }
                            if (i37 != 0) {
                                this.paint.setAlpha(i37);
                                if (this.nextIcon == 14) {
                                    this.paint3.setAlpha(i37);
                                    this.rect.set(iCenterX - AndroidUtilities.dp(3.5f), iCenterY3 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + iCenterX, AndroidUtilities.dp(3.5f) + iCenterY3);
                                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.paint3);
                                    this.paint.setAlpha((int) (i37 * 0.15f));
                                    int iDp3 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                                    this.rect.set(bounds.left + iDp3, bounds.top + iDp3, bounds.right - iDp3, bounds.bottom - iDp3);
                                    canvas.drawArc(this.rect, 0.0f, 360.0f, false, this.paint);
                                    this.paint.setAlpha(i37);
                                } else {
                                    float f45 = fDp2 - fDp11;
                                    float f46 = f36 - fDp11;
                                    float f47 = fDp2 + fDp11;
                                    float f48 = f36 + fDp11;
                                    canvas.drawLine(f45, f46, f47, f48, this.paint);
                                    canvas.drawLine(f47, f46, f45, f48, this.paint);
                                }
                            }
                            if (f44 != 0.0f) {
                                canvas.restore();
                            }
                        }
                        fDp6 = fM;
                        f5 = fDp8;
                        f4 = fDp2;
                        iCenterX = iCenterX;
                    }
                    if (fDp6 != f5) {
                        float f49 = iCenterX;
                        canvas.drawLine(f49, fDp6, f49, f5, this.paint);
                    }
                    f6 = iCenterX;
                    if (fDp2 != f6) {
                        float f50 = fDp8;
                        canvas.drawLine(fDp2, f50, f6, f5, this.paint);
                        canvas.drawLine(f4, f50, f6, f5, this.paint);
                    }
                } else {
                    i2 = 8;
                    i3 = 2;
                }
                if (i35 == i3) {
                    f7 = 1.0f - f;
                } else {
                    f7 = f / 0.5f;
                    f = 1.0f - f7;
                }
                fDp6 = DiffUtil.m(f37, fDp6, f7, fDp6);
                fDp7 = DiffUtil.m(fDp8, fDp7, f7, fDp7);
                float f51 = iCenterX;
                fDp2 = f51 - ((AndroidUtilities.dp(8.0f) * f) * this.scale);
                fDp3 = f51 + (AndroidUtilities.dp(8.0f) * f * this.scale);
                fDp4 = AndroidUtilities.dp(8.0f) * f;
                f3 = this.scale;
            } else {
                iCenterX = iCenterX;
                iCenterY3 = iCenterY3;
                i = i;
                i2 = 8;
                float f52 = iCenterX;
                fDp2 = f52 - (AndroidUtilities.dp(8.0f) * this.scale);
                fDp3 = f52 + (AndroidUtilities.dp(8.0f) * this.scale);
                fDp4 = AndroidUtilities.dp(8.0f);
                f3 = this.scale;
            }
            fDp8 = fDp7 - (fDp4 * f3);
            f4 = fDp3;
            f5 = fDp7;
            if (fDp6 != f5) {
                float f410 = iCenterX;
                canvas.drawLine(f410, fDp6, f410, f5, this.paint);
            }
            f6 = iCenterX;
            if (fDp2 != f6) {
                float f53 = fDp8;
                canvas.drawLine(fDp2, f53, f6, f5, this.paint);
                canvas.drawLine(f4, f53, f6, f5, this.paint);
            }
        } else {
            iCenterX = iCenterX;
            iCenterY3 = iCenterY3;
            i = i;
            i2 = 8;
        }
        int i38 = this.currentIcon;
        if (i38 == 3 || i38 == 14 || (i38 == 4 && ((i30 = this.nextIcon) == 14 || i30 == 3))) {
            canvas2 = canvas;
            applyShaderMatrix(false);
            int i39 = this.nextIcon;
            if (i39 == 2) {
                float f54 = this.transitionProgress;
                if (f54 <= 0.5f) {
                    float f55 = 1.0f - (f54 / 0.5f);
                    i10 = (int) (f55 * 255.0f);
                    fDp5 = AndroidUtilities.dp(7.0f) * f55 * this.scale;
                } else {
                    fDp5 = 0.0f;
                    i10 = 0;
                }
                iMin = i10;
                fCenterY = 0.0f;
                fCenterX = 0.0f;
                f12 = 0.0f;
                f11 = 1.0f;
                i4 = 9;
                i5 = 7;
            } else {
                if (i39 == 15 || i39 == 0 || i39 == 1 || i39 == 5 || i39 == i2) {
                    i4 = 9;
                    i5 = 7;
                } else {
                    i4 = 9;
                    i5 = 7;
                    if (i39 != 9) {
                        i6 = 6;
                        if (i39 != 7 && i39 != 6) {
                            if (i39 == 4) {
                                float f56 = 1.0f - this.transitionProgress;
                                float fDp12 = AndroidUtilities.dp(7.0f) * this.scale;
                                int i40 = (int) (f56 * 255.0f);
                                if (this.currentIcon == 14) {
                                    fCenterX = bounds.left;
                                    iCenterY2 = bounds.top;
                                } else {
                                    fCenterX = bounds.centerX();
                                    iCenterY2 = bounds.centerY();
                                }
                                f15 = iCenterY2;
                                iMin = i40;
                                f12 = 0.0f;
                                f11 = f56;
                                fDp5 = fDp12;
                            } else if (i39 == 14 || i39 == 3) {
                                float f57 = this.transitionProgress;
                                float f58 = 1.0f - f57;
                                if (this.currentIcon == 4) {
                                    f14 = f57;
                                    f13 = 0.0f;
                                } else {
                                    f13 = f58 * 45.0f;
                                    f14 = 1.0f;
                                }
                                float fDp13 = AndroidUtilities.dp(7.0f) * this.scale;
                                int i41 = (int) (f57 * 255.0f);
                                if (this.nextIcon == 14) {
                                    fCenterX2 = bounds.left;
                                    iCenterY = bounds.top;
                                } else {
                                    fCenterX2 = bounds.centerX();
                                    iCenterY = bounds.centerY();
                                }
                                f15 = iCenterY;
                                iMin = i41;
                                f11 = f14;
                                fCenterX = fCenterX2;
                                fDp5 = fDp13;
                                f12 = f13;
                            } else {
                                fDp5 = AndroidUtilities.dp(7.0f) * this.scale;
                                fCenterY = 0.0f;
                                fCenterX = 0.0f;
                                f12 = 0.0f;
                                f11 = 1.0f;
                                f10 = 1.0f;
                                iMin = 255;
                            }
                            fCenterY = f15;
                        }
                        if (f11 != f10) {
                            canvas2.save();
                            canvas2.scale(f11, f11, fCenterX, fCenterY);
                        }
                        if (f12 != 0.0f) {
                            canvas2.save();
                            canvas2.rotate(f12, iCenterX, iCenterY3);
                        }
                        if (iMin != 0) {
                            f16 = iMin;
                            this.paint.setAlpha((int) (this.overrideAlpha * f16));
                            if (this.currentIcon != 14 || this.nextIcon == 14) {
                                this.paint3.setAlpha((int) (f16 * this.overrideAlpha));
                                this.rect.set(iCenterX - AndroidUtilities.dp(3.5f), iCenterY3 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + iCenterX, AndroidUtilities.dp(3.5f) + iCenterY3);
                                canvas2.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.paint3);
                            } else {
                                float f59 = iCenterX;
                                float f60 = f59 - fDp5;
                                float f61 = iCenterY3;
                                float f62 = f61 - fDp5;
                                float f63 = f59 + fDp5;
                                float f64 = f61 + fDp5;
                                canvas2.drawLine(f60, f62, f63, f64, this.paint);
                                canvas2 = canvas;
                                canvas2.drawLine(f63, f62, f60, f64, this.paint);
                            }
                        }
                        if (f12 != 0.0f) {
                            canvas2.restore();
                        }
                        if (f11 != f10) {
                            canvas2.restore();
                        }
                        i7 = this.currentIcon;
                        if ((i7 != 3 || i7 == 14 || (i7 == 4 && ((i9 = this.nextIcon) == 14 || i9 == 3))) && iMin != 0) {
                            float fMax2 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                            int iDp4 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                            this.rect.set(bounds.left + iDp4, bounds.top + iDp4, bounds.right - iDp4, bounds.bottom - iDp4);
                            i8 = this.currentIcon;
                            if (i8 != 14 || (i8 == 4 && this.nextIcon == 14)) {
                                this.paint.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                                canvas2.drawArc(this.rect, 0.0f, 360.0f, false, this.paint);
                                this.paint.setAlpha(iMin);
                            }
                            canvas2 = canvas;
                            canvas2.drawArc(this.rect, this.downloadRadOffset, fMax2, false, this.paint);
                        }
                    }
                    if (i39 == i6) {
                        f10 = 1.0f;
                        fMin = Math.min(1.0f, this.transitionProgress / 0.5f);
                    } else {
                        f10 = 1.0f;
                        fMin = this.transitionProgress;
                    }
                    float f65 = f10 - fMin;
                    float fCenterX3 = bounds.centerX();
                    fCenterY = bounds.centerY();
                    fCenterX = fCenterX3;
                    fDp5 = AndroidUtilities.dp(7.0f) * f65 * this.scale;
                    iMin = (int) (Math.min(f10, f65 * 2.0f) * 255.0f);
                    f11 = f65;
                    f12 = 0.0f;
                    if (f11 != f10) {
                        canvas2.save();
                        canvas2.scale(f11, f11, fCenterX, fCenterY);
                    }
                    if (f12 != 0.0f) {
                        canvas2.save();
                        canvas2.rotate(f12, iCenterX, iCenterY3);
                    }
                    if (iMin != 0) {
                        f16 = iMin;
                        this.paint.setAlpha((int) (this.overrideAlpha * f16));
                        if (this.currentIcon != 14) {
                            this.paint3.setAlpha((int) (f16 * this.overrideAlpha));
                            this.rect.set(iCenterX - AndroidUtilities.dp(3.5f), iCenterY3 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + iCenterX, AndroidUtilities.dp(3.5f) + iCenterY3);
                            canvas2.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.paint3);
                        } else {
                            this.paint3.setAlpha((int) (f16 * this.overrideAlpha));
                            this.rect.set(iCenterX - AndroidUtilities.dp(3.5f), iCenterY3 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + iCenterX, AndroidUtilities.dp(3.5f) + iCenterY3);
                            canvas2.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.paint3);
                        }
                    }
                    if (f12 != 0.0f) {
                        canvas2.restore();
                    }
                    if (f11 != f10) {
                        canvas2.restore();
                    }
                    i7 = this.currentIcon;
                    if (i7 != 3) {
                        float fMax3 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                        int iDp5 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                        this.rect.set(bounds.left + iDp5, bounds.top + iDp5, bounds.right - iDp5, bounds.bottom - iDp5);
                        i8 = this.currentIcon;
                        if (i8 != 14) {
                            this.paint.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                            canvas2.drawArc(this.rect, 0.0f, 360.0f, false, this.paint);
                            this.paint.setAlpha(iMin);
                        } else {
                            this.paint.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                            canvas2.drawArc(this.rect, 0.0f, 360.0f, false, this.paint);
                            this.paint.setAlpha(iMin);
                        }
                        canvas2 = canvas;
                        canvas2.drawArc(this.rect, this.downloadRadOffset, fMax3, false, this.paint);
                    } else {
                        float fMax4 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                        int iDp6 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                        this.rect.set(bounds.left + iDp6, bounds.top + iDp6, bounds.right - iDp6, bounds.bottom - iDp6);
                        i8 = this.currentIcon;
                        if (i8 != 14) {
                            this.paint.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                            canvas2.drawArc(this.rect, 0.0f, 360.0f, false, this.paint);
                            this.paint.setAlpha(iMin);
                        } else {
                            this.paint.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                            canvas2.drawArc(this.rect, 0.0f, 360.0f, false, this.paint);
                            this.paint.setAlpha(iMin);
                        }
                        canvas2 = canvas;
                        canvas2.drawArc(this.rect, this.downloadRadOffset, fMax4, false, this.paint);
                    }
                }
                i6 = 6;
                if (i39 == i6) {
                    f10 = 1.0f;
                    fMin = Math.min(1.0f, this.transitionProgress / 0.5f);
                } else {
                    f10 = 1.0f;
                    fMin = this.transitionProgress;
                }
                float f66 = f10 - fMin;
                float fCenterX4 = bounds.centerX();
                fCenterY = bounds.centerY();
                fCenterX = fCenterX4;
                fDp5 = AndroidUtilities.dp(7.0f) * f66 * this.scale;
                iMin = (int) (Math.min(f10, f66 * 2.0f) * 255.0f);
                f11 = f66;
                f12 = 0.0f;
                if (f11 != f10) {
                    canvas2.save();
                    canvas2.scale(f11, f11, fCenterX, fCenterY);
                }
                if (f12 != 0.0f) {
                    canvas2.save();
                    canvas2.rotate(f12, iCenterX, iCenterY3);
                }
                if (iMin != 0) {
                    f16 = iMin;
                    this.paint.setAlpha((int) (this.overrideAlpha * f16));
                    if (this.currentIcon != 14) {
                        this.paint3.setAlpha((int) (f16 * this.overrideAlpha));
                        this.rect.set(iCenterX - AndroidUtilities.dp(3.5f), iCenterY3 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + iCenterX, AndroidUtilities.dp(3.5f) + iCenterY3);
                        canvas2.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.paint3);
                    } else {
                        this.paint3.setAlpha((int) (f16 * this.overrideAlpha));
                        this.rect.set(iCenterX - AndroidUtilities.dp(3.5f), iCenterY3 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + iCenterX, AndroidUtilities.dp(3.5f) + iCenterY3);
                        canvas2.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.paint3);
                    }
                }
                if (f12 != 0.0f) {
                    canvas2.restore();
                }
                if (f11 != f10) {
                    canvas2.restore();
                }
                i7 = this.currentIcon;
                if (i7 != 3) {
                    float fMax5 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                    int iDp7 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                    this.rect.set(bounds.left + iDp7, bounds.top + iDp7, bounds.right - iDp7, bounds.bottom - iDp7);
                    i8 = this.currentIcon;
                    if (i8 != 14) {
                        this.paint.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                        canvas2.drawArc(this.rect, 0.0f, 360.0f, false, this.paint);
                        this.paint.setAlpha(iMin);
                    } else {
                        this.paint.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                        canvas2.drawArc(this.rect, 0.0f, 360.0f, false, this.paint);
                        this.paint.setAlpha(iMin);
                    }
                    canvas2 = canvas;
                    canvas2.drawArc(this.rect, this.downloadRadOffset, fMax5, false, this.paint);
                } else {
                    float fMax6 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                    int iDp8 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                    this.rect.set(bounds.left + iDp8, bounds.top + iDp8, bounds.right - iDp8, bounds.bottom - iDp8);
                    i8 = this.currentIcon;
                    if (i8 != 14) {
                        this.paint.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                        canvas2.drawArc(this.rect, 0.0f, 360.0f, false, this.paint);
                        this.paint.setAlpha(iMin);
                    } else {
                        this.paint.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                        canvas2.drawArc(this.rect, 0.0f, 360.0f, false, this.paint);
                        this.paint.setAlpha(iMin);
                    }
                    canvas2 = canvas;
                    canvas2.drawArc(this.rect, this.downloadRadOffset, fMax6, false, this.paint);
                }
            }
            f10 = 1.0f;
            if (f11 != f10) {
                canvas2.save();
                canvas2.scale(f11, f11, fCenterX, fCenterY);
            }
            if (f12 != 0.0f) {
                canvas2.save();
                canvas2.rotate(f12, iCenterX, iCenterY3);
            }
            if (iMin != 0) {
                f16 = iMin;
                this.paint.setAlpha((int) (this.overrideAlpha * f16));
                if (this.currentIcon != 14) {
                    this.paint3.setAlpha((int) (f16 * this.overrideAlpha));
                    this.rect.set(iCenterX - AndroidUtilities.dp(3.5f), iCenterY3 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + iCenterX, AndroidUtilities.dp(3.5f) + iCenterY3);
                    canvas2.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.paint3);
                } else {
                    this.paint3.setAlpha((int) (f16 * this.overrideAlpha));
                    this.rect.set(iCenterX - AndroidUtilities.dp(3.5f), iCenterY3 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + iCenterX, AndroidUtilities.dp(3.5f) + iCenterY3);
                    canvas2.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.paint3);
                }
            }
            if (f12 != 0.0f) {
                canvas2.restore();
            }
            if (f11 != f10) {
                canvas2.restore();
            }
            i7 = this.currentIcon;
            if (i7 != 3) {
                float fMax7 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                int iDp9 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                this.rect.set(bounds.left + iDp9, bounds.top + iDp9, bounds.right - iDp9, bounds.bottom - iDp9);
                i8 = this.currentIcon;
                if (i8 != 14) {
                    this.paint.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                    canvas2.drawArc(this.rect, 0.0f, 360.0f, false, this.paint);
                    this.paint.setAlpha(iMin);
                } else {
                    this.paint.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                    canvas2.drawArc(this.rect, 0.0f, 360.0f, false, this.paint);
                    this.paint.setAlpha(iMin);
                }
                canvas2 = canvas;
                canvas2.drawArc(this.rect, this.downloadRadOffset, fMax7, false, this.paint);
            } else {
                float fMax8 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                int iDp10 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                this.rect.set(bounds.left + iDp10, bounds.top + iDp10, bounds.right - iDp10, bounds.bottom - iDp10);
                i8 = this.currentIcon;
                if (i8 != 14) {
                    this.paint.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                    canvas2.drawArc(this.rect, 0.0f, 360.0f, false, this.paint);
                    this.paint.setAlpha(iMin);
                } else {
                    this.paint.setAlpha((int) (iMin * 0.15f * this.overrideAlpha));
                    canvas2.drawArc(this.rect, 0.0f, 360.0f, false, this.paint);
                    this.paint.setAlpha(iMin);
                }
                canvas2 = canvas;
                canvas2.drawArc(this.rect, this.downloadRadOffset, fMax8, false, this.paint);
            }
        } else {
            if (i38 == 10 || this.nextIcon == 10 || i38 == 13) {
                int i42 = this.nextIcon;
                int i43 = (i42 == 4 || i42 == 6) ? (int) ((1.0f - this.transitionProgress) * 255.0f) : 255;
                if (i43 != 0) {
                    applyShaderMatrix(false);
                    this.paint.setAlpha((int) (i43 * this.overrideAlpha));
                    float fMax9 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                    int iDp11 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                    this.rect.set(bounds.left + iDp11, bounds.top + iDp11, bounds.right - iDp11, bounds.bottom - iDp11);
                    canvas2 = canvas;
                    canvas2.drawArc(this.rect, this.downloadRadOffset, fMax9, false, this.paint);
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
            fMax = 1.0f;
            f17 = 1.0f;
        } else if (i44 == 4 || i44 == 3 || i44 == 14) {
            float f67 = this.transitionProgress;
            f17 = f67;
            fMax = 1.0f - f67;
        } else {
            float fMin3 = Math.min(1.0f, this.transitionProgress / 0.5f);
            fMax = Math.max(0.0f, 1.0f - (this.transitionProgress / 0.5f));
            f17 = fMin3;
        }
        int i45 = this.nextIcon;
        if (i45 != 15) {
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
            if (i45 == i5) {
                if (this.currentIcon == i5) {
                    drawable2 = Theme.chat_flameIcon;
                    drawable = null;
                } else {
                    drawable = null;
                }
                if (i45 == i2) {
                    drawable = Theme.chat_gifIcon;
                } else if (this.currentIcon == i2) {
                    drawable2 = Theme.chat_gifIcon;
                }
                drawable3 = drawable2;
                if (this.currentIcon != i4 || i45 == i4) {
                    applyShaderMatrix(false);
                    Paint paint = this.paint;
                    if (this.currentIcon == this.nextIcon) {
                        i11 = 255;
                    } else {
                        i11 = (int) (this.transitionProgress * 255.0f);
                    }
                    paint.setAlpha(i11);
                    int iDp12 = AndroidUtilities.dp(7.0f) + iCenterY3;
                    int iDp13 = iCenterX - AndroidUtilities.dp(3.0f);
                    if (this.currentIcon != this.nextIcon) {
                        canvas2.save();
                        float f68 = this.transitionProgress;
                        canvas2.scale(f68, f68, iCenterX, iCenterY3);
                    }
                    float fDp14 = iDp13 - AndroidUtilities.dp(6.0f);
                    float fDp15 = iDp12 - AndroidUtilities.dp(6.0f);
                    Path[] pathArr5 = pathArr2;
                    float f69 = iDp13;
                    float f70 = iDp12;
                    pathArr4 = pathArr5;
                    canvas2.drawLine(fDp14, fDp15, f69, f70, this.paint);
                    canvas2 = canvas;
                    canvas2.drawLine(f69, f70, AndroidUtilities.dp(12.0f) + iDp13, iDp12 - AndroidUtilities.dp(12.0f), this.paint);
                    if (this.currentIcon != this.nextIcon) {
                        canvas2.restore();
                    }
                } else {
                    pathArr4 = pathArr2;
                }
                if (this.currentIcon != 12 || this.nextIcon == 12) {
                    applyShaderMatrix(false);
                    i12 = this.currentIcon;
                    i13 = this.nextIcon;
                    if (i12 == i13) {
                        f18 = 1.0f;
                    } else if (i13 == 13) {
                        f18 = this.transitionProgress;
                    } else {
                        f18 = 1.0f - this.transitionProgress;
                    }
                    Paint paint2 = this.paint;
                    if (i12 == i13) {
                        i14 = 255;
                    } else {
                        i14 = (int) (f18 * 255.0f);
                    }
                    paint2.setAlpha(i14);
                    AndroidUtilities.dp(7.0f);
                    AndroidUtilities.dp(3.0f);
                    if (this.currentIcon != this.nextIcon) {
                        canvas2.save();
                        canvas2.scale(f18, f18, iCenterX, iCenterY3);
                    }
                    float fDp16 = AndroidUtilities.dp(7.0f) * this.scale;
                    float f71 = iCenterX;
                    float f72 = f71 - fDp16;
                    float f73 = iCenterY3;
                    float f74 = f73 - fDp16;
                    float f75 = f71 + fDp16;
                    float f76 = f73 + fDp16;
                    canvas2.drawLine(f72, f74, f75, f76, this.paint);
                    canvas2 = canvas;
                    canvas2.drawLine(f75, f74, f72, f76, this.paint);
                    if (this.currentIcon != this.nextIcon) {
                        canvas2.restore();
                    }
                }
                if (this.currentIcon != 13 || this.nextIcon == 13) {
                    applyShaderMatrix(false);
                    i15 = this.currentIcon;
                    i16 = this.nextIcon;
                    if (i15 == i16) {
                        f19 = 1.0f;
                    } else if (i16 == 13) {
                        f19 = this.transitionProgress;
                    } else {
                        f19 = 1.0f - this.transitionProgress;
                    }
                    this.textPaint.setAlpha((int) (f19 * 255.0f));
                    int iDp14 = AndroidUtilities.dp(5.0f) + iCenterY3;
                    int i46 = iCenterX - (this.percentStringWidth / 2);
                    if (this.currentIcon != this.nextIcon) {
                        canvas2.save();
                        canvas2.scale(f19, f19, iCenterX, iCenterY3);
                    }
                    i17 = (int) (this.animatedDownloadProgress * 100.0f);
                    if (this.percentString != null || i17 != this.lastPercent) {
                        this.lastPercent = i17;
                        String str = String.format("%d%%", Integer.valueOf(i17));
                        this.percentString = str;
                        this.percentStringWidth = (int) Math.ceil(this.textPaint.measureText(str));
                    }
                    canvas2.drawText(this.percentString, i46, iDp14, this.textPaint);
                    if (this.currentIcon != this.nextIcon) {
                        canvas2.restore();
                    }
                }
                i18 = this.currentIcon;
                if (i18 != 0 || i18 == 1 || (i29 = this.nextIcon) == 0 || i29 == 1) {
                    if ((i18 == 0 || this.nextIcon != 1) && !(i18 == 1 && this.nextIcon == 0)) {
                        i19 = 1;
                        if (i18 == 1) {
                            f20 = 1.0f;
                        } else {
                            f20 = 0.0f;
                        }
                    } else if (this.animatingTransition) {
                        f20 = this.nextIcon == 0 ? 1.0f - this.transitionProgress : this.transitionProgress;
                        i19 = 1;
                    } else {
                        i19 = 1;
                        if (this.nextIcon == 1) {
                            f20 = 1.0f;
                        } else {
                            f20 = 0.0f;
                        }
                    }
                    i20 = this.nextIcon;
                    if ((i20 != 0 || i20 == i19) && (i18 == 0 || i18 == i19)) {
                        this.paint2.setAlpha(255);
                    } else if (i20 == 4) {
                        this.paint2.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                    } else {
                        this.paint2.setAlpha(i18 == i20 ? 255 : (int) (this.transitionProgress * 255.0f));
                    }
                    applyShaderMatrix(true);
                    canvas2.save();
                    canvas2.translate(DiffUtil.m(1.0f, f20, AndroidUtilities.dp(1.0f), bounds.centerX()), bounds.centerY());
                    f21 = f20 * 500.0f;
                    i21 = this.currentIcon;
                    if (i21 == 1) {
                        f22 = 90.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    if (i21 == 0 || this.nextIcon != 1) {
                        if (i21 == 1 && this.nextIcon == 0) {
                            if (f21 < 100.0f) {
                                interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                            } else if (f21 < 484.0f) {
                                interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                            } else {
                                f22 = 90.0f;
                            }
                        }
                        canvas2.rotate(f22);
                        i22 = this.currentIcon;
                        if ((i22 == 0 && i22 != 1) || i22 == 4) {
                            canvas2.scale(f17, f17);
                        }
                        Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                        canvas2.scale(1.0f, -1.0f);
                        Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                        canvas2.restore();
                    } else {
                        if (f21 < 384.0f) {
                            interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 384.0f) * 95.0f;
                        } else if (f21 < 484.0f) {
                            interpolation = 95.0f - (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 384.0f) / 100.0f) * 5.0f);
                        }
                        f21 += 100.0f;
                    }
                    f22 = interpolation;
                    canvas2.rotate(f22);
                    i22 = this.currentIcon;
                    if (i22 == 0) {
                        canvas2.scale(f17, f17);
                    } else {
                        canvas2.scale(f17, f17);
                    }
                    Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                    canvas2.scale(1.0f, -1.0f);
                    Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                    canvas2.restore();
                }
                if (this.currentIcon != 6 || this.nextIcon == 6) {
                    applyShaderMatrix(false);
                    if (this.currentIcon != 6) {
                        f25 = this.transitionProgress;
                        if (f25 > 0.5f) {
                            f27 = (f25 - 0.5f) / 0.5f;
                            fMin2 = 1.0f - Math.min(1.0f, f27 / 0.5f);
                            if (f27 > 0.5f) {
                                f26 = (f27 - 0.5f) / 0.5f;
                            } else {
                                f26 = 0.0f;
                            }
                        } else {
                            f26 = 0.0f;
                            fMin2 = 1.0f;
                        }
                        this.paint.setAlpha(255);
                        f23 = f26;
                    } else {
                        if (this.nextIcon != 6) {
                            this.paint.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                        } else {
                            this.paint.setAlpha(255);
                        }
                        fMin2 = 0.0f;
                        f23 = 1.0f;
                    }
                    iDp = AndroidUtilities.dp(7.0f) + iCenterY3;
                    iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                    if (fMin2 < 1.0f) {
                        f24 = f17;
                        canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin2), iDp - (AndroidUtilities.dp(6.0f) * fMin2), this.paint);
                    } else {
                        f24 = f17;
                    }
                    if (f23 > 0.0f) {
                        float f77 = iDp2;
                        float f78 = iDp;
                        canvas2 = canvas;
                        canvas2.drawLine(f77, f78, (AndroidUtilities.dp(12.0f) * f23) + f77, f78 - (AndroidUtilities.dp(12.0f) * f23), this.paint);
                    } else {
                        canvas2 = canvas;
                    }
                } else {
                    f24 = f17;
                }
                if (drawable3 != null && drawable3 != drawable) {
                    int intrinsicWidth = (int) (drawable3.getIntrinsicWidth() * fMax);
                    int intrinsicHeight = (int) (drawable3.getIntrinsicHeight() * fMax);
                    drawable3.setColorFilter(this.colorFilter);
                    if (this.currentIcon == this.nextIcon) {
                        i28 = 255;
                    } else {
                        i28 = (int) ((1.0f - this.transitionProgress) * 255.0f);
                    }
                    drawable3.setAlpha(i28);
                    int i47 = intrinsicWidth / 2;
                    int i48 = intrinsicHeight / 2;
                    drawable3.setBounds(iCenterX - i47, iCenterY3 - i48, i47 + iCenterX, i48 + iCenterY3);
                    drawable3.draw(canvas2);
                }
                if (drawable != null) {
                    int intrinsicWidth2 = (int) (drawable.getIntrinsicWidth() * f24);
                    int intrinsicHeight2 = (int) (drawable.getIntrinsicHeight() * f24);
                    drawable.setColorFilter(this.colorFilter);
                    if (this.currentIcon == this.nextIcon) {
                        i27 = 255;
                    } else {
                        i27 = (int) (this.transitionProgress * 255.0f);
                    }
                    drawable.setAlpha(i27);
                    int i49 = intrinsicWidth2 / 2;
                    int i50 = intrinsicHeight2 / 2;
                    drawable.setBounds(iCenterX - i49, iCenterY3 - i50, i49 + iCenterX, i50 + iCenterY3);
                    drawable.draw(canvas2);
                }
                if (pathArr4 != null && pathArr4 != pathArr3) {
                    int iDp15 = AndroidUtilities.dp(24.0f);
                    this.paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                    Paint paint3 = this.paint2;
                    if (this.currentIcon == this.nextIcon) {
                        i26 = 255;
                    } else {
                        i26 = (int) ((1.0f - this.transitionProgress) * 255.0f);
                    }
                    paint3.setAlpha(i26);
                    applyShaderMatrix(true);
                    canvas2.save();
                    canvas2.translate(iCenterX, iCenterY3);
                    canvas2.scale(fMax, fMax);
                    float f79 = (-iDp15) / 2;
                    canvas2.translate(f79, f79);
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
                    int iDp16 = AndroidUtilities.dp(24.0f);
                    if (this.currentIcon == this.nextIcon) {
                        i25 = 255;
                    } else {
                        i25 = (int) (this.transitionProgress * 255.0f);
                    }
                    this.paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                    this.paint2.setAlpha(i25);
                    applyShaderMatrix(true);
                    canvas2.save();
                    canvas2.translate(iCenterX, iCenterY3);
                    float f80 = f24;
                    canvas2.scale(f80, f80);
                    float f81 = (-iDp16) / 2;
                    canvas2.translate(f81, f81);
                    path = pathArr3[0];
                    if (path != null) {
                        canvas2.drawPath(path, this.paint2);
                    }
                    if (pathArr3.length >= 3 && (path3 = pathArr3[2]) != null) {
                        canvas2.drawPath(path3, this.paint);
                    }
                    path2 = pathArr3[1];
                    if (path2 != null) {
                        if (i25 != 255) {
                            int alpha = this.backPaint.getAlpha();
                            this.backPaint.setAlpha((int) ((i25 / 255.0f) * alpha));
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
                i23 = this.currentIcon;
                if (i23 != 3 || i23 == 14 || ((i23 == 4 && this.nextIcon == 14) || i23 == 10 || i23 == 13)) {
                    float f82 = ((360 * j2) / 2500.0f) + this.downloadRadOffset;
                    this.downloadRadOffset = f82;
                    this.downloadRadOffset = getCircleValue(f82);
                    if (this.nextIcon != 2) {
                        f28 = this.downloadProgress;
                        f29 = this.downloadProgressAnimationStart;
                        f30 = f28 - f29;
                        if (f30 > 0.0f) {
                            f31 = this.downloadProgressTime + j2;
                            this.downloadProgressTime = f31;
                            if (f31 >= 200.0f) {
                                this.animatedDownloadProgress = f28;
                                this.downloadProgressAnimationStart = f28;
                                this.downloadProgressTime = 0.0f;
                            } else {
                                this.animatedDownloadProgress = (this.interpolator.getInterpolation(f31 / 200.0f) * f30) + f29;
                            }
                        }
                    }
                    invalidateSelf();
                }
                if (this.animatingTransition) {
                    f32 = this.transitionProgress;
                    if (f32 < 1.0f) {
                        f33 = (j2 / this.transitionAnimationTime) + f32;
                        this.transitionProgress = f33;
                        if (f33 >= 1.0f) {
                            this.currentIcon = this.nextIcon;
                            this.transitionProgress = 1.0f;
                            this.animatingTransition = false;
                        }
                        invalidateSelf();
                    }
                }
                i24 = i;
                if (i24 >= 1) {
                    canvas2.restoreToCount(i24);
                }
            }
            drawable = Theme.chat_flameIcon;
            drawable2 = null;
            if (i45 == i2) {
                drawable = Theme.chat_gifIcon;
            } else if (this.currentIcon == i2) {
                drawable2 = Theme.chat_gifIcon;
            }
            drawable3 = drawable2;
            if (this.currentIcon != i4) {
                applyShaderMatrix(false);
                Paint paint4 = this.paint;
                if (this.currentIcon == this.nextIcon) {
                    i11 = 255;
                } else {
                    i11 = (int) (this.transitionProgress * 255.0f);
                }
                paint4.setAlpha(i11);
                int iDp17 = AndroidUtilities.dp(7.0f) + iCenterY3;
                int iDp18 = iCenterX - AndroidUtilities.dp(3.0f);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.save();
                    float f610 = this.transitionProgress;
                    canvas2.scale(f610, f610, iCenterX, iCenterY3);
                }
                float fDp17 = iDp18 - AndroidUtilities.dp(6.0f);
                float fDp18 = iDp17 - AndroidUtilities.dp(6.0f);
                Path[] pathArr6 = pathArr2;
                float f611 = iDp18;
                float f710 = iDp17;
                pathArr4 = pathArr6;
                canvas2.drawLine(fDp17, fDp18, f611, f710, this.paint);
                canvas2 = canvas;
                canvas2.drawLine(f611, f710, AndroidUtilities.dp(12.0f) + iDp18, iDp17 - AndroidUtilities.dp(12.0f), this.paint);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.restore();
                }
            } else {
                applyShaderMatrix(false);
                Paint paint5 = this.paint;
                if (this.currentIcon == this.nextIcon) {
                    i11 = 255;
                } else {
                    i11 = (int) (this.transitionProgress * 255.0f);
                }
                paint5.setAlpha(i11);
                int iDp19 = AndroidUtilities.dp(7.0f) + iCenterY3;
                int iDp110 = iCenterX - AndroidUtilities.dp(3.0f);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.save();
                    float f612 = this.transitionProgress;
                    canvas2.scale(f612, f612, iCenterX, iCenterY3);
                }
                float fDp19 = iDp110 - AndroidUtilities.dp(6.0f);
                float fDp110 = iDp19 - AndroidUtilities.dp(6.0f);
                Path[] pathArr7 = pathArr2;
                float f613 = iDp110;
                float f711 = iDp19;
                pathArr4 = pathArr7;
                canvas2.drawLine(fDp19, fDp110, f613, f711, this.paint);
                canvas2 = canvas;
                canvas2.drawLine(f613, f711, AndroidUtilities.dp(12.0f) + iDp110, iDp19 - AndroidUtilities.dp(12.0f), this.paint);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.restore();
                }
            }
            if (this.currentIcon != 12) {
                applyShaderMatrix(false);
                i12 = this.currentIcon;
                i13 = this.nextIcon;
                if (i12 == i13) {
                    f18 = 1.0f;
                } else if (i13 == 13) {
                    f18 = this.transitionProgress;
                } else {
                    f18 = 1.0f - this.transitionProgress;
                }
                Paint paint6 = this.paint;
                if (i12 == i13) {
                    i14 = 255;
                } else {
                    i14 = (int) (f18 * 255.0f);
                }
                paint6.setAlpha(i14);
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.save();
                    canvas2.scale(f18, f18, iCenterX, iCenterY3);
                }
                float fDp111 = AndroidUtilities.dp(7.0f) * this.scale;
                float f712 = iCenterX;
                float f713 = f712 - fDp111;
                float f714 = iCenterY3;
                float f715 = f714 - fDp111;
                float f716 = f712 + fDp111;
                float f717 = f714 + fDp111;
                canvas2.drawLine(f713, f715, f716, f717, this.paint);
                canvas2 = canvas;
                canvas2.drawLine(f716, f715, f713, f717, this.paint);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.restore();
                }
            } else {
                applyShaderMatrix(false);
                i12 = this.currentIcon;
                i13 = this.nextIcon;
                if (i12 == i13) {
                    f18 = 1.0f;
                } else if (i13 == 13) {
                    f18 = this.transitionProgress;
                } else {
                    f18 = 1.0f - this.transitionProgress;
                }
                Paint paint7 = this.paint;
                if (i12 == i13) {
                    i14 = 255;
                } else {
                    i14 = (int) (f18 * 255.0f);
                }
                paint7.setAlpha(i14);
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.save();
                    canvas2.scale(f18, f18, iCenterX, iCenterY3);
                }
                float fDp112 = AndroidUtilities.dp(7.0f) * this.scale;
                float f718 = iCenterX;
                float f719 = f718 - fDp112;
                float f7110 = iCenterY3;
                float f7111 = f7110 - fDp112;
                float f7112 = f718 + fDp112;
                float f7113 = f7110 + fDp112;
                canvas2.drawLine(f719, f7111, f7112, f7113, this.paint);
                canvas2 = canvas;
                canvas2.drawLine(f7112, f7111, f719, f7113, this.paint);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.restore();
                }
            }
            if (this.currentIcon != 13) {
                applyShaderMatrix(false);
                i15 = this.currentIcon;
                i16 = this.nextIcon;
                if (i15 == i16) {
                    f19 = 1.0f;
                } else if (i16 == 13) {
                    f19 = this.transitionProgress;
                } else {
                    f19 = 1.0f - this.transitionProgress;
                }
                this.textPaint.setAlpha((int) (f19 * 255.0f));
                int iDp111 = AndroidUtilities.dp(5.0f) + iCenterY3;
                int i410 = iCenterX - (this.percentStringWidth / 2);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.save();
                    canvas2.scale(f19, f19, iCenterX, iCenterY3);
                }
                i17 = (int) (this.animatedDownloadProgress * 100.0f);
                if (this.percentString != null) {
                    this.lastPercent = i17;
                    String str2 = String.format("%d%%", Integer.valueOf(i17));
                    this.percentString = str2;
                    this.percentStringWidth = (int) Math.ceil(this.textPaint.measureText(str2));
                } else {
                    this.lastPercent = i17;
                    String str3 = String.format("%d%%", Integer.valueOf(i17));
                    this.percentString = str3;
                    this.percentStringWidth = (int) Math.ceil(this.textPaint.measureText(str3));
                }
                canvas2.drawText(this.percentString, i410, iDp111, this.textPaint);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.restore();
                }
            } else {
                applyShaderMatrix(false);
                i15 = this.currentIcon;
                i16 = this.nextIcon;
                if (i15 == i16) {
                    f19 = 1.0f;
                } else if (i16 == 13) {
                    f19 = this.transitionProgress;
                } else {
                    f19 = 1.0f - this.transitionProgress;
                }
                this.textPaint.setAlpha((int) (f19 * 255.0f));
                int iDp112 = AndroidUtilities.dp(5.0f) + iCenterY3;
                int i411 = iCenterX - (this.percentStringWidth / 2);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.save();
                    canvas2.scale(f19, f19, iCenterX, iCenterY3);
                }
                i17 = (int) (this.animatedDownloadProgress * 100.0f);
                if (this.percentString != null) {
                    this.lastPercent = i17;
                    String str4 = String.format("%d%%", Integer.valueOf(i17));
                    this.percentString = str4;
                    this.percentStringWidth = (int) Math.ceil(this.textPaint.measureText(str4));
                } else {
                    this.lastPercent = i17;
                    String str5 = String.format("%d%%", Integer.valueOf(i17));
                    this.percentString = str5;
                    this.percentStringWidth = (int) Math.ceil(this.textPaint.measureText(str5));
                }
                canvas2.drawText(this.percentString, i411, iDp112, this.textPaint);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.restore();
                }
            }
            i18 = this.currentIcon;
            if (i18 != 0) {
                if (i18 == 0) {
                    i19 = 1;
                    if (i18 == 1) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    i20 = this.nextIcon;
                    if (i20 != 0) {
                        this.paint2.setAlpha(255);
                    } else {
                        this.paint2.setAlpha(255);
                    }
                    applyShaderMatrix(true);
                    canvas2.save();
                    canvas2.translate(DiffUtil.m(1.0f, f20, AndroidUtilities.dp(1.0f), bounds.centerX()), bounds.centerY());
                    f21 = f20 * 500.0f;
                    i21 = this.currentIcon;
                    if (i21 == 1) {
                        f22 = 90.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    if (i21 == 0) {
                        if (i21 == 1) {
                            if (f21 < 100.0f) {
                                interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                            } else if (f21 < 484.0f) {
                                interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                            } else {
                                f22 = 90.0f;
                            }
                            f22 = interpolation;
                        }
                    } else if (i21 == 1) {
                        if (f21 < 100.0f) {
                            interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                        } else if (f21 < 484.0f) {
                            interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                        } else {
                            f22 = 90.0f;
                        }
                        f22 = interpolation;
                    }
                    canvas2.rotate(f22);
                    i22 = this.currentIcon;
                    if (i22 == 0) {
                        canvas2.scale(f17, f17);
                    } else {
                        canvas2.scale(f17, f17);
                    }
                    Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                    canvas2.scale(1.0f, -1.0f);
                    Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                    canvas2.restore();
                } else {
                    i19 = 1;
                    if (i18 == 1) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    i20 = this.nextIcon;
                    if (i20 != 0) {
                        this.paint2.setAlpha(255);
                    } else {
                        this.paint2.setAlpha(255);
                    }
                    applyShaderMatrix(true);
                    canvas2.save();
                    canvas2.translate(DiffUtil.m(1.0f, f20, AndroidUtilities.dp(1.0f), bounds.centerX()), bounds.centerY());
                    f21 = f20 * 500.0f;
                    i21 = this.currentIcon;
                    if (i21 == 1) {
                        f22 = 90.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    if (i21 == 0) {
                        if (i21 == 1) {
                            if (f21 < 100.0f) {
                                interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                            } else if (f21 < 484.0f) {
                                interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                            } else {
                                f22 = 90.0f;
                            }
                            f22 = interpolation;
                        }
                    } else if (i21 == 1) {
                        if (f21 < 100.0f) {
                            interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                        } else if (f21 < 484.0f) {
                            interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                        } else {
                            f22 = 90.0f;
                        }
                        f22 = interpolation;
                    }
                    canvas2.rotate(f22);
                    i22 = this.currentIcon;
                    if (i22 == 0) {
                        canvas2.scale(f17, f17);
                    } else {
                        canvas2.scale(f17, f17);
                    }
                    Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                    canvas2.scale(1.0f, -1.0f);
                    Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                    canvas2.restore();
                }
            } else if (i18 == 0) {
                i19 = 1;
                if (i18 == 1) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                i20 = this.nextIcon;
                if (i20 != 0) {
                    this.paint2.setAlpha(255);
                } else {
                    this.paint2.setAlpha(255);
                }
                applyShaderMatrix(true);
                canvas2.save();
                canvas2.translate(DiffUtil.m(1.0f, f20, AndroidUtilities.dp(1.0f), bounds.centerX()), bounds.centerY());
                f21 = f20 * 500.0f;
                i21 = this.currentIcon;
                if (i21 == 1) {
                    f22 = 90.0f;
                } else {
                    f22 = 0.0f;
                }
                if (i21 == 0) {
                    if (i21 == 1) {
                        if (f21 < 100.0f) {
                            interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                        } else if (f21 < 484.0f) {
                            interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                        } else {
                            f22 = 90.0f;
                        }
                        f22 = interpolation;
                    }
                } else if (i21 == 1) {
                    if (f21 < 100.0f) {
                        interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                    } else if (f21 < 484.0f) {
                        interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                    } else {
                        f22 = 90.0f;
                    }
                    f22 = interpolation;
                }
                canvas2.rotate(f22);
                i22 = this.currentIcon;
                if (i22 == 0) {
                    canvas2.scale(f17, f17);
                } else {
                    canvas2.scale(f17, f17);
                }
                Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                canvas2.scale(1.0f, -1.0f);
                Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                canvas2.restore();
            } else {
                i19 = 1;
                if (i18 == 1) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                i20 = this.nextIcon;
                if (i20 != 0) {
                    this.paint2.setAlpha(255);
                } else {
                    this.paint2.setAlpha(255);
                }
                applyShaderMatrix(true);
                canvas2.save();
                canvas2.translate(DiffUtil.m(1.0f, f20, AndroidUtilities.dp(1.0f), bounds.centerX()), bounds.centerY());
                f21 = f20 * 500.0f;
                i21 = this.currentIcon;
                if (i21 == 1) {
                    f22 = 90.0f;
                } else {
                    f22 = 0.0f;
                }
                if (i21 == 0) {
                    if (i21 == 1) {
                        if (f21 < 100.0f) {
                            interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                        } else if (f21 < 484.0f) {
                            interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                        } else {
                            f22 = 90.0f;
                        }
                        f22 = interpolation;
                    }
                } else if (i21 == 1) {
                    if (f21 < 100.0f) {
                        interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                    } else if (f21 < 484.0f) {
                        interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                    } else {
                        f22 = 90.0f;
                    }
                    f22 = interpolation;
                }
                canvas2.rotate(f22);
                i22 = this.currentIcon;
                if (i22 == 0) {
                    canvas2.scale(f17, f17);
                } else {
                    canvas2.scale(f17, f17);
                }
                Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                canvas2.scale(1.0f, -1.0f);
                Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                canvas2.restore();
            }
            if (this.currentIcon != 6) {
                applyShaderMatrix(false);
                if (this.currentIcon != 6) {
                    f25 = this.transitionProgress;
                    if (f25 > 0.5f) {
                        f27 = (f25 - 0.5f) / 0.5f;
                        fMin2 = 1.0f - Math.min(1.0f, f27 / 0.5f);
                        if (f27 > 0.5f) {
                            f26 = (f27 - 0.5f) / 0.5f;
                        } else {
                            f26 = 0.0f;
                        }
                    } else {
                        f26 = 0.0f;
                        fMin2 = 1.0f;
                    }
                    this.paint.setAlpha(255);
                    f23 = f26;
                } else {
                    if (this.nextIcon != 6) {
                        this.paint.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                    } else {
                        this.paint.setAlpha(255);
                    }
                    fMin2 = 0.0f;
                    f23 = 1.0f;
                }
                iDp = AndroidUtilities.dp(7.0f) + iCenterY3;
                iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                if (fMin2 < 1.0f) {
                    f24 = f17;
                    canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin2), iDp - (AndroidUtilities.dp(6.0f) * fMin2), this.paint);
                } else {
                    f24 = f17;
                }
                if (f23 > 0.0f) {
                    float f720 = iDp2;
                    float f721 = iDp;
                    canvas2 = canvas;
                    canvas2.drawLine(f720, f721, (AndroidUtilities.dp(12.0f) * f23) + f720, f721 - (AndroidUtilities.dp(12.0f) * f23), this.paint);
                } else {
                    canvas2 = canvas;
                }
            } else {
                applyShaderMatrix(false);
                if (this.currentIcon != 6) {
                    f25 = this.transitionProgress;
                    if (f25 > 0.5f) {
                        f27 = (f25 - 0.5f) / 0.5f;
                        fMin2 = 1.0f - Math.min(1.0f, f27 / 0.5f);
                        if (f27 > 0.5f) {
                            f26 = (f27 - 0.5f) / 0.5f;
                        } else {
                            f26 = 0.0f;
                        }
                    } else {
                        f26 = 0.0f;
                        fMin2 = 1.0f;
                    }
                    this.paint.setAlpha(255);
                    f23 = f26;
                } else {
                    if (this.nextIcon != 6) {
                        this.paint.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                    } else {
                        this.paint.setAlpha(255);
                    }
                    fMin2 = 0.0f;
                    f23 = 1.0f;
                }
                iDp = AndroidUtilities.dp(7.0f) + iCenterY3;
                iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                if (fMin2 < 1.0f) {
                    f24 = f17;
                    canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin2), iDp - (AndroidUtilities.dp(6.0f) * fMin2), this.paint);
                } else {
                    f24 = f17;
                }
                if (f23 > 0.0f) {
                    float f722 = iDp2;
                    float f723 = iDp;
                    canvas2 = canvas;
                    canvas2.drawLine(f722, f723, (AndroidUtilities.dp(12.0f) * f23) + f722, f723 - (AndroidUtilities.dp(12.0f) * f23), this.paint);
                } else {
                    canvas2 = canvas;
                }
            }
            if (drawable3 != null) {
                int intrinsicWidth3 = (int) (drawable3.getIntrinsicWidth() * fMax);
                int intrinsicHeight3 = (int) (drawable3.getIntrinsicHeight() * fMax);
                drawable3.setColorFilter(this.colorFilter);
                if (this.currentIcon == this.nextIcon) {
                    i28 = 255;
                } else {
                    i28 = (int) ((1.0f - this.transitionProgress) * 255.0f);
                }
                drawable3.setAlpha(i28);
                int i412 = intrinsicWidth3 / 2;
                int i413 = intrinsicHeight3 / 2;
                drawable3.setBounds(iCenterX - i412, iCenterY3 - i413, i412 + iCenterX, i413 + iCenterY3);
                drawable3.draw(canvas2);
            }
            if (drawable != null) {
                int intrinsicWidth4 = (int) (drawable.getIntrinsicWidth() * f24);
                int intrinsicHeight4 = (int) (drawable.getIntrinsicHeight() * f24);
                drawable.setColorFilter(this.colorFilter);
                if (this.currentIcon == this.nextIcon) {
                    i27 = 255;
                } else {
                    i27 = (int) (this.transitionProgress * 255.0f);
                }
                drawable.setAlpha(i27);
                int i414 = intrinsicWidth4 / 2;
                int i51 = intrinsicHeight4 / 2;
                drawable.setBounds(iCenterX - i414, iCenterY3 - i51, i414 + iCenterX, i51 + iCenterY3);
                drawable.draw(canvas2);
            }
            if (pathArr4 != null) {
                int iDp113 = AndroidUtilities.dp(24.0f);
                this.paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                Paint paint8 = this.paint2;
                if (this.currentIcon == this.nextIcon) {
                    i26 = 255;
                } else {
                    i26 = (int) ((1.0f - this.transitionProgress) * 255.0f);
                }
                paint8.setAlpha(i26);
                applyShaderMatrix(true);
                canvas2.save();
                canvas2.translate(iCenterX, iCenterY3);
                canvas2.scale(fMax, fMax);
                float f724 = (-iDp113) / 2;
                canvas2.translate(f724, f724);
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
                int iDp114 = AndroidUtilities.dp(24.0f);
                if (this.currentIcon == this.nextIcon) {
                    i25 = 255;
                } else {
                    i25 = (int) (this.transitionProgress * 255.0f);
                }
                this.paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                this.paint2.setAlpha(i25);
                applyShaderMatrix(true);
                canvas2.save();
                canvas2.translate(iCenterX, iCenterY3);
                float f83 = f24;
                canvas2.scale(f83, f83);
                float f84 = (-iDp114) / 2;
                canvas2.translate(f84, f84);
                path = pathArr3[0];
                if (path != null) {
                    canvas2.drawPath(path, this.paint2);
                }
                if (pathArr3.length >= 3) {
                    canvas2.drawPath(path3, this.paint);
                }
                path2 = pathArr3[1];
                if (path2 != null) {
                    if (i25 != 255) {
                        int alpha2 = this.backPaint.getAlpha();
                        this.backPaint.setAlpha((int) ((i25 / 255.0f) * alpha2));
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
            i23 = this.currentIcon;
            if (i23 != 3) {
                float f85 = ((360 * j2) / 2500.0f) + this.downloadRadOffset;
                this.downloadRadOffset = f85;
                this.downloadRadOffset = getCircleValue(f85);
                if (this.nextIcon != 2) {
                    f28 = this.downloadProgress;
                    f29 = this.downloadProgressAnimationStart;
                    f30 = f28 - f29;
                    if (f30 > 0.0f) {
                        f31 = this.downloadProgressTime + j2;
                        this.downloadProgressTime = f31;
                        if (f31 >= 200.0f) {
                            this.animatedDownloadProgress = f28;
                            this.downloadProgressAnimationStart = f28;
                            this.downloadProgressTime = 0.0f;
                        } else {
                            this.animatedDownloadProgress = (this.interpolator.getInterpolation(f31 / 200.0f) * f30) + f29;
                        }
                    }
                }
                invalidateSelf();
            } else {
                float f86 = ((360 * j2) / 2500.0f) + this.downloadRadOffset;
                this.downloadRadOffset = f86;
                this.downloadRadOffset = getCircleValue(f86);
                if (this.nextIcon != 2) {
                    f28 = this.downloadProgress;
                    f29 = this.downloadProgressAnimationStart;
                    f30 = f28 - f29;
                    if (f30 > 0.0f) {
                        f31 = this.downloadProgressTime + j2;
                        this.downloadProgressTime = f31;
                        if (f31 >= 200.0f) {
                            this.animatedDownloadProgress = f28;
                            this.downloadProgressAnimationStart = f28;
                            this.downloadProgressTime = 0.0f;
                        } else {
                            this.animatedDownloadProgress = (this.interpolator.getInterpolation(f31 / 200.0f) * f30) + f29;
                        }
                    }
                }
                invalidateSelf();
            }
            if (this.animatingTransition) {
                f32 = this.transitionProgress;
                if (f32 < 1.0f) {
                    f33 = (j2 / this.transitionAnimationTime) + f32;
                    this.transitionProgress = f33;
                    if (f33 >= 1.0f) {
                        this.currentIcon = this.nextIcon;
                        this.transitionProgress = 1.0f;
                        this.animatingTransition = false;
                    }
                    invalidateSelf();
                }
            }
            i24 = i;
            if (i24 >= 1) {
                canvas2.restoreToCount(i24);
            }
        }
        pathArr = Theme.chat_updatePath;
        pathArr2 = null;
        if (i45 == 5) {
            pathArr = Theme.chat_filePath;
        } else if (this.currentIcon == 5) {
            pathArr2 = Theme.chat_filePath;
        }
        pathArr3 = pathArr;
        if (i45 == i5) {
            if (this.currentIcon == i5) {
                drawable2 = Theme.chat_flameIcon;
                drawable = null;
            } else {
                drawable = null;
            }
            if (i45 == i2) {
                drawable = Theme.chat_gifIcon;
            } else if (this.currentIcon == i2) {
                drawable2 = Theme.chat_gifIcon;
            }
            drawable3 = drawable2;
            if (this.currentIcon != i4) {
                applyShaderMatrix(false);
                Paint paint9 = this.paint;
                if (this.currentIcon == this.nextIcon) {
                    i11 = 255;
                } else {
                    i11 = (int) (this.transitionProgress * 255.0f);
                }
                paint9.setAlpha(i11);
                int iDp115 = AndroidUtilities.dp(7.0f) + iCenterY3;
                int iDp116 = iCenterX - AndroidUtilities.dp(3.0f);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.save();
                    float f614 = this.transitionProgress;
                    canvas2.scale(f614, f614, iCenterX, iCenterY3);
                }
                float fDp113 = iDp116 - AndroidUtilities.dp(6.0f);
                float fDp114 = iDp115 - AndroidUtilities.dp(6.0f);
                Path[] pathArr8 = pathArr2;
                float f615 = iDp116;
                float f7114 = iDp115;
                pathArr4 = pathArr8;
                canvas2.drawLine(fDp113, fDp114, f615, f7114, this.paint);
                canvas2 = canvas;
                canvas2.drawLine(f615, f7114, AndroidUtilities.dp(12.0f) + iDp116, iDp115 - AndroidUtilities.dp(12.0f), this.paint);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.restore();
                }
            } else {
                applyShaderMatrix(false);
                Paint paint10 = this.paint;
                if (this.currentIcon == this.nextIcon) {
                    i11 = 255;
                } else {
                    i11 = (int) (this.transitionProgress * 255.0f);
                }
                paint10.setAlpha(i11);
                int iDp117 = AndroidUtilities.dp(7.0f) + iCenterY3;
                int iDp118 = iCenterX - AndroidUtilities.dp(3.0f);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.save();
                    float f616 = this.transitionProgress;
                    canvas2.scale(f616, f616, iCenterX, iCenterY3);
                }
                float fDp115 = iDp118 - AndroidUtilities.dp(6.0f);
                float fDp116 = iDp117 - AndroidUtilities.dp(6.0f);
                Path[] pathArr9 = pathArr2;
                float f617 = iDp118;
                float f7115 = iDp117;
                pathArr4 = pathArr9;
                canvas2.drawLine(fDp115, fDp116, f617, f7115, this.paint);
                canvas2 = canvas;
                canvas2.drawLine(f617, f7115, AndroidUtilities.dp(12.0f) + iDp118, iDp117 - AndroidUtilities.dp(12.0f), this.paint);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.restore();
                }
            }
            if (this.currentIcon != 12) {
                applyShaderMatrix(false);
                i12 = this.currentIcon;
                i13 = this.nextIcon;
                if (i12 == i13) {
                    f18 = 1.0f;
                } else if (i13 == 13) {
                    f18 = this.transitionProgress;
                } else {
                    f18 = 1.0f - this.transitionProgress;
                }
                Paint paint11 = this.paint;
                if (i12 == i13) {
                    i14 = 255;
                } else {
                    i14 = (int) (f18 * 255.0f);
                }
                paint11.setAlpha(i14);
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.save();
                    canvas2.scale(f18, f18, iCenterX, iCenterY3);
                }
                float fDp117 = AndroidUtilities.dp(7.0f) * this.scale;
                float f7116 = iCenterX;
                float f7117 = f7116 - fDp117;
                float f7118 = iCenterY3;
                float f7119 = f7118 - fDp117;
                float f71110 = f7116 + fDp117;
                float f71111 = f7118 + fDp117;
                canvas2.drawLine(f7117, f7119, f71110, f71111, this.paint);
                canvas2 = canvas;
                canvas2.drawLine(f71110, f7119, f7117, f71111, this.paint);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.restore();
                }
            } else {
                applyShaderMatrix(false);
                i12 = this.currentIcon;
                i13 = this.nextIcon;
                if (i12 == i13) {
                    f18 = 1.0f;
                } else if (i13 == 13) {
                    f18 = this.transitionProgress;
                } else {
                    f18 = 1.0f - this.transitionProgress;
                }
                Paint paint12 = this.paint;
                if (i12 == i13) {
                    i14 = 255;
                } else {
                    i14 = (int) (f18 * 255.0f);
                }
                paint12.setAlpha(i14);
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.save();
                    canvas2.scale(f18, f18, iCenterX, iCenterY3);
                }
                float fDp118 = AndroidUtilities.dp(7.0f) * this.scale;
                float f71112 = iCenterX;
                float f71113 = f71112 - fDp118;
                float f71114 = iCenterY3;
                float f71115 = f71114 - fDp118;
                float f71116 = f71112 + fDp118;
                float f71117 = f71114 + fDp118;
                canvas2.drawLine(f71113, f71115, f71116, f71117, this.paint);
                canvas2 = canvas;
                canvas2.drawLine(f71116, f71115, f71113, f71117, this.paint);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.restore();
                }
            }
            if (this.currentIcon != 13) {
                applyShaderMatrix(false);
                i15 = this.currentIcon;
                i16 = this.nextIcon;
                if (i15 == i16) {
                    f19 = 1.0f;
                } else if (i16 == 13) {
                    f19 = this.transitionProgress;
                } else {
                    f19 = 1.0f - this.transitionProgress;
                }
                this.textPaint.setAlpha((int) (f19 * 255.0f));
                int iDp119 = AndroidUtilities.dp(5.0f) + iCenterY3;
                int i415 = iCenterX - (this.percentStringWidth / 2);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.save();
                    canvas2.scale(f19, f19, iCenterX, iCenterY3);
                }
                i17 = (int) (this.animatedDownloadProgress * 100.0f);
                if (this.percentString != null) {
                    this.lastPercent = i17;
                    String str6 = String.format("%d%%", Integer.valueOf(i17));
                    this.percentString = str6;
                    this.percentStringWidth = (int) Math.ceil(this.textPaint.measureText(str6));
                } else {
                    this.lastPercent = i17;
                    String str7 = String.format("%d%%", Integer.valueOf(i17));
                    this.percentString = str7;
                    this.percentStringWidth = (int) Math.ceil(this.textPaint.measureText(str7));
                }
                canvas2.drawText(this.percentString, i415, iDp119, this.textPaint);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.restore();
                }
            } else {
                applyShaderMatrix(false);
                i15 = this.currentIcon;
                i16 = this.nextIcon;
                if (i15 == i16) {
                    f19 = 1.0f;
                } else if (i16 == 13) {
                    f19 = this.transitionProgress;
                } else {
                    f19 = 1.0f - this.transitionProgress;
                }
                this.textPaint.setAlpha((int) (f19 * 255.0f));
                int iDp1110 = AndroidUtilities.dp(5.0f) + iCenterY3;
                int i416 = iCenterX - (this.percentStringWidth / 2);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.save();
                    canvas2.scale(f19, f19, iCenterX, iCenterY3);
                }
                i17 = (int) (this.animatedDownloadProgress * 100.0f);
                if (this.percentString != null) {
                    this.lastPercent = i17;
                    String str8 = String.format("%d%%", Integer.valueOf(i17));
                    this.percentString = str8;
                    this.percentStringWidth = (int) Math.ceil(this.textPaint.measureText(str8));
                } else {
                    this.lastPercent = i17;
                    String str9 = String.format("%d%%", Integer.valueOf(i17));
                    this.percentString = str9;
                    this.percentStringWidth = (int) Math.ceil(this.textPaint.measureText(str9));
                }
                canvas2.drawText(this.percentString, i416, iDp1110, this.textPaint);
                if (this.currentIcon != this.nextIcon) {
                    canvas2.restore();
                }
            }
            i18 = this.currentIcon;
            if (i18 != 0) {
                if (i18 == 0) {
                    i19 = 1;
                    if (i18 == 1) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    i20 = this.nextIcon;
                    if (i20 != 0) {
                        this.paint2.setAlpha(255);
                    } else {
                        this.paint2.setAlpha(255);
                    }
                    applyShaderMatrix(true);
                    canvas2.save();
                    canvas2.translate(DiffUtil.m(1.0f, f20, AndroidUtilities.dp(1.0f), bounds.centerX()), bounds.centerY());
                    f21 = f20 * 500.0f;
                    i21 = this.currentIcon;
                    if (i21 == 1) {
                        f22 = 90.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    if (i21 == 0) {
                        if (i21 == 1) {
                            if (f21 < 100.0f) {
                                interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                            } else if (f21 < 484.0f) {
                                interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                            } else {
                                f22 = 90.0f;
                            }
                            f22 = interpolation;
                        }
                    } else if (i21 == 1) {
                        if (f21 < 100.0f) {
                            interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                        } else if (f21 < 484.0f) {
                            interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                        } else {
                            f22 = 90.0f;
                        }
                        f22 = interpolation;
                    }
                    canvas2.rotate(f22);
                    i22 = this.currentIcon;
                    if (i22 == 0) {
                        canvas2.scale(f17, f17);
                    } else {
                        canvas2.scale(f17, f17);
                    }
                    Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                    canvas2.scale(1.0f, -1.0f);
                    Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                    canvas2.restore();
                } else {
                    i19 = 1;
                    if (i18 == 1) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    i20 = this.nextIcon;
                    if (i20 != 0) {
                        this.paint2.setAlpha(255);
                    } else {
                        this.paint2.setAlpha(255);
                    }
                    applyShaderMatrix(true);
                    canvas2.save();
                    canvas2.translate(DiffUtil.m(1.0f, f20, AndroidUtilities.dp(1.0f), bounds.centerX()), bounds.centerY());
                    f21 = f20 * 500.0f;
                    i21 = this.currentIcon;
                    if (i21 == 1) {
                        f22 = 90.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    if (i21 == 0) {
                        if (i21 == 1) {
                            if (f21 < 100.0f) {
                                interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                            } else if (f21 < 484.0f) {
                                interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                            } else {
                                f22 = 90.0f;
                            }
                            f22 = interpolation;
                        }
                    } else if (i21 == 1) {
                        if (f21 < 100.0f) {
                            interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                        } else if (f21 < 484.0f) {
                            interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                        } else {
                            f22 = 90.0f;
                        }
                        f22 = interpolation;
                    }
                    canvas2.rotate(f22);
                    i22 = this.currentIcon;
                    if (i22 == 0) {
                        canvas2.scale(f17, f17);
                    } else {
                        canvas2.scale(f17, f17);
                    }
                    Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                    canvas2.scale(1.0f, -1.0f);
                    Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                    canvas2.restore();
                }
            } else if (i18 == 0) {
                i19 = 1;
                if (i18 == 1) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                i20 = this.nextIcon;
                if (i20 != 0) {
                    this.paint2.setAlpha(255);
                } else {
                    this.paint2.setAlpha(255);
                }
                applyShaderMatrix(true);
                canvas2.save();
                canvas2.translate(DiffUtil.m(1.0f, f20, AndroidUtilities.dp(1.0f), bounds.centerX()), bounds.centerY());
                f21 = f20 * 500.0f;
                i21 = this.currentIcon;
                if (i21 == 1) {
                    f22 = 90.0f;
                } else {
                    f22 = 0.0f;
                }
                if (i21 == 0) {
                    if (i21 == 1) {
                        if (f21 < 100.0f) {
                            interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                        } else if (f21 < 484.0f) {
                            interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                        } else {
                            f22 = 90.0f;
                        }
                        f22 = interpolation;
                    }
                } else if (i21 == 1) {
                    if (f21 < 100.0f) {
                        interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                    } else if (f21 < 484.0f) {
                        interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                    } else {
                        f22 = 90.0f;
                    }
                    f22 = interpolation;
                }
                canvas2.rotate(f22);
                i22 = this.currentIcon;
                if (i22 == 0) {
                    canvas2.scale(f17, f17);
                } else {
                    canvas2.scale(f17, f17);
                }
                Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                canvas2.scale(1.0f, -1.0f);
                Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                canvas2.restore();
            } else {
                i19 = 1;
                if (i18 == 1) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                i20 = this.nextIcon;
                if (i20 != 0) {
                    this.paint2.setAlpha(255);
                } else {
                    this.paint2.setAlpha(255);
                }
                applyShaderMatrix(true);
                canvas2.save();
                canvas2.translate(DiffUtil.m(1.0f, f20, AndroidUtilities.dp(1.0f), bounds.centerX()), bounds.centerY());
                f21 = f20 * 500.0f;
                i21 = this.currentIcon;
                if (i21 == 1) {
                    f22 = 90.0f;
                } else {
                    f22 = 0.0f;
                }
                if (i21 == 0) {
                    if (i21 == 1) {
                        if (f21 < 100.0f) {
                            interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                        } else if (f21 < 484.0f) {
                            interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                        } else {
                            f22 = 90.0f;
                        }
                        f22 = interpolation;
                    }
                } else if (i21 == 1) {
                    if (f21 < 100.0f) {
                        interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                    } else if (f21 < 484.0f) {
                        interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                    } else {
                        f22 = 90.0f;
                    }
                    f22 = interpolation;
                }
                canvas2.rotate(f22);
                i22 = this.currentIcon;
                if (i22 == 0) {
                    canvas2.scale(f17, f17);
                } else {
                    canvas2.scale(f17, f17);
                }
                Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                canvas2.scale(1.0f, -1.0f);
                Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                canvas2.restore();
            }
            if (this.currentIcon != 6) {
                applyShaderMatrix(false);
                if (this.currentIcon != 6) {
                    f25 = this.transitionProgress;
                    if (f25 > 0.5f) {
                        f27 = (f25 - 0.5f) / 0.5f;
                        fMin2 = 1.0f - Math.min(1.0f, f27 / 0.5f);
                        if (f27 > 0.5f) {
                            f26 = (f27 - 0.5f) / 0.5f;
                        } else {
                            f26 = 0.0f;
                        }
                    } else {
                        f26 = 0.0f;
                        fMin2 = 1.0f;
                    }
                    this.paint.setAlpha(255);
                    f23 = f26;
                } else {
                    if (this.nextIcon != 6) {
                        this.paint.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                    } else {
                        this.paint.setAlpha(255);
                    }
                    fMin2 = 0.0f;
                    f23 = 1.0f;
                }
                iDp = AndroidUtilities.dp(7.0f) + iCenterY3;
                iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                if (fMin2 < 1.0f) {
                    f24 = f17;
                    canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin2), iDp - (AndroidUtilities.dp(6.0f) * fMin2), this.paint);
                } else {
                    f24 = f17;
                }
                if (f23 > 0.0f) {
                    float f725 = iDp2;
                    float f726 = iDp;
                    canvas2 = canvas;
                    canvas2.drawLine(f725, f726, (AndroidUtilities.dp(12.0f) * f23) + f725, f726 - (AndroidUtilities.dp(12.0f) * f23), this.paint);
                } else {
                    canvas2 = canvas;
                }
            } else {
                applyShaderMatrix(false);
                if (this.currentIcon != 6) {
                    f25 = this.transitionProgress;
                    if (f25 > 0.5f) {
                        f27 = (f25 - 0.5f) / 0.5f;
                        fMin2 = 1.0f - Math.min(1.0f, f27 / 0.5f);
                        if (f27 > 0.5f) {
                            f26 = (f27 - 0.5f) / 0.5f;
                        } else {
                            f26 = 0.0f;
                        }
                    } else {
                        f26 = 0.0f;
                        fMin2 = 1.0f;
                    }
                    this.paint.setAlpha(255);
                    f23 = f26;
                } else {
                    if (this.nextIcon != 6) {
                        this.paint.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                    } else {
                        this.paint.setAlpha(255);
                    }
                    fMin2 = 0.0f;
                    f23 = 1.0f;
                }
                iDp = AndroidUtilities.dp(7.0f) + iCenterY3;
                iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                if (fMin2 < 1.0f) {
                    f24 = f17;
                    canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin2), iDp - (AndroidUtilities.dp(6.0f) * fMin2), this.paint);
                } else {
                    f24 = f17;
                }
                if (f23 > 0.0f) {
                    float f727 = iDp2;
                    float f728 = iDp;
                    canvas2 = canvas;
                    canvas2.drawLine(f727, f728, (AndroidUtilities.dp(12.0f) * f23) + f727, f728 - (AndroidUtilities.dp(12.0f) * f23), this.paint);
                } else {
                    canvas2 = canvas;
                }
            }
            if (drawable3 != null) {
                int intrinsicWidth5 = (int) (drawable3.getIntrinsicWidth() * fMax);
                int intrinsicHeight5 = (int) (drawable3.getIntrinsicHeight() * fMax);
                drawable3.setColorFilter(this.colorFilter);
                if (this.currentIcon == this.nextIcon) {
                    i28 = 255;
                } else {
                    i28 = (int) ((1.0f - this.transitionProgress) * 255.0f);
                }
                drawable3.setAlpha(i28);
                int i417 = intrinsicWidth5 / 2;
                int i418 = intrinsicHeight5 / 2;
                drawable3.setBounds(iCenterX - i417, iCenterY3 - i418, i417 + iCenterX, i418 + iCenterY3);
                drawable3.draw(canvas2);
            }
            if (drawable != null) {
                int intrinsicWidth6 = (int) (drawable.getIntrinsicWidth() * f24);
                int intrinsicHeight6 = (int) (drawable.getIntrinsicHeight() * f24);
                drawable.setColorFilter(this.colorFilter);
                if (this.currentIcon == this.nextIcon) {
                    i27 = 255;
                } else {
                    i27 = (int) (this.transitionProgress * 255.0f);
                }
                drawable.setAlpha(i27);
                int i419 = intrinsicWidth6 / 2;
                int i52 = intrinsicHeight6 / 2;
                drawable.setBounds(iCenterX - i419, iCenterY3 - i52, i419 + iCenterX, i52 + iCenterY3);
                drawable.draw(canvas2);
            }
            if (pathArr4 != null) {
                int iDp1111 = AndroidUtilities.dp(24.0f);
                this.paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                Paint paint13 = this.paint2;
                if (this.currentIcon == this.nextIcon) {
                    i26 = 255;
                } else {
                    i26 = (int) ((1.0f - this.transitionProgress) * 255.0f);
                }
                paint13.setAlpha(i26);
                applyShaderMatrix(true);
                canvas2.save();
                canvas2.translate(iCenterX, iCenterY3);
                canvas2.scale(fMax, fMax);
                float f729 = (-iDp1111) / 2;
                canvas2.translate(f729, f729);
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
                int iDp1112 = AndroidUtilities.dp(24.0f);
                if (this.currentIcon == this.nextIcon) {
                    i25 = 255;
                } else {
                    i25 = (int) (this.transitionProgress * 255.0f);
                }
                this.paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                this.paint2.setAlpha(i25);
                applyShaderMatrix(true);
                canvas2.save();
                canvas2.translate(iCenterX, iCenterY3);
                float f87 = f24;
                canvas2.scale(f87, f87);
                float f88 = (-iDp1112) / 2;
                canvas2.translate(f88, f88);
                path = pathArr3[0];
                if (path != null) {
                    canvas2.drawPath(path, this.paint2);
                }
                if (pathArr3.length >= 3) {
                    canvas2.drawPath(path3, this.paint);
                }
                path2 = pathArr3[1];
                if (path2 != null) {
                    if (i25 != 255) {
                        int alpha3 = this.backPaint.getAlpha();
                        this.backPaint.setAlpha((int) ((i25 / 255.0f) * alpha3));
                        canvas2.drawPath(pathArr3[1], this.backPaint);
                        this.backPaint.setAlpha(alpha3);
                    } else {
                        canvas2.drawPath(path2, this.backPaint);
                    }
                }
                canvas2.restore();
            }
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            j = jCurrentTimeMillis3 - this.lastAnimationTime;
            if (j > 17) {
                j2 = 17;
            } else {
                j2 = j;
            }
            this.lastAnimationTime = jCurrentTimeMillis3;
            i23 = this.currentIcon;
            if (i23 != 3) {
                float f89 = ((360 * j2) / 2500.0f) + this.downloadRadOffset;
                this.downloadRadOffset = f89;
                this.downloadRadOffset = getCircleValue(f89);
                if (this.nextIcon != 2) {
                    f28 = this.downloadProgress;
                    f29 = this.downloadProgressAnimationStart;
                    f30 = f28 - f29;
                    if (f30 > 0.0f) {
                        f31 = this.downloadProgressTime + j2;
                        this.downloadProgressTime = f31;
                        if (f31 >= 200.0f) {
                            this.animatedDownloadProgress = f28;
                            this.downloadProgressAnimationStart = f28;
                            this.downloadProgressTime = 0.0f;
                        } else {
                            this.animatedDownloadProgress = (this.interpolator.getInterpolation(f31 / 200.0f) * f30) + f29;
                        }
                    }
                }
                invalidateSelf();
            } else {
                float f810 = ((360 * j2) / 2500.0f) + this.downloadRadOffset;
                this.downloadRadOffset = f810;
                this.downloadRadOffset = getCircleValue(f810);
                if (this.nextIcon != 2) {
                    f28 = this.downloadProgress;
                    f29 = this.downloadProgressAnimationStart;
                    f30 = f28 - f29;
                    if (f30 > 0.0f) {
                        f31 = this.downloadProgressTime + j2;
                        this.downloadProgressTime = f31;
                        if (f31 >= 200.0f) {
                            this.animatedDownloadProgress = f28;
                            this.downloadProgressAnimationStart = f28;
                            this.downloadProgressTime = 0.0f;
                        } else {
                            this.animatedDownloadProgress = (this.interpolator.getInterpolation(f31 / 200.0f) * f30) + f29;
                        }
                    }
                }
                invalidateSelf();
            }
            if (this.animatingTransition) {
                f32 = this.transitionProgress;
                if (f32 < 1.0f) {
                    f33 = (j2 / this.transitionAnimationTime) + f32;
                    this.transitionProgress = f33;
                    if (f33 >= 1.0f) {
                        this.currentIcon = this.nextIcon;
                        this.transitionProgress = 1.0f;
                        this.animatingTransition = false;
                    }
                    invalidateSelf();
                }
            }
            i24 = i;
            if (i24 >= 1) {
                canvas2.restoreToCount(i24);
            }
        }
        drawable = Theme.chat_flameIcon;
        drawable2 = null;
        if (i45 == i2) {
            drawable = Theme.chat_gifIcon;
        } else if (this.currentIcon == i2) {
            drawable2 = Theme.chat_gifIcon;
        }
        drawable3 = drawable2;
        if (this.currentIcon != i4) {
            applyShaderMatrix(false);
            Paint paint14 = this.paint;
            if (this.currentIcon == this.nextIcon) {
                i11 = 255;
            } else {
                i11 = (int) (this.transitionProgress * 255.0f);
            }
            paint14.setAlpha(i11);
            int iDp1113 = AndroidUtilities.dp(7.0f) + iCenterY3;
            int iDp1114 = iCenterX - AndroidUtilities.dp(3.0f);
            if (this.currentIcon != this.nextIcon) {
                canvas2.save();
                float f618 = this.transitionProgress;
                canvas2.scale(f618, f618, iCenterX, iCenterY3);
            }
            float fDp119 = iDp1114 - AndroidUtilities.dp(6.0f);
            float fDp1110 = iDp1113 - AndroidUtilities.dp(6.0f);
            Path[] pathArr10 = pathArr2;
            float f619 = iDp1114;
            float f71118 = iDp1113;
            pathArr4 = pathArr10;
            canvas2.drawLine(fDp119, fDp1110, f619, f71118, this.paint);
            canvas2 = canvas;
            canvas2.drawLine(f619, f71118, AndroidUtilities.dp(12.0f) + iDp1114, iDp1113 - AndroidUtilities.dp(12.0f), this.paint);
            if (this.currentIcon != this.nextIcon) {
                canvas2.restore();
            }
        } else {
            applyShaderMatrix(false);
            Paint paint15 = this.paint;
            if (this.currentIcon == this.nextIcon) {
                i11 = 255;
            } else {
                i11 = (int) (this.transitionProgress * 255.0f);
            }
            paint15.setAlpha(i11);
            int iDp1115 = AndroidUtilities.dp(7.0f) + iCenterY3;
            int iDp1116 = iCenterX - AndroidUtilities.dp(3.0f);
            if (this.currentIcon != this.nextIcon) {
                canvas2.save();
                float f6110 = this.transitionProgress;
                canvas2.scale(f6110, f6110, iCenterX, iCenterY3);
            }
            float fDp1111 = iDp1116 - AndroidUtilities.dp(6.0f);
            float fDp1112 = iDp1115 - AndroidUtilities.dp(6.0f);
            Path[] pathArr11 = pathArr2;
            float f6111 = iDp1116;
            float f71119 = iDp1115;
            pathArr4 = pathArr11;
            canvas2.drawLine(fDp1111, fDp1112, f6111, f71119, this.paint);
            canvas2 = canvas;
            canvas2.drawLine(f6111, f71119, AndroidUtilities.dp(12.0f) + iDp1116, iDp1115 - AndroidUtilities.dp(12.0f), this.paint);
            if (this.currentIcon != this.nextIcon) {
                canvas2.restore();
            }
        }
        if (this.currentIcon != 12) {
            applyShaderMatrix(false);
            i12 = this.currentIcon;
            i13 = this.nextIcon;
            if (i12 == i13) {
                f18 = 1.0f;
            } else if (i13 == 13) {
                f18 = this.transitionProgress;
            } else {
                f18 = 1.0f - this.transitionProgress;
            }
            Paint paint16 = this.paint;
            if (i12 == i13) {
                i14 = 255;
            } else {
                i14 = (int) (f18 * 255.0f);
            }
            paint16.setAlpha(i14);
            AndroidUtilities.dp(7.0f);
            AndroidUtilities.dp(3.0f);
            if (this.currentIcon != this.nextIcon) {
                canvas2.save();
                canvas2.scale(f18, f18, iCenterX, iCenterY3);
            }
            float fDp1113 = AndroidUtilities.dp(7.0f) * this.scale;
            float f711110 = iCenterX;
            float f711111 = f711110 - fDp1113;
            float f711112 = iCenterY3;
            float f711113 = f711112 - fDp1113;
            float f711114 = f711110 + fDp1113;
            float f711115 = f711112 + fDp1113;
            canvas2.drawLine(f711111, f711113, f711114, f711115, this.paint);
            canvas2 = canvas;
            canvas2.drawLine(f711114, f711113, f711111, f711115, this.paint);
            if (this.currentIcon != this.nextIcon) {
                canvas2.restore();
            }
        } else {
            applyShaderMatrix(false);
            i12 = this.currentIcon;
            i13 = this.nextIcon;
            if (i12 == i13) {
                f18 = 1.0f;
            } else if (i13 == 13) {
                f18 = this.transitionProgress;
            } else {
                f18 = 1.0f - this.transitionProgress;
            }
            Paint paint17 = this.paint;
            if (i12 == i13) {
                i14 = 255;
            } else {
                i14 = (int) (f18 * 255.0f);
            }
            paint17.setAlpha(i14);
            AndroidUtilities.dp(7.0f);
            AndroidUtilities.dp(3.0f);
            if (this.currentIcon != this.nextIcon) {
                canvas2.save();
                canvas2.scale(f18, f18, iCenterX, iCenterY3);
            }
            float fDp1114 = AndroidUtilities.dp(7.0f) * this.scale;
            float f711116 = iCenterX;
            float f711117 = f711116 - fDp1114;
            float f711118 = iCenterY3;
            float f711119 = f711118 - fDp1114;
            float f7111110 = f711116 + fDp1114;
            float f7111111 = f711118 + fDp1114;
            canvas2.drawLine(f711117, f711119, f7111110, f7111111, this.paint);
            canvas2 = canvas;
            canvas2.drawLine(f7111110, f711119, f711117, f7111111, this.paint);
            if (this.currentIcon != this.nextIcon) {
                canvas2.restore();
            }
        }
        if (this.currentIcon != 13) {
            applyShaderMatrix(false);
            i15 = this.currentIcon;
            i16 = this.nextIcon;
            if (i15 == i16) {
                f19 = 1.0f;
            } else if (i16 == 13) {
                f19 = this.transitionProgress;
            } else {
                f19 = 1.0f - this.transitionProgress;
            }
            this.textPaint.setAlpha((int) (f19 * 255.0f));
            int iDp1117 = AndroidUtilities.dp(5.0f) + iCenterY3;
            int i4110 = iCenterX - (this.percentStringWidth / 2);
            if (this.currentIcon != this.nextIcon) {
                canvas2.save();
                canvas2.scale(f19, f19, iCenterX, iCenterY3);
            }
            i17 = (int) (this.animatedDownloadProgress * 100.0f);
            if (this.percentString != null) {
                this.lastPercent = i17;
                String str10 = String.format("%d%%", Integer.valueOf(i17));
                this.percentString = str10;
                this.percentStringWidth = (int) Math.ceil(this.textPaint.measureText(str10));
            } else {
                this.lastPercent = i17;
                String str11 = String.format("%d%%", Integer.valueOf(i17));
                this.percentString = str11;
                this.percentStringWidth = (int) Math.ceil(this.textPaint.measureText(str11));
            }
            canvas2.drawText(this.percentString, i4110, iDp1117, this.textPaint);
            if (this.currentIcon != this.nextIcon) {
                canvas2.restore();
            }
        } else {
            applyShaderMatrix(false);
            i15 = this.currentIcon;
            i16 = this.nextIcon;
            if (i15 == i16) {
                f19 = 1.0f;
            } else if (i16 == 13) {
                f19 = this.transitionProgress;
            } else {
                f19 = 1.0f - this.transitionProgress;
            }
            this.textPaint.setAlpha((int) (f19 * 255.0f));
            int iDp1118 = AndroidUtilities.dp(5.0f) + iCenterY3;
            int i4111 = iCenterX - (this.percentStringWidth / 2);
            if (this.currentIcon != this.nextIcon) {
                canvas2.save();
                canvas2.scale(f19, f19, iCenterX, iCenterY3);
            }
            i17 = (int) (this.animatedDownloadProgress * 100.0f);
            if (this.percentString != null) {
                this.lastPercent = i17;
                String str12 = String.format("%d%%", Integer.valueOf(i17));
                this.percentString = str12;
                this.percentStringWidth = (int) Math.ceil(this.textPaint.measureText(str12));
            } else {
                this.lastPercent = i17;
                String str13 = String.format("%d%%", Integer.valueOf(i17));
                this.percentString = str13;
                this.percentStringWidth = (int) Math.ceil(this.textPaint.measureText(str13));
            }
            canvas2.drawText(this.percentString, i4111, iDp1118, this.textPaint);
            if (this.currentIcon != this.nextIcon) {
                canvas2.restore();
            }
        }
        i18 = this.currentIcon;
        if (i18 != 0) {
            if (i18 == 0) {
                i19 = 1;
                if (i18 == 1) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                i20 = this.nextIcon;
                if (i20 != 0) {
                    this.paint2.setAlpha(255);
                } else {
                    this.paint2.setAlpha(255);
                }
                applyShaderMatrix(true);
                canvas2.save();
                canvas2.translate(DiffUtil.m(1.0f, f20, AndroidUtilities.dp(1.0f), bounds.centerX()), bounds.centerY());
                f21 = f20 * 500.0f;
                i21 = this.currentIcon;
                if (i21 == 1) {
                    f22 = 90.0f;
                } else {
                    f22 = 0.0f;
                }
                if (i21 == 0) {
                    if (i21 == 1) {
                        if (f21 < 100.0f) {
                            interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                        } else if (f21 < 484.0f) {
                            interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                        } else {
                            f22 = 90.0f;
                        }
                        f22 = interpolation;
                    }
                } else if (i21 == 1) {
                    if (f21 < 100.0f) {
                        interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                    } else if (f21 < 484.0f) {
                        interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                    } else {
                        f22 = 90.0f;
                    }
                    f22 = interpolation;
                }
                canvas2.rotate(f22);
                i22 = this.currentIcon;
                if (i22 == 0) {
                    canvas2.scale(f17, f17);
                } else {
                    canvas2.scale(f17, f17);
                }
                Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                canvas2.scale(1.0f, -1.0f);
                Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                canvas2.restore();
            } else {
                i19 = 1;
                if (i18 == 1) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                i20 = this.nextIcon;
                if (i20 != 0) {
                    this.paint2.setAlpha(255);
                } else {
                    this.paint2.setAlpha(255);
                }
                applyShaderMatrix(true);
                canvas2.save();
                canvas2.translate(DiffUtil.m(1.0f, f20, AndroidUtilities.dp(1.0f), bounds.centerX()), bounds.centerY());
                f21 = f20 * 500.0f;
                i21 = this.currentIcon;
                if (i21 == 1) {
                    f22 = 90.0f;
                } else {
                    f22 = 0.0f;
                }
                if (i21 == 0) {
                    if (i21 == 1) {
                        if (f21 < 100.0f) {
                            interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                        } else if (f21 < 484.0f) {
                            interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                        } else {
                            f22 = 90.0f;
                        }
                        f22 = interpolation;
                    }
                } else if (i21 == 1) {
                    if (f21 < 100.0f) {
                        interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                    } else if (f21 < 484.0f) {
                        interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                    } else {
                        f22 = 90.0f;
                    }
                    f22 = interpolation;
                }
                canvas2.rotate(f22);
                i22 = this.currentIcon;
                if (i22 == 0) {
                    canvas2.scale(f17, f17);
                } else {
                    canvas2.scale(f17, f17);
                }
                Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                canvas2.scale(1.0f, -1.0f);
                Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
                canvas2.restore();
            }
        } else if (i18 == 0) {
            i19 = 1;
            if (i18 == 1) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            i20 = this.nextIcon;
            if (i20 != 0) {
                this.paint2.setAlpha(255);
            } else {
                this.paint2.setAlpha(255);
            }
            applyShaderMatrix(true);
            canvas2.save();
            canvas2.translate(DiffUtil.m(1.0f, f20, AndroidUtilities.dp(1.0f), bounds.centerX()), bounds.centerY());
            f21 = f20 * 500.0f;
            i21 = this.currentIcon;
            if (i21 == 1) {
                f22 = 90.0f;
            } else {
                f22 = 0.0f;
            }
            if (i21 == 0) {
                if (i21 == 1) {
                    if (f21 < 100.0f) {
                        interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                    } else if (f21 < 484.0f) {
                        interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                    } else {
                        f22 = 90.0f;
                    }
                    f22 = interpolation;
                }
            } else if (i21 == 1) {
                if (f21 < 100.0f) {
                    interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                } else if (f21 < 484.0f) {
                    interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                } else {
                    f22 = 90.0f;
                }
                f22 = interpolation;
            }
            canvas2.rotate(f22);
            i22 = this.currentIcon;
            if (i22 == 0) {
                canvas2.scale(f17, f17);
            } else {
                canvas2.scale(f17, f17);
            }
            Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
            canvas2.scale(1.0f, -1.0f);
            Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
            canvas2.restore();
        } else {
            i19 = 1;
            if (i18 == 1) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            i20 = this.nextIcon;
            if (i20 != 0) {
                this.paint2.setAlpha(255);
            } else {
                this.paint2.setAlpha(255);
            }
            applyShaderMatrix(true);
            canvas2.save();
            canvas2.translate(DiffUtil.m(1.0f, f20, AndroidUtilities.dp(1.0f), bounds.centerX()), bounds.centerY());
            f21 = f20 * 500.0f;
            i21 = this.currentIcon;
            if (i21 == 1) {
                f22 = 90.0f;
            } else {
                f22 = 0.0f;
            }
            if (i21 == 0) {
                if (i21 == 1) {
                    if (f21 < 100.0f) {
                        interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                    } else if (f21 < 484.0f) {
                        interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                    } else {
                        f22 = 90.0f;
                    }
                    f22 = interpolation;
                }
            } else if (i21 == 1) {
                if (f21 < 100.0f) {
                    interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f21 / 100.0f) * (-5.0f);
                } else if (f21 < 484.0f) {
                    interpolation = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                } else {
                    f22 = 90.0f;
                }
                f22 = interpolation;
            }
            canvas2.rotate(f22);
            i22 = this.currentIcon;
            if (i22 == 0) {
                canvas2.scale(f17, f17);
            } else {
                canvas2.scale(f17, f17);
            }
            Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
            canvas2.scale(1.0f, -1.0f);
            Theme.playPauseAnimator.draw(canvas2, this.paint2, f21);
            canvas2.restore();
        }
        if (this.currentIcon != 6) {
            applyShaderMatrix(false);
            if (this.currentIcon != 6) {
                f25 = this.transitionProgress;
                if (f25 > 0.5f) {
                    f27 = (f25 - 0.5f) / 0.5f;
                    fMin2 = 1.0f - Math.min(1.0f, f27 / 0.5f);
                    if (f27 > 0.5f) {
                        f26 = (f27 - 0.5f) / 0.5f;
                    } else {
                        f26 = 0.0f;
                    }
                } else {
                    f26 = 0.0f;
                    fMin2 = 1.0f;
                }
                this.paint.setAlpha(255);
                f23 = f26;
            } else {
                if (this.nextIcon != 6) {
                    this.paint.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                } else {
                    this.paint.setAlpha(255);
                }
                fMin2 = 0.0f;
                f23 = 1.0f;
            }
            iDp = AndroidUtilities.dp(7.0f) + iCenterY3;
            iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
            if (fMin2 < 1.0f) {
                f24 = f17;
                canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin2), iDp - (AndroidUtilities.dp(6.0f) * fMin2), this.paint);
            } else {
                f24 = f17;
            }
            if (f23 > 0.0f) {
                float f7210 = iDp2;
                float f7211 = iDp;
                canvas2 = canvas;
                canvas2.drawLine(f7210, f7211, (AndroidUtilities.dp(12.0f) * f23) + f7210, f7211 - (AndroidUtilities.dp(12.0f) * f23), this.paint);
            } else {
                canvas2 = canvas;
            }
        } else {
            applyShaderMatrix(false);
            if (this.currentIcon != 6) {
                f25 = this.transitionProgress;
                if (f25 > 0.5f) {
                    f27 = (f25 - 0.5f) / 0.5f;
                    fMin2 = 1.0f - Math.min(1.0f, f27 / 0.5f);
                    if (f27 > 0.5f) {
                        f26 = (f27 - 0.5f) / 0.5f;
                    } else {
                        f26 = 0.0f;
                    }
                } else {
                    f26 = 0.0f;
                    fMin2 = 1.0f;
                }
                this.paint.setAlpha(255);
                f23 = f26;
            } else {
                if (this.nextIcon != 6) {
                    this.paint.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                } else {
                    this.paint.setAlpha(255);
                }
                fMin2 = 0.0f;
                f23 = 1.0f;
            }
            iDp = AndroidUtilities.dp(7.0f) + iCenterY3;
            iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
            if (fMin2 < 1.0f) {
                f24 = f17;
                canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin2), iDp - (AndroidUtilities.dp(6.0f) * fMin2), this.paint);
            } else {
                f24 = f17;
            }
            if (f23 > 0.0f) {
                float f7212 = iDp2;
                float f7213 = iDp;
                canvas2 = canvas;
                canvas2.drawLine(f7212, f7213, (AndroidUtilities.dp(12.0f) * f23) + f7212, f7213 - (AndroidUtilities.dp(12.0f) * f23), this.paint);
            } else {
                canvas2 = canvas;
            }
        }
        if (drawable3 != null) {
            int intrinsicWidth7 = (int) (drawable3.getIntrinsicWidth() * fMax);
            int intrinsicHeight7 = (int) (drawable3.getIntrinsicHeight() * fMax);
            drawable3.setColorFilter(this.colorFilter);
            if (this.currentIcon == this.nextIcon) {
                i28 = 255;
            } else {
                i28 = (int) ((1.0f - this.transitionProgress) * 255.0f);
            }
            drawable3.setAlpha(i28);
            int i4112 = intrinsicWidth7 / 2;
            int i4113 = intrinsicHeight7 / 2;
            drawable3.setBounds(iCenterX - i4112, iCenterY3 - i4113, i4112 + iCenterX, i4113 + iCenterY3);
            drawable3.draw(canvas2);
        }
        if (drawable != null) {
            int intrinsicWidth8 = (int) (drawable.getIntrinsicWidth() * f24);
            int intrinsicHeight8 = (int) (drawable.getIntrinsicHeight() * f24);
            drawable.setColorFilter(this.colorFilter);
            if (this.currentIcon == this.nextIcon) {
                i27 = 255;
            } else {
                i27 = (int) (this.transitionProgress * 255.0f);
            }
            drawable.setAlpha(i27);
            int i4114 = intrinsicWidth8 / 2;
            int i53 = intrinsicHeight8 / 2;
            drawable.setBounds(iCenterX - i4114, iCenterY3 - i53, i4114 + iCenterX, i53 + iCenterY3);
            drawable.draw(canvas2);
        }
        if (pathArr4 != null) {
            int iDp1119 = AndroidUtilities.dp(24.0f);
            this.paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            Paint paint18 = this.paint2;
            if (this.currentIcon == this.nextIcon) {
                i26 = 255;
            } else {
                i26 = (int) ((1.0f - this.transitionProgress) * 255.0f);
            }
            paint18.setAlpha(i26);
            applyShaderMatrix(true);
            canvas2.save();
            canvas2.translate(iCenterX, iCenterY3);
            canvas2.scale(fMax, fMax);
            float f7214 = (-iDp1119) / 2;
            canvas2.translate(f7214, f7214);
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
            int iDp11110 = AndroidUtilities.dp(24.0f);
            if (this.currentIcon == this.nextIcon) {
                i25 = 255;
            } else {
                i25 = (int) (this.transitionProgress * 255.0f);
            }
            this.paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.paint2.setAlpha(i25);
            applyShaderMatrix(true);
            canvas2.save();
            canvas2.translate(iCenterX, iCenterY3);
            float f811 = f24;
            canvas2.scale(f811, f811);
            float f812 = (-iDp11110) / 2;
            canvas2.translate(f812, f812);
            path = pathArr3[0];
            if (path != null) {
                canvas2.drawPath(path, this.paint2);
            }
            if (pathArr3.length >= 3) {
                canvas2.drawPath(path3, this.paint);
            }
            path2 = pathArr3[1];
            if (path2 != null) {
                if (i25 != 255) {
                    int alpha4 = this.backPaint.getAlpha();
                    this.backPaint.setAlpha((int) ((i25 / 255.0f) * alpha4));
                    canvas2.drawPath(pathArr3[1], this.backPaint);
                    this.backPaint.setAlpha(alpha4);
                } else {
                    canvas2.drawPath(path2, this.backPaint);
                }
            }
            canvas2.restore();
        }
        long jCurrentTimeMillis4 = System.currentTimeMillis();
        j = jCurrentTimeMillis4 - this.lastAnimationTime;
        if (j > 17) {
            j2 = 17;
        } else {
            j2 = j;
        }
        this.lastAnimationTime = jCurrentTimeMillis4;
        i23 = this.currentIcon;
        if (i23 != 3) {
            float f813 = ((360 * j2) / 2500.0f) + this.downloadRadOffset;
            this.downloadRadOffset = f813;
            this.downloadRadOffset = getCircleValue(f813);
            if (this.nextIcon != 2) {
                f28 = this.downloadProgress;
                f29 = this.downloadProgressAnimationStart;
                f30 = f28 - f29;
                if (f30 > 0.0f) {
                    f31 = this.downloadProgressTime + j2;
                    this.downloadProgressTime = f31;
                    if (f31 >= 200.0f) {
                        this.animatedDownloadProgress = f28;
                        this.downloadProgressAnimationStart = f28;
                        this.downloadProgressTime = 0.0f;
                    } else {
                        this.animatedDownloadProgress = (this.interpolator.getInterpolation(f31 / 200.0f) * f30) + f29;
                    }
                }
            }
            invalidateSelf();
        } else {
            float f814 = ((360 * j2) / 2500.0f) + this.downloadRadOffset;
            this.downloadRadOffset = f814;
            this.downloadRadOffset = getCircleValue(f814);
            if (this.nextIcon != 2) {
                f28 = this.downloadProgress;
                f29 = this.downloadProgressAnimationStart;
                f30 = f28 - f29;
                if (f30 > 0.0f) {
                    f31 = this.downloadProgressTime + j2;
                    this.downloadProgressTime = f31;
                    if (f31 >= 200.0f) {
                        this.animatedDownloadProgress = f28;
                        this.downloadProgressAnimationStart = f28;
                        this.downloadProgressTime = 0.0f;
                    } else {
                        this.animatedDownloadProgress = (this.interpolator.getInterpolation(f31 / 200.0f) * f30) + f29;
                    }
                }
            }
            invalidateSelf();
        }
        if (this.animatingTransition) {
            f32 = this.transitionProgress;
            if (f32 < 1.0f) {
                f33 = (j2 / this.transitionAnimationTime) + f32;
                this.transitionProgress = f33;
                if (f33 >= 1.0f) {
                    this.currentIcon = this.nextIcon;
                    this.transitionProgress = 1.0f;
                    this.animatingTransition = false;
                }
                invalidateSelf();
            }
        }
        i24 = i;
        if (i24 >= 1) {
            canvas2.restoreToCount(i24);
        }
    }

    public int getColor() {
        return this.paint.getColor();
    }

    public int getCurrentIcon() {
        return this.nextIcon;
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public int getMinimumHeight() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public int getMinimumWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    public int getPreviousIcon() {
        return this.currentIcon;
    }

    public float getProgress() {
        return this.downloadProgress;
    }

    public float getProgressAlpha() {
        return 1.0f - this.transitionProgress;
    }

    public float getTransitionProgress() {
        if (this.animatingTransition) {
            return this.transitionProgress;
        }
        return 1.0f;
    }

    @Override
    public void invalidateSelf() {
        super.invalidateSelf();
        MediaActionDrawableDelegate mediaActionDrawableDelegate = this.delegate;
        if (mediaActionDrawableDelegate != null) {
            mediaActionDrawableDelegate.invalidate();
        }
    }

    @Override
    public void setAlpha(int i) {
    }

    public void setBackColor(int i) {
        this.backPaint.setColor(i | (-16777216));
    }

    public void setBackgroundDrawable(MessageDrawable messageDrawable) {
        this.messageDrawable = messageDrawable;
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        this.gradientDrawable = linearGradient;
        this.gradientMatrix = new Matrix();
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

    public void setColor(int i) {
        int i2 = (-16777216) | i;
        this.paint.setColor(i2);
        this.paint2.setColor(i2);
        this.paint3.setColor(i2);
        this.textPaint.setColor(i2);
        this.colorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        this.paint2.setColorFilter(colorFilter);
        this.paint3.setColorFilter(colorFilter);
        this.textPaint.setColorFilter(colorFilter);
    }

    public void setDelegate(MediaActionDrawableDelegate mediaActionDrawableDelegate) {
        this.delegate = mediaActionDrawableDelegate;
    }

    public void setHasOverlayImage(boolean z) {
        this.hasOverlayImage = z;
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

    public void setMini(boolean z) {
        this.isMini = z;
        this.paint.setStrokeWidth(AndroidUtilities.dp(z ? 2.0f : 3.0f));
    }

    public void setOverrideAlpha(float f) {
        this.overrideAlpha = f;
    }

    public void setProgress(float f, boolean z) {
        if (this.downloadProgress == f) {
            return;
        }
        if (z) {
            if (this.animatedDownloadProgress > f) {
                this.animatedDownloadProgress = f;
            }
            this.downloadProgressAnimationStart = this.animatedDownloadProgress;
        } else {
            this.animatedDownloadProgress = f;
            this.downloadProgressAnimationStart = f;
        }
        this.downloadProgress = f;
        this.downloadProgressTime = 0.0f;
        invalidateSelf();
    }
}
