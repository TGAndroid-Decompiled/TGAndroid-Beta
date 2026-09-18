package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class kf implements View.OnTouchListener {
    public final int f25715a = 0;
    public final Rect f25716b = new Rect();
    public final NotificationCenter.NotificationCenterDelegate f25717c;

    public kf(org.telegram.ui.lq0 lq0Var) {
        this.f25717c = lq0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        lf lfVar;
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f25715a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f25717c;
                if (motionEvent.getActionMasked() == 0 && (lfVar = chatActivityEnterView.N0) != null && lfVar.isShowing()) {
                    Rect rect = this.f25716b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.lq0 lq0Var = (org.telegram.ui.lq0) this.f25717c;
                if (motionEvent.getActionMasked() == 0 && (n1Var = lq0Var.I) != null && n1Var.isShowing()) {
                    Rect rect2 = this.f25716b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        lq0Var.I.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.cr0 cr0Var = (org.telegram.ui.cr0) this.f25717c;
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = cr0Var.m0) != null && n1Var2.isShowing()) {
                    Rect rect3 = this.f25716b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        cr0Var.m0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public kf(org.telegram.ui.cr0 cr0Var) {
        this.f25717c = cr0Var;
    }

    public kf(ChatActivityEnterView chatActivityEnterView) {
        this.f25717c = chatActivityEnterView;
    }
}
