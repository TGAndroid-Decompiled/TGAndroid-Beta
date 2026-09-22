package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class l2 implements z4.e {
    public final int f35299a;
    public final Object f35300b;

    public l2(Object obj, int i10) {
        this.f35299a = i10;
        this.f35300b = obj;
    }

    @Override
    public final void a(int i10) {
        switch (this.f35299a) {
            case 0:
                p2 p2Var = (p2) this.f35300b;
                p2Var.v = i10;
                p2Var.f36454c.invalidate();
                return;
            case 1:
                ((d80) this.f35300b).H = i10;
                return;
            default:
                ((xd1) this.f35300b).f39495a0.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        switch (this.f35299a) {
            case 0:
                p2 p2Var = (p2) this.f35300b;
                float measuredWidth = p2Var.f36452a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    p2Var.f36458s = com.google.android.gms.internal.vision.e2.v(p2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    p2Var.f36454c.invalidate();
                    return;
                }
                return;
            case 1:
                d80 d80Var = (d80) this.f35300b;
                org.telegram.ui.Components.ra raVar = d80Var.e;
                raVar.f27912b = f7;
                raVar.f27913c = i10;
                raVar.invalidate();
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
    public final void c(int i10) {
        switch (this.f35299a) {
            case 0:
                return;
            case 1:
                d80 d80Var = (d80) this.f35300b;
                if (i10 == 1) {
                    d80Var.K = true;
                    d80Var.d.getCurrentItem();
                    d80Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (d80Var.K) {
                        d80Var.K = false;
                    }
                    if (d80Var.f32983w != d80Var.d.getCurrentItem()) {
                        d80Var.f32983w = d80Var.d.getCurrentItem();
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
