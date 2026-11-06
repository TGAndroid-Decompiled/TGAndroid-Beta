package org.telegram.ui.Components;

import android.view.View;
public final class z90 implements bj0 {
    public final ca0 f40920a;

    public z90(ca0 ca0Var) {
        this.f40920a = ca0Var;
    }

    @Override
    public final void c(int i7, View view) {
        ca0 ca0Var = this.f40920a;
        if (ca0Var.f32489a == 1 && ca0Var.f32498r.f23697f.size() > 1) {
            int f12 = ((org.telegram.messenger.ij) ca0Var.f32498r.f23697f.get(i7)).f1();
            boolean z9 = ca0Var.f32498r.f23698g.get(f12, false);
            boolean z10 = !z9;
            if (ca0Var.f32498r.f23698g.size() != 1 || !z9) {
                if (z9) {
                    ca0Var.f32498r.f23698g.delete(f12);
                } else {
                    ca0Var.f32498r.f23698g.put(f12, z10);
                }
                if (view instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) view).k3(z10, z10, true);
                }
                ca0Var.l(true);
            }
        }
    }
}
