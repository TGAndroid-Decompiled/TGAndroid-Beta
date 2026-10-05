package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class m30 extends s4.s0 {
    public final h60 f38463a;

    public m30(h60 h60Var) {
        this.f38463a = h60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f38463a).containerView;
        viewGroup.invalidate();
    }
}
