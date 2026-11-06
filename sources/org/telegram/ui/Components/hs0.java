package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class hs0 extends org.telegram.ui.Cells.t2 {
    public final is0 f34411a5;

    public hs0(is0 is0Var, Context context) {
        super(context, true);
        this.f34411a5 = is0Var;
    }

    @Override
    public final boolean W() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        is0 is0Var = this.f34411a5;
        ArrayList arrayList = is0Var.f34778f;
        rr0 rr0Var = is0Var.f34781s;
        if (rr0Var != null && rr0Var.getAdapter() == is0Var) {
            is0Var.f34781s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((org.telegram.messenger.uv) arrayList.get(R)).f25887b;
            }
            return false;
        }
        return false;
    }
}
