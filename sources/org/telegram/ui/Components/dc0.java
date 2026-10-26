package org.telegram.ui.Components;

import android.view.View;
public final class dc0 implements zl0 {
    public final hc0 f27507a;

    public dc0(hc0 hc0Var) {
        this.f27507a = hc0Var;
    }

    @Override
    public final void c(int i10, View view) {
        hc0 hc0Var = this.f27507a;
        if (hc0Var.f28914a == 1 && hc0Var.f28922r.previewMessages.size() > 1) {
            int id2 = hc0Var.f28922r.previewMessages.get(i10).getId();
            boolean z10 = hc0Var.f28922r.selectedIds.get(id2, false);
            boolean z11 = !z10;
            if (hc0Var.f28922r.selectedIds.size() != 1 || !z10) {
                if (z10) {
                    hc0Var.f28922r.selectedIds.delete(id2);
                } else {
                    hc0Var.f28922r.selectedIds.put(id2, z11);
                }
                if (view instanceof org.telegram.ui.Cells.s1) {
                    ((org.telegram.ui.Cells.s1) view).N3(z11, z11, true);
                }
                hc0Var.l(true);
            }
        }
    }
}
