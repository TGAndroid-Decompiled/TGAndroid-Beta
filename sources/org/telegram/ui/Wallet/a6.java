package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
public final class a6 extends sg.f {
    public final b6 L;

    public a6(b6 b6Var, Context context) {
        super(context);
        this.L = b6Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.L.f34679x && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
