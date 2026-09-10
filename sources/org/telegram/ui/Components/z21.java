package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class z21 extends s4.s0 {
    public final int f29575a;
    public final k31 f29576b;

    public z21(k31 k31Var, int i10) {
        this.f29575a = i10;
        this.f29576b = k31Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f29575a) {
            case 0:
                k31 k31Var = this.f29576b;
                if (k31Var.k()) {
                    k31Var.l();
                    return;
                }
                return;
            default:
                k31 k31Var2 = this.f29576b;
                if (k31Var2.k()) {
                    k31Var2.l();
                    return;
                }
                return;
        }
    }
}
