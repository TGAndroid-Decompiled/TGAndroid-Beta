package org.telegram.ui.Components;

import android.view.View;
public final class sa0 implements mk0 {
    public final wa0 f32416a;

    public sa0(wa0 wa0Var) {
        this.f32416a = wa0Var;
    }

    @Override
    public final void a(int i9, View view) {
        wa0 wa0Var = this.f32416a;
        if (wa0Var.f34168a == 1 && wa0Var.f34174r.previewMessages.size() > 1) {
            int id2 = wa0Var.f34174r.previewMessages.get(i9).getId();
            boolean z10 = wa0Var.f34174r.selectedIds.get(id2, false);
            boolean z11 = !z10;
            if (wa0Var.f34174r.selectedIds.size() != 1 || !z10) {
                if (z10) {
                    wa0Var.f34174r.selectedIds.delete(id2);
                } else {
                    wa0Var.f34174r.selectedIds.put(id2, z11);
                }
                if (view instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view).L3(z11, z11, true);
                }
                wa0Var.k(true);
            }
        }
    }
}
