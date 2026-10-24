package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class hf implements View.OnTouchListener {
    public final int f27020a = 0;
    public final Rect f27021b = new Rect();
    public final NotificationCenter.NotificationCenterDelegate f27022c;

    public hf(org.telegram.ui.up0 up0Var) {
        this.f27022c = up0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        jf jfVar;
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f27020a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f27022c;
                if (motionEvent.getActionMasked() == 0 && (jfVar = chatActivityEnterView.N0) != null && jfVar.isShowing()) {
                    Rect rect = this.f27021b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.up0 up0Var = (org.telegram.ui.up0) this.f27022c;
                if (motionEvent.getActionMasked() == 0 && (m1Var = up0Var.I) != null && m1Var.isShowing()) {
                    Rect rect2 = this.f27021b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        up0Var.I.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.lq0 lq0Var = (org.telegram.ui.lq0) this.f27022c;
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = lq0Var.m0) != null && m1Var2.isShowing()) {
                    Rect rect3 = this.f27021b;
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

    public hf(org.telegram.ui.lq0 lq0Var) {
        this.f27022c = lq0Var;
    }

    public hf(ChatActivityEnterView chatActivityEnterView) {
        this.f27022c = chatActivityEnterView;
    }
}
