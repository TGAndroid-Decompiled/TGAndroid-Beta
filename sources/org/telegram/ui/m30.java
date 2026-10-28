package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class m30 extends s4.u0 {
    public final x50 f41321a;

    public m30(x50 x50Var) {
        this.f41321a = x50Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        x50 x50Var = this.f41321a;
        viewGroup = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
        viewGroup.invalidate();
        x50Var.a2.invalidate();
    }
}
