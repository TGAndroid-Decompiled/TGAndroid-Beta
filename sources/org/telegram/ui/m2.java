package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class m2 implements z4.e {
    public final int f35446a;
    public final Object f35447b;

    public m2(Object obj, int i10) {
        this.f35446a = i10;
        this.f35447b = obj;
    }

    @Override
    public final void a(int i10) {
        switch (this.f35446a) {
            case 0:
                q2 q2Var = (q2) this.f35447b;
                q2Var.v = i10;
                q2Var.f36729c.invalidate();
                return;
            case 1:
                ((y70) this.f35447b).H = i10;
                return;
            default:
                ((od1) this.f35447b).f36154a0.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        switch (this.f35446a) {
            case 0:
                q2 q2Var = (q2) this.f35447b;
                float measuredWidth = q2Var.f36727a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    q2Var.f36733s = com.google.android.gms.internal.vision.e2.v(q2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    q2Var.f36729c.invalidate();
                    return;
                }
                return;
            case 1:
                y70 y70Var = (y70) this.f35447b;
                org.telegram.ui.Components.sa saVar = y70Var.e;
                saVar.f28215b = f7;
                saVar.f28216c = i10;
                saVar.invalidate();
                float measuredWidth2 = y70Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (y70Var.H * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f35446a) {
            case 0:
                return;
            case 1:
                y70 y70Var = (y70) this.f35447b;
                if (i10 == 1) {
                    y70Var.K = true;
                    y70Var.d.getCurrentItem();
                    y70Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (y70Var.K) {
                        y70Var.K = false;
                    }
                    if (y70Var.f40076w != y70Var.d.getCurrentItem()) {
                        y70Var.f40076w = y70Var.d.getCurrentItem();
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
