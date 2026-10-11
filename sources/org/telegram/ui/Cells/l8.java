package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class l8 extends p61 {
    public static final int f22456a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void attachedView(rm0 rm0Var, View view, q61 q61Var) {
        boolean z10;
        m8 m8Var = (m8) view;
        boolean z11 = false;
        if (q61Var != null && q61Var.f30161e) {
            z10 = true;
        } else {
            z10 = false;
        }
        m8Var.b(z10, true);
        if ((rm0Var instanceof l71) && ((l71) rm0Var).f28225a3) {
            z11 = true;
        }
        m8Var.c(z11);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.q61 r6, boolean r7, org.telegram.ui.Components.d71 r8, org.telegram.ui.Components.l71 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l8.bindView(android.view.View, org.telegram.ui.Components.q61, boolean, org.telegram.ui.Components.d71, org.telegram.ui.Components.l71):void");
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        final m8 m8Var = new m8(context, 1);
        if (rm0Var instanceof l71) {
            final l71 l71Var = (l71) rm0Var;
            m8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    l71 l71Var2;
                    s4.z zVar;
                    if (motionEvent.getAction() == 0 && (zVar = (l71Var2 = l71.this).X2) != null) {
                        zVar.r(l71Var2.T(m8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return m8Var;
    }
}
