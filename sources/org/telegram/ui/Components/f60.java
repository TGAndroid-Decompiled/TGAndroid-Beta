package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class f60 extends s4.s0 {
    public final s4.c0 f23830a;
    public final r60 f23831b;

    public f60(r60 r60Var, s4.c0 c0Var) {
        this.f23831b = r60Var;
        this.f23830a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        r60 r60Var = this.f23831b;
        r60.O(r60Var);
        if (r60Var.R && !r60Var.Q) {
            if (r60Var.S - this.f23830a.N0() < 10) {
                r60Var.X();
            }
        }
    }
}
