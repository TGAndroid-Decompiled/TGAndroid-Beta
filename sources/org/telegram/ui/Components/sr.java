package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class sr extends ImageView {
    public final int f27958a = 1;
    public Object f27959b;
    public final ViewGroup f27960c;

    public sr(ur urVar, Context context, k2.u uVar) {
        super(context);
        this.f27960c = urVar;
        this.f27959b = uVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f27958a) {
            case 0:
                ur urVar = (ur) this.f27960c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (urVar.f28496n || urVar.f28495f)) {
                    urVar.f28496n = false;
                    urVar.f28495f = false;
                    removeCallbacks(urVar.f28497r);
                    removeCallbacks(urVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((k2.u) this.f27959b).f13382b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public sr(fk0 fk0Var, Context context) {
        super(context);
        this.f27960c = fk0Var;
    }
}
