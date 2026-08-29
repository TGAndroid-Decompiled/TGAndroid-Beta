package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class x21 extends jl0 {
    public final k31 T2;

    public x21(k31 k31Var, Context context) {
        super(context, null);
        this.T2 = k31Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y8 = motionEvent.getY();
            k31 k31Var = this.T2;
            if (y8 < k31Var.A(true) - getTop()) {
                k31Var.dismiss();
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
