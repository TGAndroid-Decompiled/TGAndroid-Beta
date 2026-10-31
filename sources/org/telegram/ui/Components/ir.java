package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ir extends ImageView {
    public final int f27066a = 0;
    public Object f27067b;
    public final ViewGroup f27068c;

    public ir(lr lrVar, Context context, m2.t tVar) {
        super(context);
        this.f27068c = lrVar;
        this.f27067b = tVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f27066a) {
            case 0:
                lr lrVar = (lr) this.f27068c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (lrVar.f28172n || lrVar.f28171f)) {
                    lrVar.f28172n = false;
                    lrVar.f28171f = false;
                    removeCallbacks(lrVar.f28173r);
                    removeCallbacks(lrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((m2.t) this.f27067b).f12684b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ir(mj0 mj0Var, Context context) {
        super(context);
        this.f27068c = mj0Var;
    }
}
