package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class o2 implements z4.e {
    public final int f39638a;
    public final Object f39639b;

    public o2(Object obj, int i10) {
        this.f39638a = i10;
        this.f39639b = obj;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        switch (this.f39638a) {
            case 0:
                s2 s2Var = (s2) this.f39639b;
                float measuredWidth = s2Var.f40846a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    s2Var.f40852s = com.google.android.gms.internal.play_billing.k3.c(s2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    s2Var.f40848c.invalidate();
                    return;
                }
                return;
            case 1:
                l70 l70Var = (l70) this.f39639b;
                org.telegram.ui.Components.sa saVar = l70Var.e;
                saVar.f30224b = f7;
                saVar.f30225c = i10;
                saVar.invalidate();
                float measuredWidth2 = l70Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (l70Var.H * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(int i10) {
        switch (this.f39638a) {
            case 0:
                s2 s2Var = (s2) this.f39639b;
                s2Var.v = i10;
                s2Var.f40848c.invalidate();
                return;
            case 1:
                ((l70) this.f39639b).H = i10;
                return;
            default:
                ((mc1) this.f39639b).f39079a0.invalidate();
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f39638a) {
            case 0:
                return;
            case 1:
                l70 l70Var = (l70) this.f39639b;
                if (i10 == 1) {
                    l70Var.K = true;
                    l70Var.d.getCurrentItem();
                    l70Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (l70Var.K) {
                        l70Var.K = false;
                    }
                    if (l70Var.f38759w != l70Var.d.getCurrentItem()) {
                        l70Var.f38759w = l70Var.d.getCurrentItem();
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
