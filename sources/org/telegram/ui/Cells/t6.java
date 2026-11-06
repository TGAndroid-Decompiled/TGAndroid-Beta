package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.cp;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
import org.telegram.ui.sw0;
public final class t6 extends w31 {
    public static final int f30523b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        Object obj = x31Var.G;
        if (obj instanceof sw0) {
            sw0 sw0Var = (sw0) obj;
            ((v6) view).b(x31Var.f40159l, sw0Var.d, sw0Var.f49859e, z9);
        } else if (obj instanceof cp) {
            ((v6) view).a(x31Var.f40159l, ((cp) obj).f21884b, true, z9);
        }
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new v6(context);
    }
}
