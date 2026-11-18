package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class qs0 extends org.telegram.ui.Cells.t2 {
    public final rs0 f38892b5;

    public qs0(rs0 rs0Var, Context context) {
        super(context, true);
        this.f38892b5 = rs0Var;
    }

    @Override
    public final boolean X() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        rs0 rs0Var = this.f38892b5;
        ArrayList arrayList = rs0Var.f39294f;
        as0 as0Var = rs0Var.f39297s;
        if (as0Var != null && as0Var.getAdapter() == rs0Var) {
            rs0Var.f39297s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((org.telegram.messenger.ov) arrayList.get(R)).f26107b;
            }
            return false;
        }
        return false;
    }
}
