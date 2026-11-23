package org.telegram.ui.Components;

import android.view.View;
public final class na0 implements qj0 {
    public final qa0 f37850a;

    public na0(qa0 qa0Var) {
        this.f37850a = qa0Var;
    }

    @Override
    public final void c(int i7, View view) {
        qa0 qa0Var = this.f37850a;
        if (qa0Var.f38852a == 1 && qa0Var.f38862r.f24737f.size() > 1) {
            int e12 = ((org.telegram.messenger.gj) qa0Var.f38862r.f24737f.get(i7)).e1();
            boolean z10 = qa0Var.f38862r.f24738g.get(e12, false);
            boolean z11 = !z10;
            if (qa0Var.f38862r.f24738g.size() != 1 || !z10) {
                if (z10) {
                    qa0Var.f38862r.f24738g.delete(e12);
                } else {
                    qa0Var.f38862r.f24738g.put(e12, z11);
                }
                if (view instanceof org.telegram.ui.Cells.r1) {
                    ((org.telegram.ui.Cells.r1) view).n3(z11, z11, true);
                }
                qa0Var.l(true);
            }
        }
    }
}
