package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;
public final class p4 extends ImageButton {
    public final t4 f19707a;

    public p4(t4 t4Var, Context context) {
        super(context);
        this.f19707a = t4Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f19707a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
