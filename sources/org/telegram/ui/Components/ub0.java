package org.telegram.ui.Components;

import android.view.View;
public final class ub0 implements kl0 {
    public final yb0 f28673a;

    public ub0(yb0 yb0Var) {
        this.f28673a = yb0Var;
    }

    @Override
    public final void d(int i10, View view) {
        yb0 yb0Var = this.f28673a;
        if (yb0Var.f30532a == 1 && yb0Var.f30540r.previewMessages.size() > 1) {
            int id2 = yb0Var.f30540r.previewMessages.get(i10).getId();
            boolean z10 = yb0Var.f30540r.selectedIds.get(id2, false);
            boolean z11 = !z10;
            if (yb0Var.f30540r.selectedIds.size() != 1 || !z10) {
                if (z10) {
                    yb0Var.f30540r.selectedIds.delete(id2);
                } else {
                    yb0Var.f30540r.selectedIds.put(id2, z11);
                }
                if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).L3(z11, z11, true);
                }
                yb0Var.k(true);
            }
        }
    }
}
