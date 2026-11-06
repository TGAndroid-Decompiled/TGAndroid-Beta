package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class zq extends ImageView {
    public final int f41059a = 0;
    public Object f41060b;
    public final ViewGroup f41061c;

    public zq(br brVar, Context context, uy uyVar) {
        super(context);
        this.f41061c = brVar;
        this.f41060b = uyVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f41059a) {
            case 0:
                br brVar = (br) this.f41061c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (brVar.f32286n || brVar.f32285f)) {
                    brVar.f32286n = false;
                    brVar.f32285f = false;
                    removeCallbacks(brVar.f32287r);
                    removeCallbacks(brVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((uy) this.f41060b).f38766b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public zq(ii0 ii0Var, Context context) {
        super(context);
        this.f41061c = ii0Var;
    }
}
