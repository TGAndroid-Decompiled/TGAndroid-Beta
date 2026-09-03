package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class h60 extends f2.z0 {
    public final f2.i0 f25319a;
    public final t60 f25320b;

    public h60(t60 t60Var, f2.i0 i0Var) {
        this.f25320b = t60Var;
        this.f25319a = i0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        t60 t60Var = this.f25320b;
        t60.O(t60Var);
        if (t60Var.O && !t60Var.N) {
            if (t60Var.P - this.f25319a.N0() < 10) {
                t60Var.X();
            }
        }
    }
}
