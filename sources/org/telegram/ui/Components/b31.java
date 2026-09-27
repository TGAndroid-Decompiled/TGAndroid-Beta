package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class b31 extends s4.s0 {
    public final int f22895a;
    public final m31 f22896b;

    public b31(m31 m31Var, int i10) {
        this.f22895a = i10;
        this.f22896b = m31Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f22895a) {
            case 0:
                m31 m31Var = this.f22896b;
                if (m31Var.k()) {
                    m31Var.l();
                    return;
                }
                return;
            default:
                m31 m31Var2 = this.f22896b;
                if (m31Var2.k()) {
                    m31Var2.l();
                    return;
                }
                return;
        }
    }
}
