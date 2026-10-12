package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class pf implements View.OnTouchListener {
    public final int f29488a = 0;
    public final Rect f29489b = new Rect();
    public final NotificationCenter.NotificationCenterDelegate f29490c;

    public pf(org.telegram.ui.mq0 mq0Var) {
        this.f29490c = mq0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        qf qfVar;
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f29488a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f29490c;
                if (motionEvent.getActionMasked() == 0 && (qfVar = chatActivityEnterView.N0) != null && qfVar.isShowing()) {
                    Rect rect = this.f29489b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.mq0 mq0Var = (org.telegram.ui.mq0) this.f29490c;
                if (motionEvent.getActionMasked() == 0 && (m1Var = mq0Var.I) != null && m1Var.isShowing()) {
                    Rect rect2 = this.f29489b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        mq0Var.I.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.dr0 dr0Var = (org.telegram.ui.dr0) this.f29490c;
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = dr0Var.m0) != null && m1Var2.isShowing()) {
                    Rect rect3 = this.f29489b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        dr0Var.m0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public pf(org.telegram.ui.dr0 dr0Var) {
        this.f29490c = dr0Var;
    }

    public pf(ChatActivityEnterView chatActivityEnterView) {
        this.f29490c = chatActivityEnterView;
    }
}
