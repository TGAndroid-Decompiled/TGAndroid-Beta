package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.cp;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
import org.telegram.ui.vw0;
public final class t6 extends x31 {
    public static final int f30531b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        Object obj = y31Var.G;
        if (obj instanceof vw0) {
            vw0 vw0Var = (vw0) obj;
            ((v6) view).b(y31Var.f40568l, vw0Var.d, vw0Var.f50794e, z9);
        } else if (obj instanceof cp) {
            ((v6) view).a(y31Var.f40568l, ((cp) obj).f21913b, true, z9);
        }
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new v6(context);
    }
}
