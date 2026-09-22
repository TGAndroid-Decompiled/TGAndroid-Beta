package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class m21 extends s4.s0 {
    public final int f26041a;
    public final x21 f26042b;

    public m21(x21 x21Var, int i10) {
        this.f26041a = i10;
        this.f26042b = x21Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f26041a) {
            case 0:
                x21 x21Var = this.f26042b;
                if (x21Var.k()) {
                    x21Var.l();
                    return;
                }
                return;
            default:
                x21 x21Var2 = this.f26042b;
                if (x21Var2.k()) {
                    x21Var2.l();
                    return;
                }
                return;
        }
    }
}
