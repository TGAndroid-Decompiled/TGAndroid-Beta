package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class w31 extends s4.t0 {
    public final int f32258a;
    public final h41 f32259b;

    public w31(h41 h41Var, int i10) {
        this.f32258a = i10;
        this.f32259b = h41Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f32258a) {
            case 0:
                h41 h41Var = this.f32259b;
                if (h41Var.k()) {
                    h41Var.l();
                    return;
                }
                return;
            default:
                h41 h41Var2 = this.f32259b;
                if (h41Var2.k()) {
                    h41Var2.l();
                    return;
                }
                return;
        }
    }
}
