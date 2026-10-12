package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class mf implements View.OnTouchListener {
    public final int f27384a = 0;
    public final Rect f27385b = new Rect();
    public final NotificationCenter.NotificationCenterDelegate f27386c;

    public mf(org.telegram.ui.qq0 qq0Var) {
        this.f27386c = qq0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        nf nfVar;
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f27384a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f27386c;
                if (motionEvent.getActionMasked() == 0 && (nfVar = chatActivityEnterView.N0) != null && nfVar.isShowing()) {
                    Rect rect = this.f27385b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.qq0 qq0Var = (org.telegram.ui.qq0) this.f27386c;
                if (motionEvent.getActionMasked() == 0 && (m1Var = qq0Var.I) != null && m1Var.isShowing()) {
                    Rect rect2 = this.f27385b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        qq0Var.I.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.hr0 hr0Var = (org.telegram.ui.hr0) this.f27386c;
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = hr0Var.m0) != null && m1Var2.isShowing()) {
                    Rect rect3 = this.f27385b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        hr0Var.m0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public mf(org.telegram.ui.hr0 hr0Var) {
        this.f27386c = hr0Var;
    }

    public mf(ChatActivityEnterView chatActivityEnterView) {
        this.f27386c = chatActivityEnterView;
    }
}
