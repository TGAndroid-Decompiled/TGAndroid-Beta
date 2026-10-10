package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
public final class b8 extends g8 {
    public long d;
    public final l8 f24885e;

    public b8(l8 l8Var, Context context) {
        super(context);
        this.f24885e = l8Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        l8 l8Var = this.f24885e;
        if (action == 0) {
            if (this.f26632a[this.f26633b].getImageReceiver().hasBitmapImage()) {
                l8Var.B0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            l8Var.B0(false, true);
        }
        return true;
    }
}
