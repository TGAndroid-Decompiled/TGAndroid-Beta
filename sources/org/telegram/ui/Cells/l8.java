package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
public final class l8 extends g51 {
    public static final int f22283a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void attachedView(ll0 ll0Var, View view, h51 h51Var) {
        boolean z10;
        m8 m8Var = (m8) view;
        m8Var.b(h51Var.f26615e, true);
        if (ll0Var instanceof d61) {
            z10 = ((d61) ll0Var).f25308c3;
        } else {
            z10 = false;
        }
        m8Var.c(z10);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.h51 r6, boolean r7, org.telegram.ui.Components.v51 r8, org.telegram.ui.Components.d61 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l8.bindView(android.view.View, org.telegram.ui.Components.h51, boolean, org.telegram.ui.Components.v51, org.telegram.ui.Components.d61):void");
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        final m8 m8Var = new m8(context, 1);
        if (ll0Var instanceof d61) {
            final d61 d61Var = (d61) ll0Var;
            m8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    d61 d61Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (d61Var2 = d61.this).Z2) != null) {
                        yVar.r(d61Var2.T(m8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return m8Var;
    }
}
