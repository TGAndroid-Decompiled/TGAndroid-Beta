package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class i30 extends f2.a1 {
    public final d60 f37535a;

    public i30(d60 d60Var) {
        this.f37535a = d60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.f37535a).containerView;
        viewGroup.invalidate();
    }
}
