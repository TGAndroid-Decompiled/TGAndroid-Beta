package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class m2 implements z4.e {
    public final int f38394a;
    public final Object f38395b;

    public m2(Object obj, int i10) {
        this.f38394a = i10;
        this.f38395b = obj;
    }

    @Override
    public final void a(int i10) {
        switch (this.f38394a) {
            case 0:
                q2 q2Var = (q2) this.f38395b;
                q2Var.v = i10;
                q2Var.f39585c.invalidate();
                return;
            case 1:
                ((c80) this.f38395b).H = i10;
                return;
            default:
                ((rd1) this.f38395b).f40038a0.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        switch (this.f38394a) {
            case 0:
                q2 q2Var = (q2) this.f38395b;
                float measuredWidth = q2Var.f39583a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    q2Var.f39590s = com.google.android.gms.internal.vision.e2.v(q2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    q2Var.f39585c.invalidate();
                    return;
                }
                return;
            case 1:
                c80 c80Var = (c80) this.f38395b;
                org.telegram.ui.Components.ta taVar = c80Var.f35368e;
                taVar.f31006b = f7;
                taVar.f31007c = i10;
                taVar.invalidate();
                float measuredWidth2 = c80Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (c80Var.H * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f38394a) {
            case 0:
                return;
            case 1:
                c80 c80Var = (c80) this.f38395b;
                if (i10 == 1) {
                    c80Var.K = true;
                    c80Var.d.getCurrentItem();
                    c80Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (c80Var.K) {
                        c80Var.K = false;
                    }
                    if (c80Var.f35373w != c80Var.d.getCurrentItem()) {
                        c80Var.f35373w = c80Var.d.getCurrentItem();
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
