package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class s31 extends s4.t0 {
    public final int f30717a;
    public final d41 f30718b;

    public s31(d41 d41Var, int i10) {
        this.f30717a = i10;
        this.f30718b = d41Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f30717a) {
            case 0:
                d41 d41Var = this.f30718b;
                if (d41Var.k()) {
                    d41Var.l();
                    return;
                }
                return;
            default:
                d41 d41Var2 = this.f30718b;
                if (d41Var2.k()) {
                    d41Var2.l();
                    return;
                }
                return;
        }
    }
}
