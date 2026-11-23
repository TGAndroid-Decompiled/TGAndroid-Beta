package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class lq extends Drawable implements Drawable.Callback {
    public Drawable f37195a;
    public final Drawable f37196b;
    public final int f37197c;
    public final int d;
    public int f37198e;
    public int f37199f;
    public int h;
    public int f37200n;
    public boolean f37201r;
    public int f37202s;
    public int f37203w;
    public boolean f37204x;
    public float f37205y;

    public lq(Drawable drawable, Drawable drawable2, int i7, int i10) {
        this.f37195a = drawable;
        this.f37196b = drawable2;
        this.f37197c = i7;
        this.d = i10;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f37205y, 0.0f);
        if (this.f37201r) {
            Rect bounds = getBounds();
            setBounds(bounds.centerX() - (getIntrinsicWidth() / 2), bounds.centerY() - (getIntrinsicHeight() / 2), (getIntrinsicWidth() / 2) + bounds.centerX(), (getIntrinsicHeight() / 2) + bounds.centerY());
        }
        Drawable drawable = this.f37195a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f37195a.draw(canvas);
        }
        Drawable drawable2 = this.f37196b;
        if (drawable2 != null) {
            boolean z10 = this.f37204x;
            int i7 = this.d;
            int i10 = this.f37197c;
            if (z10) {
                Rect bounds2 = getBounds();
                if (i10 != 0) {
                    drawable2.setBounds(bounds2.left + i10, bounds2.top + i7, bounds2.right - i10, bounds2.bottom - i7);
                } else {
                    drawable2.setBounds(bounds2);
                }
            } else if (this.f37198e != 0) {
                int centerX = (getBounds().centerX() - (this.f37198e / 2)) + i10 + this.f37202s;
                int centerY = getBounds().centerY();
                int i11 = this.f37199f;
                int i12 = (centerY - (i11 / 2)) + i7 + this.f37203w;
                drawable2.setBounds(centerX, i12, this.f37198e + centerX, i11 + i12);
            } else {
                int centerX2 = (getBounds().centerX() - (drawable2.getIntrinsicWidth() / 2)) + i10;
                int centerY2 = (getBounds().centerY() - (drawable2.getIntrinsicHeight() / 2)) + i7;
                drawable2.setBounds(centerX2, centerY2, drawable2.getIntrinsicWidth() + centerX2, drawable2.getIntrinsicHeight() + centerY2);
            }
            drawable2.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        return this.f37196b.getConstantState();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i7 = this.f37200n;
        if (i7 != 0) {
            return i7;
        }
        return this.f37195a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        int i7 = this.h;
        if (i7 != 0) {
            return i7;
        }
        return this.f37195a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        int i7 = this.f37200n;
        if (i7 != 0) {
            return i7;
        }
        return this.f37195a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        int i7 = this.h;
        if (i7 != 0) {
            return i7;
        }
        return this.f37195a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f37196b.getOpacity();
    }

    @Override
    public final int[] getState() {
        return this.f37196b.getState();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isStateful() {
        return this.f37196b.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f37196b.jumpToCurrentState();
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        return true;
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override
    public final void setAlpha(int i7) {
        this.f37196b.setAlpha(i7);
        this.f37195a.setAlpha(i7);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f37196b.setColorFilter(colorFilter);
    }

    @Override
    public final boolean setState(int[] iArr) {
        this.f37196b.setState(iArr);
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public lq(Drawable drawable, Drawable drawable2) {
        this.f37195a = drawable;
        this.f37196b = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
