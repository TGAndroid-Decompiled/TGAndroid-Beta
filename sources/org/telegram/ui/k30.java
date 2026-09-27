package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class k30 extends s4.s0 {
    public final g60 f34904a;

    public k30(g60 g60Var) {
        this.f34904a = g60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.f34904a).containerView;
        viewGroup.invalidate();
    }
}
