package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class z01 extends v4.s0 {
    public final int f40817a;
    public final l11 f40818b;

    public z01(l11 l11Var, int i7) {
        this.f40817a = i7;
        this.f40818b = l11Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f40817a) {
            case 0:
                l11 l11Var = this.f40818b;
                if (l11Var.l()) {
                    l11Var.m();
                    return;
                }
                return;
            default:
                l11 l11Var2 = this.f40818b;
                if (l11Var2.l()) {
                    l11Var2.m();
                    return;
                }
                return;
        }
    }
}
