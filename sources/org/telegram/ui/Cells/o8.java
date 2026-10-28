package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class o8 extends t61 {
    public static final int f24621a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void attachedView(nm0 nm0Var, View view, u61 u61Var) {
        boolean z10;
        p8 p8Var = (p8) view;
        boolean z11 = false;
        if (u61Var != null && u61Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        p8Var.b(z10, true);
        if ((nm0Var instanceof s71) && ((s71) nm0Var).f32508k3) {
            z11 = true;
        }
        p8Var.c(z11);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.u61 r6, boolean r7, org.telegram.ui.Components.k71 r8, org.telegram.ui.Components.s71 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o8.bindView(android.view.View, org.telegram.ui.Components.u61, boolean, org.telegram.ui.Components.k71, org.telegram.ui.Components.s71):void");
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        final p8 p8Var = new p8(context, 1);
        if (nm0Var instanceof s71) {
            final s71 s71Var = (s71) nm0Var;
            p8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    s71 s71Var2;
                    s4.z zVar;
                    if (motionEvent.getAction() == 0 && (zVar = (s71Var2 = s71.this).f32505h3) != null) {
                        zVar.t(s71Var2.T(p8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return p8Var;
    }
}
