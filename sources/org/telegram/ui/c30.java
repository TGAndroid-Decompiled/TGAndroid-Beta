package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class c30 extends AnimatorListenerAdapter {
    public final int f46399a;
    public final boolean f46400b;
    public final Object f46401c;

    public c30(int i7, Object obj, boolean z10) {
        this.f46399a = i7;
        this.f46401c = obj;
        this.f46400b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f46399a) {
            case 1:
                ((f50) this.f46401c).h = null;
                return;
            case 4:
                cn0 cn0Var = (cn0) this.f46401c;
                if (animator.equals(cn0Var.f46612l0)) {
                    cn0Var.f46612l0 = null;
                    return;
                }
                return;
            case 10:
                ((o31) this.f46401c).f50463n = null;
                return;
            case 12:
                bb1 bb1Var = (bb1) this.f46401c;
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
        int i7 = this.f46399a;
        float f10 = 1.0f;
        float f11 = 0.0f;
        boolean z10 = this.f46400b;
        Object obj = this.f46401c;
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
                if (f50Var.h != null && (xcVar = f50Var.f47597f) != null) {
                    if (z10) {
                        xcVar.setVisibility(4);
                    } else {
                        f50Var.f47598n.setVisibility(4);
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
                    ((PasscodeActivity) obj).f43191w.setVisibility(8);
                    return;
                }
                return;
            case 4:
                cn0 cn0Var = (cn0) obj;
                if (animator.equals(cn0Var.f46612l0)) {
                    if (!z10) {
                        cn0Var.f46597a0.setVisibility(4);
                        cn0Var.f46599b0.setVisibility(4);
                    }
                    cn0Var.f46612l0 = null;
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
                ProfileActivity profileActivity = ow0Var.f50670n;
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
                    rx0Var.f51786c.setVisibility(8);
                    return;
                } else {
                    rx0Var.f51788f.setVisibility(8);
                    return;
                }
            case 8:
                uz0 uz0Var = (uz0) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                uz0Var.f52671w = f10;
                if (uz0Var.T) {
                    uz0Var.O.invalidate();
                    return;
                }
                return;
            case 9:
                o11 o11Var = (o11) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = o11Var.f50406w;
                if (z10) {
                    f11 = 1.0f;
                }
                o11Var.M = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.nr.f37961g.getInterpolation(o11Var.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float s5 = org.telegram.messenger.g0.s(o11Var.M, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10).setAlpha(s5);
                }
                o11Var.O = null;
                return;
            case 10:
                o31 o31Var = (o31) obj;
                if (o31Var.f50463n != null && (c4Var = o31Var.f50464r) != null) {
                    if (!z10) {
                        c4Var.setVisibility(4);
                    }
                    o31Var.f50463n = null;
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
                        bb1Var.f45842e.setVisibility(4);
                        return;
                    } else {
                        bb1Var.f45837b.setVisibility(4);
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
                di.q qVar2 = l0Var.f53179c0;
                if (!l0Var.f53175a0) {
                    qVar2.setVisibility(8);
                }
                if (!z10) {
                    f10 = 0.0f;
                }
                l0Var.f53177b0 = f10;
                qVar2.setAlpha(f10);
                l0Var.j(l0Var.f53177b0);
                l0Var.S.setTranslationX(org.telegram.messenger.g0.L(56.0f) * l0Var.f53177b0);
                l0Var.P.setTranslationX(org.telegram.messenger.g0.L(112.0f) * l0Var.f53177b0);
                l0Var.invalidate();
                return;
            case 15:
                tg.q1 q1Var = (tg.q1) obj;
                ((sg.i) q1Var).E.f57368s1.d();
                if (z10) {
                    q1Var.f58149x.accept(Integer.valueOf(q1Var.f58147s));
                }
                if (q1Var.getParent() != null) {
                    ((ViewGroup) q1Var.getParent()).removeView(q1Var);
                    return;
                }
                return;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                if (z10) {
                    limitPreviewView.f33075k0 = false;
                }
                Runnable runnable = limitPreviewView.f33076l0;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                    limitPreviewView.f33076l0.run();
                    return;
                }
                return;
            default:
                ug.r0 r0Var = (ug.r0) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                r0Var.P = f10;
                r0Var.f58904f.invalidate();
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
        switch (this.f46399a) {
            case 2:
                if (this.f46400b) {
                    ((de0) this.f46401c).W.setVisibility(0);
                    return;
                }
                return;
            case 3:
                if (this.f46400b) {
                    ((PasscodeActivity) this.f46401c).f43191w.setVisibility(0);
                    return;
                }
                return;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                return;
            case 6:
                ow0 ow0Var = (ow0) this.f46401c;
                ProfileActivity profileActivity = ow0Var.f50670n;
                org.telegram.ui.ActionBar.g5 g5Var = profileActivity.U0;
                if (g5Var != null && !this.f46400b) {
                    g5Var.setClickable(true);
                }
                profileActivity.F5(true);
                ow0Var.setVisibility(0);
                profileActivity.P5(false);
                return;
            case 7:
                rx0 rx0Var = (rx0) this.f46401c;
                if (this.f46400b) {
                    rx0Var.f51788f.setAlpha(0.0f);
                    rx0Var.f51788f.setVisibility(0);
                    return;
                }
                rx0Var.f51786c.setAlpha(0.0f);
                rx0Var.f51786c.setVisibility(0);
                return;
        }
    }
}
