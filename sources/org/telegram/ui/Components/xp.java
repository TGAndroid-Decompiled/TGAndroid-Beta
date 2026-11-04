package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class xp extends Drawable implements Drawable.Callback {
    public Drawable f40438a;
    public final Drawable f40439b;
    public final int f40440c;
    public final int d;
    public int f40441e;
    public int f40442f;
    public int h;
    public int f40443n;
    public boolean f40444r;
    public int f40445s;
    public int f40446w;
    public boolean f40447x;
    public float f40448y;

    public xp(Drawable drawable, Drawable drawable2, int i3, int i10) {
        this.f40438a = drawable;
        this.f40439b = drawable2;
        this.f40440c = i3;
        this.d = i10;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f40448y, 0.0f);
        if (this.f40444r) {
            Rect bounds = getBounds();
            setBounds(bounds.centerX() - (getIntrinsicWidth() / 2), bounds.centerY() - (getIntrinsicHeight() / 2), (getIntrinsicWidth() / 2) + bounds.centerX(), (getIntrinsicHeight() / 2) + bounds.centerY());
        }
        Drawable drawable = this.f40438a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f40438a.draw(canvas);
        }
        Drawable drawable2 = this.f40439b;
        if (drawable2 != null) {
            boolean z10 = this.f40447x;
            int i3 = this.d;
            int i10 = this.f40440c;
            if (z10) {
                Rect bounds2 = getBounds();
                if (i10 != 0) {
                    drawable2.setBounds(bounds2.left + i10, bounds2.top + i3, bounds2.right - i10, bounds2.bottom - i3);
                } else {
                    drawable2.setBounds(bounds2);
                }
            } else if (this.f40441e != 0) {
                int centerX = (getBounds().centerX() - (this.f40441e / 2)) + i10 + this.f40445s;
                int centerY = getBounds().centerY();
                int i11 = this.f40442f;
                int i12 = (centerY - (i11 / 2)) + i3 + this.f40446w;
                drawable2.setBounds(centerX, i12, this.f40441e + centerX, i11 + i12);
            } else {
                int centerX2 = (getBounds().centerX() - (drawable2.getIntrinsicWidth() / 2)) + i10;
                int centerY2 = (getBounds().centerY() - (drawable2.getIntrinsicHeight() / 2)) + i3;
                drawable2.setBounds(centerX2, centerY2, drawable2.getIntrinsicWidth() + centerX2, drawable2.getIntrinsicHeight() + centerY2);
            }
            drawable2.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        return this.f40439b.getConstantState();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i3 = this.f40443n;
        if (i3 != 0) {
            return i3;
        }
        return this.f40438a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        int i3 = this.h;
        if (i3 != 0) {
            return i3;
        }
        return this.f40438a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        int i3 = this.f40443n;
        if (i3 != 0) {
            return i3;
        }
        return this.f40438a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        int i3 = this.h;
        if (i3 != 0) {
            return i3;
        }
        return this.f40438a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f40439b.getOpacity();
    }

    @Override
    public final int[] getState() {
        return this.f40439b.getState();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isStateful() {
        return this.f40439b.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f40439b.jumpToCurrentState();
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
    public final void setAlpha(int i3) {
        this.f40439b.setAlpha(i3);
        this.f40438a.setAlpha(i3);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f40439b.setColorFilter(colorFilter);
    }

    @Override
    public final boolean setState(int[] iArr) {
        this.f40439b.setState(iArr);
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public xp(Drawable drawable, Drawable drawable2) {
        this.f40438a = drawable;
        this.f40439b = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
