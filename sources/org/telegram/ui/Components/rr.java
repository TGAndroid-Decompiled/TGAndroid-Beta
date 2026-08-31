package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class rr extends ImageView {
    public final int f30830a = 1;
    public Object f30831b;
    public final ViewGroup f30832c;

    public rr(ur urVar, Context context, org.telegram.ui.Cells.f1 f1Var) {
        super(context);
        this.f30832c = urVar;
        this.f30831b = f1Var;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f30830a) {
            case 0:
                ur urVar = (ur) this.f30832c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (urVar.f31719n || urVar.f31718f)) {
                    urVar.f31719n = false;
                    urVar.f31718f = false;
                    removeCallbacks(urVar.f31720r);
                    removeCallbacks(urVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((org.telegram.ui.Cells.f1) this.f30831b).f22788b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public rr(rk0 rk0Var, Context context) {
        super(context);
        this.f30832c = rk0Var;
    }
}
