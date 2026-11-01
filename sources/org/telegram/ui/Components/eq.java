package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class eq extends Drawable implements Drawable.Callback {
    public Drawable f25901a;
    public final Drawable f25902b;
    public final int f25903c;
    public final int d;
    public int e;
    public int f25904f;
    public int h;
    public int f25905n;
    public boolean f25906r;
    public int f25907s;
    public int f25908w;
    public boolean f25909x;
    public float f25910y;

    public eq(Drawable drawable, Drawable drawable2, int i10, int i11) {
        this.f25901a = drawable;
        this.f25902b = drawable2;
        this.f25903c = i10;
        this.d = i11;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f25910y, 0.0f);
        if (this.f25906r) {
            Rect bounds = getBounds();
            setBounds(bounds.centerX() - (getIntrinsicWidth() / 2), bounds.centerY() - (getIntrinsicHeight() / 2), (getIntrinsicWidth() / 2) + bounds.centerX(), (getIntrinsicHeight() / 2) + bounds.centerY());
        }
        Drawable drawable = this.f25901a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f25901a.draw(canvas);
        }
        Drawable drawable2 = this.f25902b;
        if (drawable2 != null) {
            boolean z10 = this.f25909x;
            int i10 = this.d;
            int i11 = this.f25903c;
            if (z10) {
                Rect bounds2 = getBounds();
                if (i11 != 0) {
                    drawable2.setBounds(bounds2.left + i11, bounds2.top + i10, bounds2.right - i11, bounds2.bottom - i10);
                } else {
                    drawable2.setBounds(bounds2);
                }
            } else if (this.e != 0) {
                int centerX = (getBounds().centerX() - (this.e / 2)) + i11 + this.f25907s;
                int centerY = getBounds().centerY();
                int i12 = this.f25904f;
                int i13 = (centerY - (i12 / 2)) + i10 + this.f25908w;
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
        return this.f25902b.getConstantState();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i10 = this.f25905n;
        if (i10 != 0) {
            return i10;
        }
        return this.f25901a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        int i10 = this.h;
        if (i10 != 0) {
            return i10;
        }
        return this.f25901a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        int i10 = this.f25905n;
        if (i10 != 0) {
            return i10;
        }
        return this.f25901a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        int i10 = this.h;
        if (i10 != 0) {
            return i10;
        }
        return this.f25901a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f25902b.getOpacity();
    }

    @Override
    public final int[] getState() {
        return this.f25902b.getState();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isStateful() {
        return this.f25902b.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f25902b.jumpToCurrentState();
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        return true;
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f25902b.setAlpha(i10);
        this.f25901a.setAlpha(i10);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f25902b.setColorFilter(colorFilter);
    }

    @Override
    public final boolean setState(int[] iArr) {
        this.f25902b.setState(iArr);
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public eq(Drawable drawable, Drawable drawable2) {
        this.f25901a = drawable;
        this.f25902b = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
