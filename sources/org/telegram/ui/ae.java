package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ae extends org.telegram.ui.Components.hd0 {
    public final int L;
    public final Object M;

    public ae(Object obj, Context context, int i10) {
        super(context, null);
        this.L = i10;
        this.M = obj;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.L) {
            case 0:
                le leVar = (le) this.M;
                org.telegram.ui.Components.r61 r61Var = leVar.f34662a1;
                ei.o oVar = leVar.Y0;
                if (oVar != null && !oVar.isFocusable()) {
                    oVar.setFocusable(true);
                    oVar.setFocusableInTouchMode(true);
                    int w12 = r61Var.w1(3);
                    if (w12 >= 0 && w12 < r61Var.Y2.f24253x.size()) {
                        r61Var.B0();
                        r61Var.x0(w12);
                    }
                    oVar.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                xh.h hVar = (xh.h) this.M;
                ei.o oVar2 = hVar.Q;
                if (oVar2 != null && !oVar2.isFocusable()) {
                    hVar.Q.setFocusable(true);
                    hVar.Q.setFocusableInTouchMode(true);
                    int w13 = hVar.e.w1(1);
                    if (w13 >= 0 && w13 < hVar.e.Y2.f24253x.size()) {
                        hVar.e.B0();
                        hVar.e.x0(w13);
                    }
                    hVar.Q.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
