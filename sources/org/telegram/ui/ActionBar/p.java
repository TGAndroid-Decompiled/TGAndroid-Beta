package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class p implements Runnable {
    public final int f29857a = 0;
    public final boolean f29858b;
    public final boolean f29859c;
    public final Object d;
    public final Object f29860e;
    public final Object f29861f;
    public final Object h;

    public p(ActionBarLayout actionBarLayout, boolean z10, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z11, g2 g2Var, g2 g2Var2) {
        this.d = actionBarLayout;
        this.f29858b = z10;
        this.f29860e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f29859c = z11;
        this.f29861f = g2Var;
        this.h = g2Var2;
    }

    @Override
    public final void run() {
        int i7 = this.f29857a;
        Object obj = this.h;
        Object obj2 = this.f29861f;
        Object obj3 = this.f29860e;
        Object obj4 = this.d;
        switch (i7) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                g2 g2Var = (g2) obj2;
                g2 g2Var2 = (g2) obj;
                if (this.f29858b) {
                    actionBarLayout.h = true;
                    actionBarLayout.K = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.f28711b0 = false;
                    actionBarLayout.f28747s.setScaleX(1.0f);
                    actionBarLayout.f28747s.setScaleY(1.0f);
                } else {
                    Drawable drawable = ActionBarLayout.f28704w1;
                    actionBarLayout.W(g2Var, this.f29859c);
                    actionBarLayout.f28747s.setTranslationX(0.0f);
                }
                if (g2Var != null) {
                    g2Var.onTransitionAnimationEnd(false, false);
                }
                g2Var2.onTransitionAnimationEnd(true, false);
                g2Var2.onBecomeFullyVisible();
                return;
            default:
                TwoStepVerificationActivity.f0((TwoStepVerificationActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, this.f29858b, this.f29859c, (Runnable) obj);
                return;
        }
    }

    public p(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f29860e = tL_error;
        this.f29861f = tLObject;
        this.f29858b = z10;
        this.f29859c = z11;
        this.h = runnable;
    }
}
