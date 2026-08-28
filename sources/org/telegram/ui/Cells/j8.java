package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
public final class j8 extends k41 {
    public static final int f24576a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void attachedView(wk0 wk0Var, View view, l41 l41Var) {
        boolean z10;
        k8 k8Var = (k8) view;
        k8Var.b(l41Var.f30333e, true);
        if (wk0Var instanceof i51) {
            z10 = ((i51) wk0Var).Y2;
        } else {
            z10 = false;
        }
        k8Var.c(z10);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.l41 r6, boolean r7, org.telegram.ui.Components.z41 r8, org.telegram.ui.Components.i51 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j8.bindView(android.view.View, org.telegram.ui.Components.l41, boolean, org.telegram.ui.Components.z41, org.telegram.ui.Components.i51):void");
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        final k8 k8Var = new k8(context, 1);
        if (wk0Var instanceof i51) {
            final i51 i51Var = (i51) wk0Var;
            k8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    i51 i51Var2;
                    f2.h0 h0Var;
                    if (motionEvent.getAction() == 0 && (h0Var = (i51Var2 = i51.this).V2) != null) {
                        h0Var.r(i51Var2.T(k8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return k8Var;
    }
}
