package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class n40 extends AnimatorListenerAdapter {
    public final int f39292a;
    public final boolean f39293b;
    public final Object f39294c;

    public n40(int i10, Object obj, boolean z10) {
        this.f39292a = i10;
        this.f39294c = obj;
        this.f39293b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39292a) {
            case 1:
                ((u60) this.f39294c).h = null;
                return;
            case 4:
                lq0 lq0Var = (lq0) this.f39294c;
                if (animator.equals(lq0Var.f38881k0)) {
                    lq0Var.f38881k0 = null;
                    return;
                }
                return;
            case 10:
                ((z71) this.f39294c).f43648r = null;
                return;
            case 12:
                xf1 xf1Var = (xf1) this.f39294c;
                AnimatorSet animatorSet = xf1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    xf1Var.I = null;
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
        ld ldVar;
        float f7;
        float f10;
        float f11;
        org.telegram.ui.Cells.y3 y3Var;
        float f12;
        float f13;
        float f14;
        float f15;
        switch (this.f39292a) {
            case 0:
                s50 s50Var = (s50) this.f39294c;
                s50Var.U2 = null;
                org.telegram.ui.ActionBar.j5 subtitleTextView = s50Var.O.getSubtitleTextView();
                if (this.f39293b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
            case 1:
                u60 u60Var = (u60) this.f39294c;
                if (u60Var.h != null && (ldVar = u60Var.f41867f) != null) {
                    if (this.f39293b) {
                        ldVar.setVisibility(4);
                    } else {
                        u60Var.f41868n.setVisibility(4);
                    }
                    u60Var.h = null;
                    return;
                }
                return;
            case 2:
                eg0 eg0Var = (eg0) this.f39294c;
                if (!this.f39293b) {
                    eg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = eg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    eg0Var.L = null;
                    return;
                }
                return;
            case 3:
                if (!this.f39293b) {
                    ((PasscodeActivity) this.f39294c).v.setVisibility(8);
                    return;
                }
                return;
            case 4:
                lq0 lq0Var = (lq0) this.f39294c;
                if (animator.equals(lq0Var.f38881k0)) {
                    if (!this.f39293b) {
                        lq0Var.Z.setVisibility(4);
                        lq0Var.f38868a0.setVisibility(4);
                    }
                    lq0Var.f38881k0 = null;
                    return;
                }
                return;
            case 5:
                sv0 sv0Var = (sv0) this.f39294c;
                if (this.f39293b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                sv0Var.E = f7;
                return;
            case 6:
                g01 g01Var = (g01) this.f39294c;
                if (g01Var.h) {
                    org.telegram.ui.ActionBar.u0 u0Var = g01Var.f37013n.V0;
                    if (u0Var != null) {
                        u0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = g01Var.f37013n;
                    if (profileActivity.O0) {
                        profileActivity.T0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = g01Var.f37013n;
                    if (profileActivity2.M0) {
                        profileActivity2.R0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = g01Var.f37013n;
                    if (profileActivity3.N0) {
                        profileActivity3.S0.setVisibility(8);
                    }
                } else {
                    g01Var.setVisibility(8);
                }
                g01Var.f37013n.l5(false);
                return;
            case 7:
                m11 m11Var = (m11) this.f39294c;
                if (this.f39293b) {
                    m11Var.f38967c.setVisibility(8);
                    return;
                } else {
                    m11Var.f38968f.setVisibility(8);
                    return;
                }
            case 8:
                z31 z31Var = (z31) this.f39294c;
                if (this.f39293b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                z31Var.v = f10;
                if (z31Var.S) {
                    z31Var.N.invalidate();
                    return;
                }
                return;
            case 9:
                v51 v51Var = (v51) this.f39294c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = v51Var.v;
                if (this.f39293b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                v51Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.bs.f25031g.getInterpolation(v51Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(v51Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                v51Var.N = null;
                return;
            case 10:
                z71 z71Var = (z71) this.f39294c;
                if (z71Var.f43648r != null && (y3Var = z71Var.f43649s) != null) {
                    if (!this.f39293b) {
                        y3Var.setVisibility(4);
                    }
                    z71Var.f43648r = null;
                    return;
                }
                return;
            case 11:
                ad1 ad1Var = (ad1) this.f39294c;
                if (this.f39293b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ad1Var.f35382y = f12;
                return;
            case 12:
                xf1 xf1Var = (xf1) this.f39294c;
                AnimatorSet animatorSet2 = xf1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f39293b) {
                        xf1Var.e.setVisibility(4);
                        return;
                    } else {
                        xf1Var.f43098b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 13:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.f39294c;
                ai.t tVar = u1Var.V;
                if (!u1Var.T) {
                    tVar.setVisibility(8);
                    tVar.setText("");
                }
                if (this.f39293b) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                u1Var.U = f13;
                tVar.setAlpha(f13);
                u1Var.invalidate();
                if (u1Var.T) {
                    tVar.requestFocus();
                    AndroidUtilities.showKeyboard(tVar);
                    return;
                }
                tVar.clearFocus();
                AndroidUtilities.hideKeyboard(tVar);
                return;
            case 14:
                n0 n0Var = (n0) this.f39294c;
                ai.t tVar2 = n0Var.f42749b0;
                if (!n0Var.W) {
                    tVar2.setVisibility(8);
                }
                if (this.f39293b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                n0Var.f42747a0 = f14;
                tVar2.setAlpha(f14);
                n0Var.j(n0Var.f42747a0);
                n0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * n0Var.f42747a0);
                n0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * n0Var.f42747a0);
                n0Var.invalidate();
                return;
            case 15:
                rg.y1 y1Var = (rg.y1) this.f39294c;
                ((qg.n) y1Var).f44576y.f44697n.d();
                if (this.f39293b) {
                    y1Var.f45718w.accept(Integer.valueOf(y1Var.f45717s));
                }
                if (y1Var.getParent() != null) {
                    ((ViewGroup) y1Var.getParent()).removeView(y1Var);
                    return;
                }
                return;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f39294c;
                if (this.f39293b) {
                    limitPreviewView.f24289j0 = false;
                }
                Runnable runnable = limitPreviewView.f24290k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f24290k0.run();
                    return;
                }
                return;
            default:
                sg.q0 q0Var = (sg.q0) this.f39294c;
                if (this.f39293b) {
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
        switch (this.f39292a) {
            case 2:
                if (this.f39293b) {
                    ((eg0) this.f39294c).V.setVisibility(0);
                    return;
                }
                return;
            case 3:
                if (this.f39293b) {
                    ((PasscodeActivity) this.f39294c).v.setVisibility(0);
                    return;
                }
                return;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                return;
            case 6:
                g01 g01Var = (g01) this.f39294c;
                org.telegram.ui.ActionBar.u0 u0Var = g01Var.f37013n.V0;
                if (u0Var != null && !this.f39293b) {
                    u0Var.setClickable(true);
                }
                ProfileActivity profileActivity = g01Var.f37013n;
                if (profileActivity.O0) {
                    profileActivity.T0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = g01Var.f37013n;
                if (profileActivity2.M0) {
                    profileActivity2.R0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = g01Var.f37013n;
                if (profileActivity3.N0) {
                    profileActivity3.S0.setVisibility(0);
                }
                g01Var.setVisibility(0);
                g01Var.f37013n.l5(false);
                return;
            case 7:
                m11 m11Var = (m11) this.f39294c;
                if (this.f39293b) {
                    m11Var.f38968f.setAlpha(0.0f);
                    m11Var.f38968f.setVisibility(0);
                    return;
                }
                m11Var.f38967c.setAlpha(0.0f);
                m11Var.f38967c.setVisibility(0);
                return;
        }
    }
}
