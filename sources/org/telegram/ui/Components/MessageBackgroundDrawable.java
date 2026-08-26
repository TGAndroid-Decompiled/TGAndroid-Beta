package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.ui.Cells.ChatMessageCell;

public final class MessageBackgroundDrawable extends Drawable {
    public boolean animationInProgress;
    public float currentAnimationProgress;
    public float finalRadius;
    public boolean isSelected;
    public long lastAnimationTime;
    public long lastTouchTime;
    public final ChatMessageCell parentView;
    public final Paint paint = new Paint(1);
    public Paint customPaint = null;
    public float touchX = -1.0f;
    public float touchY = -1.0f;
    public float touchOverrideX = -1.0f;
    public float touchOverrideY = -1.0f;

    public MessageBackgroundDrawable(ChatMessageCell chatMessageCell) {
        this.parentView = chatMessageCell;
    }

    public final void calcRadius() {
        Rect bounds = getBounds();
        float fCenterX = bounds.centerX();
        float fCenterY = bounds.centerY();
        float f = bounds.left - fCenterX;
        float f2 = bounds.top;
        this.finalRadius = (float) Math.ceil(Math.sqrt(DiffUtil.m(f2, fCenterY, f2 - fCenterY, f * f)));
    }

    @Override
    public final void draw(Canvas canvas) {
        float f;
        float f2 = this.currentAnimationProgress;
        Paint paint = this.paint;
        if (f2 == 1.0f) {
            Rect bounds = getBounds();
            Paint paint2 = this.customPaint;
            if (paint2 != null) {
                paint = paint2;
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
            Paint paint3 = this.customPaint;
            if (paint3 != null) {
                paint = paint3;
            }
            canvas.drawCircle(fM, fM2, f5, paint);
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
            ChatMessageCell chatMessageCell = this.parentView;
            if (chatMessageCell != null) {
                chatMessageCell.invalidate();
                if (chatMessageCell.getParent() != null) {
                    ((ViewGroup) chatMessageCell.getParent()).invalidate();
                }
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.paint.setAlpha(i);
    }

    @Override
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        calcRadius();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        calcRadius();
    }
}
