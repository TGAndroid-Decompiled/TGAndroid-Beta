package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class k30 extends s4.t0 {
    public final g60 f39213a;

    public k30(g60 g60Var) {
        this.f39213a = g60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f39213a).containerView;
        viewGroup.invalidate();
    }
}
