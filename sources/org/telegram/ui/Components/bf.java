package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class bf implements View.OnTouchListener {
    public final int f33838a = 0;
    public final Rect f33839b = new Rect();
    public final org.telegram.messenger.gs f33840c;

    public bf(org.telegram.ui.qm0 qm0Var) {
        this.f33840c = qm0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        cf cfVar;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.f33838a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f33840c;
                if (motionEvent.getActionMasked() == 0 && (cfVar = chatActivityEnterView.O0) != null && cfVar.isShowing()) {
                    Rect rect = this.f33839b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.O0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.qm0 qm0Var = (org.telegram.ui.qm0) this.f33840c;
                if (motionEvent.getActionMasked() == 0 && (g1Var = qm0Var.J) != null && g1Var.isShowing()) {
                    Rect rect2 = this.f33839b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        qm0Var.J.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.cn0 cn0Var = (org.telegram.ui.cn0) this.f33840c;
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = cn0Var.f46614n0) != null && g1Var2.isShowing()) {
                    Rect rect3 = this.f33839b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        cn0Var.f46614n0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public bf(org.telegram.ui.cn0 cn0Var) {
        this.f33840c = cn0Var;
    }

    public bf(ChatActivityEnterView chatActivityEnterView) {
        this.f33840c = chatActivityEnterView;
    }
}
