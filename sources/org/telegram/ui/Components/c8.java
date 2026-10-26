package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
public final class c8 extends h8 {
    public long d;
    public final m8 e;

    public c8(m8 m8Var, Context context) {
        super(context);
        this.e = m8Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        m8 m8Var = this.e;
        if (action == 0) {
            if (this.f28858a[this.f28859b].getImageReceiver().hasBitmapImage()) {
                m8Var.H0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            m8Var.H0(false, true);
        }
        return true;
    }
}
