package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class f30 extends s4.r0 {
    public final q50 f36886a;

    public f30(q50 q50Var) {
        this.f36886a = q50Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        q50 q50Var = this.f36886a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) q50Var).containerView;
        viewGroup.invalidate();
        q50Var.a2.invalidate();
    }
}
