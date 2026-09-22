package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class sr extends ImageView {
    public final int f28307a = 1;
    public Object f28308b;
    public final ViewGroup f28309c;

    public sr(ur urVar, Context context, l.d dVar) {
        super(context);
        this.f28309c = urVar;
        this.f28308b = dVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28307a) {
            case 0:
                ur urVar = (ur) this.f28309c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (urVar.f28888n || urVar.f28887f)) {
                    urVar.f28888n = false;
                    urVar.f28887f = false;
                    removeCallbacks(urVar.f28889r);
                    removeCallbacks(urVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((l.d) this.f28308b).f13912b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public sr(sk0 sk0Var, Context context) {
        super(context);
        this.f28309c = sk0Var;
    }
}
