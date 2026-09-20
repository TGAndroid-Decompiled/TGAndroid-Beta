package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class sr extends ImageView {
    public final int f28205a = 1;
    public Object f28206b;
    public final ViewGroup f28207c;

    public sr(ur urVar, Context context, n2.e eVar) {
        super(context);
        this.f28207c = urVar;
        this.f28206b = eVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28205a) {
            case 0:
                ur urVar = (ur) this.f28207c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (urVar.f28843n || urVar.f28842f)) {
                    urVar.f28843n = false;
                    urVar.f28842f = false;
                    removeCallbacks(urVar.f28844r);
                    removeCallbacks(urVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((n2.e) this.f28206b).f15112b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public sr(pk0 pk0Var, Context context) {
        super(context);
        this.f28207c = pk0Var;
    }
}
