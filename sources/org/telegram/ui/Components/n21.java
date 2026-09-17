package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class n21 extends s4.s0 {
    public final int f26311a;
    public final y21 f26312b;

    public n21(y21 y21Var, int i10) {
        this.f26311a = i10;
        this.f26312b = y21Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f26311a) {
            case 0:
                y21 y21Var = this.f26312b;
                if (y21Var.k()) {
                    y21Var.l();
                    return;
                }
                return;
            default:
                y21 y21Var2 = this.f26312b;
                if (y21Var2.k()) {
                    y21Var2.l();
                    return;
                }
                return;
        }
    }
}
