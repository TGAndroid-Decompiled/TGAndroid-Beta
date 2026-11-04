package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.to;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.kw0;
public final class s6 extends q31 {
    public static final int f30341b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        Object obj = r31Var.G;
        if (obj instanceof kw0) {
            kw0 kw0Var = (kw0) obj;
            ((u6) view).b(r31Var.f37627l, kw0Var.d, kw0Var.f47040e, z10);
        } else if (obj instanceof to) {
            ((u6) view).a(r31Var.f37627l, ((to) obj).f25575b, true, z10);
        }
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new u6(context);
    }
}
