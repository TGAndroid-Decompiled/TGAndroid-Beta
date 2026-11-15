package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class se implements View.OnTouchListener {
    public final int f39290a = 0;
    public final Rect f39291b = new Rect();
    public final org.telegram.messenger.is f39292c;

    public se(org.telegram.ui.nm0 nm0Var) {
        this.f39292c = nm0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        te teVar;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.f39290a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f39292c;
                if (motionEvent.getActionMasked() == 0 && (teVar = chatActivityEnterView.O0) != null && teVar.isShowing()) {
                    Rect rect = this.f39291b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.O0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.nm0 nm0Var = (org.telegram.ui.nm0) this.f39292c;
                if (motionEvent.getActionMasked() == 0 && (g1Var = nm0Var.J) != null && g1Var.isShowing()) {
                    Rect rect2 = this.f39291b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        nm0Var.J.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.ym0 ym0Var = (org.telegram.ui.ym0) this.f39292c;
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = ym0Var.f53582n0) != null && g1Var2.isShowing()) {
                    Rect rect3 = this.f39291b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ym0Var.f53582n0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public se(org.telegram.ui.ym0 ym0Var) {
        this.f39292c = ym0Var;
    }

    public se(ChatActivityEnterView chatActivityEnterView) {
        this.f39292c = chatActivityEnterView;
    }
}
