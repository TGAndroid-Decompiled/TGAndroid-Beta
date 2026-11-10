package org.telegram.ui.Components;

import android.view.View;
public final class z90 implements bj0 {
    public final ca0 f40900a;

    public z90(ca0 ca0Var) {
        this.f40900a = ca0Var;
    }

    @Override
    public final void c(int i7, View view) {
        ca0 ca0Var = this.f40900a;
        if (ca0Var.f32519a == 1 && ca0Var.f32528r.f23705f.size() > 1) {
            int e12 = ((org.telegram.messenger.ij) ca0Var.f32528r.f23705f.get(i7)).e1();
            boolean z9 = ca0Var.f32528r.f23706g.get(e12, false);
            boolean z10 = !z9;
            if (ca0Var.f32528r.f23706g.size() != 1 || !z9) {
                if (z9) {
                    ca0Var.f32528r.f23706g.delete(e12);
                } else {
                    ca0Var.f32528r.f23706g.put(e12, z10);
                }
                if (view instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) view).l3(z10, z10, true);
                }
                ca0Var.l(true);
            }
        }
    }
}
