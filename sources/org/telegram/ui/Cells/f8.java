package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
public final class f8 extends v31 {
    public static final int f29127b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void a(pj0 pj0Var, View view, w31 w31Var) {
        boolean z9;
        g8 g8Var = (g8) view;
        boolean z10 = false;
        if (w31Var != null && w31Var.f39824e) {
            z9 = true;
        } else {
            z9 = false;
        }
        g8Var.b(z9, true);
        if ((pj0Var instanceof p41) && ((p41) pj0Var).j3) {
            z10 = true;
        }
        g8Var.c(z10);
    }

    @Override
    public final void b(android.view.View r5, org.telegram.ui.Components.w31 r6, boolean r7, org.telegram.ui.Components.k41 r8, org.telegram.ui.Components.p41 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f8.b(android.view.View, org.telegram.ui.Components.w31, boolean, org.telegram.ui.Components.k41, org.telegram.ui.Components.p41):void");
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        final g8 g8Var = new g8(context, 1);
        if (pj0Var instanceof p41) {
            final p41 p41Var = (p41) pj0Var;
            g8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    p41 p41Var2;
                    v4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (p41Var2 = p41.this).f36782g3) != null) {
                        yVar.t(p41Var2.T(g8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return g8Var;
    }
}
