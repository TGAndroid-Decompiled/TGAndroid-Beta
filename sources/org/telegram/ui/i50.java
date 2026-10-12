package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class i50 extends AnimatorListenerAdapter {
    public final int f37036a;
    public final boolean f37037b;
    public final Object f37038c;

    public i50(int i10, Object obj, boolean z10) {
        this.f37036a = i10;
        this.f37038c = obj;
        this.f37037b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37036a) {
            case 1:
                ((p70) this.f37038c).h = null;
                return;
            case 4:
                hr0 hr0Var = (hr0) this.f37038c;
                if (animator.equals(hr0Var.f36927k0)) {
                    hr0Var.f36927k0 = null;
                    return;
                }
                return;
            case 10:
                ((o91) this.f37038c).f38900r = null;
                return;
            case 12:
                oh1 oh1Var = (oh1) this.f37038c;
                AnimatorSet animatorSet = oh1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    oh1Var.I = null;
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
        pd pdVar;
        float f7;
        float f10;
        float f11;
        org.telegram.ui.Cells.z3 z3Var;
        float f12;
        float f13;
        float f14;
        float f15;
        switch (this.f37036a) {
            case 0:
                n60 n60Var = (n60) this.f37038c;
                n60Var.U2 = null;
                org.telegram.ui.ActionBar.h5 subtitleTextView = n60Var.O.getSubtitleTextView();
                if (this.f37037b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
            case 1:
                p70 p70Var = (p70) this.f37038c;
                if (p70Var.h != null && (pdVar = p70Var.f39133f) != null) {
                    if (this.f37037b) {
                        pdVar.setVisibility(4);
                    } else {
                        p70Var.f39134n.setVisibility(4);
                    }
                    p70Var.h = null;
                    return;
                }
                return;
            case 2:
                bh0 bh0Var = (bh0) this.f37038c;
                if (!this.f37037b) {
                    bh0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = bh0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    bh0Var.L = null;
                    return;
                }
                return;
            case 3:
                if (!this.f37037b) {
                    ((PasscodeActivity) this.f37038c).v.setVisibility(8);
                    return;
                }
                return;
            case 4:
                hr0 hr0Var = (hr0) this.f37038c;
                if (animator.equals(hr0Var.f36927k0)) {
                    if (!this.f37037b) {
                        hr0Var.Z.setVisibility(4);
                        hr0Var.f36914a0.setVisibility(4);
                    }
                    hr0Var.f36927k0 = null;
                    return;
                }
                return;
            case 5:
                sw0 sw0Var = (sw0) this.f37038c;
                if (this.f37037b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                sw0Var.E = f7;
                return;
            case 6:
                i11 i11Var = (i11) this.f37038c;
                if (i11Var.h) {
                    org.telegram.ui.ActionBar.u0 u0Var = i11Var.f37009n.U0;
                    if (u0Var != null) {
                        u0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = i11Var.f37009n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = i11Var.f37009n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = i11Var.f37009n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    i11Var.setVisibility(8);
                }
                i11Var.f37009n.l5(false);
                return;
            case 7:
                n21 n21Var = (n21) this.f37038c;
                if (this.f37037b) {
                    n21Var.f38408c.setVisibility(8);
                    return;
                } else {
                    n21Var.f38409f.setVisibility(8);
                    return;
                }
            case 8:
                r51 r51Var = (r51) this.f37038c;
                if (this.f37037b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                r51Var.v = f10;
                if (r51Var.S) {
                    r51Var.N.invalidate();
                    return;
                }
                return;
            case 9:
                n71 n71Var = (n71) this.f37038c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = n71Var.v;
                if (this.f37037b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                n71Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.es.f24772g.getInterpolation(n71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(n71Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                n71Var.N = null;
                return;
            case 10:
                o91 o91Var = (o91) this.f37038c;
                if (o91Var.f38900r != null && (z3Var = o91Var.f38901s) != null) {
                    if (!this.f37037b) {
                        z3Var.setVisibility(4);
                    }
                    o91Var.f38900r = null;
                    return;
                }
                return;
            case 11:
                se1 se1Var = (se1) this.f37038c;
                if (this.f37037b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                se1Var.f40122y = f12;
                return;
            case 12:
                oh1 oh1Var = (oh1) this.f37038c;
                AnimatorSet animatorSet2 = oh1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f37037b) {
                        oh1Var.e.setVisibility(4);
                        return;
                    } else {
                        oh1Var.f38962b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 13:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.f37038c;
                gi.o oVar = u1Var.V;
                if (!u1Var.T) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                if (this.f37037b) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                u1Var.U = f13;
                oVar.setAlpha(f13);
                u1Var.invalidate();
                if (u1Var.T) {
                    oVar.requestFocus();
                    AndroidUtilities.showKeyboard(oVar);
                    return;
                }
                oVar.clearFocus();
                AndroidUtilities.hideKeyboard(oVar);
                return;
            case 14:
                m0 m0Var = (m0) this.f37038c;
                gi.o oVar2 = m0Var.f41503b0;
                if (!m0Var.W) {
                    oVar2.setVisibility(8);
                }
                if (this.f37037b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                m0Var.f41501a0 = f14;
                oVar2.setAlpha(f14);
                m0Var.j(m0Var.f41501a0);
                m0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * m0Var.f41501a0);
                m0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * m0Var.f41501a0);
                m0Var.invalidate();
                return;
            case 15:
                rg.a2 a2Var = (rg.a2) this.f37038c;
                ((qg.n) a2Var).f43491y.f43612n.d();
                if (this.f37037b) {
                    a2Var.f44197w.accept(Integer.valueOf(a2Var.f44196s));
                }
                if (a2Var.getParent() != null) {
                    ((ViewGroup) a2Var.getParent()).removeView(a2Var);
                    return;
                }
                return;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f37038c;
                if (this.f37037b) {
                    limitPreviewView.f23234j0 = false;
                }
                Runnable runnable = limitPreviewView.f23235k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f23235k0.run();
                    return;
                }
                return;
            default:
                sg.q0 q0Var = (sg.q0) this.f37038c;
                if (this.f37037b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                q0Var.M = f15;
                q0Var.d.invalidate();
                sg.o0 o0Var = q0Var.e;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37036a) {
            case 2:
                if (this.f37037b) {
                    ((bh0) this.f37038c).V.setVisibility(0);
                    return;
                }
                return;
            case 3:
                if (this.f37037b) {
                    ((PasscodeActivity) this.f37038c).v.setVisibility(0);
                    return;
                }
                return;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                return;
            case 6:
                i11 i11Var = (i11) this.f37038c;
                org.telegram.ui.ActionBar.u0 u0Var = i11Var.f37009n.U0;
                if (u0Var != null && !this.f37037b) {
                    u0Var.setClickable(true);
                }
                ProfileActivity profileActivity = i11Var.f37009n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = i11Var.f37009n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = i11Var.f37009n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                i11Var.setVisibility(0);
                i11Var.f37009n.l5(false);
                return;
            case 7:
                n21 n21Var = (n21) this.f37038c;
                if (this.f37037b) {
                    n21Var.f38409f.setAlpha(0.0f);
                    n21Var.f38409f.setVisibility(0);
                    return;
                }
                n21Var.f38408c.setAlpha(0.0f);
                n21Var.f38408c.setVisibility(0);
                return;
        }
    }
}
