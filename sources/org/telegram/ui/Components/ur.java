package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ur extends ImageView {
    public final int f28893a = 1;
    public Object f28894b;
    public final ViewGroup f28895c;

    public ur(wr wrVar, Context context, n2.e eVar) {
        super(context);
        this.f28895c = wrVar;
        this.f28894b = eVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28893a) {
            case 0:
                wr wrVar = (wr) this.f28895c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (wrVar.f30194n || wrVar.f30193f)) {
                    wrVar.f30194n = false;
                    wrVar.f30193f = false;
                    removeCallbacks(wrVar.f30195r);
                    removeCallbacks(wrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((n2.e) this.f28894b).f15116b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ur(rk0 rk0Var, Context context) {
        super(context);
        this.f28895c = rk0Var;
    }
}
