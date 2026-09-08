package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
public final class a8 extends f8 {
    public long d;
    public final k8 f24327e;

    public a8(k8 k8Var, Context context) {
        super(context);
        this.f24327e = k8Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        k8 k8Var = this.f24327e;
        if (action == 0) {
            if (this.f25979a[this.f25980b].getImageReceiver().hasBitmapImage()) {
                k8Var.A0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            k8Var.A0(false, true);
        }
        return true;
    }
}
