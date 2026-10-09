package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class uq0 implements View.OnTouchListener {
    public final int f31594a;
    public final Rect f31595b;
    public final mr0 f31596c;

    public uq0(mr0 mr0Var, int i10) {
        this.f31594a = i10;
        switch (i10) {
            case 1:
                this.f31596c = mr0Var;
                this.f31595b = new Rect();
                return;
            default:
                this.f31596c = mr0Var;
                this.f31595b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        mr0 mr0Var;
        org.telegram.ui.ActionBar.n1 n1Var;
        mr0 mr0Var2;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f31594a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (n1Var = (mr0Var = this.f31596c).J0) != null && n1Var.isShowing()) {
                    Rect rect = this.f31595b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        mr0Var.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = (mr0Var2 = this.f31596c).J0) != null && n1Var2.isShowing()) {
                    Rect rect2 = this.f31595b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        mr0Var2.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
