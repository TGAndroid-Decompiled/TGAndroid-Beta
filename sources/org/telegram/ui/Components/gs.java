package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class gs extends ImageView {
    public final int f25412a = 1;
    public Object f25413b;
    public final ViewGroup f25414c;

    public gs(is isVar, Context context, ji.d4 d4Var) {
        super(context);
        this.f25414c = isVar;
        this.f25413b = d4Var;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f25412a) {
            case 0:
                is isVar = (is) this.f25414c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (isVar.f26086n || isVar.f26085f)) {
                    isVar.f26086n = false;
                    isVar.f26085f = false;
                    removeCallbacks(isVar.f26087r);
                    removeCallbacks(isVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((ji.d4) this.f25413b).f13233b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public gs(gl0 gl0Var, Context context) {
        super(context);
        this.f25414c = gl0Var;
    }
}
