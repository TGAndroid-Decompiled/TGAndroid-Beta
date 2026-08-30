package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class af implements View.OnTouchListener {
    public final int f23370a = 0;
    public final Rect f23371b = new Rect();
    public final NotificationCenter.NotificationCenterDelegate f23372c;

    public af(org.telegram.ui.pp0 pp0Var) {
        this.f23372c = pp0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        bf bfVar;
        org.telegram.ui.ActionBar.p1 p1Var;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.f23370a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f23372c;
                if (motionEvent.getActionMasked() == 0 && (bfVar = chatActivityEnterView.K0) != null && bfVar.isShowing()) {
                    Rect rect = this.f23371b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.K0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.pp0 pp0Var = (org.telegram.ui.pp0) this.f23372c;
                if (motionEvent.getActionMasked() == 0 && (p1Var = pp0Var.F) != null && p1Var.isShowing()) {
                    Rect rect2 = this.f23371b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        pp0Var.F.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.fq0 fq0Var = (org.telegram.ui.fq0) this.f23372c;
                if (motionEvent.getActionMasked() == 0 && (p1Var2 = fq0Var.f34326j0) != null && p1Var2.isShowing()) {
                    Rect rect3 = this.f23371b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        fq0Var.f34326j0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public af(org.telegram.ui.fq0 fq0Var) {
        this.f23372c = fq0Var;
    }

    public af(ChatActivityEnterView chatActivityEnterView) {
        this.f23372c = chatActivityEnterView;
    }
}
