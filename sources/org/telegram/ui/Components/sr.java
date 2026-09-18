package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class sr extends ImageView {
    public final int f28222a = 1;
    public Object f28223b;
    public final ViewGroup f28224c;

    public sr(ur urVar, Context context, n2.e eVar) {
        super(context);
        this.f28224c = urVar;
        this.f28223b = eVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28222a) {
            case 0:
                ur urVar = (ur) this.f28224c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (urVar.f28810n || urVar.f28809f)) {
                    urVar.f28810n = false;
                    urVar.f28809f = false;
                    removeCallbacks(urVar.f28811r);
                    removeCallbacks(urVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((n2.e) this.f28223b).f15073b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public sr(qk0 qk0Var, Context context) {
        super(context);
        this.f28224c = qk0Var;
    }
}
