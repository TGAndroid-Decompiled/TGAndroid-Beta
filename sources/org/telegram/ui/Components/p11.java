package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class p11 extends f2.d1 {
    public final int f31509a;
    public final b21 f31510b;

    public p11(b21 b21Var, int i9) {
        this.f31509a = i9;
        this.f31510b = b21Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        switch (this.f31509a) {
            case 0:
                b21 b21Var = this.f31510b;
                if (b21Var.k()) {
                    b21Var.l();
                    return;
                }
                return;
            default:
                b21 b21Var2 = this.f31510b;
                if (b21Var2.k()) {
                    b21Var2.l();
                    return;
                }
                return;
        }
    }
}
