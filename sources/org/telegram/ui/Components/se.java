package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class se implements View.OnTouchListener {
    public final int f38021a = 0;
    public final Rect f38022b = new Rect();
    public final org.telegram.messenger.ls f38023c;

    public se(org.telegram.ui.mm0 mm0Var) {
        this.f38023c = mm0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        te teVar;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.f38021a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f38023c;
                if (motionEvent.getActionMasked() == 0 && (teVar = chatActivityEnterView.N0) != null && teVar.isShowing()) {
                    Rect rect = this.f38022b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.mm0 mm0Var = (org.telegram.ui.mm0) this.f38023c;
                if (motionEvent.getActionMasked() == 0 && (g1Var = mm0Var.I) != null && g1Var.isShowing()) {
                    Rect rect2 = this.f38022b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        mm0Var.I.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.xm0 xm0Var = (org.telegram.ui.xm0) this.f38023c;
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = xm0Var.m0) != null && g1Var2.isShowing()) {
                    Rect rect3 = this.f38022b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        xm0Var.m0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public se(org.telegram.ui.xm0 xm0Var) {
        this.f38023c = xm0Var;
    }

    public se(ChatActivityEnterView chatActivityEnterView) {
        this.f38023c = chatActivityEnterView;
    }
}
