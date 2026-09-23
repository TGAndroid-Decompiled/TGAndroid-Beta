package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class j30 extends s4.s0 {
    public final f60 f34318a;

    public j30(f60 f60Var) {
        this.f34318a = f60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f34318a).containerView;
        viewGroup.invalidate();
    }
}
