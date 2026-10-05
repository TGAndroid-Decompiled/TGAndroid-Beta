package org.telegram.ui.Components;

import android.view.View;
public final class yb0 implements ml0 {
    public final cc0 f33251a;

    public yb0(cc0 cc0Var) {
        this.f33251a = cc0Var;
    }

    @Override
    public final void d(int i10, View view) {
        cc0 cc0Var = this.f33251a;
        if (cc0Var.f25369a == 1 && cc0Var.f25378r.previewMessages.size() > 1) {
            int id2 = cc0Var.f25378r.previewMessages.get(i10).getId();
            boolean z10 = cc0Var.f25378r.selectedIds.get(id2, false);
            boolean z11 = !z10;
            if (cc0Var.f25378r.selectedIds.size() != 1 || !z10) {
                if (z10) {
                    cc0Var.f25378r.selectedIds.delete(id2);
                } else {
                    cc0Var.f25378r.selectedIds.put(id2, z11);
                }
                if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).L3(z11, z11, true);
                }
                cc0Var.k(true);
            }
        }
    }
}
