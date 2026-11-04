package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class zq extends ImageView {
    public final int f41086a = 0;
    public Object f41087b;
    public final ViewGroup f41088c;

    public zq(br brVar, Context context, y00 y00Var) {
        super(context);
        this.f41088c = brVar;
        this.f41087b = y00Var;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f41086a) {
            case 0:
                br brVar = (br) this.f41088c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (brVar.f32372n || brVar.f32371f)) {
                    brVar.f32372n = false;
                    brVar.f32371f = false;
                    removeCallbacks(brVar.f32373r);
                    removeCallbacks(brVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((y00) this.f41087b).f40562a).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public zq(li0 li0Var, Context context) {
        super(context);
        this.f41088c = li0Var;
    }
}
