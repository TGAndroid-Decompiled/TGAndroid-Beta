package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class os0 extends f2.i1 {
    public final float f39803k;
    public final LinearInterpolator f39801i = new LinearInterpolator();
    public final DecelerateInterpolator f39802j = new DecelerateInterpolator(1.5f);
    public int f39804l = 0;
    public int f39805m = 0;

    public os0(Context context) {
        this.f39803k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
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
        int i12 = this.f39804l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f39804l = i13;
        int i15 = this.f39805m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f39805m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f5805a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                f2.i1.b(a2);
                this.f39804l = (int) (a2.x * 10000.0f);
                this.f39805m = (int) (a2.y * 10000.0f);
                h1Var.b((int) (this.f39804l * 1.2f), (int) (this.f39805m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f39803k)) * 1.2f), this.f39801i);
                return;
            }
            h1Var.d = this.f5805a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f39805m = 0;
        this.f39804l = 0;
    }

    @Override
    public final void g(android.view.View r8, f2.h1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.os0.g(android.view.View, f2.h1):void");
    }

    @Override
    public final void e() {
    }
}
