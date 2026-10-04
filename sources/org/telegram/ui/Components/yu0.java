package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class yu0 extends org.telegram.ui.Cells.s2 {
    public final zu0 W4;

    public yu0(zu0 zu0Var, Context context) {
        super(context, true);
        this.W4 = zu0Var;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        zu0 zu0Var = this.W4;
        ArrayList arrayList = zu0Var.f33656f;
        hu0 hu0Var = zu0Var.f33659s;
        if (hu0Var != null && hu0Var.getAdapter() == zu0Var) {
            zu0Var.f33659s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
            }
            return false;
        }
        return false;
    }
}
