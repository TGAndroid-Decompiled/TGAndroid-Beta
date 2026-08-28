package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ir extends ImageView {
    public final int f29509a = 0;
    public Object f29510b;
    public final ViewGroup f29511c;

    public ir(kr krVar, Context context, m5.c0 c0Var) {
        super(context);
        this.f29511c = krVar;
        this.f29510b = c0Var;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f29509a) {
            case 0:
                kr krVar = (kr) this.f29511c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (krVar.f30231n || krVar.f30230f)) {
                    krVar.f30231n = false;
                    krVar.f30230f = false;
                    removeCallbacks(krVar.f30232r);
                    removeCallbacks(krVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((m5.c0) this.f29510b).f17378b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ir(uj0 uj0Var, Context context) {
        super(context);
        this.f29511c = uj0Var;
    }
}
