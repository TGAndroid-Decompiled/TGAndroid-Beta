package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class kf implements View.OnTouchListener {
    public final int f29910a = 0;
    public final Rect f29911b = new Rect();
    public final NotificationCenter.NotificationCenterDelegate f29912c;

    public kf(org.telegram.ui.aq0 aq0Var) {
        this.f29912c = aq0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        lf lfVar;
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.f29910a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f29912c;
                if (motionEvent.getActionMasked() == 0 && (lfVar = chatActivityEnterView.N0) != null && lfVar.isShowing()) {
                    Rect rect = this.f29911b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.aq0 aq0Var = (org.telegram.ui.aq0) this.f29912c;
                if (motionEvent.getActionMasked() == 0 && (o1Var = aq0Var.I) != null && o1Var.isShowing()) {
                    Rect rect2 = this.f29911b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        aq0Var.I.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.rq0 rq0Var = (org.telegram.ui.rq0) this.f29912c;
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = rq0Var.m0) != null && o1Var2.isShowing()) {
                    Rect rect3 = this.f29911b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        rq0Var.m0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public kf(org.telegram.ui.rq0 rq0Var) {
        this.f29912c = rq0Var;
    }

    public kf(ChatActivityEnterView chatActivityEnterView) {
        this.f29912c = chatActivityEnterView;
    }
}
