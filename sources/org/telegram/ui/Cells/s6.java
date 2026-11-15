package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.zo;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.rw0;
public final class s6 extends a41 {
    public static final int f31417b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        Object obj = b41Var.G;
        if (obj instanceof rw0) {
            rw0 rw0Var = (rw0) obj;
            ((u6) view).b(b41Var.f33181l, rw0Var.d, rw0Var.f51046e, z10);
        } else if (obj instanceof zo) {
            ((u6) view).a(b41Var.f33181l, ((zo) obj).f27981b, true, z10);
        }
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new u6(context);
    }
}
