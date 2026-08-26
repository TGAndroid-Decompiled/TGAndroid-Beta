package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;

public class MessageBackgroundDrawable extends Drawable {
    private boolean animationInProgress;
    private float currentAnimationProgress;
    private float finalRadius;
    private boolean isSelected;
    private long lastAnimationTime;
    private long lastTouchTime;
    private View parentView;
    private Paint paint = new Paint(1);
    private Paint customPaint = null;
    private float touchX = -1.0f;
    private float touchY = -1.0f;
    private float touchOverrideX = -1.0f;
    private float touchOverrideY = -1.0f;

    public MessageBackgroundDrawable(View view) {
        this.parentView = view;
    }

    private void calcRadius() {
        Rect bounds = getBounds();
        float fCenterX = bounds.centerX();
        float fCenterY = bounds.centerY();
        float f = bounds.left - fCenterX;
        float f2 = bounds.top;
        this.finalRadius = (float) Math.ceil(Math.sqrt(DiffUtil.m(f2, fCenterY, f2 - fCenterY, f * f)));
    }

    private void invalidate() {
        View view = this.parentView;
        if (view != null) {
            view.invalidate();
            if (this.parentView.getParent() != null) {
                ((ViewGroup) this.parentView.getParent()).invalidate();
            }
        }
    }

    @Override
    public void draw(Canvas canvas) {
        float f;
        float f2 = this.currentAnimationProgress;
        if (f2 == 1.0f) {
            Rect bounds = getBounds();
            Paint paint = this.customPaint;
            if (paint == null) {
                paint = this.paint;
            }
            canvas.drawRect(bounds, paint);
        } else if (f2 != 0.0f) {
            float interpolation = this.isSelected ? CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(f2) : 1.0f - CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(1.0f - f2);
            Rect bounds2 = getBounds();
            float fCenterX = bounds2.centerX();
            float fCenterY = bounds2.centerY();
            float f3 = this.touchOverrideX;
            if (f3 >= 0.0f) {
                f = this.touchOverrideY;
                if (f < 0.0f) {
                    f3 = this.touchX;
                    if (f3 >= 0.0f) {
                        f = this.touchY;
                        if (f < 0.0f) {
                            f = fCenterY;
                            f3 = fCenterX;
                        }
                    } else {
                        f = fCenterY;
                        f3 = fCenterX;
                    }
                }
            } else {
                f3 = this.touchX;
                if (f3 >= 0.0f) {
                    f = this.touchY;
                    if (f < 0.0f) {
                        f = fCenterY;
                        f3 = fCenterX;
                    }
                } else {
                    f = fCenterY;
                    f3 = fCenterX;
                }
            }
            float f4 = 1.0f - interpolation;
            float fM = DiffUtil.m(f3, fCenterX, f4, fCenterX);
            float fM2 = DiffUtil.m(f, fCenterY, f4, fCenterY);
            float f5 = this.finalRadius * interpolation;
            Paint paint2 = this.customPaint;
            if (paint2 == null) {
                paint2 = this.paint;
            }
            canvas.drawCircle(fM, fM2, f5, paint2);
        }
        if (this.animationInProgress) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.lastAnimationTime;
            if (j > 20) {
                j = 17;
            }
            this.lastAnimationTime = jElapsedRealtime;
            if (this.isSelected) {
                float f6 = (j / 240.0f) + this.currentAnimationProgress;
                this.currentAnimationProgress = f6;
                if (f6 >= 1.0f) {
                    this.currentAnimationProgress = 1.0f;
                    this.touchX = -1.0f;
                    this.touchY = -1.0f;
                    this.touchOverrideX = -1.0f;
                    this.touchOverrideY = -1.0f;
                    this.animationInProgress = false;
                }
            } else {
                float f7 = this.currentAnimationProgress - (j / 240.0f);
                this.currentAnimationProgress = f7;
                if (f7 <= 0.0f) {
                    this.currentAnimationProgress = 0.0f;
                    this.touchX = -1.0f;
                    this.touchY = -1.0f;
                    this.touchOverrideX = -1.0f;
                    this.touchOverrideY = -1.0f;
                    this.animationInProgress = false;
                }
            }
            invalidate();
        }
    }

    public long getLastTouchTime() {
        return this.lastTouchTime;
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    public float getTouchX() {
        return this.touchX;
    }

    public float getTouchY() {
        return this.touchY;
    }

    public boolean isAnimationInProgress() {
        return this.animationInProgress;
    }

    @Override
    public void setAlpha(int i) {
        this.paint.setAlpha(i);
    }

    @Override
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        calcRadius();
    }

    public void setColor(int i) {
        this.paint.setColor(i);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    public void setCustomPaint(Paint paint) {
        this.customPaint = paint;
    }

    public void setSelected(boolean z, boolean z2) {
        if (this.isSelected == z) {
            if (this.animationInProgress == z2 || z2) {
                return;
            }
            this.currentAnimationProgress = z ? 1.0f : 0.0f;
            this.animationInProgress = false;
            return;
        }
        this.isSelected = z;
        this.animationInProgress = z2;
        if (z2) {
            this.lastAnimationTime = SystemClock.elapsedRealtime();
        } else {
            this.currentAnimationProgress = z ? 1.0f : 0.0f;
        }
        calcRadius();
        invalidate();
    }

    public void setTouchCoords(float f, float f2) {
        this.touchX = f;
        this.touchY = f2;
        this.lastTouchTime = SystemClock.elapsedRealtime();
    }

    public void setTouchCoordsOverride(float f, float f2) {
        this.touchOverrideX = f;
        this.touchOverrideY = f2;
    }

    @Override
    public void setBounds(Rect rect) {
        super.setBounds(rect);
        calcRadius();
    }
}
