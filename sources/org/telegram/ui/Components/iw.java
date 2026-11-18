package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class iw extends ImageView {
    public final ry f36231a;

    public iw(ry ryVar, Context context) {
        super(context);
        this.f36231a = ryVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        rx rxVar;
        int action = motionEvent.getAction();
        ry ryVar = this.f36231a;
        if (action == 0) {
            ryVar.Q1 = true;
            ryVar.R1 = false;
            org.telegram.messenger.g0.h3(new org.telegram.ui.ii(ryVar, 350, 12), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            ryVar.Q1 = false;
            if (!ryVar.R1 && (rxVar = ryVar.f39397u1) != null && rxVar.k()) {
                try {
                    ryVar.f39410y.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
