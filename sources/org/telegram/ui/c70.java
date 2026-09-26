package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class c70 extends AnimatorListenerAdapter {
    public final int f32588a;
    public final boolean f32589b;
    public final Object f32590c;

    public c70(int i10, Object obj, boolean z10) {
        this.f32588a = i10;
        this.f32590c = obj;
        this.f32589b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32588a) {
            case 0:
                ((g70) this.f32590c).h = null;
                return;
            case 3:
                tq0 tq0Var = (tq0) this.f32590c;
                if (animator.equals(tq0Var.f38201k0)) {
                    tq0Var.f38201k0 = null;
                    return;
                }
                return;
            case 9:
                ((z81) this.f32590c).f40414r = null;
                return;
            case 11:
                zg1 zg1Var = (zg1) this.f32590c;
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
        switch (this.f32588a) {
            case 0:
                g70 g70Var = (g70) this.f32590c;
                if (g70Var.h != null && (idVar = g70Var.f33837f) != null) {
                    if (this.f32589b) {
                        idVar.setVisibility(4);
                    } else {
                        g70Var.f33838n.setVisibility(4);
                    }
                    g70Var.h = null;
                    return;
                }
                return;
            case 1:
                qg0 qg0Var = (qg0) this.f32590c;
                if (!this.f32589b) {
                    qg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = qg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    qg0Var.L = null;
                    return;
                }
                return;
            case 2:
                if (!this.f32589b) {
                    ((PasscodeActivity) this.f32590c).v.setVisibility(8);
                    return;
                }
                return;
            case 3:
                tq0 tq0Var = (tq0) this.f32590c;
                if (animator.equals(tq0Var.f38201k0)) {
                    if (!this.f32589b) {
                        tq0Var.Z.setVisibility(4);
                        tq0Var.f38188a0.setVisibility(4);
                    }
                    tq0Var.f38201k0 = null;
                    return;
                }
                return;
            case 4:
                dw0 dw0Var = (dw0) this.f32590c;
                if (this.f32589b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                dw0Var.E = f7;
                return;
            case 5:
                t01 t01Var = (t01) this.f32590c;
                if (t01Var.h) {
                    org.telegram.ui.ActionBar.u0 u0Var = t01Var.f37907n.U0;
                    if (u0Var != null) {
                        u0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = t01Var.f37907n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = t01Var.f37907n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = t01Var.f37907n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    t01Var.setVisibility(8);
                }
                t01Var.f37907n.l5(false);
                return;
            case 6:
                x11 x11Var = (x11) this.f32590c;
                if (this.f32589b) {
                    x11Var.f39794c.setVisibility(8);
                    return;
                } else {
                    x11Var.f39795f.setVisibility(8);
                    return;
                }
            case 7:
                b51 b51Var = (b51) this.f32590c;
                if (this.f32589b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                b51Var.v = f10;
                if (b51Var.S) {
                    b51Var.N.invalidate();
                    return;
                }
                return;
            case 8:
                w61 w61Var = (w61) this.f32590c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w61Var.v;
                if (this.f32589b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                w61Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.sr.f28340g.getInterpolation(w61Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(w61Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                w61Var.N = null;
                return;
            case 9:
                z81 z81Var = (z81) this.f32590c;
                if (z81Var.f40414r != null && (z3Var = z81Var.f40415s) != null) {
                    if (!this.f32589b) {
                        z3Var.setVisibility(4);
                    }
                    z81Var.f40414r = null;
                    return;
                }
                return;
            case 10:
                de1 de1Var = (de1) this.f32590c;
                if (this.f32589b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                de1Var.f33102y = f12;
                return;
            case 11:
                zg1 zg1Var = (zg1) this.f32590c;
                AnimatorSet animatorSet2 = zg1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f32589b) {
                        zg1Var.e.setVisibility(4);
                        return;
                    } else {
                        zg1Var.f40471b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.f32590c;
                fi.o oVar = v1Var.V;
                if (!v1Var.T) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                if (this.f32589b) {
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
            case 13:
                l0 l0Var = (l0) this.f32590c;
                fi.o oVar2 = l0Var.f39228b0;
                if (!l0Var.W) {
                    oVar2.setVisibility(8);
                }
                if (this.f32589b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                l0Var.f39226a0 = f14;
                oVar2.setAlpha(f14);
                l0Var.j(l0Var.f39226a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.f39226a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.f39226a0);
                l0Var.invalidate();
                return;
            case 14:
                qg.z1 z1Var = (qg.z1) this.f32590c;
                ((pg.n) z1Var).f41175y.f41307n.d();
                if (this.f32589b) {
                    z1Var.f42026w.accept(Integer.valueOf(z1Var.f42025s));
                }
                if (z1Var.getParent() != null) {
                    ((ViewGroup) z1Var.getParent()).removeView(z1Var);
                    return;
                }
                return;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f32590c;
                if (this.f32589b) {
                    limitPreviewView.f22336j0 = false;
                }
                Runnable runnable = limitPreviewView.f22337k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f22337k0.run();
                    return;
                }
                return;
            case 16:
                rg.p0 p0Var = (rg.p0) this.f32590c;
                if (this.f32589b) {
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
                zg.b0 b0Var = (zg.b0) this.f32590c;
                org.telegram.ui.Components.rk0 rk0Var = b0Var.f49254n;
                b0Var.k();
                b0Var.l();
                boolean z10 = this.f32589b;
                zg.b0.a(b0Var, z10);
                b0Var.f49253m.invalidateOutline();
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                b0Var.f49250j = f16;
                boolean z11 = true;
                if (z10) {
                    b0Var.f49251k = true;
                    b0Var.f49244a.invalidate();
                }
                rk0Var.setCustomEmojiEnterProgress(Utilities.clamp(b0Var.f49250j, 1.0f, 0.0f));
                if (!z10) {
                    rk0Var.setImportantForAccessibility(0);
                    rk0Var.setSkipDraw(false);
                    b0Var.f();
                    Runtime.getRuntime().gc();
                    int i11 = b0Var.f49264y;
                    rk0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : false);
                }
                b0Var.C = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32588a) {
            case 1:
                if (this.f32589b) {
                    ((qg0) this.f32590c).V.setVisibility(0);
                    return;
                }
                return;
            case 2:
                if (this.f32589b) {
                    ((PasscodeActivity) this.f32590c).v.setVisibility(0);
                    return;
                }
                return;
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                return;
            case 5:
                t01 t01Var = (t01) this.f32590c;
                org.telegram.ui.ActionBar.u0 u0Var = t01Var.f37907n.U0;
                if (u0Var != null && !this.f32589b) {
                    u0Var.setClickable(true);
                }
                ProfileActivity profileActivity = t01Var.f37907n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = t01Var.f37907n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = t01Var.f37907n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                t01Var.setVisibility(0);
                t01Var.f37907n.l5(false);
                return;
            case 6:
                x11 x11Var = (x11) this.f32590c;
                if (this.f32589b) {
                    x11Var.f39795f.setAlpha(0.0f);
                    x11Var.f39795f.setVisibility(0);
                    return;
                }
                x11Var.f39794c.setAlpha(0.0f);
                x11Var.f39794c.setVisibility(0);
                return;
        }
    }
}
