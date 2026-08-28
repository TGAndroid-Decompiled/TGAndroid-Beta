package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class e30 extends f2.d1 {
    public final o50 f37809a;

    public e30(o50 o50Var) {
        this.f37809a = o50Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ViewGroup viewGroup;
        o50 o50Var = this.f37809a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) o50Var).containerView;
        viewGroup.invalidate();
        o50Var.W1.invalidate();
    }
}
