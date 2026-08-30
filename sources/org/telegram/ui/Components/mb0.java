package org.telegram.ui.Components;

import android.view.View;
public final class mb0 implements il0 {
    public final qb0 f26994a;

    public mb0(qb0 qb0Var) {
        this.f26994a = qb0Var;
    }

    @Override
    public final void f(int i10, View view) {
        qb0 qb0Var = this.f26994a;
        if (qb0Var.f28102a == 1 && qb0Var.f28107r.previewMessages.size() > 1) {
            int id2 = qb0Var.f28107r.previewMessages.get(i10).getId();
            boolean z4 = qb0Var.f28107r.selectedIds.get(id2, false);
            boolean z10 = !z4;
            if (qb0Var.f28107r.selectedIds.size() != 1 || !z4) {
                if (z4) {
                    qb0Var.f28107r.selectedIds.delete(id2);
                } else {
                    qb0Var.f28107r.selectedIds.put(id2, z10);
                }
                if (view instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view).L3(z10, z10, true);
                }
                qb0Var.k(true);
            }
        }
    }
}
