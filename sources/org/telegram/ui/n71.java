package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class n71 extends s4.s0 {
    public final q71 f35902a;

    public n71(q71 q71Var) {
        this.f35902a = q71Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        q71 q71Var = this.f35902a;
        if (q71Var.d.K1) {
            AndroidUtilities.hideKeyboard(q71Var.f36790c0);
        }
        q71.S(q71Var);
    }
}
