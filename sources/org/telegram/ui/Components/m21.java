package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class m21 extends f2.a1 {
    public final int f28915a;
    public final x21 f28916b;

    public m21(x21 x21Var, int i10) {
        this.f28915a = i10;
        this.f28916b = x21Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f28915a) {
            case 0:
                x21 x21Var = this.f28916b;
                if (x21Var.k()) {
                    x21Var.l();
                    return;
                }
                return;
            default:
                x21 x21Var2 = this.f28916b;
                if (x21Var2.k()) {
                    x21Var2.l();
                    return;
                }
                return;
        }
    }
}
