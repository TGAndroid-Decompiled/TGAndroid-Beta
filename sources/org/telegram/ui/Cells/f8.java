package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
public final class f8 extends q31 {
    public static final int f29127b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void a(pj0 pj0Var, View view, r31 r31Var) {
        boolean z9;
        g8 g8Var = (g8) view;
        boolean z10 = false;
        if (r31Var != null && r31Var.f37592e) {
            z9 = true;
        } else {
            z9 = false;
        }
        g8Var.b(z9, true);
        if ((pj0Var instanceof k41) && ((k41) pj0Var).j3) {
            z10 = true;
        }
        g8Var.c(z10);
    }

    @Override
    public final void b(android.view.View r5, org.telegram.ui.Components.r31 r6, boolean r7, org.telegram.ui.Components.f41 r8, org.telegram.ui.Components.k41 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f8.b(android.view.View, org.telegram.ui.Components.r31, boolean, org.telegram.ui.Components.f41, org.telegram.ui.Components.k41):void");
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        final g8 g8Var = new g8(context, 1);
        if (pj0Var instanceof k41) {
            final k41 k41Var = (k41) pj0Var;
            g8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    k41 k41Var2;
                    v4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (k41Var2 = k41.this).f35168g3) != null) {
                        yVar.t(k41Var2.T(g8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return g8Var;
    }
}
