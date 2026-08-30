package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
public final class s7 extends x7 {
    public long d;
    public final c8 e;

    public s7(c8 c8Var, Context context) {
        super(context);
        this.e = c8Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        c8 c8Var = this.e;
        if (action == 0) {
            if (this.f30588a[this.f30589b].getImageReceiver().hasBitmapImage()) {
                c8Var.A0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            c8Var.A0(false, true);
        }
        return true;
    }
}
