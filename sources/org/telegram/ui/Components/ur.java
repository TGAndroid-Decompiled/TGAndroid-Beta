package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ur extends ImageView {
    public final int f28933a = 1;
    public Object f28934b;
    public final ViewGroup f28935c;

    public ur(wr wrVar, Context context, o0.c cVar) {
        super(context);
        this.f28935c = wrVar;
        this.f28934b = cVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28933a) {
            case 0:
                wr wrVar = (wr) this.f28935c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (wrVar.f30168n || wrVar.f30167f)) {
                    wrVar.f30168n = false;
                    wrVar.f30167f = false;
                    removeCallbacks(wrVar.f30169r);
                    removeCallbacks(wrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((o0.c) this.f28934b).f15522b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ur(sk0 sk0Var, Context context) {
        super(context);
        this.f28935c = sk0Var;
    }
}
