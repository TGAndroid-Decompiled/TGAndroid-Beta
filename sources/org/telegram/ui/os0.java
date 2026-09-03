package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class os0 extends f2.h1 {
    public final float f36876k;
    public final LinearInterpolator f36874i = new LinearInterpolator();
    public final DecelerateInterpolator f36875j = new DecelerateInterpolator(1.5f);
    public int f36877l = 0;
    public int f36878m = 0;

    public os0(Context context) {
        this.f36876k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i10) {
        f2.v0 v0Var = this.f5714c;
        if (v0Var instanceof f2.i0) {
            return ((f2.i0) v0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, f2.g1 g1Var) {
        if (this.f5713b.f1261x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f36877l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f36877l = i13;
        int i15 = this.f36878m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f36878m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f5712a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                f2.h1.b(a2);
                this.f36877l = (int) (a2.x * 10000.0f);
                this.f36878m = (int) (a2.y * 10000.0f);
                g1Var.b((int) (this.f36877l * 1.2f), (int) (this.f36878m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f36876k)) * 1.2f), this.f36874i);
                return;
            }
            g1Var.d = this.f5712a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f36878m = 0;
        this.f36877l = 0;
    }

    @Override
    public final void g(android.view.View r8, f2.g1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.os0.g(android.view.View, f2.g1):void");
    }

    @Override
    public final void e() {
    }
}
