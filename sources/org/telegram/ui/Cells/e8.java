package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class e8 extends a41 {
    public static final int f30188b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void a(uj0 uj0Var, View view, b41 b41Var) {
        boolean z10;
        f8 f8Var = (f8) view;
        boolean z11 = false;
        if (b41Var != null && b41Var.f33178e) {
            z10 = true;
        } else {
            z10 = false;
        }
        f8Var.b(z10, true);
        if ((uj0Var instanceof u41) && ((u41) uj0Var).f39895k3) {
            z11 = true;
        }
        f8Var.c(z11);
    }

    @Override
    public final void b(android.view.View r5, org.telegram.ui.Components.b41 r6, boolean r7, org.telegram.ui.Components.p41 r8, org.telegram.ui.Components.u41 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.e8.b(android.view.View, org.telegram.ui.Components.b41, boolean, org.telegram.ui.Components.p41, org.telegram.ui.Components.u41):void");
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        final f8 f8Var = new f8(context, 1);
        if (uj0Var instanceof u41) {
            final u41 u41Var = (u41) uj0Var;
            f8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    u41 u41Var2;
                    v4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (u41Var2 = u41.this).f39893h3) != null) {
                        yVar.t(u41Var2.T(f8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return f8Var;
    }
}
