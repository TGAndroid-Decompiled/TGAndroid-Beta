package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
public final class w7 extends b8 {
    public long d;
    public final g8 f34341e;

    public w7(g8 g8Var, Context context) {
        super(context);
        this.f34341e = g8Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        g8 g8Var = this.f34341e;
        if (action == 0) {
            if (this.f27000a[this.f27001b].getImageReceiver().hasBitmapImage()) {
                g8Var.A0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            g8Var.A0(false, true);
        }
        return true;
    }
}
