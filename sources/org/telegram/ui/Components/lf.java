package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class lf implements View.OnTouchListener {
    public final int f26039a = 0;
    public final Rect f26040b = new Rect();
    public final NotificationCenter.NotificationCenterDelegate f26041c;

    public lf(org.telegram.ui.fq0 fq0Var) {
        this.f26041c = fq0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        mf mfVar;
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.f26039a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f26041c;
                if (motionEvent.getActionMasked() == 0 && (mfVar = chatActivityEnterView.N0) != null && mfVar.isShowing()) {
                    Rect rect = this.f26040b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.fq0 fq0Var = (org.telegram.ui.fq0) this.f26041c;
                if (motionEvent.getActionMasked() == 0 && (o1Var = fq0Var.I) != null && o1Var.isShowing()) {
                    Rect rect2 = this.f26040b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        fq0Var.I.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.wq0 wq0Var = (org.telegram.ui.wq0) this.f26041c;
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = wq0Var.m0) != null && o1Var2.isShowing()) {
                    Rect rect3 = this.f26040b;
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

    public lf(org.telegram.ui.wq0 wq0Var) {
        this.f26041c = wq0Var;
    }

    public lf(ChatActivityEnterView chatActivityEnterView) {
        this.f26041c = chatActivityEnterView;
    }
}
