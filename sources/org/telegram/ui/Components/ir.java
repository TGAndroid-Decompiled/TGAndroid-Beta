package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ir extends ImageView {
    public final int f27156a = 0;
    public Object f27157b;
    public final ViewGroup f27158c;

    public ir(lr lrVar, Context context, m2.t tVar) {
        super(context);
        this.f27158c = lrVar;
        this.f27157b = tVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f27156a) {
            case 0:
                lr lrVar = (lr) this.f27158c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (lrVar.f28249n || lrVar.f28248f)) {
                    lrVar.f28249n = false;
                    lrVar.f28248f = false;
                    removeCallbacks(lrVar.f28250r);
                    removeCallbacks(lrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((m2.t) this.f27157b).f12685b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ir(nj0 nj0Var, Context context) {
        super(context);
        this.f27158c = nj0Var;
    }
}
