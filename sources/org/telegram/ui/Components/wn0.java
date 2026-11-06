package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class wn0 implements View.OnTouchListener {
    public final int f40055a;
    public final Rect f40056b;
    public final mo0 f40057c;

    public wn0(mo0 mo0Var, int i7) {
        this.f40055a = i7;
        switch (i7) {
            case 1:
                this.f40057c = mo0Var;
                this.f40056b = new Rect();
                return;
            default:
                this.f40057c = mo0Var;
                this.f40056b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        mo0 mo0Var;
        org.telegram.ui.ActionBar.g1 g1Var;
        mo0 mo0Var2;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.f40055a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (g1Var = (mo0Var = this.f40057c).B2) != null && g1Var.isShowing()) {
                    Rect rect = this.f40056b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        mo0Var.B2.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = (mo0Var2 = this.f40057c).B2) != null && g1Var2.isShowing()) {
                    Rect rect2 = this.f40056b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        mo0Var2.B2.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
