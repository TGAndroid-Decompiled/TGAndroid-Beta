package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class lv0 extends org.telegram.ui.Cells.p2 {
    public final mv0 f30308a5;

    public lv0(mv0 mv0Var, Context context) {
        super(context, true);
        this.f30308a5 = mv0Var;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        mv0 mv0Var = this.f30308a5;
        ArrayList arrayList = mv0Var.f30637f;
        tu0 tu0Var = mv0Var.f30640s;
        if (tu0Var != null && tu0Var.getAdapter() == mv0Var) {
            mv0Var.f30640s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
            }
            return false;
        }
        return false;
    }
}
