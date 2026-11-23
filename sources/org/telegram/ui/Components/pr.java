package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class pr extends ImageView {
    public final int f38654a = 0;
    public Object f38655b;
    public final ViewGroup f38656c;

    public pr(rr rrVar, Context context, jn jnVar) {
        super(context);
        this.f38656c = rrVar;
        this.f38655b = jnVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f38654a) {
            case 0:
                rr rrVar = (rr) this.f38656c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (rrVar.f39326n || rrVar.f39325f)) {
                    rrVar.f39326n = false;
                    rrVar.f39325f = false;
                    removeCallbacks(rrVar.f39327r);
                    removeCallbacks(rrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((jn) this.f38655b).f36566b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public pr(xi0 xi0Var, Context context) {
        super(context);
        this.f38656c = xi0Var;
    }
}
