package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class r31 extends s4.t0 {
    public final int f30347a;
    public final c41 f30348b;

    public r31(c41 c41Var, int i10) {
        this.f30347a = i10;
        this.f30348b = c41Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f30347a) {
            case 0:
                c41 c41Var = this.f30348b;
                if (c41Var.k()) {
                    c41Var.l();
                    return;
                }
                return;
            default:
                c41 c41Var2 = this.f30348b;
                if (c41Var2.k()) {
                    c41Var2.l();
                    return;
                }
                return;
        }
    }
}
