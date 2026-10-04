package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class vr extends ImageView {
    public final int f32351a = 1;
    public Object f32352b;
    public final ViewGroup f32353c;

    public vr(xr xrVar, Context context, k2.e eVar) {
        super(context);
        this.f32353c = xrVar;
        this.f32352b = eVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f32351a) {
            case 0:
                xr xrVar = (xr) this.f32353c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (xrVar.f32979n || xrVar.f32978f)) {
                    xrVar.f32979n = false;
                    xrVar.f32978f = false;
                    removeCallbacks(xrVar.f32980r);
                    removeCallbacks(xrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((k2.e) this.f32352b).f14389b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public vr(sk0 sk0Var, Context context) {
        super(context);
        this.f32353c = sk0Var;
    }
}
