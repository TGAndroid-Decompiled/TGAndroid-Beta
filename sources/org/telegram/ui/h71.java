package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class h71 extends s4.s0 {
    public final k71 f34136a;

    public h71(k71 k71Var) {
        this.f34136a = k71Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        k71 k71Var = this.f34136a;
        if (k71Var.d.K1) {
            AndroidUtilities.hideKeyboard(k71Var.f34962c0);
        }
        k71.S(k71Var);
    }
}
