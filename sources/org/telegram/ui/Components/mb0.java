package org.telegram.ui.Components;

import android.view.View;
public final class mb0 implements zk0 {
    public final qb0 f28432a;

    public mb0(qb0 qb0Var) {
        this.f28432a = qb0Var;
    }

    @Override
    public final void a(int i10, View view) {
        qb0 qb0Var = this.f28432a;
        if (qb0Var.f29658a == 1 && qb0Var.f29667r.previewMessages.size() > 1) {
            int id2 = qb0Var.f29667r.previewMessages.get(i10).getId();
            boolean z10 = qb0Var.f29667r.selectedIds.get(id2, false);
            boolean z11 = !z10;
            if (qb0Var.f29667r.selectedIds.size() != 1 || !z10) {
                if (z10) {
                    qb0Var.f29667r.selectedIds.delete(id2);
                } else {
                    qb0Var.f29667r.selectedIds.put(id2, z11);
                }
                if (view instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view).L3(z11, z11, true);
                }
                qb0Var.k(true);
            }
        }
    }
}
