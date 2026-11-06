package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class zq extends ImageView {
    public final int f41084a = 0;
    public Object f41085b;
    public final ViewGroup f41086c;

    public zq(br brVar, Context context, uy uyVar) {
        super(context);
        this.f41086c = brVar;
        this.f41085b = uyVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f41084a) {
            case 0:
                br brVar = (br) this.f41086c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (brVar.f32280n || brVar.f32279f)) {
                    brVar.f32280n = false;
                    brVar.f32279f = false;
                    removeCallbacks(brVar.f32281r);
                    removeCallbacks(brVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((uy) this.f41085b).f38757b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public zq(ii0 ii0Var, Context context) {
        super(context);
        this.f41086c = ii0Var;
    }
}
