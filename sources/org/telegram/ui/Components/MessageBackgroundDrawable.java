package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
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
        android.graphics.Rect bounds = getBounds();
        float centerX = bounds.centerX();
        float f = bounds.left - centerX;
        float centerY = bounds.top - bounds.centerY();
        this.finalRadius = (float) Math.ceil(Math.sqrt((f * f) + (centerY * centerY)));
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
    public void setBounds(android.graphics.Rect rect) {
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
    public void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.MessageBackgroundDrawable.draw(android.graphics.Canvas):void");
    }
}
