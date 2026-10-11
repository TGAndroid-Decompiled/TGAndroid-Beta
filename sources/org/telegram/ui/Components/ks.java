package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ks extends ImageView {
    public final int f28074a = 1;
    public Object f28075b;
    public final ViewGroup f28076c;

    public ks(ms msVar, Context context, m.f3 f3Var) {
        super(context);
        this.f28076c = msVar;
        this.f28075b = f3Var;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28074a) {
            case 0:
                ms msVar = (ms) this.f28076c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (msVar.f28850n || msVar.f28849f)) {
                    msVar.f28850n = false;
                    msVar.f28849f = false;
                    removeCallbacks(msVar.f28851r);
                    removeCallbacks(msVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((m.f3) this.f28075b).f15693b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ks(ml0 ml0Var, Context context) {
        super(context);
        this.f28076c = ml0Var;
    }
}
