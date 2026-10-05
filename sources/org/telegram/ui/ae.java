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
                org.telegram.ui.Components.e71 e71Var = meVar.X0;
                fi.o oVar = meVar.O0;
                if (oVar != null && !oVar.isFocusable()) {
                    oVar.setFocusable(true);
                    oVar.setFocusableInTouchMode(true);
                    int y12 = e71Var.y1(3);
                    if (y12 >= 0 && y12 < e71Var.f26034f3.f32534x.size()) {
                        e71Var.C0();
                        e71Var.y0(y12);
                    }
                    oVar.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                yh.h hVar = (yh.h) this.M;
                fi.o oVar2 = hVar.Z;
                if (oVar2 != null && !oVar2.isFocusable()) {
                    hVar.Z.setFocusable(true);
                    hVar.Z.setFocusableInTouchMode(true);
                    int y13 = hVar.f51373e.y1(1);
                    if (y13 >= 0 && y13 < hVar.f51373e.f26034f3.f32534x.size()) {
                        hVar.f51373e.C0();
                        hVar.f51373e.y0(y13);
                    }
                    hVar.Z.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
