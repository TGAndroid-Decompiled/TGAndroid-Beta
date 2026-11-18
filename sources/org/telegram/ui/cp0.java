package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class cp0 extends v4.b1 {
    public final float f46590k;
    public final LinearInterpolator f46588i = new LinearInterpolator();
    public final DecelerateInterpolator f46589j = new DecelerateInterpolator(1.5f);
    public int f46591l = 0;
    public int f46592m = 0;

    public cp0(Context context) {
        this.f46590k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i7) {
        v4.p0 p0Var = this.f59069c;
        if (p0Var instanceof v4.c0) {
            return ((v4.c0) p0Var).E0(i7);
        }
        return null;
    }

    @Override
    public final void d(int i7, int i10, v4.a1 a1Var) {
        if (this.f59068b.f2822y.r() == 0) {
            h();
            return;
        }
        int i11 = this.f46591l;
        int i12 = i11 - i7;
        int i13 = 0;
        if (i11 * i12 <= 0) {
            i12 = 0;
        }
        this.f46591l = i12;
        int i14 = this.f46592m;
        int i15 = i14 - i10;
        if (i14 * i15 > 0) {
            i13 = i15;
        }
        this.f46592m = i13;
        if (i12 == 0 && i13 == 0) {
            PointF a10 = a(this.f59067a);
            if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
                v4.b1.b(a10);
                this.f46591l = (int) (a10.x * 10000.0f);
                this.f46592m = (int) (a10.y * 10000.0f);
                a1Var.b((int) (this.f46591l * 1.2f), (int) (this.f46592m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f46590k)) * 1.2f), this.f46588i);
                return;
            }
            a1Var.d = this.f59067a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f46592m = 0;
        this.f46591l = 0;
    }

    @Override
    public final void g(android.view.View r8, v4.a1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cp0.g(android.view.View, v4.a1):void");
    }

    @Override
    public final void e() {
    }
}
