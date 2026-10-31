package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.jj;
import org.telegram.messenger.r20;
import org.telegram.messenger.xe;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class j7 extends z41 {
    public static final int f22094b = 0;

    static {
        z41.h(new z41());
    }

    public static a51 i(xe xeVar, r20 r20Var) {
        a51 K = a51.K(j7.class);
        K.G = xeVar;
        K.H = r20Var;
        return K;
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        k7 k7Var = (k7) view;
        Object obj = a51Var.G;
        if (obj instanceof jj) {
            k7Var.f((jj) obj, z10);
        } else if (obj instanceof xe) {
            xe xeVar = (xe) obj;
            k7Var.setTag(xeVar);
            k7Var.f(xeVar.e, z10);
        }
        Object obj2 = a51Var.H;
        if (obj2 instanceof r20) {
            k7Var.setNeedPlayMessageListener((r20) obj2);
        }
        k7Var.e(a51Var.e, false);
    }

    @Override
    public final boolean c(a51 a51Var, a51 a51Var2) {
        if (a51Var.d == a51Var2.d && a51Var.G == a51Var2.G) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        k7 k7Var = new k7(0, context, p6Var);
        k7Var.setCheckForButtonPress(true);
        return k7Var;
    }

    @Override
    public final boolean e(a51 a51Var, a51 a51Var2) {
        if (a51Var.d == a51Var2.d && a51Var.G == a51Var2.G) {
            return true;
        }
        return false;
    }
}
