package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
public final class d6 extends sg.f {
    public final e6 L;

    public d6(e6 e6Var, Context context) {
        super(context);
        this.L = e6Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.L.f34903x && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
