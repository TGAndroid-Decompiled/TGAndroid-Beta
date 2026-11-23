package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class cf implements View.OnTouchListener {
    public final int f34043a = 0;
    public final Rect f34044b = new Rect();
    public final org.telegram.messenger.fs f34045c;

    public cf(org.telegram.ui.om0 om0Var) {
        this.f34045c = om0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        df dfVar;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.f34043a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f34045c;
                if (motionEvent.getActionMasked() == 0 && (dfVar = chatActivityEnterView.O0) != null && dfVar.isShowing()) {
                    Rect rect = this.f34044b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.O0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.om0 om0Var = (org.telegram.ui.om0) this.f34045c;
                if (motionEvent.getActionMasked() == 0 && (g1Var = om0Var.J) != null && g1Var.isShowing()) {
                    Rect rect2 = this.f34044b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        om0Var.J.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.an0 an0Var = (org.telegram.ui.an0) this.f34045c;
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = an0Var.f45761n0) != null && g1Var2.isShowing()) {
                    Rect rect3 = this.f34044b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        an0Var.f45761n0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public cf(org.telegram.ui.an0 an0Var) {
        this.f34045c = an0Var;
    }

    public cf(ChatActivityEnterView chatActivityEnterView) {
        this.f34045c = chatActivityEnterView;
    }
}
