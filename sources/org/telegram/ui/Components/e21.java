package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class e21 extends s4.s0 {
    public final int f25673a;
    public final p21 f25674b;

    public e21(p21 p21Var, int i10) {
        this.f25673a = i10;
        this.f25674b = p21Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f25673a) {
            case 0:
                p21 p21Var = this.f25674b;
                if (p21Var.l()) {
                    p21Var.m();
                    return;
                }
                return;
            default:
                p21 p21Var2 = this.f25674b;
                if (p21Var2.l()) {
                    p21Var2.m();
                    return;
                }
                return;
        }
    }
}
