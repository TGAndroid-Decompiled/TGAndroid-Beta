package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class mf implements View.OnTouchListener {
    public final int f28609a = 0;
    public final Rect f28610b = new Rect();
    public final NotificationCenter.NotificationCenterDelegate f28611c;

    public mf(org.telegram.ui.fq0 fq0Var) {
        this.f28611c = fq0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        nf nfVar;
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f28609a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f28611c;
                if (motionEvent.getActionMasked() == 0 && (nfVar = chatActivityEnterView.N0) != null && nfVar.isShowing()) {
                    Rect rect = this.f28610b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.fq0 fq0Var = (org.telegram.ui.fq0) this.f28611c;
                if (motionEvent.getActionMasked() == 0 && (n1Var = fq0Var.I) != null && n1Var.isShowing()) {
                    Rect rect2 = this.f28610b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        fq0Var.I.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.wq0 wq0Var = (org.telegram.ui.wq0) this.f28611c;
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = wq0Var.m0) != null && n1Var2.isShowing()) {
                    Rect rect3 = this.f28610b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        wq0Var.m0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public mf(org.telegram.ui.wq0 wq0Var) {
        this.f28611c = wq0Var;
    }

    public mf(ChatActivityEnterView chatActivityEnterView) {
        this.f28611c = chatActivityEnterView;
    }
}
