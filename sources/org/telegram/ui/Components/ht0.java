package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ht0 extends org.telegram.ui.Cells.v2 {
    public final it0 f26810a5;

    public ht0(it0 it0Var, Context context) {
        super(context, true);
        this.f26810a5 = it0Var;
    }

    @Override
    public final boolean X() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        it0 it0Var = this.f26810a5;
        ArrayList arrayList = it0Var.f27078f;
        rs0 rs0Var = it0Var.f27081s;
        if (rs0Var != null && rs0Var.getAdapter() == it0Var) {
            it0Var.f27081s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((org.telegram.messenger.fw) arrayList.get(R)).f15625b;
            }
            return false;
        }
        return false;
    }
}
