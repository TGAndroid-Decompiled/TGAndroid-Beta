package org.telegram.ui.Components;

import android.view.View;
public final class ka0 implements qj0 {
    public final na0 f36697a;

    public ka0(na0 na0Var) {
        this.f36697a = na0Var;
    }

    @Override
    public final void b(int i7, View view) {
        na0 na0Var = this.f36697a;
        if (na0Var.f37736a == 1 && na0Var.f37746r.f24555f.size() > 1) {
            int e12 = ((org.telegram.messenger.fj) na0Var.f37746r.f24555f.get(i7)).e1();
            boolean z10 = na0Var.f37746r.f24556g.get(e12, false);
            boolean z11 = !z10;
            if (na0Var.f37746r.f24556g.size() != 1 || !z10) {
                if (z10) {
                    na0Var.f37746r.f24556g.delete(e12);
                } else {
                    na0Var.f37746r.f24556g.put(e12, z11);
                }
                if (view instanceof org.telegram.ui.Cells.r1) {
                    ((org.telegram.ui.Cells.r1) view).n3(z11, z11, true);
                }
                na0Var.l(true);
            }
        }
    }
}
