package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class vr extends ImageView {
    public final int f32344a = 1;
    public Object f32345b;
    public final ViewGroup f32346c;

    public vr(xr xrVar, Context context, k2.e eVar) {
        super(context);
        this.f32346c = xrVar;
        this.f32345b = eVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f32344a) {
            case 0:
                xr xrVar = (xr) this.f32346c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (xrVar.f32972n || xrVar.f32971f)) {
                    xrVar.f32972n = false;
                    xrVar.f32971f = false;
                    removeCallbacks(xrVar.f32973r);
                    removeCallbacks(xrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((k2.e) this.f32345b).f14388b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public vr(sk0 sk0Var, Context context) {
        super(context);
        this.f32346c = sk0Var;
    }
}
