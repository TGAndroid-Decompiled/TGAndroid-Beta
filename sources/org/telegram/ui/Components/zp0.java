package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class zp0 implements View.OnTouchListener {
    public final int f29786a;
    public final Rect f29787b;
    public final sq0 f29788c;

    public zp0(sq0 sq0Var, int i10) {
        this.f29786a = i10;
        switch (i10) {
            case 1:
                this.f29788c = sq0Var;
                this.f29787b = new Rect();
                return;
            default:
                this.f29788c = sq0Var;
                this.f29787b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        sq0 sq0Var;
        org.telegram.ui.ActionBar.p1 p1Var;
        sq0 sq0Var2;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.f29786a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (p1Var = (sq0Var = this.f29788c).J0) != null && p1Var.isShowing()) {
                    Rect rect = this.f29787b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        sq0Var.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (p1Var2 = (sq0Var2 = this.f29788c).J0) != null && p1Var2.isShowing()) {
                    Rect rect2 = this.f29787b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        sq0Var2.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
