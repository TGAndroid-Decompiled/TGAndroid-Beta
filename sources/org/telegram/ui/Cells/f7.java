package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.fj;
import org.telegram.messenger.ve;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class f7 extends m41 {
    public static final int f30707b = 0;

    static {
        m41.h(new m41());
    }

    public static n41 i(ve veVar, x10 x10Var) {
        n41 K = n41.K(f7.class);
        K.H = veVar;
        K.I = x10Var;
        return K;
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        g7 g7Var = (g7) view;
        Object obj = n41Var.H;
        if (obj instanceof fj) {
            g7Var.f((fj) obj, z10);
        } else if (obj instanceof ve) {
            ve veVar = (ve) obj;
            g7Var.setTag(veVar);
            g7Var.f(veVar.f27454e, z10);
        }
        Object obj2 = n41Var.I;
        if (obj2 instanceof x10) {
            g7Var.setNeedPlayMessageListener((x10) obj2);
        }
        g7Var.e(n41Var.f37648e, false);
    }

    @Override
    public final boolean c(n41 n41Var, n41 n41Var2) {
        if (n41Var.d == n41Var2.d && n41Var.H == n41Var2.H) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        g7 g7Var = new g7(0, context, i6Var);
        g7Var.setCheckForButtonPress(true);
        return g7Var;
    }

    @Override
    public final boolean e(n41 n41Var, n41 n41Var2) {
        if (n41Var.d == n41Var2.d && n41Var.H == n41Var2.H) {
            return true;
        }
        return false;
    }
}
