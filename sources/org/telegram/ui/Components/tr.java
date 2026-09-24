package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class tr extends ImageView {
    public final int f28599a = 1;
    public Object f28600b;
    public final ViewGroup f28601c;

    public tr(vr vrVar, Context context, n2.e eVar) {
        super(context);
        this.f28601c = vrVar;
        this.f28600b = eVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28599a) {
            case 0:
                vr vrVar = (vr) this.f28601c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (vrVar.f29792n || vrVar.f29791f)) {
                    vrVar.f29792n = false;
                    vrVar.f29791f = false;
                    removeCallbacks(vrVar.f29793r);
                    removeCallbacks(vrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((n2.e) this.f28600b).f15101b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public tr(qk0 qk0Var, Context context) {
        super(context);
        this.f28601c = qk0Var;
    }
}
