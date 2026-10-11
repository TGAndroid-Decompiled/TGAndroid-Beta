package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class lv0 extends org.telegram.ui.Cells.s2 {
    public final mv0 f28624a5;

    public lv0(mv0 mv0Var, Context context) {
        super(context, true);
        this.f28624a5 = mv0Var;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        mv0 mv0Var = this.f28624a5;
        ArrayList arrayList = mv0Var.f28954f;
        uu0 uu0Var = mv0Var.f28957s;
        if (uu0Var != null && uu0Var.getAdapter() == mv0Var) {
            mv0Var.f28957s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
            }
            return false;
        }
        return false;
    }
}
