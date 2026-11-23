package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;
public final class f4 extends ImageButton {
    public final j4 f28957a;

    public f4(j4 j4Var, Context context) {
        super(context);
        this.f28957a = j4Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f28957a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
