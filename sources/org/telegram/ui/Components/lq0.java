package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class lq0 implements View.OnTouchListener {
    public final int f28300a;
    public final Rect f28301b;
    public final dr0 f28302c;

    public lq0(dr0 dr0Var, int i10) {
        this.f28300a = i10;
        switch (i10) {
            case 1:
                this.f28302c = dr0Var;
                this.f28301b = new Rect();
                return;
            default:
                this.f28302c = dr0Var;
                this.f28301b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        dr0 dr0Var;
        org.telegram.ui.ActionBar.m1 m1Var;
        dr0 dr0Var2;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f28300a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (m1Var = (dr0Var = this.f28302c).J0) != null && m1Var.isShowing()) {
                    Rect rect = this.f28301b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        dr0Var.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = (dr0Var2 = this.f28302c).J0) != null && m1Var2.isShowing()) {
                    Rect rect2 = this.f28301b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        dr0Var2.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
