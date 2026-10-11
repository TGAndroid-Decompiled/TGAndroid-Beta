package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class q71 extends s4.t0 {
    public final t71 f41095a;

    public q71(t71 t71Var) {
        this.f41095a = t71Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        t71 t71Var = this.f41095a;
        if (t71Var.d.I1) {
            AndroidUtilities.hideKeyboard(t71Var.f42143c0);
        }
        t71.T(t71Var);
    }
}
