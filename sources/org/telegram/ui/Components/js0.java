package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class js0 extends org.telegram.ui.Cells.t2 {
    public final ks0 f35128a5;

    public js0(ks0 ks0Var, Context context) {
        super(context, true);
        this.f35128a5 = ks0Var;
    }

    @Override
    public final boolean W() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        ks0 ks0Var = this.f35128a5;
        ArrayList arrayList = ks0Var.f35472f;
        tr0 tr0Var = ks0Var.f35475s;
        if (tr0Var != null && tr0Var.getAdapter() == ks0Var) {
            ks0Var.f35475s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((org.telegram.messenger.uv) arrayList.get(R)).f25897b;
            }
            return false;
        }
        return false;
    }
}
