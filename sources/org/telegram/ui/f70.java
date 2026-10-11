package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class f70 extends AnimatorListenerAdapter {
    public final int f37561a;
    public final boolean f37562b;
    public final Object f37563c;

    public f70(int i10, Object obj, boolean z10) {
        this.f37561a = i10;
        this.f37563c = obj;
        this.f37562b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37561a) {
            case 0:
                ((j70) this.f37563c).h = null;
                return;
            case 3:
                ar0 ar0Var = (ar0) this.f37563c;
                if (animator.equals(ar0Var.f36148k0)) {
                    ar0Var.f36148k0 = null;
                    return;
                }
                return;
            case 9:
                ((h91) this.f37563c).f38357r = null;
                return;
            case 11:
                hh1 hh1Var = (hh1) this.f37563c;
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
        id idVar;
        float f7;
        float f10;
        float f11;
        org.telegram.ui.Cells.z3 z3Var;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        switch (this.f37561a) {
            case 0:
                j70 j70Var = (j70) this.f37563c;
                if (j70Var.h != null && (idVar = j70Var.f38866f) != null) {
                    if (this.f37562b) {
                        idVar.setVisibility(4);
                    } else {
                        j70Var.f38867n.setVisibility(4);
                    }
                    j70Var.h = null;
                    return;
                }
                return;
            case 1:
                vg0 vg0Var = (vg0) this.f37563c;
                if (!this.f37562b) {
                    vg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = vg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    vg0Var.L = null;
                    return;
                }
                return;
            case 2:
                if (!this.f37562b) {
                    ((PasscodeActivity) this.f37563c).v.setVisibility(8);
                    return;
                }
                return;
            case 3:
                ar0 ar0Var = (ar0) this.f37563c;
                if (animator.equals(ar0Var.f36148k0)) {
                    if (!this.f37562b) {
                        ar0Var.Z.setVisibility(4);
                        ar0Var.f36134a0.setVisibility(4);
                    }
                    ar0Var.f36148k0 = null;
                    return;
                }
                return;
            case 4:
                lw0 lw0Var = (lw0) this.f37563c;
                if (this.f37562b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                lw0Var.E = f7;
                return;
            case 5:
                a11 a11Var = (a11) this.f37563c;
                if (a11Var.h) {
                    org.telegram.ui.ActionBar.u0 u0Var = a11Var.f35840n.U0;
                    if (u0Var != null) {
                        u0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = a11Var.f35840n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = a11Var.f35840n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = a11Var.f35840n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    a11Var.setVisibility(8);
                }
                a11Var.f35840n.l5(false);
                return;
            case 6:
                e21 e21Var = (e21) this.f37563c;
                if (this.f37562b) {
                    e21Var.f37187c.setVisibility(8);
                    return;
                } else {
                    e21Var.f37189f.setVisibility(8);
                    return;
                }
            case 7:
                j51 j51Var = (j51) this.f37563c;
                if (this.f37562b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                j51Var.v = f10;
                if (j51Var.S) {
                    j51Var.N.invalidate();
                    return;
                }
                return;
            case 8:
                f71 f71Var = (f71) this.f37563c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f71Var.v;
                if (this.f37562b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                f71Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.is.f27452g.getInterpolation(f71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(f71Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                f71Var.N = null;
                return;
            case 9:
                h91 h91Var = (h91) this.f37563c;
                if (h91Var.f38357r != null && (z3Var = h91Var.f38358s) != null) {
                    if (!this.f37562b) {
                        z3Var.setVisibility(4);
                    }
                    h91Var.f38357r = null;
                    return;
                }
                return;
            case 10:
                le1 le1Var = (le1) this.f37563c;
                if (this.f37562b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                le1Var.f39647y = f12;
                return;
            case 11:
                hh1 hh1Var = (hh1) this.f37563c;
                AnimatorSet animatorSet2 = hh1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f37562b) {
                        hh1Var.f38420e.setVisibility(4);
                        return;
                    } else {
                        hh1Var.f38415b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.f37563c;
                fi.o oVar = u1Var.V;
                if (!u1Var.T) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                if (this.f37562b) {
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
            case 13:
                k0 k0Var = (k0) this.f37563c;
                fi.o oVar2 = k0Var.f43667b0;
                if (!k0Var.W) {
                    oVar2.setVisibility(8);
                }
                if (this.f37562b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                k0Var.f43665a0 = f14;
                oVar2.setAlpha(f14);
                k0Var.j(k0Var.f43665a0);
                k0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * k0Var.f43665a0);
                k0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * k0Var.f43665a0);
                k0Var.invalidate();
                return;
            case 14:
                qg.y1 y1Var = (qg.y1) this.f37563c;
                ((pg.n) y1Var).f45738y.f45871n.d();
                if (this.f37562b) {
                    y1Var.f46724w.accept(Integer.valueOf(y1Var.f46723s));
                }
                if (y1Var.getParent() != null) {
                    ((ViewGroup) y1Var.getParent()).removeView(y1Var);
                    return;
                }
                return;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f37563c;
                if (this.f37562b) {
                    limitPreviewView.f24241j0 = false;
                }
                Runnable runnable = limitPreviewView.f24242k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f24242k0.run();
                    return;
                }
                return;
            case 16:
                rg.p0 p0Var = (rg.p0) this.f37563c;
                if (this.f37562b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                p0Var.M = f15;
                p0Var.d.invalidate();
                rg.o0 o0Var = p0Var.f47472e;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
            default:
                zg.a0 a0Var = (zg.a0) this.f37563c;
                org.telegram.ui.Components.ml0 ml0Var = a0Var.f54547n;
                a0Var.k();
                a0Var.l();
                boolean z10 = this.f37562b;
                zg.a0.a(a0Var, z10);
                a0Var.f54546m.invalidateOutline();
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                a0Var.f54543j = f16;
                boolean z11 = true;
                if (z10) {
                    a0Var.f54544k = true;
                    a0Var.f54536a.invalidate();
                }
                ml0Var.setCustomEmojiEnterProgress(Utilities.clamp(a0Var.f54543j, 1.0f, 0.0f));
                if (!z10) {
                    ml0Var.setImportantForAccessibility(0);
                    ml0Var.setSkipDraw(false);
                    a0Var.f();
                    Runtime.getRuntime().gc();
                    int i11 = a0Var.f54557y;
                    ml0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : false);
                }
                a0Var.C = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37561a) {
            case 1:
                if (this.f37562b) {
                    ((vg0) this.f37563c).V.setVisibility(0);
                    return;
                }
                return;
            case 2:
                if (this.f37562b) {
                    ((PasscodeActivity) this.f37563c).v.setVisibility(0);
                    return;
                }
                return;
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                return;
            case 5:
                a11 a11Var = (a11) this.f37563c;
                org.telegram.ui.ActionBar.u0 u0Var = a11Var.f35840n.U0;
                if (u0Var != null && !this.f37562b) {
                    u0Var.setClickable(true);
                }
                ProfileActivity profileActivity = a11Var.f35840n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = a11Var.f35840n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = a11Var.f35840n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                a11Var.setVisibility(0);
                a11Var.f35840n.l5(false);
                return;
            case 6:
                e21 e21Var = (e21) this.f37563c;
                if (this.f37562b) {
                    e21Var.f37189f.setAlpha(0.0f);
                    e21Var.f37189f.setVisibility(0);
                    return;
                }
                e21Var.f37187c.setAlpha(0.0f);
                e21Var.f37187c.setVisibility(0);
                return;
        }
    }
}
