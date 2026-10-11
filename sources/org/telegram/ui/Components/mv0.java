package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class mv0 extends org.telegram.ui.Cells.s2 {
    public final nv0 f28874a5;

    public mv0(nv0 nv0Var, Context context) {
        super(context, true);
        this.f28874a5 = nv0Var;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        nv0 nv0Var = this.f28874a5;
        ArrayList arrayList = nv0Var.f29157f;
        vu0 vu0Var = nv0Var.f29160s;
        if (vu0Var != null && vu0Var.getAdapter() == nv0Var) {
            nv0Var.f29160s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
            }
            return false;
        }
        return false;
    }
}
