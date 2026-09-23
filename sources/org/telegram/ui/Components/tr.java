package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class tr extends ImageView {
    public final int f28294a = 1;
    public Object f28295b;
    public final ViewGroup f28296c;

    public tr(vr vrVar, Context context, k2.u uVar) {
        super(context);
        this.f28296c = vrVar;
        this.f28295b = uVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28294a) {
            case 0:
                vr vrVar = (vr) this.f28296c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (vrVar.f29381n || vrVar.f29380f)) {
                    vrVar.f29381n = false;
                    vrVar.f29380f = false;
                    removeCallbacks(vrVar.f29382r);
                    removeCallbacks(vrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((k2.u) this.f28295b).f13371b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public tr(gk0 gk0Var, Context context) {
        super(context);
        this.f28296c = gk0Var;
    }
}
