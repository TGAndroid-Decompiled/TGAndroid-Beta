package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class l2 implements z4.e {
    public final int f35424a;
    public final Object f35425b;

    public l2(Object obj, int i10) {
        this.f35424a = i10;
        this.f35425b = obj;
    }

    @Override
    public final void a(int i10) {
        switch (this.f35424a) {
            case 0:
                p2 p2Var = (p2) this.f35425b;
                p2Var.v = i10;
                p2Var.f36494c.invalidate();
                return;
            case 1:
                ((f80) this.f35425b).H = i10;
                return;
            default:
                ((xd1) this.f35425b).f39532a0.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        switch (this.f35424a) {
            case 0:
                p2 p2Var = (p2) this.f35425b;
                float measuredWidth = p2Var.f36492a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    p2Var.f36498s = com.google.android.gms.internal.vision.e2.v(p2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    p2Var.f36494c.invalidate();
                    return;
                }
                return;
            case 1:
                f80 f80Var = (f80) this.f35425b;
                org.telegram.ui.Components.qa qaVar = f80Var.e;
                qaVar.f27249b = f7;
                qaVar.f27250c = i10;
                qaVar.invalidate();
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
        switch (this.f35424a) {
            case 0:
                return;
            case 1:
                f80 f80Var = (f80) this.f35425b;
                if (i10 == 1) {
                    f80Var.K = true;
                    f80Var.d.getCurrentItem();
                    f80Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (f80Var.K) {
                        f80Var.K = false;
                    }
                    if (f80Var.f33581w != f80Var.d.getCurrentItem()) {
                        f80Var.f33581w = f80Var.d.getCurrentItem();
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
