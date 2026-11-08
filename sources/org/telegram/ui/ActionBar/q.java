package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class q implements Runnable {
    public final int f28382a = 0;
    public final boolean f28383b;
    public final boolean f28384c;
    public final Object d;
    public final Object f28385e;
    public final Object f28386f;
    public final Object h;

    public q(ActionBarLayout actionBarLayout, boolean z9, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10, f2 f2Var, f2 f2Var2) {
        this.d = actionBarLayout;
        this.f28383b = z9;
        this.f28385e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f28384c = z10;
        this.f28386f = f2Var;
        this.h = f2Var2;
    }

    @Override
    public final void run() {
        int i7 = this.f28382a;
        Object obj = this.h;
        Object obj2 = this.f28386f;
        Object obj3 = this.f28385e;
        Object obj4 = this.d;
        switch (i7) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                f2 f2Var = (f2) obj2;
                f2 f2Var2 = (f2) obj;
                if (this.f28383b) {
                    actionBarLayout.h = true;
                    actionBarLayout.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.f27231a0 = false;
                    actionBarLayout.f27270s.setScaleX(1.0f);
                    actionBarLayout.f27270s.setScaleY(1.0f);
                } else {
                    Drawable drawable = ActionBarLayout.f27227v1;
                    actionBarLayout.W(f2Var, this.f28384c);
                    actionBarLayout.f27270s.setTranslationX(0.0f);
                }
                if (f2Var != null) {
                    f2Var.onTransitionAnimationEnd(false, false);
                }
                f2Var2.onTransitionAnimationEnd(true, false);
                f2Var2.onBecomeFullyVisible();
                return;
            default:
                TwoStepVerificationActivity.f0((TwoStepVerificationActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, this.f28383b, this.f28384c, (Runnable) obj);
                return;
        }
    }

    public q(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z9, boolean z10, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f28385e = tL_error;
        this.f28386f = tLObject;
        this.f28383b = z9;
        this.f28384c = z10;
        this.h = runnable;
    }
}
