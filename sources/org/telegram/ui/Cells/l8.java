package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
public final class l8 extends o61 {
    public static final int f22428a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void attachedView(qm0 qm0Var, View view, p61 p61Var) {
        boolean z10;
        m8 m8Var = (m8) view;
        boolean z11 = false;
        if (p61Var != null && p61Var.f29728e) {
            z10 = true;
        } else {
            z10 = false;
        }
        m8Var.b(z10, true);
        if ((qm0Var instanceof k71) && ((k71) qm0Var).f27866a3) {
            z11 = true;
        }
        m8Var.c(z11);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.p61 r6, boolean r7, org.telegram.ui.Components.c71 r8, org.telegram.ui.Components.k71 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l8.bindView(android.view.View, org.telegram.ui.Components.p61, boolean, org.telegram.ui.Components.c71, org.telegram.ui.Components.k71):void");
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        final m8 m8Var = new m8(context, 1);
        if (qm0Var instanceof k71) {
            final k71 k71Var = (k71) qm0Var;
            m8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    k71 k71Var2;
                    s4.z zVar;
                    if (motionEvent.getAction() == 0 && (zVar = (k71Var2 = k71.this).X2) != null) {
                        zVar.r(k71Var2.T(m8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return m8Var;
    }
}
