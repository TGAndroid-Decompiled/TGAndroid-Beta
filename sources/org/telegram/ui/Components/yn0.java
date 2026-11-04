package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class yn0 implements View.OnTouchListener {
    public final int f40792a;
    public final Rect f40793b;
    public final oo0 f40794c;

    public yn0(oo0 oo0Var, int i3) {
        this.f40792a = i3;
        switch (i3) {
            case 1:
                this.f40794c = oo0Var;
                this.f40793b = new Rect();
                return;
            default:
                this.f40794c = oo0Var;
                this.f40793b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        oo0 oo0Var;
        org.telegram.ui.ActionBar.f1 f1Var;
        oo0 oo0Var2;
        org.telegram.ui.ActionBar.f1 f1Var2;
        switch (this.f40792a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (f1Var = (oo0Var = this.f40794c).C2) != null && f1Var.isShowing()) {
                    Rect rect = this.f40793b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        oo0Var.C2.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (f1Var2 = (oo0Var2 = this.f40794c).C2) != null && f1Var2.isShowing()) {
                    Rect rect2 = this.f40793b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        oo0Var2.C2.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
