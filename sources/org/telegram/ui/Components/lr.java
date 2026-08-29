package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class lr extends ImageView {
    public final int f30417a = 1;
    public Object f30418b;
    public final ViewGroup f30419c;

    public lr(or orVar, Context context, o4.g gVar) {
        super(context);
        this.f30419c = orVar;
        this.f30418b = gVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f30417a) {
            case 0:
                or orVar = (or) this.f30419c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (orVar.f31462n || orVar.f31461f)) {
                    orVar.f31462n = false;
                    orVar.f31461f = false;
                    removeCallbacks(orVar.f31463r);
                    removeCallbacks(orVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((o4.g) this.f30418b).f19159b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public lr(fk0 fk0Var, Context context) {
        super(context);
        this.f30419c = fk0Var;
    }
}
