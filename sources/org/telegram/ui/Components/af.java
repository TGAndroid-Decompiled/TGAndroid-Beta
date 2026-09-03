package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class af implements View.OnTouchListener {
    public final int f25236a = 0;
    public final Rect f25237b = new Rect();
    public final NotificationCenter.NotificationCenterDelegate f25238c;

    public af(org.telegram.ui.wp0 wp0Var) {
        this.f25238c = wp0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        bf bfVar;
        org.telegram.ui.ActionBar.p1 p1Var;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.f25236a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f25238c;
                if (motionEvent.getActionMasked() == 0 && (bfVar = chatActivityEnterView.K0) != null && bfVar.isShowing()) {
                    Rect rect = this.f25237b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.K0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.wp0 wp0Var = (org.telegram.ui.wp0) this.f25238c;
                if (motionEvent.getActionMasked() == 0 && (p1Var = wp0Var.F) != null && p1Var.isShowing()) {
                    Rect rect2 = this.f25237b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        wp0Var.F.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.mq0 mq0Var = (org.telegram.ui.mq0) this.f25238c;
                if (motionEvent.getActionMasked() == 0 && (p1Var2 = mq0Var.f39045j0) != null && p1Var2.isShowing()) {
                    Rect rect3 = this.f25237b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        mq0Var.f39045j0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public af(org.telegram.ui.mq0 mq0Var) {
        this.f25238c = mq0Var;
    }

    public af(ChatActivityEnterView chatActivityEnterView) {
        this.f25238c = chatActivityEnterView;
    }
}
