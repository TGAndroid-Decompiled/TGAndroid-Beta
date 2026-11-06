package org.telegram.messenger;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
public final class zt extends v31 {
    public static final int f26921b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        au auVar = (au) view;
        auVar.set((TL_iv.RichMessage) w31Var.G);
        auVar.setTranslationLoading(w31Var.f39824e);
    }

    @Override
    public final boolean c(w31 w31Var, w31 w31Var2) {
        if (w31Var.d == w31Var2.d && w31Var.G == w31Var2.G && w31Var.f39824e == w31Var2.f39824e) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        au auVar = new au(i7, context, f6Var);
        auVar.setPadding(g0.L(20.0f), 0, g0.L(20.0f), g0.L(16.0f));
        return auVar;
    }

    @Override
    public final boolean e(w31 w31Var, w31 w31Var2) {
        if (w31Var.d == w31Var2.d) {
            return true;
        }
        return false;
    }
}
