package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class m9 extends Drawable implements Drawable.Callback {
    public static int[] f35958s;
    public final Context f35959a;
    public final i6 f35960b;
    public Drawable f35961c;
    public Drawable d;
    public int f35962e;
    public int f35963f;
    public int h;
    public int f35964n;
    public int f35965r;

    public m9(Context context) {
        this.f35959a = context;
        i6 i6Var = new i6(false, false, false);
        this.f35960b = i6Var;
        i6Var.x(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        i6Var.n(0.2f, 160L, xq.h);
        i6Var.w(org.telegram.messenger.g0.L(10.0f));
        i6Var.f34516b = 17;
        i6Var.setCallback(this);
        i6Var.T = true;
        if (f35958s != null) {
            return;
        }
        f35958s = new int[]{2131232585, 2131232586, 2131232589, 2131232590, 2131232593, 2131232594, 2131232597, 2131232598, 2131232601, 2131232602, 2131232605, 2131232606, 2131232609, 2131232610, 2131232613, 2131232614, 2131232617, 2131232618, 2131232583, 2131232584, 2131232587, 2131232588, 2131232591, 2131232592, 2131232595, 2131232596, 2131232599, 2131232600, 2131232603, 2131232604, 2131232607, 2131232608, 2131232611, 2131232612, 2131232615, 2131232616, 2131232619, 2131232620};
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable != null && this.f35961c != null) {
            drawable.draw(canvas);
            this.f35961c.draw(canvas);
            canvas.save();
            canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
            this.f35960b.draw(canvas);
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
        Drawable drawable = this.f35961c;
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
        int o4 = i0.a.o(this.f35962e, i7);
        if (this.f35962e != o4) {
            this.f35962e = o4;
            Drawable drawable = this.f35961c;
            if (drawable != null) {
                drawable.setColorFilter(o4, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int o10 = i0.a.o(this.f35963f, i7);
        if (this.f35963f != o10) {
            this.f35963f = o10;
            if (this.f35961c != null) {
                this.d.setColorFilter(o10, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int o11 = i0.a.o(this.h, i7);
        if (this.h != o11) {
            this.h = o11;
            this.f35960b.v(o11, false);
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
