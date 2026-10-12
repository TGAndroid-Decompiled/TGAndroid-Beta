package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class c40 extends s4.r0 {
    public final n60 f34730a;

    public c40(n60 n60Var) {
        this.f34730a = n60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        n60 n60Var = this.f34730a;
        viewGroup = ((org.telegram.ui.ActionBar.e3) n60Var).containerView;
        viewGroup.invalidate();
        n60Var.a2.invalidate();
    }
}
