package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class h31 extends ll0 {
    public final u31 X2;

    public h31(u31 u31Var, Context context) {
        super(context, null);
        this.X2 = u31Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            u31 u31Var = this.X2;
            if (y3 < u31Var.A(true) - getTop()) {
                u31Var.dismiss();
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
