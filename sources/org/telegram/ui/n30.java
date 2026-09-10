package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class n30 extends s4.s0 {
    public final j60 f35111a;

    public n30(j60 j60Var) {
        this.f35111a = j60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.f35111a).containerView;
        viewGroup.invalidate();
    }
}
