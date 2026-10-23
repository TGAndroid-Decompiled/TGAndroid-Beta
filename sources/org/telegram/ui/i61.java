package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class i61 extends s4.r0 {
    public final l61 f38081a;

    public i61(l61 l61Var) {
        this.f38081a = l61Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        l61 l61Var = this.f38081a;
        if (l61Var.d.I1) {
            AndroidUtilities.hideKeyboard(l61Var.f39142c0);
        }
        l61.S(l61Var);
    }
}
