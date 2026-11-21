package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class ko0 implements View.OnTouchListener {
    public final int f36939a;
    public final Rect f36940b;
    public final ap0 f36941c;

    public ko0(ap0 ap0Var, int i7) {
        this.f36939a = i7;
        switch (i7) {
            case 1:
                this.f36941c = ap0Var;
                this.f36940b = new Rect();
                return;
            default:
                this.f36941c = ap0Var;
                this.f36940b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ap0 ap0Var;
        org.telegram.ui.ActionBar.g1 g1Var;
        ap0 ap0Var2;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.f36939a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (g1Var = (ap0Var = this.f36941c).F2) != null && g1Var.isShowing()) {
                    Rect rect = this.f36940b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ap0Var.F2.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = (ap0Var2 = this.f36941c).F2) != null && g1Var2.isShowing()) {
                    Rect rect2 = this.f36940b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ap0Var2.F2.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
