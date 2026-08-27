package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

public final class h30 extends f2.b1 {

    public final s50 f38674a;

    public h30(s50 s50Var) {
        this.f38674a = s50Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        s50 s50Var = this.f38674a;
        ((org.telegram.ui.ActionBar.e3) s50Var).containerView.invalidate();
        s50Var.W1.invalidate();
    }
}
