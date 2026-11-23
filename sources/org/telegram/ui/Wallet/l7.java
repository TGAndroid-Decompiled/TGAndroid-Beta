package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
public final class l7 extends vg.f {
    public final m7 M;

    public l7(m7 m7Var, Context context) {
        super(context);
        this.M = m7Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.M.f44600y && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
