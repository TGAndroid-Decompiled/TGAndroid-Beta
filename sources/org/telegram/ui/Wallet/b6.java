package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
public final class b6 extends tg.f {
    public final c6 L;

    public b6(c6 c6Var, Context context) {
        super(context);
        this.L = c6Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.L.f32761x && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
