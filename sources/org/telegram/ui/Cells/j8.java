package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
public final class j8 extends g51 {
    public static final int f23031a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void attachedView(sl0 sl0Var, View view, h51 h51Var) {
        boolean z4;
        k8 k8Var = (k8) view;
        k8Var.b(h51Var.f27369e, true);
        if (sl0Var instanceof h61) {
            z4 = ((h61) sl0Var).Z2;
        } else {
            z4 = false;
        }
        k8Var.c(z4);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.h51 r6, boolean r7, org.telegram.ui.Components.w51 r8, org.telegram.ui.Components.h61 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j8.bindView(android.view.View, org.telegram.ui.Components.h51, boolean, org.telegram.ui.Components.w51, org.telegram.ui.Components.h61):void");
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        final k8 k8Var = new k8(context, 1);
        if (sl0Var instanceof h61) {
            final h61 h61Var = (h61) sl0Var;
            k8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    h61 h61Var2;
                    f2.f0 f0Var;
                    if (motionEvent.getAction() == 0 && (f0Var = (h61Var2 = h61.this).W2) != null) {
                        f0Var.r(h61Var2.T(k8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return k8Var;
    }
}
