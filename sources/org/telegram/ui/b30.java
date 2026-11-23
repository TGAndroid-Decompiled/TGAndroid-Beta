package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class b30 extends AnimatorListenerAdapter {
    public final int f45894a;
    public final boolean f45895b;
    public final Object f45896c;

    public b30(int i7, Object obj, boolean z10) {
        this.f45894a = i7;
        this.f45896c = obj;
        this.f45895b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f45894a) {
            case 1:
                ((e50) this.f45896c).h = null;
                return;
            case 4:
                an0 an0Var = (an0) this.f45896c;
                if (animator.equals(an0Var.f45759l0)) {
                    an0Var.f45759l0 = null;
                    return;
                }
                return;
            case 10:
                ((n31) this.f45896c).f50200n = null;
                return;
            case 12:
                za1 za1Var = (za1) this.f45896c;
                AnimatorSet animatorSet = za1Var.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    za1Var.J = null;
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
        int i7 = this.f45894a;
        float f10 = 1.0f;
        float f11 = 0.0f;
        boolean z10 = this.f45895b;
        Object obj = this.f45896c;
        switch (i7) {
            case 0:
                e40 e40Var = (e40) obj;
                e40Var.T4 = null;
                org.telegram.ui.ActionBar.n5 subtitleTextView = e40Var.J1.getSubtitleTextView();
                if (!z10) {
                    f11 = org.telegram.messenger.g0.L(20.0f);
                }
                subtitleTextView.setTranslationY(f11);
                return;
            case 1:
                e50 e50Var = (e50) obj;
                if (e50Var.h != null && (xcVar = e50Var.f47440f) != null) {
                    if (z10) {
                        xcVar.setVisibility(4);
                    } else {
                        e50Var.f47441n.setVisibility(4);
                    }
                    e50Var.h = null;
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
                    ((PasscodeActivity) obj).f43266w.setVisibility(8);
                    return;
                }
                return;
            case 4:
                an0 an0Var = (an0) obj;
                if (animator.equals(an0Var.f45759l0)) {
                    if (!z10) {
                        an0Var.f45744a0.setVisibility(4);
                        an0Var.f45746b0.setVisibility(4);
                    }
                    an0Var.f45759l0 = null;
                    return;
                }
                return;
            case 5:
                zr0 zr0Var = (zr0) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                zr0Var.F = f10;
                return;
            case 6:
                mw0 mw0Var = (mw0) obj;
                ProfileActivity profileActivity = mw0Var.f50133n;
                if (mw0Var.h) {
                    org.telegram.ui.ActionBar.g5 g5Var = profileActivity.U0;
                    if (g5Var != null) {
                        g5Var.setClickable(false);
                    }
                } else {
                    mw0Var.setVisibility(8);
                }
                RectF rectF = ProfileActivity.Z6;
                profileActivity.P5(false);
                return;
            case 7:
                px0 px0Var = (px0) obj;
                if (z10) {
                    px0Var.f51167c.setVisibility(8);
                    return;
                } else {
                    px0Var.f51169f.setVisibility(8);
                    return;
                }
            case 8:
                sz0 sz0Var = (sz0) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                sz0Var.f52190w = f10;
                if (sz0Var.T) {
                    sz0Var.O.invalidate();
                    return;
                }
                return;
            case 9:
                m11 m11Var = (m11) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m11Var.f49932w;
                if (z10) {
                    f11 = 1.0f;
                }
                m11Var.M = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.kr.f36859g.getInterpolation(m11Var.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float s5 = org.telegram.messenger.g0.s(m11Var.M, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10).setAlpha(s5);
                }
                m11Var.O = null;
                return;
            case 10:
                n31 n31Var = (n31) obj;
                if (n31Var.f50200n != null && (c4Var = n31Var.f50201r) != null) {
                    if (!z10) {
                        c4Var.setVisibility(4);
                    }
                    n31Var.f50200n = null;
                    return;
                }
                return;
            case 11:
                g81 g81Var = (g81) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                g81Var.E = f10;
                return;
            case 12:
                za1 za1Var = (za1) obj;
                AnimatorSet animatorSet2 = za1Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (z10) {
                        za1Var.f54567e.setVisibility(4);
                        return;
                    } else {
                        za1Var.f54562b.setVisibility(4);
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
                di.q qVar2 = l0Var.f53414c0;
                if (!l0Var.f53410a0) {
                    qVar2.setVisibility(8);
                }
                if (!z10) {
                    f10 = 0.0f;
                }
                l0Var.f53412b0 = f10;
                qVar2.setAlpha(f10);
                l0Var.j(l0Var.f53412b0);
                l0Var.S.setTranslationX(org.telegram.messenger.g0.L(56.0f) * l0Var.f53412b0);
                l0Var.P.setTranslationX(org.telegram.messenger.g0.L(112.0f) * l0Var.f53412b0);
                l0Var.invalidate();
                return;
            case 15:
                tg.t1 t1Var = (tg.t1) obj;
                ((sg.i) t1Var).E.f57443s1.d();
                if (z10) {
                    t1Var.f58253x.accept(Integer.valueOf(t1Var.f58251s));
                }
                if (t1Var.getParent() != null) {
                    ((ViewGroup) t1Var.getParent()).removeView(t1Var);
                    return;
                }
                return;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                if (z10) {
                    limitPreviewView.f33139k0 = false;
                }
                Runnable runnable = limitPreviewView.f33140l0;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                    limitPreviewView.f33140l0.run();
                    return;
                }
                return;
            default:
                ug.r0 r0Var = (ug.r0) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                r0Var.P = f10;
                r0Var.f58984f.invalidate();
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
        switch (this.f45894a) {
            case 2:
                if (this.f45895b) {
                    ((de0) this.f45896c).W.setVisibility(0);
                    return;
                }
                return;
            case 3:
                if (this.f45895b) {
                    ((PasscodeActivity) this.f45896c).f43266w.setVisibility(0);
                    return;
                }
                return;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                return;
            case 6:
                mw0 mw0Var = (mw0) this.f45896c;
                ProfileActivity profileActivity = mw0Var.f50133n;
                org.telegram.ui.ActionBar.g5 g5Var = profileActivity.U0;
                if (g5Var != null && !this.f45895b) {
                    g5Var.setClickable(true);
                }
                profileActivity.F5(true);
                mw0Var.setVisibility(0);
                profileActivity.P5(false);
                return;
            case 7:
                px0 px0Var = (px0) this.f45896c;
                if (this.f45895b) {
                    px0Var.f51169f.setAlpha(0.0f);
                    px0Var.f51169f.setVisibility(0);
                    return;
                }
                px0Var.f51167c.setAlpha(0.0f);
                px0Var.f51167c.setVisibility(0);
                return;
        }
    }
}
