package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.d20;
import org.telegram.messenger.ij;
import org.telegram.messenger.xe;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class f7 extends x31 {
    public static final int f29134b = 0;

    static {
        x31.h(new x31());
    }

    public static y31 i(xe xeVar, d20 d20Var) {
        y31 K = y31.K(f7.class);
        K.G = xeVar;
        K.H = d20Var;
        return K;
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        g7 g7Var = (g7) view;
        Object obj = y31Var.G;
        if (obj instanceof ij) {
            g7Var.f((ij) obj, z9);
        } else if (obj instanceof xe) {
            xe xeVar = (xe) obj;
            g7Var.setTag(xeVar);
            g7Var.f(xeVar.f26472e, z9);
        }
        Object obj2 = y31Var.H;
        if (obj2 instanceof d20) {
            g7Var.setNeedPlayMessageListener((d20) obj2);
        }
        g7Var.e(y31Var.f40562e, false);
    }

    @Override
    public final boolean c(y31 y31Var, y31 y31Var2) {
        if (y31Var.d == y31Var2.d && y31Var.G == y31Var2.G) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        g7 g7Var = new g7(0, context, g6Var);
        g7Var.setCheckForButtonPress(true);
        return g7Var;
    }

    @Override
    public final boolean e(y31 y31Var, y31 y31Var2) {
        if (y31Var.d == y31Var2.d && y31Var.G == y31Var2.G) {
            return true;
        }
        return false;
    }
}
