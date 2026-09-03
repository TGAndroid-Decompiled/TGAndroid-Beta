package org.telegram.ui.Components;

import android.view.View;
public final class nb0 implements hl0 {
    public final rb0 f27232a;

    public nb0(rb0 rb0Var) {
        this.f27232a = rb0Var;
    }

    @Override
    public final void d(int i10, View view) {
        rb0 rb0Var = this.f27232a;
        if (rb0Var.f28440a == 1 && rb0Var.f28445r.previewMessages.size() > 1) {
            int id2 = rb0Var.f28445r.previewMessages.get(i10).getId();
            boolean z4 = rb0Var.f28445r.selectedIds.get(id2, false);
            boolean z10 = !z4;
            if (rb0Var.f28445r.selectedIds.size() != 1 || !z4) {
                if (z4) {
                    rb0Var.f28445r.selectedIds.delete(id2);
                } else {
                    rb0Var.f28445r.selectedIds.put(id2, z10);
                }
                if (view instanceof org.telegram.ui.Cells.s1) {
                    ((org.telegram.ui.Cells.s1) view).L3(z10, z10, true);
                }
                rb0Var.k(true);
            }
        }
    }
}
