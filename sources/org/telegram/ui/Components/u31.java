package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class u31 extends s4.u0 {
    public final int f33219a;
    public final f41 f33220b;

    public u31(f41 f41Var, int i10) {
        this.f33219a = i10;
        this.f33220b = f41Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f33219a) {
            case 0:
                f41 f41Var = this.f33220b;
                if (f41Var.l()) {
                    f41Var.m();
                    return;
                }
                return;
            default:
                f41 f41Var2 = this.f33220b;
                if (f41Var2.l()) {
                    f41Var2.m();
                    return;
                }
                return;
        }
    }
}
