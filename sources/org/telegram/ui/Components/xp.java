package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class xp extends Drawable implements Drawable.Callback {
    public Drawable f40296a;
    public final Drawable f40297b;
    public final int f40298c;
    public final int d;
    public int f40299e;
    public int f40300f;
    public int h;
    public int f40301n;
    public boolean f40302r;
    public int f40303s;
    public int f40304w;
    public boolean f40305x;
    public float f40306y;

    public xp(Drawable drawable, Drawable drawable2, int i7, int i10) {
        this.f40296a = drawable;
        this.f40297b = drawable2;
        this.f40298c = i7;
        this.d = i10;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f40306y, 0.0f);
        if (this.f40302r) {
            Rect bounds = getBounds();
            setBounds(bounds.centerX() - (getIntrinsicWidth() / 2), bounds.centerY() - (getIntrinsicHeight() / 2), (getIntrinsicWidth() / 2) + bounds.centerX(), (getIntrinsicHeight() / 2) + bounds.centerY());
        }
        Drawable drawable = this.f40296a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f40296a.draw(canvas);
        }
        Drawable drawable2 = this.f40297b;
        if (drawable2 != null) {
            boolean z9 = this.f40305x;
            int i7 = this.d;
            int i10 = this.f40298c;
            if (z9) {
                Rect bounds2 = getBounds();
                if (i10 != 0) {
                    drawable2.setBounds(bounds2.left + i10, bounds2.top + i7, bounds2.right - i10, bounds2.bottom - i7);
                } else {
                    drawable2.setBounds(bounds2);
                }
            } else if (this.f40299e != 0) {
                int centerX = (getBounds().centerX() - (this.f40299e / 2)) + i10 + this.f40303s;
                int centerY = getBounds().centerY();
                int i11 = this.f40300f;
                int i12 = (centerY - (i11 / 2)) + i7 + this.f40304w;
                drawable2.setBounds(centerX, i12, this.f40299e + centerX, i11 + i12);
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
        return this.f40297b.getConstantState();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i7 = this.f40301n;
        if (i7 != 0) {
            return i7;
        }
        return this.f40296a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        int i7 = this.h;
        if (i7 != 0) {
            return i7;
        }
        return this.f40296a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        int i7 = this.f40301n;
        if (i7 != 0) {
            return i7;
        }
        return this.f40296a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        int i7 = this.h;
        if (i7 != 0) {
            return i7;
        }
        return this.f40296a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f40297b.getOpacity();
    }

    @Override
    public final int[] getState() {
        return this.f40297b.getState();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isStateful() {
        return this.f40297b.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f40297b.jumpToCurrentState();
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
        this.f40297b.setAlpha(i7);
        this.f40296a.setAlpha(i7);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f40297b.setColorFilter(colorFilter);
    }

    @Override
    public final boolean setState(int[] iArr) {
        this.f40297b.setState(iArr);
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public xp(Drawable drawable, Drawable drawable2) {
        this.f40296a = drawable;
        this.f40297b = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
