package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class g61 extends s4.r0 {
    public final j61 f37077a;

    public g61(j61 j61Var) {
        this.f37077a = j61Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        j61 j61Var = this.f37077a;
        if (j61Var.d.I1) {
            AndroidUtilities.hideKeyboard(j61Var.f38055c0);
        }
        j61.T(j61Var);
    }
}
