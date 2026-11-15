package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class gr extends ImageView {
    public final int f35043a = 0;
    public Object f35044b;
    public final ViewGroup f35045c;

    public gr(ir irVar, Context context, org.telegram.messenger.ou ouVar) {
        super(context);
        this.f35045c = irVar;
        this.f35044b = ouVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f35043a) {
            case 0:
                ir irVar = (ir) this.f35045c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (irVar.f35706n || irVar.f35705f)) {
                    irVar.f35706n = false;
                    irVar.f35705f = false;
                    removeCallbacks(irVar.f35707r);
                    removeCallbacks(irVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((org.telegram.messenger.ou) this.f35044b).f25804b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public gr(mi0 mi0Var, Context context) {
        super(context);
        this.f35045c = mi0Var;
    }
}
