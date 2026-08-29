package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class h8 extends v41 {
    public static final int f24463a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void attachedView(jl0 jl0Var, View view, w41 w41Var) {
        boolean z10;
        i8 i8Var = (i8) view;
        i8Var.b(w41Var.f34294e, true);
        if (jl0Var instanceof u51) {
            z10 = ((u51) jl0Var).Y2;
        } else {
            z10 = false;
        }
        i8Var.c(z10);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.w41 r6, boolean r7, org.telegram.ui.Components.k51 r8, org.telegram.ui.Components.u51 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h8.bindView(android.view.View, org.telegram.ui.Components.w41, boolean, org.telegram.ui.Components.k51, org.telegram.ui.Components.u51):void");
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        final i8 i8Var = new i8(context, 1);
        if (jl0Var instanceof u51) {
            final u51 u51Var = (u51) jl0Var;
            i8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    u51 u51Var2;
                    f2.e0 e0Var;
                    if (motionEvent.getAction() == 0 && (e0Var = (u51Var2 = u51.this).V2) != null) {
                        e0Var.r(u51Var2.T(i8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return i8Var;
    }
}
