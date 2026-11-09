package org.telegram.messenger;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class zt extends x31 {
    public static final int f26923b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        au auVar = (au) view;
        auVar.set((TL_iv.RichMessage) y31Var.G);
        auVar.setTranslationLoading(y31Var.f40562e);
    }

    @Override
    public final boolean c(y31 y31Var, y31 y31Var2) {
        if (y31Var.d == y31Var2.d && y31Var.G == y31Var2.G && y31Var.f40562e == y31Var2.f40562e) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        au auVar = new au(i7, context, g6Var);
        auVar.setPadding(g0.L(20.0f), 0, g0.L(20.0f), g0.L(16.0f));
        return auVar;
    }

    @Override
    public final boolean e(y31 y31Var, y31 y31Var2) {
        if (y31Var.d == y31Var2.d) {
            return true;
        }
        return false;
    }
}
