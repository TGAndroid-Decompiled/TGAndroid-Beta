package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class rr extends ImageView {
    public final int f30075a = 1;
    public Object f30076b;
    public final ViewGroup f30077c;

    public rr(tr trVar, Context context, l.d dVar) {
        super(context);
        this.f30077c = trVar;
        this.f30076b = dVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f30075a) {
            case 0:
                tr trVar = (tr) this.f30077c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (trVar.f30691n || trVar.f30690f)) {
                    trVar.f30691n = false;
                    trVar.f30690f = false;
                    removeCallbacks(trVar.f30692r);
                    removeCallbacks(trVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((l.d) this.f30076b).f15072b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public rr(fk0 fk0Var, Context context) {
        super(context);
        this.f30077c = fk0Var;
    }
}
