package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class f71 extends f2.z0 {
    public final i71 f33976a;

    public f71(i71 i71Var) {
        this.f33976a = i71Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        i71 i71Var = this.f33976a;
        if (i71Var.d.H1) {
            AndroidUtilities.hideKeyboard(i71Var.Z);
        }
        i71.S(i71Var);
    }
}
