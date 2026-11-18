package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class n11 extends v4.u0 {
    public final int f37692a;
    public final z11 f37693b;

    public n11(z11 z11Var, int i7) {
        this.f37692a = i7;
        this.f37693b = z11Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f37692a) {
            case 0:
                z11 z11Var = this.f37693b;
                if (z11Var.l()) {
                    z11Var.m();
                    return;
                }
                return;
            default:
                z11 z11Var2 = this.f37693b;
                if (z11Var2.l()) {
                    z11Var2.m();
                    return;
                }
                return;
        }
    }
}
