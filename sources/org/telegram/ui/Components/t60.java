package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class t60 extends s4.s0 {
    public final s4.c0 f30981a;
    public final f70 f30982b;

    public t60(f70 f70Var, s4.c0 c0Var) {
        this.f30982b = f70Var;
        this.f30981a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        f70 f70Var = this.f30982b;
        f70.M(f70Var);
        if (f70Var.R && !f70Var.Q) {
            if (f70Var.S - this.f30981a.N0() < 10) {
                f70Var.W();
            }
        }
    }
}
