package org.telegram.ui.Components;

import android.view.View;
public final class vb0 implements kl0 {
    public final zb0 f29109a;

    public vb0(zb0 zb0Var) {
        this.f29109a = zb0Var;
    }

    @Override
    public final void d(int i10, View view) {
        zb0 zb0Var = this.f29109a;
        if (zb0Var.f30824a == 1 && zb0Var.f30832r.previewMessages.size() > 1) {
            int id2 = zb0Var.f30832r.previewMessages.get(i10).getId();
            boolean z10 = zb0Var.f30832r.selectedIds.get(id2, false);
            boolean z11 = !z10;
            if (zb0Var.f30832r.selectedIds.size() != 1 || !z10) {
                if (z10) {
                    zb0Var.f30832r.selectedIds.delete(id2);
                } else {
                    zb0Var.f30832r.selectedIds.put(id2, z11);
                }
                if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).L3(z11, z11, true);
                }
                zb0Var.k(true);
            }
        }
    }
}
