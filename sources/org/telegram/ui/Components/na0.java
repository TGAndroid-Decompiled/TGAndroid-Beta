package org.telegram.ui.Components;

import android.view.View;
public final class na0 implements qj0 {
    public final qa0 f37805a;

    public na0(qa0 qa0Var) {
        this.f37805a = qa0Var;
    }

    @Override
    public final void c(int i7, View view) {
        qa0 qa0Var = this.f37805a;
        if (qa0Var.f38805a == 1 && qa0Var.f38815r.f24701f.size() > 1) {
            int e12 = ((org.telegram.messenger.gj) qa0Var.f38815r.f24701f.get(i7)).e1();
            boolean z10 = qa0Var.f38815r.f24702g.get(e12, false);
            boolean z11 = !z10;
            if (qa0Var.f38815r.f24702g.size() != 1 || !z10) {
                if (z10) {
                    qa0Var.f38815r.f24702g.delete(e12);
                } else {
                    qa0Var.f38815r.f24702g.put(e12, z11);
                }
                if (view instanceof org.telegram.ui.Cells.r1) {
                    ((org.telegram.ui.Cells.r1) view).n3(z11, z11, true);
                }
                qa0Var.l(true);
            }
        }
    }
}
