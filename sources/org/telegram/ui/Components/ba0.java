package org.telegram.ui.Components;

import android.view.View;
public final class ba0 implements gj0 {
    public final ea0 f33236a;

    public ba0(ea0 ea0Var) {
        this.f33236a = ea0Var;
    }

    @Override
    public final void b(int i7, View view) {
        ea0 ea0Var = this.f33236a;
        if (ea0Var.f34254a == 1 && ea0Var.f34264r.f24404f.size() > 1) {
            int e12 = ((org.telegram.messenger.gj) ea0Var.f34264r.f24404f.get(i7)).e1();
            boolean z10 = ea0Var.f34264r.f24405g.get(e12, false);
            boolean z11 = !z10;
            if (ea0Var.f34264r.f24405g.size() != 1 || !z10) {
                if (z10) {
                    ea0Var.f34264r.f24405g.delete(e12);
                } else {
                    ea0Var.f34264r.f24405g.put(e12, z11);
                }
                if (view instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) view).m3(z11, z11, true);
                }
                ea0Var.l(true);
            }
        }
    }
}
