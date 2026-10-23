package org.telegram.ui.Components;

import android.view.View;
public final class hc0 implements am0 {
    public final lc0 f26883a;

    public hc0(lc0 lc0Var) {
        this.f26883a = lc0Var;
    }

    @Override
    public final void d(int i10, View view) {
        lc0 lc0Var = this.f26883a;
        if (lc0Var.f28335a == 1 && lc0Var.f28343r.previewMessages.size() > 1) {
            int id2 = lc0Var.f28343r.previewMessages.get(i10).getId();
            boolean z10 = lc0Var.f28343r.selectedIds.get(id2, false);
            boolean z11 = !z10;
            if (lc0Var.f28343r.selectedIds.size() != 1 || !z10) {
                if (z10) {
                    lc0Var.f28343r.selectedIds.delete(id2);
                } else {
                    lc0Var.f28343r.selectedIds.put(id2, z11);
                }
                if (view instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view).K3(z11, z11, true);
                }
                lc0Var.l(true);
            }
        }
    }
}
