package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
public final class g8 extends k41 {
    public static final int f30680b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void a(ck0 ck0Var, View view, l41 l41Var) {
        boolean z10;
        h8 h8Var = (h8) view;
        boolean z11 = false;
        if (l41Var != null && l41Var.f37011e) {
            z10 = true;
        } else {
            z10 = false;
        }
        h8Var.b(z10, true);
        if ((ck0Var instanceof e51) && ((e51) ck0Var).f34610k3) {
            z11 = true;
        }
        h8Var.c(z11);
    }

    @Override
    public final void b(android.view.View r5, org.telegram.ui.Components.l41 r6, boolean r7, org.telegram.ui.Components.z41 r8, org.telegram.ui.Components.e51 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g8.b(android.view.View, org.telegram.ui.Components.l41, boolean, org.telegram.ui.Components.z41, org.telegram.ui.Components.e51):void");
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        final h8 h8Var = new h8(context, 1);
        if (ck0Var instanceof e51) {
            final e51 e51Var = (e51) ck0Var;
            h8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    e51 e51Var2;
                    v4.z zVar;
                    if (motionEvent.getAction() == 0 && (zVar = (e51Var2 = e51.this).f34608h3) != null) {
                        zVar.t(e51Var2.T(h8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return h8Var;
    }
}
