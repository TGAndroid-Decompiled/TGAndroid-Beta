package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
public final class z7 extends e8 {
    public long d;
    public final j8 f33393e;

    public z7(j8 j8Var, Context context) {
        super(context);
        this.f33393e = j8Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        j8 j8Var = this.f33393e;
        if (action == 0) {
            if (this.f25995a[this.f25996b].getImageReceiver().hasBitmapImage()) {
                j8Var.A0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            j8Var.A0(false, true);
        }
        return true;
    }
}
