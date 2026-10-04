package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class vr extends ImageView {
    public final int f32345a = 1;
    public Object f32346b;
    public final ViewGroup f32347c;

    public vr(xr xrVar, Context context, k2.e eVar) {
        super(context);
        this.f32347c = xrVar;
        this.f32346b = eVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f32345a) {
            case 0:
                xr xrVar = (xr) this.f32347c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (xrVar.f32973n || xrVar.f32972f)) {
                    xrVar.f32973n = false;
                    xrVar.f32972f = false;
                    removeCallbacks(xrVar.f32974r);
                    removeCallbacks(xrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((k2.e) this.f32346b).f14388b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public vr(sk0 sk0Var, Context context) {
        super(context);
        this.f32347c = sk0Var;
    }
}
