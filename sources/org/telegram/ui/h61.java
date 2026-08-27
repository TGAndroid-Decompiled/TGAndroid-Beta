package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class h61 extends f2.b1 {

    public final k61 f38691a;

    public h61(k61 k61Var) {
        this.f38691a = k61Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        k61 k61Var = this.f38691a;
        if (k61Var.d.G1) {
            AndroidUtilities.hideKeyboard(k61Var.Y);
        }
        k61.S(k61Var);
    }
}
