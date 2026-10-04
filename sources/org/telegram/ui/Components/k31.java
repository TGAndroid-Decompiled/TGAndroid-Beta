package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class k31 extends s4.s0 {
    public final int f27953a;
    public final v31 f27954b;

    public k31(v31 v31Var, int i10) {
        this.f27953a = i10;
        this.f27954b = v31Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f27953a) {
            case 0:
                v31 v31Var = this.f27954b;
                if (v31Var.k()) {
                    v31Var.l();
                    return;
                }
                return;
            default:
                v31 v31Var2 = this.f27954b;
                if (v31Var2.k()) {
                    v31Var2.l();
                    return;
                }
                return;
        }
    }
}
