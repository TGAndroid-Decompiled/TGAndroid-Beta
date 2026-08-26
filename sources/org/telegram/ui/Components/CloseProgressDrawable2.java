package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline1;

public abstract class CloseProgressDrawable2 extends Drawable {
    public float angle;
    public boolean animating;
    public int globalColorAlpha;
    public long lastFrameTime;
    public final Paint paint;
    public final RectF rect;
    public int side;

    public CloseProgressDrawable2(float f) {
        Paint paint = new Paint(1);
        this.paint = paint;
        new DecelerateInterpolator();
        this.rect = new RectF();
        this.globalColorAlpha = 255;
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.side = AndroidUtilities.dp(8.0f);
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f;
        float fM;
        float fM2;
        float fM3;
        float f2;
        Paint paint;
        float f3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int currentColor = getCurrentColor();
        Paint paint2 = this.paint;
        if (currentColor != 0) {
            this.globalColorAlpha = Color.alpha(currentColor);
            paint2.setColor(ColorUtils.setAlphaComponent(currentColor, 255));
        }
        long j = this.lastFrameTime;
        if (j != 0) {
            long j2 = jCurrentTimeMillis - j;
            boolean z = this.animating;
            if (z || this.angle != 0.0f) {
                float f4 = ((j2 * 360) / 500.0f) + this.angle;
                this.angle = f4;
                if (z || f4 < 720.0f) {
                    this.angle = f4 - (((int) (f4 / 720.0f)) * 720);
                } else {
                    this.angle = 0.0f;
                }
                invalidateSelf();
            }
        }
        if (this.globalColorAlpha == 255 || getBounds() == null || getBounds().isEmpty()) {
            canvas2 = canvas;
            canvas2.save();
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, this.globalColorAlpha, 31);
        }
        canvas2.translate(AndroidUtilities.dp(24.0f) / 2, AndroidUtilities.dp(24.0f) / 2);
        canvas2.rotate(-45.0f);
        float f5 = this.angle;
        if (f5 < 0.0f || f5 >= 90.0f) {
            if (f5 < 90.0f || f5 >= 180.0f) {
                if (f5 < 180.0f || f5 >= 270.0f) {
                    if (f5 >= 270.0f && f5 < 360.0f) {
                        fM3 = (f5 - 270.0f) / 90.0f;
                    } else if (f5 < 360.0f || f5 >= 450.0f) {
                        if (f5 >= 450.0f && f5 < 540.0f) {
                            f = (f5 - 450.0f) / 90.0f;
                            fM2 = 0.0f;
                        } else if (f5 >= 540.0f && f5 < 630.0f) {
                            fM2 = (f5 - 540.0f) / 90.0f;
                            f = 1.0f;
                        } else if (f5 < 630.0f || f5 >= 720.0f) {
                            f = 1.0f;
                        } else {
                            fM = (f5 - 630.0f) / 90.0f;
                            f = 1.0f;
                            fM2 = 1.0f;
                        }
                        fM = 0.0f;
                    } else {
                        fM3 = ImageReceiver$$ExternalSyntheticOutline1.m(f5, 360.0f, 90.0f, 1.0f);
                    }
                    f2 = fM3;
                    f = 0.0f;
                    fM2 = 0.0f;
                    fM = 0.0f;
                } else {
                    fM = ImageReceiver$$ExternalSyntheticOutline1.m(f5, 180.0f, 90.0f, 1.0f);
                    f = 0.0f;
                    fM2 = 0.0f;
                }
                f2 = 0.0f;
            } else {
                fM2 = ImageReceiver$$ExternalSyntheticOutline1.m(f5, 90.0f, 90.0f, 1.0f);
                f = 0.0f;
                fM = 1.0f;
                f2 = 0.0f;
            }
            if (f != 0.0f) {
                paint = paint2;
                canvas2.drawLine(0.0f, 0.0f, 0.0f, this.side * f, paint);
            } else {
                paint = paint2;
            }
            if (fM2 != 0.0f) {
                canvas.drawLine((-this.side) * fM2, 0.0f, 0.0f, 0.0f, paint);
            }
            if (fM != 0.0f) {
                canvas.drawLine(0.0f, (-this.side) * fM, 0.0f, 0.0f, paint);
            }
            if (f2 != 1.0f) {
                float f6 = this.side;
                canvas.drawLine(f6 * f2, 0.0f, f6, 0.0f, paint);
            }
            canvas.restore();
            int iCenterX = getBounds().centerX();
            int iCenterY = getBounds().centerY();
            RectF rectF = this.rect;
            int i = this.side;
            rectF.set(iCenterX - i, iCenterY - i, iCenterX + i, iCenterY + i);
            f3 = this.angle;
            float f7 = (f3 >= 360.0f ? f3 - 360.0f : 0.0f) - 45.0f;
            if (f3 >= 360.0f) {
                f3 = 720.0f - f3;
            }
            canvas.drawArc(rectF, f7, f3, false, paint);
            this.lastFrameTime = jCurrentTimeMillis;
        }
        f = 1.0f - (f5 / 90.0f);
        fM2 = 1.0f;
        fM = 1.0f;
        f2 = 0.0f;
        if (f != 0.0f) {
            paint = paint2;
            canvas2.drawLine(0.0f, 0.0f, 0.0f, this.side * f, paint);
        } else {
            paint = paint2;
        }
        if (fM2 != 0.0f) {
            canvas.drawLine((-this.side) * fM2, 0.0f, 0.0f, 0.0f, paint);
        }
        if (fM != 0.0f) {
            canvas.drawLine(0.0f, (-this.side) * fM, 0.0f, 0.0f, paint);
        }
        if (f2 != 1.0f) {
            float f8 = this.side;
            canvas.drawLine(f8 * f2, 0.0f, f8, 0.0f, paint);
        }
        canvas.restore();
        int iCenterX2 = getBounds().centerX();
        int iCenterY2 = getBounds().centerY();
        RectF rectF2 = this.rect;
        int i2 = this.side;
        rectF2.set(iCenterX2 - i2, iCenterY2 - i2, iCenterX2 + i2, iCenterY2 + i2);
        f3 = this.angle;
        float f9 = (f3 >= 360.0f ? f3 - 360.0f : 0.0f) - 45.0f;
        if (f3 >= 360.0f) {
            f3 = 720.0f - f3;
        }
        canvas.drawArc(rectF2, f9, f3, false, paint);
        this.lastFrameTime = jCurrentTimeMillis;
    }

    public abstract int getCurrentColor();

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
