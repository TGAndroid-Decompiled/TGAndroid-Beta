package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class i61 extends f2.d1 {
    public final l61 f39041a;

    public i61(l61 l61Var) {
        this.f39041a = l61Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        l61 l61Var = this.f39041a;
        if (l61Var.d.G1) {
            AndroidUtilities.hideKeyboard(l61Var.Y);
        }
        l61.R(l61Var);
    }
}
