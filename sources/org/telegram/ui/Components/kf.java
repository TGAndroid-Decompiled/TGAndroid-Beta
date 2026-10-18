package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class kf implements View.OnTouchListener {
    public final int f27856a = 0;
    public final Rect f27857b = new Rect();
    public final NotificationCenter.NotificationCenterDelegate f27858c;

    public kf(org.telegram.ui.up0 up0Var) {
        this.f27858c = up0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        lf lfVar;
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f27856a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f27858c;
                if (motionEvent.getActionMasked() == 0 && (lfVar = chatActivityEnterView.N0) != null && lfVar.isShowing()) {
                    Rect rect = this.f27857b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.up0 up0Var = (org.telegram.ui.up0) this.f27858c;
                if (motionEvent.getActionMasked() == 0 && (m1Var = up0Var.I) != null && m1Var.isShowing()) {
                    Rect rect2 = this.f27857b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        up0Var.I.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.lq0 lq0Var = (org.telegram.ui.lq0) this.f27858c;
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = lq0Var.m0) != null && m1Var2.isShowing()) {
                    Rect rect3 = this.f27857b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        lq0Var.m0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public kf(org.telegram.ui.lq0 lq0Var) {
        this.f27858c = lq0Var;
    }

    public kf(ChatActivityEnterView chatActivityEnterView) {
        this.f27858c = chatActivityEnterView;
    }
}
