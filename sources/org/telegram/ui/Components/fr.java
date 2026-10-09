package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class fr extends Drawable implements Drawable.Callback {
    public Drawable f26463a;
    public final Drawable f26464b;
    public final int f26465c;
    public final int d;
    public int f26466e;
    public int f26467f;
    public int h;
    public int f26468n;
    public boolean f26469r;
    public int f26470s;
    public int v;
    public boolean f26471w;
    public float f26472x;

    public fr(Drawable drawable, Drawable drawable2, int i10, int i11) {
        this.f26463a = drawable;
        this.f26464b = drawable2;
        this.f26465c = i10;
        this.d = i11;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f26472x, 0.0f);
        if (this.f26469r) {
            Rect bounds = getBounds();
            setBounds(bounds.centerX() - (getIntrinsicWidth() / 2), bounds.centerY() - (getIntrinsicHeight() / 2), (getIntrinsicWidth() / 2) + bounds.centerX(), (getIntrinsicHeight() / 2) + bounds.centerY());
        }
        Drawable drawable = this.f26463a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f26463a.draw(canvas);
        }
        Drawable drawable2 = this.f26464b;
        if (drawable2 != null) {
            boolean z10 = this.f26471w;
            int i10 = this.d;
            int i11 = this.f26465c;
            if (z10) {
                Rect bounds2 = getBounds();
                if (i11 != 0) {
                    drawable2.setBounds(bounds2.left + i11, bounds2.top + i10, bounds2.right - i11, bounds2.bottom - i10);
                } else {
                    drawable2.setBounds(bounds2);
                }
            } else if (this.f26466e != 0) {
                int centerX = (getBounds().centerX() - (this.f26466e / 2)) + i11 + this.f26470s;
                int centerY = getBounds().centerY();
                int i12 = this.f26467f;
                int i13 = (centerY - (i12 / 2)) + i10 + this.v;
                drawable2.setBounds(centerX, i13, this.f26466e + centerX, i12 + i13);
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
        return this.f26464b.getConstantState();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i10 = this.f26468n;
        if (i10 != 0) {
            return i10;
        }
        return this.f26463a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        int i10 = this.h;
        if (i10 != 0) {
            return i10;
        }
        return this.f26463a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        int i10 = this.f26468n;
        if (i10 != 0) {
            return i10;
        }
        return this.f26463a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        int i10 = this.h;
        if (i10 != 0) {
            return i10;
        }
        return this.f26463a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f26464b.getOpacity();
    }

    @Override
    public final int[] getState() {
        return this.f26464b.getState();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isStateful() {
        return this.f26464b.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f26464b.jumpToCurrentState();
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
        this.f26464b.setAlpha(i10);
        this.f26463a.setAlpha(i10);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f26464b.setColorFilter(colorFilter);
    }

    @Override
    public final boolean setState(int[] iArr) {
        this.f26464b.setState(iArr);
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public fr(Drawable drawable, Drawable drawable2) {
        this.f26463a = drawable;
        this.f26464b = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
