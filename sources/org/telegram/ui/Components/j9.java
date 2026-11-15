package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class j9 extends Drawable implements Drawable.Callback {
    public static int[] f35924s;
    public final Context f35925a;
    public final g6 f35926b;
    public Drawable f35927c;
    public Drawable d;
    public int f35928e;
    public int f35929f;
    public int h;
    public int f35930n;
    public int f35931r;

    public j9(Context context) {
        this.f35925a = context;
        g6 g6Var = new g6(false, false, false);
        this.f35926b = g6Var;
        g6Var.x(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        g6Var.n(0.2f, 160L, er.h);
        g6Var.w(org.telegram.messenger.g0.L(10.0f));
        g6Var.f34829b = 17;
        g6Var.setCallback(this);
        g6Var.U = true;
        if (f35924s != null) {
            return;
        }
        f35924s = new int[]{2131232586, 2131232587, 2131232590, 2131232591, 2131232594, 2131232595, 2131232598, 2131232599, 2131232602, 2131232603, 2131232606, 2131232607, 2131232610, 2131232611, 2131232614, 2131232615, 2131232618, 2131232619, 2131232584, 2131232585, 2131232588, 2131232589, 2131232592, 2131232593, 2131232596, 2131232597, 2131232600, 2131232601, 2131232604, 2131232605, 2131232608, 2131232609, 2131232612, 2131232613, 2131232616, 2131232617, 2131232620, 2131232621};
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable != null && this.f35927c != null) {
            drawable.draw(canvas);
            this.f35927c.draw(canvas);
            canvas.save();
            canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
            this.f35926b.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f35927c;
        if (drawable != null) {
            drawable.setBounds(getBounds());
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setBounds(getBounds());
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override
    public final void setAlpha(int i7) {
        int o4 = i0.a.o(this.f35928e, i7);
        if (this.f35928e != o4) {
            this.f35928e = o4;
            Drawable drawable = this.f35927c;
            if (drawable != null) {
                drawable.setColorFilter(o4, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int o10 = i0.a.o(this.f35929f, i7);
        if (this.f35929f != o10) {
            this.f35929f = o10;
            if (this.f35927c != null) {
                this.d.setColorFilter(o10, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int o11 = i0.a.o(this.h, i7);
        if (this.h != o11) {
            this.h = o11;
            this.f35926b.v(o11, false);
            invalidateSelf();
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
