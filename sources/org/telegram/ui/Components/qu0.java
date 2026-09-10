package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class qu0 extends org.telegram.ui.Cells.r2 {
    public final ru0 W4;

    public qu0(ru0 ru0Var, Context context) {
        super(context, true);
        this.W4 = ru0Var;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        ru0 ru0Var = this.W4;
        ArrayList arrayList = ru0Var.f26756f;
        zt0 zt0Var = ru0Var.f26759s;
        if (zt0Var != null && zt0Var.getAdapter() == ru0Var) {
            ru0Var.f26759s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
            }
            return false;
        }
        return false;
    }
}
