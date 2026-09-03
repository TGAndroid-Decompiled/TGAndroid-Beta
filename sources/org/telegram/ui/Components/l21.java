package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class l21 extends f2.z0 {
    public final int f26554a;
    public final w21 f26555b;

    public l21(w21 w21Var, int i10) {
        this.f26554a = i10;
        this.f26555b = w21Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f26554a) {
            case 0:
                w21 w21Var = this.f26555b;
                if (w21Var.k()) {
                    w21Var.l();
                    return;
                }
                return;
            default:
                w21 w21Var2 = this.f26555b;
                if (w21Var2.k()) {
                    w21Var2.l();
                    return;
                }
                return;
        }
    }
}
