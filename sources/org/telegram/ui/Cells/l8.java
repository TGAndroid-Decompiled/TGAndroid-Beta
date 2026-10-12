package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class l8 extends t61 {
    public static final int f22192a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void attachedView(wm0 wm0Var, View view, u61 u61Var) {
        boolean z10;
        m8 m8Var = (m8) view;
        boolean z11 = false;
        if (u61Var != null && u61Var.f31065e) {
            z10 = true;
        } else {
            z10 = false;
        }
        m8Var.b(z10, true);
        if ((wm0Var instanceof p71) && ((p71) wm0Var).f29442a3) {
            z11 = true;
        }
        m8Var.c(z11);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.u61 r6, boolean r7, org.telegram.ui.Components.h71 r8, org.telegram.ui.Components.p71 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l8.bindView(android.view.View, org.telegram.ui.Components.u61, boolean, org.telegram.ui.Components.h71, org.telegram.ui.Components.p71):void");
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        final m8 m8Var = new m8(context, 1);
        if (wm0Var instanceof p71) {
            final p71 p71Var = (p71) wm0Var;
            m8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    p71 p71Var2;
                    s4.z zVar;
                    if (motionEvent.getAction() == 0 && (zVar = (p71Var2 = p71.this).X2) != null) {
                        zVar.r(p71Var2.T(m8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return m8Var;
    }
}
