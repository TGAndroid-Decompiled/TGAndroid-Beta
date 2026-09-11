package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class l21 extends s4.s0 {
    public final int f28034a;
    public final w21 f28035b;

    public l21(w21 w21Var, int i10) {
        this.f28034a = i10;
        this.f28035b = w21Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f28034a) {
            case 0:
                w21 w21Var = this.f28035b;
                if (w21Var.k()) {
                    w21Var.l();
                    return;
                }
                return;
            default:
                w21 w21Var2 = this.f28035b;
                if (w21Var2.k()) {
                    w21Var2.l();
                    return;
                }
                return;
        }
    }
}
