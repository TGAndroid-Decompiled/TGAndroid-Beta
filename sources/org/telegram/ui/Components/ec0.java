package org.telegram.ui.Components;

import android.view.View;
public final class ec0 implements xl0 {
    public final ic0 f25883a;

    public ec0(ic0 ic0Var) {
        this.f25883a = ic0Var;
    }

    @Override
    public final void a(int i10, View view) {
        ic0 ic0Var = this.f25883a;
        if (ic0Var.f27235a == 1 && ic0Var.f27243r.previewMessages.size() > 1) {
            int id2 = ic0Var.f27243r.previewMessages.get(i10).getId();
            boolean z10 = ic0Var.f27243r.selectedIds.get(id2, false);
            boolean z11 = !z10;
            if (ic0Var.f27243r.selectedIds.size() != 1 || !z10) {
                if (z10) {
                    ic0Var.f27243r.selectedIds.delete(id2);
                } else {
                    ic0Var.f27243r.selectedIds.put(id2, z11);
                }
                if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).L3(z11, z11, true);
                }
                ic0Var.l(true);
            }
        }
    }
}
