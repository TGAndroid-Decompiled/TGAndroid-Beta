package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class h70 extends AnimatorListenerAdapter {
    public final int f38271a;
    public final boolean f38272b;
    public final Object f38273c;

    public h70(int i10, Object obj, boolean z10) {
        this.f38271a = i10;
        this.f38273c = obj;
        this.f38272b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38271a) {
            case 0:
                ((l70) this.f38273c).h = null;
                return;
            case 3:
                dr0 dr0Var = (dr0) this.f38273c;
                if (animator.equals(dr0Var.f36881k0)) {
                    dr0Var.f36881k0 = null;
                    return;
                }
                return;
            case 9:
                ((k91) this.f38273c).f39421r = null;
                return;
            case 11:
                kh1 kh1Var = (kh1) this.f38273c;
                AnimatorSet animatorSet = kh1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kh1Var.I = null;
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
        nd ndVar;
        float f7;
        float f10;
        float f11;
        org.telegram.ui.Cells.z3 z3Var;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        switch (this.f38271a) {
            case 0:
                l70 l70Var = (l70) this.f38273c;
                if (l70Var.h != null && (ndVar = l70Var.f39654f) != null) {
                    if (this.f38272b) {
                        ndVar.setVisibility(4);
                    } else {
                        l70Var.f39655n.setVisibility(4);
                    }
                    l70Var.h = null;
                    return;
                }
                return;
            case 1:
                xg0 xg0Var = (xg0) this.f38273c;
                if (!this.f38272b) {
                    xg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = xg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    xg0Var.L = null;
                    return;
                }
                return;
            case 2:
                if (!this.f38272b) {
                    ((PasscodeActivity) this.f38273c).v.setVisibility(8);
                    return;
                }
                return;
            case 3:
                dr0 dr0Var = (dr0) this.f38273c;
                if (animator.equals(dr0Var.f36881k0)) {
                    if (!this.f38272b) {
                        dr0Var.Z.setVisibility(4);
                        dr0Var.f36867a0.setVisibility(4);
                    }
                    dr0Var.f36881k0 = null;
                    return;
                }
                return;
            case 4:
                ow0 ow0Var = (ow0) this.f38273c;
                if (this.f38272b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ow0Var.E = f7;
                return;
            case 5:
                d11 d11Var = (d11) this.f38273c;
                if (d11Var.h) {
                    org.telegram.ui.ActionBar.u0 u0Var = d11Var.f36608n.U0;
                    if (u0Var != null) {
                        u0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = d11Var.f36608n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = d11Var.f36608n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = d11Var.f36608n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    d11Var.setVisibility(8);
                }
                d11Var.f36608n.l5(false);
                return;
            case 6:
                i21 i21Var = (i21) this.f38273c;
                if (this.f38272b) {
                    i21Var.f38602c.setVisibility(8);
                    return;
                } else {
                    i21Var.f38604f.setVisibility(8);
                    return;
                }
            case 7:
                n51 n51Var = (n51) this.f38273c;
                if (this.f38272b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                n51Var.v = f10;
                if (n51Var.S) {
                    n51Var.N.invalidate();
                    return;
                }
                return;
            case 8:
                j71 j71Var = (j71) this.f38273c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = j71Var.v;
                if (this.f38272b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                j71Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.js.f27628g.getInterpolation(j71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(j71Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                j71Var.N = null;
                return;
            case 9:
                k91 k91Var = (k91) this.f38273c;
                if (k91Var.f39421r != null && (z3Var = k91Var.f39422s) != null) {
                    if (!this.f38272b) {
                        z3Var.setVisibility(4);
                    }
                    k91Var.f39421r = null;
                    return;
                }
                return;
            case 10:
                oe1 oe1Var = (oe1) this.f38273c;
                if (this.f38272b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                oe1Var.f40699y = f12;
                return;
            case 11:
                kh1 kh1Var = (kh1) this.f38273c;
                AnimatorSet animatorSet2 = kh1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f38272b) {
                        kh1Var.f39504e.setVisibility(4);
                        return;
                    } else {
                        kh1Var.f39499b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.f38273c;
                fi.o oVar = u1Var.V;
                if (!u1Var.T) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                if (this.f38272b) {
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
                l0 l0Var = (l0) this.f38273c;
                fi.o oVar2 = l0Var.f43417b0;
                if (!l0Var.W) {
                    oVar2.setVisibility(8);
                }
                if (this.f38272b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                l0Var.f43415a0 = f14;
                oVar2.setAlpha(f14);
                l0Var.j(l0Var.f43415a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.f43415a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.f43415a0);
                l0Var.invalidate();
                return;
            case 14:
                qg.z1 z1Var = (qg.z1) this.f38273c;
                ((pg.n) z1Var).f45587y.f45724n.d();
                if (this.f38272b) {
                    z1Var.f46589w.accept(Integer.valueOf(z1Var.f46588s));
                }
                if (z1Var.getParent() != null) {
                    ((ViewGroup) z1Var.getParent()).removeView(z1Var);
                    return;
                }
                return;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f38273c;
                if (this.f38272b) {
                    limitPreviewView.f24026j0 = false;
                }
                Runnable runnable = limitPreviewView.f24027k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f24027k0.run();
                    return;
                }
                return;
            case 16:
                rg.q0 q0Var = (rg.q0) this.f38273c;
                if (this.f38272b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                q0Var.M = f15;
                q0Var.d.invalidate();
                rg.o0 o0Var = q0Var.f47612e;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
            default:
                zg.a0 a0Var = (zg.a0) this.f38273c;
                org.telegram.ui.Components.nl0 nl0Var = a0Var.f54684n;
                a0Var.k();
                a0Var.l();
                boolean z10 = this.f38272b;
                zg.a0.a(a0Var, z10);
                a0Var.f54683m.invalidateOutline();
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                a0Var.f54680j = f16;
                boolean z11 = true;
                if (z10) {
                    a0Var.f54681k = true;
                    a0Var.f54673a.invalidate();
                }
                nl0Var.setCustomEmojiEnterProgress(Utilities.clamp(a0Var.f54680j, 1.0f, 0.0f));
                if (!z10) {
                    nl0Var.setImportantForAccessibility(0);
                    nl0Var.setSkipDraw(false);
                    a0Var.f();
                    Runtime.getRuntime().gc();
                    int i11 = a0Var.f54694y;
                    nl0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : false);
                }
                a0Var.C = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38271a) {
            case 1:
                if (this.f38272b) {
                    ((xg0) this.f38273c).V.setVisibility(0);
                    return;
                }
                return;
            case 2:
                if (this.f38272b) {
                    ((PasscodeActivity) this.f38273c).v.setVisibility(0);
                    return;
                }
                return;
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                return;
            case 5:
                d11 d11Var = (d11) this.f38273c;
                org.telegram.ui.ActionBar.u0 u0Var = d11Var.f36608n.U0;
                if (u0Var != null && !this.f38272b) {
                    u0Var.setClickable(true);
                }
                ProfileActivity profileActivity = d11Var.f36608n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = d11Var.f36608n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = d11Var.f36608n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                d11Var.setVisibility(0);
                d11Var.f36608n.l5(false);
                return;
            case 6:
                i21 i21Var = (i21) this.f38273c;
                if (this.f38272b) {
                    i21Var.f38604f.setAlpha(0.0f);
                    i21Var.f38604f.setVisibility(0);
                    return;
                }
                i21Var.f38602c.setAlpha(0.0f);
                i21Var.f38602c.setVisibility(0);
                return;
        }
    }
}
