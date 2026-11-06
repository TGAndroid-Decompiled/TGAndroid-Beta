package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.d20;
import org.telegram.messenger.ij;
import org.telegram.messenger.xe;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
public final class f7 extends v31 {
    public static final int f29126b = 0;

    static {
        v31.h(new v31());
    }

    public static w31 i(xe xeVar, d20 d20Var) {
        w31 K = w31.K(f7.class);
        K.G = xeVar;
        K.H = d20Var;
        return K;
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        g7 g7Var = (g7) view;
        Object obj = w31Var.G;
        if (obj instanceof ij) {
            g7Var.f((ij) obj, z9);
        } else if (obj instanceof xe) {
            xe xeVar = (xe) obj;
            g7Var.setTag(xeVar);
            g7Var.f(xeVar.f26457e, z9);
        }
        Object obj2 = w31Var.H;
        if (obj2 instanceof d20) {
            g7Var.setNeedPlayMessageListener((d20) obj2);
        }
        g7Var.e(w31Var.f39824e, false);
    }

    @Override
    public final boolean c(w31 w31Var, w31 w31Var2) {
        if (w31Var.d == w31Var2.d && w31Var.G == w31Var2.G) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        g7 g7Var = new g7(0, context, f6Var);
        g7Var.setCheckForButtonPress(true);
        return g7Var;
    }

    @Override
    public final boolean e(w31 w31Var, w31 w31Var2) {
        if (w31Var.d == w31Var2.d && w31Var.G == w31Var2.G) {
            return true;
        }
        return false;
    }
}
