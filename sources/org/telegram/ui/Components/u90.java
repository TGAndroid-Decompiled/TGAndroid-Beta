package org.telegram.ui.Components;

import android.view.View;
public final class u90 implements fj0 {
    public final x90 f38704a;

    public u90(x90 x90Var) {
        this.f38704a = x90Var;
    }

    @Override
    public final void f(int i3, View view) {
        x90 x90Var = this.f38704a;
        if (x90Var.f40285a == 1 && x90Var.f40295r.f21842f.size() > 1) {
            int f12 = ((org.telegram.messenger.zi) x90Var.f40295r.f21842f.get(i3)).f1();
            boolean z10 = x90Var.f40295r.f21843g.get(f12, false);
            boolean z11 = !z10;
            if (x90Var.f40295r.f21843g.size() != 1 || !z10) {
                if (z10) {
                    x90Var.f40295r.f21843g.delete(f12);
                } else {
                    x90Var.f40295r.f21843g.put(f12, z11);
                }
                if (view instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) view).j3(z11, z11, true);
                }
                x90Var.l(true);
            }
        }
    }
}
