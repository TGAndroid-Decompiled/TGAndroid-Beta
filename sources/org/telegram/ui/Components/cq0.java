package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class cq0 implements View.OnTouchListener {
    public final int f23385a;
    public final Rect f23386b;
    public final uq0 f23387c;

    public cq0(uq0 uq0Var, int i10) {
        this.f23385a = i10;
        switch (i10) {
            case 1:
                this.f23387c = uq0Var;
                this.f23386b = new Rect();
                return;
            default:
                this.f23387c = uq0Var;
                this.f23386b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        uq0 uq0Var;
        org.telegram.ui.ActionBar.n1 n1Var;
        uq0 uq0Var2;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f23385a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (n1Var = (uq0Var = this.f23387c).J0) != null && n1Var.isShowing()) {
                    Rect rect = this.f23386b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        uq0Var.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = (uq0Var2 = this.f23387c).J0) != null && n1Var2.isShowing()) {
                    Rect rect2 = this.f23386b;
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
