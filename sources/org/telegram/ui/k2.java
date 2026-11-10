package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class k2 implements c5.g {
    public final int f47137a;
    public final Object f47138b;

    public k2(Object obj, int i7) {
        this.f47137a = i7;
        this.f47138b = obj;
    }

    @Override
    public final void a(int i7) {
        switch (this.f47137a) {
            case 0:
                o2 o2Var = (o2) this.f47138b;
                o2Var.f48375x = i7;
                o2Var.d.invalidate();
                return;
            case 1:
                ((x50) this.f47138b).H = i7;
                return;
            default:
                ((x71) this.f47138b).f51566b0.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        switch (this.f47137a) {
            case 0:
                o2 o2Var = (o2) this.f47138b;
                float measuredWidth = o2Var.f48367b.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    o2Var.f48374w = com.google.android.recaptcha.internal.a.w(o2Var.f48375x, measuredWidth, (i7 * measuredWidth) + i10, measuredWidth);
                    o2Var.d.invalidate();
                    return;
                }
                return;
            case 1:
                x50 x50Var = (x50) this.f47138b;
                org.telegram.ui.Components.da daVar = x50Var.f51529e;
                daVar.f32931b = f10;
                daVar.f32932c = i7;
                daVar.invalidate();
                float measuredWidth2 = x50Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i7 * measuredWidth2) + i10) - (x50Var.H * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i7) {
        switch (this.f47137a) {
            case 0:
                return;
            case 1:
                x50 x50Var = (x50) this.f47138b;
                if (i7 == 1) {
                    x50Var.K = true;
                    x50Var.d.getCurrentItem();
                    x50Var.d.getMeasuredWidth();
                    return;
                } else if (i7 == 0 || i7 == 2) {
                    if (x50Var.K) {
                        x50Var.K = false;
                    }
                    if (x50Var.f51535x != x50Var.d.getCurrentItem()) {
                        x50Var.f51535x = x50Var.d.getCurrentItem();
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
