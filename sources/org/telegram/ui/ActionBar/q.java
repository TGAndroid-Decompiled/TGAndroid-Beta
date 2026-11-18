package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class q implements Runnable {
    public final int f29874a = 0;
    public final boolean f29875b;
    public final boolean f29876c;
    public final Object d;
    public final Object f29877e;
    public final Object f29878f;
    public final Object h;

    public q(ActionBarLayout actionBarLayout, boolean z10, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z11, h2 h2Var, h2 h2Var2) {
        this.d = actionBarLayout;
        this.f29875b = z10;
        this.f29877e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f29876c = z11;
        this.f29878f = h2Var;
        this.h = h2Var2;
    }

    @Override
    public final void run() {
        int i7 = this.f29874a;
        Object obj = this.h;
        Object obj2 = this.f29878f;
        Object obj3 = this.f29877e;
        Object obj4 = this.d;
        switch (i7) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                h2 h2Var = (h2) obj2;
                h2 h2Var2 = (h2) obj;
                if (this.f29875b) {
                    actionBarLayout.h = true;
                    actionBarLayout.K = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.f28681b0 = false;
                    actionBarLayout.f28717s.setScaleX(1.0f);
                    actionBarLayout.f28717s.setScaleY(1.0f);
                } else {
                    Drawable drawable = ActionBarLayout.f28674w1;
                    actionBarLayout.W(h2Var, this.f29876c);
                    actionBarLayout.f28717s.setTranslationX(0.0f);
                }
                if (h2Var != null) {
                    h2Var.onTransitionAnimationEnd(false, false);
                }
                h2Var2.onTransitionAnimationEnd(true, false);
                h2Var2.onBecomeFullyVisible();
                return;
            default:
                TwoStepVerificationActivity.f0((TwoStepVerificationActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, this.f29875b, this.f29876c, (Runnable) obj);
                return;
        }
    }

    public q(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f29877e = tL_error;
        this.f29878f = tLObject;
        this.f29875b = z10;
        this.f29876c = z11;
        this.h = runnable;
    }
}
