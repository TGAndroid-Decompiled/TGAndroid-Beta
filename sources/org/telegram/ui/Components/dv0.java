package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class dv0 extends org.telegram.ui.Cells.r2 {
    public final ev0 f25645a5;

    public dv0(ev0 ev0Var, Context context) {
        super(context, true);
        this.f25645a5 = ev0Var;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        ev0 ev0Var = this.f25645a5;
        ArrayList arrayList = ev0Var.f25980f;
        mu0 mu0Var = ev0Var.f25983s;
        if (mu0Var != null && mu0Var.getAdapter() == ev0Var) {
            ev0Var.f25983s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
            }
            return false;
        }
        return false;
    }
}
