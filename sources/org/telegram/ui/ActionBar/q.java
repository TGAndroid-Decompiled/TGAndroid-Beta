package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class q implements Runnable {
    public final int f20655a = 0;
    public final boolean f20656b;
    public final boolean f20657c;
    public final Object d;
    public final Object e;
    public final Object f20658f;
    public final Object h;

    public q(ActionBarLayout actionBarLayout, boolean z10, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z11, k2 k2Var, k2 k2Var2) {
        this.d = actionBarLayout;
        this.f20656b = z10;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f20657c = z11;
        this.f20658f = k2Var;
        this.h = k2Var2;
    }

    @Override
    public final void run() {
        int i10 = this.f20655a;
        Object obj = this.h;
        Object obj2 = this.f20658f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                k2 k2Var = (k2) obj2;
                k2 k2Var2 = (k2) obj;
                if (this.f20656b) {
                    actionBarLayout.h = true;
                    actionBarLayout.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.f20070a0 = false;
                    actionBarLayout.f20109s.setScaleX(1.0f);
                    actionBarLayout.f20109s.setScaleY(1.0f);
                } else {
                    Drawable drawable = ActionBarLayout.f20066v1;
                    actionBarLayout.V(k2Var, this.f20657c);
                    actionBarLayout.f20109s.setTranslationX(0.0f);
                }
                if (k2Var != null) {
                    k2Var.onTransitionAnimationEnd(false, false);
                }
                k2Var2.onTransitionAnimationEnd(true, false);
                k2Var2.onBecomeFullyVisible();
                return;
            default:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, this.f20656b, this.f20657c, (Runnable) obj);
                return;
        }
    }

    public q(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.e = tL_error;
        this.f20658f = tLObject;
        this.f20656b = z10;
        this.f20657c = z11;
        this.h = runnable;
    }
}
