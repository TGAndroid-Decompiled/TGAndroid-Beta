package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
public final class l8 extends q61 {
    public static final int f22420a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void attachedView(sm0 sm0Var, View view, r61 r61Var) {
        boolean z10;
        m8 m8Var = (m8) view;
        boolean z11 = false;
        if (r61Var != null && r61Var.f30355e) {
            z10 = true;
        } else {
            z10 = false;
        }
        m8Var.b(z10, true);
        if ((sm0Var instanceof m71) && ((m71) sm0Var).f28583a3) {
            z11 = true;
        }
        m8Var.c(z11);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.r61 r6, boolean r7, org.telegram.ui.Components.e71 r8, org.telegram.ui.Components.m71 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l8.bindView(android.view.View, org.telegram.ui.Components.r61, boolean, org.telegram.ui.Components.e71, org.telegram.ui.Components.m71):void");
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        final m8 m8Var = new m8(context, 1);
        if (sm0Var instanceof m71) {
            final m71 m71Var = (m71) sm0Var;
            m8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    m71 m71Var2;
                    s4.z zVar;
                    if (motionEvent.getAction() == 0 && (zVar = (m71Var2 = m71.this).X2) != null) {
                        zVar.r(m71Var2.T(m8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return m8Var;
    }
}
