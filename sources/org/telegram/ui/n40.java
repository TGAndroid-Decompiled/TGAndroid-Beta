package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class n40 extends AnimatorListenerAdapter {
    public final int f39333a;
    public final boolean f39334b;
    public final Object f39335c;

    public n40(int i10, Object obj, boolean z10) {
        this.f39333a = i10;
        this.f39335c = obj;
        this.f39334b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39333a) {
            case 1:
                ((u60) this.f39335c).h = null;
                return;
            case 4:
                lq0 lq0Var = (lq0) this.f39335c;
                if (animator.equals(lq0Var.f38925k0)) {
                    lq0Var.f38925k0 = null;
                    return;
                }
                return;
            case 10:
                ((z71) this.f39335c).f43683r = null;
                return;
            case 12:
                xf1 xf1Var = (xf1) this.f39335c;
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
        switch (this.f39333a) {
            case 0:
                s50 s50Var = (s50) this.f39335c;
                s50Var.U2 = null;
                org.telegram.ui.ActionBar.j5 subtitleTextView = s50Var.O.getSubtitleTextView();
                if (this.f39334b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
            case 1:
                u60 u60Var = (u60) this.f39335c;
                if (u60Var.h != null && (ldVar = u60Var.f41908f) != null) {
                    if (this.f39334b) {
                        ldVar.setVisibility(4);
                    } else {
                        u60Var.f41909n.setVisibility(4);
                    }
                    u60Var.h = null;
                    return;
                }
                return;
            case 2:
                fg0 fg0Var = (fg0) this.f39335c;
                if (!this.f39334b) {
                    fg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = fg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fg0Var.L = null;
                    return;
                }
                return;
            case 3:
                if (!this.f39334b) {
                    ((PasscodeActivity) this.f39335c).v.setVisibility(8);
                    return;
                }
                return;
            case 4:
                lq0 lq0Var = (lq0) this.f39335c;
                if (animator.equals(lq0Var.f38925k0)) {
                    if (!this.f39334b) {
                        lq0Var.Z.setVisibility(4);
                        lq0Var.f38912a0.setVisibility(4);
                    }
                    lq0Var.f38925k0 = null;
                    return;
                }
                return;
            case 5:
                sv0 sv0Var = (sv0) this.f39335c;
                if (this.f39334b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                sv0Var.E = f7;
                return;
            case 6:
                g01 g01Var = (g01) this.f39335c;
                if (g01Var.h) {
                    org.telegram.ui.ActionBar.u0 u0Var = g01Var.f37048n.V0;
                    if (u0Var != null) {
                        u0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = g01Var.f37048n;
                    if (profileActivity.O0) {
                        profileActivity.T0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = g01Var.f37048n;
                    if (profileActivity2.M0) {
                        profileActivity2.R0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = g01Var.f37048n;
                    if (profileActivity3.N0) {
                        profileActivity3.S0.setVisibility(8);
                    }
                } else {
                    g01Var.setVisibility(8);
                }
                g01Var.f37048n.l5(false);
                return;
            case 7:
                m11 m11Var = (m11) this.f39335c;
                if (this.f39334b) {
                    m11Var.f39011c.setVisibility(8);
                    return;
                } else {
                    m11Var.f39012f.setVisibility(8);
                    return;
                }
            case 8:
                z31 z31Var = (z31) this.f39335c;
                if (this.f39334b) {
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
                v51 v51Var = (v51) this.f39335c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = v51Var.v;
                if (this.f39334b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                v51Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.bs.f25038g.getInterpolation(v51Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(v51Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                v51Var.N = null;
                return;
            case 10:
                z71 z71Var = (z71) this.f39335c;
                if (z71Var.f43683r != null && (y3Var = z71Var.f43684s) != null) {
                    if (!this.f39334b) {
                        y3Var.setVisibility(4);
                    }
                    z71Var.f43683r = null;
                    return;
                }
                return;
            case 11:
                ad1 ad1Var = (ad1) this.f39335c;
                if (this.f39334b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ad1Var.f35430y = f12;
                return;
            case 12:
                xf1 xf1Var = (xf1) this.f39335c;
                AnimatorSet animatorSet2 = xf1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f39334b) {
                        xf1Var.e.setVisibility(4);
                        return;
                    } else {
                        xf1Var.f43134b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 13:
                org.telegram.ui.web.t1 t1Var = (org.telegram.ui.web.t1) this.f39335c;
                ai.t tVar = t1Var.V;
                if (!t1Var.T) {
                    tVar.setVisibility(8);
                    tVar.setText("");
                }
                if (this.f39334b) {
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
                n0 n0Var = (n0) this.f39335c;
                ai.t tVar2 = n0Var.f42765b0;
                if (!n0Var.W) {
                    tVar2.setVisibility(8);
                }
                if (this.f39334b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                n0Var.f42763a0 = f14;
                tVar2.setAlpha(f14);
                n0Var.j(n0Var.f42763a0);
                n0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * n0Var.f42763a0);
                n0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * n0Var.f42763a0);
                n0Var.invalidate();
                return;
            case 15:
                rg.y1 y1Var = (rg.y1) this.f39335c;
                ((qg.o) y1Var).f44627y.f44751n.d();
                if (this.f39334b) {
                    y1Var.f45766w.accept(Integer.valueOf(y1Var.f45765s));
                }
                if (y1Var.getParent() != null) {
                    ((ViewGroup) y1Var.getParent()).removeView(y1Var);
                    return;
                }
                return;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f39335c;
                if (this.f39334b) {
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
                sg.p0 p0Var = (sg.p0) this.f39335c;
                if (this.f39334b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                p0Var.M = f15;
                p0Var.d.invalidate();
                sg.o0 o0Var = p0Var.e;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39333a) {
            case 2:
                if (this.f39334b) {
                    ((fg0) this.f39335c).V.setVisibility(0);
                    return;
                }
                return;
            case 3:
                if (this.f39334b) {
                    ((PasscodeActivity) this.f39335c).v.setVisibility(0);
                    return;
                }
                return;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                return;
            case 6:
                g01 g01Var = (g01) this.f39335c;
                org.telegram.ui.ActionBar.u0 u0Var = g01Var.f37048n.V0;
                if (u0Var != null && !this.f39334b) {
                    u0Var.setClickable(true);
                }
                ProfileActivity profileActivity = g01Var.f37048n;
                if (profileActivity.O0) {
                    profileActivity.T0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = g01Var.f37048n;
                if (profileActivity2.M0) {
                    profileActivity2.R0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = g01Var.f37048n;
                if (profileActivity3.N0) {
                    profileActivity3.S0.setVisibility(0);
                }
                g01Var.setVisibility(0);
                g01Var.f37048n.l5(false);
                return;
            case 7:
                m11 m11Var = (m11) this.f39335c;
                if (this.f39334b) {
                    m11Var.f39012f.setAlpha(0.0f);
                    m11Var.f39012f.setVisibility(0);
                    return;
                }
                m11Var.f39011c.setAlpha(0.0f);
                m11Var.f39011c.setVisibility(0);
                return;
        }
    }
}
