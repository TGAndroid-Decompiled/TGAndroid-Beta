package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class gs extends ImageView {
    public final int f25100a = 1;
    public Object f25101b;
    public final ViewGroup f25102c;

    public gs(is isVar, Context context, ji.h5 h5Var) {
        super(context);
        this.f25102c = isVar;
        this.f25101b = h5Var;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f25100a) {
            case 0:
                is isVar = (is) this.f25102c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (isVar.f25779n || isVar.f25778f)) {
                    isVar.f25779n = false;
                    isVar.f25778f = false;
                    removeCallbacks(isVar.f25780r);
                    removeCallbacks(isVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((ji.h5) this.f25101b).f13315b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public gs(gl0 gl0Var, Context context) {
        super(context);
        this.f25102c = gl0Var;
    }
}
