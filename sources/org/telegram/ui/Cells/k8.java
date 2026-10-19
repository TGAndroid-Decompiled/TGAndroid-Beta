package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
public final class k8 extends f61 {
    public static final int f22510a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void attachedView(im0 im0Var, View view, g61 g61Var) {
        boolean z10;
        l8 l8Var = (l8) view;
        boolean z11 = false;
        if (g61Var != null && g61Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        l8Var.b(z10, true);
        if ((im0Var instanceof b71) && ((b71) im0Var).f24823a3) {
            z11 = true;
        }
        l8Var.c(z11);
    }

    @Override
    public final void bindView(android.view.View r5, org.telegram.ui.Components.g61 r6, boolean r7, org.telegram.ui.Components.t61 r8, org.telegram.ui.Components.b71 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.k8.bindView(android.view.View, org.telegram.ui.Components.g61, boolean, org.telegram.ui.Components.t61, org.telegram.ui.Components.b71):void");
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        final l8 l8Var = new l8(context, 1);
        if (im0Var instanceof b71) {
            final b71 b71Var = (b71) im0Var;
            l8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    b71 b71Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() == 0 && (yVar = (b71Var2 = b71.this).X2) != null) {
                        yVar.r(b71Var2.T(l8Var));
                        return false;
                    }
                    return false;
                }
            });
        }
        return l8Var;
    }
}
