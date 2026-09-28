package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ur extends ImageView {
    public final int f28878a = 1;
    public Object f28879b;
    public final ViewGroup f28880c;

    public ur(wr wrVar, Context context, n2.e eVar) {
        super(context);
        this.f28880c = wrVar;
        this.f28879b = eVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28878a) {
            case 0:
                wr wrVar = (wr) this.f28880c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (wrVar.f30165n || wrVar.f30164f)) {
                    wrVar.f30165n = false;
                    wrVar.f30164f = false;
                    removeCallbacks(wrVar.f30166r);
                    removeCallbacks(wrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((n2.e) this.f28879b).f15116b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ur(sk0 sk0Var, Context context) {
        super(context);
        this.f28880c = sk0Var;
    }
}
