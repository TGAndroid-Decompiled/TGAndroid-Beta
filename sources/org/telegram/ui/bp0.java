package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class bp0 extends v4.z0 {
    public final float f44473k;
    public final LinearInterpolator f44471i = new LinearInterpolator();
    public final DecelerateInterpolator f44472j = new DecelerateInterpolator(1.5f);
    public int f44474l = 0;
    public int f44475m = 0;

    public bp0(Context context) {
        this.f44473k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i7) {
        v4.n0 n0Var = this.f57214c;
        if (n0Var instanceof v4.b0) {
            return ((v4.b0) n0Var).E0(i7);
        }
        return null;
    }

    @Override
    public final void d(int i7, int i10, v4.y0 y0Var) {
        if (this.f57213b.f2873y.r() == 0) {
            h();
            return;
        }
        int i11 = this.f44474l;
        int i12 = i11 - i7;
        int i13 = 0;
        if (i11 * i12 <= 0) {
            i12 = 0;
        }
        this.f44474l = i12;
        int i14 = this.f44475m;
        int i15 = i14 - i10;
        if (i14 * i15 > 0) {
            i13 = i15;
        }
        this.f44475m = i13;
        if (i12 == 0 && i13 == 0) {
            PointF a10 = a(this.f57212a);
            if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
                v4.z0.b(a10);
                this.f44474l = (int) (a10.x * 10000.0f);
                this.f44475m = (int) (a10.y * 10000.0f);
                y0Var.b((int) (this.f44474l * 1.2f), (int) (this.f44475m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f44473k)) * 1.2f), this.f44471i);
                return;
            }
            y0Var.d = this.f57212a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f44475m = 0;
        this.f44474l = 0;
    }

    @Override
    public final void g(android.view.View r8, v4.y0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bp0.g(android.view.View, v4.y0):void");
    }

    @Override
    public final void e() {
    }
}
