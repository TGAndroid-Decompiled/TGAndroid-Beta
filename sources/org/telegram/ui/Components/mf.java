package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class mf implements View.OnTouchListener {
    public final int f27096a = 0;
    public final Rect f27097b = new Rect();
    public final NotificationCenter.NotificationCenterDelegate f27098c;

    public mf(org.telegram.ui.oq0 oq0Var) {
        this.f27098c = oq0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        nf nfVar;
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f27096a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f27098c;
                if (motionEvent.getActionMasked() == 0 && (nfVar = chatActivityEnterView.N0) != null && nfVar.isShowing()) {
                    Rect rect = this.f27097b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.oq0 oq0Var = (org.telegram.ui.oq0) this.f27098c;
                if (motionEvent.getActionMasked() == 0 && (m1Var = oq0Var.I) != null && m1Var.isShowing()) {
                    Rect rect2 = this.f27097b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        oq0Var.I.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.fr0 fr0Var = (org.telegram.ui.fr0) this.f27098c;
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = fr0Var.m0) != null && m1Var2.isShowing()) {
                    Rect rect3 = this.f27097b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        fr0Var.m0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public mf(org.telegram.ui.fr0 fr0Var) {
        this.f27098c = fr0Var;
    }

    public mf(ChatActivityEnterView chatActivityEnterView) {
        this.f27098c = chatActivityEnterView;
    }
}
