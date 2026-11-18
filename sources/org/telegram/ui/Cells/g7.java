package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.fj;
import org.telegram.messenger.ve;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class g7 extends k41 {
    public static final int f30679b = 0;

    static {
        k41.h(new k41());
    }

    public static l41 i(ve veVar, y10 y10Var) {
        l41 K = l41.K(g7.class);
        K.H = veVar;
        K.I = y10Var;
        return K;
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        h7 h7Var = (h7) view;
        Object obj = l41Var.H;
        if (obj instanceof fj) {
            h7Var.f((fj) obj, z10);
        } else if (obj instanceof ve) {
            ve veVar = (ve) obj;
            h7Var.setTag(veVar);
            h7Var.f(veVar.f27358e, z10);
        }
        Object obj2 = l41Var.I;
        if (obj2 instanceof y10) {
            h7Var.setNeedPlayMessageListener((y10) obj2);
        }
        h7Var.e(l41Var.f37011e, false);
    }

    @Override
    public final boolean c(l41 l41Var, l41 l41Var2) {
        if (l41Var.d == l41Var2.d && l41Var.H == l41Var2.H) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        h7 h7Var = new h7(0, context, i6Var);
        h7Var.setCheckForButtonPress(true);
        return h7Var;
    }

    @Override
    public final boolean e(l41 l41Var, l41 l41Var2) {
        if (l41Var.d == l41Var2.d && l41Var.H == l41Var2.H) {
            return true;
        }
        return false;
    }
}
