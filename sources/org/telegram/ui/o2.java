package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class o2 implements z4.e {
    public final int f39737a;
    public final Object f39738b;

    public o2(Object obj, int i10) {
        this.f39737a = i10;
        this.f39738b = obj;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        switch (this.f39737a) {
            case 0:
                s2 s2Var = (s2) this.f39738b;
                float measuredWidth = s2Var.f41319a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    s2Var.f41325s = com.google.android.gms.internal.play_billing.k3.c(s2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    s2Var.f41321c.invalidate();
                    return;
                }
                return;
            case 1:
                j70 j70Var = (j70) this.f39738b;
                org.telegram.ui.Components.sa saVar = j70Var.e;
                saVar.f30215b = f7;
                saVar.f30216c = i10;
                saVar.invalidate();
                float measuredWidth2 = j70Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (j70Var.H * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(int i10) {
        switch (this.f39737a) {
            case 0:
                s2 s2Var = (s2) this.f39738b;
                s2Var.v = i10;
                s2Var.f41321c.invalidate();
                return;
            case 1:
                ((j70) this.f39738b).H = i10;
                return;
            default:
                ((kc1) this.f39738b).f38511a0.invalidate();
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f39737a) {
            case 0:
                return;
            case 1:
                j70 j70Var = (j70) this.f39738b;
                if (i10 == 1) {
                    j70Var.K = true;
                    j70Var.d.getCurrentItem();
                    j70Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (j70Var.K) {
                        j70Var.K = false;
                    }
                    if (j70Var.f38187w != j70Var.d.getCurrentItem()) {
                        j70Var.f38187w = j70Var.d.getCurrentItem();
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
