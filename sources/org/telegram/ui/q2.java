package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class q2 implements m2.f {
    public final int f37283a;
    public final Object f37284b;

    public q2(Object obj, int i10) {
        this.f37283a = i10;
        this.f37284b = obj;
    }

    @Override
    public final void a(int i10) {
        switch (this.f37283a) {
            case 0:
                u2 u2Var = (u2) this.f37284b;
                u2Var.v = i10;
                u2Var.f38665c.invalidate();
                return;
            case 1:
                ((w70) this.f37284b).E = i10;
                return;
            default:
                ((jd1) this.f37284b).X.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        switch (this.f37283a) {
            case 0:
                u2 u2Var = (u2) this.f37284b;
                float measuredWidth = u2Var.f38663a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    u2Var.f38669s = e2.c.d(u2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    u2Var.f38665c.invalidate();
                    return;
                }
                return;
            case 1:
                w70 w70Var = (w70) this.f37284b;
                org.telegram.ui.Components.ka kaVar = w70Var.e;
                kaVar.f26241b = f10;
                kaVar.f26242c = i10;
                kaVar.invalidate();
                float measuredWidth2 = w70Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (w70Var.E * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f37283a) {
            case 0:
                return;
            case 1:
                w70 w70Var = (w70) this.f37284b;
                if (i10 == 1) {
                    w70Var.H = true;
                    w70Var.d.getCurrentItem();
                    w70Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (w70Var.H) {
                        w70Var.H = false;
                    }
                    if (w70Var.f39294w != w70Var.d.getCurrentItem()) {
                        w70Var.f39294w = w70Var.d.getCurrentItem();
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

    private final void f(float f10, int i10, int i11) {
    }
}
