package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class i30 extends s4.r0 {
    public final u50 f38059a;

    public i30(u50 u50Var) {
        this.f38059a = u50Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        u50 u50Var = this.f38059a;
        viewGroup = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
        viewGroup.invalidate();
        u50Var.a2.invalidate();
    }
}
