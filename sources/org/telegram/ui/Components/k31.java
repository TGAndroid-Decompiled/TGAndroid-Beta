package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class k31 extends s4.r0 {
    public final int f27854a;
    public final w31 f27855b;

    public k31(w31 w31Var, int i10) {
        this.f27854a = i10;
        this.f27855b = w31Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f27854a) {
            case 0:
                w31 w31Var = this.f27855b;
                if (w31Var.l()) {
                    w31Var.m();
                    return;
                }
                return;
            default:
                w31 w31Var2 = this.f27855b;
                if (w31Var2.l()) {
                    w31Var2.m();
                    return;
                }
                return;
        }
    }
}
