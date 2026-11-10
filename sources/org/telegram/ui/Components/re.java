package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class re implements View.OnTouchListener {
    public final int f37622a = 0;
    public final Rect f37623b = new Rect();
    public final org.telegram.messenger.ls f37624c;

    public re(org.telegram.ui.pm0 pm0Var) {
        this.f37624c = pm0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        se seVar;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.f37622a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f37624c;
                if (motionEvent.getActionMasked() == 0 && (seVar = chatActivityEnterView.N0) != null && seVar.isShowing()) {
                    Rect rect = this.f37623b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.pm0 pm0Var = (org.telegram.ui.pm0) this.f37624c;
                if (motionEvent.getActionMasked() == 0 && (g1Var = pm0Var.I) != null && g1Var.isShowing()) {
                    Rect rect2 = this.f37623b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        pm0Var.I.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.an0 an0Var = (org.telegram.ui.an0) this.f37624c;
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = an0Var.m0) != null && g1Var2.isShowing()) {
                    Rect rect3 = this.f37623b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        an0Var.m0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public re(org.telegram.ui.an0 an0Var) {
        this.f37624c = an0Var;
    }

    public re(ChatActivityEnterView chatActivityEnterView) {
        this.f37624c = chatActivityEnterView;
    }
}
