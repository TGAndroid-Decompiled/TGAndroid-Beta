package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class qv0 extends org.telegram.ui.Cells.s2 {
    public final rv0 f29943a5;

    public qv0(rv0 rv0Var, Context context) {
        super(context, true);
        this.f29943a5 = rv0Var;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        rv0 rv0Var = this.f29943a5;
        ArrayList arrayList = rv0Var.f30253f;
        zu0 zu0Var = rv0Var.f30256s;
        if (zu0Var != null && zu0Var.getAdapter() == rv0Var) {
            rv0Var.f30256s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
            }
            return false;
        }
        return false;
    }
}
