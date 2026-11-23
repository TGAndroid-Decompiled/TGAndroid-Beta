package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class hw extends ImageView {
    public final qy f35844a;

    public hw(qy qyVar, Context context) {
        super(context);
        this.f35844a = qyVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        qx qxVar;
        int action = motionEvent.getAction();
        qy qyVar = this.f35844a;
        if (action == 0) {
            qyVar.Q1 = true;
            qyVar.R1 = false;
            org.telegram.messenger.g0.h3(new org.telegram.ui.ii(qyVar, 350, 14), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            qyVar.Q1 = false;
            if (!qyVar.R1 && (qxVar = qyVar.f39099u1) != null && qxVar.k()) {
                try {
                    qyVar.f39112y.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
