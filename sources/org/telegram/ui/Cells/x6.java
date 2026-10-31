package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hp;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
import org.telegram.ui.gy0;
public final class x6 extends z41 {
    public static final int f23584b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        Object obj = a51Var.G;
        if (obj instanceof gy0) {
            gy0 gy0Var = (gy0) obj;
            ((z6) view).b(a51Var.f24292l, gy0Var.d, gy0Var.e, z10);
        } else if (obj instanceof hp) {
            ((z6) view).a(a51Var.f24292l, ((hp) obj).f15927b, true, z10);
        }
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new z6(context);
    }
}
