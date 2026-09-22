package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class c31 extends s4.s0 {
    public final int f23173a;
    public final n31 f23174b;

    public c31(n31 n31Var, int i10) {
        this.f23173a = i10;
        this.f23174b = n31Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f23173a) {
            case 0:
                n31 n31Var = this.f23174b;
                if (n31Var.k()) {
                    n31Var.l();
                    return;
                }
                return;
            default:
                n31 n31Var2 = this.f23174b;
                if (n31Var2.k()) {
                    n31Var2.l();
                    return;
                }
                return;
        }
    }
}
