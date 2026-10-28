package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class l2 implements a5.i {
    public final int f40956a;
    public final Object f40957b;

    public l2(Object obj, int i10) {
        this.f40956a = i10;
        this.f40957b = obj;
    }

    @Override
    public final void a(int i10) {
        switch (this.f40956a) {
            case 0:
                p2 p2Var = (p2) this.f40957b;
                p2Var.f42282w = i10;
                p2Var.d.invalidate();
                return;
            case 1:
                ((r70) this.f40957b).H = i10;
                return;
            default:
                ((vc1) this.f40957b).f44250b0.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        switch (this.f40956a) {
            case 0:
                p2 p2Var = (p2) this.f40957b;
                float measuredWidth = p2Var.f42276b.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    p2Var.v = c3.h0.f(p2Var.f42282w, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    p2Var.d.invalidate();
                    return;
                }
                return;
            case 1:
                r70 r70Var = (r70) this.f40957b;
                org.telegram.ui.Components.sa saVar = r70Var.e;
                saVar.f32537b = f7;
                saVar.f32538c = i10;
                saVar.invalidate();
                float measuredWidth2 = r70Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (r70Var.H * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f40956a) {
            case 0:
                return;
            case 1:
                r70 r70Var = (r70) this.f40957b;
                if (i10 == 1) {
                    r70Var.K = true;
                    r70Var.d.getCurrentItem();
                    r70Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (r70Var.K) {
                        r70Var.K = false;
                    }
                    if (r70Var.f42877w != r70Var.d.getCurrentItem()) {
                        r70Var.f42877w = r70Var.d.getCurrentItem();
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
