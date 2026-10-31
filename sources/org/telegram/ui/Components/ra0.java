package org.telegram.ui.Components;

import android.view.View;
public final class ra0 implements gk0 {
    public final ua0 f29891a;

    public ra0(ua0 ua0Var) {
        this.f29891a = ua0Var;
    }

    @Override
    public final void f(int i10, View view) {
        ua0 ua0Var = this.f29891a;
        if (ua0Var.f30876a == 1 && ua0Var.f30884r.f16749f.size() > 1) {
            int f12 = ((org.telegram.messenger.jj) ua0Var.f30884r.f16749f.get(i10)).f1();
            boolean z10 = ua0Var.f30884r.f16750g.get(f12, false);
            boolean z11 = !z10;
            if (ua0Var.f30884r.f16750g.size() != 1 || !z10) {
                if (z10) {
                    ua0Var.f30884r.f16750g.delete(f12);
                } else {
                    ua0Var.f30884r.f16750g.put(f12, z11);
                }
                if (view instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) view).h3(z11, z11, true);
                }
                ua0Var.l(true);
            }
        }
    }
}
