package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ac0 extends tg.f {
    public final int f33459h2;

    public ac0(Context context, int i7) {
        super(context);
        this.f33459h2 = i7;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f33459h2) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f33459h2) {
            case 0:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
