package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class af implements View.OnTouchListener {
    public final int f26778a = 0;
    public final Rect f26779b = new Rect();
    public final NotificationCenter.NotificationCenterDelegate f26780c;

    public af(org.telegram.ui.ip0 ip0Var) {
        this.f26780c = ip0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        bf bfVar;
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.f26778a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f26780c;
                if (motionEvent.getActionMasked() == 0 && (bfVar = chatActivityEnterView.J0) != null && bfVar.isShowing()) {
                    Rect rect = this.f26779b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.J0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ip0 ip0Var = (org.telegram.ui.ip0) this.f26780c;
                if (motionEvent.getActionMasked() == 0 && (o1Var = ip0Var.E) != null && o1Var.isShowing()) {
                    Rect rect2 = this.f26779b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ip0Var.E.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.zp0 zp0Var = (org.telegram.ui.zp0) this.f26780c;
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = zp0Var.f45219i0) != null && o1Var2.isShowing()) {
                    Rect rect3 = this.f26779b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        zp0Var.f45219i0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public af(org.telegram.ui.zp0 zp0Var) {
        this.f26780c = zp0Var;
    }

    public af(ChatActivityEnterView chatActivityEnterView) {
        this.f26780c = chatActivityEnterView;
    }
}
