package org.telegram.ui;

import android.view.View;
public final class b7 implements org.telegram.ui.Components.zk0 {
    public final org.telegram.ui.Components.jl0 f36700a;
    public final c7 f36701b;

    public b7(c7 c7Var, org.telegram.ui.Components.jl0 jl0Var) {
        this.f36701b = c7Var;
        this.f36700a = jl0Var;
    }

    @Override
    public final void c(int i10, View view) {
        q7 q7Var = this.f36701b.d;
        org.telegram.ui.Components.jl0 jl0Var = this.f36700a;
        d7 d7Var = (d7) jl0Var.getAdapter();
        k7 k7Var = (k7) d7Var.f37378e.get(i10);
        if (view instanceof org.telegram.ui.Cells.p7) {
            q7.a(q7Var, k7Var, (m7) d7Var, jl0Var);
            return;
        }
        g7 g7Var = q7Var.v;
        if (g7Var != null) {
            g7Var.O0(k7Var.f39771c, k7Var.d, false);
        }
    }
}
