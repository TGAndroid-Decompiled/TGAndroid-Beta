package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class i50 extends AnimatorListenerAdapter {
    public final int f36724a;
    public final boolean f36725b;
    public final Object f36726c;

    public i50(int i10, Object obj, boolean z10) {
        this.f36724a = i10;
        this.f36726c = obj;
        this.f36725b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36724a) {
            case 1:
                ((p70) this.f36726c).h = null;
                return;
            case 4:
                fr0 fr0Var = (fr0) this.f36726c;
                if (animator.equals(fr0Var.f35925k0)) {
                    fr0Var.f35925k0 = null;
                    return;
                }
                return;
            case 10:
                ((o91) this.f36726c).f38582r = null;
                return;
            case 12:
                oh1 oh1Var = (oh1) this.f36726c;
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
        switch (this.f36724a) {
            case 0:
                n60 n60Var = (n60) this.f36726c;
                n60Var.U2 = null;
                org.telegram.ui.ActionBar.h5 subtitleTextView = n60Var.O.getSubtitleTextView();
                if (this.f36725b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
            case 1:
                p70 p70Var = (p70) this.f36726c;
                if (p70Var.h != null && (pdVar = p70Var.f38827f) != null) {
                    if (this.f36725b) {
                        pdVar.setVisibility(4);
                    } else {
                        p70Var.f38828n.setVisibility(4);
                    }
                    p70Var.h = null;
                    return;
                }
                return;
            case 2:
                ah0 ah0Var = (ah0) this.f36726c;
                if (!this.f36725b) {
                    ah0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = ah0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ah0Var.L = null;
                    return;
                }
                return;
            case 3:
                if (!this.f36725b) {
                    ((PasscodeActivity) this.f36726c).v.setVisibility(8);
                    return;
                }
                return;
            case 4:
                fr0 fr0Var = (fr0) this.f36726c;
                if (animator.equals(fr0Var.f35925k0)) {
                    if (!this.f36725b) {
                        fr0Var.Z.setVisibility(4);
                        fr0Var.f35912a0.setVisibility(4);
                    }
                    fr0Var.f35925k0 = null;
                    return;
                }
                return;
            case 5:
                rw0 rw0Var = (rw0) this.f36726c;
                if (this.f36725b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                rw0Var.E = f7;
                return;
            case 6:
                h11 h11Var = (h11) this.f36726c;
                if (h11Var.h) {
                    org.telegram.ui.ActionBar.u0 u0Var = h11Var.f36368n.U0;
                    if (u0Var != null) {
                        u0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = h11Var.f36368n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = h11Var.f36368n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = h11Var.f36368n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    h11Var.setVisibility(8);
                }
                h11Var.f36368n.l5(false);
                return;
            case 7:
                n21 n21Var = (n21) this.f36726c;
                if (this.f36725b) {
                    n21Var.f38123c.setVisibility(8);
                    return;
                } else {
                    n21Var.f38124f.setVisibility(8);
                    return;
                }
            case 8:
                r51 r51Var = (r51) this.f36726c;
                if (this.f36725b) {
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
                n71 n71Var = (n71) this.f36726c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = n71Var.v;
                if (this.f36725b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                n71Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.es.f24466g.getInterpolation(n71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(n71Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                n71Var.N = null;
                return;
            case 10:
                o91 o91Var = (o91) this.f36726c;
                if (o91Var.f38582r != null && (z3Var = o91Var.f38583s) != null) {
                    if (!this.f36725b) {
                        z3Var.setVisibility(4);
                    }
                    o91Var.f38582r = null;
                    return;
                }
                return;
            case 11:
                re1 re1Var = (re1) this.f36726c;
                if (this.f36725b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                re1Var.f39501y = f12;
                return;
            case 12:
                oh1 oh1Var = (oh1) this.f36726c;
                AnimatorSet animatorSet2 = oh1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f36725b) {
                        oh1Var.e.setVisibility(4);
                        return;
                    } else {
                        oh1Var.f38658b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 13:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.f36726c;
                gi.o oVar = v1Var.V;
                if (!v1Var.T) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                if (this.f36725b) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                v1Var.U = f13;
                oVar.setAlpha(f13);
                v1Var.invalidate();
                if (v1Var.T) {
                    oVar.requestFocus();
                    AndroidUtilities.showKeyboard(oVar);
                    return;
                }
                oVar.clearFocus();
                AndroidUtilities.hideKeyboard(oVar);
                return;
            case 14:
                m0 m0Var = (m0) this.f36726c;
                gi.o oVar2 = m0Var.f41204b0;
                if (!m0Var.W) {
                    oVar2.setVisibility(8);
                }
                if (this.f36725b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                m0Var.f41202a0 = f14;
                oVar2.setAlpha(f14);
                m0Var.j(m0Var.f41202a0);
                m0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * m0Var.f41202a0);
                m0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * m0Var.f41202a0);
                m0Var.invalidate();
                return;
            case 15:
                rg.a2 a2Var = (rg.a2) this.f36726c;
                ((qg.n) a2Var).f43233y.f43354n.d();
                if (this.f36725b) {
                    a2Var.f43956w.accept(Integer.valueOf(a2Var.f43955s));
                }
                if (a2Var.getParent() != null) {
                    ((ViewGroup) a2Var.getParent()).removeView(a2Var);
                    return;
                }
                return;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f36726c;
                if (this.f36725b) {
                    limitPreviewView.f22934j0 = false;
                }
                Runnable runnable = limitPreviewView.f22935k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f22935k0.run();
                    return;
                }
                return;
            default:
                sg.q0 q0Var = (sg.q0) this.f36726c;
                if (this.f36725b) {
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
        switch (this.f36724a) {
            case 2:
                if (this.f36725b) {
                    ((ah0) this.f36726c).V.setVisibility(0);
                    return;
                }
                return;
            case 3:
                if (this.f36725b) {
                    ((PasscodeActivity) this.f36726c).v.setVisibility(0);
                    return;
                }
                return;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                return;
            case 6:
                h11 h11Var = (h11) this.f36726c;
                org.telegram.ui.ActionBar.u0 u0Var = h11Var.f36368n.U0;
                if (u0Var != null && !this.f36725b) {
                    u0Var.setClickable(true);
                }
                ProfileActivity profileActivity = h11Var.f36368n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = h11Var.f36368n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = h11Var.f36368n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                h11Var.setVisibility(0);
                h11Var.f36368n.l5(false);
                return;
            case 7:
                n21 n21Var = (n21) this.f36726c;
                if (this.f36725b) {
                    n21Var.f38124f.setAlpha(0.0f);
                    n21Var.f38124f.setVisibility(0);
                    return;
                }
                n21Var.f38123c.setAlpha(0.0f);
                n21Var.f38123c.setVisibility(0);
                return;
        }
    }
}
