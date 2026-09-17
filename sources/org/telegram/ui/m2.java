package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class m2 implements z4.e {
    public final int f38574a;
    public final Object f38575b;

    public m2(Object obj, int i10) {
        this.f38574a = i10;
        this.f38575b = obj;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        switch (this.f38574a) {
            case 0:
                q2 q2Var = (q2) this.f38575b;
                float measuredWidth = q2Var.f39699a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    q2Var.f39706s = com.google.android.gms.internal.vision.e2.v(q2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    q2Var.f39701c.invalidate();
                    return;
                }
                return;
            case 1:
                d80 d80Var = (d80) this.f38575b;
                org.telegram.ui.Components.sa saVar = d80Var.f35742e;
                saVar.f30266b = f7;
                saVar.f30267c = i10;
                saVar.invalidate();
                float measuredWidth2 = d80Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (d80Var.H * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(int i10) {
        switch (this.f38574a) {
            case 0:
                q2 q2Var = (q2) this.f38575b;
                q2Var.v = i10;
                q2Var.f39701c.invalidate();
                return;
            case 1:
                ((d80) this.f38575b).H = i10;
                return;
            default:
                ((wd1) this.f38575b).f41943a0.invalidate();
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f38574a) {
            case 0:
                return;
            case 1:
                d80 d80Var = (d80) this.f38575b;
                if (i10 == 1) {
                    d80Var.K = true;
                    d80Var.d.getCurrentItem();
                    d80Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (d80Var.K) {
                        d80Var.K = false;
                    }
                    if (d80Var.f35747w != d80Var.d.getCurrentItem()) {
                        d80Var.f35747w = d80Var.d.getCurrentItem();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    private final void d(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(float f7, int i10, int i11) {
    }
}
