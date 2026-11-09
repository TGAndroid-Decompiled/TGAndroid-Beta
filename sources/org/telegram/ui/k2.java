package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class k2 implements c5.g {
    public final int f47160a;
    public final Object f47161b;

    public k2(Object obj, int i7) {
        this.f47160a = i7;
        this.f47161b = obj;
    }

    @Override
    public final void a(int i7) {
        switch (this.f47160a) {
            case 0:
                o2 o2Var = (o2) this.f47161b;
                o2Var.f48302x = i7;
                o2Var.d.invalidate();
                return;
            case 1:
                ((w50) this.f47161b).H = i7;
                return;
            default:
                ((w71) this.f47161b).f50907b0.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        switch (this.f47160a) {
            case 0:
                o2 o2Var = (o2) this.f47161b;
                float measuredWidth = o2Var.f48294b.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    o2Var.f48301w = com.google.android.recaptcha.internal.a.w(o2Var.f48302x, measuredWidth, (i7 * measuredWidth) + i10, measuredWidth);
                    o2Var.d.invalidate();
                    return;
                }
                return;
            case 1:
                w50 w50Var = (w50) this.f47161b;
                org.telegram.ui.Components.ea eaVar = w50Var.f50872e;
                eaVar.f33346b = f10;
                eaVar.f33347c = i7;
                eaVar.invalidate();
                float measuredWidth2 = w50Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i7 * measuredWidth2) + i10) - (w50Var.H * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i7) {
        switch (this.f47160a) {
            case 0:
                return;
            case 1:
                w50 w50Var = (w50) this.f47161b;
                if (i7 == 1) {
                    w50Var.K = true;
                    w50Var.d.getCurrentItem();
                    w50Var.d.getMeasuredWidth();
                    return;
                } else if (i7 == 0 || i7 == 2) {
                    if (w50Var.K) {
                        w50Var.K = false;
                    }
                    if (w50Var.f50878x != w50Var.d.getCurrentItem()) {
                        w50Var.f50878x = w50Var.d.getCurrentItem();
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
