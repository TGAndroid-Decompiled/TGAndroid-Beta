package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class rr extends ImageView {
    public final int f30074a = 1;
    public Object f30075b;
    public final ViewGroup f30076c;

    public rr(tr trVar, Context context, l.d dVar) {
        super(context);
        this.f30076c = trVar;
        this.f30075b = dVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f30074a) {
            case 0:
                tr trVar = (tr) this.f30076c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (trVar.f30690n || trVar.f30689f)) {
                    trVar.f30690n = false;
                    trVar.f30689f = false;
                    removeCallbacks(trVar.f30691r);
                    removeCallbacks(trVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((l.d) this.f30075b).f15072b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public rr(fk0 fk0Var, Context context) {
        super(context);
        this.f30076c = fk0Var;
    }
}
