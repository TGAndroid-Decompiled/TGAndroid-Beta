package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class af implements View.OnTouchListener {
    public final int f25244a = 0;
    public final Rect f25245b = new Rect();
    public final NotificationCenter.NotificationCenterDelegate f25246c;

    public af(org.telegram.ui.rp0 rp0Var) {
        this.f25246c = rp0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        bf bfVar;
        org.telegram.ui.ActionBar.p1 p1Var;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.f25244a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f25246c;
                if (motionEvent.getActionMasked() == 0 && (bfVar = chatActivityEnterView.K0) != null && bfVar.isShowing()) {
                    Rect rect = this.f25245b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.K0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.rp0 rp0Var = (org.telegram.ui.rp0) this.f25246c;
                if (motionEvent.getActionMasked() == 0 && (p1Var = rp0Var.F) != null && p1Var.isShowing()) {
                    Rect rect2 = this.f25245b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        rp0Var.F.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.hq0 hq0Var = (org.telegram.ui.hq0) this.f25246c;
                if (motionEvent.getActionMasked() == 0 && (p1Var2 = hq0Var.f37585j0) != null && p1Var2.isShowing()) {
                    Rect rect3 = this.f25245b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        hq0Var.f37585j0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public af(org.telegram.ui.hq0 hq0Var) {
        this.f25246c = hq0Var;
    }

    public af(ChatActivityEnterView chatActivityEnterView) {
        this.f25246c = chatActivityEnterView;
    }
}
