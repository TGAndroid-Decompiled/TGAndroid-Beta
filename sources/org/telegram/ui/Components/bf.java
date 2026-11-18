package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class bf implements View.OnTouchListener {
    public final int f33676a = 0;
    public final Rect f33677b = new Rect();
    public final org.telegram.messenger.fs f33678c;

    public bf(org.telegram.ui.qm0 qm0Var) {
        this.f33678c = qm0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        cf cfVar;
        org.telegram.ui.ActionBar.h1 h1Var;
        org.telegram.ui.ActionBar.h1 h1Var2;
        switch (this.f33676a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f33678c;
                if (motionEvent.getActionMasked() == 0 && (cfVar = chatActivityEnterView.O0) != null && cfVar.isShowing()) {
                    Rect rect = this.f33677b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.O0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.qm0 qm0Var = (org.telegram.ui.qm0) this.f33678c;
                if (motionEvent.getActionMasked() == 0 && (h1Var = qm0Var.J) != null && h1Var.isShowing()) {
                    Rect rect2 = this.f33677b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        qm0Var.J.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.cn0 cn0Var = (org.telegram.ui.cn0) this.f33678c;
                if (motionEvent.getActionMasked() == 0 && (h1Var2 = cn0Var.f46555n0) != null && h1Var2.isShowing()) {
                    Rect rect3 = this.f33677b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        cn0Var.f46555n0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public bf(org.telegram.ui.cn0 cn0Var) {
        this.f33678c = cn0Var;
    }

    public bf(ChatActivityEnterView chatActivityEnterView) {
        this.f33678c = chatActivityEnterView;
    }
}
