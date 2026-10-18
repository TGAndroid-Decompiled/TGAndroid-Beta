package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class h30 extends s4.r0 {
    public final s50 f37394a;

    public h30(s50 s50Var) {
        this.f37394a = s50Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        s50 s50Var = this.f37394a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
        viewGroup.invalidate();
        s50Var.a2.invalidate();
    }
}
