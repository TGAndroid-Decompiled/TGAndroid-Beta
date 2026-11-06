package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.cp;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
import org.telegram.ui.sw0;
public final class t6 extends v31 {
    public static final int f30522b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        Object obj = w31Var.G;
        if (obj instanceof sw0) {
            sw0 sw0Var = (sw0) obj;
            ((v6) view).b(w31Var.f39830l, sw0Var.d, sw0Var.f49860e, z9);
        } else if (obj instanceof cp) {
            ((v6) view).a(w31Var.f39830l, ((cp) obj).f21878b, true, z9);
        }
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new v6(context);
    }
}
