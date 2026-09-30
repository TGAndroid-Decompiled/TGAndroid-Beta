package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.zl0;
public final class l8 extends x51 {
    public static final int f20632a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void attachedView(zl0 zl0Var, View view, y51 y51Var) {
        boolean z10;
        m8 m8Var = (m8) view;
        m8Var.b(y51Var.e, true);
        if (zl0Var instanceof u61) {
            z10 = ((u61) zl0Var).j3;
        } else {
            z10 = false;
        }
        m8Var.c(z10);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.y51 r6, boolean r7, org.telegram.ui.Components.m61 r8, org.telegram.ui.Components.u61 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l8.bindView(android.view.View, org.telegram.ui.Components.y51, boolean, org.telegram.ui.Components.m61, org.telegram.ui.Components.u61):void");
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        final m8 m8Var = new m8(context, 1);
        if (zl0Var instanceof u61) {
            final u61 u61Var = (u61) zl0Var;
            m8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    u61 u61Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (u61Var2 = u61.this).f28779g3) != null) {
                        yVar.r(u61Var2.T(m8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return m8Var;
    }
}
