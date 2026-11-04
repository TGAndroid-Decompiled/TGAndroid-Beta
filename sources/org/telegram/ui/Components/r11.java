package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class r11 extends tj0 {
    public final f21 f37608f3;

    public r11(f21 f21Var, Context context) {
        super(context, null);
        this.f37608f3 = f21Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y9 = motionEvent.getY();
            f21 f21Var = this.f37608f3;
            if (y9 < f21Var.L0(true) - getTop()) {
                f21Var.dismiss();
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        return true;
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
    }
}
