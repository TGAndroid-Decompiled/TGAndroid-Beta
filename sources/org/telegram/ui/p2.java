package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class p2 implements m2.e {
    public final int f41313a;
    public final Object f41314b;

    public p2(Object obj, int i9) {
        this.f41313a = i9;
        this.f41314b = obj;
    }

    @Override
    public final void b(int i9) {
        switch (this.f41313a) {
            case 0:
                t2 t2Var = (t2) this.f41314b;
                t2Var.v = i9;
                t2Var.f42813c.invalidate();
                return;
            case 1:
                ((i70) this.f41314b).D = i9;
                return;
            default:
                ((oc1) this.f41314b).W.invalidate();
                return;
        }
    }

    @Override
    public final void c(float f10, int i9, int i10) {
        switch (this.f41313a) {
            case 0:
                t2 t2Var = (t2) this.f41314b;
                float measuredWidth = t2Var.f42811a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    t2Var.f42818s = e2.c.d(t2Var.v, measuredWidth, (i9 * measuredWidth) + i10, measuredWidth);
                    t2Var.f42813c.invalidate();
                    return;
                }
                return;
            case 1:
                i70 i70Var = (i70) this.f41314b;
                org.telegram.ui.Components.ka kaVar = i70Var.f39046e;
                kaVar.f30044b = f10;
                kaVar.f30045c = i9;
                kaVar.invalidate();
                float measuredWidth2 = i70Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i9 * measuredWidth2) + i10) - (i70Var.D * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void d(int i9) {
        switch (this.f41313a) {
            case 0:
                return;
            case 1:
                i70 i70Var = (i70) this.f41314b;
                if (i9 == 1) {
                    i70Var.G = true;
                    i70Var.d.getCurrentItem();
                    i70Var.d.getMeasuredWidth();
                    return;
                } else if (i9 == 0 || i9 == 2) {
                    if (i70Var.G) {
                        i70Var.G = false;
                    }
                    if (i70Var.f39051w != i70Var.d.getCurrentItem()) {
                        i70Var.f39051w = i70Var.d.getCurrentItem();
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

    private final void a(int i9) {
    }

    private final void e(int i9) {
    }

    private final void f(float f10, int i9, int i10) {
    }
}
