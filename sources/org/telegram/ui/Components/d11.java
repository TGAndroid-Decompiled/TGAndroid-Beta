package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class d11 extends v4.t0 {
    public final int f33811a;
    public final p11 f33812b;

    public d11(p11 p11Var, int i7) {
        this.f33811a = i7;
        this.f33812b = p11Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f33811a) {
            case 0:
                p11 p11Var = this.f33812b;
                if (p11Var.l()) {
                    p11Var.m();
                    return;
                }
                return;
            default:
                p11 p11Var2 = this.f33812b;
                if (p11Var2.l()) {
                    p11Var2.m();
                    return;
                }
                return;
        }
    }
}
