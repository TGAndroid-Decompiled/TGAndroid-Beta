package org.telegram.ui.Components;

import android.view.View;
public final class aa0 implements gj0 {
    public final da0 f32939a;

    public aa0(da0 da0Var) {
        this.f32939a = da0Var;
    }

    @Override
    public final void b(int i7, View view) {
        da0 da0Var = this.f32939a;
        if (da0Var.f33894a == 1 && da0Var.f33904r.f24404f.size() > 1) {
            int e12 = ((org.telegram.messenger.gj) da0Var.f33904r.f24404f.get(i7)).e1();
            boolean z10 = da0Var.f33904r.f24405g.get(e12, false);
            boolean z11 = !z10;
            if (da0Var.f33904r.f24405g.size() != 1 || !z10) {
                if (z10) {
                    da0Var.f33904r.f24405g.delete(e12);
                } else {
                    da0Var.f33904r.f24405g.put(e12, z11);
                }
                if (view instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) view).m3(z11, z11, true);
                }
                da0Var.l(true);
            }
        }
    }
}
