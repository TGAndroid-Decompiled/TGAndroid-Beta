package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;
public final class p4 extends ImageButton {
    public final t4 f23730a;

    public p4(t4 t4Var, Context context) {
        super(context);
        this.f23730a = t4Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f23730a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
