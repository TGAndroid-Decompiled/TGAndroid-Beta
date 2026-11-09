package org.telegram.ui.Components;

import android.view.View;
public final class aa0 implements cj0 {
    public final da0 f31758a;

    public aa0(da0 da0Var) {
        this.f31758a = da0Var;
    }

    @Override
    public final void c(int i7, View view) {
        da0 da0Var = this.f31758a;
        if (da0Var.f32915a == 1 && da0Var.f32924r.f23701f.size() > 1) {
            int e12 = ((org.telegram.messenger.ij) da0Var.f32924r.f23701f.get(i7)).e1();
            boolean z9 = da0Var.f32924r.f23702g.get(e12, false);
            boolean z10 = !z9;
            if (da0Var.f32924r.f23702g.size() != 1 || !z9) {
                if (z9) {
                    da0Var.f32924r.f23702g.delete(e12);
                } else {
                    da0Var.f32924r.f23702g.put(e12, z10);
                }
                if (view instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) view).l3(z10, z10, true);
                }
                da0Var.l(true);
            }
        }
    }
}
