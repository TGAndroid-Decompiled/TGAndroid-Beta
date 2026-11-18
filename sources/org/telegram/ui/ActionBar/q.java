package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class q implements Runnable {
    public final int f29876a = 0;
    public final boolean f29877b;
    public final boolean f29878c;
    public final Object d;
    public final Object f29879e;
    public final Object f29880f;
    public final Object h;

    public q(ActionBarLayout actionBarLayout, boolean z10, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z11, h2 h2Var, h2 h2Var2) {
        this.d = actionBarLayout;
        this.f29877b = z10;
        this.f29879e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f29878c = z11;
        this.f29880f = h2Var;
        this.h = h2Var2;
    }

    @Override
    public final void run() {
        int i7 = this.f29876a;
        Object obj = this.h;
        Object obj2 = this.f29880f;
        Object obj3 = this.f29879e;
        Object obj4 = this.d;
        switch (i7) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                h2 h2Var = (h2) obj2;
                h2 h2Var2 = (h2) obj;
                if (this.f29877b) {
                    actionBarLayout.h = true;
                    actionBarLayout.K = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.f28683b0 = false;
                    actionBarLayout.f28719s.setScaleX(1.0f);
                    actionBarLayout.f28719s.setScaleY(1.0f);
                } else {
                    Drawable drawable = ActionBarLayout.f28676w1;
                    actionBarLayout.W(h2Var, this.f29878c);
                    actionBarLayout.f28719s.setTranslationX(0.0f);
                }
                if (h2Var != null) {
                    h2Var.onTransitionAnimationEnd(false, false);
                }
                h2Var2.onTransitionAnimationEnd(true, false);
                h2Var2.onBecomeFullyVisible();
                return;
            default:
                TwoStepVerificationActivity.f0((TwoStepVerificationActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, this.f29877b, this.f29878c, (Runnable) obj);
                return;
        }
    }

    public q(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f29879e = tL_error;
        this.f29880f = tLObject;
        this.f29877b = z10;
        this.f29878c = z11;
        this.h = runnable;
    }
}
