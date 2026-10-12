package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class q30 extends s4.r0 {
    public final n60 f39335a;

    public q30(n60 n60Var) {
        this.f39335a = n60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f39335a).containerView;
        viewGroup.invalidate();
    }
}
