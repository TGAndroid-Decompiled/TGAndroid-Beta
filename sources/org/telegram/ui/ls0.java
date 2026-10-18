package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class ls0 extends s4.x0 {
    public final float f38951k;
    public final LinearInterpolator f38949i = new LinearInterpolator();
    public final DecelerateInterpolator f38950j = new DecelerateInterpolator(1.5f);
    public int f38952l = 0;
    public int f38953m = 0;

    public ls0(Context context) {
        this.f38951k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i10) {
        s4.n0 n0Var = this.f46101c;
        if (n0Var instanceof s4.b0) {
            return ((s4.b0) n0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, s4.w0 w0Var) {
        if (this.f46100b.f3635x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f38952l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f38952l = i13;
        int i15 = this.f38953m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f38953m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f46099a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                s4.x0.b(a2);
                this.f38952l = (int) (a2.x * 10000.0f);
                this.f38953m = (int) (a2.y * 10000.0f);
                w0Var.b((int) (this.f38952l * 1.2f), (int) (this.f38953m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f38951k)) * 1.2f), this.f38949i);
                return;
            }
            w0Var.d = this.f46099a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f38953m = 0;
        this.f38952l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.w0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ls0.g(android.view.View, s4.w0):void");
    }

    @Override
    public final void e() {
    }
}
