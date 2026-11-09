package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class se implements View.OnTouchListener {
    public final int f38036a = 0;
    public final Rect f38037b = new Rect();
    public final org.telegram.messenger.ls f38038c;

    public se(org.telegram.ui.om0 om0Var) {
        this.f38038c = om0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        te teVar;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.f38036a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f38038c;
                if (motionEvent.getActionMasked() == 0 && (teVar = chatActivityEnterView.N0) != null && teVar.isShowing()) {
                    Rect rect = this.f38037b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.om0 om0Var = (org.telegram.ui.om0) this.f38038c;
                if (motionEvent.getActionMasked() == 0 && (g1Var = om0Var.I) != null && g1Var.isShowing()) {
                    Rect rect2 = this.f38037b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        om0Var.I.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.zm0 zm0Var = (org.telegram.ui.zm0) this.f38038c;
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = zm0Var.m0) != null && g1Var2.isShowing()) {
                    Rect rect3 = this.f38037b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        zm0Var.m0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public se(org.telegram.ui.zm0 zm0Var) {
        this.f38038c = zm0Var;
    }

    public se(ChatActivityEnterView chatActivityEnterView) {
        this.f38038c = chatActivityEnterView;
    }
}
