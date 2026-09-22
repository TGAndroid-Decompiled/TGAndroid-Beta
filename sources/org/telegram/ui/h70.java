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
    public final int f34149a;
    public final boolean f34150b;
    public final Object f34151c;

    public h70(int i10, Object obj, boolean z10) {
        this.f34149a = i10;
        this.f34151c = obj;
        this.f34150b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f34149a) {
            case 0:
                ((l70) this.f34151c).h = null;
                return;
            case 3:
                cr0 cr0Var = (cr0) this.f34151c;
                if (animator.equals(cr0Var.f32867k0)) {
                    cr0Var.f32867k0 = null;
                    return;
                }
                return;
            case 9:
                ((i91) this.f34151c).f34529r = null;
                return;
            case 11:
                ih1 ih1Var = (ih1) this.f34151c;
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
        jd jdVar;
        float f7;
        float f10;
        float f11;
        org.telegram.ui.Cells.a4 a4Var;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        switch (this.f34149a) {
            case 0:
                l70 l70Var = (l70) this.f34151c;
                if (l70Var.h != null && (jdVar = l70Var.f35355f) != null) {
                    if (this.f34150b) {
                        jdVar.setVisibility(4);
                    } else {
                        l70Var.f35356n.setVisibility(4);
                    }
                    l70Var.h = null;
                    return;
                }
                return;
            case 1:
                yg0 yg0Var = (yg0) this.f34151c;
                if (!this.f34150b) {
                    yg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = yg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    yg0Var.L = null;
                    return;
                }
                return;
            case 2:
                if (!this.f34150b) {
                    ((PasscodeActivity) this.f34151c).v.setVisibility(8);
                    return;
                }
                return;
            case 3:
                cr0 cr0Var = (cr0) this.f34151c;
                if (animator.equals(cr0Var.f32867k0)) {
                    if (!this.f34150b) {
                        cr0Var.Z.setVisibility(4);
                        cr0Var.f32854a0.setVisibility(4);
                    }
                    cr0Var.f32867k0 = null;
                    return;
                }
                return;
            case 4:
                mw0 mw0Var = (mw0) this.f34151c;
                if (this.f34150b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                mw0Var.E = f7;
                return;
            case 5:
                c11 c11Var = (c11) this.f34151c;
                if (c11Var.h) {
                    org.telegram.ui.ActionBar.v0 v0Var = c11Var.f32612n.U0;
                    if (v0Var != null) {
                        v0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = c11Var.f32612n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = c11Var.f32612n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = c11Var.f32612n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    c11Var.setVisibility(8);
                }
                c11Var.f32612n.l5(false);
                return;
            case 6:
                f21 f21Var = (f21) this.f34151c;
                if (this.f34150b) {
                    f21Var.f33481c.setVisibility(8);
                    return;
                } else {
                    f21Var.f33482f.setVisibility(8);
                    return;
                }
            case 7:
                l51 l51Var = (l51) this.f34151c;
                if (this.f34150b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                l51Var.v = f10;
                if (l51Var.S) {
                    l51Var.N.invalidate();
                    return;
                }
                return;
            case 8:
                f71 f71Var = (f71) this.f34151c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f71Var.v;
                if (this.f34150b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                f71Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.qr.f27654g.getInterpolation(f71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(f71Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                f71Var.N = null;
                return;
            case 9:
                i91 i91Var = (i91) this.f34151c;
                if (i91Var.f34529r != null && (a4Var = i91Var.f34530s) != null) {
                    if (!this.f34150b) {
                        a4Var.setVisibility(4);
                    }
                    i91Var.f34529r = null;
                    return;
                }
                return;
            case 10:
                me1 me1Var = (me1) this.f34151c;
                if (this.f34150b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                me1Var.f35733y = f12;
                return;
            case 11:
                ih1 ih1Var = (ih1) this.f34151c;
                AnimatorSet animatorSet2 = ih1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f34150b) {
                        ih1Var.e.setVisibility(4);
                        return;
                    } else {
                        ih1Var.f34592b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) this.f34151c;
                fi.o oVar = w1Var.V;
                if (!w1Var.T) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                if (this.f34150b) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                w1Var.U = f13;
                oVar.setAlpha(f13);
                w1Var.invalidate();
                if (w1Var.T) {
                    oVar.requestFocus();
                    AndroidUtilities.showKeyboard(oVar);
                    return;
                }
                oVar.clearFocus();
                AndroidUtilities.hideKeyboard(oVar);
                return;
            case 13:
                k0 k0Var = (k0) this.f34151c;
                fi.o oVar2 = k0Var.f39098b0;
                if (!k0Var.W) {
                    oVar2.setVisibility(8);
                }
                if (this.f34150b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                k0Var.f39096a0 = f14;
                oVar2.setAlpha(f14);
                k0Var.j(k0Var.f39096a0);
                k0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * k0Var.f39096a0);
                k0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * k0Var.f39096a0);
                k0Var.invalidate();
                return;
            case 14:
                qg.z1 z1Var = (qg.z1) this.f34151c;
                ((pg.n) z1Var).f41225y.f41357n.d();
                if (this.f34150b) {
                    z1Var.f42062w.accept(Integer.valueOf(z1Var.f42061s));
                }
                if (z1Var.getParent() != null) {
                    ((ViewGroup) z1Var.getParent()).removeView(z1Var);
                    return;
                }
                return;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f34151c;
                if (this.f34150b) {
                    limitPreviewView.f22351j0 = false;
                }
                Runnable runnable = limitPreviewView.f22352k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f22352k0.run();
                    return;
                }
                return;
            case 16:
                rg.p0 p0Var = (rg.p0) this.f34151c;
                if (this.f34150b) {
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
                zg.c0 c0Var = (zg.c0) this.f34151c;
                org.telegram.ui.Components.sk0 sk0Var = c0Var.f49313n;
                c0Var.k();
                c0Var.l();
                boolean z10 = this.f34150b;
                zg.c0.a(c0Var, z10);
                c0Var.f49312m.invalidateOutline();
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                c0Var.f49309j = f16;
                boolean z11 = true;
                if (z10) {
                    c0Var.f49310k = true;
                    c0Var.f49303a.invalidate();
                }
                sk0Var.setCustomEmojiEnterProgress(Utilities.clamp(c0Var.f49309j, 1.0f, 0.0f));
                if (!z10) {
                    sk0Var.setImportantForAccessibility(0);
                    sk0Var.setSkipDraw(false);
                    c0Var.f();
                    Runtime.getRuntime().gc();
                    int i11 = c0Var.f49323y;
                    sk0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : false);
                }
                c0Var.C = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f34149a) {
            case 1:
                if (this.f34150b) {
                    ((yg0) this.f34151c).V.setVisibility(0);
                    return;
                }
                return;
            case 2:
                if (this.f34150b) {
                    ((PasscodeActivity) this.f34151c).v.setVisibility(0);
                    return;
                }
                return;
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                return;
            case 5:
                c11 c11Var = (c11) this.f34151c;
                org.telegram.ui.ActionBar.v0 v0Var = c11Var.f32612n.U0;
                if (v0Var != null && !this.f34150b) {
                    v0Var.setClickable(true);
                }
                ProfileActivity profileActivity = c11Var.f32612n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = c11Var.f32612n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = c11Var.f32612n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                c11Var.setVisibility(0);
                c11Var.f32612n.l5(false);
                return;
            case 6:
                f21 f21Var = (f21) this.f34151c;
                if (this.f34150b) {
                    f21Var.f33482f.setAlpha(0.0f);
                    f21Var.f33482f.setVisibility(0);
                    return;
                }
                f21Var.f33481c.setAlpha(0.0f);
                f21Var.f33481c.setVisibility(0);
                return;
        }
    }
}
