package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class ct0 extends s4.y0 {
    public final float f35533k;
    public final LinearInterpolator f35531i = new LinearInterpolator();
    public final DecelerateInterpolator f35532j = new DecelerateInterpolator(1.5f);
    public int f35534l = 0;
    public int f35535m = 0;

    public ct0(Context context) {
        this.f35533k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i10) {
        s4.o0 o0Var = this.f45908c;
        if (o0Var instanceof s4.c0) {
            return ((s4.c0) o0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, s4.x0 x0Var) {
        if (this.f45907b.f1896x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f35534l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f35534l = i13;
        int i15 = this.f35535m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f35535m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f45906a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                s4.y0.b(a2);
                this.f35534l = (int) (a2.x * 10000.0f);
                this.f35535m = (int) (a2.y * 10000.0f);
                x0Var.b((int) (this.f35534l * 1.2f), (int) (this.f35535m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f35533k)) * 1.2f), this.f35531i);
                return;
            }
            x0Var.d = this.f45906a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f35535m = 0;
        this.f35534l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.x0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ct0.g(android.view.View, s4.x0):void");
    }

    @Override
    public final void e() {
    }
}
