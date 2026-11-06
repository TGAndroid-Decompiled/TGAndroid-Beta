package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class v01 extends v4.s0 {
    public final int f38788a;
    public final g11 f38789b;

    public v01(g11 g11Var, int i7) {
        this.f38788a = i7;
        this.f38789b = g11Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f38788a) {
            case 0:
                g11 g11Var = this.f38789b;
                if (g11Var.l()) {
                    g11Var.m();
                    return;
                }
                return;
            default:
                g11 g11Var2 = this.f38789b;
                if (g11Var2.l()) {
                    g11Var2.m();
                    return;
                }
                return;
        }
    }
}
