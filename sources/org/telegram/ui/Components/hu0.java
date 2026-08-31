package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class hu0 extends org.telegram.ui.Cells.r2 {
    public final iu0 T4;

    public hu0(iu0 iu0Var, Context context) {
        super(context, true);
        this.T4 = iu0Var;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        iu0 iu0Var = this.T4;
        ArrayList arrayList = iu0Var.f27908f;
        qt0 qt0Var = iu0Var.f27911s;
        if (qt0Var != null && qt0Var.getAdapter() == iu0Var) {
            iu0Var.f27911s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
            }
            return false;
        }
        return false;
    }
}
