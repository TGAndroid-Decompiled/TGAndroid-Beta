package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class hf implements View.OnTouchListener {
    public final int f24683a = 0;
    public final Rect f24684b = new Rect();
    public final NotificationCenter.NotificationCenterDelegate f24685c;

    public hf(org.telegram.ui.jq0 jq0Var) {
        this.f24685c = jq0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        jf jfVar;
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f24683a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f24685c;
                if (motionEvent.getActionMasked() == 0 && (jfVar = chatActivityEnterView.N0) != null && jfVar.isShowing()) {
                    Rect rect = this.f24684b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.jq0 jq0Var = (org.telegram.ui.jq0) this.f24685c;
                if (motionEvent.getActionMasked() == 0 && (n1Var = jq0Var.I) != null && n1Var.isShowing()) {
                    Rect rect2 = this.f24684b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        jq0Var.I.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.ar0 ar0Var = (org.telegram.ui.ar0) this.f24685c;
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = ar0Var.m0) != null && n1Var2.isShowing()) {
                    Rect rect3 = this.f24684b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ar0Var.m0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public hf(org.telegram.ui.ar0 ar0Var) {
        this.f24685c = ar0Var;
    }

    public hf(ChatActivityEnterView chatActivityEnterView) {
        this.f24685c = chatActivityEnterView;
    }
}
