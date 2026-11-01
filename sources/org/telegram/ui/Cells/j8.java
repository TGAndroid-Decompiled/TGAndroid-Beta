package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class j8 extends a51 {
    public static final int f22096b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void a(uk0 uk0Var, View view, b51 b51Var) {
        boolean z10;
        k8 k8Var = (k8) view;
        boolean z11 = false;
        if (b51Var != null && b51Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        k8Var.b(z10, true);
        if ((uk0Var instanceof v51) && ((v51) uk0Var).f31187j3) {
            z11 = true;
        }
        k8Var.c(z11);
    }

    @Override
    public final void b(android.view.View r5, org.telegram.ui.Components.b51 r6, boolean r7, org.telegram.ui.Components.q51 r8, org.telegram.ui.Components.v51 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j8.b(android.view.View, org.telegram.ui.Components.b51, boolean, org.telegram.ui.Components.q51, org.telegram.ui.Components.v51):void");
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        final k8 k8Var = new k8(context, 1);
        if (uk0Var instanceof v51) {
            final v51 v51Var = (v51) uk0Var;
            k8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    v51 v51Var2;
                    s4.x xVar;
                    if (motionEvent.getAction() == 0 && (xVar = (v51Var2 = v51.this).f31184g3) != null) {
                        xVar.t(v51Var2.T(k8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return k8Var;
    }
}
