package org.telegram.ui.Components;

import android.view.View;
public final class z90 implements bj0 {
    public final ca0 f40875a;

    public z90(ca0 ca0Var) {
        this.f40875a = ca0Var;
    }

    @Override
    public final void c(int i7, View view) {
        ca0 ca0Var = this.f40875a;
        if (ca0Var.f32498a == 1 && ca0Var.f32507r.f23690f.size() > 1) {
            int f12 = ((org.telegram.messenger.ij) ca0Var.f32507r.f23690f.get(i7)).f1();
            boolean z9 = ca0Var.f32507r.f23691g.get(f12, false);
            boolean z10 = !z9;
            if (ca0Var.f32507r.f23691g.size() != 1 || !z9) {
                if (z9) {
                    ca0Var.f32507r.f23691g.delete(f12);
                } else {
                    ca0Var.f32507r.f23691g.put(f12, z10);
                }
                if (view instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) view).k3(z10, z10, true);
                }
                ca0Var.l(true);
            }
        }
    }
}
