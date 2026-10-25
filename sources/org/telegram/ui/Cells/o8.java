package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class o8 extends s61 {
    public static final int f24617a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void attachedView(mm0 mm0Var, View view, t61 t61Var) {
        boolean z10;
        p8 p8Var = (p8) view;
        boolean z11 = false;
        if (t61Var != null && t61Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        p8Var.b(z10, true);
        if ((mm0Var instanceof r71) && ((r71) mm0Var).f32154k3) {
            z11 = true;
        }
        p8Var.c(z11);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.t61 r6, boolean r7, org.telegram.ui.Components.j71 r8, org.telegram.ui.Components.r71 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o8.bindView(android.view.View, org.telegram.ui.Components.t61, boolean, org.telegram.ui.Components.j71, org.telegram.ui.Components.r71):void");
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        final p8 p8Var = new p8(context, 1);
        if (mm0Var instanceof r71) {
            final r71 r71Var = (r71) mm0Var;
            p8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    r71 r71Var2;
                    s4.z zVar;
                    if (motionEvent.getAction() == 0 && (zVar = (r71Var2 = r71.this).f32151h3) != null) {
                        zVar.t(r71Var2.T(p8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return p8Var;
    }
}
