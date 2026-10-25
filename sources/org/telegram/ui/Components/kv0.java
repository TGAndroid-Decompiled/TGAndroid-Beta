package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class kv0 extends org.telegram.ui.Cells.p2 {
    public final lv0 f29985a5;

    public kv0(lv0 lv0Var, Context context) {
        super(context, true);
        this.f29985a5 = lv0Var;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        lv0 lv0Var = this.f29985a5;
        ArrayList arrayList = lv0Var.f30292f;
        su0 su0Var = lv0Var.f30295s;
        if (su0Var != null && su0Var.getAdapter() == lv0Var) {
            lv0Var.f30295s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
            }
            return false;
        }
        return false;
    }
}
