package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class h61 extends s4.r0 {
    public final k61 f37765a;

    public h61(k61 k61Var) {
        this.f37765a = k61Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        k61 k61Var = this.f37765a;
        if (k61Var.d.I1) {
            AndroidUtilities.hideKeyboard(k61Var.f38802c0);
        }
        k61.S(k61Var);
    }
}
