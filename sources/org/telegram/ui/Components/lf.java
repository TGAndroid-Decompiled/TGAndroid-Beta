package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class lf implements View.OnTouchListener {
    public final int f26065a = 0;
    public final Rect f26066b = new Rect();
    public final NotificationCenter.NotificationCenterDelegate f26067c;

    public lf(org.telegram.ui.cq0 cq0Var) {
        this.f26067c = cq0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        mf mfVar;
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f26065a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f26067c;
                if (motionEvent.getActionMasked() == 0 && (mfVar = chatActivityEnterView.N0) != null && mfVar.isShowing()) {
                    Rect rect = this.f26066b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.cq0 cq0Var = (org.telegram.ui.cq0) this.f26067c;
                if (motionEvent.getActionMasked() == 0 && (m1Var = cq0Var.I) != null && m1Var.isShowing()) {
                    Rect rect2 = this.f26066b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        cq0Var.I.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.tq0 tq0Var = (org.telegram.ui.tq0) this.f26067c;
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = tq0Var.m0) != null && m1Var2.isShowing()) {
                    Rect rect3 = this.f26066b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        tq0Var.m0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public lf(org.telegram.ui.tq0 tq0Var) {
        this.f26067c = tq0Var;
    }

    public lf(ChatActivityEnterView chatActivityEnterView) {
        this.f26067c = chatActivityEnterView;
    }
}
