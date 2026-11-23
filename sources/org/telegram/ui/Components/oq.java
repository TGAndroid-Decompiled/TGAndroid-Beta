package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class oq extends Drawable implements Drawable.Callback {
    public Drawable f38300a;
    public final Drawable f38301b;
    public final int f38302c;
    public final int d;
    public int f38303e;
    public int f38304f;
    public int h;
    public int f38305n;
    public boolean f38306r;
    public int f38307s;
    public int f38308w;
    public boolean f38309x;
    public float f38310y;

    public oq(Drawable drawable, Drawable drawable2, int i7, int i10) {
        this.f38300a = drawable;
        this.f38301b = drawable2;
        this.f38302c = i7;
        this.d = i10;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f38310y, 0.0f);
        if (this.f38306r) {
            Rect bounds = getBounds();
            setBounds(bounds.centerX() - (getIntrinsicWidth() / 2), bounds.centerY() - (getIntrinsicHeight() / 2), (getIntrinsicWidth() / 2) + bounds.centerX(), (getIntrinsicHeight() / 2) + bounds.centerY());
        }
        Drawable drawable = this.f38300a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f38300a.draw(canvas);
        }
        Drawable drawable2 = this.f38301b;
        if (drawable2 != null) {
            boolean z10 = this.f38309x;
            int i7 = this.d;
            int i10 = this.f38302c;
            if (z10) {
                Rect bounds2 = getBounds();
                if (i10 != 0) {
                    drawable2.setBounds(bounds2.left + i10, bounds2.top + i7, bounds2.right - i10, bounds2.bottom - i7);
                } else {
                    drawable2.setBounds(bounds2);
                }
            } else if (this.f38303e != 0) {
                int centerX = (getBounds().centerX() - (this.f38303e / 2)) + i10 + this.f38307s;
                int centerY = getBounds().centerY();
                int i11 = this.f38304f;
                int i12 = (centerY - (i11 / 2)) + i7 + this.f38308w;
                drawable2.setBounds(centerX, i12, this.f38303e + centerX, i11 + i12);
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
        return this.f38301b.getConstantState();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i7 = this.f38305n;
        if (i7 != 0) {
            return i7;
        }
        return this.f38300a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        int i7 = this.h;
        if (i7 != 0) {
            return i7;
        }
        return this.f38300a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        int i7 = this.f38305n;
        if (i7 != 0) {
            return i7;
        }
        return this.f38300a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        int i7 = this.h;
        if (i7 != 0) {
            return i7;
        }
        return this.f38300a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f38301b.getOpacity();
    }

    @Override
    public final int[] getState() {
        return this.f38301b.getState();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isStateful() {
        return this.f38301b.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f38301b.jumpToCurrentState();
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
        this.f38301b.setAlpha(i7);
        this.f38300a.setAlpha(i7);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f38301b.setColorFilter(colorFilter);
    }

    @Override
    public final boolean setState(int[] iArr) {
        this.f38301b.setState(iArr);
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public oq(Drawable drawable, Drawable drawable2) {
        this.f38300a = drawable;
        this.f38301b = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
