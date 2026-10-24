package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class j31 extends s4.r0 {
    public final int f27550a;
    public final v31 f27551b;

    public j31(v31 v31Var, int i10) {
        this.f27550a = i10;
        this.f27551b = v31Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f27550a) {
            case 0:
                v31 v31Var = this.f27551b;
                if (v31Var.l()) {
                    v31Var.m();
                    return;
                }
                return;
            default:
                v31 v31Var2 = this.f27551b;
                if (v31Var2.l()) {
                    v31Var2.m();
                    return;
                }
                return;
        }
    }
}
