package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class cv0 extends org.telegram.ui.Cells.r2 {
    public final dv0 f25356a5;

    public cv0(dv0 dv0Var, Context context) {
        super(context, true);
        this.f25356a5 = dv0Var;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        dv0 dv0Var = this.f25356a5;
        ArrayList arrayList = dv0Var.f25653f;
        lu0 lu0Var = dv0Var.f25656s;
        if (lu0Var != null && lu0Var.getAdapter() == dv0Var) {
            dv0Var.f25656s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
            }
            return false;
        }
        return false;
    }
}
