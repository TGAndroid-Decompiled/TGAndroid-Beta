package org.telegram.ui.Components;

import android.view.View;

public final class wa0 implements pk0 {

    public final ab0 f34152a;

    public wa0(ab0 ab0Var) {
        this.f34152a = ab0Var;
    }

    @Override
    public final void a(int i10, View view) {
        ab0 ab0Var = this.f34152a;
        if (ab0Var.f26712a != 1 || ab0Var.f26718r.previewMessages.size() <= 1) {
            return;
        }
        int id2 = ab0Var.f26718r.previewMessages.get(i10).getId();
        boolean z10 = ab0Var.f26718r.selectedIds.get(id2, false);
        boolean z11 = !z10;
        if (ab0Var.f26718r.selectedIds.size() == 1 && z10) {
            return;
        }
        if (z10) {
            ab0Var.f26718r.selectedIds.delete(id2);
        } else {
            ab0Var.f26718r.selectedIds.put(id2, z11);
        }
        if (view instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) view).K3(z11, z11, true);
        }
        ab0Var.k(true);
    }
}
