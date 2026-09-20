package org.telegram.ui.Components;

import android.view.View;
public final class tb0 implements jl0 {
    public final xb0 f28355a;

    public tb0(xb0 xb0Var) {
        this.f28355a = xb0Var;
    }

    @Override
    public final void d(int i10, View view) {
        xb0 xb0Var = this.f28355a;
        if (xb0Var.f30224a == 1 && xb0Var.f30232r.previewMessages.size() > 1) {
            int id2 = xb0Var.f30232r.previewMessages.get(i10).getId();
            boolean z10 = xb0Var.f30232r.selectedIds.get(id2, false);
            boolean z11 = !z10;
            if (xb0Var.f30232r.selectedIds.size() != 1 || !z10) {
                if (z10) {
                    xb0Var.f30232r.selectedIds.delete(id2);
                } else {
                    xb0Var.f30232r.selectedIds.put(id2, z11);
                }
                if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).L3(z11, z11, true);
                }
                xb0Var.k(true);
            }
        }
    }
}
