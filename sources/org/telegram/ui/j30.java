package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class j30 extends f2.z0 {
    public final e60 f35074a;

    public j30(e60 e60Var) {
        this.f35074a = e60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.f35074a).containerView;
        viewGroup.invalidate();
    }
}
