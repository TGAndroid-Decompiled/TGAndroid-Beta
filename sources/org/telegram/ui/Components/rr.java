package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class rr extends ImageView {
    public final int f30101a = 1;
    public Object f30102b;
    public final ViewGroup f30103c;

    public rr(tr trVar, Context context, l.d dVar) {
        super(context);
        this.f30103c = trVar;
        this.f30102b = dVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f30101a) {
            case 0:
                tr trVar = (tr) this.f30103c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (trVar.f30717n || trVar.f30716f)) {
                    trVar.f30717n = false;
                    trVar.f30716f = false;
                    removeCallbacks(trVar.f30718r);
                    removeCallbacks(trVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((l.d) this.f30102b).f15098b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public rr(fk0 fk0Var, Context context) {
        super(context);
        this.f30103c = fk0Var;
    }
}
