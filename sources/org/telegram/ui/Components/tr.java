package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class tr extends ImageView {
    public final int f28606a = 1;
    public Object f28607b;
    public final ViewGroup f28608c;

    public tr(vr vrVar, Context context, n2.e eVar) {
        super(context);
        this.f28608c = vrVar;
        this.f28607b = eVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28606a) {
            case 0:
                vr vrVar = (vr) this.f28608c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (vrVar.f29802n || vrVar.f29801f)) {
                    vrVar.f29802n = false;
                    vrVar.f29801f = false;
                    removeCallbacks(vrVar.f29803r);
                    removeCallbacks(vrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((n2.e) this.f28607b).f15116b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public tr(qk0 qk0Var, Context context) {
        super(context);
        this.f28608c = qk0Var;
    }
}
