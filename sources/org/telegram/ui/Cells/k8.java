package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
public final class k8 extends g61 {
    public static final int f22513a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void attachedView(jm0 jm0Var, View view, h61 h61Var) {
        boolean z10;
        l8 l8Var = (l8) view;
        boolean z11 = false;
        if (h61Var != null && h61Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        l8Var.b(z10, true);
        if ((jm0Var instanceof c71) && ((c71) jm0Var).f25118a3) {
            z11 = true;
        }
        l8Var.c(z11);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.h61 r6, boolean r7, org.telegram.ui.Components.u61 r8, org.telegram.ui.Components.c71 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.k8.bindView(android.view.View, org.telegram.ui.Components.h61, boolean, org.telegram.ui.Components.u61, org.telegram.ui.Components.c71):void");
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        final l8 l8Var = new l8(context, 1);
        if (jm0Var instanceof c71) {
            final c71 c71Var = (c71) jm0Var;
            l8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    c71 c71Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (c71Var2 = c71.this).X2) != null) {
                        yVar.r(c71Var2.T(l8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return l8Var;
    }
}
