package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class xv extends ImageView {
    public final hy f40491a;

    public xv(hy hyVar, Context context) {
        super(context);
        this.f40491a = hyVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ix ixVar;
        int action = motionEvent.getAction();
        hy hyVar = this.f40491a;
        if (action == 0) {
            hyVar.P1 = true;
            hyVar.Q1 = false;
            org.telegram.messenger.g0.i3(new r2(hyVar, 350, 6), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            hyVar.P1 = false;
            if (!hyVar.Q1 && (ixVar = hyVar.f34452t1) != null && ixVar.k()) {
                try {
                    hyVar.f34468y.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
