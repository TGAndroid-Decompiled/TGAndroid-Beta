package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class o2 implements m2.f {
    public final int f39505a;
    public final Object f39506b;

    public o2(Object obj, int i10) {
        this.f39505a = i10;
        this.f39506b = obj;
    }

    @Override
    public final void a(int i10) {
        switch (this.f39505a) {
            case 0:
                s2 s2Var = (s2) this.f39506b;
                s2Var.v = i10;
                s2Var.f40989c.invalidate();
                return;
            case 1:
                ((v70) this.f39506b).E = i10;
                return;
            default:
                ((jd1) this.f39506b).X.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        switch (this.f39505a) {
            case 0:
                s2 s2Var = (s2) this.f39506b;
                float measuredWidth = s2Var.f40987a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    s2Var.f40994s = e2.c.d(s2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    s2Var.f40989c.invalidate();
                    return;
                }
                return;
            case 1:
                v70 v70Var = (v70) this.f39506b;
                org.telegram.ui.Components.ka kaVar = v70Var.f42021e;
                kaVar.f28374b = f10;
                kaVar.f28375c = i10;
                kaVar.invalidate();
                float measuredWidth2 = v70Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (v70Var.E * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f39505a) {
            case 0:
                return;
            case 1:
                v70 v70Var = (v70) this.f39506b;
                if (i10 == 1) {
                    v70Var.H = true;
                    v70Var.d.getCurrentItem();
                    v70Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (v70Var.H) {
                        v70Var.H = false;
                    }
                    if (v70Var.f42026w != v70Var.d.getCurrentItem()) {
                        v70Var.f42026w = v70Var.d.getCurrentItem();
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
