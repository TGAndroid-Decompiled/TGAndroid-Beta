package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class e71 extends f2.a1 {
    public final h71 f36380a;

    public e71(h71 h71Var) {
        this.f36380a = h71Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        h71 h71Var = this.f36380a;
        if (h71Var.d.H1) {
            AndroidUtilities.hideKeyboard(h71Var.Z);
        }
        h71.S(h71Var);
    }
}
