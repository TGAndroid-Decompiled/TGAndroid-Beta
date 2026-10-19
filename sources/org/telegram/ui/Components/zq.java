package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class zq extends Drawable implements Drawable.Callback {
    public Drawable f33016a;
    public final Drawable f33017b;
    public final int f33018c;
    public final int d;
    public int e;
    public int f33019f;
    public int h;
    public int f33020n;
    public boolean f33021r;
    public int f33022s;
    public int v;
    public boolean f33023w;
    public float f33024x;

    public zq(Drawable drawable, Drawable drawable2, int i10, int i11) {
        this.f33016a = drawable;
        this.f33017b = drawable2;
        this.f33018c = i10;
        this.d = i11;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f33024x, 0.0f);
        if (this.f33021r) {
            Rect bounds = getBounds();
            setBounds(bounds.centerX() - (getIntrinsicWidth() / 2), bounds.centerY() - (getIntrinsicHeight() / 2), (getIntrinsicWidth() / 2) + bounds.centerX(), (getIntrinsicHeight() / 2) + bounds.centerY());
        }
        Drawable drawable = this.f33016a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f33016a.draw(canvas);
        }
        Drawable drawable2 = this.f33017b;
        if (drawable2 != null) {
            boolean z10 = this.f33023w;
            int i10 = this.d;
            int i11 = this.f33018c;
            if (z10) {
                Rect bounds2 = getBounds();
                if (i11 != 0) {
                    drawable2.setBounds(bounds2.left + i11, bounds2.top + i10, bounds2.right - i11, bounds2.bottom - i10);
                } else {
                    drawable2.setBounds(bounds2);
                }
            } else if (this.e != 0) {
                int centerX = (getBounds().centerX() - (this.e / 2)) + i11 + this.f33022s;
                int centerY = getBounds().centerY();
                int i12 = this.f33019f;
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
        return this.f33017b.getConstantState();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i10 = this.f33020n;
        if (i10 != 0) {
            return i10;
        }
        return this.f33016a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        int i10 = this.h;
        if (i10 != 0) {
            return i10;
        }
        return this.f33016a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        int i10 = this.f33020n;
        if (i10 != 0) {
            return i10;
        }
        return this.f33016a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        int i10 = this.h;
        if (i10 != 0) {
            return i10;
        }
        return this.f33016a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f33017b.getOpacity();
    }

    @Override
    public final int[] getState() {
        return this.f33017b.getState();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isStateful() {
        return this.f33017b.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f33017b.jumpToCurrentState();
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
        this.f33017b.setAlpha(i10);
        this.f33016a.setAlpha(i10);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f33017b.setColorFilter(colorFilter);
    }

    @Override
    public final boolean setState(int[] iArr) {
        this.f33017b.setState(iArr);
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public zq(Drawable drawable, Drawable drawable2) {
        this.f33016a = drawable;
        this.f33017b = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
