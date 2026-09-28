package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ur extends ImageView {
    public final int f28879a = 1;
    public Object f28880b;
    public final ViewGroup f28881c;

    public ur(wr wrVar, Context context, n2.e eVar) {
        super(context);
        this.f28881c = wrVar;
        this.f28880b = eVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28879a) {
            case 0:
                wr wrVar = (wr) this.f28881c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (wrVar.f30166n || wrVar.f30165f)) {
                    wrVar.f30166n = false;
                    wrVar.f30165f = false;
                    removeCallbacks(wrVar.f30167r);
                    removeCallbacks(wrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((n2.e) this.f28880b).f15117b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ur(sk0 sk0Var, Context context) {
        super(context);
        this.f28881c = sk0Var;
    }
}
