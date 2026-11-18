package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class c30 extends AnimatorListenerAdapter {
    public final int f46373a;
    public final boolean f46374b;
    public final Object f46375c;

    public c30(int i7, Object obj, boolean z10) {
        this.f46373a = i7;
        this.f46375c = obj;
        this.f46374b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f46373a) {
            case 1:
                ((f50) this.f46375c).h = null;
                return;
            case 4:
                cn0 cn0Var = (cn0) this.f46375c;
                if (animator.equals(cn0Var.f46573l0)) {
                    cn0Var.f46573l0 = null;
                    return;
                }
                return;
            case 10:
                ((o31) this.f46375c).f50454n = null;
                return;
            case 12:
                bb1 bb1Var = (bb1) this.f46375c;
                AnimatorSet animatorSet = bb1Var.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    bb1Var.J = null;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        xc xcVar;
        org.telegram.ui.Cells.b4 b4Var;
        int i7 = this.f46373a;
        float f10 = 1.0f;
        float f11 = 0.0f;
        boolean z10 = this.f46374b;
        Object obj = this.f46375c;
        switch (i7) {
            case 0:
                f40 f40Var = (f40) obj;
                f40Var.T4 = null;
                org.telegram.ui.ActionBar.n5 subtitleTextView = f40Var.J1.getSubtitleTextView();
                if (!z10) {
                    f11 = org.telegram.messenger.g0.L(20.0f);
                }
                subtitleTextView.setTranslationY(f11);
                return;
            case 1:
                f50 f50Var = (f50) obj;
                if (f50Var.h != null && (xcVar = f50Var.f47569f) != null) {
                    if (z10) {
                        xcVar.setVisibility(4);
                    } else {
                        f50Var.f47570n.setVisibility(4);
                    }
                    f50Var.h = null;
                    return;
                }
                return;
            case 2:
                de0 de0Var = (de0) obj;
                if (!z10) {
                    de0Var.W.setVisibility(4);
                }
                AnimatorSet animatorSet = de0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    de0Var.M = null;
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    ((PasscodeActivity) obj).f43146w.setVisibility(8);
                    return;
                }
                return;
            case 4:
                cn0 cn0Var = (cn0) obj;
                if (animator.equals(cn0Var.f46573l0)) {
                    if (!z10) {
                        cn0Var.f46558a0.setVisibility(4);
                        cn0Var.f46560b0.setVisibility(4);
                    }
                    cn0Var.f46573l0 = null;
                    return;
                }
                return;
            case 5:
                as0 as0Var = (as0) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                as0Var.F = f10;
                return;
            case 6:
                ow0 ow0Var = (ow0) obj;
                ProfileActivity profileActivity = ow0Var.f50677n;
                if (ow0Var.h) {
                    org.telegram.ui.ActionBar.h5 h5Var = profileActivity.U0;
                    if (h5Var != null) {
                        h5Var.setClickable(false);
                    }
                } else {
                    ow0Var.setVisibility(8);
                }
                RectF rectF = ProfileActivity.Z6;
                profileActivity.P5(false);
                return;
            case 7:
                rx0 rx0Var = (rx0) obj;
                if (z10) {
                    rx0Var.f51818c.setVisibility(8);
                    return;
                } else {
                    rx0Var.f51820f.setVisibility(8);
                    return;
                }
            case 8:
                tz0 tz0Var = (tz0) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                tz0Var.f52396w = f10;
                if (tz0Var.T) {
                    tz0Var.O.invalidate();
                    return;
                }
                return;
            case 9:
                n11 n11Var = (n11) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = n11Var.f50062w;
                if (z10) {
                    f11 = 1.0f;
                }
                n11Var.M = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.lr.f37209g.getInterpolation(n11Var.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float s5 = org.telegram.messenger.g0.s(n11Var.M, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10).setAlpha(s5);
                }
                n11Var.O = null;
                return;
            case 10:
                o31 o31Var = (o31) obj;
                if (o31Var.f50454n != null && (b4Var = o31Var.f50455r) != null) {
                    if (!z10) {
                        b4Var.setVisibility(4);
                    }
                    o31Var.f50454n = null;
                    return;
                }
                return;
            case 11:
                i81 i81Var = (i81) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                i81Var.E = f10;
                return;
            case 12:
                bb1 bb1Var = (bb1) obj;
                AnimatorSet animatorSet2 = bb1Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (z10) {
                        bb1Var.f45819e.setVisibility(4);
                        return;
                    } else {
                        bb1Var.f45814b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 13:
                org.telegram.ui.web.j1 j1Var = (org.telegram.ui.web.j1) obj;
                di.q qVar = j1Var.W;
                if (!j1Var.U) {
                    qVar.setVisibility(8);
                    qVar.setText("");
                }
                if (!z10) {
                    f10 = 0.0f;
                }
                j1Var.V = f10;
                qVar.setAlpha(f10);
                j1Var.invalidate();
                if (j1Var.U) {
                    qVar.requestFocus();
                    org.telegram.messenger.g0.I3(qVar);
                    return;
                }
                qVar.clearFocus();
                org.telegram.messenger.g0.v1(qVar);
                return;
            case 14:
                l0 l0Var = (l0) obj;
                di.q qVar2 = l0Var.f53181c0;
                if (!l0Var.f53177a0) {
                    qVar2.setVisibility(8);
                }
                if (!z10) {
                    f10 = 0.0f;
                }
                l0Var.f53179b0 = f10;
                qVar2.setAlpha(f10);
                l0Var.j(l0Var.f53179b0);
                l0Var.S.setTranslationX(org.telegram.messenger.g0.L(56.0f) * l0Var.f53179b0);
                l0Var.P.setTranslationX(org.telegram.messenger.g0.L(112.0f) * l0Var.f53179b0);
                l0Var.invalidate();
                return;
            case 15:
                tg.o1 o1Var = (tg.o1) obj;
                ((sg.i) o1Var).E.f57323s1.d();
                if (z10) {
                    o1Var.f58080x.accept(Integer.valueOf(o1Var.f58078s));
                }
                if (o1Var.getParent() != null) {
                    ((ViewGroup) o1Var.getParent()).removeView(o1Var);
                    return;
                }
                return;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                if (z10) {
                    limitPreviewView.f33039k0 = false;
                }
                Runnable runnable = limitPreviewView.f33040l0;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                    limitPreviewView.f33040l0.run();
                    return;
                }
                return;
            default:
                ug.s0 s0Var = (ug.s0) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                s0Var.P = f10;
                s0Var.f58863f.invalidate();
                ug.r0 r0Var = s0Var.h;
                if (r0Var != null) {
                    r0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f46373a) {
            case 2:
                if (this.f46374b) {
                    ((de0) this.f46375c).W.setVisibility(0);
                    return;
                }
                return;
            case 3:
                if (this.f46374b) {
                    ((PasscodeActivity) this.f46375c).f43146w.setVisibility(0);
                    return;
                }
                return;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                return;
            case 6:
                ow0 ow0Var = (ow0) this.f46375c;
                ProfileActivity profileActivity = ow0Var.f50677n;
                org.telegram.ui.ActionBar.h5 h5Var = profileActivity.U0;
                if (h5Var != null && !this.f46374b) {
                    h5Var.setClickable(true);
                }
                profileActivity.F5(true);
                ow0Var.setVisibility(0);
                profileActivity.P5(false);
                return;
            case 7:
                rx0 rx0Var = (rx0) this.f46375c;
                if (this.f46374b) {
                    rx0Var.f51820f.setAlpha(0.0f);
                    rx0Var.f51820f.setVisibility(0);
                    return;
                }
                rx0Var.f51818c.setAlpha(0.0f);
                rx0Var.f51818c.setVisibility(0);
                return;
        }
    }
}
