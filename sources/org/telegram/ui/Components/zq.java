package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class zq extends ImageView {
    public final int f41123a = 0;
    public Object f41124b;
    public final ViewGroup f41125c;

    public zq(br brVar, Context context, vy vyVar) {
        super(context);
        this.f41125c = brVar;
        this.f41124b = vyVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f41123a) {
            case 0:
                br brVar = (br) this.f41125c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (brVar.f32335n || brVar.f32334f)) {
                    brVar.f32335n = false;
                    brVar.f32334f = false;
                    removeCallbacks(brVar.f32336r);
                    removeCallbacks(brVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((vy) this.f41124b).f39747b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public zq(ii0 ii0Var, Context context) {
        super(context);
        this.f41125c = ii0Var;
    }
}
