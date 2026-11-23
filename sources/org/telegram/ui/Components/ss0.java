package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ss0 extends org.telegram.ui.Cells.u2 {
    public final ts0 f39696b5;

    public ss0(ts0 ts0Var, Context context) {
        super(context, true);
        this.f39696b5 = ts0Var;
    }

    @Override
    public final boolean Z() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        ts0 ts0Var = this.f39696b5;
        ArrayList arrayList = ts0Var.f40144f;
        cs0 cs0Var = ts0Var.f40147s;
        if (cs0Var != null && cs0Var.getAdapter() == ts0Var) {
            ts0Var.f40147s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((org.telegram.messenger.ov) arrayList.get(R)).f26202b;
            }
            return false;
        }
        return false;
    }
}
