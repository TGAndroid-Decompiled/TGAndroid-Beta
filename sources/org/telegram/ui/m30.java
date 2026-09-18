package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class m30 extends s4.s0 {
    public final i60 f35513a;

    public m30(i60 i60Var) {
        this.f35513a = i60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f35513a).containerView;
        viewGroup.invalidate();
    }
}
