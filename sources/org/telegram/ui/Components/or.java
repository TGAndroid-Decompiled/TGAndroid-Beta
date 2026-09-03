package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class or extends ImageView {
    public final int f27635a = 1;
    public Object f27636b;
    public final ViewGroup f27637c;

    public or(rr rrVar, Context context, zz zzVar) {
        super(context);
        this.f27637c = rrVar;
        this.f27636b = zzVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f27635a) {
            case 0:
                rr rrVar = (rr) this.f27637c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (rrVar.f28572n || rrVar.f28571f)) {
                    rrVar.f28572n = false;
                    rrVar.f28571f = false;
                    removeCallbacks(rrVar.f28573r);
                    removeCallbacks(rrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((zz) this.f27636b).f31508b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public or(pk0 pk0Var, Context context) {
        super(context);
        this.f27637c = pk0Var;
    }
}
