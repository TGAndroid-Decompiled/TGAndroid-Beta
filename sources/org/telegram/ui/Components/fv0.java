package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class fv0 extends org.telegram.ui.Cells.q2 {
    public final gv0 f26442a5;

    public fv0(gv0 gv0Var, Context context) {
        super(context, true);
        this.f26442a5 = gv0Var;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        gv0 gv0Var = this.f26442a5;
        ArrayList arrayList = gv0Var.f26795f;
        ou0 ou0Var = gv0Var.f26798s;
        if (ou0Var != null && ou0Var.getAdapter() == gv0Var) {
            gv0Var.f26798s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
            }
            return false;
        }
        return false;
    }
}
