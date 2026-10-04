package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class g41 extends zl0 {
    public final t41 f26650e3;

    public g41(t41 t41Var, Context context) {
        super(context, null);
        this.f26650e3 = t41Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            t41 t41Var = this.f26650e3;
            if (y3 < t41Var.z(true) - getTop()) {
                t41Var.dismiss();
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
