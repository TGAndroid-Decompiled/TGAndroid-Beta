package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class js0 extends f2.i1 {
    public final float f38212k;
    public final LinearInterpolator f38210i = new LinearInterpolator();
    public final DecelerateInterpolator f38211j = new DecelerateInterpolator(1.5f);
    public int f38213l = 0;
    public int f38214m = 0;

    public js0(Context context) {
        this.f38212k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i10) {
        f2.w0 w0Var = this.f5807c;
        if (w0Var instanceof f2.j0) {
            return ((f2.j0) w0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, f2.h1 h1Var) {
        if (this.f5806b.f1349x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f38213l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f38213l = i13;
        int i15 = this.f38214m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f38214m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f5805a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                f2.i1.b(a2);
                this.f38213l = (int) (a2.x * 10000.0f);
                this.f38214m = (int) (a2.y * 10000.0f);
                h1Var.b((int) (this.f38213l * 1.2f), (int) (this.f38214m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f38212k)) * 1.2f), this.f38210i);
                return;
            }
            h1Var.d = this.f5805a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f38214m = 0;
        this.f38213l = 0;
    }

    @Override
    public final void g(android.view.View r8, f2.h1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.js0.g(android.view.View, f2.h1):void");
    }

    @Override
    public final void e() {
    }
}
