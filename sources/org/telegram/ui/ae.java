package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ae extends org.telegram.ui.Components.jd0 {
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
                de deVar = meVar.f35641a1;
                fi.o oVar = meVar.Y0;
                if (oVar != null && !oVar.isFocusable()) {
                    oVar.setFocusable(true);
                    oVar.setFocusableInTouchMode(true);
                    int y12 = deVar.y1(3);
                    if (y12 >= 0 && y12 < deVar.Y2.f25962x.size()) {
                        deVar.C0();
                        deVar.y0(y12);
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
                    int y13 = gVar.e.y1(1);
                    if (y13 >= 0 && y13 < gVar.e.Y2.f25962x.size()) {
                        gVar.e.C0();
                        gVar.e.y0(y13);
                    }
                    gVar.Q.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
