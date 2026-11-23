package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class dp0 extends v4.a1 {
    public final float f46987k;
    public final LinearInterpolator f46985i = new LinearInterpolator();
    public final DecelerateInterpolator f46986j = new DecelerateInterpolator(1.5f);
    public int f46988l = 0;
    public int f46989m = 0;

    public dp0(Context context) {
        this.f46987k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i7) {
        v4.o0 o0Var = this.f59057c;
        if (o0Var instanceof v4.b0) {
            return ((v4.b0) o0Var).E0(i7);
        }
        return null;
    }

    @Override
    public final void d(int i7, int i10, v4.z0 z0Var) {
        if (this.f59056b.f2792y.r() == 0) {
            h();
            return;
        }
        int i11 = this.f46988l;
        int i12 = i11 - i7;
        int i13 = 0;
        if (i11 * i12 <= 0) {
            i12 = 0;
        }
        this.f46988l = i12;
        int i14 = this.f46989m;
        int i15 = i14 - i10;
        if (i14 * i15 > 0) {
            i13 = i15;
        }
        this.f46989m = i13;
        if (i12 == 0 && i13 == 0) {
            PointF a10 = a(this.f59055a);
            if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
                v4.a1.b(a10);
                this.f46988l = (int) (a10.x * 10000.0f);
                this.f46989m = (int) (a10.y * 10000.0f);
                z0Var.b((int) (this.f46988l * 1.2f), (int) (this.f46989m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f46987k)) * 1.2f), this.f46985i);
                return;
            }
            z0Var.d = this.f59055a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f46989m = 0;
        this.f46988l = 0;
    }

    @Override
    public final void g(android.view.View r8, v4.z0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dp0.g(android.view.View, v4.z0):void");
    }

    @Override
    public final void e() {
    }
}
