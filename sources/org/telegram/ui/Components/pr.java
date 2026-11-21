package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class pr extends ImageView {
    public final int f38656a = 0;
    public Object f38657b;
    public final ViewGroup f38658c;

    public pr(rr rrVar, Context context, jn jnVar) {
        super(context);
        this.f38658c = rrVar;
        this.f38657b = jnVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f38656a) {
            case 0:
                rr rrVar = (rr) this.f38658c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (rrVar.f39317n || rrVar.f39316f)) {
                    rrVar.f39317n = false;
                    rrVar.f39316f = false;
                    removeCallbacks(rrVar.f39318r);
                    removeCallbacks(rrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((jn) this.f38657b).f36572b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public pr(xi0 xi0Var, Context context) {
        super(context);
        this.f38658c = xi0Var;
    }
}
