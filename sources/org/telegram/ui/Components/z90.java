package org.telegram.ui.Components;

import android.view.View;
public final class z90 implements bj0 {
    public final ca0 f40939a;

    public z90(ca0 ca0Var) {
        this.f40939a = ca0Var;
    }

    @Override
    public final void c(int i7, View view) {
        ca0 ca0Var = this.f40939a;
        if (ca0Var.f32520a == 1 && ca0Var.f32529r.f23701f.size() > 1) {
            int f12 = ((org.telegram.messenger.ij) ca0Var.f32529r.f23701f.get(i7)).f1();
            boolean z9 = ca0Var.f32529r.f23702g.get(f12, false);
            boolean z10 = !z9;
            if (ca0Var.f32529r.f23702g.size() != 1 || !z9) {
                if (z9) {
                    ca0Var.f32529r.f23702g.delete(f12);
                } else {
                    ca0Var.f32529r.f23702g.put(f12, z10);
                }
                if (view instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) view).l3(z10, z10, true);
                }
                ca0Var.l(true);
            }
        }
    }
}
