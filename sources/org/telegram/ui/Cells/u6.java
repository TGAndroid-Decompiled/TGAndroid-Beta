package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.zo;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.vw0;
public final class u6 extends n41 {
    public static final int f32059b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        Object obj = o41Var.H;
        if (obj instanceof vw0) {
            vw0 vw0Var = (vw0) obj;
            ((w6) view).b(o41Var.f38092m, vw0Var.d, vw0Var.f52910e, z10);
        } else if (obj instanceof zo) {
            ((w6) view).a(o41Var.f38092m, ((zo) obj).f28366b, true, z10);
        }
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new w6(context);
    }
}
