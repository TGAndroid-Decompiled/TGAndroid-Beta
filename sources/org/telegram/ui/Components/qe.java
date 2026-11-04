package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class qe implements View.OnTouchListener {
    public final int f37448a = 0;
    public final Rect f37449b = new Rect();
    public final org.telegram.messenger.cs f37450c;

    public qe(org.telegram.ui.hm0 hm0Var) {
        this.f37450c = hm0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        re reVar;
        org.telegram.ui.ActionBar.f1 f1Var;
        org.telegram.ui.ActionBar.f1 f1Var2;
        switch (this.f37448a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f37450c;
                if (motionEvent.getActionMasked() == 0 && (reVar = chatActivityEnterView.O0) != null && reVar.isShowing()) {
                    Rect rect = this.f37449b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.O0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.hm0 hm0Var = (org.telegram.ui.hm0) this.f37450c;
                if (motionEvent.getActionMasked() == 0 && (f1Var = hm0Var.J) != null && f1Var.isShowing()) {
                    Rect rect2 = this.f37449b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        hm0Var.J.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.sm0 sm0Var = (org.telegram.ui.sm0) this.f37450c;
                if (motionEvent.getActionMasked() == 0 && (f1Var2 = sm0Var.f49556n0) != null && f1Var2.isShowing()) {
                    Rect rect3 = this.f37449b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        sm0Var.f49556n0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public qe(org.telegram.ui.sm0 sm0Var) {
        this.f37450c = sm0Var;
    }

    public qe(ChatActivityEnterView chatActivityEnterView) {
        this.f37450c = chatActivityEnterView;
    }
}
