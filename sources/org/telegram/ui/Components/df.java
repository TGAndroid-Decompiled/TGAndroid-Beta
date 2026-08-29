package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class df implements View.OnTouchListener {
    public final int f27752a = 0;
    public final Rect f27753b = new Rect();
    public final NotificationCenter.NotificationCenterDelegate f27754c;

    public df(org.telegram.ui.hp0 hp0Var) {
        this.f27754c = hp0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ef efVar;
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.f27752a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f27754c;
                if (motionEvent.getActionMasked() == 0 && (efVar = chatActivityEnterView.J0) != null && efVar.isShowing()) {
                    Rect rect = this.f27753b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.J0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.hp0 hp0Var = (org.telegram.ui.hp0) this.f27754c;
                if (motionEvent.getActionMasked() == 0 && (o1Var = hp0Var.E) != null && o1Var.isShowing()) {
                    Rect rect2 = this.f27753b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        hp0Var.E.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.zp0 zp0Var = (org.telegram.ui.zp0) this.f27754c;
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = zp0Var.f45284i0) != null && o1Var2.isShowing()) {
                    Rect rect3 = this.f27753b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        zp0Var.f45284i0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public df(org.telegram.ui.zp0 zp0Var) {
        this.f27754c = zp0Var;
    }

    public df(ChatActivityEnterView chatActivityEnterView) {
        this.f27754c = chatActivityEnterView;
    }
}
