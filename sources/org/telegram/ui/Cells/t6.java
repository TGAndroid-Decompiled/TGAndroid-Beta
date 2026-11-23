package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.yo;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.tw0;
public final class t6 extends m41 {
    public static final int f31928b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        Object obj = n41Var.H;
        if (obj instanceof tw0) {
            tw0 tw0Var = (tw0) obj;
            ((v6) view).b(n41Var.f37655m, tw0Var.d, tw0Var.f52492e, z10);
        } else if (obj instanceof yo) {
            ((v6) view).a(n41Var.f37655m, ((yo) obj).f28270b, true, z10);
        }
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new v6(context);
    }
}
