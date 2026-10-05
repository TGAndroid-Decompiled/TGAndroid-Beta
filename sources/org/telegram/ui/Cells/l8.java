package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.zl0;
public final class l8 extends g61 {
    public static final int f22446a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void attachedView(zl0 zl0Var, View view, h61 h61Var) {
        boolean z10;
        m8 m8Var = (m8) view;
        boolean z11 = false;
        if (h61Var != null && h61Var.f27087e) {
            z10 = true;
        } else {
            z10 = false;
        }
        m8Var.b(z10, true);
        if ((zl0Var instanceof e71) && ((e71) zl0Var).j3) {
            z11 = true;
        }
        m8Var.c(z11);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.h61 r6, boolean r7, org.telegram.ui.Components.w61 r8, org.telegram.ui.Components.e71 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l8.bindView(android.view.View, org.telegram.ui.Components.h61, boolean, org.telegram.ui.Components.w61, org.telegram.ui.Components.e71):void");
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        final m8 m8Var = new m8(context, 1);
        if (zl0Var instanceof e71) {
            final e71 e71Var = (e71) zl0Var;
            m8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    e71 e71Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (e71Var2 = e71.this).f26035g3) != null) {
                        yVar.r(e71Var2.T(m8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return m8Var;
    }
}
