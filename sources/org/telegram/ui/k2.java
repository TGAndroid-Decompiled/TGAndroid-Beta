package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class k2 implements z4.e {
    public final int f38670a;
    public final Object f38671b;

    public k2(Object obj, int i10) {
        this.f38670a = i10;
        this.f38671b = obj;
    }

    @Override
    public final void a(int i10) {
        switch (this.f38670a) {
            case 0:
                o2 o2Var = (o2) this.f38671b;
                o2Var.f40115x = i10;
                o2Var.d.invalidate();
                return;
            case 1:
                ((s60) this.f38671b).H = i10;
                return;
            default:
                ((m91) this.f38671b).f39541b0.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        switch (this.f38670a) {
            case 0:
                o2 o2Var = (o2) this.f38671b;
                float measuredWidth = o2Var.f40108b.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    o2Var.f40114w = c3.i0.g(o2Var.f40115x, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    o2Var.d.invalidate();
                    return;
                }
                return;
            case 1:
                s60 s60Var = (s60) this.f38671b;
                org.telegram.ui.Components.y9 y9Var = s60Var.e;
                y9Var.f32659b = f7;
                y9Var.f32660c = i10;
                y9Var.invalidate();
                float measuredWidth2 = s60Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (s60Var.H * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f38670a) {
            case 0:
                return;
            case 1:
                s60 s60Var = (s60) this.f38671b;
                if (i10 == 1) {
                    s60Var.K = true;
                    s60Var.d.getCurrentItem();
                    s60Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (s60Var.K) {
                        s60Var.K = false;
                    }
                    if (s60Var.f41391x != s60Var.d.getCurrentItem()) {
                        s60Var.f41391x = s60Var.d.getCurrentItem();
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
