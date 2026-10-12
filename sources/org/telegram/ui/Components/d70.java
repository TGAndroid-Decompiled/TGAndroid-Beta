package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class d70 extends s4.r0 {
    public final s4.b0 f24312a;
    public final p70 f24313b;

    public d70(p70 p70Var, s4.b0 b0Var) {
        this.f24313b = p70Var;
        this.f24312a = b0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p70 p70Var = this.f24313b;
        p70.P(p70Var);
        if (p70Var.R && !p70Var.Q) {
            if (p70Var.S - this.f24312a.N0() < 10) {
                p70Var.Y();
            }
        }
    }
}
