package org.telegram.ui.Components;

import android.view.View;
public final class hb0 implements zk0 {
    public final lb0 f29160a;

    public hb0(lb0 lb0Var) {
        this.f29160a = lb0Var;
    }

    @Override
    public final void c(int i10, View view) {
        lb0 lb0Var = this.f29160a;
        if (lb0Var.f30273a == 1 && lb0Var.f30279r.previewMessages.size() > 1) {
            int id2 = lb0Var.f30279r.previewMessages.get(i10).getId();
            boolean z10 = lb0Var.f30279r.selectedIds.get(id2, false);
            boolean z11 = !z10;
            if (lb0Var.f30279r.selectedIds.size() != 1 || !z10) {
                if (z10) {
                    lb0Var.f30279r.selectedIds.delete(id2);
                } else {
                    lb0Var.f30279r.selectedIds.put(id2, z11);
                }
                if (view instanceof org.telegram.ui.Cells.s1) {
                    ((org.telegram.ui.Cells.s1) view).L3(z11, z11, true);
                }
                lb0Var.k(true);
            }
        }
    }
}
