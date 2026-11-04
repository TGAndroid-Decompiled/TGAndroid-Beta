package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class e8 extends q31 {
    public static final int f29132b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void a(tj0 tj0Var, View view, r31 r31Var) {
        boolean z10;
        f8 f8Var = (f8) view;
        boolean z11 = false;
        if (r31Var != null && r31Var.f37621e) {
            z10 = true;
        } else {
            z10 = false;
        }
        f8Var.b(z10, true);
        if ((tj0Var instanceof l41) && ((l41) tj0Var).f35597k3) {
            z11 = true;
        }
        f8Var.c(z11);
    }

    @Override
    public final void b(android.view.View r5, org.telegram.ui.Components.r31 r6, boolean r7, org.telegram.ui.Components.f41 r8, org.telegram.ui.Components.l41 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.e8.b(android.view.View, org.telegram.ui.Components.r31, boolean, org.telegram.ui.Components.f41, org.telegram.ui.Components.l41):void");
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        final f8 f8Var = new f8(context, 1);
        if (tj0Var instanceof l41) {
            final l41 l41Var = (l41) tj0Var;
            f8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    l41 l41Var2;
                    u4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (l41Var2 = l41.this).f35595h3) != null) {
                        yVar.t(l41Var2.T(f8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return f8Var;
    }
}
