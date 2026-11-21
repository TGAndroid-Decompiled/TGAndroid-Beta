package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ts0 extends org.telegram.ui.Cells.u2 {
    public final us0 f40041b5;

    public ts0(us0 us0Var, Context context) {
        super(context, true);
        this.f40041b5 = us0Var;
    }

    @Override
    public final boolean X() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        us0 us0Var = this.f40041b5;
        ArrayList arrayList = us0Var.f40582f;
        cs0 cs0Var = us0Var.f40585s;
        if (cs0Var != null && cs0Var.getAdapter() == us0Var) {
            us0Var.f40585s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((org.telegram.messenger.ov) arrayList.get(R)).f26133b;
            }
            return false;
        }
        return false;
    }
}
