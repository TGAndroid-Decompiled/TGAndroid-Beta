package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class l21 extends f2.z0 {
    public final int f26540a;
    public final w21 f26541b;

    public l21(w21 w21Var, int i10) {
        this.f26540a = i10;
        this.f26541b = w21Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f26540a) {
            case 0:
                w21 w21Var = this.f26541b;
                if (w21Var.k()) {
                    w21Var.l();
                    return;
                }
                return;
            default:
                w21 w21Var2 = this.f26541b;
                if (w21Var2.k()) {
                    w21Var2.l();
                    return;
                }
                return;
        }
    }
}
