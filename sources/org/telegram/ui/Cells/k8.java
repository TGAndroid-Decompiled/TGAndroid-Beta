package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
public final class k8 extends k61 {
    public static final int f22649a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void attachedView(lm0 lm0Var, View view, l61 l61Var) {
        boolean z10;
        l8 l8Var = (l8) view;
        boolean z11 = false;
        if (l61Var != null && l61Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        l8Var.b(z10, true);
        if ((lm0Var instanceof i71) && ((i71) lm0Var).f27322d3) {
            z11 = true;
        }
        l8Var.c(z11);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.l61 r6, boolean r7, org.telegram.ui.Components.a71 r8, org.telegram.ui.Components.i71 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.k8.bindView(android.view.View, org.telegram.ui.Components.l61, boolean, org.telegram.ui.Components.a71, org.telegram.ui.Components.i71):void");
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        final l8 l8Var = new l8(context, 1);
        if (lm0Var instanceof i71) {
            final i71 i71Var = (i71) lm0Var;
            l8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    i71 i71Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (i71Var2 = i71.this).f27319a3) != null) {
                        yVar.r(i71Var2.T(l8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return l8Var;
    }
}
