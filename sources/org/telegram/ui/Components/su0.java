package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class su0 extends org.telegram.ui.Cells.s2 {
    public final tu0 W4;

    public su0(tu0 tu0Var, Context context) {
        super(context, true);
        this.W4 = tu0Var;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        tu0 tu0Var = this.W4;
        ArrayList arrayList = tu0Var.f28617f;
        bu0 bu0Var = tu0Var.f28620s;
        if (bu0Var != null && bu0Var.getAdapter() == tu0Var) {
            tu0Var.f28620s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
            }
            return false;
        }
        return false;
    }
}
