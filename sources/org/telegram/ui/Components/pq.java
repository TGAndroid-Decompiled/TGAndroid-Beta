package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class pq extends Drawable implements Drawable.Callback {
    public Drawable f30165a;
    public final Drawable f30166b;
    public final int f30167c;
    public final int d;
    public int f30168e;
    public int f30169f;
    public int h;
    public int f30170n;
    public boolean f30171r;
    public int f30172s;
    public int v;
    public boolean f30173w;
    public float f30174x;

    public pq(Drawable drawable, Drawable drawable2, int i10, int i11) {
        this.f30165a = drawable;
        this.f30166b = drawable2;
        this.f30167c = i10;
        this.d = i11;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f30174x, 0.0f);
        if (this.f30171r) {
            Rect bounds = getBounds();
            setBounds(bounds.centerX() - (getIntrinsicWidth() / 2), bounds.centerY() - (getIntrinsicHeight() / 2), (getIntrinsicWidth() / 2) + bounds.centerX(), (getIntrinsicHeight() / 2) + bounds.centerY());
        }
        Drawable drawable = this.f30165a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f30165a.draw(canvas);
        }
        Drawable drawable2 = this.f30166b;
        if (drawable2 != null) {
            boolean z4 = this.f30173w;
            int i10 = this.d;
            int i11 = this.f30167c;
            if (z4) {
                Rect bounds2 = getBounds();
                if (i11 != 0) {
                    drawable2.setBounds(bounds2.left + i11, bounds2.top + i10, bounds2.right - i11, bounds2.bottom - i10);
                } else {
                    drawable2.setBounds(bounds2);
                }
            } else if (this.f30168e != 0) {
                int centerX = (getBounds().centerX() - (this.f30168e / 2)) + i11 + this.f30172s;
                int centerY = getBounds().centerY();
                int i12 = this.f30169f;
                int i13 = (centerY - (i12 / 2)) + i10 + this.v;
                drawable2.setBounds(centerX, i13, this.f30168e + centerX, i12 + i13);
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
        return this.f30166b.getConstantState();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i10 = this.f30170n;
        if (i10 != 0) {
            return i10;
        }
        return this.f30165a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        int i10 = this.h;
        if (i10 != 0) {
            return i10;
        }
        return this.f30165a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        int i10 = this.f30170n;
        if (i10 != 0) {
            return i10;
        }
        return this.f30165a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        int i10 = this.h;
        if (i10 != 0) {
            return i10;
        }
        return this.f30165a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f30166b.getOpacity();
    }

    @Override
    public final int[] getState() {
        return this.f30166b.getState();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isStateful() {
        return this.f30166b.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f30166b.jumpToCurrentState();
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
        this.f30166b.setAlpha(i10);
        this.f30165a.setAlpha(i10);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f30166b.setColorFilter(colorFilter);
    }

    @Override
    public final boolean setState(int[] iArr) {
        this.f30166b.setState(iArr);
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public pq(Drawable drawable, Drawable drawable2) {
        this.f30165a = drawable;
        this.f30166b = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
