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
    public final int f34182a;
    public final boolean f34183b;
    public final Object f34184c;

    public h70(int i10, Object obj, boolean z10) {
        this.f34182a = i10;
        this.f34184c = obj;
        this.f34183b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f34182a) {
            case 0:
                ((l70) this.f34184c).h = null;
                return;
            case 3:
                ar0 ar0Var = (ar0) this.f34184c;
                if (animator.equals(ar0Var.f31922k0)) {
                    ar0Var.f31922k0 = null;
                    return;
                }
                return;
            case 9:
                ((e91) this.f34184c).f33288r = null;
                return;
            case 11:
                gh1 gh1Var = (gh1) this.f34184c;
                AnimatorSet animatorSet = gh1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    gh1Var.I = null;
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
        org.telegram.ui.Cells.y3 y3Var;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        switch (this.f34182a) {
            case 0:
                l70 l70Var = (l70) this.f34184c;
                if (l70Var.h != null && (idVar = l70Var.f35358f) != null) {
                    if (this.f34183b) {
                        idVar.setVisibility(4);
                    } else {
                        l70Var.f35359n.setVisibility(4);
                    }
                    l70Var.h = null;
                    return;
                }
                return;
            case 1:
                wg0 wg0Var = (wg0) this.f34184c;
                if (!this.f34183b) {
                    wg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = wg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    wg0Var.L = null;
                    return;
                }
                return;
            case 2:
                if (!this.f34183b) {
                    ((PasscodeActivity) this.f34184c).v.setVisibility(8);
                    return;
                }
                return;
            case 3:
                ar0 ar0Var = (ar0) this.f34184c;
                if (animator.equals(ar0Var.f31922k0)) {
                    if (!this.f34183b) {
                        ar0Var.Z.setVisibility(4);
                        ar0Var.f31909a0.setVisibility(4);
                    }
                    ar0Var.f31922k0 = null;
                    return;
                }
                return;
            case 4:
                mw0 mw0Var = (mw0) this.f34184c;
                if (this.f34183b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                mw0Var.E = f7;
                return;
            case 5:
                c11 c11Var = (c11) this.f34184c;
                if (c11Var.h) {
                    org.telegram.ui.ActionBar.v0 v0Var = c11Var.f32633n.U0;
                    if (v0Var != null) {
                        v0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = c11Var.f32633n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = c11Var.f32633n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = c11Var.f32633n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    c11Var.setVisibility(8);
                }
                c11Var.f32633n.l5(false);
                return;
            case 6:
                g21 g21Var = (g21) this.f34184c;
                if (this.f34183b) {
                    g21Var.f33739c.setVisibility(8);
                    return;
                } else {
                    g21Var.f33740f.setVisibility(8);
                    return;
                }
            case 7:
                h51 h51Var = (h51) this.f34184c;
                if (this.f34183b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                h51Var.v = f10;
                if (h51Var.S) {
                    h51Var.N.invalidate();
                    return;
                }
                return;
            case 8:
                c71 c71Var = (c71) this.f34184c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c71Var.v;
                if (this.f34183b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                c71Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.qr.f27424g.getInterpolation(c71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(c71Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                c71Var.N = null;
                return;
            case 9:
                e91 e91Var = (e91) this.f34184c;
                if (e91Var.f33288r != null && (y3Var = e91Var.f33289s) != null) {
                    if (!this.f34183b) {
                        y3Var.setVisibility(4);
                    }
                    e91Var.f33288r = null;
                    return;
                }
                return;
            case 10:
                ke1 ke1Var = (ke1) this.f34184c;
                if (this.f34183b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ke1Var.f35139y = f12;
                return;
            case 11:
                gh1 gh1Var = (gh1) this.f34184c;
                AnimatorSet animatorSet2 = gh1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f34183b) {
                        gh1Var.e.setVisibility(4);
                        return;
                    } else {
                        gh1Var.f33910b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.f34184c;
                fi.o oVar = v1Var.V;
                if (!v1Var.T) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                if (this.f34183b) {
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
                k0 k0Var = (k0) this.f34184c;
                fi.o oVar2 = k0Var.f39109b0;
                if (!k0Var.W) {
                    oVar2.setVisibility(8);
                }
                if (this.f34183b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                k0Var.f39107a0 = f14;
                oVar2.setAlpha(f14);
                k0Var.j(k0Var.f39107a0);
                k0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * k0Var.f39107a0);
                k0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * k0Var.f39107a0);
                k0Var.invalidate();
                return;
            case 14:
                qg.b2 b2Var = (qg.b2) this.f34184c;
                ((pg.n) b2Var).f40918y.f41039n.d();
                if (this.f34183b) {
                    b2Var.f41318w.accept(Integer.valueOf(b2Var.f41317s));
                }
                if (b2Var.getParent() != null) {
                    ((ViewGroup) b2Var.getParent()).removeView(b2Var);
                    return;
                }
                return;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f34184c;
                if (this.f34183b) {
                    limitPreviewView.f22114j0 = false;
                }
                Runnable runnable = limitPreviewView.f22115k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f22115k0.run();
                    return;
                }
                return;
            case 16:
                rg.p0 p0Var = (rg.p0) this.f34184c;
                if (this.f34183b) {
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
                zg.c0 c0Var = (zg.c0) this.f34184c;
                org.telegram.ui.Components.fk0 fk0Var = c0Var.f48993n;
                c0Var.k();
                c0Var.l();
                boolean z10 = this.f34183b;
                zg.c0.a(c0Var, z10);
                c0Var.f48992m.invalidateOutline();
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                c0Var.f48989j = f16;
                boolean z11 = true;
                if (z10) {
                    c0Var.f48990k = true;
                    c0Var.f48983a.invalidate();
                }
                fk0Var.setCustomEmojiEnterProgress(Utilities.clamp(c0Var.f48989j, 1.0f, 0.0f));
                if (!z10) {
                    fk0Var.setImportantForAccessibility(0);
                    fk0Var.setSkipDraw(false);
                    c0Var.f();
                    Runtime.getRuntime().gc();
                    int i11 = c0Var.f49003y;
                    fk0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : false);
                }
                c0Var.C = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f34182a) {
            case 1:
                if (this.f34183b) {
                    ((wg0) this.f34184c).V.setVisibility(0);
                    return;
                }
                return;
            case 2:
                if (this.f34183b) {
                    ((PasscodeActivity) this.f34184c).v.setVisibility(0);
                    return;
                }
                return;
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                return;
            case 5:
                c11 c11Var = (c11) this.f34184c;
                org.telegram.ui.ActionBar.v0 v0Var = c11Var.f32633n.U0;
                if (v0Var != null && !this.f34183b) {
                    v0Var.setClickable(true);
                }
                ProfileActivity profileActivity = c11Var.f32633n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = c11Var.f32633n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = c11Var.f32633n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                c11Var.setVisibility(0);
                c11Var.f32633n.l5(false);
                return;
            case 6:
                g21 g21Var = (g21) this.f34184c;
                if (this.f34183b) {
                    g21Var.f33740f.setAlpha(0.0f);
                    g21Var.f33740f.setVisibility(0);
                    return;
                }
                g21Var.f33739c.setAlpha(0.0f);
                g21Var.f33739c.setVisibility(0);
                return;
        }
    }
}
