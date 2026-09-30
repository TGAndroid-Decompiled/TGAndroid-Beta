package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class rq extends Drawable implements Drawable.Callback {
    public Drawable f28026a;
    public final Drawable f28027b;
    public final int f28028c;
    public final int d;
    public int e;
    public int f28029f;
    public int h;
    public int f28030n;
    public boolean f28031r;
    public int f28032s;
    public int v;
    public boolean f28033w;
    public float f28034x;

    public rq(Drawable drawable, Drawable drawable2, int i10, int i11) {
        this.f28026a = drawable;
        this.f28027b = drawable2;
        this.f28028c = i10;
        this.d = i11;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f28034x, 0.0f);
        if (this.f28031r) {
            Rect bounds = getBounds();
            setBounds(bounds.centerX() - (getIntrinsicWidth() / 2), bounds.centerY() - (getIntrinsicHeight() / 2), (getIntrinsicWidth() / 2) + bounds.centerX(), (getIntrinsicHeight() / 2) + bounds.centerY());
        }
        Drawable drawable = this.f28026a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f28026a.draw(canvas);
        }
        Drawable drawable2 = this.f28027b;
        if (drawable2 != null) {
            boolean z10 = this.f28033w;
            int i10 = this.d;
            int i11 = this.f28028c;
            if (z10) {
                Rect bounds2 = getBounds();
                if (i11 != 0) {
                    drawable2.setBounds(bounds2.left + i11, bounds2.top + i10, bounds2.right - i11, bounds2.bottom - i10);
                } else {
                    drawable2.setBounds(bounds2);
                }
            } else if (this.e != 0) {
                int centerX = (getBounds().centerX() - (this.e / 2)) + i11 + this.f28032s;
                int centerY = getBounds().centerY();
                int i12 = this.f28029f;
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
        return this.f28027b.getConstantState();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i10 = this.f28030n;
        if (i10 != 0) {
            return i10;
        }
        return this.f28026a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        int i10 = this.h;
        if (i10 != 0) {
            return i10;
        }
        return this.f28026a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        int i10 = this.f28030n;
        if (i10 != 0) {
            return i10;
        }
        return this.f28026a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        int i10 = this.h;
        if (i10 != 0) {
            return i10;
        }
        return this.f28026a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f28027b.getOpacity();
    }

    @Override
    public final int[] getState() {
        return this.f28027b.getState();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isStateful() {
        return this.f28027b.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f28027b.jumpToCurrentState();
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
        this.f28027b.setAlpha(i10);
        this.f28026a.setAlpha(i10);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f28027b.setColorFilter(colorFilter);
    }

    @Override
    public final boolean setState(int[] iArr) {
        this.f28027b.setState(iArr);
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public rq(Drawable drawable, Drawable drawable2) {
        this.f28026a = drawable;
        this.f28027b = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
