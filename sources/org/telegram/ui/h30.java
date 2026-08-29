package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class h30 extends f2.a1 {
    public final r50 f38755a;

    public h30(r50 r50Var) {
        this.f38755a = r50Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        r50 r50Var = this.f38755a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
        viewGroup.invalidate();
        r50Var.W1.invalidate();
    }
}
