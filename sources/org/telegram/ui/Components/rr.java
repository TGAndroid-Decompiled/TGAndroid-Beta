package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class rr extends ImageView {
    public final int f30876a = 1;
    public Object f30877b;
    public final ViewGroup f30878c;

    public rr(ur urVar, Context context, org.telegram.ui.Cells.f1 f1Var) {
        super(context);
        this.f30878c = urVar;
        this.f30877b = f1Var;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f30876a) {
            case 0:
                ur urVar = (ur) this.f30878c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (urVar.f31680n || urVar.f31679f)) {
                    urVar.f31680n = false;
                    urVar.f31679f = false;
                    removeCallbacks(urVar.f31681r);
                    removeCallbacks(urVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((org.telegram.ui.Cells.f1) this.f30877b).f22790b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public rr(qk0 qk0Var, Context context) {
        super(context);
        this.f30878c = qk0Var;
    }
}
