package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class ne implements View.OnTouchListener {
    public final int f28797a = 0;
    public final Rect f28798b = new Rect();
    public final org.telegram.messenger.vs f28799c;

    public ne(org.telegram.ui.wn0 wn0Var) {
        this.f28799c = wn0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        oe oeVar;
        org.telegram.ui.ActionBar.k1 k1Var;
        org.telegram.ui.ActionBar.k1 k1Var2;
        switch (this.f28797a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f28799c;
                if (motionEvent.getActionMasked() == 0 && (oeVar = chatActivityEnterView.N0) != null && oeVar.isShowing()) {
                    Rect rect = this.f28798b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.wn0 wn0Var = (org.telegram.ui.wn0) this.f28799c;
                if (motionEvent.getActionMasked() == 0 && (k1Var = wn0Var.I) != null && k1Var.isShowing()) {
                    Rect rect2 = this.f28798b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        wn0Var.I.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.jo0 jo0Var = (org.telegram.ui.jo0) this.f28799c;
                if (motionEvent.getActionMasked() == 0 && (k1Var2 = jo0Var.m0) != null && k1Var2.isShowing()) {
                    Rect rect3 = this.f28798b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        jo0Var.m0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public ne(org.telegram.ui.jo0 jo0Var) {
        this.f28799c = jo0Var;
    }

    public ne(ChatActivityEnterView chatActivityEnterView) {
        this.f28799c = chatActivityEnterView;
    }
}
