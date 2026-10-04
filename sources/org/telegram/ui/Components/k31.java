package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class k31 extends s4.s0 {
    public final int f27947a;
    public final v31 f27948b;

    public k31(v31 v31Var, int i10) {
        this.f27947a = i10;
        this.f27948b = v31Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f27947a) {
            case 0:
                v31 v31Var = this.f27948b;
                if (v31Var.k()) {
                    v31Var.l();
                    return;
                }
                return;
            default:
                v31 v31Var2 = this.f27948b;
                if (v31Var2.k()) {
                    v31Var2.l();
                    return;
                }
                return;
        }
    }
}
