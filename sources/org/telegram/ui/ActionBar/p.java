package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class p implements Runnable {
    public final int f28401a = 0;
    public final boolean f28402b;
    public final boolean f28403c;
    public final Object d;
    public final Object f28404e;
    public final Object f28405f;
    public final Object h;

    public p(ActionBarLayout actionBarLayout, boolean z10, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z11, d2 d2Var, d2 d2Var2) {
        this.d = actionBarLayout;
        this.f28402b = z10;
        this.f28404e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f28403c = z11;
        this.f28405f = d2Var;
        this.h = d2Var2;
    }

    @Override
    public final void run() {
        int i3 = this.f28401a;
        Object obj = this.h;
        Object obj2 = this.f28405f;
        Object obj3 = this.f28404e;
        Object obj4 = this.d;
        switch (i3) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                d2 d2Var = (d2) obj2;
                d2 d2Var2 = (d2) obj;
                if (this.f28402b) {
                    actionBarLayout.h = true;
                    actionBarLayout.K = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.f27280b0 = false;
                    actionBarLayout.f27316s.setScaleX(1.0f);
                    actionBarLayout.f27316s.setScaleY(1.0f);
                } else {
                    Drawable drawable = ActionBarLayout.f27273w1;
                    actionBarLayout.W(d2Var, this.f28403c);
                    actionBarLayout.f27316s.setTranslationX(0.0f);
                }
                if (d2Var != null) {
                    d2Var.onTransitionAnimationEnd(false, false);
                }
                d2Var2.onTransitionAnimationEnd(true, false);
                d2Var2.onBecomeFullyVisible();
                return;
            default:
                TwoStepVerificationActivity.f0((TwoStepVerificationActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, this.f28402b, this.f28403c, (Runnable) obj);
                return;
        }
    }

    public p(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f28404e = tL_error;
        this.f28405f = tLObject;
        this.f28402b = z10;
        this.f28403c = z11;
        this.h = runnable;
    }
}
