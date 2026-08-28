package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
public final class s7 extends x7 {
    public long d;
    public final c8 f32386e;

    public s7(c8 c8Var, Context context) {
        super(context);
        this.f32386e = c8Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        c8 c8Var = this.f32386e;
        if (action == 0) {
            if (this.f34593a[this.f34594b].getImageReceiver().hasBitmapImage()) {
                c8Var.z0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            c8Var.z0(false, true);
        }
        return true;
    }
}
