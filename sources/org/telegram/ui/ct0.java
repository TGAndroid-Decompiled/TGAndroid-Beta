package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class ct0 extends s4.y0 {
    public final float f35560k;
    public final LinearInterpolator f35558i = new LinearInterpolator();
    public final DecelerateInterpolator f35559j = new DecelerateInterpolator(1.5f);
    public int f35561l = 0;
    public int f35562m = 0;

    public ct0(Context context) {
        this.f35560k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i10) {
        s4.o0 o0Var = this.f45936c;
        if (o0Var instanceof s4.c0) {
            return ((s4.c0) o0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, s4.x0 x0Var) {
        if (this.f45935b.f1923x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f35561l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f35561l = i13;
        int i15 = this.f35562m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f35562m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f45934a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                s4.y0.b(a2);
                this.f35561l = (int) (a2.x * 10000.0f);
                this.f35562m = (int) (a2.y * 10000.0f);
                x0Var.b((int) (this.f35561l * 1.2f), (int) (this.f35562m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f35560k)) * 1.2f), this.f35558i);
                return;
            }
            x0Var.d = this.f45934a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f35562m = 0;
        this.f35561l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.x0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ct0.g(android.view.View, s4.x0):void");
    }

    @Override
    public final void e() {
    }
}
