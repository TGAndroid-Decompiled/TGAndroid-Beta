package org.telegram.ui.Components;

import android.view.View;
public final class pc0 implements km0 {
    public final tc0 f29484a;

    public pc0(tc0 tc0Var) {
        this.f29484a = tc0Var;
    }

    @Override
    public final void d(int i10, View view) {
        tc0 tc0Var = this.f29484a;
        if (tc0Var.f30851a == 1 && tc0Var.f30860r.previewMessages.size() > 1) {
            int id2 = tc0Var.f30860r.previewMessages.get(i10).getId();
            boolean z10 = tc0Var.f30860r.selectedIds.get(id2, false);
            boolean z11 = !z10;
            if (tc0Var.f30860r.selectedIds.size() != 1 || !z10) {
                if (z10) {
                    tc0Var.f30860r.selectedIds.delete(id2);
                } else {
                    tc0Var.f30860r.selectedIds.put(id2, z11);
                }
                if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).L3(z11, z11, true);
                }
                tc0Var.k(true);
            }
        }
    }
}
