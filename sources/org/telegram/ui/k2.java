package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class k2 implements c5.g {
    public final int f47082a;
    public final Object f47083b;

    public k2(Object obj, int i7) {
        this.f47082a = i7;
        this.f47083b = obj;
    }

    @Override
    public final void a(int i7) {
        switch (this.f47082a) {
            case 0:
                o2 o2Var = (o2) this.f47083b;
                o2Var.f48219x = i7;
                o2Var.d.invalidate();
                return;
            case 1:
                ((u50) this.f47083b).H = i7;
                return;
            default:
                ((u71) this.f47083b).f50271b0.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        switch (this.f47082a) {
            case 0:
                o2 o2Var = (o2) this.f47083b;
                float measuredWidth = o2Var.f48211b.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    o2Var.f48218w = com.google.android.recaptcha.internal.a.w(o2Var.f48219x, measuredWidth, (i7 * measuredWidth) + i10, measuredWidth);
                    o2Var.d.invalidate();
                    return;
                }
                return;
            case 1:
                u50 u50Var = (u50) this.f47083b;
                org.telegram.ui.Components.ea eaVar = u50Var.f50231e;
                eaVar.f33181b = f10;
                eaVar.f33182c = i7;
                eaVar.invalidate();
                float measuredWidth2 = u50Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i7 * measuredWidth2) + i10) - (u50Var.H * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i7) {
        switch (this.f47082a) {
            case 0:
                return;
            case 1:
                u50 u50Var = (u50) this.f47083b;
                if (i7 == 1) {
                    u50Var.K = true;
                    u50Var.d.getCurrentItem();
                    u50Var.d.getMeasuredWidth();
                    return;
                } else if (i7 == 0 || i7 == 2) {
                    if (u50Var.K) {
                        u50Var.K = false;
                    }
                    if (u50Var.f50237x != u50Var.d.getCurrentItem()) {
                        u50Var.f50237x = u50Var.d.getCurrentItem();
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
