package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ae extends org.telegram.ui.Components.ld0 {
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
                me meVar = (me) this.M;
                org.telegram.ui.Components.c71 c71Var = meVar.a2;
                fi.o oVar = meVar.R1;
                if (oVar != null && !oVar.isFocusable()) {
                    oVar.setFocusable(true);
                    oVar.setFocusableInTouchMode(true);
                    int z12 = c71Var.z1(3);
                    if (z12 >= 0 && z12 < c71Var.f25244f3.f31309x.size()) {
                        c71Var.C0();
                        c71Var.y0(z12);
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
                    int z13 = gVar.f51304e.z1(1);
                    if (z13 >= 0 && z13 < gVar.f51304e.f25244f3.f31309x.size()) {
                        gVar.f51304e.C0();
                        gVar.f51304e.y0(z13);
                    }
                    gVar.Q.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
