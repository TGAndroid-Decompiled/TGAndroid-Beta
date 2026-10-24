package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class n2 implements z4.f {
    public final int f39697a;
    public final Object f39698b;

    public n2(Object obj, int i10) {
        this.f39697a = i10;
        this.f39698b = obj;
    }

    @Override
    public final void a(int i10) {
        switch (this.f39697a) {
            case 0:
                r2 r2Var = (r2) this.f39698b;
                r2Var.f40987w = i10;
                r2Var.d.invalidate();
                return;
            case 1:
                ((n70) this.f39698b).H = i10;
                return;
            default:
                ((pc1) this.f39698b).f40446b0.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        switch (this.f39697a) {
            case 0:
                r2 r2Var = (r2) this.f39698b;
                float measuredWidth = r2Var.f40981b.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    r2Var.v = com.google.android.gms.internal.play_billing.k3.c(r2Var.f40987w, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    r2Var.d.invalidate();
                    return;
                }
                return;
            case 1:
                n70 n70Var = (n70) this.f39698b;
                org.telegram.ui.Components.qa qaVar = n70Var.e;
                qaVar.f29867b = f7;
                qaVar.f29868c = i10;
                qaVar.invalidate();
                float measuredWidth2 = n70Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (n70Var.H * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f39697a) {
            case 0:
                return;
            case 1:
                n70 n70Var = (n70) this.f39698b;
                if (i10 == 1) {
                    n70Var.K = true;
                    n70Var.d.getCurrentItem();
                    n70Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (n70Var.K) {
                        n70Var.K = false;
                    }
                    if (n70Var.f39760w != n70Var.d.getCurrentItem()) {
                        n70Var.f39760w = n70Var.d.getCurrentItem();
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
