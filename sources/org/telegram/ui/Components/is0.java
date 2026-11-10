package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class is0 extends org.telegram.ui.Cells.t2 {
    public final js0 f34736a5;

    public is0(js0 js0Var, Context context) {
        super(context, true);
        this.f34736a5 = js0Var;
    }

    @Override
    public final boolean W() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        js0 js0Var = this.f34736a5;
        ArrayList arrayList = js0Var.f35063f;
        sr0 sr0Var = js0Var.f35066s;
        if (sr0Var != null && sr0Var.getAdapter() == js0Var) {
            js0Var.f35066s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((org.telegram.messenger.uv) arrayList.get(R)).f25901b;
            }
            return false;
        }
        return false;
    }
}
