package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class m61 extends s4.u0 {
    public final p61 f41344a;

    public m61(p61 p61Var) {
        this.f41344a = p61Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p61 p61Var = this.f41344a;
        if (p61Var.d.I1) {
            AndroidUtilities.hideKeyboard(p61Var.f42318c0);
        }
        p61.S(p61Var);
    }
}
