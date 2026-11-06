package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class zq extends ImageView {
    public final int f41104a = 0;
    public Object f41105b;
    public final ViewGroup f41106c;

    public zq(br brVar, Context context, uy uyVar) {
        super(context);
        this.f41106c = brVar;
        this.f41105b = uyVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f41104a) {
            case 0:
                br brVar = (br) this.f41106c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (brVar.f32314n || brVar.f32313f)) {
                    brVar.f32314n = false;
                    brVar.f32313f = false;
                    removeCallbacks(brVar.f32315r);
                    removeCallbacks(brVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((uy) this.f41105b).f38750b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public zq(ii0 ii0Var, Context context) {
        super(context);
        this.f41106c = ii0Var;
    }
}
