package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class pq extends Drawable implements Drawable.Callback {
    public Drawable f27118a;
    public final Drawable f27119b;
    public final int f27120c;
    public final int d;
    public int e;
    public int f27121f;
    public int h;
    public int f27122n;
    public boolean f27123r;
    public int f27124s;
    public int v;
    public boolean f27125w;
    public float f27126x;

    public pq(Drawable drawable, Drawable drawable2, int i10, int i11) {
        this.f27118a = drawable;
        this.f27119b = drawable2;
        this.f27120c = i10;
        this.d = i11;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f27126x, 0.0f);
        if (this.f27123r) {
            Rect bounds = getBounds();
            setBounds(bounds.centerX() - (getIntrinsicWidth() / 2), bounds.centerY() - (getIntrinsicHeight() / 2), (getIntrinsicWidth() / 2) + bounds.centerX(), (getIntrinsicHeight() / 2) + bounds.centerY());
        }
        Drawable drawable = this.f27118a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f27118a.draw(canvas);
        }
        Drawable drawable2 = this.f27119b;
        if (drawable2 != null) {
            boolean z10 = this.f27125w;
            int i10 = this.d;
            int i11 = this.f27120c;
            if (z10) {
                Rect bounds2 = getBounds();
                if (i11 != 0) {
                    drawable2.setBounds(bounds2.left + i11, bounds2.top + i10, bounds2.right - i11, bounds2.bottom - i10);
                } else {
                    drawable2.setBounds(bounds2);
                }
            } else if (this.e != 0) {
                int centerX = (getBounds().centerX() - (this.e / 2)) + i11 + this.f27124s;
                int centerY = getBounds().centerY();
                int i12 = this.f27121f;
                int i13 = (centerY - (i12 / 2)) + i10 + this.v;
                drawable2.setBounds(centerX, i13, this.e + centerX, i12 + i13);
            } else {
                int centerX2 = (getBounds().centerX() - (drawable2.getIntrinsicWidth() / 2)) + i11;
                int centerY2 = (getBounds().centerY() - (drawable2.getIntrinsicHeight() / 2)) + i10;
                drawable2.setBounds(centerX2, centerY2, drawable2.getIntrinsicWidth() + centerX2, drawable2.getIntrinsicHeight() + centerY2);
            }
            drawable2.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        return this.f27119b.getConstantState();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i10 = this.f27122n;
        if (i10 != 0) {
            return i10;
        }
        return this.f27118a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        int i10 = this.h;
        if (i10 != 0) {
            return i10;
        }
        return this.f27118a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        int i10 = this.f27122n;
        if (i10 != 0) {
            return i10;
        }
        return this.f27118a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        int i10 = this.h;
        if (i10 != 0) {
            return i10;
        }
        return this.f27118a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f27119b.getOpacity();
    }

    @Override
    public final int[] getState() {
        return this.f27119b.getState();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isStateful() {
        return this.f27119b.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f27119b.jumpToCurrentState();
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
    public final void setAlpha(int i10) {
        this.f27119b.setAlpha(i10);
        this.f27118a.setAlpha(i10);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f27119b.setColorFilter(colorFilter);
    }

    @Override
    public final boolean setState(int[] iArr) {
        this.f27119b.setState(iArr);
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public pq(Drawable drawable, Drawable drawable2) {
        this.f27118a = drawable;
        this.f27119b = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
