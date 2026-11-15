package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class cw extends ImageView {
    public final ly f33717a;

    public cw(ly lyVar, Context context) {
        super(context);
        this.f33717a = lyVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        mx mxVar;
        int action = motionEvent.getAction();
        ly lyVar = this.f33717a;
        if (action == 0) {
            lyVar.Q1 = true;
            lyVar.R1 = false;
            org.telegram.messenger.g0.i3(new a2(lyVar, 350, 9), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            lyVar.Q1 = false;
            if (!lyVar.R1 && (mxVar = lyVar.f36993u1) != null && mxVar.k()) {
                try {
                    lyVar.f37006y.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
