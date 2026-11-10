package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class wn0 implements View.OnTouchListener {
    public final int f40023a;
    public final Rect f40024b;
    public final mo0 f40025c;

    public wn0(mo0 mo0Var, int i7) {
        this.f40023a = i7;
        switch (i7) {
            case 1:
                this.f40025c = mo0Var;
                this.f40024b = new Rect();
                return;
            default:
                this.f40025c = mo0Var;
                this.f40024b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        mo0 mo0Var;
        org.telegram.ui.ActionBar.g1 g1Var;
        mo0 mo0Var2;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.f40023a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (g1Var = (mo0Var = this.f40025c).E2) != null && g1Var.isShowing()) {
                    Rect rect = this.f40024b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        mo0Var.E2.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = (mo0Var2 = this.f40025c).E2) != null && g1Var2.isShowing()) {
                    Rect rect2 = this.f40024b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        mo0Var2.E2.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
