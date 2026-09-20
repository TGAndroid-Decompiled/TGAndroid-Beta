package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class m8 extends v51 {
    public static final int f20655a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void attachedView(vl0 vl0Var, View view, w51 w51Var) {
        boolean z10;
        n8 n8Var = (n8) view;
        n8Var.b(w51Var.e, true);
        if (vl0Var instanceof s61) {
            z10 = ((s61) vl0Var).f28065c3;
        } else {
            z10 = false;
        }
        n8Var.c(z10);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.w51 r6, boolean r7, org.telegram.ui.Components.k61 r8, org.telegram.ui.Components.s61 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m8.bindView(android.view.View, org.telegram.ui.Components.w51, boolean, org.telegram.ui.Components.k61, org.telegram.ui.Components.s61):void");
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        final n8 n8Var = new n8(context, 1);
        if (vl0Var instanceof s61) {
            final s61 s61Var = (s61) vl0Var;
            n8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    s61 s61Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (s61Var2 = s61.this).Z2) != null) {
                        yVar.r(s61Var2.U(n8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return n8Var;
    }
}
