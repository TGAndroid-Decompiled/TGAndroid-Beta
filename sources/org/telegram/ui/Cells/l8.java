package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
public final class l8 extends w51 {
    public static final int f20616a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void attachedView(yl0 yl0Var, View view, x51 x51Var) {
        boolean z10;
        m8 m8Var = (m8) view;
        m8Var.b(x51Var.e, true);
        if (yl0Var instanceof t61) {
            z10 = ((t61) yl0Var).f28482c3;
        } else {
            z10 = false;
        }
        m8Var.c(z10);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.x51 r6, boolean r7, org.telegram.ui.Components.l61 r8, org.telegram.ui.Components.t61 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l8.bindView(android.view.View, org.telegram.ui.Components.x51, boolean, org.telegram.ui.Components.l61, org.telegram.ui.Components.t61):void");
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        final m8 m8Var = new m8(context, 1);
        if (yl0Var instanceof t61) {
            final t61 t61Var = (t61) yl0Var;
            m8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    t61 t61Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (t61Var2 = t61.this).Z2) != null) {
                        yVar.r(t61Var2.T(m8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return m8Var;
    }
}
