package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class mf implements View.OnTouchListener {
    public final int f25226a = 0;
    public final Rect f25227b = new Rect();
    public final NotificationCenter.NotificationCenterDelegate f25228c;

    public mf(org.telegram.ui.kq0 kq0Var) {
        this.f25228c = kq0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        nf nfVar;
        org.telegram.ui.ActionBar.p1 p1Var;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.f25226a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f25228c;
                if (motionEvent.getActionMasked() == 0 && (nfVar = chatActivityEnterView.N0) != null && nfVar.isShowing()) {
                    Rect rect = this.f25227b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.kq0 kq0Var = (org.telegram.ui.kq0) this.f25228c;
                if (motionEvent.getActionMasked() == 0 && (p1Var = kq0Var.I) != null && p1Var.isShowing()) {
                    Rect rect2 = this.f25227b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        kq0Var.I.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.br0 br0Var = (org.telegram.ui.br0) this.f25228c;
                if (motionEvent.getActionMasked() == 0 && (p1Var2 = br0Var.m0) != null && p1Var2.isShowing()) {
                    Rect rect3 = this.f25227b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        br0Var.m0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public mf(org.telegram.ui.br0 br0Var) {
        this.f25228c = br0Var;
    }

    public mf(ChatActivityEnterView chatActivityEnterView) {
        this.f25228c = chatActivityEnterView;
    }
}
