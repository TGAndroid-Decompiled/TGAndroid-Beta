package org.telegram.ui.Components;

import android.view.View;
public final class mc0 implements gm0 {
    public final qc0 f28656a;

    public mc0(qc0 qc0Var) {
        this.f28656a = qc0Var;
    }

    @Override
    public final void d(int i10, View view) {
        qc0 qc0Var = this.f28656a;
        if (qc0Var.f30127a == 1 && qc0Var.f30136r.previewMessages.size() > 1) {
            int id2 = qc0Var.f30136r.previewMessages.get(i10).getId();
            boolean z10 = qc0Var.f30136r.selectedIds.get(id2, false);
            boolean z11 = !z10;
            if (qc0Var.f30136r.selectedIds.size() != 1 || !z10) {
                if (z10) {
                    qc0Var.f30136r.selectedIds.delete(id2);
                } else {
                    qc0Var.f30136r.selectedIds.put(id2, z11);
                }
                if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).L3(z11, z11, true);
                }
                qc0Var.k(true);
            }
        }
    }
}
