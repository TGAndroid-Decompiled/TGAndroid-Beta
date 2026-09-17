package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
public final class l8 extends i51 {
    public static final int f20409a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void attachedView(ml0 ml0Var, View view, j51 j51Var) {
        boolean z10;
        m8 m8Var = (m8) view;
        m8Var.b(j51Var.e, true);
        if (ml0Var instanceof f61) {
            z10 = ((f61) ml0Var).f23797c3;
        } else {
            z10 = false;
        }
        m8Var.c(z10);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.j51 r6, boolean r7, org.telegram.ui.Components.x51 r8, org.telegram.ui.Components.f61 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l8.bindView(android.view.View, org.telegram.ui.Components.j51, boolean, org.telegram.ui.Components.x51, org.telegram.ui.Components.f61):void");
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        final m8 m8Var = new m8(context, 1);
        if (ml0Var instanceof f61) {
            final f61 f61Var = (f61) ml0Var;
            m8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    f61 f61Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (f61Var2 = f61.this).Z2) != null) {
                        yVar.r(f61Var2.U(m8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return m8Var;
    }
}
