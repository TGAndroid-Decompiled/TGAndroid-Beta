package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class z21 extends s4.s0 {
    public final int f30766a;
    public final k31 f30767b;

    public z21(k31 k31Var, int i10) {
        this.f30766a = i10;
        this.f30767b = k31Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f30766a) {
            case 0:
                k31 k31Var = this.f30767b;
                if (k31Var.k()) {
                    k31Var.l();
                    return;
                }
                return;
            default:
                k31 k31Var2 = this.f30767b;
                if (k31Var2.k()) {
                    k31Var2.l();
                    return;
                }
                return;
        }
    }
}
