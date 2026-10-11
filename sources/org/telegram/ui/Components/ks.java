package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ks extends ImageView {
    public final int f28129a = 1;
    public Object f28130b;
    public final ViewGroup f28131c;

    public ks(ms msVar, Context context, m.f3 f3Var) {
        super(context);
        this.f28131c = msVar;
        this.f28130b = f3Var;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28129a) {
            case 0:
                ms msVar = (ms) this.f28131c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (msVar.f28929n || msVar.f28928f)) {
                    msVar.f28929n = false;
                    msVar.f28928f = false;
                    removeCallbacks(msVar.f28930r);
                    removeCallbacks(msVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((m.f3) this.f28130b).f15729b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ks(ll0 ll0Var, Context context) {
        super(context);
        this.f28131c = ll0Var;
    }
}
