package org.telegram.ui.Components;

import android.view.View;
public final class ra0 implements hk0 {
    public final ua0 f29969a;

    public ra0(ua0 ua0Var) {
        this.f29969a = ua0Var;
    }

    @Override
    public final void f(int i10, View view) {
        ua0 ua0Var = this.f29969a;
        if (ua0Var.f30910a == 1 && ua0Var.f30918r.f17133f.size() > 1) {
            int f12 = ((org.telegram.messenger.kj) ua0Var.f30918r.f17133f.get(i10)).f1();
            boolean z10 = ua0Var.f30918r.f17134g.get(f12, false);
            boolean z11 = !z10;
            if (ua0Var.f30918r.f17134g.size() != 1 || !z10) {
                if (z10) {
                    ua0Var.f30918r.f17134g.delete(f12);
                } else {
                    ua0Var.f30918r.f17134g.put(f12, z11);
                }
                if (view instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) view).h3(z11, z11, true);
                }
                ua0Var.l(true);
            }
        }
    }
}
