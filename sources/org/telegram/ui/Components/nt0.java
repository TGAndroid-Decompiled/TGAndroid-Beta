package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class nt0 extends org.telegram.ui.Cells.r2 {
    public final ot0 S4;

    public nt0(ot0 ot0Var, Context context) {
        super(context, true);
        this.S4 = ot0Var;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        ot0 ot0Var = this.S4;
        ArrayList arrayList = ot0Var.f31441f;
        ws0 ws0Var = ot0Var.f31444s;
        if (ws0Var != null && ws0Var.getAdapter() == ot0Var) {
            ot0Var.f31444s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
            }
            return false;
        }
        return false;
    }
}
