package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class nr extends ImageView {
    public final int f37844a = 0;
    public Object f37845b;
    public final ViewGroup f37846c;

    public nr(pr prVar, Context context, hn hnVar) {
        super(context);
        this.f37846c = prVar;
        this.f37845b = hnVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f37844a) {
            case 0:
                pr prVar = (pr) this.f37846c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (prVar.f38534n || prVar.f38533f)) {
                    prVar.f38534n = false;
                    prVar.f38533f = false;
                    removeCallbacks(prVar.f38535r);
                    removeCallbacks(prVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((hn) this.f37845b).f35933b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public nr(vi0 vi0Var, Context context) {
        super(context);
        this.f37846c = vi0Var;
    }
}
