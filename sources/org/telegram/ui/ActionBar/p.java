package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class p implements Runnable {
    public final int f29449a = 0;
    public final boolean f29450b;
    public final boolean f29451c;
    public final Object d;
    public final Object f29452e;
    public final Object f29453f;
    public final Object h;

    public p(ActionBarLayout actionBarLayout, boolean z10, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z11, e2 e2Var, e2 e2Var2) {
        this.d = actionBarLayout;
        this.f29450b = z10;
        this.f29452e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f29451c = z11;
        this.f29453f = e2Var;
        this.h = e2Var2;
    }

    @Override
    public final void run() {
        int i7 = this.f29449a;
        Object obj = this.h;
        Object obj2 = this.f29453f;
        Object obj3 = this.f29452e;
        Object obj4 = this.d;
        switch (i7) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                e2 e2Var = (e2) obj2;
                e2 e2Var2 = (e2) obj;
                if (this.f29450b) {
                    actionBarLayout.h = true;
                    actionBarLayout.K = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.f28329b0 = false;
                    actionBarLayout.f28365s.setScaleX(1.0f);
                    actionBarLayout.f28365s.setScaleY(1.0f);
                } else {
                    Drawable drawable = ActionBarLayout.f28322w1;
                    actionBarLayout.W(e2Var, this.f29451c);
                    actionBarLayout.f28365s.setTranslationX(0.0f);
                }
                if (e2Var != null) {
                    e2Var.onTransitionAnimationEnd(false, false);
                }
                e2Var2.onTransitionAnimationEnd(true, false);
                e2Var2.onBecomeFullyVisible();
                return;
            default:
                TwoStepVerificationActivity.f0((TwoStepVerificationActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, this.f29450b, this.f29451c, (Runnable) obj);
                return;
        }
    }

    public p(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f29452e = tL_error;
        this.f29453f = tLObject;
        this.f29450b = z10;
        this.f29451c = z11;
        this.h = runnable;
    }
}
