package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class vu0 extends org.telegram.ui.Cells.s2 {
    public final wu0 W4;

    public vu0(wu0 wu0Var, Context context) {
        super(context, true);
        this.W4 = wu0Var;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        wu0 wu0Var = this.W4;
        ArrayList arrayList = wu0Var.f30059f;
        eu0 eu0Var = wu0Var.f30062s;
        if (eu0Var != null && eu0Var.getAdapter() == wu0Var) {
            wu0Var.f30062s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
            }
            return false;
        }
        return false;
    }
}
