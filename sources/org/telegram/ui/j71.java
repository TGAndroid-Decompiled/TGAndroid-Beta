package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class j71 extends s4.s0 {
    public final m71 f37592a;

    public j71(m71 m71Var) {
        this.f37592a = m71Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        m71 m71Var = this.f37592a;
        if (m71Var.d.K1) {
            AndroidUtilities.hideKeyboard(m71Var.f38456c0);
        }
        m71.Q(m71Var);
    }
}
