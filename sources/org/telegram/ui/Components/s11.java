package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

public final class s11 extends f2.b1 {

    public final int f32299a;

    public final d21 f32300b;

    public s11(d21 d21Var, int i10) {
        this.f32299a = i10;
        this.f32300b = d21Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f32299a) {
            case 0:
                d21 d21Var = this.f32300b;
                if (d21Var.k()) {
                    d21Var.l();
                }
                break;
            default:
                d21 d21Var2 = this.f32300b;
                if (d21Var2.k()) {
                    d21Var2.l();
                }
                break;
        }
    }
}
