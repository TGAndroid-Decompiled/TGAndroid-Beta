package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.d20;
import org.telegram.messenger.ij;
import org.telegram.messenger.xe;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
public final class f7 extends q31 {
    public static final int f29126b = 0;

    static {
        q31.h(new q31());
    }

    public static r31 i(xe xeVar, d20 d20Var) {
        r31 K = r31.K(f7.class);
        K.G = xeVar;
        K.H = d20Var;
        return K;
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        g7 g7Var = (g7) view;
        Object obj = r31Var.G;
        if (obj instanceof ij) {
            g7Var.f((ij) obj, z9);
        } else if (obj instanceof xe) {
            xe xeVar = (xe) obj;
            g7Var.setTag(xeVar);
            g7Var.f(xeVar.f26457e, z9);
        }
        Object obj2 = r31Var.H;
        if (obj2 instanceof d20) {
            g7Var.setNeedPlayMessageListener((d20) obj2);
        }
        g7Var.e(r31Var.f37592e, false);
    }

    @Override
    public final boolean c(r31 r31Var, r31 r31Var2) {
        if (r31Var.d == r31Var2.d && r31Var.G == r31Var2.G) {
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
    public final boolean e(r31 r31Var, r31 r31Var2) {
        if (r31Var.d == r31Var2.d && r31Var.G == r31Var2.G) {
            return true;
        }
        return false;
    }
}
