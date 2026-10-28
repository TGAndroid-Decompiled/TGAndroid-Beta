package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class a30 extends s4.u0 {
    public final x50 f37670a;

    public a30(x50 x50Var) {
        this.f37670a = x50Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.f37670a).containerView;
        viewGroup.invalidate();
    }
}
