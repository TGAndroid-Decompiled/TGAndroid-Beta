package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class dq extends Drawable implements Drawable.Callback {

    public Drawable f27820a;

    public final Drawable f27821b;

    public final int f27822c;
    public final int d;

    public int f27823e;

    public int f27824f;
    public int h;

    public int f27825n;

    public boolean f27826r;

    public int f27827s;
    public int v;

    public boolean f27828w;

    public float f27829x;

    public dq(Drawable drawable, Drawable drawable2, int i10, int i11) {
        this.f27820a = drawable;
        this.f27821b = drawable2;
        this.f27822c = i10;
        this.d = i11;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f27829x, 0.0f);
        if (this.f27826r) {
            Rect bounds = getBounds();
            setBounds(bounds.centerX() - (getIntrinsicWidth() / 2), bounds.centerY() - (getIntrinsicHeight() / 2), (getIntrinsicWidth() / 2) + bounds.centerX(), (getIntrinsicHeight() / 2) + bounds.centerY());
        }
        Drawable drawable = this.f27820a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f27820a.draw(canvas);
        }
        Drawable drawable2 = this.f27821b;
        if (drawable2 != null) {
            boolean z10 = this.f27828w;
            int i10 = this.d;
            int i11 = this.f27822c;
            if (z10) {
                Rect bounds2 = getBounds();
                if (i11 != 0) {
                    drawable2.setBounds(bounds2.left + i11, bounds2.top + i10, bounds2.right - i11, bounds2.bottom - i10);
                } else {
                    drawable2.setBounds(bounds2);
                }
            } else if (this.f27823e != 0) {
                int iCenterX = (getBounds().centerX() - (this.f27823e / 2)) + i11 + this.f27827s;
                int iCenterY = getBounds().centerY();
                int i12 = this.f27824f;
                int i13 = (iCenterY - (i12 / 2)) + i10 + this.v;
                drawable2.setBounds(iCenterX, i13, this.f27823e + iCenterX, i12 + i13);
            } else {
                int iCenterX2 = (getBounds().centerX() - (drawable2.getIntrinsicWidth() / 2)) + i11;
                int iCenterY2 = (getBounds().centerY() - (drawable2.getIntrinsicHeight() / 2)) + i10;
                drawable2.setBounds(iCenterX2, iCenterY2, drawable2.getIntrinsicWidth() + iCenterX2, drawable2.getIntrinsicHeight() + iCenterY2);
            }
            drawable2.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        return this.f27821b.getConstantState();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i10 = this.f27825n;
        return i10 != 0 ? i10 : this.f27820a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        int i10 = this.h;
        return i10 != 0 ? i10 : this.f27820a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        int i10 = this.f27825n;
        return i10 != 0 ? i10 : this.f27820a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        int i10 = this.h;
        return i10 != 0 ? i10 : this.f27820a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f27821b.getOpacity();
    }

    @Override
    public final int[] getState() {
        return this.f27821b.getState();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isStateful() {
        return this.f27821b.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f27821b.jumpToCurrentState();
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
        this.f27821b.setAlpha(i10);
        this.f27820a.setAlpha(i10);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f27821b.setColorFilter(colorFilter);
    }

    @Override
    public final boolean setState(int[] iArr) {
        this.f27821b.setState(iArr);
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public dq(Drawable drawable, Drawable drawable2) {
        this.f27820a = drawable;
        this.f27821b = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
