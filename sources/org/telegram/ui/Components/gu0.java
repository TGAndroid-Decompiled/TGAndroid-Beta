package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class gu0 extends org.telegram.ui.Cells.q2 {
    public final hu0 T4;

    public gu0(hu0 hu0Var, Context context) {
        super(context, true);
        this.T4 = hu0Var;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        hu0 hu0Var = this.T4;
        ArrayList arrayList = hu0Var.f25498f;
        pt0 pt0Var = hu0Var.f25501s;
        if (pt0Var != null && pt0Var.getAdapter() == hu0Var) {
            hu0Var.f25501s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
            }
            return false;
        }
        return false;
    }
}
