package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class o30 extends s4.s0 {
    public final k60 f36225a;

    public o30(k60 k60Var) {
        this.f36225a = k60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.f36225a).containerView;
        viewGroup.invalidate();
    }
}
