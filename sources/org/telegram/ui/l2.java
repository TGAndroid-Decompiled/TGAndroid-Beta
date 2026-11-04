package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class l2 implements b5.h {
    public final int f47075a;
    public final Object f47076b;

    public l2(Object obj, int i3) {
        this.f47075a = i3;
        this.f47076b = obj;
    }

    @Override
    public final void a(int i3) {
        switch (this.f47075a) {
            case 0:
                p2 p2Var = (p2) this.f47076b;
                p2Var.f48420x = i3;
                p2Var.d.invalidate();
                return;
            case 1:
                ((o50) this.f47076b).I = i3;
                return;
            default:
                ((l71) this.f47076b).f47150c0.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f10, int i3, int i10) {
        switch (this.f47075a) {
            case 0:
                p2 p2Var = (p2) this.f47076b;
                float measuredWidth = p2Var.f48412b.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    p2Var.f48419w = com.google.android.recaptcha.internal.a.c(p2Var.f48420x, measuredWidth, (i3 * measuredWidth) + i10, measuredWidth);
                    p2Var.d.invalidate();
                    return;
                }
                return;
            case 1:
                o50 o50Var = (o50) this.f47076b;
                org.telegram.ui.Components.da daVar = o50Var.f48191e;
                daVar.f33027b = f10;
                daVar.f33028c = i3;
                daVar.invalidate();
                float measuredWidth2 = o50Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i3 * measuredWidth2) + i10) - (o50Var.I * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i3) {
        switch (this.f47075a) {
            case 0:
                return;
            case 1:
                o50 o50Var = (o50) this.f47076b;
                if (i3 == 1) {
                    o50Var.L = true;
                    o50Var.d.getCurrentItem();
                    o50Var.d.getMeasuredWidth();
                    return;
                } else if (i3 == 0 || i3 == 2) {
                    if (o50Var.L) {
                        o50Var.L = false;
                    }
                    if (o50Var.f48197x != o50Var.d.getCurrentItem()) {
                        o50Var.f48197x = o50Var.d.getCurrentItem();
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

    private final void d(int i3) {
    }

    private final void e(int i3) {
    }

    private final void f(float f10, int i3, int i10) {
    }
}
