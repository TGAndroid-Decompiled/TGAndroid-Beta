package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
public final class r6 extends tg.f {
    public final s6 L;

    public r6(s6 s6Var, Context context) {
        super(context);
        this.L = s6Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.L.f34917x && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
