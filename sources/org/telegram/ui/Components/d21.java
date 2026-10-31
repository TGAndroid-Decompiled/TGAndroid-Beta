package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class d21 extends s4.s0 {
    public final int f25264a;
    public final o21 f25265b;

    public d21(o21 o21Var, int i10) {
        this.f25264a = i10;
        this.f25265b = o21Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f25264a) {
            case 0:
                o21 o21Var = this.f25265b;
                if (o21Var.l()) {
                    o21Var.m();
                    return;
                }
                return;
            default:
                o21 o21Var2 = this.f25265b;
                if (o21Var2.l()) {
                    o21Var2.m();
                    return;
                }
                return;
        }
    }
}
