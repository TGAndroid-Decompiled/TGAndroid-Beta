package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class k2 implements c5.h {
    public final int f48541a;
    public final Object f48542b;

    public k2(Object obj, int i7) {
        this.f48541a = i7;
        this.f48542b = obj;
    }

    @Override
    public final void a(int i7) {
        switch (this.f48541a) {
            case 0:
                o2 o2Var = (o2) this.f48542b;
                o2Var.f49769x = i7;
                o2Var.d.invalidate();
                return;
            case 1:
                ((t50) this.f48542b).I = i7;
                return;
            default:
                ((t71) this.f48542b).f51417c0.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        switch (this.f48541a) {
            case 0:
                o2 o2Var = (o2) this.f48542b;
                float measuredWidth = o2Var.f49761b.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    o2Var.f49768w = com.google.android.gms.internal.vision.e2.w(o2Var.f49769x, measuredWidth, (i7 * measuredWidth) + i10, measuredWidth);
                    o2Var.d.invalidate();
                    return;
                }
                return;
            case 1:
                t50 t50Var = (t50) this.f48542b;
                org.telegram.ui.Components.aa aaVar = t50Var.f51376e;
                aaVar.f32933b = f10;
                aaVar.f32934c = i7;
                aaVar.invalidate();
                float measuredWidth2 = t50Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i7 * measuredWidth2) + i10) - (t50Var.I * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i7) {
        switch (this.f48541a) {
            case 0:
                return;
            case 1:
                t50 t50Var = (t50) this.f48542b;
                if (i7 == 1) {
                    t50Var.L = true;
                    t50Var.d.getCurrentItem();
                    t50Var.d.getMeasuredWidth();
                    return;
                } else if (i7 == 0 || i7 == 2) {
                    if (t50Var.L) {
                        t50Var.L = false;
                    }
                    if (t50Var.f51382x != t50Var.d.getCurrentItem()) {
                        t50Var.f51382x = t50Var.d.getCurrentItem();
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

    private final void d(int i7) {
    }

    private final void e(int i7) {
    }

    private final void f(float f10, int i7, int i10) {
    }
}
