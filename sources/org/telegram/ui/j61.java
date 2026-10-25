package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class j61 extends s4.u0 {
    public final m61 f40468a;

    public j61(m61 m61Var) {
        this.f40468a = m61Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        m61 m61Var = this.f40468a;
        if (m61Var.d.I1) {
            AndroidUtilities.hideKeyboard(m61Var.f41472c0);
        }
        m61.S(m61Var);
    }
}
