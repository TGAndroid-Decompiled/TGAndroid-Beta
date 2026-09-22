package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
public final class m8 extends x51 {
    public static final int f20670a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void attachedView(yl0 yl0Var, View view, y51 y51Var) {
        boolean z10;
        n8 n8Var = (n8) view;
        n8Var.b(y51Var.e, true);
        if (yl0Var instanceof u61) {
            z10 = ((u61) yl0Var).f28684c3;
        } else {
            z10 = false;
        }
        n8Var.c(z10);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.y51 r6, boolean r7, org.telegram.ui.Components.m61 r8, org.telegram.ui.Components.u61 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m8.bindView(android.view.View, org.telegram.ui.Components.y51, boolean, org.telegram.ui.Components.m61, org.telegram.ui.Components.u61):void");
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        final n8 n8Var = new n8(context, 1);
        if (yl0Var instanceof u61) {
            final u61 u61Var = (u61) yl0Var;
            n8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    u61 u61Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (u61Var2 = u61.this).Z2) != null) {
                        yVar.r(u61Var2.U(n8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return n8Var;
    }
}
