package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class o71 extends s4.s0 {
    public final r71 f36127a;

    public o71(r71 r71Var) {
        this.f36127a = r71Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        r71 r71Var = this.f36127a;
        if (r71Var.d.K1) {
            AndroidUtilities.hideKeyboard(r71Var.f37053c0);
        }
        r71.S(r71Var);
    }
}
