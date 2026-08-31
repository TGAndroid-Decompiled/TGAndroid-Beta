package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
public final class j8 extends i51 {
    public static final int f23029a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void attachedView(tl0 tl0Var, View view, j51 j51Var) {
        boolean z4;
        k8 k8Var = (k8) view;
        k8Var.b(j51Var.f28008e, true);
        if (tl0Var instanceof i61) {
            z4 = ((i61) tl0Var).Z2;
        } else {
            z4 = false;
        }
        k8Var.c(z4);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.j51 r6, boolean r7, org.telegram.ui.Components.x51 r8, org.telegram.ui.Components.i61 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j8.bindView(android.view.View, org.telegram.ui.Components.j51, boolean, org.telegram.ui.Components.x51, org.telegram.ui.Components.i61):void");
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        final k8 k8Var = new k8(context, 1);
        if (tl0Var instanceof i61) {
            final i61 i61Var = (i61) tl0Var;
            k8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    i61 i61Var2;
                    f2.f0 f0Var;
                    if (motionEvent.getAction() == 0 && (f0Var = (i61Var2 = i61.this).W2) != null) {
                        f0Var.r(i61Var2.T(k8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return k8Var;
    }
}
