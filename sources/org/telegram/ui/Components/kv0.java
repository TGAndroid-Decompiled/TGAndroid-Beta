package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class kv0 extends org.telegram.ui.Cells.s2 {
    public final lv0 f28172a5;

    public kv0(lv0 lv0Var, Context context) {
        super(context, true);
        this.f28172a5 = lv0Var;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        lv0 lv0Var = this.f28172a5;
        ArrayList arrayList = lv0Var.f28610f;
        tu0 tu0Var = lv0Var.f28613s;
        if (tu0Var != null && tu0Var.getAdapter() == lv0Var) {
            lv0Var.f28613s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
            }
            return false;
        }
        return false;
    }
}
