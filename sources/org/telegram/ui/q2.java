package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class q2 implements m2.e {
    public final int f41505a;
    public final Object f41506b;

    public q2(Object obj, int i10) {
        this.f41505a = i10;
        this.f41506b = obj;
    }

    @Override
    public final void a(int i10) {
        switch (this.f41505a) {
            case 0:
                u2 u2Var = (u2) this.f41506b;
                u2Var.v = i10;
                u2Var.f43137c.invalidate();
                return;
            case 1:
                ((k70) this.f41506b).D = i10;
                return;
            default:
                ((qc1) this.f41506b).W.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f9, int i10, int i11) {
        switch (this.f41505a) {
            case 0:
                u2 u2Var = (u2) this.f41506b;
                float measuredWidth = u2Var.f43135a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    u2Var.f43142s = com.google.android.recaptcha.internal.a.w(u2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    u2Var.f43137c.invalidate();
                    return;
                }
                return;
            case 1:
                k70 k70Var = (k70) this.f41506b;
                org.telegram.ui.Components.pa paVar = k70Var.f39775e;
                paVar.f31622b = f9;
                paVar.f31623c = i10;
                paVar.invalidate();
                float measuredWidth2 = k70Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (k70Var.D * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f41505a) {
            case 0:
                return;
            case 1:
                k70 k70Var = (k70) this.f41506b;
                if (i10 == 1) {
                    k70Var.G = true;
                    k70Var.d.getCurrentItem();
                    k70Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (k70Var.G) {
                        k70Var.G = false;
                    }
                    if (k70Var.f39780w != k70Var.d.getCurrentItem()) {
                        k70Var.f39780w = k70Var.d.getCurrentItem();
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

    private final void f(float f9, int i10, int i11) {
    }
}
