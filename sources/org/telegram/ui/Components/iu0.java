package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class iu0 extends org.telegram.ui.Cells.r2 {
    public final ju0 W4;

    public iu0(ju0 ju0Var, Context context) {
        super(context, true);
        this.W4 = ju0Var;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        ju0 ju0Var = this.W4;
        ArrayList arrayList = ju0Var.f25444f;
        rt0 rt0Var = ju0Var.f25447s;
        if (rt0Var != null && rt0Var.getAdapter() == ju0Var) {
            ju0Var.f25447s.getClass();
            int S = RecyclerView.S(this);
            if (S >= 0 && S < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(S)).pinned;
            }
            return false;
        }
        return false;
    }
}
