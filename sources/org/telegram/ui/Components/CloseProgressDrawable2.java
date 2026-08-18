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

public abstract class CloseProgressDrawable2 extends Drawable {
    private float angle;
    private boolean animating;
    private int currentColor;
    private int globalColorAlpha;
    private DecelerateInterpolator interpolator;
    private long lastFrameTime;
    private Paint paint;
    private RectF rect;
    private int side;

    protected abstract int getCurrentColor();

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public CloseProgressDrawable2() {
        this(2.0f);
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

    public void startAnimation() {
        this.animating = true;
        this.lastFrameTime = System.currentTimeMillis();
        invalidateSelf();
    }

    public void stopAnimation() {
        this.animating = false;
    }

    private void setColor(int i) {
        if (this.currentColor != i) {
            this.globalColorAlpha = Color.alpha(i);
            this.paint.setColor(ColorUtils.setAlphaComponent(i, 255));
        }
    }

    public void setSide(int i) {
        this.side = i;
    }

    @Override
    public void draw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        long jCurrentTimeMillis = System.currentTimeMillis();
        setColor(getCurrentColor());
        long j = this.lastFrameTime;
        if (j != 0) {
            long j2 = jCurrentTimeMillis - j;
            boolean z = this.animating;
            if (z || this.angle != 0.0f) {
                float f8 = this.angle + ((j2 * 360) / 500.0f);
                this.angle = f8;
                if (!z && f8 >= 720.0f) {
                    this.angle = 0.0f;
                } else {
                    this.angle = f8 - (((int) (f8 / 720.0f)) * 720);
                }
                invalidateSelf();
            }
        }
        if (this.globalColorAlpha == 255 || getBounds() == null || getBounds().isEmpty()) {
            canvas.save();
        } else {
            canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, this.globalColorAlpha, 31);
        }
        canvas.translate(getIntrinsicWidth() / 2, getIntrinsicHeight() / 2);
        canvas.rotate(-45.0f);
        float f9 = this.angle;
        if (f9 < 0.0f || f9 >= 90.0f) {
            if (f9 < 90.0f || f9 >= 180.0f) {
                if (f9 < 180.0f || f9 >= 270.0f) {
                    if (f9 >= 270.0f && f9 < 360.0f) {
                        f4 = (f9 - 270.0f) / 90.0f;
                    } else if (f9 < 360.0f || f9 >= 450.0f) {
                        if (f9 >= 450.0f && f9 < 540.0f) {
                            f = (f9 - 450.0f) / 90.0f;
                            f3 = 0.0f;
                        } else if (f9 >= 540.0f && f9 < 630.0f) {
                            f3 = (f9 - 540.0f) / 90.0f;
                            f = 1.0f;
                        } else if (f9 < 630.0f || f9 >= 720.0f) {
                            f = 1.0f;
                        } else {
                            f2 = (f9 - 630.0f) / 90.0f;
                            f = 1.0f;
                            f3 = 1.0f;
                        }
                        f2 = 0.0f;
                    } else {
                        f4 = 1.0f - ((f9 - 360.0f) / 90.0f);
                    }
                    f5 = f4;
                    f = 0.0f;
                    f3 = 0.0f;
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f - ((f9 - 180.0f) / 90.0f);
                    f = 0.0f;
                    f3 = 0.0f;
                }
                f5 = 0.0f;
            } else {
                f3 = 1.0f - ((f9 - 90.0f) / 90.0f);
                f = 0.0f;
                f2 = 1.0f;
                f5 = 0.0f;
            }
            if (f != 0.0f) {
                canvas.drawLine(0.0f, 0.0f, 0.0f, this.side * f, this.paint);
            }
            if (f3 != 0.0f) {
                canvas.drawLine((-this.side) * f3, 0.0f, 0.0f, 0.0f, this.paint);
            }
            if (f2 != 0.0f) {
                canvas.drawLine(0.0f, (-this.side) * f2, 0.0f, 0.0f, this.paint);
            }
            if (f5 != 1.0f) {
                float f10 = this.side;
                canvas.drawLine(f10 * f5, 0.0f, f10, 0.0f, this.paint);
            }
            canvas.restore();
            int iCenterX = getBounds().centerX();
            int iCenterY = getBounds().centerY();
            RectF rectF = this.rect;
            int i = this.side;
            rectF.set(iCenterX - i, iCenterY - i, iCenterX + i, iCenterY + i);
            RectF rectF2 = this.rect;
            f6 = this.angle;
            float f11 = (f6 >= 360.0f ? f6 - 360.0f : 0.0f) - 45.0f;
            if (f6 < 360.0f) {
                f7 = f6;
            } else {
                f7 = 720.0f - f6;
            }
            canvas.drawArc(rectF2, f11, f7, false, this.paint);
            this.lastFrameTime = jCurrentTimeMillis;
        }
        f = 1.0f - (f9 / 90.0f);
        f3 = 1.0f;
        f2 = 1.0f;
        f5 = 0.0f;
        if (f != 0.0f) {
            canvas.drawLine(0.0f, 0.0f, 0.0f, this.side * f, this.paint);
        }
        if (f3 != 0.0f) {
            canvas.drawLine((-this.side) * f3, 0.0f, 0.0f, 0.0f, this.paint);
        }
        if (f2 != 0.0f) {
            canvas.drawLine(0.0f, (-this.side) * f2, 0.0f, 0.0f, this.paint);
        }
        if (f5 != 1.0f) {
            float f12 = this.side;
            canvas.drawLine(f12 * f5, 0.0f, f12, 0.0f, this.paint);
        }
        canvas.restore();
        int iCenterX2 = getBounds().centerX();
        int iCenterY2 = getBounds().centerY();
        RectF rectF3 = this.rect;
        int i2 = this.side;
        rectF3.set(iCenterX2 - i2, iCenterY2 - i2, iCenterX2 + i2, iCenterY2 + i2);
        RectF rectF4 = this.rect;
        f6 = this.angle;
        float f13 = (f6 >= 360.0f ? f6 - 360.0f : 0.0f) - 45.0f;
        if (f6 < 360.0f) {
            f7 = f6;
        } else {
            f7 = 720.0f - f6;
        }
        canvas.drawArc(rectF4, f13, f7, false, this.paint);
        this.lastFrameTime = jCurrentTimeMillis;
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }
}
