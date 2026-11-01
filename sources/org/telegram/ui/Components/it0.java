package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class it0 extends org.telegram.ui.Cells.v2 {
    public final jt0 f27166a5;

    public it0(jt0 jt0Var, Context context) {
        super(context, true);
        this.f27166a5 = jt0Var;
    }

    @Override
    public final boolean X() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        jt0 jt0Var = this.f27166a5;
        ArrayList arrayList = jt0Var.f27566f;
        ss0 ss0Var = jt0Var.f27569s;
        if (ss0Var != null && ss0Var.getAdapter() == jt0Var) {
            jt0Var.f27569s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((org.telegram.messenger.gw) arrayList.get(R)).f15966b;
            }
            return false;
        }
        return false;
    }
}
