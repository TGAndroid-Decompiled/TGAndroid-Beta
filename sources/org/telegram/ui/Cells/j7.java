package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.kj;
import org.telegram.messenger.s20;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class j7 extends a51 {
    public static final int f22095b = 0;

    static {
        a51.h(new a51());
    }

    public static b51 i(ye yeVar, s20 s20Var) {
        b51 K = b51.K(j7.class);
        K.G = yeVar;
        K.H = s20Var;
        return K;
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        k7 k7Var = (k7) view;
        Object obj = b51Var.G;
        if (obj instanceof kj) {
            k7Var.f((kj) obj, z10);
        } else if (obj instanceof ye) {
            ye yeVar = (ye) obj;
            k7Var.setTag(yeVar);
            k7Var.f(yeVar.e, z10);
        }
        Object obj2 = b51Var.H;
        if (obj2 instanceof s20) {
            k7Var.setNeedPlayMessageListener((s20) obj2);
        }
        k7Var.e(b51Var.e, false);
    }

    @Override
    public final boolean c(b51 b51Var, b51 b51Var2) {
        if (b51Var.d == b51Var2.d && b51Var.G == b51Var2.G) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        k7 k7Var = new k7(0, context, p6Var);
        k7Var.setCheckForButtonPress(true);
        return k7Var;
    }

    @Override
    public final boolean e(b51 b51Var, b51 b51Var2) {
        if (b51Var.d == b51Var2.d && b51Var.G == b51Var2.G) {
            return true;
        }
        return false;
    }
}
