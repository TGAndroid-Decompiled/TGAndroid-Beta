package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;

public final class r7 extends w7 {
    public long d;

    public final b8 f32096e;

    public r7(b8 b8Var, Context context) {
        super(context);
        this.f32096e = b8Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        b8 b8Var = this.f32096e;
        if (action == 0) {
            if (this.f34129a[this.f34130b].getImageReceiver().hasBitmapImage()) {
                b8Var.A0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            b8Var.A0(false, true);
        }
        return true;
    }
}
