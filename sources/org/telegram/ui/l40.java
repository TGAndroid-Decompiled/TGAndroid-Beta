package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class l40 extends AnimatorListenerAdapter {
    public final int f38788a;
    public final boolean f38789b;
    public final Object f38790c;

    public l40(int i10, Object obj, boolean z10) {
        this.f38788a = i10;
        this.f38790c = obj;
        this.f38789b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38788a) {
            case 1:
                ((s60) this.f38790c).h = null;
                return;
            case 4:
                jq0 jq0Var = (jq0) this.f38790c;
                if (animator.equals(jq0Var.f38318k0)) {
                    jq0Var.f38318k0 = null;
                    return;
                }
                return;
            case 10:
                ((x71) this.f38790c).f43131r = null;
                return;
            case 12:
                vf1 vf1Var = (vf1) this.f38790c;
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
        switch (this.f38788a) {
            case 0:
                q50 q50Var = (q50) this.f38790c;
                q50Var.U2 = null;
                org.telegram.ui.ActionBar.j5 subtitleTextView = q50Var.O.getSubtitleTextView();
                if (this.f38789b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
            case 1:
                s60 s60Var = (s60) this.f38790c;
                if (s60Var.h != null && (jdVar = s60Var.f41380f) != null) {
                    if (this.f38789b) {
                        jdVar.setVisibility(4);
                    } else {
                        s60Var.f41381n.setVisibility(4);
                    }
                    s60Var.h = null;
                    return;
                }
                return;
            case 2:
                dg0 dg0Var = (dg0) this.f38790c;
                if (!this.f38789b) {
                    dg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = dg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    dg0Var.L = null;
                    return;
                }
                return;
            case 3:
                if (!this.f38789b) {
                    ((PasscodeActivity) this.f38790c).v.setVisibility(8);
                    return;
                }
                return;
            case 4:
                jq0 jq0Var = (jq0) this.f38790c;
                if (animator.equals(jq0Var.f38318k0)) {
                    if (!this.f38789b) {
                        jq0Var.Z.setVisibility(4);
                        jq0Var.f38305a0.setVisibility(4);
                    }
                    jq0Var.f38318k0 = null;
                    return;
                }
                return;
            case 5:
                qv0 qv0Var = (qv0) this.f38790c;
                if (this.f38789b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                qv0Var.E = f7;
                return;
            case 6:
                e01 e01Var = (e01) this.f38790c;
                if (e01Var.h) {
                    org.telegram.ui.ActionBar.u0 u0Var = e01Var.f36488n.V0;
                    if (u0Var != null) {
                        u0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = e01Var.f36488n;
                    if (profileActivity.O0) {
                        profileActivity.T0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = e01Var.f36488n;
                    if (profileActivity2.M0) {
                        profileActivity2.R0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = e01Var.f36488n;
                    if (profileActivity3.N0) {
                        profileActivity3.S0.setVisibility(8);
                    }
                } else {
                    e01Var.setVisibility(8);
                }
                e01Var.f36488n.l5(false);
                return;
            case 7:
                k11 k11Var = (k11) this.f38790c;
                if (this.f38789b) {
                    k11Var.f38393c.setVisibility(8);
                    return;
                } else {
                    k11Var.f38394f.setVisibility(8);
                    return;
                }
            case 8:
                x31 x31Var = (x31) this.f38790c;
                if (this.f38789b) {
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
                t51 t51Var = (t51) this.f38790c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = t51Var.v;
                if (this.f38789b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                t51Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.bs.f25025g.getInterpolation(t51Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(t51Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                t51Var.N = null;
                return;
            case 10:
                x71 x71Var = (x71) this.f38790c;
                if (x71Var.f43131r != null && (y3Var = x71Var.f43132s) != null) {
                    if (!this.f38789b) {
                        y3Var.setVisibility(4);
                    }
                    x71Var.f43131r = null;
                    return;
                }
                return;
            case 11:
                yc1 yc1Var = (yc1) this.f38790c;
                if (this.f38789b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                yc1Var.f43465y = f12;
                return;
            case 12:
                vf1 vf1Var = (vf1) this.f38790c;
                AnimatorSet animatorSet2 = vf1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f38789b) {
                        vf1Var.e.setVisibility(4);
                        return;
                    } else {
                        vf1Var.f42235b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 13:
                org.telegram.ui.web.t1 t1Var = (org.telegram.ui.web.t1) this.f38790c;
                ai.t tVar = t1Var.V;
                if (!t1Var.T) {
                    tVar.setVisibility(8);
                    tVar.setText("");
                }
                if (this.f38789b) {
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
                n0 n0Var = (n0) this.f38790c;
                ai.t tVar2 = n0Var.f42791b0;
                if (!n0Var.W) {
                    tVar2.setVisibility(8);
                }
                if (this.f38789b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                n0Var.f42789a0 = f14;
                tVar2.setAlpha(f14);
                n0Var.j(n0Var.f42789a0);
                n0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * n0Var.f42789a0);
                n0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * n0Var.f42789a0);
                n0Var.invalidate();
                return;
            case 15:
                rg.z1 z1Var = (rg.z1) this.f38790c;
                ((qg.o) z1Var).f44591y.f44712n.d();
                if (this.f38789b) {
                    z1Var.f45735w.accept(Integer.valueOf(z1Var.f45734s));
                }
                if (z1Var.getParent() != null) {
                    ((ViewGroup) z1Var.getParent()).removeView(z1Var);
                    return;
                }
                return;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f38790c;
                if (this.f38789b) {
                    limitPreviewView.f24296j0 = false;
                }
                Runnable runnable = limitPreviewView.f24297k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f24297k0.run();
                    return;
                }
                return;
            default:
                sg.q0 q0Var = (sg.q0) this.f38790c;
                if (this.f38789b) {
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
        switch (this.f38788a) {
            case 2:
                if (this.f38789b) {
                    ((dg0) this.f38790c).V.setVisibility(0);
                    return;
                }
                return;
            case 3:
                if (this.f38789b) {
                    ((PasscodeActivity) this.f38790c).v.setVisibility(0);
                    return;
                }
                return;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                return;
            case 6:
                e01 e01Var = (e01) this.f38790c;
                org.telegram.ui.ActionBar.u0 u0Var = e01Var.f36488n.V0;
                if (u0Var != null && !this.f38789b) {
                    u0Var.setClickable(true);
                }
                ProfileActivity profileActivity = e01Var.f36488n;
                if (profileActivity.O0) {
                    profileActivity.T0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = e01Var.f36488n;
                if (profileActivity2.M0) {
                    profileActivity2.R0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = e01Var.f36488n;
                if (profileActivity3.N0) {
                    profileActivity3.S0.setVisibility(0);
                }
                e01Var.setVisibility(0);
                e01Var.f36488n.l5(false);
                return;
            case 7:
                k11 k11Var = (k11) this.f38790c;
                if (this.f38789b) {
                    k11Var.f38394f.setAlpha(0.0f);
                    k11Var.f38394f.setVisibility(0);
                    return;
                }
                k11Var.f38393c.setAlpha(0.0f);
                k11Var.f38393c.setVisibility(0);
                return;
        }
    }
}
