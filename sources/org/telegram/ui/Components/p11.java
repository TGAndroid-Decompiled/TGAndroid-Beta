package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class p11 extends v4.u0 {
    public final int f38449a;
    public final b21 f38450b;

    public p11(b21 b21Var, int i7) {
        this.f38449a = i7;
        this.f38450b = b21Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f38449a) {
            case 0:
                b21 b21Var = this.f38450b;
                if (b21Var.l()) {
                    b21Var.m();
                    return;
                }
                return;
            default:
                b21 b21Var2 = this.f38450b;
                if (b21Var2.l()) {
                    b21Var2.m();
                    return;
                }
                return;
        }
    }
}
