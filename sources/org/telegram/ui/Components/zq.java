package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class zq extends ImageView {
    public final int f41041a = 0;
    public Object f41042b;
    public final ViewGroup f41043c;

    public zq(br brVar, Context context, vy vyVar) {
        super(context);
        this.f41043c = brVar;
        this.f41042b = vyVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f41041a) {
            case 0:
                br brVar = (br) this.f41043c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (brVar.f32391n || brVar.f32390f)) {
                    brVar.f32391n = false;
                    brVar.f32390f = false;
                    removeCallbacks(brVar.f32392r);
                    removeCallbacks(brVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((vy) this.f41042b).f39835b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public zq(ji0 ji0Var, Context context) {
        super(context);
        this.f41043c = ji0Var;
    }
}
