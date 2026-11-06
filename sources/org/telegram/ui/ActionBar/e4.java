package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;
public final class e4 extends ImageButton {
    public final i4 f27448a;

    public e4(i4 i4Var, Context context) {
        super(context);
        this.f27448a = i4Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f27448a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
