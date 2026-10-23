package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class kf implements View.OnTouchListener {
    public final int f28027a = 0;
    public final Rect f28028b = new Rect();
    public final NotificationCenter.NotificationCenterDelegate f28029c;

    public kf(org.telegram.ui.vp0 vp0Var) {
        this.f28029c = vp0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        lf lfVar;
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f28027a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f28029c;
                if (motionEvent.getActionMasked() == 0 && (lfVar = chatActivityEnterView.N0) != null && lfVar.isShowing()) {
                    Rect rect = this.f28028b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.f28029c;
                if (motionEvent.getActionMasked() == 0 && (m1Var = vp0Var.I) != null && m1Var.isShowing()) {
                    Rect rect2 = this.f28028b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        vp0Var.I.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.mq0 mq0Var = (org.telegram.ui.mq0) this.f28029c;
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = mq0Var.m0) != null && m1Var2.isShowing()) {
                    Rect rect3 = this.f28028b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        mq0Var.m0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public kf(org.telegram.ui.mq0 mq0Var) {
        this.f28029c = mq0Var;
    }

    public kf(ChatActivityEnterView chatActivityEnterView) {
        this.f28029c = chatActivityEnterView;
    }
}
