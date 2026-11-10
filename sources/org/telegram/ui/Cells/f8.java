package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class f8 extends w31 {
    public static final int f29146b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void a(pj0 pj0Var, View view, x31 x31Var) {
        boolean z9;
        g8 g8Var = (g8) view;
        boolean z10 = false;
        if (x31Var != null && x31Var.f40150e) {
            z9 = true;
        } else {
            z9 = false;
        }
        g8Var.b(z9, true);
        if ((pj0Var instanceof r41) && ((r41) pj0Var).j3) {
            z10 = true;
        }
        g8Var.c(z10);
    }

    @Override
    public final void b(android.view.View r5, org.telegram.ui.Components.x31 r6, boolean r7, org.telegram.ui.Components.m41 r8, org.telegram.ui.Components.r41 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f8.b(android.view.View, org.telegram.ui.Components.x31, boolean, org.telegram.ui.Components.m41, org.telegram.ui.Components.r41):void");
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        final g8 g8Var = new g8(context, 1);
        if (pj0Var instanceof r41) {
            final r41 r41Var = (r41) pj0Var;
            g8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    r41 r41Var2;
                    v4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (r41Var2 = r41.this).f37497g3) != null) {
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
