package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xl0;
public final class l8 extends v51 {
    public static final int f20615a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void attachedView(xl0 xl0Var, View view, w51 w51Var) {
        boolean z10;
        m8 m8Var = (m8) view;
        m8Var.b(w51Var.e, true);
        if (xl0Var instanceof s61) {
            z10 = ((s61) xl0Var).f28179c3;
        } else {
            z10 = false;
        }
        m8Var.c(z10);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.w51 r6, boolean r7, org.telegram.ui.Components.k61 r8, org.telegram.ui.Components.s61 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l8.bindView(android.view.View, org.telegram.ui.Components.w51, boolean, org.telegram.ui.Components.k61, org.telegram.ui.Components.s61):void");
    }

    @Override
    public final View createView(Context context, xl0 xl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        final m8 m8Var = new m8(context, 1);
        if (xl0Var instanceof s61) {
            final s61 s61Var = (s61) xl0Var;
            m8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    s61 s61Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (s61Var2 = s61.this).Z2) != null) {
                        yVar.r(s61Var2.T(m8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return m8Var;
    }
}
