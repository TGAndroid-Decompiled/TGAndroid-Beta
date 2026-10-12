package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class gv0 extends org.telegram.ui.Cells.s2 {
    public final hv0 f25426a5;

    public gv0(hv0 hv0Var, Context context) {
        super(context, true);
        this.f25426a5 = hv0Var;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        hv0 hv0Var = this.f25426a5;
        ArrayList arrayList = hv0Var.f25761f;
        pu0 pu0Var = hv0Var.f25764s;
        if (pu0Var != null && pu0Var.getAdapter() == hv0Var) {
            hv0Var.f25764s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
            }
            return false;
        }
        return false;
    }
}
