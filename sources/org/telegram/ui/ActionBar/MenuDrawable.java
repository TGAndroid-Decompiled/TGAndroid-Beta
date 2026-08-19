package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.MediaActionDrawable;

public class MenuDrawable extends Drawable {
    public static int TYPE_DEFAULT = 0;
    public static int TYPE_UDPATE_AVAILABLE = 1;
    public static int TYPE_UDPATE_DOWNLOADING = 2;
    private int alpha;
    private float animatedDownloadProgress;
    private int backColor;
    private final Paint backPaint;
    private int currentAnimationTime;
    private float currentRotation;
    private float downloadProgress;
    private float downloadProgressAnimationStart;
    private float downloadProgressTime;
    private float downloadRadOffset;
    private float finalRotation;
    private int iconColor;
    private DecelerateInterpolator interpolator;
    private long lastFrameTime;
    private boolean miniIcon;
    private final Paint paint;
    private int previousType;
    private RectF rect;
    private boolean reverseAngle;
    private boolean rotateToBack;
    private boolean roundCap;
    private int type;
    private float typeAnimationProgress;

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public MenuDrawable() {
        this(TYPE_DEFAULT);
    }

    public MenuDrawable(int i) {
        Paint paint = new Paint(1);
        this.paint = paint;
        Paint paint2 = new Paint(1);
        this.backPaint = paint2;
        this.rotateToBack = true;
        this.interpolator = new DecelerateInterpolator();
        this.rect = new RectF();
        this.alpha = 255;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeWidth(AndroidUtilities.density * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.previousType = TYPE_DEFAULT;
        this.type = i;
        this.typeAnimationProgress = 1.0f;
    }

    public void setRotateToBack(boolean z) {
        this.rotateToBack = z;
    }

    public void setRotation(float f, boolean z) {
        this.lastFrameTime = 0L;
        float f2 = this.currentRotation;
        if (f2 == 1.0f) {
            this.reverseAngle = true;
        } else if (f2 == 0.0f) {
            this.reverseAngle = false;
        }
        this.lastFrameTime = 0L;
        if (z) {
            if (f2 < f) {
                this.currentAnimationTime = (int) (f2 * 200.0f);
            } else {
                this.currentAnimationTime = (int) ((1.0f - f2) * 200.0f);
            }
            this.lastFrameTime = SystemClock.elapsedRealtime();
            this.finalRotation = f;
        } else {
            this.currentRotation = f;
            this.finalRotation = f;
        }
        invalidateSelf();
    }

    @Override
    public void draw(Canvas canvas) {
        float fDp;
        float fDp2;
        float f;
        float f2;
        float f3;
        int i;
        float fDp3;
        float fDp4;
        float fDp5;
        float fAbs;
        float f4;
        float f5;
        int i2;
        float f6;
        float f7;
        Canvas canvas2;
        int i3;
        int i4;
        float fDp6;
        float f8;
        float f9;
        int i5;
        int i6;
        int i7;
        int i8;
        float f10;
        float f11;
        float f12;
        float f13;
        int i9;
        float fDp7;
        float strokeWidth;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.lastFrameTime;
        long j2 = jElapsedRealtime - j;
        float f14 = this.currentRotation;
        float f15 = this.finalRotation;
        if (f14 != f15) {
            if (j != 0) {
                int i10 = (int) (((long) this.currentAnimationTime) + j2);
                this.currentAnimationTime = i10;
                if (i10 >= 200) {
                    this.currentRotation = f15;
                } else if (f14 < f15) {
                    this.currentRotation = this.interpolator.getInterpolation(i10 / 200.0f) * this.finalRotation;
                } else {
                    this.currentRotation = 1.0f - this.interpolator.getInterpolation(i10 / 200.0f);
                }
            }
            invalidateSelf();
        }
        float f16 = this.typeAnimationProgress;
        if (f16 < 1.0f) {
            float f17 = f16 + (j2 / 200.0f);
            this.typeAnimationProgress = f17;
            if (f17 > 1.0f) {
                this.typeAnimationProgress = 1.0f;
            }
            invalidateSelf();
        }
        this.lastFrameTime = jElapsedRealtime;
        canvas.save();
        canvas.translate(((getIntrinsicWidth() / 2) - AndroidUtilities.dp(9.0f)) - (AndroidUtilities.dp(1.0f) * this.currentRotation), getIntrinsicHeight() / 2);
        int color = this.iconColor;
        if (color == 0) {
            color = Theme.getColor(Theme.key_actionBarDefaultIcon);
        }
        int color2 = this.backColor;
        if (color2 == 0) {
            color2 = Theme.getColor(Theme.key_actionBarDefault);
        }
        int offsetColor = color2;
        int i11 = this.type;
        int i12 = TYPE_DEFAULT;
        if (i11 == i12) {
            if (this.previousType != i12) {
                fDp = AndroidUtilities.dp(9.0f) * (1.0f - this.typeAnimationProgress);
                fDp2 = AndroidUtilities.dp(7.0f);
                f = this.typeAnimationProgress;
            } else {
                f3 = 0.0f;
                f2 = 0.0f;
            }
            if (this.rotateToBack) {
                float f18 = this.currentRotation;
                if (this.reverseAngle) {
                    i9 = -180;
                } else {
                    i9 = 180;
                }
                canvas.rotate(f18 * i9, AndroidUtilities.dp(9.0f), 0.0f);
                this.paint.setColor(color);
                this.paint.setAlpha(this.alpha);
                if (this.roundCap) {
                    fDp7 = (AndroidUtilities.dp(0.5f) * this.currentRotation) + ((this.paint.getStrokeWidth() / 2.0f) * (1.0f - this.currentRotation));
                } else {
                    fDp7 = 0.0f;
                }
                float fDp8 = (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(3.0f) * this.currentRotation)) - f3;
                if (this.roundCap) {
                    strokeWidth = (this.paint.getStrokeWidth() / 2.0f) * (1.0f - this.currentRotation);
                } else {
                    strokeWidth = 0.0f;
                }
                canvas.drawLine(fDp7, 0.0f, fDp8 - strokeWidth, 0.0f, this.paint);
                fDp3 = (AndroidUtilities.dp(5.0f) * (1.0f - Math.abs(this.currentRotation))) - (AndroidUtilities.dp(0.5f) * Math.abs(this.currentRotation));
                fDp4 = AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(2.5f) * Math.abs(this.currentRotation));
                fDp5 = AndroidUtilities.dp(5.0f) + (AndroidUtilities.dp(2.0f) * Math.abs(this.currentRotation));
                fAbs = AndroidUtilities.dp(7.5f) * Math.abs(this.currentRotation);
                if (this.roundCap) {
                    fAbs += (this.paint.getStrokeWidth() / 2.0f) * (1.0f - this.currentRotation);
                    float fDp9 = fDp3 + (AndroidUtilities.dp(0.5f) * this.currentRotation);
                    fDp4 -= (AndroidUtilities.dp(0.5f) * this.currentRotation) + ((this.paint.getStrokeWidth() / 2.0f) * (1.0f - this.currentRotation));
                    fDp5 -= AndroidUtilities.dp(0.25f) * this.currentRotation;
                    fDp3 = fDp9 + (AndroidUtilities.dp(0.25f) * this.currentRotation);
                }
            } else {
                float f19 = this.currentRotation;
                if (this.reverseAngle) {
                    i = -225;
                } else {
                    i = 135;
                }
                canvas.rotate(f19 * i, AndroidUtilities.dp(9.0f), 0.0f);
                if (this.miniIcon) {
                    this.paint.setColor(color);
                    this.paint.setAlpha(this.alpha);
                    canvas.drawLine((AndroidUtilities.dpf2(2.0f) * (1.0f - Math.abs(this.currentRotation))) + (AndroidUtilities.dp(1.0f) * this.currentRotation), 0.0f, ((AndroidUtilities.dpf2(16.0f) * (1.0f - this.currentRotation)) + (AndroidUtilities.dp(17.0f) * this.currentRotation)) - f3, 0.0f, this.paint);
                    fDp3 = (AndroidUtilities.dpf2(5.0f) * (1.0f - Math.abs(this.currentRotation))) - (AndroidUtilities.dpf2(0.5f) * Math.abs(this.currentRotation));
                    fDp4 = (AndroidUtilities.dpf2(9.0f) * Math.abs(this.currentRotation)) + (AndroidUtilities.dpf2(16.0f) * (1.0f - Math.abs(this.currentRotation)));
                    fDp5 = (AndroidUtilities.dpf2(3.0f) * Math.abs(this.currentRotation)) + AndroidUtilities.dpf2(5.0f);
                    fAbs = (AndroidUtilities.dpf2(7.0f) * Math.abs(this.currentRotation)) + AndroidUtilities.dpf2(2.0f);
                } else {
                    int color3 = Theme.getColor(Theme.key_actionBarActionModeDefaultIcon);
                    offsetColor = AndroidUtilities.getOffsetColor(offsetColor, Theme.getColor(Theme.key_actionBarActionModeDefault), this.currentRotation, 1.0f);
                    this.paint.setColor(AndroidUtilities.getOffsetColor(color, color3, this.currentRotation, 1.0f));
                    this.paint.setAlpha(this.alpha);
                    canvas.drawLine(this.currentRotation * AndroidUtilities.dp(1.0f), 0.0f, (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(1.0f) * this.currentRotation)) - f3, 0.0f, this.paint);
                    fDp3 = (AndroidUtilities.dp(5.0f) * (1.0f - Math.abs(this.currentRotation))) - (AndroidUtilities.dp(0.5f) * Math.abs(this.currentRotation));
                    fDp4 = AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(9.0f) * Math.abs(this.currentRotation));
                    fDp5 = (AndroidUtilities.dp(3.0f) * Math.abs(this.currentRotation)) + AndroidUtilities.dp(5.0f);
                    fAbs = Math.abs(this.currentRotation) * AndroidUtilities.dp(9.0f);
                }
            }
            f4 = fDp3;
            f5 = fAbs;
            i2 = offsetColor;
            f6 = fDp5;
            f7 = fDp4;
            if (this.miniIcon) {
                canvas2 = canvas;
                canvas2.drawLine(f5, -f6, f7, -f4, this.paint);
                canvas2.drawLine(f5, f6, f7, f4, this.paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(f5, -f6, f7 - f2, -f4, this.paint);
                canvas2.drawLine(f5, f6, f7, f4, this.paint);
            }
            i3 = this.type;
            i4 = TYPE_DEFAULT;
            if ((i3 == i4 && this.currentRotation != 1.0f) || (this.previousType != i4 && this.typeAnimationProgress != 1.0f)) {
                fDp6 = AndroidUtilities.dp(17.0f);
                f8 = -AndroidUtilities.dp(4.5f);
                f9 = AndroidUtilities.density * 5.5f;
                float f20 = 1.0f - this.currentRotation;
                canvas2.scale(f20, f20, fDp6, f8);
                if (this.type == TYPE_DEFAULT) {
                    f9 *= 1.0f - this.typeAnimationProgress;
                }
                this.backPaint.setColor(i2);
                this.backPaint.setAlpha(this.alpha);
                canvas2.drawCircle(fDp6, f8, f9, this.paint);
                i5 = this.type;
                i6 = TYPE_UDPATE_AVAILABLE;
                if (i5 != i6 || this.previousType == i6) {
                    this.backPaint.setStrokeWidth(AndroidUtilities.density * 1.66f);
                    if (this.previousType == TYPE_UDPATE_AVAILABLE) {
                        this.backPaint.setAlpha((int) (this.alpha * (1.0f - this.typeAnimationProgress)));
                    } else {
                        this.backPaint.setAlpha(this.alpha);
                    }
                    canvas2.drawLine(fDp6, f8 - AndroidUtilities.dp(2.0f), fDp6, f8, this.backPaint);
                    canvas2.drawPoint(fDp6, AndroidUtilities.dp(2.5f) + f8, this.backPaint);
                }
                i7 = this.type;
                i8 = TYPE_UDPATE_DOWNLOADING;
                if (i7 != i8 || this.previousType == i8) {
                    this.backPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    if (this.previousType == TYPE_UDPATE_DOWNLOADING) {
                        this.backPaint.setAlpha((int) (this.alpha * (1.0f - this.typeAnimationProgress)));
                    } else {
                        this.backPaint.setAlpha(this.alpha);
                    }
                    float fMax = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                    this.rect.set(fDp6 - AndroidUtilities.dp(3.0f), f8 - AndroidUtilities.dp(3.0f), fDp6 + AndroidUtilities.dp(3.0f), f8 + AndroidUtilities.dp(3.0f));
                    canvas2.drawArc(this.rect, this.downloadRadOffset, fMax, false, this.backPaint);
                    float f21 = this.downloadRadOffset + ((360 * j2) / 2500.0f);
                    this.downloadRadOffset = f21;
                    this.downloadRadOffset = MediaActionDrawable.getCircleValue(f21);
                    f10 = this.downloadProgress;
                    f11 = this.downloadProgressAnimationStart;
                    f12 = f10 - f11;
                    if (f12 > 0.0f) {
                        f13 = this.downloadProgressTime + j2;
                        this.downloadProgressTime = f13;
                        if (f13 >= 200.0f) {
                            this.animatedDownloadProgress = f10;
                            this.downloadProgressAnimationStart = f10;
                            this.downloadProgressTime = 0.0f;
                        } else {
                            this.animatedDownloadProgress = f11 + (f12 * this.interpolator.getInterpolation(f13 / 200.0f));
                        }
                    }
                    invalidateSelf();
                }
            }
            canvas.restore();
        }
        if (this.previousType == i12) {
            fDp = AndroidUtilities.dp(9.0f) * this.typeAnimationProgress * (1.0f - this.currentRotation);
            fDp2 = AndroidUtilities.dp(7.0f) * this.typeAnimationProgress;
            f = this.currentRotation;
        } else {
            fDp = AndroidUtilities.dp(9.0f) * (1.0f - this.currentRotation);
            fDp2 = AndroidUtilities.dp(7.0f);
            f = this.currentRotation;
        }
        f3 = fDp2 * (1.0f - f);
        f2 = fDp;
        if (this.rotateToBack) {
            float f110 = this.currentRotation;
            if (this.reverseAngle) {
                i9 = -180;
            } else {
                i9 = 180;
            }
            canvas.rotate(f110 * i9, AndroidUtilities.dp(9.0f), 0.0f);
            this.paint.setColor(color);
            this.paint.setAlpha(this.alpha);
            if (this.roundCap) {
                fDp7 = (AndroidUtilities.dp(0.5f) * this.currentRotation) + ((this.paint.getStrokeWidth() / 2.0f) * (1.0f - this.currentRotation));
            } else {
                fDp7 = 0.0f;
            }
            float fDp10 = (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(3.0f) * this.currentRotation)) - f3;
            if (this.roundCap) {
                strokeWidth = (this.paint.getStrokeWidth() / 2.0f) * (1.0f - this.currentRotation);
            } else {
                strokeWidth = 0.0f;
            }
            canvas.drawLine(fDp7, 0.0f, fDp10 - strokeWidth, 0.0f, this.paint);
            fDp3 = (AndroidUtilities.dp(5.0f) * (1.0f - Math.abs(this.currentRotation))) - (AndroidUtilities.dp(0.5f) * Math.abs(this.currentRotation));
            fDp4 = AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(2.5f) * Math.abs(this.currentRotation));
            fDp5 = AndroidUtilities.dp(5.0f) + (AndroidUtilities.dp(2.0f) * Math.abs(this.currentRotation));
            fAbs = AndroidUtilities.dp(7.5f) * Math.abs(this.currentRotation);
            if (this.roundCap) {
                fAbs += (this.paint.getStrokeWidth() / 2.0f) * (1.0f - this.currentRotation);
                float fDp11 = fDp3 + (AndroidUtilities.dp(0.5f) * this.currentRotation);
                fDp4 -= (AndroidUtilities.dp(0.5f) * this.currentRotation) + ((this.paint.getStrokeWidth() / 2.0f) * (1.0f - this.currentRotation));
                fDp5 -= AndroidUtilities.dp(0.25f) * this.currentRotation;
                fDp3 = fDp11 + (AndroidUtilities.dp(0.25f) * this.currentRotation);
            }
        } else {
            float f111 = this.currentRotation;
            if (this.reverseAngle) {
                i = -225;
            } else {
                i = 135;
            }
            canvas.rotate(f111 * i, AndroidUtilities.dp(9.0f), 0.0f);
            if (this.miniIcon) {
                this.paint.setColor(color);
                this.paint.setAlpha(this.alpha);
                canvas.drawLine((AndroidUtilities.dpf2(2.0f) * (1.0f - Math.abs(this.currentRotation))) + (AndroidUtilities.dp(1.0f) * this.currentRotation), 0.0f, ((AndroidUtilities.dpf2(16.0f) * (1.0f - this.currentRotation)) + (AndroidUtilities.dp(17.0f) * this.currentRotation)) - f3, 0.0f, this.paint);
                fDp3 = (AndroidUtilities.dpf2(5.0f) * (1.0f - Math.abs(this.currentRotation))) - (AndroidUtilities.dpf2(0.5f) * Math.abs(this.currentRotation));
                fDp4 = (AndroidUtilities.dpf2(9.0f) * Math.abs(this.currentRotation)) + (AndroidUtilities.dpf2(16.0f) * (1.0f - Math.abs(this.currentRotation)));
                fDp5 = (AndroidUtilities.dpf2(3.0f) * Math.abs(this.currentRotation)) + AndroidUtilities.dpf2(5.0f);
                fAbs = (AndroidUtilities.dpf2(7.0f) * Math.abs(this.currentRotation)) + AndroidUtilities.dpf2(2.0f);
            } else {
                int color4 = Theme.getColor(Theme.key_actionBarActionModeDefaultIcon);
                offsetColor = AndroidUtilities.getOffsetColor(offsetColor, Theme.getColor(Theme.key_actionBarActionModeDefault), this.currentRotation, 1.0f);
                this.paint.setColor(AndroidUtilities.getOffsetColor(color, color4, this.currentRotation, 1.0f));
                this.paint.setAlpha(this.alpha);
                canvas.drawLine(this.currentRotation * AndroidUtilities.dp(1.0f), 0.0f, (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(1.0f) * this.currentRotation)) - f3, 0.0f, this.paint);
                fDp3 = (AndroidUtilities.dp(5.0f) * (1.0f - Math.abs(this.currentRotation))) - (AndroidUtilities.dp(0.5f) * Math.abs(this.currentRotation));
                fDp4 = AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(9.0f) * Math.abs(this.currentRotation));
                fDp5 = (AndroidUtilities.dp(3.0f) * Math.abs(this.currentRotation)) + AndroidUtilities.dp(5.0f);
                fAbs = Math.abs(this.currentRotation) * AndroidUtilities.dp(9.0f);
            }
        }
        f4 = fDp3;
        f5 = fAbs;
        i2 = offsetColor;
        f6 = fDp5;
        f7 = fDp4;
        if (this.miniIcon) {
            canvas2 = canvas;
            canvas2.drawLine(f5, -f6, f7, -f4, this.paint);
            canvas2.drawLine(f5, f6, f7, f4, this.paint);
        } else {
            canvas2 = canvas;
            canvas2.drawLine(f5, -f6, f7 - f2, -f4, this.paint);
            canvas2.drawLine(f5, f6, f7, f4, this.paint);
        }
        i3 = this.type;
        i4 = TYPE_DEFAULT;
        if (i3 == i4) {
            fDp6 = AndroidUtilities.dp(17.0f);
            f8 = -AndroidUtilities.dp(4.5f);
            f9 = AndroidUtilities.density * 5.5f;
            float f22 = 1.0f - this.currentRotation;
            canvas2.scale(f22, f22, fDp6, f8);
            if (this.type == TYPE_DEFAULT) {
                f9 *= 1.0f - this.typeAnimationProgress;
            }
            this.backPaint.setColor(i2);
            this.backPaint.setAlpha(this.alpha);
            canvas2.drawCircle(fDp6, f8, f9, this.paint);
            i5 = this.type;
            i6 = TYPE_UDPATE_AVAILABLE;
            if (i5 != i6) {
                this.backPaint.setStrokeWidth(AndroidUtilities.density * 1.66f);
                if (this.previousType == TYPE_UDPATE_AVAILABLE) {
                    this.backPaint.setAlpha((int) (this.alpha * (1.0f - this.typeAnimationProgress)));
                } else {
                    this.backPaint.setAlpha(this.alpha);
                }
                canvas2.drawLine(fDp6, f8 - AndroidUtilities.dp(2.0f), fDp6, f8, this.backPaint);
                canvas2.drawPoint(fDp6, AndroidUtilities.dp(2.5f) + f8, this.backPaint);
            } else {
                this.backPaint.setStrokeWidth(AndroidUtilities.density * 1.66f);
                if (this.previousType == TYPE_UDPATE_AVAILABLE) {
                    this.backPaint.setAlpha((int) (this.alpha * (1.0f - this.typeAnimationProgress)));
                } else {
                    this.backPaint.setAlpha(this.alpha);
                }
                canvas2.drawLine(fDp6, f8 - AndroidUtilities.dp(2.0f), fDp6, f8, this.backPaint);
                canvas2.drawPoint(fDp6, AndroidUtilities.dp(2.5f) + f8, this.backPaint);
            }
            i7 = this.type;
            i8 = TYPE_UDPATE_DOWNLOADING;
            if (i7 != i8) {
                this.backPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                if (this.previousType == TYPE_UDPATE_DOWNLOADING) {
                    this.backPaint.setAlpha((int) (this.alpha * (1.0f - this.typeAnimationProgress)));
                } else {
                    this.backPaint.setAlpha(this.alpha);
                }
                float fMax2 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                this.rect.set(fDp6 - AndroidUtilities.dp(3.0f), f8 - AndroidUtilities.dp(3.0f), fDp6 + AndroidUtilities.dp(3.0f), f8 + AndroidUtilities.dp(3.0f));
                canvas2.drawArc(this.rect, this.downloadRadOffset, fMax2, false, this.backPaint);
                float f23 = this.downloadRadOffset + ((360 * j2) / 2500.0f);
                this.downloadRadOffset = f23;
                this.downloadRadOffset = MediaActionDrawable.getCircleValue(f23);
                f10 = this.downloadProgress;
                f11 = this.downloadProgressAnimationStart;
                f12 = f10 - f11;
                if (f12 > 0.0f) {
                    f13 = this.downloadProgressTime + j2;
                    this.downloadProgressTime = f13;
                    if (f13 >= 200.0f) {
                        this.animatedDownloadProgress = f10;
                        this.downloadProgressAnimationStart = f10;
                        this.downloadProgressTime = 0.0f;
                    } else {
                        this.animatedDownloadProgress = f11 + (f12 * this.interpolator.getInterpolation(f13 / 200.0f));
                    }
                }
                invalidateSelf();
            } else {
                this.backPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                if (this.previousType == TYPE_UDPATE_DOWNLOADING) {
                    this.backPaint.setAlpha((int) (this.alpha * (1.0f - this.typeAnimationProgress)));
                } else {
                    this.backPaint.setAlpha(this.alpha);
                }
                float fMax3 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                this.rect.set(fDp6 - AndroidUtilities.dp(3.0f), f8 - AndroidUtilities.dp(3.0f), fDp6 + AndroidUtilities.dp(3.0f), f8 + AndroidUtilities.dp(3.0f));
                canvas2.drawArc(this.rect, this.downloadRadOffset, fMax3, false, this.backPaint);
                float f24 = this.downloadRadOffset + ((360 * j2) / 2500.0f);
                this.downloadRadOffset = f24;
                this.downloadRadOffset = MediaActionDrawable.getCircleValue(f24);
                f10 = this.downloadProgress;
                f11 = this.downloadProgressAnimationStart;
                f12 = f10 - f11;
                if (f12 > 0.0f) {
                    f13 = this.downloadProgressTime + j2;
                    this.downloadProgressTime = f13;
                    if (f13 >= 200.0f) {
                        this.animatedDownloadProgress = f10;
                        this.downloadProgressAnimationStart = f10;
                        this.downloadProgressTime = 0.0f;
                    } else {
                        this.animatedDownloadProgress = f11 + (f12 * this.interpolator.getInterpolation(f13 / 200.0f));
                    }
                }
                invalidateSelf();
            }
        } else {
            fDp6 = AndroidUtilities.dp(17.0f);
            f8 = -AndroidUtilities.dp(4.5f);
            f9 = AndroidUtilities.density * 5.5f;
            float f25 = 1.0f - this.currentRotation;
            canvas2.scale(f25, f25, fDp6, f8);
            if (this.type == TYPE_DEFAULT) {
                f9 *= 1.0f - this.typeAnimationProgress;
            }
            this.backPaint.setColor(i2);
            this.backPaint.setAlpha(this.alpha);
            canvas2.drawCircle(fDp6, f8, f9, this.paint);
            i5 = this.type;
            i6 = TYPE_UDPATE_AVAILABLE;
            if (i5 != i6) {
                this.backPaint.setStrokeWidth(AndroidUtilities.density * 1.66f);
                if (this.previousType == TYPE_UDPATE_AVAILABLE) {
                    this.backPaint.setAlpha((int) (this.alpha * (1.0f - this.typeAnimationProgress)));
                } else {
                    this.backPaint.setAlpha(this.alpha);
                }
                canvas2.drawLine(fDp6, f8 - AndroidUtilities.dp(2.0f), fDp6, f8, this.backPaint);
                canvas2.drawPoint(fDp6, AndroidUtilities.dp(2.5f) + f8, this.backPaint);
            } else {
                this.backPaint.setStrokeWidth(AndroidUtilities.density * 1.66f);
                if (this.previousType == TYPE_UDPATE_AVAILABLE) {
                    this.backPaint.setAlpha((int) (this.alpha * (1.0f - this.typeAnimationProgress)));
                } else {
                    this.backPaint.setAlpha(this.alpha);
                }
                canvas2.drawLine(fDp6, f8 - AndroidUtilities.dp(2.0f), fDp6, f8, this.backPaint);
                canvas2.drawPoint(fDp6, AndroidUtilities.dp(2.5f) + f8, this.backPaint);
            }
            i7 = this.type;
            i8 = TYPE_UDPATE_DOWNLOADING;
            if (i7 != i8) {
                this.backPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                if (this.previousType == TYPE_UDPATE_DOWNLOADING) {
                    this.backPaint.setAlpha((int) (this.alpha * (1.0f - this.typeAnimationProgress)));
                } else {
                    this.backPaint.setAlpha(this.alpha);
                }
                float fMax4 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                this.rect.set(fDp6 - AndroidUtilities.dp(3.0f), f8 - AndroidUtilities.dp(3.0f), fDp6 + AndroidUtilities.dp(3.0f), f8 + AndroidUtilities.dp(3.0f));
                canvas2.drawArc(this.rect, this.downloadRadOffset, fMax4, false, this.backPaint);
                float f26 = this.downloadRadOffset + ((360 * j2) / 2500.0f);
                this.downloadRadOffset = f26;
                this.downloadRadOffset = MediaActionDrawable.getCircleValue(f26);
                f10 = this.downloadProgress;
                f11 = this.downloadProgressAnimationStart;
                f12 = f10 - f11;
                if (f12 > 0.0f) {
                    f13 = this.downloadProgressTime + j2;
                    this.downloadProgressTime = f13;
                    if (f13 >= 200.0f) {
                        this.animatedDownloadProgress = f10;
                        this.downloadProgressAnimationStart = f10;
                        this.downloadProgressTime = 0.0f;
                    } else {
                        this.animatedDownloadProgress = f11 + (f12 * this.interpolator.getInterpolation(f13 / 200.0f));
                    }
                }
                invalidateSelf();
            } else {
                this.backPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                if (this.previousType == TYPE_UDPATE_DOWNLOADING) {
                    this.backPaint.setAlpha((int) (this.alpha * (1.0f - this.typeAnimationProgress)));
                } else {
                    this.backPaint.setAlpha(this.alpha);
                }
                float fMax5 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                this.rect.set(fDp6 - AndroidUtilities.dp(3.0f), f8 - AndroidUtilities.dp(3.0f), fDp6 + AndroidUtilities.dp(3.0f), f8 + AndroidUtilities.dp(3.0f));
                canvas2.drawArc(this.rect, this.downloadRadOffset, fMax5, false, this.backPaint);
                float f27 = this.downloadRadOffset + ((360 * j2) / 2500.0f);
                this.downloadRadOffset = f27;
                this.downloadRadOffset = MediaActionDrawable.getCircleValue(f27);
                f10 = this.downloadProgress;
                f11 = this.downloadProgressAnimationStart;
                f12 = f10 - f11;
                if (f12 > 0.0f) {
                    f13 = this.downloadProgressTime + j2;
                    this.downloadProgressTime = f13;
                    if (f13 >= 200.0f) {
                        this.animatedDownloadProgress = f10;
                        this.downloadProgressAnimationStart = f10;
                        this.downloadProgressTime = 0.0f;
                    } else {
                        this.animatedDownloadProgress = f11 + (f12 * this.interpolator.getInterpolation(f13 / 200.0f));
                    }
                }
                invalidateSelf();
            }
        }
        canvas.restore();
    }

    @Override
    public void setAlpha(int i) {
        if (this.alpha != i) {
            this.alpha = i;
            this.paint.setAlpha(i);
            this.backPaint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    public void setIconColor(int i) {
        this.iconColor = i;
    }

    public void setBackColor(int i) {
        this.backColor = i;
    }

    public void setRoundCap() {
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.roundCap = true;
    }

    public void setMiniIcon(boolean z) {
        this.miniIcon = z;
    }
}
