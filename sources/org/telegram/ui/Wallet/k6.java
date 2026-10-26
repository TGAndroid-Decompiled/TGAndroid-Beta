package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
public final class k6 extends ug.f {
    public final l6 L;

    public k6(l6 l6Var, Context context) {
        super(context);
        this.L = l6Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.L.f36866x && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
