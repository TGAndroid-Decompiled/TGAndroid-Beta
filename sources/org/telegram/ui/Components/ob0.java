package org.telegram.ui.Components;

import android.view.View;
public final class ob0 implements jl0 {
    public final sb0 f29725a;

    public ob0(sb0 sb0Var) {
        this.f29725a = sb0Var;
    }

    @Override
    public final void f(int i10, View view) {
        sb0 sb0Var = this.f29725a;
        if (sb0Var.f31027a == 1 && sb0Var.f31033r.previewMessages.size() > 1) {
            int id2 = sb0Var.f31033r.previewMessages.get(i10).getId();
            boolean z4 = sb0Var.f31033r.selectedIds.get(id2, false);
            boolean z10 = !z4;
            if (sb0Var.f31033r.selectedIds.size() != 1 || !z4) {
                if (z4) {
                    sb0Var.f31033r.selectedIds.delete(id2);
                } else {
                    sb0Var.f31033r.selectedIds.put(id2, z10);
                }
                if (view instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view).L3(z10, z10, true);
                }
                sb0Var.k(true);
            }
        }
    }
}
