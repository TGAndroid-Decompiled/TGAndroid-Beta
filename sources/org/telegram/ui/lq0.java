package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class lq0 extends s4.y0 {
    public final float f39369k;
    public final LinearInterpolator f39367i = new LinearInterpolator();
    public final DecelerateInterpolator f39368j = new DecelerateInterpolator(1.5f);
    public int f39370l = 0;
    public int f39371m = 0;

    public lq0(Context context) {
        this.f39369k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i10) {
        s4.n0 n0Var = this.f48047c;
        if (n0Var instanceof s4.a0) {
            return ((s4.a0) n0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, s4.x0 x0Var) {
        if (this.f48046b.f1924y.r() == 0) {
            h();
            return;
        }
        int i12 = this.f39370l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f39370l = i13;
        int i15 = this.f39371m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f39371m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f48045a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                s4.y0.b(a2);
                this.f39370l = (int) (a2.x * 10000.0f);
                this.f39371m = (int) (a2.y * 10000.0f);
                x0Var.b((int) (this.f39370l * 1.2f), (int) (this.f39371m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f39369k)) * 1.2f), this.f39367i);
                return;
            }
            x0Var.d = this.f48045a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f39371m = 0;
        this.f39370l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.x0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lq0.g(android.view.View, s4.x0):void");
    }

    @Override
    public final void e() {
    }
}
