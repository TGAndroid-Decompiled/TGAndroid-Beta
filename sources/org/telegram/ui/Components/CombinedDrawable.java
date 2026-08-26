package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class CombinedDrawable extends Drawable implements Drawable.Callback {
    public int backHeight;
    public int backWidth;
    public Drawable background;
    public boolean center;
    public boolean fullSize;
    public final Drawable icon;
    public int iconHeight;
    public int iconWidth;
    public final int left;
    public int offsetX;
    public int offsetY;
    public final int top;
    public float translateX;

    public CombinedDrawable(Drawable drawable, Drawable drawable2, int i, int i2) {
        this.background = drawable;
        this.icon = drawable2;
        this.left = i;
        this.top = i2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.translateX, 0.0f);
        if (this.center) {
            Rect bounds = getBounds();
            setBounds(bounds.centerX() - (getIntrinsicWidth() / 2), bounds.centerY() - (getIntrinsicHeight() / 2), (getIntrinsicWidth() / 2) + bounds.centerX(), (getIntrinsicHeight() / 2) + bounds.centerY());
        }
        Drawable drawable = this.background;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.background.draw(canvas);
        }
        Drawable drawable2 = this.icon;
        if (drawable2 != null) {
            boolean z = this.fullSize;
            int i = this.top;
            int i2 = this.left;
            if (z) {
                Rect bounds2 = getBounds();
                if (i2 != 0) {
                    drawable2.setBounds(bounds2.left + i2, bounds2.top + i, bounds2.right - i2, bounds2.bottom - i);
                } else {
                    drawable2.setBounds(bounds2);
                }
            } else if (this.iconWidth != 0) {
                int iCenterX = (getBounds().centerX() - (this.iconWidth / 2)) + i2 + this.offsetX;
                int iCenterY = getBounds().centerY();
                int i3 = this.iconHeight;
                int i4 = (iCenterY - (i3 / 2)) + i + this.offsetY;
                drawable2.setBounds(iCenterX, i4, this.iconWidth + iCenterX, i3 + i4);
            } else {
                int iCenterX2 = (getBounds().centerX() - (drawable2.getIntrinsicWidth() / 2)) + i2;
                int iCenterY2 = (getBounds().centerY() - (drawable2.getIntrinsicHeight() / 2)) + i;
                drawable2.setBounds(iCenterX2, iCenterY2, drawable2.getIntrinsicWidth() + iCenterX2, drawable2.getIntrinsicHeight() + iCenterY2);
            }
            drawable2.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        return this.icon.getConstantState();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i = this.backHeight;
        return i != 0 ? i : this.background.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        int i = this.backWidth;
        return i != 0 ? i : this.background.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        int i = this.backHeight;
        return i != 0 ? i : this.background.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        int i = this.backWidth;
        return i != 0 ? i : this.background.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.icon.getOpacity();
    }

    @Override
    public final int[] getState() {
        return this.icon.getState();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isStateful() {
        return this.icon.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.icon.jumpToCurrentState();
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        return true;
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override
    public final void setAlpha(int i) {
        this.icon.setAlpha(i);
        this.background.setAlpha(i);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.icon.setColorFilter(colorFilter);
    }

    @Override
    public final boolean setState(int[] iArr) {
        this.icon.setState(iArr);
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public CombinedDrawable(Drawable drawable, Drawable drawable2) {
        this.background = drawable;
        this.icon = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
