package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
public final class z7 extends e8 {
    public long d;
    public final j8 e;

    public z7(j8 j8Var, Context context) {
        super(context);
        this.e = j8Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        j8 j8Var = this.e;
        if (action == 0) {
            if (this.f22611a[this.f22612b].getImageReceiver().hasBitmapImage()) {
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
