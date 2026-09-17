package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class e50 extends AnimatorListenerAdapter {
    public final int f35959a;
    public final boolean f35960b;
    public final Object f35961c;

    public e50(int i10, Object obj, boolean z10) {
        this.f35959a = i10;
        this.f35961c = obj;
        this.f35960b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35959a) {
            case 1:
                ((l70) this.f35961c).h = null;
                return;
            case 4:
                br0 br0Var = (br0) this.f35961c;
                if (animator.equals(br0Var.f34924k0)) {
                    br0Var.f34924k0 = null;
                    return;
                }
                return;
            case 10:
                ((i91) this.f35961c).f37300r = null;
                return;
            case 12:
                hh1 hh1Var = (hh1) this.f35961c;
                AnimatorSet animatorSet = hh1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    hh1Var.I = null;
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
        switch (this.f35959a) {
            case 0:
                j60 j60Var = (j60) this.f35961c;
                j60Var.U2 = null;
                org.telegram.ui.ActionBar.j5 subtitleTextView = j60Var.O.getSubtitleTextView();
                if (this.f35960b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
            case 1:
                l70 l70Var = (l70) this.f35961c;
                if (l70Var.h != null && (jdVar = l70Var.f38239f) != null) {
                    if (this.f35960b) {
                        jdVar.setVisibility(4);
                    } else {
                        l70Var.f38240n.setVisibility(4);
                    }
                    l70Var.h = null;
                    return;
                }
                return;
            case 2:
                wg0 wg0Var = (wg0) this.f35961c;
                if (!this.f35960b) {
                    wg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = wg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    wg0Var.L = null;
                    return;
                }
                return;
            case 3:
                if (!this.f35960b) {
                    ((PasscodeActivity) this.f35961c).v.setVisibility(8);
                    return;
                }
                return;
            case 4:
                br0 br0Var = (br0) this.f35961c;
                if (animator.equals(br0Var.f34924k0)) {
                    if (!this.f35960b) {
                        br0Var.Z.setVisibility(4);
                        br0Var.f34910a0.setVisibility(4);
                    }
                    br0Var.f34924k0 = null;
                    return;
                }
                return;
            case 5:
                lw0 lw0Var = (lw0) this.f35961c;
                if (this.f35960b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                lw0Var.E = f7;
                return;
            case 6:
                d11 d11Var = (d11) this.f35961c;
                if (d11Var.h) {
                    org.telegram.ui.ActionBar.v0 v0Var = d11Var.f35639n.U0;
                    if (v0Var != null) {
                        v0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = d11Var.f35639n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = d11Var.f35639n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = d11Var.f35639n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    d11Var.setVisibility(8);
                }
                d11Var.f35639n.l5(false);
                return;
            case 7:
                i21 i21Var = (i21) this.f35961c;
                if (this.f35960b) {
                    i21Var.f37201c.setVisibility(8);
                    return;
                } else {
                    i21Var.f37203f.setVisibility(8);
                    return;
                }
            case 8:
                k51 k51Var = (k51) this.f35961c;
                if (this.f35960b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k51Var.v = f10;
                if (k51Var.S) {
                    k51Var.N.invalidate();
                    return;
                }
                return;
            case 9:
                f71 f71Var = (f71) this.f35961c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f71Var.v;
                if (this.f35960b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                f71Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.pr.f29495g.getInterpolation(f71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(f71Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                f71Var.N = null;
                return;
            case 10:
                i91 i91Var = (i91) this.f35961c;
                if (i91Var.f37300r != null && (y3Var = i91Var.f37301s) != null) {
                    if (!this.f35960b) {
                        y3Var.setVisibility(4);
                    }
                    i91Var.f37300r = null;
                    return;
                }
                return;
            case 11:
                le1 le1Var = (le1) this.f35961c;
                if (this.f35960b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                le1Var.f38358y = f12;
                return;
            case 12:
                hh1 hh1Var = (hh1) this.f35961c;
                AnimatorSet animatorSet2 = hh1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f35960b) {
                        hh1Var.f37037e.setVisibility(4);
                        return;
                    } else {
                        hh1Var.f37032b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 13:
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) this.f35961c;
                gi.o oVar = w1Var.V;
                if (!w1Var.T) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                if (this.f35960b) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                w1Var.U = f13;
                oVar.setAlpha(f13);
                w1Var.invalidate();
                if (w1Var.T) {
                    oVar.requestFocus();
                    AndroidUtilities.showKeyboard(oVar);
                    return;
                }
                oVar.clearFocus();
                AndroidUtilities.hideKeyboard(oVar);
                return;
            case 14:
                k0 k0Var = (k0) this.f35961c;
                gi.o oVar2 = k0Var.f42305b0;
                if (!k0Var.W) {
                    oVar2.setVisibility(8);
                }
                if (this.f35960b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                k0Var.f42303a0 = f14;
                oVar2.setAlpha(f14);
                k0Var.j(k0Var.f42303a0);
                k0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * k0Var.f42303a0);
                k0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * k0Var.f42303a0);
                k0Var.invalidate();
                return;
            case 15:
                rg.a2 a2Var = (rg.a2) this.f35961c;
                ((qg.n) a2Var).f44515y.f44649n.d();
                if (this.f35960b) {
                    a2Var.f45152w.accept(Integer.valueOf(a2Var.f45151s));
                }
                if (a2Var.getParent() != null) {
                    ((ViewGroup) a2Var.getParent()).removeView(a2Var);
                    return;
                }
                return;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f35961c;
                if (this.f35960b) {
                    limitPreviewView.f24087j0 = false;
                }
                Runnable runnable = limitPreviewView.f24088k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f24088k0.run();
                    return;
                }
                return;
            default:
                sg.r0 r0Var = (sg.r0) this.f35961c;
                if (this.f35960b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                r0Var.M = f15;
                r0Var.d.invalidate();
                sg.q0 q0Var = r0Var.f46267e;
                if (q0Var != null) {
                    q0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35959a) {
            case 2:
                if (this.f35960b) {
                    ((wg0) this.f35961c).V.setVisibility(0);
                    return;
                }
                return;
            case 3:
                if (this.f35960b) {
                    ((PasscodeActivity) this.f35961c).v.setVisibility(0);
                    return;
                }
                return;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                return;
            case 6:
                d11 d11Var = (d11) this.f35961c;
                org.telegram.ui.ActionBar.v0 v0Var = d11Var.f35639n.U0;
                if (v0Var != null && !this.f35960b) {
                    v0Var.setClickable(true);
                }
                ProfileActivity profileActivity = d11Var.f35639n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = d11Var.f35639n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = d11Var.f35639n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                d11Var.setVisibility(0);
                d11Var.f35639n.l5(false);
                return;
            case 7:
                i21 i21Var = (i21) this.f35961c;
                if (this.f35960b) {
                    i21Var.f37203f.setAlpha(0.0f);
                    i21Var.f37203f.setVisibility(0);
                    return;
                }
                i21Var.f37201c.setAlpha(0.0f);
                i21Var.f37201c.setVisibility(0);
                return;
        }
    }
}
