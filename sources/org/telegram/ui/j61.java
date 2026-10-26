package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class j61 extends s4.u0 {
    public final m61 f40471a;

    public j61(m61 m61Var) {
        this.f40471a = m61Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        m61 m61Var = this.f40471a;
        if (m61Var.d.I1) {
            AndroidUtilities.hideKeyboard(m61Var.f41475c0);
        }
        m61.S(m61Var);
    }
}
