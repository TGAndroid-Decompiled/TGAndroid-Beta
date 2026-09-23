package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class m2 implements z4.e {
    public final int f35126a;
    public final Object f35127b;

    public m2(Object obj, int i10) {
        this.f35126a = i10;
        this.f35127b = obj;
    }

    @Override
    public final void a(int i10) {
        switch (this.f35126a) {
            case 0:
                q2 q2Var = (q2) this.f35127b;
                q2Var.v = i10;
                q2Var.f36245c.invalidate();
                return;
            case 1:
                ((a80) this.f35127b).H = i10;
                return;
            default:
                ((od1) this.f35127b).f35781a0.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        switch (this.f35126a) {
            case 0:
                q2 q2Var = (q2) this.f35127b;
                float measuredWidth = q2Var.f36243a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    q2Var.f36249s = com.google.android.gms.internal.vision.e2.v(q2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    q2Var.f36245c.invalidate();
                    return;
                }
                return;
            case 1:
                a80 a80Var = (a80) this.f35127b;
                org.telegram.ui.Components.sa saVar = a80Var.e;
                saVar.f27887b = f7;
                saVar.f27888c = i10;
                saVar.invalidate();
                float measuredWidth2 = a80Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (a80Var.H * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f35126a) {
            case 0:
                return;
            case 1:
                a80 a80Var = (a80) this.f35127b;
                if (i10 == 1) {
                    a80Var.K = true;
                    a80Var.d.getCurrentItem();
                    a80Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (a80Var.K) {
                        a80Var.K = false;
                    }
                    if (a80Var.f31701w != a80Var.d.getCurrentItem()) {
                        a80Var.f31701w = a80Var.d.getCurrentItem();
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
