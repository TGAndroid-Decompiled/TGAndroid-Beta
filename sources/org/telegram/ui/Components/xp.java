package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class xp extends Drawable implements Drawable.Callback {
    public Drawable f40444a;
    public final Drawable f40445b;
    public final int f40446c;
    public final int d;
    public int f40447e;
    public int f40448f;
    public int h;
    public int f40449n;
    public boolean f40450r;
    public int f40451s;
    public int f40452w;
    public boolean f40453x;
    public float f40454y;

    public xp(Drawable drawable, Drawable drawable2, int i7, int i10) {
        this.f40444a = drawable;
        this.f40445b = drawable2;
        this.f40446c = i7;
        this.d = i10;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f40454y, 0.0f);
        if (this.f40450r) {
            Rect bounds = getBounds();
            setBounds(bounds.centerX() - (getIntrinsicWidth() / 2), bounds.centerY() - (getIntrinsicHeight() / 2), (getIntrinsicWidth() / 2) + bounds.centerX(), (getIntrinsicHeight() / 2) + bounds.centerY());
        }
        Drawable drawable = this.f40444a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f40444a.draw(canvas);
        }
        Drawable drawable2 = this.f40445b;
        if (drawable2 != null) {
            boolean z9 = this.f40453x;
            int i7 = this.d;
            int i10 = this.f40446c;
            if (z9) {
                Rect bounds2 = getBounds();
                if (i10 != 0) {
                    drawable2.setBounds(bounds2.left + i10, bounds2.top + i7, bounds2.right - i10, bounds2.bottom - i7);
                } else {
                    drawable2.setBounds(bounds2);
                }
            } else if (this.f40447e != 0) {
                int centerX = (getBounds().centerX() - (this.f40447e / 2)) + i10 + this.f40451s;
                int centerY = getBounds().centerY();
                int i11 = this.f40448f;
                int i12 = (centerY - (i11 / 2)) + i7 + this.f40452w;
                drawable2.setBounds(centerX, i12, this.f40447e + centerX, i11 + i12);
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
        return this.f40445b.getConstantState();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i7 = this.f40449n;
        if (i7 != 0) {
            return i7;
        }
        return this.f40444a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        int i7 = this.h;
        if (i7 != 0) {
            return i7;
        }
        return this.f40444a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        int i7 = this.f40449n;
        if (i7 != 0) {
            return i7;
        }
        return this.f40444a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        int i7 = this.h;
        if (i7 != 0) {
            return i7;
        }
        return this.f40444a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f40445b.getOpacity();
    }

    @Override
    public final int[] getState() {
        return this.f40445b.getState();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isStateful() {
        return this.f40445b.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f40445b.jumpToCurrentState();
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
        this.f40445b.setAlpha(i7);
        this.f40444a.setAlpha(i7);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f40445b.setColorFilter(colorFilter);
    }

    @Override
    public final boolean setState(int[] iArr) {
        this.f40445b.setState(iArr);
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public xp(Drawable drawable, Drawable drawable2) {
        this.f40444a = drawable;
        this.f40445b = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
