package org.telegram.ui.Components;

import android.view.View;
public final class kb0 implements al0 {
    public final ob0 f25576a;

    public kb0(ob0 ob0Var) {
        this.f25576a = ob0Var;
    }

    @Override
    public final void d(int i10, View view) {
        ob0 ob0Var = this.f25576a;
        if (ob0Var.f26703a == 1 && ob0Var.f26711r.previewMessages.size() > 1) {
            int id2 = ob0Var.f26711r.previewMessages.get(i10).getId();
            boolean z10 = ob0Var.f26711r.selectedIds.get(id2, false);
            boolean z11 = !z10;
            if (ob0Var.f26711r.selectedIds.size() != 1 || !z10) {
                if (z10) {
                    ob0Var.f26711r.selectedIds.delete(id2);
                } else {
                    ob0Var.f26711r.selectedIds.put(id2, z11);
                }
                if (view instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view).L3(z11, z11, true);
                }
                ob0Var.k(true);
            }
        }
    }
}
