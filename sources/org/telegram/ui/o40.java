package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class o40 extends AnimatorListenerAdapter {
    public final int f40061a;
    public final boolean f40062b;
    public final Object f40063c;

    public o40(int i10, Object obj, boolean z10) {
        this.f40061a = i10;
        this.f40063c = obj;
        this.f40062b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40061a) {
            case 1:
                ((w60) this.f40063c).h = null;
                return;
            case 4:
                mq0 mq0Var = (mq0) this.f40063c;
                if (animator.equals(mq0Var.f39657k0)) {
                    mq0Var.f39657k0 = null;
                    return;
                }
                return;
            case 10:
                ((c81) this.f40063c).f36299r = null;
                return;
            case 12:
                bg1 bg1Var = (bg1) this.f40063c;
                AnimatorSet animatorSet = bg1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    bg1Var.I = null;
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
        switch (this.f40061a) {
            case 0:
                u50 u50Var = (u50) this.f40063c;
                u50Var.U2 = null;
                org.telegram.ui.ActionBar.n5 subtitleTextView = u50Var.O.getSubtitleTextView();
                if (this.f40062b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
            case 1:
                w60 w60Var = (w60) this.f40063c;
                if (w60Var.h != null && (jdVar = w60Var.f42938f) != null) {
                    if (this.f40062b) {
                        jdVar.setVisibility(4);
                    } else {
                        w60Var.f42939n.setVisibility(4);
                    }
                    w60Var.h = null;
                    return;
                }
                return;
            case 2:
                ig0 ig0Var = (ig0) this.f40063c;
                if (!this.f40062b) {
                    ig0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = ig0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ig0Var.L = null;
                    return;
                }
                return;
            case 3:
                if (!this.f40062b) {
                    ((PasscodeActivity) this.f40063c).v.setVisibility(8);
                    return;
                }
                return;
            case 4:
                mq0 mq0Var = (mq0) this.f40063c;
                if (animator.equals(mq0Var.f39657k0)) {
                    if (!this.f40062b) {
                        mq0Var.Z.setVisibility(4);
                        mq0Var.f39644a0.setVisibility(4);
                    }
                    mq0Var.f39657k0 = null;
                    return;
                }
                return;
            case 5:
                uv0 uv0Var = (uv0) this.f40063c;
                if (this.f40062b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                uv0Var.E = f7;
                return;
            case 6:
                i01 i01Var = (i01) this.f40063c;
                if (i01Var.h) {
                    org.telegram.ui.ActionBar.u0 u0Var = i01Var.f38007n.V0;
                    if (u0Var != null) {
                        u0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = i01Var.f38007n;
                    if (profileActivity.O0) {
                        profileActivity.T0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = i01Var.f38007n;
                    if (profileActivity2.M0) {
                        profileActivity2.R0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = i01Var.f38007n;
                    if (profileActivity3.N0) {
                        profileActivity3.S0.setVisibility(8);
                    }
                } else {
                    i01Var.setVisibility(8);
                }
                i01Var.f38007n.p5(false);
                return;
            case 7:
                o11 o11Var = (o11) this.f40063c;
                if (this.f40062b) {
                    o11Var.f40045c.setVisibility(8);
                    return;
                } else {
                    o11Var.f40046f.setVisibility(8);
                    return;
                }
            case 8:
                b41 b41Var = (b41) this.f40063c;
                if (this.f40062b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                b41Var.v = f10;
                if (b41Var.S) {
                    b41Var.N.invalidate();
                    return;
                }
                return;
            case 9:
                x51 x51Var = (x51) this.f40063c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = x51Var.v;
                if (this.f40062b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                x51Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.bs.f25134g.getInterpolation(x51Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(x51Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                x51Var.N = null;
                return;
            case 10:
                c81 c81Var = (c81) this.f40063c;
                if (c81Var.f36299r != null && (y3Var = c81Var.f36300s) != null) {
                    if (!this.f40062b) {
                        y3Var.setVisibility(4);
                    }
                    c81Var.f36299r = null;
                    return;
                }
                return;
            case 11:
                ed1 ed1Var = (ed1) this.f40063c;
                if (this.f40062b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ed1Var.f36940y = f12;
                return;
            case 12:
                bg1 bg1Var = (bg1) this.f40063c;
                AnimatorSet animatorSet2 = bg1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f40062b) {
                        bg1Var.e.setVisibility(4);
                        return;
                    } else {
                        bg1Var.f36082b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 13:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.f40063c;
                ai.t tVar = u1Var.V;
                if (!u1Var.T) {
                    tVar.setVisibility(8);
                    tVar.setText("");
                }
                if (this.f40062b) {
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
                m0 m0Var = (m0) this.f40063c;
                ai.t tVar2 = m0Var.f43271b0;
                if (!m0Var.W) {
                    tVar2.setVisibility(8);
                }
                if (this.f40062b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                m0Var.f43269a0 = f14;
                tVar2.setAlpha(f14);
                m0Var.j(m0Var.f43269a0);
                m0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * m0Var.f43269a0);
                m0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * m0Var.f43269a0);
                m0Var.invalidate();
                return;
            case 15:
                rg.a2 a2Var = (rg.a2) this.f40063c;
                ((qg.n) a2Var).f44999y.f45130n.d();
                if (this.f40062b) {
                    a2Var.f45709w.accept(Integer.valueOf(a2Var.f45708s));
                }
                if (a2Var.getParent() != null) {
                    ((ViewGroup) a2Var.getParent()).removeView(a2Var);
                    return;
                }
                return;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f40063c;
                if (this.f40062b) {
                    limitPreviewView.f24437j0 = false;
                }
                Runnable runnable = limitPreviewView.f24438k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f24438k0.run();
                    return;
                }
                return;
            default:
                sg.p0 p0Var = (sg.p0) this.f40063c;
                if (this.f40062b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                p0Var.O = f15;
                p0Var.f46803f.invalidate();
                sg.o0 o0Var = p0Var.h;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40061a) {
            case 2:
                if (this.f40062b) {
                    ((ig0) this.f40063c).V.setVisibility(0);
                    return;
                }
                return;
            case 3:
                if (this.f40062b) {
                    ((PasscodeActivity) this.f40063c).v.setVisibility(0);
                    return;
                }
                return;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                return;
            case 6:
                i01 i01Var = (i01) this.f40063c;
                org.telegram.ui.ActionBar.u0 u0Var = i01Var.f38007n.V0;
                if (u0Var != null && !this.f40062b) {
                    u0Var.setClickable(true);
                }
                ProfileActivity profileActivity = i01Var.f38007n;
                if (profileActivity.O0) {
                    profileActivity.T0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = i01Var.f38007n;
                if (profileActivity2.M0) {
                    profileActivity2.R0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = i01Var.f38007n;
                if (profileActivity3.N0) {
                    profileActivity3.S0.setVisibility(0);
                }
                i01Var.setVisibility(0);
                i01Var.f38007n.p5(false);
                return;
            case 7:
                o11 o11Var = (o11) this.f40063c;
                if (this.f40062b) {
                    o11Var.f40046f.setAlpha(0.0f);
                    o11Var.f40046f.setVisibility(0);
                    return;
                }
                o11Var.f40045c.setAlpha(0.0f);
                o11Var.f40045c.setVisibility(0);
                return;
        }
    }
}
