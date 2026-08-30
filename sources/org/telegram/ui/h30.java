package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class h30 extends f2.z0 {
    public final c60 f34747a;

    public h30(c60 c60Var) {
        this.f34747a = c60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.f34747a).containerView;
        viewGroup.invalidate();
    }
}
