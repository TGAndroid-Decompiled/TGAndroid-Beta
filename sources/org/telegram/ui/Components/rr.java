package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class rr extends ImageView {
    public final int f30102a = 1;
    public Object f30103b;
    public final ViewGroup f30104c;

    public rr(tr trVar, Context context, l.d dVar) {
        super(context);
        this.f30104c = trVar;
        this.f30103b = dVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f30102a) {
            case 0:
                tr trVar = (tr) this.f30104c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (trVar.f30718n || trVar.f30717f)) {
                    trVar.f30718n = false;
                    trVar.f30717f = false;
                    removeCallbacks(trVar.f30719r);
                    removeCallbacks(trVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((l.d) this.f30103b).f15098b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public rr(fk0 fk0Var, Context context) {
        super(context);
        this.f30104c = fk0Var;
    }
}
