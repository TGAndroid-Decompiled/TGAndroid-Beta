package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class fr extends Drawable implements Drawable.Callback {
    public Drawable f26544a;
    public final Drawable f26545b;
    public final int f26546c;
    public final int d;
    public int f26547e;
    public int f26548f;
    public int h;
    public int f26549n;
    public boolean f26550r;
    public int f26551s;
    public int v;
    public boolean f26552w;
    public float f26553x;

    public fr(Drawable drawable, Drawable drawable2, int i10, int i11) {
        this.f26544a = drawable;
        this.f26545b = drawable2;
        this.f26546c = i10;
        this.d = i11;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f26553x, 0.0f);
        if (this.f26550r) {
            Rect bounds = getBounds();
            setBounds(bounds.centerX() - (getIntrinsicWidth() / 2), bounds.centerY() - (getIntrinsicHeight() / 2), (getIntrinsicWidth() / 2) + bounds.centerX(), (getIntrinsicHeight() / 2) + bounds.centerY());
        }
        Drawable drawable = this.f26544a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f26544a.draw(canvas);
        }
        Drawable drawable2 = this.f26545b;
        if (drawable2 != null) {
            boolean z10 = this.f26552w;
            int i10 = this.d;
            int i11 = this.f26546c;
            if (z10) {
                Rect bounds2 = getBounds();
                if (i11 != 0) {
                    drawable2.setBounds(bounds2.left + i11, bounds2.top + i10, bounds2.right - i11, bounds2.bottom - i10);
                } else {
                    drawable2.setBounds(bounds2);
                }
            } else if (this.f26547e != 0) {
                int centerX = (getBounds().centerX() - (this.f26547e / 2)) + i11 + this.f26551s;
                int centerY = getBounds().centerY();
                int i12 = this.f26548f;
                int i13 = (centerY - (i12 / 2)) + i10 + this.v;
                drawable2.setBounds(centerX, i13, this.f26547e + centerX, i12 + i13);
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
        return this.f26545b.getConstantState();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i10 = this.f26549n;
        if (i10 != 0) {
            return i10;
        }
        return this.f26544a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        int i10 = this.h;
        if (i10 != 0) {
            return i10;
        }
        return this.f26544a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        int i10 = this.f26549n;
        if (i10 != 0) {
            return i10;
        }
        return this.f26544a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        int i10 = this.h;
        if (i10 != 0) {
            return i10;
        }
        return this.f26544a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f26545b.getOpacity();
    }

    @Override
    public final int[] getState() {
        return this.f26545b.getState();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isStateful() {
        return this.f26545b.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f26545b.jumpToCurrentState();
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
        this.f26545b.setAlpha(i10);
        this.f26544a.setAlpha(i10);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f26545b.setColorFilter(colorFilter);
    }

    @Override
    public final boolean setState(int[] iArr) {
        this.f26545b.setState(iArr);
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public fr(Drawable drawable, Drawable drawable2) {
        this.f26544a = drawable;
        this.f26545b = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
