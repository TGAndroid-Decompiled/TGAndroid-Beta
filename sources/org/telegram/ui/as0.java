package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class as0 extends f2.m1 {
    public final float f36546k;
    public final LinearInterpolator f36544i = new LinearInterpolator();
    public final DecelerateInterpolator f36545j = new DecelerateInterpolator(1.5f);
    public int f36547l = 0;
    public int f36548m = 0;

    public as0(Context context) {
        this.f36546k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i9) {
        f2.z0 z0Var = this.f5445c;
        if (z0Var instanceof f2.m0) {
            return ((f2.m0) z0Var).E0(i9);
        }
        return null;
    }

    @Override
    public final void d(int i9, int i10, f2.l1 l1Var) {
        if (this.f5444b.f1368x.r() == 0) {
            h();
            return;
        }
        int i11 = this.f36547l;
        int i12 = i11 - i9;
        int i13 = 0;
        if (i11 * i12 <= 0) {
            i12 = 0;
        }
        this.f36547l = i12;
        int i14 = this.f36548m;
        int i15 = i14 - i10;
        if (i14 * i15 > 0) {
            i13 = i15;
        }
        this.f36548m = i13;
        if (i12 == 0 && i13 == 0) {
            PointF a2 = a(this.f5443a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                f2.m1.b(a2);
                this.f36547l = (int) (a2.x * 10000.0f);
                this.f36548m = (int) (a2.y * 10000.0f);
                l1Var.b((int) (this.f36547l * 1.2f), (int) (this.f36548m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f36546k)) * 1.2f), this.f36544i);
                return;
            }
            l1Var.d = this.f5443a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f36548m = 0;
        this.f36547l = 0;
    }

    @Override
    public final void g(android.view.View r8, f2.l1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.as0.g(android.view.View, f2.l1):void");
    }

    @Override
    public final void e() {
    }
}
