package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class fq extends Drawable implements Drawable.Callback {
    public Drawable f34673a;
    public final Drawable f34674b;
    public final int f34675c;
    public final int d;
    public int f34676e;
    public int f34677f;
    public int h;
    public int f34678n;
    public boolean f34679r;
    public int f34680s;
    public int f34681w;
    public boolean f34682x;
    public float f34683y;

    public fq(Drawable drawable, Drawable drawable2, int i7, int i10) {
        this.f34673a = drawable;
        this.f34674b = drawable2;
        this.f34675c = i7;
        this.d = i10;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f34683y, 0.0f);
        if (this.f34679r) {
            Rect bounds = getBounds();
            setBounds(bounds.centerX() - (getIntrinsicWidth() / 2), bounds.centerY() - (getIntrinsicHeight() / 2), (getIntrinsicWidth() / 2) + bounds.centerX(), (getIntrinsicHeight() / 2) + bounds.centerY());
        }
        Drawable drawable = this.f34673a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f34673a.draw(canvas);
        }
        Drawable drawable2 = this.f34674b;
        if (drawable2 != null) {
            boolean z10 = this.f34682x;
            int i7 = this.d;
            int i10 = this.f34675c;
            if (z10) {
                Rect bounds2 = getBounds();
                if (i10 != 0) {
                    drawable2.setBounds(bounds2.left + i10, bounds2.top + i7, bounds2.right - i10, bounds2.bottom - i7);
                } else {
                    drawable2.setBounds(bounds2);
                }
            } else if (this.f34676e != 0) {
                int centerX = (getBounds().centerX() - (this.f34676e / 2)) + i10 + this.f34680s;
                int centerY = getBounds().centerY();
                int i11 = this.f34677f;
                int i12 = (centerY - (i11 / 2)) + i7 + this.f34681w;
                drawable2.setBounds(centerX, i12, this.f34676e + centerX, i11 + i12);
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
        return this.f34674b.getConstantState();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i7 = this.f34678n;
        if (i7 != 0) {
            return i7;
        }
        return this.f34673a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        int i7 = this.h;
        if (i7 != 0) {
            return i7;
        }
        return this.f34673a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        int i7 = this.f34678n;
        if (i7 != 0) {
            return i7;
        }
        return this.f34673a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        int i7 = this.h;
        if (i7 != 0) {
            return i7;
        }
        return this.f34673a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f34674b.getOpacity();
    }

    @Override
    public final int[] getState() {
        return this.f34674b.getState();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isStateful() {
        return this.f34674b.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f34674b.jumpToCurrentState();
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
        this.f34674b.setAlpha(i7);
        this.f34673a.setAlpha(i7);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f34674b.setColorFilter(colorFilter);
    }

    @Override
    public final boolean setState(int[] iArr) {
        this.f34674b.setState(iArr);
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public fq(Drawable drawable, Drawable drawable2) {
        this.f34673a = drawable;
        this.f34674b = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
