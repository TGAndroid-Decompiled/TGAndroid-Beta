package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class de extends org.telegram.ui.Components.de0 {
    public final int L;
    public final Object M;

    public de(Object obj, Context context, int i10) {
        super(context, null);
        this.L = i10;
        this.M = obj;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.L) {
            case 0:
                oe oeVar = (oe) this.M;
                org.telegram.ui.Components.p71 p71Var = oeVar.f40655a1;
                fi.o oVar = oeVar.Y0;
                if (oVar != null && !oVar.isFocusable()) {
                    oVar.setFocusable(true);
                    oVar.setFocusableInTouchMode(true);
                    int y12 = p71Var.y1(3);
                    if (y12 >= 0 && y12 < p71Var.W2.f26678x.size()) {
                        p71Var.B0();
                        p71Var.x0(y12);
                    }
                    oVar.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                yh.g gVar = (yh.g) this.M;
                fi.o oVar2 = gVar.Q;
                if (oVar2 != null && !oVar2.isFocusable()) {
                    gVar.Q.setFocusable(true);
                    gVar.Q.setFocusableInTouchMode(true);
                    int y13 = gVar.f52784e.y1(1);
                    if (y13 >= 0 && y13 < gVar.f52784e.W2.f26678x.size()) {
                        gVar.f52784e.B0();
                        gVar.f52784e.x0(y13);
                    }
                    gVar.Q.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
