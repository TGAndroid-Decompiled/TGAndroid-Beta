package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
public final class m8 extends g51 {
    public static final int f20410a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void attachedView(ml0 ml0Var, View view, h51 h51Var) {
        boolean z10;
        n8 n8Var = (n8) view;
        n8Var.b(h51Var.e, true);
        if (ml0Var instanceof d61) {
            z10 = ((d61) ml0Var).f23292c3;
        } else {
            z10 = false;
        }
        n8Var.c(z10);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.h51 r6, boolean r7, org.telegram.ui.Components.v51 r8, org.telegram.ui.Components.d61 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m8.bindView(android.view.View, org.telegram.ui.Components.h51, boolean, org.telegram.ui.Components.v51, org.telegram.ui.Components.d61):void");
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        final n8 n8Var = new n8(context, 1);
        if (ml0Var instanceof d61) {
            final d61 d61Var = (d61) ml0Var;
            n8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    d61 d61Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (d61Var2 = d61.this).Z2) != null) {
                        yVar.r(d61Var2.T(n8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return n8Var;
    }
}
