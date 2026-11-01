package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class h9 extends Drawable implements Drawable.Callback {
    public static int[] f26708s;
    public final Context f26709a;
    public final e6 f26710b;
    public Drawable f26711c;
    public Drawable d;
    public int e;
    public int f26712f;
    public int h;
    public int f26713n;
    public int f26714r;

    public h9(Context context) {
        this.f26709a = context;
        e6 e6Var = new e6(false, false, false);
        this.f26710b = e6Var;
        e6Var.x(org.telegram.messenger.i0.o1("fonts/rcondensedbold.ttf"));
        e6Var.n(0.2f, 160L, gr.h);
        e6Var.w(org.telegram.messenger.i0.L(10.0f));
        e6Var.f25744b = 17;
        e6Var.setCallback(this);
        e6Var.T = true;
        if (f26708s != null) {
            return;
        }
        f26708s = new int[]{2131232582, 2131232583, 2131232586, 2131232587, 2131232590, 2131232591, 2131232594, 2131232595, 2131232598, 2131232599, 2131232602, 2131232603, 2131232606, 2131232607, 2131232610, 2131232611, 2131232614, 2131232615, 2131232580, 2131232581, 2131232584, 2131232585, 2131232588, 2131232589, 2131232592, 2131232593, 2131232596, 2131232597, 2131232600, 2131232601, 2131232604, 2131232605, 2131232608, 2131232609, 2131232612, 2131232613, 2131232616, 2131232617};
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable != null && this.f26711c != null) {
            drawable.draw(canvas);
            this.f26711c.draw(canvas);
            canvas.save();
            canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
            this.f26710b.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(24.0f);
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
        Drawable drawable = this.f26711c;
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
    public final void setAlpha(int i10) {
        int o10 = i0.b.o(this.e, i10);
        if (this.e != o10) {
            this.e = o10;
            Drawable drawable = this.f26711c;
            if (drawable != null) {
                drawable.setColorFilter(o10, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int o11 = i0.b.o(this.f26712f, i10);
        if (this.f26712f != o11) {
            this.f26712f = o11;
            if (this.f26711c != null) {
                this.d.setColorFilter(o11, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int o12 = i0.b.o(this.h, i10);
        if (this.h != o12) {
            this.h = o12;
            this.f26710b.v(o12, false);
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
