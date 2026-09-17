package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
public final class x7 extends c8 {
    public long d;
    public final h8 e;

    public x7(h8 h8Var, Context context) {
        super(context);
        this.e = h8Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        h8 h8Var = this.e;
        if (action == 0) {
            if (this.f22954a[this.f22955b].getImageReceiver().hasBitmapImage()) {
                h8Var.A0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            h8Var.A0(false, true);
        }
        return true;
    }
}
