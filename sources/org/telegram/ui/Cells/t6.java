package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.cp;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
import org.telegram.ui.xw0;
public final class t6 extends w31 {
    public static final int f30542b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        Object obj = x31Var.G;
        if (obj instanceof xw0) {
            xw0 xw0Var = (xw0) obj;
            ((v6) view).b(x31Var.f40156l, xw0Var.d, xw0Var.f51834e, z9);
        } else if (obj instanceof cp) {
            ((v6) view).a(x31Var.f40156l, ((cp) obj).f21917b, true, z9);
        }
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new v6(context);
    }
}
