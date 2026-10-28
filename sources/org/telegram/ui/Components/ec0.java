package org.telegram.ui.Components;

import android.view.View;
public final class ec0 implements am0 {
    public final ic0 f27818a;

    public ec0(ic0 ic0Var) {
        this.f27818a = ic0Var;
    }

    @Override
    public final void c(int i10, View view) {
        ic0 ic0Var = this.f27818a;
        if (ic0Var.f29301a == 1 && ic0Var.f29309r.previewMessages.size() > 1) {
            int id2 = ic0Var.f29309r.previewMessages.get(i10).getId();
            boolean z10 = ic0Var.f29309r.selectedIds.get(id2, false);
            boolean z11 = !z10;
            if (ic0Var.f29309r.selectedIds.size() != 1 || !z10) {
                if (z10) {
                    ic0Var.f29309r.selectedIds.delete(id2);
                } else {
                    ic0Var.f29309r.selectedIds.put(id2, z11);
                }
                if (view instanceof org.telegram.ui.Cells.s1) {
                    ((org.telegram.ui.Cells.s1) view).N3(z11, z11, true);
                }
                ic0Var.l(true);
            }
        }
    }
}
