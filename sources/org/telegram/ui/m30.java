package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class m30 extends s4.s0 {
    public final i60 f35588a;

    public m30(i60 i60Var) {
        this.f35588a = i60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f35588a).containerView;
        viewGroup.invalidate();
    }
}
