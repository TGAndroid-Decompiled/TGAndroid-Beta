package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class fs extends ImageView {
    public final int f28284a = 1;
    public Object f28285b;
    public final ViewGroup f28286c;

    public fs(hs hsVar, Context context, jg.s0 s0Var) {
        super(context);
        this.f28286c = hsVar;
        this.f28285b = s0Var;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28284a) {
            case 0:
                hs hsVar = (hs) this.f28286c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (hsVar.f29066n || hsVar.f29065f)) {
                    hsVar.f29066n = false;
                    hsVar.f29065f = false;
                    removeCallbacks(hsVar.f29067r);
                    removeCallbacks(hsVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((jg.s0) this.f28285b).f15827b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public fs(gl0 gl0Var, Context context) {
        super(context);
        this.f28286c = gl0Var;
    }
}
