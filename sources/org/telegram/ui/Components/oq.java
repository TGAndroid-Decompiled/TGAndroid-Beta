package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class oq extends Drawable implements Drawable.Callback {
    public Drawable f38336a;
    public final Drawable f38337b;
    public final int f38338c;
    public final int d;
    public int f38339e;
    public int f38340f;
    public int h;
    public int f38341n;
    public boolean f38342r;
    public int f38343s;
    public int f38344w;
    public boolean f38345x;
    public float f38346y;

    public oq(Drawable drawable, Drawable drawable2, int i7, int i10) {
        this.f38336a = drawable;
        this.f38337b = drawable2;
        this.f38338c = i7;
        this.d = i10;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f38346y, 0.0f);
        if (this.f38342r) {
            Rect bounds = getBounds();
            setBounds(bounds.centerX() - (getIntrinsicWidth() / 2), bounds.centerY() - (getIntrinsicHeight() / 2), (getIntrinsicWidth() / 2) + bounds.centerX(), (getIntrinsicHeight() / 2) + bounds.centerY());
        }
        Drawable drawable = this.f38336a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f38336a.draw(canvas);
        }
        Drawable drawable2 = this.f38337b;
        if (drawable2 != null) {
            boolean z10 = this.f38345x;
            int i7 = this.d;
            int i10 = this.f38338c;
            if (z10) {
                Rect bounds2 = getBounds();
                if (i10 != 0) {
                    drawable2.setBounds(bounds2.left + i10, bounds2.top + i7, bounds2.right - i10, bounds2.bottom - i7);
                } else {
                    drawable2.setBounds(bounds2);
                }
            } else if (this.f38339e != 0) {
                int centerX = (getBounds().centerX() - (this.f38339e / 2)) + i10 + this.f38343s;
                int centerY = getBounds().centerY();
                int i11 = this.f38340f;
                int i12 = (centerY - (i11 / 2)) + i7 + this.f38344w;
                drawable2.setBounds(centerX, i12, this.f38339e + centerX, i11 + i12);
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
        return this.f38337b.getConstantState();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i7 = this.f38341n;
        if (i7 != 0) {
            return i7;
        }
        return this.f38336a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        int i7 = this.h;
        if (i7 != 0) {
            return i7;
        }
        return this.f38336a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        int i7 = this.f38341n;
        if (i7 != 0) {
            return i7;
        }
        return this.f38336a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        int i7 = this.h;
        if (i7 != 0) {
            return i7;
        }
        return this.f38336a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f38337b.getOpacity();
    }

    @Override
    public final int[] getState() {
        return this.f38337b.getState();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isStateful() {
        return this.f38337b.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f38337b.jumpToCurrentState();
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
        this.f38337b.setAlpha(i7);
        this.f38336a.setAlpha(i7);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f38337b.setColorFilter(colorFilter);
    }

    @Override
    public final boolean setState(int[] iArr) {
        this.f38337b.setState(iArr);
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public oq(Drawable drawable, Drawable drawable2) {
        this.f38336a = drawable;
        this.f38337b = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
