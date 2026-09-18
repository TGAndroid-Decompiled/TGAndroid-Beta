package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class sr extends ImageView {
    public final int f27910a = 1;
    public Object f27911b;
    public final ViewGroup f27912c;

    public sr(ur urVar, Context context, k2.u uVar) {
        super(context);
        this.f27912c = urVar;
        this.f27911b = uVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f27910a) {
            case 0:
                ur urVar = (ur) this.f27912c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (urVar.f28478n || urVar.f28477f)) {
                    urVar.f28478n = false;
                    urVar.f28477f = false;
                    removeCallbacks(urVar.f28479r);
                    removeCallbacks(urVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((k2.u) this.f27911b).f13385b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public sr(gk0 gk0Var, Context context) {
        super(context);
        this.f27912c = gk0Var;
    }
}
