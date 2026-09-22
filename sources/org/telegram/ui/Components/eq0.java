package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class eq0 implements View.OnTouchListener {
    public final int f24018a;
    public final Rect f24019b;
    public final wq0 f24020c;

    public eq0(wq0 wq0Var, int i10) {
        this.f24018a = i10;
        switch (i10) {
            case 1:
                this.f24020c = wq0Var;
                this.f24019b = new Rect();
                return;
            default:
                this.f24020c = wq0Var;
                this.f24019b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        wq0 wq0Var;
        org.telegram.ui.ActionBar.n1 n1Var;
        wq0 wq0Var2;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f24018a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (n1Var = (wq0Var = this.f24020c).J0) != null && n1Var.isShowing()) {
                    Rect rect = this.f24019b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        wq0Var.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = (wq0Var2 = this.f24020c).J0) != null && n1Var2.isShowing()) {
                    Rect rect2 = this.f24019b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        wq0Var2.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
