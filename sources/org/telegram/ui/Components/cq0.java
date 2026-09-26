package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class cq0 implements View.OnTouchListener {
    public final int f23376a;
    public final Rect f23377b;
    public final uq0 f23378c;

    public cq0(uq0 uq0Var, int i10) {
        this.f23376a = i10;
        switch (i10) {
            case 1:
                this.f23378c = uq0Var;
                this.f23377b = new Rect();
                return;
            default:
                this.f23378c = uq0Var;
                this.f23377b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        uq0 uq0Var;
        org.telegram.ui.ActionBar.m1 m1Var;
        uq0 uq0Var2;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f23376a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (m1Var = (uq0Var = this.f23378c).J0) != null && m1Var.isShowing()) {
                    Rect rect = this.f23377b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        uq0Var.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = (uq0Var2 = this.f23378c).J0) != null && m1Var2.isShowing()) {
                    Rect rect2 = this.f23377b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        uq0Var2.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
