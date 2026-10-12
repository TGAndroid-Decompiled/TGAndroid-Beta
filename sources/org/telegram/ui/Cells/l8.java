package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
public final class l8 extends k61 {
    public static final int f21490a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void attachedView(mm0 mm0Var, View view, l61 l61Var) {
        boolean z10;
        m8 m8Var = (m8) view;
        boolean z11 = false;
        if (l61Var != null && l61Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        m8Var.b(z10, true);
        if ((mm0Var instanceof h71) && ((h71) mm0Var).f25532a3) {
            z11 = true;
        }
        m8Var.c(z11);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.l61 r6, boolean r7, org.telegram.ui.Components.z61 r8, org.telegram.ui.Components.h71 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l8.bindView(android.view.View, org.telegram.ui.Components.l61, boolean, org.telegram.ui.Components.z61, org.telegram.ui.Components.h71):void");
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        final m8 m8Var = new m8(context, 1);
        if (mm0Var instanceof h71) {
            final h71 h71Var = (h71) mm0Var;
            m8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    h71 h71Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (h71Var2 = h71.this).X2) != null) {
                        yVar.r(h71Var2.T(m8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return m8Var;
    }
}
