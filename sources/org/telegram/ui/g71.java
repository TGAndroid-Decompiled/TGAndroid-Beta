package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class g71 extends s4.s0 {
    public final j71 f33478a;

    public g71(j71 j71Var) {
        this.f33478a = j71Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        j71 j71Var = this.f33478a;
        if (j71Var.d.K1) {
            AndroidUtilities.hideKeyboard(j71Var.f34349c0);
        }
        j71.S(j71Var);
    }
}
