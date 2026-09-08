package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class lf implements View.OnTouchListener {
    public final int f28191a = 0;
    public final Rect f28192b = new Rect();
    public final NotificationCenter.NotificationCenterDelegate f28193c;

    public lf(org.telegram.ui.kq0 kq0Var) {
        this.f28193c = kq0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        mf mfVar;
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f28191a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f28193c;
                if (motionEvent.getActionMasked() == 0 && (mfVar = chatActivityEnterView.N0) != null && mfVar.isShowing()) {
                    Rect rect = this.f28192b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.kq0 kq0Var = (org.telegram.ui.kq0) this.f28193c;
                if (motionEvent.getActionMasked() == 0 && (n1Var = kq0Var.I) != null && n1Var.isShowing()) {
                    Rect rect2 = this.f28192b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        kq0Var.I.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.br0 br0Var = (org.telegram.ui.br0) this.f28193c;
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = br0Var.m0) != null && n1Var2.isShowing()) {
                    Rect rect3 = this.f28192b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        br0Var.m0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public lf(org.telegram.ui.br0 br0Var) {
        this.f28193c = br0Var;
    }

    public lf(ChatActivityEnterView chatActivityEnterView) {
        this.f28193c = chatActivityEnterView;
    }
}
