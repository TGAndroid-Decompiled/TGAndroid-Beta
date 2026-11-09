package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class f8 extends x31 {
    public static final int f29135b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void a(qj0 qj0Var, View view, y31 y31Var) {
        boolean z9;
        g8 g8Var = (g8) view;
        boolean z10 = false;
        if (y31Var != null && y31Var.f40562e) {
            z9 = true;
        } else {
            z9 = false;
        }
        g8Var.b(z9, true);
        if ((qj0Var instanceof r41) && ((r41) qj0Var).j3) {
            z10 = true;
        }
        g8Var.c(z10);
    }

    @Override
    public final void b(android.view.View r5, org.telegram.ui.Components.y31 r6, boolean r7, org.telegram.ui.Components.m41 r8, org.telegram.ui.Components.r41 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f8.b(android.view.View, org.telegram.ui.Components.y31, boolean, org.telegram.ui.Components.m41, org.telegram.ui.Components.r41):void");
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        final g8 g8Var = new g8(context, 1);
        if (qj0Var instanceof r41) {
            final r41 r41Var = (r41) qj0Var;
            g8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    r41 r41Var2;
                    v4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (r41Var2 = r41.this).f37557g3) != null) {
                        yVar.t(r41Var2.T(g8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return g8Var;
    }
}
