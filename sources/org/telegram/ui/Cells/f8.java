package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class f8 extends m41 {
    public static final int f30708b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void a(ek0 ek0Var, View view, n41 n41Var) {
        boolean z10;
        g8 g8Var = (g8) view;
        boolean z11 = false;
        if (n41Var != null && n41Var.f37648e) {
            z10 = true;
        } else {
            z10 = false;
        }
        g8Var.b(z10, true);
        if ((ek0Var instanceof g51) && ((g51) ek0Var).f35326k3) {
            z11 = true;
        }
        g8Var.c(z11);
    }

    @Override
    public final void b(android.view.View r5, org.telegram.ui.Components.n41 r6, boolean r7, org.telegram.ui.Components.b51 r8, org.telegram.ui.Components.g51 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f8.b(android.view.View, org.telegram.ui.Components.n41, boolean, org.telegram.ui.Components.b51, org.telegram.ui.Components.g51):void");
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        final g8 g8Var = new g8(context, 1);
        if (ek0Var instanceof g51) {
            final g51 g51Var = (g51) ek0Var;
            g8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    g51 g51Var2;
                    v4.z zVar;
                    if (motionEvent.getAction() == 0 && (zVar = (g51Var2 = g51.this).f35324h3) != null) {
                        zVar.t(g51Var2.T(g8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return g8Var;
    }
}
