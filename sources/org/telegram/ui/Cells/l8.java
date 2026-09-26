package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;
public final class l8 extends u51 {
    public static final int f20615a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void attachedView(wl0 wl0Var, View view, v51 v51Var) {
        boolean z10;
        m8 m8Var = (m8) view;
        m8Var.b(v51Var.e, true);
        if (wl0Var instanceof r61) {
            z10 = ((r61) wl0Var).f27886c3;
        } else {
            z10 = false;
        }
        m8Var.c(z10);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.v51 r6, boolean r7, org.telegram.ui.Components.j61 r8, org.telegram.ui.Components.r61 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l8.bindView(android.view.View, org.telegram.ui.Components.v51, boolean, org.telegram.ui.Components.j61, org.telegram.ui.Components.r61):void");
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        final m8 m8Var = new m8(context, 1);
        if (wl0Var instanceof r61) {
            final r61 r61Var = (r61) wl0Var;
            m8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    r61 r61Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (r61Var2 = r61.this).Z2) != null) {
                        yVar.r(r61Var2.T(m8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return m8Var;
    }
}
