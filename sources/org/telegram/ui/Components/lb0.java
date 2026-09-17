package org.telegram.ui.Components;

import android.view.View;
public final class lb0 implements al0 {
    public final pb0 f25886a;

    public lb0(pb0 pb0Var) {
        this.f25886a = pb0Var;
    }

    @Override
    public final void d(int i10, View view) {
        pb0 pb0Var = this.f25886a;
        if (pb0Var.f26983a == 1 && pb0Var.f26991r.previewMessages.size() > 1) {
            int id2 = pb0Var.f26991r.previewMessages.get(i10).getId();
            boolean z10 = pb0Var.f26991r.selectedIds.get(id2, false);
            boolean z11 = !z10;
            if (pb0Var.f26991r.selectedIds.size() != 1 || !z10) {
                if (z10) {
                    pb0Var.f26991r.selectedIds.delete(id2);
                } else {
                    pb0Var.f26991r.selectedIds.put(id2, z11);
                }
                if (view instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view).L3(z11, z11, true);
                }
                pb0Var.k(true);
            }
        }
    }
}
