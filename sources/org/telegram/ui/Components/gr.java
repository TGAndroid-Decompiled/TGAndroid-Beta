package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

public final class gr extends ImageView {

    public final int f28801a = 0;

    public Object f28802b;

    public final ViewGroup f28803c;

    public gr(ir irVar, Context context, m5.o oVar) {
        super(context);
        this.f28803c = irVar;
        this.f28802b = oVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28801a) {
            case 0:
                ir irVar = (ir) this.f28803c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (irVar.f29474n || irVar.f29473f)) {
                    irVar.f29474n = false;
                    irVar.f29473f = false;
                    removeCallbacks(irVar.f29475r);
                    removeCallbacks(irVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((m5.o) this.f28802b).f17823b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public gr(wj0 wj0Var, Context context) {
        super(context);
        this.f28803c = wj0Var;
    }
}
