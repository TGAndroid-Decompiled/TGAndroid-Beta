package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class mr extends ImageView {
    public final int f37527a = 0;
    public Object f37528b;
    public final ViewGroup f37529c;

    public mr(or orVar, Context context, nd0 nd0Var) {
        super(context);
        this.f37529c = orVar;
        this.f37528b = nd0Var;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f37527a) {
            case 0:
                or orVar = (or) this.f37529c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (orVar.f38256n || orVar.f38255f)) {
                    orVar.f38256n = false;
                    orVar.f38255f = false;
                    removeCallbacks(orVar.f38257r);
                    removeCallbacks(orVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((nd0) this.f37528b).f37766b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public mr(xi0 xi0Var, Context context) {
        super(context);
        this.f37529c = xi0Var;
    }
}
