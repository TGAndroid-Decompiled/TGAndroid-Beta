package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class v01 extends u4.t0 {
    public final int f38942a;
    public final g11 f38943b;

    public v01(g11 g11Var, int i3) {
        this.f38942a = i3;
        this.f38943b = g11Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        switch (this.f38942a) {
            case 0:
                g11 g11Var = this.f38943b;
                if (g11Var.l()) {
                    g11Var.m();
                    return;
                }
                return;
            default:
                g11 g11Var2 = this.f38943b;
                if (g11Var2.l()) {
                    g11Var2.m();
                    return;
                }
                return;
        }
    }
}
