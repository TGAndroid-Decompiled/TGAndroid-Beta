package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class g8 extends n41 {
    public static final int f30711b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void a(ek0 ek0Var, View view, o41 o41Var) {
        boolean z10;
        h8 h8Var = (h8) view;
        boolean z11 = false;
        if (o41Var != null && o41Var.f38085e) {
            z10 = true;
        } else {
            z10 = false;
        }
        h8Var.b(z10, true);
        if ((ek0Var instanceof h51) && ((h51) ek0Var).f35793k3) {
            z11 = true;
        }
        h8Var.c(z11);
    }

    @Override
    public final void b(android.view.View r5, org.telegram.ui.Components.o41 r6, boolean r7, org.telegram.ui.Components.c51 r8, org.telegram.ui.Components.h51 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g8.b(android.view.View, org.telegram.ui.Components.o41, boolean, org.telegram.ui.Components.c51, org.telegram.ui.Components.h51):void");
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        final h8 h8Var = new h8(context, 1);
        if (ek0Var instanceof h51) {
            final h51 h51Var = (h51) ek0Var;
            h8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    h51 h51Var2;
                    v4.z zVar;
                    if (motionEvent.getAction() == 0 && (zVar = (h51Var2 = h51.this).f35791h3) != null) {
                        zVar.t(h51Var2.T(h8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return h8Var;
    }
}
