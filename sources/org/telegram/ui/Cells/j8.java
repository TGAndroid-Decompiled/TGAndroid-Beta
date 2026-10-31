package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class j8 extends z41 {
    public static final int f22095b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void a(tk0 tk0Var, View view, a51 a51Var) {
        boolean z10;
        k8 k8Var = (k8) view;
        boolean z11 = false;
        if (a51Var != null && a51Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        k8Var.b(z10, true);
        if ((tk0Var instanceof u51) && ((u51) tk0Var).f30823j3) {
            z11 = true;
        }
        k8Var.c(z11);
    }

    @Override
    public final void b(android.view.View r5, org.telegram.ui.Components.a51 r6, boolean r7, org.telegram.ui.Components.p51 r8, org.telegram.ui.Components.u51 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j8.b(android.view.View, org.telegram.ui.Components.a51, boolean, org.telegram.ui.Components.p51, org.telegram.ui.Components.u51):void");
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        final k8 k8Var = new k8(context, 1);
        if (tk0Var instanceof u51) {
            final u51 u51Var = (u51) tk0Var;
            k8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    u51 u51Var2;
                    s4.x xVar;
                    if (motionEvent.getAction() == 0 && (xVar = (u51Var2 = u51.this).f30820g3) != null) {
                        xVar.t(u51Var2.T(k8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return k8Var;
    }
}
