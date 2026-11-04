package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class gs0 extends org.telegram.ui.Cells.t2 {
    public final hs0 f34184b5;

    public gs0(hs0 hs0Var, Context context) {
        super(context, true);
        this.f34184b5 = hs0Var;
    }

    @Override
    public final boolean W() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        hs0 hs0Var = this.f34184b5;
        ArrayList arrayList = hs0Var.f34493f;
        qr0 qr0Var = hs0Var.f34496s;
        if (qr0Var != null && qr0Var.getAdapter() == hs0Var) {
            hs0Var.f34496s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((org.telegram.messenger.mv) arrayList.get(R)).f24265b;
            }
            return false;
        }
        return false;
    }
}
