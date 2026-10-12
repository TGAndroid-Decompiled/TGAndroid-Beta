package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class n31 extends s4.r0 {
    public final int f27575a;
    public final y31 f27576b;

    public n31(y31 y31Var, int i10) {
        this.f27575a = i10;
        this.f27576b = y31Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f27575a) {
            case 0:
                y31 y31Var = this.f27576b;
                if (y31Var.k()) {
                    y31Var.l();
                    return;
                }
                return;
            default:
                y31 y31Var2 = this.f27576b;
                if (y31Var2.k()) {
                    y31Var2.l();
                    return;
                }
                return;
        }
    }
}
