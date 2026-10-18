package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
public final class k8 extends e61 {
    public static final int f22509a = 0;

    static {
        e61.setup(new e61());
    }

    @Override
    public final void attachedView(im0 im0Var, View view, f61 f61Var) {
        boolean z10;
        l8 l8Var = (l8) view;
        boolean z11 = false;
        if (f61Var != null && f61Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        l8Var.b(z10, true);
        if ((im0Var instanceof a71) && ((a71) im0Var).f24513a3) {
            z11 = true;
        }
        l8Var.c(z11);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.f61 r6, boolean r7, org.telegram.ui.Components.s61 r8, org.telegram.ui.Components.a71 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.k8.bindView(android.view.View, org.telegram.ui.Components.f61, boolean, org.telegram.ui.Components.s61, org.telegram.ui.Components.a71):void");
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        final l8 l8Var = new l8(context, 1);
        if (im0Var instanceof a71) {
            final a71 a71Var = (a71) im0Var;
            l8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    a71 a71Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (a71Var2 = a71.this).X2) != null) {
                        yVar.r(a71Var2.T(l8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return l8Var;
    }
}
