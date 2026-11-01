package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ip;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.fy0;
public final class x6 extends a51 {
    public static final int f23585b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        Object obj = b51Var.G;
        if (obj instanceof fy0) {
            fy0 fy0Var = (fy0) obj;
            ((z6) view).b(b51Var.f24643l, fy0Var.d, fy0Var.e, z10);
        } else if (obj instanceof ip) {
            ((z6) view).a(b51Var.f24643l, ((ip) obj).f16320b, true, z10);
        }
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new z6(context);
    }
}
