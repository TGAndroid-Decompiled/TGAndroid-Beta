package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class js0 extends s4.x0 {
    public final float f38341k;
    public final LinearInterpolator f38339i = new LinearInterpolator();
    public final DecelerateInterpolator f38340j = new DecelerateInterpolator(1.5f);
    public int f38342l = 0;
    public int f38343m = 0;

    public js0(Context context) {
        this.f38341k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i10) {
        s4.n0 n0Var = this.f46060c;
        if (n0Var instanceof s4.b0) {
            return ((s4.b0) n0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, s4.w0 w0Var) {
        if (this.f46059b.f3631x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f38342l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f38342l = i13;
        int i15 = this.f38343m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f38343m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f46058a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                s4.x0.b(a2);
                this.f38342l = (int) (a2.x * 10000.0f);
                this.f38343m = (int) (a2.y * 10000.0f);
                w0Var.b((int) (this.f38342l * 1.2f), (int) (this.f38343m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f38341k)) * 1.2f), this.f38339i);
                return;
            }
            w0Var.d = this.f46058a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f38343m = 0;
        this.f38342l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.w0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.js0.g(android.view.View, s4.w0):void");
    }

    @Override
    public final void e() {
    }
}
