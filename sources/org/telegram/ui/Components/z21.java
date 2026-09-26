package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class z21 extends s4.s0 {
    public final int f30776a;
    public final k31 f30777b;

    public z21(k31 k31Var, int i10) {
        this.f30776a = i10;
        this.f30777b = k31Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f30776a) {
            case 0:
                k31 k31Var = this.f30777b;
                if (k31Var.k()) {
                    k31Var.l();
                    return;
                }
                return;
            default:
                k31 k31Var2 = this.f30777b;
                if (k31Var2.k()) {
                    k31Var2.l();
                    return;
                }
                return;
        }
    }
}
