package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class l40 extends AnimatorListenerAdapter {
    public final int f38784a;
    public final boolean f38785b;
    public final Object f38786c;

    public l40(int i10, Object obj, boolean z10) {
        this.f38784a = i10;
        this.f38786c = obj;
        this.f38785b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38784a) {
            case 1:
                ((s60) this.f38786c).h = null;
                return;
            case 4:
                jq0 jq0Var = (jq0) this.f38786c;
                if (animator.equals(jq0Var.f38314k0)) {
                    jq0Var.f38314k0 = null;
                    return;
                }
                return;
            case 10:
                ((x71) this.f38786c).f43128r = null;
                return;
            case 12:
                vf1 vf1Var = (vf1) this.f38786c;
                AnimatorSet animatorSet = vf1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    vf1Var.I = null;
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
        float dp;
        jd jdVar;
        float f7;
        float f10;
        float f11;
        org.telegram.ui.Cells.y3 y3Var;
        float f12;
        float f13;
        float f14;
        float f15;
        switch (this.f38784a) {
            case 0:
                q50 q50Var = (q50) this.f38786c;
                q50Var.U2 = null;
                org.telegram.ui.ActionBar.j5 subtitleTextView = q50Var.O.getSubtitleTextView();
                if (this.f38785b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
            case 1:
                s60 s60Var = (s60) this.f38786c;
                if (s60Var.h != null && (jdVar = s60Var.f41377f) != null) {
                    if (this.f38785b) {
                        jdVar.setVisibility(4);
                    } else {
                        s60Var.f41378n.setVisibility(4);
                    }
                    s60Var.h = null;
                    return;
                }
                return;
            case 2:
                dg0 dg0Var = (dg0) this.f38786c;
                if (!this.f38785b) {
                    dg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = dg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    dg0Var.L = null;
                    return;
                }
                return;
            case 3:
                if (!this.f38785b) {
                    ((PasscodeActivity) this.f38786c).v.setVisibility(8);
                    return;
                }
                return;
            case 4:
                jq0 jq0Var = (jq0) this.f38786c;
                if (animator.equals(jq0Var.f38314k0)) {
                    if (!this.f38785b) {
                        jq0Var.Z.setVisibility(4);
                        jq0Var.f38301a0.setVisibility(4);
                    }
                    jq0Var.f38314k0 = null;
                    return;
                }
                return;
            case 5:
                qv0 qv0Var = (qv0) this.f38786c;
                if (this.f38785b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                qv0Var.E = f7;
                return;
            case 6:
                e01 e01Var = (e01) this.f38786c;
                if (e01Var.h) {
                    org.telegram.ui.ActionBar.u0 u0Var = e01Var.f36484n.V0;
                    if (u0Var != null) {
                        u0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = e01Var.f36484n;
                    if (profileActivity.O0) {
                        profileActivity.T0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = e01Var.f36484n;
                    if (profileActivity2.M0) {
                        profileActivity2.R0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = e01Var.f36484n;
                    if (profileActivity3.N0) {
                        profileActivity3.S0.setVisibility(8);
                    }
                } else {
                    e01Var.setVisibility(8);
                }
                e01Var.f36484n.l5(false);
                return;
            case 7:
                k11 k11Var = (k11) this.f38786c;
                if (this.f38785b) {
                    k11Var.f38389c.setVisibility(8);
                    return;
                } else {
                    k11Var.f38390f.setVisibility(8);
                    return;
                }
            case 8:
                x31 x31Var = (x31) this.f38786c;
                if (this.f38785b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                x31Var.v = f10;
                if (x31Var.S) {
                    x31Var.N.invalidate();
                    return;
                }
                return;
            case 9:
                t51 t51Var = (t51) this.f38786c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = t51Var.v;
                if (this.f38785b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                t51Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.bs.f25022g.getInterpolation(t51Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(t51Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                t51Var.N = null;
                return;
            case 10:
                x71 x71Var = (x71) this.f38786c;
                if (x71Var.f43128r != null && (y3Var = x71Var.f43129s) != null) {
                    if (!this.f38785b) {
                        y3Var.setVisibility(4);
                    }
                    x71Var.f43128r = null;
                    return;
                }
                return;
            case 11:
                yc1 yc1Var = (yc1) this.f38786c;
                if (this.f38785b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                yc1Var.f43462y = f12;
                return;
            case 12:
                vf1 vf1Var = (vf1) this.f38786c;
                AnimatorSet animatorSet2 = vf1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f38785b) {
                        vf1Var.e.setVisibility(4);
                        return;
                    } else {
                        vf1Var.f42232b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 13:
                org.telegram.ui.web.t1 t1Var = (org.telegram.ui.web.t1) this.f38786c;
                ai.t tVar = t1Var.V;
                if (!t1Var.T) {
                    tVar.setVisibility(8);
                    tVar.setText("");
                }
                if (this.f38785b) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                t1Var.U = f13;
                tVar.setAlpha(f13);
                t1Var.invalidate();
                if (t1Var.T) {
                    tVar.requestFocus();
                    AndroidUtilities.showKeyboard(tVar);
                    return;
                }
                tVar.clearFocus();
                AndroidUtilities.hideKeyboard(tVar);
                return;
            case 14:
                n0 n0Var = (n0) this.f38786c;
                ai.t tVar2 = n0Var.f42788b0;
                if (!n0Var.W) {
                    tVar2.setVisibility(8);
                }
                if (this.f38785b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                n0Var.f42786a0 = f14;
                tVar2.setAlpha(f14);
                n0Var.j(n0Var.f42786a0);
                n0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * n0Var.f42786a0);
                n0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * n0Var.f42786a0);
                n0Var.invalidate();
                return;
            case 15:
                rg.z1 z1Var = (rg.z1) this.f38786c;
                ((qg.o) z1Var).f44588y.f44709n.d();
                if (this.f38785b) {
                    z1Var.f45732w.accept(Integer.valueOf(z1Var.f45731s));
                }
                if (z1Var.getParent() != null) {
                    ((ViewGroup) z1Var.getParent()).removeView(z1Var);
                    return;
                }
                return;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f38786c;
                if (this.f38785b) {
                    limitPreviewView.f24293j0 = false;
                }
                Runnable runnable = limitPreviewView.f24294k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f24294k0.run();
                    return;
                }
                return;
            default:
                sg.q0 q0Var = (sg.q0) this.f38786c;
                if (this.f38785b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                q0Var.M = f15;
                q0Var.d.invalidate();
                sg.p0 p0Var = q0Var.e;
                if (p0Var != null) {
                    p0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38784a) {
            case 2:
                if (this.f38785b) {
                    ((dg0) this.f38786c).V.setVisibility(0);
                    return;
                }
                return;
            case 3:
                if (this.f38785b) {
                    ((PasscodeActivity) this.f38786c).v.setVisibility(0);
                    return;
                }
                return;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                return;
            case 6:
                e01 e01Var = (e01) this.f38786c;
                org.telegram.ui.ActionBar.u0 u0Var = e01Var.f36484n.V0;
                if (u0Var != null && !this.f38785b) {
                    u0Var.setClickable(true);
                }
                ProfileActivity profileActivity = e01Var.f36484n;
                if (profileActivity.O0) {
                    profileActivity.T0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = e01Var.f36484n;
                if (profileActivity2.M0) {
                    profileActivity2.R0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = e01Var.f36484n;
                if (profileActivity3.N0) {
                    profileActivity3.S0.setVisibility(0);
                }
                e01Var.setVisibility(0);
                e01Var.f36484n.l5(false);
                return;
            case 7:
                k11 k11Var = (k11) this.f38786c;
                if (this.f38785b) {
                    k11Var.f38390f.setAlpha(0.0f);
                    k11Var.f38390f.setVisibility(0);
                    return;
                }
                k11Var.f38389c.setAlpha(0.0f);
                k11Var.f38389c.setVisibility(0);
                return;
        }
    }
}
