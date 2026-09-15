package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
public final class l8 extends h51 {
    public static final int f20399a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void attachedView(ll0 ll0Var, View view, i51 i51Var) {
        boolean z10;
        m8 m8Var = (m8) view;
        m8Var.b(i51Var.e, true);
        if (ll0Var instanceof e61) {
            z10 = ((e61) ll0Var).f23560c3;
        } else {
            z10 = false;
        }
        m8Var.c(z10);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.i51 r6, boolean r7, org.telegram.ui.Components.w51 r8, org.telegram.ui.Components.e61 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l8.bindView(android.view.View, org.telegram.ui.Components.i51, boolean, org.telegram.ui.Components.w51, org.telegram.ui.Components.e61):void");
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        final m8 m8Var = new m8(context, 1);
        if (ll0Var instanceof e61) {
            final e61 e61Var = (e61) ll0Var;
            m8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    e61 e61Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (e61Var2 = e61.this).Z2) != null) {
                        yVar.r(e61Var2.T(m8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return m8Var;
    }
}
