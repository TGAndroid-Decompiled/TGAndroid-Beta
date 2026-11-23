package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class pr extends ImageView {
    public final int f38655a = 0;
    public Object f38656b;
    public final ViewGroup f38657c;

    public pr(rr rrVar, Context context, jn jnVar) {
        super(context);
        this.f38657c = rrVar;
        this.f38656b = jnVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f38655a) {
            case 0:
                rr rrVar = (rr) this.f38657c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (rrVar.f39327n || rrVar.f39326f)) {
                    rrVar.f39327n = false;
                    rrVar.f39326f = false;
                    removeCallbacks(rrVar.f39328r);
                    removeCallbacks(rrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((jn) this.f38656b).f36567b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public pr(xi0 xi0Var, Context context) {
        super(context);
        this.f38657c = xi0Var;
    }
}
