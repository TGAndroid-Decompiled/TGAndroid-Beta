package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class fq extends Drawable implements Drawable.Callback {
    public Drawable f28542a;
    public final Drawable f28543b;
    public final int f28544c;
    public final int d;
    public int f28545e;
    public int f28546f;
    public int h;
    public int f28547n;
    public boolean f28548r;
    public int f28549s;
    public int v;
    public boolean f28550w;
    public float f28551x;

    public fq(Drawable drawable, Drawable drawable2, int i9, int i10) {
        this.f28542a = drawable;
        this.f28543b = drawable2;
        this.f28544c = i9;
        this.d = i10;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f28551x, 0.0f);
        if (this.f28548r) {
            Rect bounds = getBounds();
            setBounds(bounds.centerX() - (getIntrinsicWidth() / 2), bounds.centerY() - (getIntrinsicHeight() / 2), (getIntrinsicWidth() / 2) + bounds.centerX(), (getIntrinsicHeight() / 2) + bounds.centerY());
        }
        Drawable drawable = this.f28542a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f28542a.draw(canvas);
        }
        Drawable drawable2 = this.f28543b;
        if (drawable2 != null) {
            boolean z10 = this.f28550w;
            int i9 = this.d;
            int i10 = this.f28544c;
            if (z10) {
                Rect bounds2 = getBounds();
                if (i10 != 0) {
                    drawable2.setBounds(bounds2.left + i10, bounds2.top + i9, bounds2.right - i10, bounds2.bottom - i9);
                } else {
                    drawable2.setBounds(bounds2);
                }
            } else if (this.f28545e != 0) {
                int centerX = (getBounds().centerX() - (this.f28545e / 2)) + i10 + this.f28549s;
                int centerY = getBounds().centerY();
                int i11 = this.f28546f;
                int i12 = (centerY - (i11 / 2)) + i9 + this.v;
                drawable2.setBounds(centerX, i12, this.f28545e + centerX, i11 + i12);
            } else {
                int centerX2 = (getBounds().centerX() - (drawable2.getIntrinsicWidth() / 2)) + i10;
                int centerY2 = (getBounds().centerY() - (drawable2.getIntrinsicHeight() / 2)) + i9;
                drawable2.setBounds(centerX2, centerY2, drawable2.getIntrinsicWidth() + centerX2, drawable2.getIntrinsicHeight() + centerY2);
            }
            drawable2.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        return this.f28543b.getConstantState();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i9 = this.f28547n;
        if (i9 != 0) {
            return i9;
        }
        return this.f28542a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        int i9 = this.h;
        if (i9 != 0) {
            return i9;
        }
        return this.f28542a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        int i9 = this.f28547n;
        if (i9 != 0) {
            return i9;
        }
        return this.f28542a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        int i9 = this.h;
        if (i9 != 0) {
            return i9;
        }
        return this.f28542a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f28543b.getOpacity();
    }

    @Override
    public final int[] getState() {
        return this.f28543b.getState();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isStateful() {
        return this.f28543b.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f28543b.jumpToCurrentState();
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
    public final void setAlpha(int i9) {
        this.f28543b.setAlpha(i9);
        this.f28542a.setAlpha(i9);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f28543b.setColorFilter(colorFilter);
    }

    @Override
    public final boolean setState(int[] iArr) {
        this.f28543b.setState(iArr);
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public fq(Drawable drawable, Drawable drawable2) {
        this.f28542a = drawable;
        this.f28543b = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
