package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
public final class y7 extends d8 {
    public long d;
    public final i8 e;

    public y7(i8 i8Var, Context context) {
        super(context);
        this.e = i8Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        i8 i8Var = this.e;
        if (action == 0) {
            if (this.f23582a[this.f23583b].getImageReceiver().hasBitmapImage()) {
                i8Var.A0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            i8Var.A0(false, true);
        }
        return true;
    }
}
