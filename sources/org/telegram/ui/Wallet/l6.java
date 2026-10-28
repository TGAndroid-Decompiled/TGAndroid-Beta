package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
public final class l6 extends ug.f {
    public final m6 L;

    public l6(m6 m6Var, Context context) {
        super(context);
        this.L = m6Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.L.f36993x && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
