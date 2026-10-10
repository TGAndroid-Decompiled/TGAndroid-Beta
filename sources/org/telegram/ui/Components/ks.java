package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ks extends ImageView {
    public final int f28092a = 1;
    public Object f28093b;
    public final ViewGroup f28094c;

    public ks(ms msVar, Context context, m.f3 f3Var) {
        super(context);
        this.f28094c = msVar;
        this.f28093b = f3Var;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28092a) {
            case 0:
                ms msVar = (ms) this.f28094c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (msVar.f28889n || msVar.f28888f)) {
                    msVar.f28889n = false;
                    msVar.f28888f = false;
                    removeCallbacks(msVar.f28890r);
                    removeCallbacks(msVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((m.f3) this.f28093b).f15672b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ks(ll0 ll0Var, Context context) {
        super(context);
        this.f28094c = ll0Var;
    }
}
