package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class fs extends ImageView {
    public final int f28303a = 1;
    public Object f28304b;
    public final ViewGroup f28305c;

    public fs(hs hsVar, Context context, jg.s0 s0Var) {
        super(context);
        this.f28305c = hsVar;
        this.f28304b = s0Var;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28303a) {
            case 0:
                hs hsVar = (hs) this.f28305c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (hsVar.f29045n || hsVar.f29044f)) {
                    hsVar.f29045n = false;
                    hsVar.f29044f = false;
                    removeCallbacks(hsVar.f29046r);
                    removeCallbacks(hsVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((jg.s0) this.f28304b).f15828b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public fs(fl0 fl0Var, Context context) {
        super(context);
        this.f28305c = fl0Var;
    }
}
