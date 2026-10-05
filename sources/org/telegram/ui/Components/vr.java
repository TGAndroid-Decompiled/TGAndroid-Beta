package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class vr extends ImageView {
    public final int f32409a = 1;
    public Object f32410b;
    public final ViewGroup f32411c;

    public vr(xr xrVar, Context context, k2.e eVar) {
        super(context);
        this.f32411c = xrVar;
        this.f32410b = eVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f32409a) {
            case 0:
                xr xrVar = (xr) this.f32411c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (xrVar.f33077n || xrVar.f33076f)) {
                    xrVar.f33077n = false;
                    xrVar.f33076f = false;
                    removeCallbacks(xrVar.f33078r);
                    removeCallbacks(xrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((k2.e) this.f32410b).f14389b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public vr(sk0 sk0Var, Context context) {
        super(context);
        this.f32411c = sk0Var;
    }
}
