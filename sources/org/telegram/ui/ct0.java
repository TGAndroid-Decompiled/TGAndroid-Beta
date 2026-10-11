package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class ct0 extends s4.z0 {
    public final float f36821k;
    public final LinearInterpolator f36819i = new LinearInterpolator();
    public final DecelerateInterpolator f36820j = new DecelerateInterpolator(1.5f);
    public int f36822l = 0;
    public int f36823m = 0;

    public ct0(Context context) {
        this.f36821k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i10) {
        s4.p0 p0Var = this.f47919c;
        if (p0Var instanceof s4.d0) {
            return ((s4.d0) p0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, s4.y0 y0Var) {
        if (this.f47918b.f3169x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f36822l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f36822l = i13;
        int i15 = this.f36823m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f36823m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f47917a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                s4.z0.b(a2);
                this.f36822l = (int) (a2.x * 10000.0f);
                this.f36823m = (int) (a2.y * 10000.0f);
                y0Var.b((int) (this.f36822l * 1.2f), (int) (this.f36823m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f36821k)) * 1.2f), this.f36819i);
                return;
            }
            y0Var.d = this.f47917a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f36823m = 0;
        this.f36822l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.y0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ct0.g(android.view.View, s4.y0):void");
    }

    @Override
    public final void e() {
    }
}
