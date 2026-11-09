package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class b11 extends v4.s0 {
    public final int f32063a;
    public final n11 f32064b;

    public b11(n11 n11Var, int i7) {
        this.f32063a = i7;
        this.f32064b = n11Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f32063a) {
            case 0:
                n11 n11Var = this.f32064b;
                if (n11Var.l()) {
                    n11Var.m();
                    return;
                }
                return;
            default:
                n11 n11Var2 = this.f32064b;
                if (n11Var2.l()) {
                    n11Var2.m();
                    return;
                }
                return;
        }
    }
}
