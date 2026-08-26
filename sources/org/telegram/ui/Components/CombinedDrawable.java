package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import com.google.android.gms.internal.mlkit_vision_common.zzkn;

public class CombinedDrawable extends Drawable implements Drawable.Callback {
    private int backHeight;
    private int backWidth;
    private Drawable background;
    private boolean both;
    private boolean center;
    private boolean fullSize;
    private Drawable icon;
    private int iconHeight;
    private int iconWidth;
    private int left;
    private int offsetX;
    private int offsetY;
    private int top;
    public float translateX;
    public float translateY;

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
        canvas.translate(this.translateX, this.translateY);
        if (this.center) {
            Rect bounds = getBounds();
            setBounds(bounds.centerX() - (getIntrinsicWidth() / 2), bounds.centerY() - (getIntrinsicHeight() / 2), (getIntrinsicWidth() / 2) + bounds.centerX(), (getIntrinsicHeight() / 2) + bounds.centerY());
        }
        Drawable drawable = this.background;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.background.draw(canvas);
        }
        if (this.icon != null) {
            if (this.fullSize) {
                Rect bounds2 = getBounds();
                int i = this.left;
                if (i != 0) {
                    Drawable drawable2 = this.icon;
                    int i2 = bounds2.left + i;
                    int i3 = bounds2.top;
                    int i4 = this.top;
                    drawable2.setBounds(i2, i3 + i4, bounds2.right - i, bounds2.bottom - i4);
                } else {
                    this.icon.setBounds(bounds2);
                }
            } else if (this.iconWidth != 0) {
                int iCenterX = (getBounds().centerX() - (this.iconWidth / 2)) + this.left + this.offsetX;
                int iCenterY = getBounds().centerY();
                int i5 = this.iconHeight;
                int i6 = (iCenterY - (i5 / 2)) + this.top + this.offsetY;
                this.icon.setBounds(iCenterX, i6, this.iconWidth + iCenterX, i5 + i6);
            } else {
                int iM = zzkn.m(getBounds().centerX(), this.icon) + this.left;
                int iM2 = zzkm.m(getBounds().centerY(), this.icon) + this.top;
                Drawable drawable3 = this.icon;
                drawable3.setBounds(iM, iM2, drawable3.getIntrinsicWidth() + iM, this.icon.getIntrinsicHeight() + iM2);
            }
            this.icon.draw(canvas);
        }
        canvas.restore();
    }

    public Drawable getBackground() {
        return this.background;
    }

    public Drawable getBackgroundDrawable() {
        return this.background;
    }

    @Override
    public Drawable.ConstantState getConstantState() {
        return this.icon.getConstantState();
    }

    public Drawable getIcon() {
        return this.icon;
    }

    @Override
    public int getIntrinsicHeight() {
        int i = this.backHeight;
        return i != 0 ? i : this.background.getIntrinsicHeight();
    }

    @Override
    public int getIntrinsicWidth() {
        int i = this.backWidth;
        return i != 0 ? i : this.background.getIntrinsicWidth();
    }

    @Override
    public int getMinimumHeight() {
        int i = this.backHeight;
        return i != 0 ? i : this.background.getMinimumHeight();
    }

    @Override
    public int getMinimumWidth() {
        int i = this.backWidth;
        return i != 0 ? i : this.background.getMinimumWidth();
    }

    @Override
    public int getOpacity() {
        return this.icon.getOpacity();
    }

    @Override
    public int[] getState() {
        return this.icon.getState();
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public boolean isStateful() {
        return this.icon.isStateful();
    }

    @Override
    public void jumpToCurrentState() {
        this.icon.jumpToCurrentState();
    }

    @Override
    public boolean onStateChange(int[] iArr) {
        return true;
    }

    @Override
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override
    public void setAlpha(int i) {
        this.icon.setAlpha(i);
        this.background.setAlpha(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.background = drawable;
        invalidateSelf();
    }

    public void setCenter(boolean z) {
        this.center = z;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.icon.setColorFilter(colorFilter);
        if (this.both) {
            this.background.setColorFilter(colorFilter);
        }
    }

    public void setCustomSize(int i, int i2) {
        this.backWidth = i;
        this.backHeight = i2;
    }

    public void setFullsize(boolean z) {
        this.fullSize = z;
    }

    public void setIconDrawable(Drawable drawable) {
        this.icon = drawable;
        invalidateSelf();
    }

    public void setIconOffset(int i, int i2) {
        this.offsetX = i;
        this.offsetY = i2;
    }

    public void setIconSize(int i, int i2) {
        this.iconWidth = i;
        this.iconHeight = i2;
    }

    @Override
    public boolean setState(int[] iArr) {
        this.icon.setState(iArr);
        return true;
    }

    @Override
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public CombinedDrawable(Context context, int i, int i2) {
        this.background = context.getResources().getDrawable(i);
        Drawable drawable = context.getResources().getDrawable(i2);
        this.icon = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        this.both = true;
    }

    public CombinedDrawable(Drawable drawable, Drawable drawable2) {
        this.background = drawable;
        this.icon = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
