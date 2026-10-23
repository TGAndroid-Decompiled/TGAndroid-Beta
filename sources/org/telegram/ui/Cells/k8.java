package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class k8 extends l61 {
    public static final int f22648a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void attachedView(mm0 mm0Var, View view, m61 m61Var) {
        boolean z10;
        l8 l8Var = (l8) view;
        boolean z11 = false;
        if (m61Var != null && m61Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        l8Var.b(z10, true);
        if ((mm0Var instanceof j71) && ((j71) mm0Var).f27543d3) {
            z11 = true;
        }
        l8Var.c(z11);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.m61 r6, boolean r7, org.telegram.ui.Components.b71 r8, org.telegram.ui.Components.j71 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.k8.bindView(android.view.View, org.telegram.ui.Components.m61, boolean, org.telegram.ui.Components.b71, org.telegram.ui.Components.j71):void");
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        final l8 l8Var = new l8(context, 1);
        if (mm0Var instanceof j71) {
            final j71 j71Var = (j71) mm0Var;
            l8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    j71 j71Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (j71Var2 = j71.this).f27540a3) != null) {
                        yVar.r(j71Var2.T(l8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return l8Var;
    }
}
