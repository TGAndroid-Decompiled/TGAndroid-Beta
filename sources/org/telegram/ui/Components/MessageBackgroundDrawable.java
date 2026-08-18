package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;

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

    @Override
    public int getOpacity() {
        return -2;
    }

    public MessageBackgroundDrawable(View view) {
        this.parentView = view;
    }

    public void setColor(int i) {
        this.paint.setColor(i);
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

    private void invalidate() {
        View view = this.parentView;
        if (view != null) {
            view.invalidate();
            if (this.parentView.getParent() != null) {
                ((ViewGroup) this.parentView.getParent()).invalidate();
            }
        }
    }

    private void calcRadius() {
        Rect bounds = getBounds();
        float fCenterX = bounds.centerX();
        float fCenterY = bounds.centerY();
        float f = bounds.left - fCenterX;
        float f2 = bounds.top - fCenterY;
        this.finalRadius = (float) Math.ceil(Math.sqrt((f * f) + (f2 * f2)));
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

    public float getTouchX() {
        return this.touchX;
    }

    public float getTouchY() {
        return this.touchY;
    }

    public long getLastTouchTime() {
        return this.lastTouchTime;
    }

    public boolean isAnimationInProgress() {
        return this.animationInProgress;
    }

    @Override
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        calcRadius();
    }

    @Override
    public void setBounds(Rect rect) {
        super.setBounds(rect);
        calcRadius();
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    @Override
    public void setAlpha(int i) {
        this.paint.setAlpha(i);
    }

    @Override
    public void draw(Canvas canvas) {
        float interpolation;
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
            if (this.isSelected) {
                interpolation = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(f2);
            } else {
                interpolation = 1.0f - CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(1.0f - f2);
            }
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
            float f5 = fCenterX + ((f3 - fCenterX) * f4);
            float f6 = fCenterY + (f4 * (f - fCenterY));
            float f7 = this.finalRadius * interpolation;
            Paint paint2 = this.customPaint;
            if (paint2 == null) {
                paint2 = this.paint;
            }
            canvas.drawCircle(f5, f6, f7, paint2);
        }
        if (this.animationInProgress) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.lastAnimationTime;
            if (j > 20) {
                j = 17;
            }
            this.lastAnimationTime = jElapsedRealtime;
            if (this.isSelected) {
                float f8 = this.currentAnimationProgress + (j / 240.0f);
                this.currentAnimationProgress = f8;
                if (f8 >= 1.0f) {
                    this.currentAnimationProgress = 1.0f;
                    this.touchX = -1.0f;
                    this.touchY = -1.0f;
                    this.touchOverrideX = -1.0f;
                    this.touchOverrideY = -1.0f;
                    this.animationInProgress = false;
                }
            } else {
                float f9 = this.currentAnimationProgress - (j / 240.0f);
                this.currentAnimationProgress = f9;
                if (f9 <= 0.0f) {
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
}
