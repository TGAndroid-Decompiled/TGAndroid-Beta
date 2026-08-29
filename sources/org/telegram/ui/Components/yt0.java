package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class yt0 extends org.telegram.ui.Cells.p2 {
    public final zt0 S4;

    public yt0(zt0 zt0Var, Context context) {
        super(context, true);
        this.S4 = zt0Var;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        zt0 zt0Var = this.S4;
        ArrayList arrayList = zt0Var.f35416f;
        ht0 ht0Var = zt0Var.f35419s;
        if (ht0Var != null && ht0Var.getAdapter() == zt0Var) {
            zt0Var.f35419s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
            }
            return false;
        }
        return false;
    }
}
