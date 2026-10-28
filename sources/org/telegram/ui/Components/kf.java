package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class kf implements View.OnTouchListener {
    public final int f29941a = 0;
    public final Rect f29942b = new Rect();
    public final NotificationCenter.NotificationCenterDelegate f29943c;

    public kf(org.telegram.ui.cq0 cq0Var) {
        this.f29943c = cq0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        lf lfVar;
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.f29941a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f29943c;
                if (motionEvent.getActionMasked() == 0 && (lfVar = chatActivityEnterView.N0) != null && lfVar.isShowing()) {
                    Rect rect = this.f29942b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.cq0 cq0Var = (org.telegram.ui.cq0) this.f29943c;
                if (motionEvent.getActionMasked() == 0 && (o1Var = cq0Var.I) != null && o1Var.isShowing()) {
                    Rect rect2 = this.f29942b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        cq0Var.I.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.tq0 tq0Var = (org.telegram.ui.tq0) this.f29943c;
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = tq0Var.m0) != null && o1Var2.isShowing()) {
                    Rect rect3 = this.f29942b;
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

    public kf(org.telegram.ui.tq0 tq0Var) {
        this.f29943c = tq0Var;
    }

    public kf(ChatActivityEnterView chatActivityEnterView) {
        this.f29943c = chatActivityEnterView;
    }
}
