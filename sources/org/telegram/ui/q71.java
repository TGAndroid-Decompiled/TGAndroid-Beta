package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class q71 extends s4.s0 {
    public final t71 f39776a;

    public q71(t71 t71Var) {
        this.f39776a = t71Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        t71 t71Var = this.f39776a;
        if (t71Var.d.K1) {
            AndroidUtilities.hideKeyboard(t71Var.f40677c0);
        }
        t71.S(t71Var);
    }
}
