package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class fs extends ImageView {
    public final int f28305a = 1;
    public Object f28306b;
    public final ViewGroup f28307c;

    public fs(hs hsVar, Context context, jg.s0 s0Var) {
        super(context);
        this.f28307c = hsVar;
        this.f28306b = s0Var;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28305a) {
            case 0:
                hs hsVar = (hs) this.f28307c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (hsVar.f29047n || hsVar.f29046f)) {
                    hsVar.f29047n = false;
                    hsVar.f29046f = false;
                    removeCallbacks(hsVar.f29048r);
                    removeCallbacks(hsVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((jg.s0) this.f28306b).f15828b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public fs(fl0 fl0Var, Context context) {
        super(context);
        this.f28307c = fl0Var;
    }
}
