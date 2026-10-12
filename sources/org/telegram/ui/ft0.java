package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class ft0 extends s4.z0 {
    public final float f37844k;
    public final LinearInterpolator f37842i = new LinearInterpolator();
    public final DecelerateInterpolator f37843j = new DecelerateInterpolator(1.5f);
    public int f37845l = 0;
    public int f37846m = 0;

    public ft0(Context context) {
        this.f37844k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i10) {
        s4.p0 p0Var = this.f48068c;
        if (p0Var instanceof s4.d0) {
            return ((s4.d0) p0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, s4.y0 y0Var) {
        if (this.f48067b.f3167x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f37845l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f37845l = i13;
        int i15 = this.f37846m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f37846m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f48066a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                s4.z0.b(a2);
                this.f37845l = (int) (a2.x * 10000.0f);
                this.f37846m = (int) (a2.y * 10000.0f);
                y0Var.b((int) (this.f37845l * 1.2f), (int) (this.f37846m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f37844k)) * 1.2f), this.f37842i);
                return;
            }
            y0Var.d = this.f48066a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f37846m = 0;
        this.f37845l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.y0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ft0.g(android.view.View, s4.y0):void");
    }

    @Override
    public final void e() {
    }
}
