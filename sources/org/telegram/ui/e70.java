package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class e70 extends AnimatorListenerAdapter {
    public final int f32833a;
    public final boolean f32834b;
    public final Object f32835c;

    public e70(int i10, Object obj, boolean z10) {
        this.f32833a = i10;
        this.f32835c = obj;
        this.f32834b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32833a) {
            case 0:
                ((i70) this.f32835c).h = null;
                return;
            case 3:
                uq0 uq0Var = (uq0) this.f32835c;
                if (animator.equals(uq0Var.f38181k0)) {
                    uq0Var.f38181k0 = null;
                    return;
                }
                return;
            case 9:
                ((x81) this.f32835c).f39213r = null;
                return;
            case 11:
                zg1 zg1Var = (zg1) this.f32835c;
                AnimatorSet animatorSet = zg1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    zg1Var.I = null;
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
        switch (this.f32833a) {
            case 0:
                i70 i70Var = (i70) this.f32835c;
                if (i70Var.h != null && (idVar = i70Var.f34046f) != null) {
                    if (this.f32834b) {
                        idVar.setVisibility(4);
                    } else {
                        i70Var.f34047n.setVisibility(4);
                    }
                    i70Var.h = null;
                    return;
                }
                return;
            case 1:
                rg0 rg0Var = (rg0) this.f32835c;
                if (!this.f32834b) {
                    rg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = rg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    rg0Var.L = null;
                    return;
                }
                return;
            case 2:
                if (!this.f32834b) {
                    ((PasscodeActivity) this.f32835c).v.setVisibility(8);
                    return;
                }
                return;
            case 3:
                uq0 uq0Var = (uq0) this.f32835c;
                if (animator.equals(uq0Var.f38181k0)) {
                    if (!this.f32834b) {
                        uq0Var.Z.setVisibility(4);
                        uq0Var.f38168a0.setVisibility(4);
                    }
                    uq0Var.f38181k0 = null;
                    return;
                }
                return;
            case 4:
                fw0 fw0Var = (fw0) this.f32835c;
                if (this.f32834b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                fw0Var.E = f7;
                return;
            case 5:
                v01 v01Var = (v01) this.f32835c;
                if (v01Var.h) {
                    org.telegram.ui.ActionBar.v0 v0Var = v01Var.f38259n.U0;
                    if (v0Var != null) {
                        v0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = v01Var.f38259n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = v01Var.f38259n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = v01Var.f38259n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    v01Var.setVisibility(8);
                }
                v01Var.f38259n.l5(false);
                return;
            case 6:
                z11 z11Var = (z11) this.f32835c;
                if (this.f32834b) {
                    z11Var.f39937c.setVisibility(8);
                    return;
                } else {
                    z11Var.f39938f.setVisibility(8);
                    return;
                }
            case 7:
                a51 a51Var = (a51) this.f32835c;
                if (this.f32834b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                a51Var.v = f10;
                if (a51Var.S) {
                    a51Var.N.invalidate();
                    return;
                }
                return;
            case 8:
                v61 v61Var = (v61) this.f32835c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = v61Var.v;
                if (this.f32834b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                v61Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.rr.f27702g.getInterpolation(v61Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(v61Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                v61Var.N = null;
                return;
            case 9:
                x81 x81Var = (x81) this.f32835c;
                if (x81Var.f39213r != null && (z3Var = x81Var.f39214s) != null) {
                    if (!this.f32834b) {
                        z3Var.setVisibility(4);
                    }
                    x81Var.f39213r = null;
                    return;
                }
                return;
            case 10:
                de1 de1Var = (de1) this.f32835c;
                if (this.f32834b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                de1Var.f32635y = f12;
                return;
            case 11:
                zg1 zg1Var = (zg1) this.f32835c;
                AnimatorSet animatorSet2 = zg1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f32834b) {
                        zg1Var.e.setVisibility(4);
                        return;
                    } else {
                        zg1Var.f40129b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.f32835c;
                fi.o oVar = u1Var.V;
                if (!u1Var.T) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                if (this.f32834b) {
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
                l0 l0Var = (l0) this.f32835c;
                fi.o oVar2 = l0Var.f38848b0;
                if (!l0Var.W) {
                    oVar2.setVisibility(8);
                }
                if (this.f32834b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                l0Var.f38846a0 = f14;
                oVar2.setAlpha(f14);
                l0Var.j(l0Var.f38846a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.f38846a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.f38846a0);
                l0Var.invalidate();
                return;
            case 14:
                qg.b2 b2Var = (qg.b2) this.f32835c;
                ((pg.n) b2Var).f40867y.f40991n.d();
                if (this.f32834b) {
                    b2Var.f41270w.accept(Integer.valueOf(b2Var.f41269s));
                }
                if (b2Var.getParent() != null) {
                    ((ViewGroup) b2Var.getParent()).removeView(b2Var);
                    return;
                }
                return;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f32835c;
                if (this.f32834b) {
                    limitPreviewView.f22085j0 = false;
                }
                Runnable runnable = limitPreviewView.f22086k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f22086k0.run();
                    return;
                }
                return;
            case 16:
                rg.p0 p0Var = (rg.p0) this.f32835c;
                if (this.f32834b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                p0Var.M = f15;
                p0Var.d.invalidate();
                rg.o0 o0Var = p0Var.e;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
            default:
                zg.c0 c0Var = (zg.c0) this.f32835c;
                org.telegram.ui.Components.gk0 gk0Var = c0Var.f48937n;
                c0Var.k();
                c0Var.l();
                boolean z10 = this.f32834b;
                zg.c0.a(c0Var, z10);
                c0Var.f48936m.invalidateOutline();
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                c0Var.f48933j = f16;
                boolean z11 = true;
                if (z10) {
                    c0Var.f48934k = true;
                    c0Var.f48927a.invalidate();
                }
                gk0Var.setCustomEmojiEnterProgress(Utilities.clamp(c0Var.f48933j, 1.0f, 0.0f));
                if (!z10) {
                    gk0Var.setImportantForAccessibility(0);
                    gk0Var.setSkipDraw(false);
                    c0Var.f();
                    Runtime.getRuntime().gc();
                    int i11 = c0Var.f48947y;
                    gk0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : false);
                }
                c0Var.C = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32833a) {
            case 1:
                if (this.f32834b) {
                    ((rg0) this.f32835c).V.setVisibility(0);
                    return;
                }
                return;
            case 2:
                if (this.f32834b) {
                    ((PasscodeActivity) this.f32835c).v.setVisibility(0);
                    return;
                }
                return;
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                return;
            case 5:
                v01 v01Var = (v01) this.f32835c;
                org.telegram.ui.ActionBar.v0 v0Var = v01Var.f38259n.U0;
                if (v0Var != null && !this.f32834b) {
                    v0Var.setClickable(true);
                }
                ProfileActivity profileActivity = v01Var.f38259n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = v01Var.f38259n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = v01Var.f38259n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                v01Var.setVisibility(0);
                v01Var.f38259n.l5(false);
                return;
            case 6:
                z11 z11Var = (z11) this.f32835c;
                if (this.f32834b) {
                    z11Var.f39938f.setAlpha(0.0f);
                    z11Var.f39938f.setVisibility(0);
                    return;
                }
                z11Var.f39937c.setAlpha(0.0f);
                z11Var.f39937c.setVisibility(0);
                return;
        }
    }
}
