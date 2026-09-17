package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class j70 extends AnimatorListenerAdapter {
    public final int f34786a;
    public final boolean f34787b;
    public final Object f34788c;

    public j70(int i10, Object obj, boolean z10) {
        this.f34786a = i10;
        this.f34788c = obj;
        this.f34787b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f34786a) {
            case 0:
                ((n70) this.f34788c).h = null;
                return;
            case 3:
                cr0 cr0Var = (cr0) this.f34788c;
                if (animator.equals(cr0Var.f32885k0)) {
                    cr0Var.f32885k0 = null;
                    return;
                }
                return;
            case 9:
                ((g91) this.f34788c).f33924r = null;
                return;
            case 11:
                ih1 ih1Var = (ih1) this.f34788c;
                AnimatorSet animatorSet = ih1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ih1Var.I = null;
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
        kd kdVar;
        float f7;
        float f10;
        float f11;
        org.telegram.ui.Cells.y3 y3Var;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        switch (this.f34786a) {
            case 0:
                n70 n70Var = (n70) this.f34788c;
                if (n70Var.h != null && (kdVar = n70Var.f35959f) != null) {
                    if (this.f34787b) {
                        kdVar.setVisibility(4);
                    } else {
                        n70Var.f35960n.setVisibility(4);
                    }
                    n70Var.h = null;
                    return;
                }
                return;
            case 1:
                yg0 yg0Var = (yg0) this.f34788c;
                if (!this.f34787b) {
                    yg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = yg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    yg0Var.L = null;
                    return;
                }
                return;
            case 2:
                if (!this.f34787b) {
                    ((PasscodeActivity) this.f34788c).v.setVisibility(8);
                    return;
                }
                return;
            case 3:
                cr0 cr0Var = (cr0) this.f34788c;
                if (animator.equals(cr0Var.f32885k0)) {
                    if (!this.f34787b) {
                        cr0Var.Z.setVisibility(4);
                        cr0Var.f32872a0.setVisibility(4);
                    }
                    cr0Var.f32885k0 = null;
                    return;
                }
                return;
            case 4:
                ow0 ow0Var = (ow0) this.f34788c;
                if (this.f34787b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ow0Var.E = f7;
                return;
            case 5:
                e11 e11Var = (e11) this.f34788c;
                if (e11Var.h) {
                    org.telegram.ui.ActionBar.w0 w0Var = e11Var.f33262n.U0;
                    if (w0Var != null) {
                        w0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = e11Var.f33262n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = e11Var.f33262n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = e11Var.f33262n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    e11Var.setVisibility(8);
                }
                e11Var.f33262n.l5(false);
                return;
            case 6:
                h21 h21Var = (h21) this.f34788c;
                if (this.f34787b) {
                    h21Var.f34112c.setVisibility(8);
                    return;
                } else {
                    h21Var.f34113f.setVisibility(8);
                    return;
                }
            case 7:
                k51 k51Var = (k51) this.f34788c;
                if (this.f34787b) {
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
            case 8:
                e71 e71Var = (e71) this.f34788c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = e71Var.v;
                if (this.f34787b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                e71Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.qr.f27381g.getInterpolation(e71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(e71Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                e71Var.N = null;
                return;
            case 9:
                g91 g91Var = (g91) this.f34788c;
                if (g91Var.f33924r != null && (y3Var = g91Var.f33925s) != null) {
                    if (!this.f34787b) {
                        y3Var.setVisibility(4);
                    }
                    g91Var.f33924r = null;
                    return;
                }
                return;
            case 10:
                me1 me1Var = (me1) this.f34788c;
                if (this.f34787b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                me1Var.f35787y = f12;
                return;
            case 11:
                ih1 ih1Var = (ih1) this.f34788c;
                AnimatorSet animatorSet2 = ih1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f34787b) {
                        ih1Var.e.setVisibility(4);
                        return;
                    } else {
                        ih1Var.f34573b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.f34788c;
                fi.o oVar = v1Var.V;
                if (!v1Var.T) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                if (this.f34787b) {
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
                k0 k0Var = (k0) this.f34788c;
                fi.o oVar2 = k0Var.f38952b0;
                if (!k0Var.W) {
                    oVar2.setVisibility(8);
                }
                if (this.f34787b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                k0Var.f38950a0 = f14;
                oVar2.setAlpha(f14);
                k0Var.j(k0Var.f38950a0);
                k0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * k0Var.f38950a0);
                k0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * k0Var.f38950a0);
                k0Var.invalidate();
                return;
            case 14:
                qg.b2 b2Var = (qg.b2) this.f34788c;
                ((pg.n) b2Var).f40940y.f41061n.d();
                if (this.f34787b) {
                    b2Var.f41340w.accept(Integer.valueOf(b2Var.f41339s));
                }
                if (b2Var.getParent() != null) {
                    ((ViewGroup) b2Var.getParent()).removeView(b2Var);
                    return;
                }
                return;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f34788c;
                if (this.f34787b) {
                    limitPreviewView.f22124j0 = false;
                }
                Runnable runnable = limitPreviewView.f22125k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f22125k0.run();
                    return;
                }
                return;
            case 16:
                rg.p0 p0Var = (rg.p0) this.f34788c;
                if (this.f34787b) {
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
                zg.c0 c0Var = (zg.c0) this.f34788c;
                org.telegram.ui.Components.gk0 gk0Var = c0Var.f49016n;
                c0Var.k();
                c0Var.l();
                boolean z10 = this.f34787b;
                zg.c0.a(c0Var, z10);
                c0Var.f49015m.invalidateOutline();
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                c0Var.f49012j = f16;
                boolean z11 = true;
                if (z10) {
                    c0Var.f49013k = true;
                    c0Var.f49006a.invalidate();
                }
                gk0Var.setCustomEmojiEnterProgress(Utilities.clamp(c0Var.f49012j, 1.0f, 0.0f));
                if (!z10) {
                    gk0Var.setImportantForAccessibility(0);
                    gk0Var.setSkipDraw(false);
                    c0Var.f();
                    Runtime.getRuntime().gc();
                    int i11 = c0Var.f49026y;
                    gk0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : false);
                }
                c0Var.C = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f34786a) {
            case 1:
                if (this.f34787b) {
                    ((yg0) this.f34788c).V.setVisibility(0);
                    return;
                }
                return;
            case 2:
                if (this.f34787b) {
                    ((PasscodeActivity) this.f34788c).v.setVisibility(0);
                    return;
                }
                return;
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                return;
            case 5:
                e11 e11Var = (e11) this.f34788c;
                org.telegram.ui.ActionBar.w0 w0Var = e11Var.f33262n.U0;
                if (w0Var != null && !this.f34787b) {
                    w0Var.setClickable(true);
                }
                ProfileActivity profileActivity = e11Var.f33262n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = e11Var.f33262n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = e11Var.f33262n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                e11Var.setVisibility(0);
                e11Var.f33262n.l5(false);
                return;
            case 6:
                h21 h21Var = (h21) this.f34788c;
                if (this.f34787b) {
                    h21Var.f34113f.setAlpha(0.0f);
                    h21Var.f34113f.setVisibility(0);
                    return;
                }
                h21Var.f34112c.setAlpha(0.0f);
                h21Var.f34112c.setVisibility(0);
                return;
        }
    }
}
