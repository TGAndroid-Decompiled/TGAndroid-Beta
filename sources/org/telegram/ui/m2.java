package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class m2 implements z4.e {
    public final int f39788a;
    public final Object f39789b;

    public m2(Object obj, int i10) {
        this.f39788a = i10;
        this.f39789b = obj;
    }

    @Override
    public final void a(int i10) {
        switch (this.f39788a) {
            case 0:
                q2 q2Var = (q2) this.f39789b;
                q2Var.v = i10;
                q2Var.f41002c.invalidate();
                return;
            case 1:
                ((d80) this.f39789b).H = i10;
                return;
            default:
                ((xd1) this.f39789b).f43982a0.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        switch (this.f39788a) {
            case 0:
                q2 q2Var = (q2) this.f39789b;
                float measuredWidth = q2Var.f41000a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    q2Var.f41007s = com.google.android.gms.internal.vision.e2.u(q2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    q2Var.f41002c.invalidate();
                    return;
                }
                return;
            case 1:
                d80 d80Var = (d80) this.f39789b;
                org.telegram.ui.Components.va vaVar = d80Var.f36938e;
                vaVar.f31756b = f7;
                vaVar.f31757c = i10;
                vaVar.invalidate();
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
        switch (this.f39788a) {
            case 0:
                return;
            case 1:
                d80 d80Var = (d80) this.f39789b;
                if (i10 == 1) {
                    d80Var.K = true;
                    d80Var.d.getCurrentItem();
                    d80Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (d80Var.K) {
                        d80Var.K = false;
                    }
                    if (d80Var.f36943w != d80Var.d.getCurrentItem()) {
                        d80Var.f36943w = d80Var.d.getCurrentItem();
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
