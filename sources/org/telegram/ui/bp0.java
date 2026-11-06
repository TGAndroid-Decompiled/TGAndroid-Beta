package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class bp0 extends v4.z0 {
    public final float f44471k;
    public final LinearInterpolator f44469i = new LinearInterpolator();
    public final DecelerateInterpolator f44470j = new DecelerateInterpolator(1.5f);
    public int f44472l = 0;
    public int f44473m = 0;

    public bp0(Context context) {
        this.f44471k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i7) {
        v4.n0 n0Var = this.f57123c;
        if (n0Var instanceof v4.b0) {
            return ((v4.b0) n0Var).E0(i7);
        }
        return null;
    }

    @Override
    public final void d(int i7, int i10, v4.y0 y0Var) {
        if (this.f57122b.f2873y.r() == 0) {
            h();
            return;
        }
        int i11 = this.f44472l;
        int i12 = i11 - i7;
        int i13 = 0;
        if (i11 * i12 <= 0) {
            i12 = 0;
        }
        this.f44472l = i12;
        int i14 = this.f44473m;
        int i15 = i14 - i10;
        if (i14 * i15 > 0) {
            i13 = i15;
        }
        this.f44473m = i13;
        if (i12 == 0 && i13 == 0) {
            PointF a10 = a(this.f57121a);
            if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
                v4.z0.b(a10);
                this.f44472l = (int) (a10.x * 10000.0f);
                this.f44473m = (int) (a10.y * 10000.0f);
                y0Var.b((int) (this.f44472l * 1.2f), (int) (this.f44473m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f44471k)) * 1.2f), this.f44469i);
                return;
            }
            y0Var.d = this.f57121a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f44473m = 0;
        this.f44472l = 0;
    }

    @Override
    public final void g(android.view.View r8, v4.y0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bp0.g(android.view.View, v4.y0):void");
    }

    @Override
    public final void e() {
    }
}
