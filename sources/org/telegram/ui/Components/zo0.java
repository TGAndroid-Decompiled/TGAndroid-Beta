package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class zo0 implements View.OnTouchListener {
    public final int f33197a;
    public final Rect f33198b;
    public final pp0 f33199c;

    public zo0(pp0 pp0Var, int i10) {
        this.f33197a = i10;
        switch (i10) {
            case 1:
                this.f33199c = pp0Var;
                this.f33198b = new Rect();
                return;
            default:
                this.f33199c = pp0Var;
                this.f33198b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        pp0 pp0Var;
        org.telegram.ui.ActionBar.k1 k1Var;
        pp0 pp0Var2;
        org.telegram.ui.ActionBar.k1 k1Var2;
        switch (this.f33197a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (k1Var = (pp0Var = this.f33199c).B2) != null && k1Var.isShowing()) {
                    Rect rect = this.f33198b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        pp0Var.B2.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (k1Var2 = (pp0Var2 = this.f33199c).B2) != null && k1Var2.isShowing()) {
                    Rect rect2 = this.f33198b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        pp0Var2.B2.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
