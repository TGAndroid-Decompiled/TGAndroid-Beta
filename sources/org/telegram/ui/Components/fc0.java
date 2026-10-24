package org.telegram.ui.Components;

import android.view.View;
public final class fc0 implements zl0 {
    public final jc0 f26287a;

    public fc0(jc0 jc0Var) {
        this.f26287a = jc0Var;
    }

    @Override
    public final void d(int i10, View view) {
        jc0 jc0Var = this.f26287a;
        if (jc0Var.f27669a == 1 && jc0Var.f27677r.previewMessages.size() > 1) {
            int id2 = jc0Var.f27677r.previewMessages.get(i10).getId();
            boolean z10 = jc0Var.f27677r.selectedIds.get(id2, false);
            boolean z11 = !z10;
            if (jc0Var.f27677r.selectedIds.size() != 1 || !z10) {
                if (z10) {
                    jc0Var.f27677r.selectedIds.delete(id2);
                } else {
                    jc0Var.f27677r.selectedIds.put(id2, z11);
                }
                if (view instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view).K3(z11, z11, true);
                }
                jc0Var.l(true);
            }
        }
    }
}
