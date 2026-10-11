package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class l2 implements z4.e {
    public final int f39522a;
    public final Object f39523b;

    public l2(Object obj, int i10) {
        this.f39522a = i10;
        this.f39523b = obj;
    }

    @Override
    public final void a(int i10) {
        switch (this.f39522a) {
            case 0:
                p2 p2Var = (p2) this.f39523b;
                p2Var.v = i10;
                p2Var.f40722c.invalidate();
                return;
            case 1:
                ((c80) this.f39523b).H = i10;
                return;
            default:
                ((wd1) this.f39523b).f43360a0.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        switch (this.f39522a) {
            case 0:
                p2 p2Var = (p2) this.f39523b;
                float measuredWidth = p2Var.f40720a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    p2Var.f40727s = com.google.android.gms.internal.vision.e2.u(p2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    p2Var.f40722c.invalidate();
                    return;
                }
                return;
            case 1:
                c80 c80Var = (c80) this.f39523b;
                org.telegram.ui.Components.ua uaVar = c80Var.f36664e;
                uaVar.f31485b = f7;
                uaVar.f31486c = i10;
                uaVar.invalidate();
                float measuredWidth2 = c80Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (c80Var.H * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f39522a) {
            case 0:
                return;
            case 1:
                c80 c80Var = (c80) this.f39523b;
                if (i10 == 1) {
                    c80Var.K = true;
                    c80Var.d.getCurrentItem();
                    c80Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (c80Var.K) {
                        c80Var.K = false;
                    }
                    if (c80Var.f36669w != c80Var.d.getCurrentItem()) {
                        c80Var.f36669w = c80Var.d.getCurrentItem();
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
