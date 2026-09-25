package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class h30 extends s4.s0 {
    public final d60 f34115a;

    public h30(d60 d60Var) {
        this.f34115a = d60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f34115a).containerView;
        viewGroup.invalidate();
    }
}
