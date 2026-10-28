package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class v3 extends t61 {
    public static final int f25585a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        w3 w3Var = (w3) view;
        w3Var.f25632w = z10;
        w3Var.b((MessageObject) u61Var.G, (ArrayList) u61Var.H);
        w3Var.invalidate();
    }

    @Override
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        if (u61Var.G == u61Var2.G && Objects.equals(u61Var.H, u61Var2.H) && u61Var.f33247j == u61Var2.f33247j) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new w3(context, i10, u6Var);
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        if (u61Var.d == u61Var2.d && u61Var.B == u61Var2.B) {
            return true;
        }
        return false;
    }
}
