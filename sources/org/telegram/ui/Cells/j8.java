package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
public final class j8 extends h51 {
    public static final int f21267a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void attachedView(sl0 sl0Var, View view, i51 i51Var) {
        boolean z4;
        k8 k8Var = (k8) view;
        k8Var.b(i51Var.e, true);
        if (sl0Var instanceof g61) {
            z4 = ((g61) sl0Var).Z2;
        } else {
            z4 = false;
        }
        k8Var.c(z4);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.i51 r6, boolean r7, org.telegram.ui.Components.w51 r8, org.telegram.ui.Components.g61 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j8.bindView(android.view.View, org.telegram.ui.Components.i51, boolean, org.telegram.ui.Components.w51, org.telegram.ui.Components.g61):void");
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        final k8 k8Var = new k8(context, 1);
        if (sl0Var instanceof g61) {
            final g61 g61Var = (g61) sl0Var;
            k8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    g61 g61Var2;
                    f2.e0 e0Var;
                    if (motionEvent.getAction() == 0 && (e0Var = (g61Var2 = g61.this).W2) != null) {
                        e0Var.r(g61Var2.T(k8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return k8Var;
    }
}
