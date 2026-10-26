package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class l2 implements a5.i {
    public final int f41118a;
    public final Object f41119b;

    public l2(Object obj, int i10) {
        this.f41118a = i10;
        this.f41119b = obj;
    }

    @Override
    public final void a(int i10) {
        switch (this.f41118a) {
            case 0:
                p2 p2Var = (p2) this.f41119b;
                p2Var.f42333w = i10;
                p2Var.d.invalidate();
                return;
            case 1:
                ((p70) this.f41119b).H = i10;
                return;
            default:
                ((tc1) this.f41119b).f43740b0.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        switch (this.f41118a) {
            case 0:
                p2 p2Var = (p2) this.f41119b;
                float measuredWidth = p2Var.f42327b.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    p2Var.v = c3.h0.f(p2Var.f42333w, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    p2Var.d.invalidate();
                    return;
                }
                return;
            case 1:
                p70 p70Var = (p70) this.f41119b;
                org.telegram.ui.Components.sa saVar = p70Var.e;
                saVar.f32495b = f7;
                saVar.f32496c = i10;
                saVar.invalidate();
                float measuredWidth2 = p70Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (p70Var.H * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f41118a) {
            case 0:
                return;
            case 1:
                p70 p70Var = (p70) this.f41119b;
                if (i10 == 1) {
                    p70Var.K = true;
                    p70Var.d.getCurrentItem();
                    p70Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (p70Var.K) {
                        p70Var.K = false;
                    }
                    if (p70Var.f42389w != p70Var.d.getCurrentItem()) {
                        p70Var.f42389w = p70Var.d.getCurrentItem();
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
