package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class o2 implements z4.e {
    public final int f38840a;
    public final Object f38841b;

    public o2(Object obj, int i10) {
        this.f38840a = i10;
        this.f38841b = obj;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        switch (this.f38840a) {
            case 0:
                s2 s2Var = (s2) this.f38841b;
                float measuredWidth = s2Var.f39931a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    s2Var.f39937s = com.google.android.gms.internal.play_billing.k3.c(s2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    s2Var.f39933c.invalidate();
                    return;
                }
                return;
            case 1:
                h80 h80Var = (h80) this.f38841b;
                org.telegram.ui.Components.ua uaVar = h80Var.e;
                uaVar.f29615b = f7;
                uaVar.f29616c = i10;
                uaVar.invalidate();
                float measuredWidth2 = h80Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (h80Var.H * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(int i10) {
        switch (this.f38840a) {
            case 0:
                s2 s2Var = (s2) this.f38841b;
                s2Var.v = i10;
                s2Var.f39933c.invalidate();
                return;
            case 1:
                ((h80) this.f38841b).H = i10;
                return;
            default:
                ((ce1) this.f38841b).f34854a0.invalidate();
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f38840a) {
            case 0:
                return;
            case 1:
                h80 h80Var = (h80) this.f38841b;
                if (i10 == 1) {
                    h80Var.K = true;
                    h80Var.d.getCurrentItem();
                    h80Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (h80Var.K) {
                        h80Var.K = false;
                    }
                    if (h80Var.f36654w != h80Var.d.getCurrentItem()) {
                        h80Var.f36654w = h80Var.d.getCurrentItem();
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
