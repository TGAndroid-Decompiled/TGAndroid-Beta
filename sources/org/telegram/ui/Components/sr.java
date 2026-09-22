package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class sr extends ImageView {
    public final int f27955a = 1;
    public Object f27956b;
    public final ViewGroup f27957c;

    public sr(ur urVar, Context context, k2.u uVar) {
        super(context);
        this.f27957c = urVar;
        this.f27956b = uVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f27955a) {
            case 0:
                ur urVar = (ur) this.f27957c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (urVar.f28493n || urVar.f28492f)) {
                    urVar.f28493n = false;
                    urVar.f28492f = false;
                    removeCallbacks(urVar.f28494r);
                    removeCallbacks(urVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((k2.u) this.f27956b).f13384b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public sr(fk0 fk0Var, Context context) {
        super(context);
        this.f27957c = fk0Var;
    }
}
