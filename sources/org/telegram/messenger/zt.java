package org.telegram.messenger;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class zt extends w31 {
    public static final int f26927b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        au auVar = (au) view;
        auVar.set((TL_iv.RichMessage) x31Var.G);
        auVar.setTranslationLoading(x31Var.f40150e);
    }

    @Override
    public final boolean c(x31 x31Var, x31 x31Var2) {
        if (x31Var.d == x31Var2.d && x31Var.G == x31Var2.G && x31Var.f40150e == x31Var2.f40150e) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        au auVar = new au(i7, context, h6Var);
        auVar.setPadding(g0.L(20.0f), 0, g0.L(20.0f), g0.L(16.0f));
        return auVar;
    }

    @Override
    public final boolean e(x31 x31Var, x31 x31Var2) {
        if (x31Var.d == x31Var2.d) {
            return true;
        }
        return false;
    }
}
