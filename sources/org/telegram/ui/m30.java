package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class m30 extends s4.t0 {
    public final i60 f39902a;

    public m30(i60 i60Var) {
        this.f39902a = i60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f39902a).containerView;
        viewGroup.invalidate();
    }
}
