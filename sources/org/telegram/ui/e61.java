package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class e61 extends s4.r0 {
    public final h61 f36552a;

    public e61(h61 h61Var) {
        this.f36552a = h61Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        h61 h61Var = this.f36552a;
        if (h61Var.d.I1) {
            AndroidUtilities.hideKeyboard(h61Var.f37501c0);
        }
        h61.T(h61Var);
    }
}
