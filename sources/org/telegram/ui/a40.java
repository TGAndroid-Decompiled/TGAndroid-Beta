package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class a40 extends s4.s0 {
    public final k60 f31714a;

    public a40(k60 k60Var) {
        this.f31714a = k60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        k60 k60Var = this.f31714a;
        viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
        viewGroup.invalidate();
        k60Var.a2.invalidate();
    }
}
