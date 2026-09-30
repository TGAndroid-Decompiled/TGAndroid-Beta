package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class uu0 extends org.telegram.ui.Cells.s2 {
    public final vu0 W4;

    public uu0(vu0 vu0Var, Context context) {
        super(context, true);
        this.W4 = vu0Var;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        vu0 vu0Var = this.W4;
        ArrayList arrayList = vu0Var.f29728f;
        du0 du0Var = vu0Var.f29731s;
        if (du0Var != null && du0Var.getAdapter() == vu0Var) {
            vu0Var.f29731s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
            }
            return false;
        }
        return false;
    }
}
