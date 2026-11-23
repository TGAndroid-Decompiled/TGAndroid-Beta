package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class c30 extends AnimatorListenerAdapter {
    public final int f46383a;
    public final boolean f46384b;
    public final Object f46385c;

    public c30(int i7, Object obj, boolean z10) {
        this.f46383a = i7;
        this.f46385c = obj;
        this.f46384b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f46383a) {
            case 1:
                ((f50) this.f46385c).h = null;
                return;
            case 4:
                cn0 cn0Var = (cn0) this.f46385c;
                if (animator.equals(cn0Var.f46595l0)) {
                    cn0Var.f46595l0 = null;
                    return;
                }
                return;
            case 10:
                ((o31) this.f46385c).f50452n = null;
                return;
            case 12:
                bb1 bb1Var = (bb1) this.f46385c;
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
        org.telegram.ui.Cells.c4 c4Var;
        int i7 = this.f46383a;
        float f10 = 1.0f;
        float f11 = 0.0f;
        boolean z10 = this.f46384b;
        Object obj = this.f46385c;
        switch (i7) {
            case 0:
                f40 f40Var = (f40) obj;
                f40Var.T4 = null;
                org.telegram.ui.ActionBar.m5 subtitleTextView = f40Var.J1.getSubtitleTextView();
                if (!z10) {
                    f11 = org.telegram.messenger.g0.L(20.0f);
                }
                subtitleTextView.setTranslationY(f11);
                return;
            case 1:
                f50 f50Var = (f50) obj;
                if (f50Var.h != null && (xcVar = f50Var.f47559f) != null) {
                    if (z10) {
                        xcVar.setVisibility(4);
                    } else {
                        f50Var.f47560n.setVisibility(4);
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
                    ((PasscodeActivity) obj).f43156w.setVisibility(8);
                    return;
                }
                return;
            case 4:
                cn0 cn0Var = (cn0) obj;
                if (animator.equals(cn0Var.f46595l0)) {
                    if (!z10) {
                        cn0Var.f46580a0.setVisibility(4);
                        cn0Var.f46582b0.setVisibility(4);
                    }
                    cn0Var.f46595l0 = null;
                    return;
                }
                return;
            case 5:
                bs0 bs0Var = (bs0) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                bs0Var.F = f10;
                return;
            case 6:
                ow0 ow0Var = (ow0) obj;
                ProfileActivity profileActivity = ow0Var.f50651n;
                if (ow0Var.h) {
                    org.telegram.ui.ActionBar.g5 g5Var = profileActivity.U0;
                    if (g5Var != null) {
                        g5Var.setClickable(false);
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
                    rx0Var.f51820c.setVisibility(8);
                    return;
                } else {
                    rx0Var.f51822f.setVisibility(8);
                    return;
                }
            case 8:
                tz0 tz0Var = (tz0) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                tz0Var.f52397w = f10;
                if (tz0Var.T) {
                    tz0Var.O.invalidate();
                    return;
                }
                return;
            case 9:
                n11 n11Var = (n11) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = n11Var.f50055w;
                if (z10) {
                    f11 = 1.0f;
                }
                n11Var.M = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.nr.f37918g.getInterpolation(n11Var.M));
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
                if (o31Var.f50452n != null && (c4Var = o31Var.f50453r) != null) {
                    if (!z10) {
                        c4Var.setVisibility(4);
                    }
                    o31Var.f50452n = null;
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
                        bb1Var.f45790e.setVisibility(4);
                        return;
                    } else {
                        bb1Var.f45785b.setVisibility(4);
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
                di.q qVar2 = l0Var.f53143c0;
                if (!l0Var.f53139a0) {
                    qVar2.setVisibility(8);
                }
                if (!z10) {
                    f10 = 0.0f;
                }
                l0Var.f53141b0 = f10;
                qVar2.setAlpha(f10);
                l0Var.j(l0Var.f53141b0);
                l0Var.S.setTranslationX(org.telegram.messenger.g0.L(56.0f) * l0Var.f53141b0);
                l0Var.P.setTranslationX(org.telegram.messenger.g0.L(112.0f) * l0Var.f53141b0);
                l0Var.invalidate();
                return;
            case 15:
                tg.q1 q1Var = (tg.q1) obj;
                ((sg.i) q1Var).E.f57333s1.d();
                if (z10) {
                    q1Var.f58114x.accept(Integer.valueOf(q1Var.f58112s));
                }
                if (q1Var.getParent() != null) {
                    ((ViewGroup) q1Var.getParent()).removeView(q1Var);
                    return;
                }
                return;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                if (z10) {
                    limitPreviewView.f33041k0 = false;
                }
                Runnable runnable = limitPreviewView.f33042l0;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                    limitPreviewView.f33042l0.run();
                    return;
                }
                return;
            default:
                ug.r0 r0Var = (ug.r0) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                r0Var.P = f10;
                r0Var.f58869f.invalidate();
                ug.q0 q0Var = r0Var.h;
                if (q0Var != null) {
                    q0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f46383a) {
            case 2:
                if (this.f46384b) {
                    ((de0) this.f46385c).W.setVisibility(0);
                    return;
                }
                return;
            case 3:
                if (this.f46384b) {
                    ((PasscodeActivity) this.f46385c).f43156w.setVisibility(0);
                    return;
                }
                return;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                return;
            case 6:
                ow0 ow0Var = (ow0) this.f46385c;
                ProfileActivity profileActivity = ow0Var.f50651n;
                org.telegram.ui.ActionBar.g5 g5Var = profileActivity.U0;
                if (g5Var != null && !this.f46384b) {
                    g5Var.setClickable(true);
                }
                profileActivity.F5(true);
                ow0Var.setVisibility(0);
                profileActivity.P5(false);
                return;
            case 7:
                rx0 rx0Var = (rx0) this.f46385c;
                if (this.f46384b) {
                    rx0Var.f51822f.setAlpha(0.0f);
                    rx0Var.f51822f.setVisibility(0);
                    return;
                }
                rx0Var.f51820c.setAlpha(0.0f);
                rx0Var.f51820c.setVisibility(0);
                return;
        }
    }
}
