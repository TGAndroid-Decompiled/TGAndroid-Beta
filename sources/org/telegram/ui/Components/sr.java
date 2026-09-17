package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class sr extends ImageView {
    public final int f27907a = 1;
    public Object f27908b;
    public final ViewGroup f27909c;

    public sr(ur urVar, Context context, k2.u uVar) {
        super(context);
        this.f27909c = urVar;
        this.f27908b = uVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f27907a) {
            case 0:
                ur urVar = (ur) this.f27909c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (urVar.f28475n || urVar.f28474f)) {
                    urVar.f28475n = false;
                    urVar.f28474f = false;
                    removeCallbacks(urVar.f28476r);
                    removeCallbacks(urVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((k2.u) this.f27908b).f13385b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public sr(gk0 gk0Var, Context context) {
        super(context);
        this.f27909c = gk0Var;
    }
}
