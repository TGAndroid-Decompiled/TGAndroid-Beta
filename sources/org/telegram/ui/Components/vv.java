package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class vv extends ImageView {
    public final ey f39806a;

    public vv(ey eyVar, Context context) {
        super(context);
        this.f39806a = eyVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fx fxVar;
        int action = motionEvent.getAction();
        ey eyVar = this.f39806a;
        if (action == 0) {
            eyVar.Q1 = true;
            eyVar.R1 = false;
            org.telegram.messenger.g0.i3(new o2(eyVar, 350, 6), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            eyVar.Q1 = false;
            if (!eyVar.R1 && (fxVar = eyVar.f33582u1) != null && fxVar.k()) {
                try {
                    eyVar.f33595y.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
