package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class q implements Runnable {
    public final int f20656a = 0;
    public final boolean f20657b;
    public final boolean f20658c;
    public final Object d;
    public final Object e;
    public final Object f20659f;
    public final Object h;

    public q(ActionBarLayout actionBarLayout, boolean z10, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z11, k2 k2Var, k2 k2Var2) {
        this.d = actionBarLayout;
        this.f20657b = z10;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f20658c = z11;
        this.f20659f = k2Var;
        this.h = k2Var2;
    }

    @Override
    public final void run() {
        int i10 = this.f20656a;
        Object obj = this.h;
        Object obj2 = this.f20659f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                k2 k2Var = (k2) obj2;
                k2 k2Var2 = (k2) obj;
                if (this.f20657b) {
                    actionBarLayout.h = true;
                    actionBarLayout.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.f20071a0 = false;
                    actionBarLayout.f20110s.setScaleX(1.0f);
                    actionBarLayout.f20110s.setScaleY(1.0f);
                } else {
                    Drawable drawable = ActionBarLayout.f20067v1;
                    actionBarLayout.V(k2Var, this.f20658c);
                    actionBarLayout.f20110s.setTranslationX(0.0f);
                }
                if (k2Var != null) {
                    k2Var.onTransitionAnimationEnd(false, false);
                }
                k2Var2.onTransitionAnimationEnd(true, false);
                k2Var2.onBecomeFullyVisible();
                return;
            default:
                TwoStepVerificationActivity.f0((TwoStepVerificationActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, this.f20657b, this.f20658c, (Runnable) obj);
                return;
        }
    }

    public q(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.e = tL_error;
        this.f20659f = tLObject;
        this.f20657b = z10;
        this.f20658c = z11;
        this.h = runnable;
    }
}
