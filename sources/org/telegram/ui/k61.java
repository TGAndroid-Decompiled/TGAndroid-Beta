package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class k61 extends f2.a1 {
    public final n61 f39770a;

    public k61(n61 n61Var) {
        this.f39770a = n61Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        n61 n61Var = this.f39770a;
        if (n61Var.d.G1) {
            AndroidUtilities.hideKeyboard(n61Var.Y);
        }
        n61.S(n61Var);
    }
}
