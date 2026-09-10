package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class n2 implements z4.e {
    public final int f35096a;
    public final Object f35097b;

    public n2(Object obj, int i10) {
        this.f35096a = i10;
        this.f35097b = obj;
    }

    @Override
    public final void a(int i10) {
        switch (this.f35096a) {
            case 0:
                r2 r2Var = (r2) this.f35097b;
                r2Var.v = i10;
                r2Var.f36173c.invalidate();
                return;
            case 1:
                ((c80) this.f35097b).H = i10;
                return;
            default:
                ((ae1) this.f35097b).f30915a0.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        switch (this.f35096a) {
            case 0:
                r2 r2Var = (r2) this.f35097b;
                float measuredWidth = r2Var.f36171a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    r2Var.f36177s = com.google.android.gms.internal.vision.e2.v(r2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    r2Var.f36173c.invalidate();
                    return;
                }
                return;
            case 1:
                c80 c80Var = (c80) this.f35097b;
                org.telegram.ui.Components.ra raVar = c80Var.e;
                raVar.f26641b = f7;
                raVar.f26642c = i10;
                raVar.invalidate();
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
        switch (this.f35096a) {
            case 0:
                return;
            case 1:
                c80 c80Var = (c80) this.f35097b;
                if (i10 == 1) {
                    c80Var.K = true;
                    c80Var.d.getCurrentItem();
                    c80Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (c80Var.K) {
                        c80Var.K = false;
                    }
                    if (c80Var.f31568w != c80Var.d.getCurrentItem()) {
                        c80Var.f31568w = c80Var.d.getCurrentItem();
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
