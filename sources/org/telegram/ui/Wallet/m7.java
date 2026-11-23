package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;
public final class m7 extends vg.e {
    public final n7 M;

    public m7(n7 n7Var, Context context) {
        super(context);
        this.M = n7Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.M.f44774y && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
