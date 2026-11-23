package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class oq extends Drawable implements Drawable.Callback {
    public Drawable f38330a;
    public final Drawable f38331b;
    public final int f38332c;
    public final int d;
    public int f38333e;
    public int f38334f;
    public int h;
    public int f38335n;
    public boolean f38336r;
    public int f38337s;
    public int f38338w;
    public boolean f38339x;
    public float f38340y;

    public oq(Drawable drawable, Drawable drawable2, int i7, int i10) {
        this.f38330a = drawable;
        this.f38331b = drawable2;
        this.f38332c = i7;
        this.d = i10;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f38340y, 0.0f);
        if (this.f38336r) {
            Rect bounds = getBounds();
            setBounds(bounds.centerX() - (getIntrinsicWidth() / 2), bounds.centerY() - (getIntrinsicHeight() / 2), (getIntrinsicWidth() / 2) + bounds.centerX(), (getIntrinsicHeight() / 2) + bounds.centerY());
        }
        Drawable drawable = this.f38330a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f38330a.draw(canvas);
        }
        Drawable drawable2 = this.f38331b;
        if (drawable2 != null) {
            boolean z10 = this.f38339x;
            int i7 = this.d;
            int i10 = this.f38332c;
            if (z10) {
                Rect bounds2 = getBounds();
                if (i10 != 0) {
                    drawable2.setBounds(bounds2.left + i10, bounds2.top + i7, bounds2.right - i10, bounds2.bottom - i7);
                } else {
                    drawable2.setBounds(bounds2);
                }
            } else if (this.f38333e != 0) {
                int centerX = (getBounds().centerX() - (this.f38333e / 2)) + i10 + this.f38337s;
                int centerY = getBounds().centerY();
                int i11 = this.f38334f;
                int i12 = (centerY - (i11 / 2)) + i7 + this.f38338w;
                drawable2.setBounds(centerX, i12, this.f38333e + centerX, i11 + i12);
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
        return this.f38331b.getConstantState();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i7 = this.f38335n;
        if (i7 != 0) {
            return i7;
        }
        return this.f38330a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        int i7 = this.h;
        if (i7 != 0) {
            return i7;
        }
        return this.f38330a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        int i7 = this.f38335n;
        if (i7 != 0) {
            return i7;
        }
        return this.f38330a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        int i7 = this.h;
        if (i7 != 0) {
            return i7;
        }
        return this.f38330a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f38331b.getOpacity();
    }

    @Override
    public final int[] getState() {
        return this.f38331b.getState();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isStateful() {
        return this.f38331b.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f38331b.jumpToCurrentState();
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
        this.f38331b.setAlpha(i7);
        this.f38330a.setAlpha(i7);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f38331b.setColorFilter(colorFilter);
    }

    @Override
    public final boolean setState(int[] iArr) {
        this.f38331b.setState(iArr);
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public oq(Drawable drawable, Drawable drawable2) {
        this.f38330a = drawable;
        this.f38331b = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
