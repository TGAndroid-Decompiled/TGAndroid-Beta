package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class m2 implements z4.e {
    public final int f39887a;
    public final Object f39888b;

    public m2(Object obj, int i10) {
        this.f39887a = i10;
        this.f39888b = obj;
    }

    @Override
    public final void a(int i10) {
        switch (this.f39887a) {
            case 0:
                q2 q2Var = (q2) this.f39888b;
                q2Var.v = i10;
                q2Var.f41142c.invalidate();
                return;
            case 1:
                ((f80) this.f39888b).H = i10;
                return;
            default:
                ((zd1) this.f39888b).f44730a0.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        switch (this.f39887a) {
            case 0:
                q2 q2Var = (q2) this.f39888b;
                float measuredWidth = q2Var.f41140a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    q2Var.f41147s = com.google.android.gms.internal.vision.e2.u(q2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    q2Var.f41142c.invalidate();
                    return;
                }
                return;
            case 1:
                f80 f80Var = (f80) this.f39888b;
                org.telegram.ui.Components.ua uaVar = f80Var.f37668e;
                uaVar.f31123b = f7;
                uaVar.f31124c = i10;
                uaVar.invalidate();
                float measuredWidth2 = f80Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (f80Var.H * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f39887a) {
            case 0:
                return;
            case 1:
                f80 f80Var = (f80) this.f39888b;
                if (i10 == 1) {
                    f80Var.K = true;
                    f80Var.d.getCurrentItem();
                    f80Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (f80Var.K) {
                        f80Var.K = false;
                    }
                    if (f80Var.f37673w != f80Var.d.getCurrentItem()) {
                        f80Var.f37673w = f80Var.d.getCurrentItem();
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
