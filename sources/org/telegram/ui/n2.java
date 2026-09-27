package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class n2 implements z4.e {
    public final int f35791a;
    public final Object f35792b;

    public n2(Object obj, int i10) {
        this.f35791a = i10;
        this.f35792b = obj;
    }

    @Override
    public final void a(int i10) {
        switch (this.f35791a) {
            case 0:
                r2 r2Var = (r2) this.f35792b;
                r2Var.v = i10;
                r2Var.f36952c.invalidate();
                return;
            case 1:
                ((b80) this.f35792b).H = i10;
                return;
            default:
                ((pd1) this.f35792b).f36391a0.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        switch (this.f35791a) {
            case 0:
                r2 r2Var = (r2) this.f35792b;
                float measuredWidth = r2Var.f36950a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    r2Var.f36956s = com.google.android.gms.internal.vision.e2.v(r2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    r2Var.f36952c.invalidate();
                    return;
                }
                return;
            case 1:
                b80 b80Var = (b80) this.f35792b;
                org.telegram.ui.Components.sa saVar = b80Var.e;
                saVar.f28213b = f7;
                saVar.f28214c = i10;
                saVar.invalidate();
                float measuredWidth2 = b80Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (b80Var.H * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f35791a) {
            case 0:
                return;
            case 1:
                b80 b80Var = (b80) this.f35792b;
                if (i10 == 1) {
                    b80Var.K = true;
                    b80Var.d.getCurrentItem();
                    b80Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (b80Var.K) {
                        b80Var.K = false;
                    }
                    if (b80Var.f32286w != b80Var.d.getCurrentItem()) {
                        b80Var.f32286w = b80Var.d.getCurrentItem();
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
