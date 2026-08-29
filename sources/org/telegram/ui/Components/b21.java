package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class b21 extends f2.a1 {
    public final int f26953a;
    public final m21 f26954b;

    public b21(m21 m21Var, int i10) {
        this.f26953a = i10;
        this.f26954b = m21Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f26953a) {
            case 0:
                m21 m21Var = this.f26954b;
                if (m21Var.k()) {
                    m21Var.l();
                    return;
                }
                return;
            default:
                m21 m21Var2 = this.f26954b;
                if (m21Var2.k()) {
                    m21Var2.l();
                    return;
                }
                return;
        }
    }
}
