package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.yo;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.vw0;
public final class u6 extends k41 {
    public static final int f32028b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        Object obj = l41Var.H;
        if (obj instanceof vw0) {
            vw0 vw0Var = (vw0) obj;
            ((w6) view).b(l41Var.f37018m, vw0Var.d, vw0Var.f52865e, z10);
        } else if (obj instanceof yo) {
            ((w6) view).a(l41Var.f37018m, ((yo) obj).f28170b, true, z10);
        }
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new w6(context);
    }
}
