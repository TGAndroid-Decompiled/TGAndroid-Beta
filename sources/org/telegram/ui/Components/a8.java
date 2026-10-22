package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
public final class a8 extends f8 {
    public long d;
    public final k8 e;

    public a8(k8 k8Var, Context context) {
        super(context);
        this.e = k8Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        k8 k8Var = this.e;
        if (action == 0) {
            if (this.f26142a[this.f26143b].getImageReceiver().hasBitmapImage()) {
                k8Var.B0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            k8Var.B0(false, true);
        }
        return true;
    }
}
