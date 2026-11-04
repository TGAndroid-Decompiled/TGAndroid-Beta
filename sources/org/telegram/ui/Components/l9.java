package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class l9 extends Drawable implements Drawable.Callback {
    public static int[] f35627s;
    public final Context f35628a;
    public final g6 f35629b;
    public Drawable f35630c;
    public Drawable d;
    public int f35631e;
    public int f35632f;
    public int h;
    public int f35633n;
    public int f35634r;

    public l9(Context context) {
        this.f35628a = context;
        g6 g6Var = new g6(false, false, false);
        this.f35629b = g6Var;
        g6Var.x(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        g6Var.n(0.2f, 160L, xq.h);
        g6Var.w(org.telegram.messenger.g0.L(10.0f));
        g6Var.f33983b = 17;
        g6Var.setCallback(this);
        g6Var.T = true;
        if (f35627s != null) {
            return;
        }
        f35627s = new int[]{2131232583, 2131232584, 2131232587, 2131232588, 2131232591, 2131232592, 2131232595, 2131232596, 2131232599, 2131232600, 2131232603, 2131232604, 2131232607, 2131232608, 2131232611, 2131232612, 2131232615, 2131232616, 2131232581, 2131232582, 2131232585, 2131232586, 2131232589, 2131232590, 2131232593, 2131232594, 2131232597, 2131232598, 2131232601, 2131232602, 2131232605, 2131232606, 2131232609, 2131232610, 2131232613, 2131232614, 2131232617, 2131232618};
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable != null && this.f35630c != null) {
            drawable.draw(canvas);
            this.f35630c.draw(canvas);
            canvas.save();
            canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
            this.f35629b.draw(canvas);
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
        Drawable drawable = this.f35630c;
        if (drawable != null) {
            drawable.setBounds(getBounds());
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setBounds(getBounds());
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i3) {
        int o10 = i0.a.o(this.f35631e, i3);
        if (this.f35631e != o10) {
            this.f35631e = o10;
            Drawable drawable = this.f35630c;
            if (drawable != null) {
                drawable.setColorFilter(o10, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int o11 = i0.a.o(this.f35632f, i3);
        if (this.f35632f != o11) {
            this.f35632f = o11;
            if (this.f35630c != null) {
                this.d.setColorFilter(o11, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int o12 = i0.a.o(this.h, i3);
        if (this.h != o12) {
            this.h = o12;
            this.f35629b.v(o12, false);
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
