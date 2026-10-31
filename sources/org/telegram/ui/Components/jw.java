package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class jw extends ImageView {
    public final vy f27496a;

    public jw(vy vyVar, Context context) {
        super(context);
        this.f27496a = vyVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        vx vxVar;
        int action = motionEvent.getAction();
        vy vyVar = this.f27496a;
        if (action == 0) {
            vyVar.P1 = true;
            vyVar.Q1 = false;
            org.telegram.messenger.i0.h3(new qq(vyVar, 350, 1), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            vyVar.P1 = false;
            if (!vyVar.Q1 && (vxVar = vyVar.f31918t1) != null && vxVar.k()) {
                try {
                    vyVar.f31934y.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
