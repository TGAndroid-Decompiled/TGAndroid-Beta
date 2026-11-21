package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.fj;
import org.telegram.messenger.ve;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class g7 extends n41 {
    public static final int f30707b = 0;

    static {
        n41.h(new n41());
    }

    public static o41 i(ve veVar, y10 y10Var) {
        o41 K = o41.K(g7.class);
        K.H = veVar;
        K.I = y10Var;
        return K;
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        h7 h7Var = (h7) view;
        Object obj = o41Var.H;
        if (obj instanceof fj) {
            h7Var.f((fj) obj, z10);
        } else if (obj instanceof ve) {
            ve veVar = (ve) obj;
            h7Var.setTag(veVar);
            h7Var.f(veVar.f27386e, z10);
        }
        Object obj2 = o41Var.I;
        if (obj2 instanceof y10) {
            h7Var.setNeedPlayMessageListener((y10) obj2);
        }
        h7Var.e(o41Var.f38091e, false);
    }

    @Override
    public final boolean c(o41 o41Var, o41 o41Var2) {
        if (o41Var.d == o41Var2.d && o41Var.H == o41Var2.H) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        h7 h7Var = new h7(0, context, h6Var);
        h7Var.setCheckForButtonPress(true);
        return h7Var;
    }

    @Override
    public final boolean e(o41 o41Var, o41 o41Var2) {
        if (o41Var.d == o41Var2.d && o41Var.H == o41Var2.H) {
            return true;
        }
        return false;
    }
}
