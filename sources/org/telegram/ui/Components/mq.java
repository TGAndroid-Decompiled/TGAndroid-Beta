package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class mq extends Drawable implements Drawable.Callback {
    public Drawable f27109a;
    public final Drawable f27110b;
    public final int f27111c;
    public final int d;
    public int e;
    public int f27112f;
    public int h;
    public int f27113n;
    public boolean f27114r;
    public int f27115s;
    public int v;
    public boolean f27116w;
    public float f27117x;

    public mq(Drawable drawable, Drawable drawable2, int i10, int i11) {
        this.f27109a = drawable;
        this.f27110b = drawable2;
        this.f27111c = i10;
        this.d = i11;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f27117x, 0.0f);
        if (this.f27114r) {
            Rect bounds = getBounds();
            setBounds(bounds.centerX() - (getIntrinsicWidth() / 2), bounds.centerY() - (getIntrinsicHeight() / 2), (getIntrinsicWidth() / 2) + bounds.centerX(), (getIntrinsicHeight() / 2) + bounds.centerY());
        }
        Drawable drawable = this.f27109a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f27109a.draw(canvas);
        }
        Drawable drawable2 = this.f27110b;
        if (drawable2 != null) {
            boolean z4 = this.f27116w;
            int i10 = this.d;
            int i11 = this.f27111c;
            if (z4) {
                Rect bounds2 = getBounds();
                if (i11 != 0) {
                    drawable2.setBounds(bounds2.left + i11, bounds2.top + i10, bounds2.right - i11, bounds2.bottom - i10);
                } else {
                    drawable2.setBounds(bounds2);
                }
            } else if (this.e != 0) {
                int centerX = (getBounds().centerX() - (this.e / 2)) + i11 + this.f27115s;
                int centerY = getBounds().centerY();
                int i12 = this.f27112f;
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
        return this.f27110b.getConstantState();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i10 = this.f27113n;
        if (i10 != 0) {
            return i10;
        }
        return this.f27109a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        int i10 = this.h;
        if (i10 != 0) {
            return i10;
        }
        return this.f27109a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        int i10 = this.f27113n;
        if (i10 != 0) {
            return i10;
        }
        return this.f27109a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        int i10 = this.h;
        if (i10 != 0) {
            return i10;
        }
        return this.f27109a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f27110b.getOpacity();
    }

    @Override
    public final int[] getState() {
        return this.f27110b.getState();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isStateful() {
        return this.f27110b.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f27110b.jumpToCurrentState();
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
        this.f27110b.setAlpha(i10);
        this.f27109a.setAlpha(i10);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f27110b.setColorFilter(colorFilter);
    }

    @Override
    public final boolean setState(int[] iArr) {
        this.f27110b.setState(iArr);
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public mq(Drawable drawable, Drawable drawable2) {
        this.f27109a = drawable;
        this.f27110b = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
