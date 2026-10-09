package org.telegram.ui.Components;

import android.view.View;
public final class lc0 implements em0 {
    public final pc0 f28420a;

    public lc0(pc0 pc0Var) {
        this.f28420a = pc0Var;
    }

    @Override
    public final void d(int i10, View view) {
        pc0 pc0Var = this.f28420a;
        if (pc0Var.f29840a == 1 && pc0Var.f29849r.previewMessages.size() > 1) {
            int id2 = pc0Var.f29849r.previewMessages.get(i10).getId();
            boolean z10 = pc0Var.f29849r.selectedIds.get(id2, false);
            boolean z11 = !z10;
            if (pc0Var.f29849r.selectedIds.size() != 1 || !z10) {
                if (z10) {
                    pc0Var.f29849r.selectedIds.delete(id2);
                } else {
                    pc0Var.f29849r.selectedIds.put(id2, z11);
                }
                if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).L3(z11, z11, true);
                }
                pc0Var.k(true);
            }
        }
    }
}
