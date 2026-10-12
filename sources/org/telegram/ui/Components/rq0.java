package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class rq0 implements View.OnTouchListener {
    public final int f28924a;
    public final Rect f28925b;
    public final jr0 f28926c;

    public rq0(jr0 jr0Var, int i10) {
        this.f28924a = i10;
        switch (i10) {
            case 1:
                this.f28926c = jr0Var;
                this.f28925b = new Rect();
                return;
            default:
                this.f28926c = jr0Var;
                this.f28925b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        jr0 jr0Var;
        org.telegram.ui.ActionBar.m1 m1Var;
        jr0 jr0Var2;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f28924a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (m1Var = (jr0Var = this.f28926c).J0) != null && m1Var.isShowing()) {
                    Rect rect = this.f28925b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        jr0Var.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = (jr0Var2 = this.f28926c).J0) != null && m1Var2.isShowing()) {
                    Rect rect2 = this.f28925b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        jr0Var2.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
