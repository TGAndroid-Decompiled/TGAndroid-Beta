package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class xn0 implements View.OnTouchListener {
    public final int f40438a;
    public final Rect f40439b;
    public final no0 f40440c;

    public xn0(no0 no0Var, int i7) {
        this.f40438a = i7;
        switch (i7) {
            case 1:
                this.f40440c = no0Var;
                this.f40439b = new Rect();
                return;
            default:
                this.f40440c = no0Var;
                this.f40439b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        no0 no0Var;
        org.telegram.ui.ActionBar.g1 g1Var;
        no0 no0Var2;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.f40438a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (g1Var = (no0Var = this.f40440c).B2) != null && g1Var.isShowing()) {
                    Rect rect = this.f40439b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        no0Var.B2.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = (no0Var2 = this.f40440c).B2) != null && g1Var2.isShowing()) {
                    Rect rect2 = this.f40439b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        no0Var2.B2.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
