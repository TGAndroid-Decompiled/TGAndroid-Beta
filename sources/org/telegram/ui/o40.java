package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class o40 extends AnimatorListenerAdapter {
    public final int f40073a;
    public final boolean f40074b;
    public final Object f40075c;

    public o40(int i10, Object obj, boolean z10) {
        this.f40073a = i10;
        this.f40075c = obj;
        this.f40074b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40073a) {
            case 1:
                ((w60) this.f40075c).h = null;
                return;
            case 4:
                lq0 lq0Var = (lq0) this.f40075c;
                if (animator.equals(lq0Var.f39347k0)) {
                    lq0Var.f39347k0 = null;
                    return;
                }
                return;
            case 10:
                ((b81) this.f40075c).f35961r = null;
                return;
            case 12:
                ag1 ag1Var = (ag1) this.f40075c;
                AnimatorSet animatorSet = ag1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ag1Var.I = null;
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
        switch (this.f40073a) {
            case 0:
                u50 u50Var = (u50) this.f40075c;
                u50Var.U2 = null;
                org.telegram.ui.ActionBar.n5 subtitleTextView = u50Var.O.getSubtitleTextView();
                if (this.f40074b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
            case 1:
                w60 w60Var = (w60) this.f40075c;
                if (w60Var.h != null && (jdVar = w60Var.f42919f) != null) {
                    if (this.f40074b) {
                        jdVar.setVisibility(4);
                    } else {
                        w60Var.f42920n.setVisibility(4);
                    }
                    w60Var.h = null;
                    return;
                }
                return;
            case 2:
                hg0 hg0Var = (hg0) this.f40075c;
                if (!this.f40074b) {
                    hg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = hg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    hg0Var.L = null;
                    return;
                }
                return;
            case 3:
                if (!this.f40074b) {
                    ((PasscodeActivity) this.f40075c).v.setVisibility(8);
                    return;
                }
                return;
            case 4:
                lq0 lq0Var = (lq0) this.f40075c;
                if (animator.equals(lq0Var.f39347k0)) {
                    if (!this.f40074b) {
                        lq0Var.Z.setVisibility(4);
                        lq0Var.f39334a0.setVisibility(4);
                    }
                    lq0Var.f39347k0 = null;
                    return;
                }
                return;
            case 5:
                tv0 tv0Var = (tv0) this.f40075c;
                if (this.f40074b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                tv0Var.E = f7;
                return;
            case 6:
                h01 h01Var = (h01) this.f40075c;
                if (h01Var.h) {
                    org.telegram.ui.ActionBar.u0 u0Var = h01Var.f37712n.V0;
                    if (u0Var != null) {
                        u0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = h01Var.f37712n;
                    if (profileActivity.O0) {
                        profileActivity.T0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = h01Var.f37712n;
                    if (profileActivity2.M0) {
                        profileActivity2.R0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = h01Var.f37712n;
                    if (profileActivity3.N0) {
                        profileActivity3.S0.setVisibility(8);
                    }
                } else {
                    h01Var.setVisibility(8);
                }
                h01Var.f37712n.p5(false);
                return;
            case 7:
                n11 n11Var = (n11) this.f40075c;
                if (this.f40074b) {
                    n11Var.f39692c.setVisibility(8);
                    return;
                } else {
                    n11Var.f39693f.setVisibility(8);
                    return;
                }
            case 8:
                a41 a41Var = (a41) this.f40075c;
                if (this.f40074b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                a41Var.v = f10;
                if (a41Var.S) {
                    a41Var.N.invalidate();
                    return;
                }
                return;
            case 9:
                w51 w51Var = (w51) this.f40075c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w51Var.v;
                if (this.f40074b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                w51Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.zr.f33338g.getInterpolation(w51Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(w51Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                w51Var.N = null;
                return;
            case 10:
                b81 b81Var = (b81) this.f40075c;
                if (b81Var.f35961r != null && (y3Var = b81Var.f35962s) != null) {
                    if (!this.f40074b) {
                        y3Var.setVisibility(4);
                    }
                    b81Var.f35961r = null;
                    return;
                }
                return;
            case 11:
                dd1 dd1Var = (dd1) this.f40075c;
                if (this.f40074b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                dd1Var.f36602y = f12;
                return;
            case 12:
                ag1 ag1Var = (ag1) this.f40075c;
                AnimatorSet animatorSet2 = ag1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f40074b) {
                        ag1Var.e.setVisibility(4);
                        return;
                    } else {
                        ag1Var.f35760b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 13:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.f40075c;
                ai.t tVar = u1Var.V;
                if (!u1Var.T) {
                    tVar.setVisibility(8);
                    tVar.setText("");
                }
                if (this.f40074b) {
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
                m0 m0Var = (m0) this.f40075c;
                ai.t tVar2 = m0Var.f43260b0;
                if (!m0Var.W) {
                    tVar2.setVisibility(8);
                }
                if (this.f40074b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                m0Var.f43258a0 = f14;
                tVar2.setAlpha(f14);
                m0Var.j(m0Var.f43258a0);
                m0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * m0Var.f43258a0);
                m0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * m0Var.f43258a0);
                m0Var.invalidate();
                return;
            case 15:
                rg.a2 a2Var = (rg.a2) this.f40075c;
                ((qg.n) a2Var).f44998y.f45129n.d();
                if (this.f40074b) {
                    a2Var.f45708w.accept(Integer.valueOf(a2Var.f45707s));
                }
                if (a2Var.getParent() != null) {
                    ((ViewGroup) a2Var.getParent()).removeView(a2Var);
                    return;
                }
                return;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f40075c;
                if (this.f40074b) {
                    limitPreviewView.f24438j0 = false;
                }
                Runnable runnable = limitPreviewView.f24439k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f24439k0.run();
                    return;
                }
                return;
            default:
                sg.p0 p0Var = (sg.p0) this.f40075c;
                if (this.f40074b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                p0Var.O = f15;
                p0Var.f46802f.invalidate();
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
        switch (this.f40073a) {
            case 2:
                if (this.f40074b) {
                    ((hg0) this.f40075c).V.setVisibility(0);
                    return;
                }
                return;
            case 3:
                if (this.f40074b) {
                    ((PasscodeActivity) this.f40075c).v.setVisibility(0);
                    return;
                }
                return;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                return;
            case 6:
                h01 h01Var = (h01) this.f40075c;
                org.telegram.ui.ActionBar.u0 u0Var = h01Var.f37712n.V0;
                if (u0Var != null && !this.f40074b) {
                    u0Var.setClickable(true);
                }
                ProfileActivity profileActivity = h01Var.f37712n;
                if (profileActivity.O0) {
                    profileActivity.T0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = h01Var.f37712n;
                if (profileActivity2.M0) {
                    profileActivity2.R0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = h01Var.f37712n;
                if (profileActivity3.N0) {
                    profileActivity3.S0.setVisibility(0);
                }
                h01Var.setVisibility(0);
                h01Var.f37712n.p5(false);
                return;
            case 7:
                n11 n11Var = (n11) this.f40075c;
                if (this.f40074b) {
                    n11Var.f39693f.setAlpha(0.0f);
                    n11Var.f39693f.setVisibility(0);
                    return;
                }
                n11Var.f39692c.setAlpha(0.0f);
                n11Var.f39692c.setVisibility(0);
                return;
        }
    }
}
