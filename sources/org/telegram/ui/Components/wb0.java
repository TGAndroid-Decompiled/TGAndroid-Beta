package org.telegram.ui.Components;

import android.view.View;
public final class wb0 implements ml0 {
    public final ac0 f29992a;

    public wb0(ac0 ac0Var) {
        this.f29992a = ac0Var;
    }

    @Override
    public final void d(int i10, View view) {
        ac0 ac0Var = this.f29992a;
        if (ac0Var.f22620a == 1 && ac0Var.f22628r.previewMessages.size() > 1) {
            int id2 = ac0Var.f22628r.previewMessages.get(i10).getId();
            boolean z10 = ac0Var.f22628r.selectedIds.get(id2, false);
            boolean z11 = !z10;
            if (ac0Var.f22628r.selectedIds.size() != 1 || !z10) {
                if (z10) {
                    ac0Var.f22628r.selectedIds.delete(id2);
                } else {
                    ac0Var.f22628r.selectedIds.put(id2, z11);
                }
                if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).L3(z11, z11, true);
                }
                ac0Var.k(true);
            }
        }
    }
}
