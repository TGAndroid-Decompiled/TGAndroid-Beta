package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class tr extends ImageView {
    public final int f28605a = 1;
    public Object f28606b;
    public final ViewGroup f28607c;

    public tr(vr vrVar, Context context, n2.e eVar) {
        super(context);
        this.f28607c = vrVar;
        this.f28606b = eVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28605a) {
            case 0:
                vr vrVar = (vr) this.f28607c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (vrVar.f29801n || vrVar.f29800f)) {
                    vrVar.f29801n = false;
                    vrVar.f29800f = false;
                    removeCallbacks(vrVar.f29802r);
                    removeCallbacks(vrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((n2.e) this.f28606b).f15116b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public tr(qk0 qk0Var, Context context) {
        super(context);
        this.f28607c = qk0Var;
    }
}
