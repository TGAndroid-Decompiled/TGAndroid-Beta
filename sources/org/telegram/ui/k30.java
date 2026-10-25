package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class k30 extends s4.u0 {
    public final v50 f40791a;

    public k30(v50 v50Var) {
        this.f40791a = v50Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        v50 v50Var = this.f40791a;
        viewGroup = ((org.telegram.ui.ActionBar.k3) v50Var).containerView;
        viewGroup.invalidate();
        v50Var.a2.invalidate();
    }
}
