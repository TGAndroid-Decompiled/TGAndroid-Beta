package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class fe extends org.telegram.ui.Components.yd0 {
    public final int L;
    public final Object M;

    public fe(Object obj, Context context, int i10) {
        super(context, null);
        this.L = i10;
        this.M = obj;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.L) {
            case 0:
                qe qeVar = (qe) this.M;
                org.telegram.ui.Components.h71 h71Var = qeVar.f39395a1;
                gi.o oVar = qeVar.Y0;
                if (oVar != null && !oVar.isFocusable()) {
                    oVar.setFocusable(true);
                    oVar.setFocusableInTouchMode(true);
                    int y12 = h71Var.y1(3);
                    if (y12 >= 0 && y12 < h71Var.W2.f31783x.size()) {
                        h71Var.B0();
                        h71Var.x0(y12);
                    }
                    oVar.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                zh.g gVar = (zh.g) this.M;
                gi.o oVar2 = gVar.Q;
                if (oVar2 != null && !oVar2.isFocusable()) {
                    gVar.Q.setFocusable(true);
                    gVar.Q.setFocusableInTouchMode(true);
                    int y13 = gVar.e.y1(1);
                    if (y13 >= 0 && y13 < gVar.e.W2.f31783x.size()) {
                        gVar.e.B0();
                        gVar.e.x0(y13);
                    }
                    gVar.Q.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
