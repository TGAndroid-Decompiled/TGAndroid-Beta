package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
public final class c6 extends sg.f {
    public final d6 L;

    public c6(d6 d6Var, Context context) {
        super(context);
        this.L = d6Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.L.f34839x && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
