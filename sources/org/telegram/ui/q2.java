package org.telegram.ui;

import org.telegram.messenger.Intro;

public final class q2 implements m2.e {

    public final int f41489a;

    public final Object f41490b;

    public q2(Object obj, int i10) {
        this.f41489a = i10;
        this.f41490b = obj;
    }

    @Override
    public final void b(int i10) {
        switch (this.f41489a) {
            case 0:
                u2 u2Var = (u2) this.f41490b;
                u2Var.v = i10;
                u2Var.f43070c.invalidate();
                break;
            case 1:
                ((l70) this.f41490b).D = i10;
                break;
            default:
                ((nc1) this.f41490b).W.invalidate();
                break;
        }
    }

    @Override
    public final void c(float f10, int i10, int i11) {
        switch (this.f41489a) {
            case 0:
                u2 u2Var = (u2) this.f41490b;
                float measuredWidth = u2Var.f43068a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    u2Var.f43075s = com.google.android.recaptcha.internal.a.w(u2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    u2Var.f43070c.invalidate();
                    break;
                }
                break;
            case 1:
                l70 l70Var = (l70) this.f41490b;
                org.telegram.ui.Components.ia iaVar = l70Var.f39965e;
                iaVar.f29320b = f10;
                iaVar.f29321c = i10;
                iaVar.invalidate();
                float measuredWidth2 = l70Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (l70Var.D * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
        }
    }

    @Override
    public final void d(int i10) {
        switch (this.f41489a) {
            case 1:
                l70 l70Var = (l70) this.f41490b;
                if (i10 == 1) {
                    l70Var.G = true;
                    l70Var.d.getCurrentItem();
                    l70Var.d.getMeasuredWidth();
                } else if (i10 == 0 || i10 == 2) {
                    if (l70Var.G) {
                        l70Var.G = false;
                    }
                    if (l70Var.f39970w != l70Var.d.getCurrentItem()) {
                        l70Var.f39970w = l70Var.d.getCurrentItem();
                    }
                }
                break;
        }
    }

    private final void a(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(float f10, int i10, int i11) {
    }
}
