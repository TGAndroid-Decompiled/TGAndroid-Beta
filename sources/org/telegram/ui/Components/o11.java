package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class o11 extends v4.t0 {
    public final int f38023a;
    public final a21 f38024b;

    public o11(a21 a21Var, int i7) {
        this.f38023a = i7;
        this.f38024b = a21Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f38023a) {
            case 0:
                a21 a21Var = this.f38024b;
                if (a21Var.l()) {
                    a21Var.m();
                    return;
                }
                return;
            default:
                a21 a21Var2 = this.f38024b;
                if (a21Var2.l()) {
                    a21Var2.m();
                    return;
                }
                return;
        }
    }
}
