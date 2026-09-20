package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class a31 extends s4.s0 {
    public final int f22513a;
    public final l31 f22514b;

    public a31(l31 l31Var, int i10) {
        this.f22513a = i10;
        this.f22514b = l31Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f22513a) {
            case 0:
                l31 l31Var = this.f22514b;
                if (l31Var.k()) {
                    l31Var.l();
                    return;
                }
                return;
            default:
                l31 l31Var2 = this.f22514b;
                if (l31Var2.k()) {
                    l31Var2.l();
                    return;
                }
                return;
        }
    }
}
