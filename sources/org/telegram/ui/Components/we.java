package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;

public final class we implements View.OnTouchListener {

    public final int f34163a = 0;

    public final Rect f34164b = new Rect();

    public final NotificationCenter.NotificationCenterDelegate f34165c;

    public we(org.telegram.ui.jp0 jp0Var) {
        this.f34165c = jp0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        xe xeVar;
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f34163a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f34165c;
                if (motionEvent.getActionMasked() == 0 && (xeVar = chatActivityEnterView.J0) != null && xeVar.isShowing()) {
                    Rect rect = this.f34164b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.J0.dismiss();
                    }
                    break;
                }
                break;
            case 1:
                org.telegram.ui.jp0 jp0Var = (org.telegram.ui.jp0) this.f34165c;
                if (motionEvent.getActionMasked() == 0 && (n1Var = jp0Var.E) != null && n1Var.isShowing()) {
                    Rect rect2 = this.f34164b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        jp0Var.E.d(true);
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.aq0 aq0Var = (org.telegram.ui.aq0) this.f34165c;
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = aq0Var.f36609i0) != null && n1Var2.isShowing()) {
                    Rect rect3 = this.f34164b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        aq0Var.f36609i0.d(true);
                    }
                    break;
                }
                break;
        }
        return false;
    }

    public we(org.telegram.ui.aq0 aq0Var) {
        this.f34165c = aq0Var;
    }

    public we(ChatActivityEnterView chatActivityEnterView) {
        this.f34165c = chatActivityEnterView;
    }
}
