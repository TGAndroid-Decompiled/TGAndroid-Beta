package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class vr extends ImageView {
    public final int f29715a = 1;
    public Object f29716b;
    public final ViewGroup f29717c;

    public vr(xr xrVar, Context context, n2.e eVar) {
        super(context);
        this.f29717c = xrVar;
        this.f29716b = eVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f29715a) {
            case 0:
                xr xrVar = (xr) this.f29717c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (xrVar.f30493n || xrVar.f30492f)) {
                    xrVar.f30493n = false;
                    xrVar.f30492f = false;
                    removeCallbacks(xrVar.f30494r);
                    removeCallbacks(xrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((n2.e) this.f29716b).f15132b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public vr(tk0 tk0Var, Context context) {
        super(context);
        this.f29717c = tk0Var;
    }
}
