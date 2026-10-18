package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class bv0 extends org.telegram.ui.Cells.r2 {
    public final cv0 f25049a5;

    public bv0(cv0 cv0Var, Context context) {
        super(context, true);
        this.f25049a5 = cv0Var;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        cv0 cv0Var = this.f25049a5;
        ArrayList arrayList = cv0Var.f25381f;
        ku0 ku0Var = cv0Var.f25384s;
        if (ku0Var != null && ku0Var.getAdapter() == cv0Var) {
            cv0Var.f25384s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
            }
            return false;
        }
        return false;
    }
}
