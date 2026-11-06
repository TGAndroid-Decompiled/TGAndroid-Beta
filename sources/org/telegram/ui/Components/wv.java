package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class wv extends ImageView {
    public final gy f40103a;

    public wv(gy gyVar, Context context) {
        super(context);
        this.f40103a = gyVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hx hxVar;
        int action = motionEvent.getAction();
        gy gyVar = this.f40103a;
        if (action == 0) {
            gyVar.P1 = true;
            gyVar.Q1 = false;
            org.telegram.messenger.g0.i3(new r2(gyVar, 350, 6), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            gyVar.P1 = false;
            if (!gyVar.Q1 && (hxVar = gyVar.f34076t1) != null && hxVar.k()) {
                try {
                    gyVar.f34092y.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
