package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class n60 extends AnimatorListenerAdapter {
    public final int f40601a;
    public final boolean f40602b;
    public final Object f40603c;

    public n60(int i9, Object obj, boolean z10) {
        this.f40601a = i9;
        this.f40603c = obj;
        this.f40602b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40601a) {
            case 0:
                ((r60) this.f40603c).h = null;
                return;
            case 3:
                zp0 zp0Var = (zp0) this.f40603c;
                if (animator.equals(zp0Var.f45217g0)) {
                    zp0Var.f45217g0 = null;
                    return;
                }
                return;
            case 9:
                ((z71) this.f40603c).f45066r = null;
                return;
            case 11:
                ag1 ag1Var = (ag1) this.f40603c;
                AnimatorSet animatorSet = ag1Var.E;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ag1Var.E = null;
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
        fd fdVar;
        float f10;
        float f11;
        float f12;
        org.telegram.ui.Cells.z3 z3Var;
        float f13;
        float f14;
        float f15;
        float f16;
        switch (this.f40601a) {
            case 0:
                r60 r60Var = (r60) this.f40603c;
                if (r60Var.h != null && (fdVar = r60Var.f42281f) != null) {
                    if (this.f40602b) {
                        fdVar.setVisibility(4);
                    } else {
                        r60Var.f42282n.setVisibility(4);
                    }
                    r60Var.h = null;
                    return;
                }
                return;
            case 1:
                fg0 fg0Var = (fg0) this.f40603c;
                if (!this.f40602b) {
                    fg0Var.R.setVisibility(4);
                }
                AnimatorSet animatorSet = fg0Var.H;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fg0Var.H = null;
                    return;
                }
                return;
            case 2:
                if (!this.f40602b) {
                    ((PasscodeActivity) this.f40603c).v.setVisibility(8);
                    return;
                }
                return;
            case 3:
                zp0 zp0Var = (zp0) this.f40603c;
                if (animator.equals(zp0Var.f45217g0)) {
                    if (!this.f40602b) {
                        zp0Var.V.setVisibility(4);
                        zp0Var.W.setVisibility(4);
                    }
                    zp0Var.f45217g0 = null;
                    return;
                }
                return;
            case 4:
                iv0 iv0Var = (iv0) this.f40603c;
                if (this.f40602b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                iv0Var.A = f10;
                return;
            case 5:
                yz0 yz0Var = (yz0) this.f40603c;
                if (yz0Var.h) {
                    org.telegram.ui.ActionBar.w0 w0Var = yz0Var.f44986n.Q0;
                    if (w0Var != null) {
                        w0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = yz0Var.f44986n;
                    if (profileActivity.J0) {
                        profileActivity.O0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = yz0Var.f44986n;
                    if (profileActivity2.H0) {
                        profileActivity2.M0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = yz0Var.f44986n;
                    if (profileActivity3.I0) {
                        profileActivity3.N0.setVisibility(8);
                    }
                } else {
                    yz0Var.setVisibility(8);
                }
                yz0Var.f44986n.l5(false);
                return;
            case 6:
                c11 c11Var = (c11) this.f40603c;
                if (this.f40602b) {
                    c11Var.f37039c.setVisibility(8);
                    return;
                } else {
                    c11Var.f37041f.setVisibility(8);
                    return;
                }
            case 7:
                d41 d41Var = (d41) this.f40603c;
                if (this.f40602b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                d41Var.v = f11;
                if (d41Var.O) {
                    d41Var.J.invalidate();
                    return;
                }
                return;
            case 8:
                x51 x51Var = (x51) this.f40603c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = x51Var.v;
                if (this.f40602b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                x51Var.H = f12;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f12);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.gr.f28845g.getInterpolation(x51Var.H));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i9 = 0; i9 < itemsCount; i9++) {
                    float cascade = AndroidUtilities.cascade(x51Var.H, i9, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i9).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i9).setAlpha(cascade);
                }
                x51Var.J = null;
                return;
            case 9:
                z71 z71Var = (z71) this.f40603c;
                if (z71Var.f45066r != null && (z3Var = z71Var.f45067s) != null) {
                    if (!this.f40602b) {
                        z3Var.setVisibility(4);
                    }
                    z71Var.f45066r = null;
                    return;
                }
                return;
            case 10:
                dd1 dd1Var = (dd1) this.f40603c;
                if (this.f40602b) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                dd1Var.f37514y = f13;
                return;
            case 11:
                ag1 ag1Var = (ag1) this.f40603c;
                AnimatorSet animatorSet2 = ag1Var.E;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f40602b) {
                        ag1Var.f36488e.setVisibility(4);
                        return;
                    } else {
                        ag1Var.f36483b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.q1 q1Var = (org.telegram.ui.web.q1) this.f40603c;
                gh.o oVar = q1Var.R;
                if (!q1Var.P) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                if (this.f40602b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                q1Var.Q = f14;
                oVar.setAlpha(f14);
                q1Var.invalidate();
                if (q1Var.P) {
                    oVar.requestFocus();
                    AndroidUtilities.showKeyboard(oVar);
                    return;
                }
                oVar.clearFocus();
                AndroidUtilities.hideKeyboard(oVar);
                return;
            case 13:
                n0 n0Var = (n0) this.f40603c;
                gh.o oVar2 = n0Var.U;
                if (!n0Var.S) {
                    oVar2.setVisibility(8);
                }
                if (this.f40602b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                n0Var.T = f15;
                oVar2.setAlpha(f15);
                n0Var.j(n0Var.T);
                n0Var.N.setTranslationX(AndroidUtilities.dp(56.0f) * n0Var.T);
                n0Var.K.setTranslationX(AndroidUtilities.dp(112.0f) * n0Var.T);
                n0Var.invalidate();
                return;
            case 14:
                if (this.f40602b) {
                    ((tf.n) this.f40603c).e(false, false, true, false);
                    return;
                }
                return;
            case 15:
                yf.y1 y1Var = (yf.y1) this.f40603c;
                ((xf.n) y1Var).f49277y.f49412n.d();
                if (this.f40602b) {
                    y1Var.f50193w.accept(Integer.valueOf(y1Var.f50192s));
                }
                if (y1Var.getParent() != null) {
                    ((ViewGroup) y1Var.getParent()).removeView(y1Var);
                    return;
                }
                return;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f40603c;
                if (this.f40602b) {
                    limitPreviewView.f26457f0 = false;
                }
                Runnable runnable = limitPreviewView.f26458g0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f26458g0.run();
                    return;
                }
                return;
            default:
                zf.p0 p0Var = (zf.p0) this.f40603c;
                if (this.f40602b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                p0Var.I = f16;
                p0Var.d.invalidate();
                zf.o0 o0Var = p0Var.f50648e;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40601a) {
            case 1:
                if (this.f40602b) {
                    ((fg0) this.f40603c).R.setVisibility(0);
                    return;
                }
                return;
            case 2:
                if (this.f40602b) {
                    ((PasscodeActivity) this.f40603c).v.setVisibility(0);
                    return;
                }
                return;
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                return;
            case 5:
                yz0 yz0Var = (yz0) this.f40603c;
                org.telegram.ui.ActionBar.w0 w0Var = yz0Var.f44986n.Q0;
                if (w0Var != null && !this.f40602b) {
                    w0Var.setClickable(true);
                }
                ProfileActivity profileActivity = yz0Var.f44986n;
                if (profileActivity.J0) {
                    profileActivity.O0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = yz0Var.f44986n;
                if (profileActivity2.H0) {
                    profileActivity2.M0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = yz0Var.f44986n;
                if (profileActivity3.I0) {
                    profileActivity3.N0.setVisibility(0);
                }
                yz0Var.setVisibility(0);
                yz0Var.f44986n.l5(false);
                return;
            case 6:
                c11 c11Var = (c11) this.f40603c;
                if (this.f40602b) {
                    c11Var.f37041f.setAlpha(0.0f);
                    c11Var.f37041f.setVisibility(0);
                    return;
                }
                c11Var.f37039c.setAlpha(0.0f);
                c11Var.f37039c.setVisibility(0);
                return;
        }
    }
}
