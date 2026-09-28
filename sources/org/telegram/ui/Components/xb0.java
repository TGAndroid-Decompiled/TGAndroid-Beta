package org.telegram.ui.Components;

import android.view.View;
public final class xb0 implements ml0 {
    public final bc0 f30362a;

    public xb0(bc0 bc0Var) {
        this.f30362a = bc0Var;
    }

    @Override
    public final void d(int i10, View view) {
        bc0 bc0Var = this.f30362a;
        if (bc0Var.f22946a == 1 && bc0Var.f22954r.previewMessages.size() > 1) {
            int id2 = bc0Var.f22954r.previewMessages.get(i10).getId();
            boolean z10 = bc0Var.f22954r.selectedIds.get(id2, false);
            boolean z11 = !z10;
            if (bc0Var.f22954r.selectedIds.size() != 1 || !z10) {
                if (z10) {
                    bc0Var.f22954r.selectedIds.delete(id2);
                } else {
                    bc0Var.f22954r.selectedIds.put(id2, z11);
                }
                if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).L3(z11, z11, true);
                }
                bc0Var.k(true);
            }
        }
    }
}
