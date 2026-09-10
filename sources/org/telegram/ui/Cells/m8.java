package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class m8 extends u51 {
    public static final int f19534a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void attachedView(vl0 vl0Var, View view, v51 v51Var) {
        boolean z10;
        n8 n8Var = (n8) view;
        n8Var.b(v51Var.e, true);
        if (vl0Var instanceof r61) {
            z10 = ((r61) vl0Var).f26606c3;
        } else {
            z10 = false;
        }
        n8Var.c(z10);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.v51 r6, boolean r7, org.telegram.ui.Components.j61 r8, org.telegram.ui.Components.r61 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m8.bindView(android.view.View, org.telegram.ui.Components.v51, boolean, org.telegram.ui.Components.j61, org.telegram.ui.Components.r61):void");
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        final n8 n8Var = new n8(context, 1);
        if (vl0Var instanceof r61) {
            final r61 r61Var = (r61) vl0Var;
            n8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    r61 r61Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (r61Var2 = r61.this).Z2) != null) {
                        yVar.r(r61Var2.T(n8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return n8Var;
    }
}
