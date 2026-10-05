package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class l31 extends s4.s0 {
    public final int f28359a;
    public final w31 f28360b;

    public l31(w31 w31Var, int i10) {
        this.f28359a = i10;
        this.f28360b = w31Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f28359a) {
            case 0:
                w31 w31Var = this.f28360b;
                if (w31Var.k()) {
                    w31Var.l();
                    return;
                }
                return;
            default:
                w31 w31Var2 = this.f28360b;
                if (w31Var2.k()) {
                    w31Var2.l();
                    return;
                }
                return;
        }
    }
}
