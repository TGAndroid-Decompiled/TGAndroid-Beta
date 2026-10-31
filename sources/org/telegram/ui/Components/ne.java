package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class ne implements View.OnTouchListener {
    public final int f28771a = 0;
    public final Rect f28772b = new Rect();
    public final org.telegram.messenger.us f28773c;

    public ne(org.telegram.ui.yn0 yn0Var) {
        this.f28773c = yn0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        oe oeVar;
        org.telegram.ui.ActionBar.k1 k1Var;
        org.telegram.ui.ActionBar.k1 k1Var2;
        switch (this.f28771a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f28773c;
                if (motionEvent.getActionMasked() == 0 && (oeVar = chatActivityEnterView.N0) != null && oeVar.isShowing()) {
                    Rect rect = this.f28772b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.yn0 yn0Var = (org.telegram.ui.yn0) this.f28773c;
                if (motionEvent.getActionMasked() == 0 && (k1Var = yn0Var.I) != null && k1Var.isShowing()) {
                    Rect rect2 = this.f28772b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        yn0Var.I.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.lo0 lo0Var = (org.telegram.ui.lo0) this.f28773c;
                if (motionEvent.getActionMasked() == 0 && (k1Var2 = lo0Var.m0) != null && k1Var2.isShowing()) {
                    Rect rect3 = this.f28772b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        lo0Var.m0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public ne(org.telegram.ui.lo0 lo0Var) {
        this.f28773c = lo0Var;
    }

    public ne(ChatActivityEnterView chatActivityEnterView) {
        this.f28773c = chatActivityEnterView;
    }
}
