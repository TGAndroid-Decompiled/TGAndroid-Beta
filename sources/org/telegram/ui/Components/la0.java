package org.telegram.ui.Components;

import android.view.View;
public final class la0 implements oj0 {
    public final oa0 f37089a;

    public la0(oa0 oa0Var) {
        this.f37089a = oa0Var;
    }

    @Override
    public final void c(int i7, View view) {
        oa0 oa0Var = this.f37089a;
        if (oa0Var.f38039a == 1 && oa0Var.f38049r.f24456f.size() > 1) {
            int e12 = ((org.telegram.messenger.fj) oa0Var.f38049r.f24456f.get(i7)).e1();
            boolean z10 = oa0Var.f38049r.f24457g.get(e12, false);
            boolean z11 = !z10;
            if (oa0Var.f38049r.f24457g.size() != 1 || !z10) {
                if (z10) {
                    oa0Var.f38049r.f24457g.delete(e12);
                } else {
                    oa0Var.f38049r.f24457g.put(e12, z11);
                }
                if (view instanceof org.telegram.ui.Cells.r1) {
                    ((org.telegram.ui.Cells.r1) view).n3(z11, z11, true);
                }
                oa0Var.l(true);
            }
        }
    }
}
