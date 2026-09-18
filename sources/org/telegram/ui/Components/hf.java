package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class hf implements View.OnTouchListener {
    public final int f24650a = 0;
    public final Rect f24651b = new Rect();
    public final NotificationCenter.NotificationCenterDelegate f24652c;

    public hf(org.telegram.ui.lq0 lq0Var) {
        this.f24652c = lq0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        jf jfVar;
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.f24650a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f24652c;
                if (motionEvent.getActionMasked() == 0 && (jfVar = chatActivityEnterView.N0) != null && jfVar.isShowing()) {
                    Rect rect = this.f24651b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.lq0 lq0Var = (org.telegram.ui.lq0) this.f24652c;
                if (motionEvent.getActionMasked() == 0 && (o1Var = lq0Var.I) != null && o1Var.isShowing()) {
                    Rect rect2 = this.f24651b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        lq0Var.I.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.cr0 cr0Var = (org.telegram.ui.cr0) this.f24652c;
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = cr0Var.m0) != null && o1Var2.isShowing()) {
                    Rect rect3 = this.f24651b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        cr0Var.m0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }

    public hf(org.telegram.ui.cr0 cr0Var) {
        this.f24652c = cr0Var;
    }

    public hf(ChatActivityEnterView chatActivityEnterView) {
        this.f24652c = chatActivityEnterView;
    }
}
