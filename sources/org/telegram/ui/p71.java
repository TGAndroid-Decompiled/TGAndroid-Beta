package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class p71 extends s4.s0 {
    public final s71 f36552a;

    public p71(s71 s71Var) {
        this.f36552a = s71Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        s71 s71Var = this.f36552a;
        if (s71Var.d.K1) {
            AndroidUtilities.hideKeyboard(s71Var.f37403c0);
        }
        s71.S(s71Var);
    }
}
