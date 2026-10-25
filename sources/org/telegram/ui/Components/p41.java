package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class p41 extends mm0 {
    public final f51 f31443f3;

    public p41(f51 f51Var, Context context) {
        super(context, null);
        this.f31443f3 = f51Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            f51 f51Var = this.f31443f3;
            if (y3 < f51Var.K(true) - getTop()) {
                f51Var.dismiss();
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        return true;
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
    }
}
