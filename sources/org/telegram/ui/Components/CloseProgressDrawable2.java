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

public class CloseProgressDrawable2 extends Drawable {
    private float angle;
    private boolean animating;
    private int currentColor;
    private int globalColorAlpha;
    private DecelerateInterpolator interpolator;
    private long lastFrameTime;
    private Paint paint;
    private RectF rect;
    private int side;

    public CloseProgressDrawable2() {
        this(2.0f);
    }

    private void setColor(int i) {
        if (this.currentColor != i) {
            this.globalColorAlpha = Color.alpha(i);
            this.paint.setColor(ColorUtils.setAlphaComponent(i, 255));
        }
    }

    @Override
    public void draw(Canvas canvas) {
        Canvas canvas2;
        float f;
        float fM;
        float fM2;
        float fM3;
        float f2;
        float f3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        setColor(getCurrentColor());
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
        canvas2.translate(getIntrinsicWidth() / 2, getIntrinsicHeight() / 2);
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
                canvas2.drawLine(0.0f, 0.0f, 0.0f, this.side * f, this.paint);
            }
            if (fM2 != 0.0f) {
                canvas.drawLine((-this.side) * fM2, 0.0f, 0.0f, 0.0f, this.paint);
            }
            if (fM != 0.0f) {
                canvas.drawLine(0.0f, (-this.side) * fM, 0.0f, 0.0f, this.paint);
            }
            if (f2 != 1.0f) {
                float f6 = this.side;
                canvas.drawLine(f6 * f2, 0.0f, f6, 0.0f, this.paint);
            }
            canvas.restore();
            int iCenterX = getBounds().centerX();
            int iCenterY = getBounds().centerY();
            RectF rectF = this.rect;
            int i = this.side;
            rectF.set(iCenterX - i, iCenterY - i, iCenterX + i, iCenterY + i);
            RectF rectF2 = this.rect;
            f3 = this.angle;
            float f7 = (f3 >= 360.0f ? f3 - 360.0f : 0.0f) - 45.0f;
            if (f3 >= 360.0f) {
                f3 = 720.0f - f3;
            }
            canvas.drawArc(rectF2, f7, f3, false, this.paint);
            this.lastFrameTime = jCurrentTimeMillis;
        }
        f = 1.0f - (f5 / 90.0f);
        fM2 = 1.0f;
        fM = 1.0f;
        f2 = 0.0f;
        if (f != 0.0f) {
            canvas2.drawLine(0.0f, 0.0f, 0.0f, this.side * f, this.paint);
        }
        if (fM2 != 0.0f) {
            canvas.drawLine((-this.side) * fM2, 0.0f, 0.0f, 0.0f, this.paint);
        }
        if (fM != 0.0f) {
            canvas.drawLine(0.0f, (-this.side) * fM, 0.0f, 0.0f, this.paint);
        }
        if (f2 != 1.0f) {
            float f8 = this.side;
            canvas.drawLine(f8 * f2, 0.0f, f8, 0.0f, this.paint);
        }
        canvas.restore();
        int iCenterX2 = getBounds().centerX();
        int iCenterY2 = getBounds().centerY();
        RectF rectF3 = this.rect;
        int i2 = this.side;
        rectF3.set(iCenterX2 - i2, iCenterY2 - i2, iCenterX2 + i2, iCenterY2 + i2);
        RectF rectF4 = this.rect;
        f3 = this.angle;
        float f9 = (f3 >= 360.0f ? f3 - 360.0f : 0.0f) - 45.0f;
        if (f3 >= 360.0f) {
            f3 = 720.0f - f3;
        }
        canvas.drawArc(rectF4, f9, f3, false, this.paint);
        this.lastFrameTime = jCurrentTimeMillis;
    }

    public int getCurrentColor() {
        return -1;
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    public boolean isAnimating() {
        return this.animating;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setSide(int i) {
        this.side = i;
    }

    public void startAnimation() {
        this.animating = true;
        this.lastFrameTime = System.currentTimeMillis();
        invalidateSelf();
    }

    public void stopAnimation() {
        this.animating = false;
    }

    public CloseProgressDrawable2(float f) {
        this.paint = new Paint(1);
        this.interpolator = new DecelerateInterpolator();
        this.rect = new RectF();
        this.globalColorAlpha = 255;
        this.paint.setColor(-1);
        this.paint.setStrokeWidth(AndroidUtilities.dp(f));
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.paint.setStyle(Paint.Style.STROKE);
        this.side = AndroidUtilities.dp(8.0f);
    }
}
