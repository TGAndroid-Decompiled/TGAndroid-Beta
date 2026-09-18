package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class dq0 implements View.OnTouchListener {
    public final int f23664a;
    public final Rect f23665b;
    public final vq0 f23666c;

    public dq0(vq0 vq0Var, int i10) {
        this.f23664a = i10;
        switch (i10) {
            case 1:
                this.f23666c = vq0Var;
                this.f23665b = new Rect();
                return;
            default:
                this.f23666c = vq0Var;
                this.f23665b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        vq0 vq0Var;
        org.telegram.ui.ActionBar.n1 n1Var;
        vq0 vq0Var2;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f23664a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (n1Var = (vq0Var = this.f23666c).J0) != null && n1Var.isShowing()) {
                    Rect rect = this.f23665b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        vq0Var.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = (vq0Var2 = this.f23666c).J0) != null && n1Var2.isShowing()) {
                    Rect rect2 = this.f23665b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        vq0Var2.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
