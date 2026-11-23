package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class pr extends ImageView {
    public final int f38609a = 0;
    public Object f38610b;
    public final ViewGroup f38611c;

    public pr(rr rrVar, Context context, jn jnVar) {
        super(context);
        this.f38611c = rrVar;
        this.f38610b = jnVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f38609a) {
            case 0:
                rr rrVar = (rr) this.f38611c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (rrVar.f39282n || rrVar.f39281f)) {
                    rrVar.f39282n = false;
                    rrVar.f39281f = false;
                    removeCallbacks(rrVar.f39283r);
                    removeCallbacks(rrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((jn) this.f38610b).f36522b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public pr(xi0 xi0Var, Context context) {
        super(context);
        this.f38611c = xi0Var;
    }
}
