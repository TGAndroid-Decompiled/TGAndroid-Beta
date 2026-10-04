package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class g70 extends AnimatorListenerAdapter {
    public final int f36518a;
    public final boolean f36519b;
    public final Object f36520c;

    public g70(int i10, Object obj, boolean z10) {
        this.f36518a = i10;
        this.f36520c = obj;
        this.f36519b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36518a) {
            case 0:
                ((k70) this.f36520c).h = null;
                return;
            case 3:
                wq0 wq0Var = (wq0) this.f36520c;
                if (animator.equals(wq0Var.f42607k0)) {
                    wq0Var.f42607k0 = null;
                    return;
                }
                return;
            case 9:
                ((a91) this.f36520c).f34741n = null;
                return;
            case 11:
                bh1 bh1Var = (bh1) this.f36520c;
                AnimatorSet animatorSet = bh1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    bh1Var.I = null;
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
        org.telegram.ui.Cells.z3 z3Var;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        switch (this.f36518a) {
            case 0:
                k70 k70Var = (k70) this.f36520c;
                if (k70Var.h != null && (kdVar = k70Var.f37843f) != null) {
                    if (this.f36519b) {
                        kdVar.setVisibility(4);
                    } else {
                        k70Var.f37844n.setVisibility(4);
                    }
                    k70Var.h = null;
                    return;
                }
                return;
            case 1:
                ug0 ug0Var = (ug0) this.f36520c;
                if (!this.f36519b) {
                    ug0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = ug0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ug0Var.L = null;
                    return;
                }
                return;
            case 2:
                if (!this.f36519b) {
                    ((PasscodeActivity) this.f36520c).v.setVisibility(8);
                    return;
                }
                return;
            case 3:
                wq0 wq0Var = (wq0) this.f36520c;
                if (animator.equals(wq0Var.f42607k0)) {
                    if (!this.f36519b) {
                        wq0Var.Z.setVisibility(4);
                        wq0Var.f42593a0.setVisibility(4);
                    }
                    wq0Var.f42607k0 = null;
                    return;
                }
                return;
            case 4:
                gw0 gw0Var = (gw0) this.f36520c;
                if (this.f36519b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                gw0Var.E = f7;
                return;
            case 5:
                v01 v01Var = (v01) this.f36520c;
                if (v01Var.h) {
                    org.telegram.ui.ActionBar.v0 v0Var = v01Var.f41513n.U0;
                    if (v0Var != null) {
                        v0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = v01Var.f41513n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = v01Var.f41513n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = v01Var.f41513n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    v01Var.setVisibility(8);
                }
                v01Var.f41513n.l5(false);
                return;
            case 6:
                y11 y11Var = (y11) this.f36520c;
                if (this.f36519b) {
                    y11Var.f43005c.setVisibility(8);
                    return;
                } else {
                    y11Var.f43007f.setVisibility(8);
                    return;
                }
            case 7:
                e51 e51Var = (e51) this.f36520c;
                if (this.f36519b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                e51Var.v = f10;
                if (e51Var.S) {
                    e51Var.N.invalidate();
                    return;
                }
                return;
            case 8:
                y61 y61Var = (y61) this.f36520c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = y61Var.v;
                if (this.f36519b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                y61Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.tr.f31141g.getInterpolation(y61Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(y61Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                y61Var.N = null;
                return;
            case 9:
                a91 a91Var = (a91) this.f36520c;
                if (a91Var.f34741n != null && (z3Var = a91Var.f34742r) != null) {
                    if (!this.f36519b) {
                        z3Var.setVisibility(4);
                    }
                    a91Var.f34741n = null;
                    return;
                }
                return;
            case 10:
                ge1 ge1Var = (ge1) this.f36520c;
                if (this.f36519b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ge1Var.f36619y = f12;
                return;
            case 11:
                bh1 bh1Var = (bh1) this.f36520c;
                AnimatorSet animatorSet2 = bh1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f36519b) {
                        bh1Var.f35095e.setVisibility(4);
                        return;
                    } else {
                        bh1Var.f35090b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.f36520c;
                fi.o oVar = v1Var.V;
                if (!v1Var.T) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                if (this.f36519b) {
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
                l0 l0Var = (l0) this.f36520c;
                fi.o oVar2 = l0Var.f42367b0;
                if (!l0Var.W) {
                    oVar2.setVisibility(8);
                }
                if (this.f36519b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                l0Var.f42365a0 = f14;
                oVar2.setAlpha(f14);
                l0Var.j(l0Var.f42365a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.f42365a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.f42365a0);
                l0Var.invalidate();
                return;
            case 14:
                qg.y1 y1Var = (qg.y1) this.f36520c;
                ((pg.n) y1Var).f44533y.f44678n.d();
                if (this.f36519b) {
                    y1Var.f45430w.accept(Integer.valueOf(y1Var.f45429s));
                }
                if (y1Var.getParent() != null) {
                    ((ViewGroup) y1Var.getParent()).removeView(y1Var);
                    return;
                }
                return;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f36520c;
                if (this.f36519b) {
                    limitPreviewView.f24245j0 = false;
                }
                Runnable runnable = limitPreviewView.f24246k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f24246k0.run();
                    return;
                }
                return;
            case 16:
                rg.q0 q0Var = (rg.q0) this.f36520c;
                if (this.f36519b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                q0Var.M = f15;
                q0Var.d.invalidate();
                rg.p0 p0Var = q0Var.f46248e;
                if (p0Var != null) {
                    p0Var.invalidate();
                    return;
                }
                return;
            default:
                zg.b0 b0Var = (zg.b0) this.f36520c;
                org.telegram.ui.Components.sk0 sk0Var = b0Var.f53327n;
                b0Var.k();
                b0Var.l();
                boolean z10 = this.f36519b;
                zg.b0.a(b0Var, z10);
                b0Var.f53326m.invalidateOutline();
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                b0Var.f53323j = f16;
                boolean z11 = true;
                if (z10) {
                    b0Var.f53324k = true;
                    b0Var.f53316a.invalidate();
                }
                sk0Var.setCustomEmojiEnterProgress(Utilities.clamp(b0Var.f53323j, 1.0f, 0.0f));
                if (!z10) {
                    sk0Var.setImportantForAccessibility(0);
                    sk0Var.setSkipDraw(false);
                    b0Var.f();
                    Runtime.getRuntime().gc();
                    int i11 = b0Var.f53337y;
                    sk0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : false);
                }
                b0Var.C = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36518a) {
            case 1:
                if (this.f36519b) {
                    ((ug0) this.f36520c).V.setVisibility(0);
                    return;
                }
                return;
            case 2:
                if (this.f36519b) {
                    ((PasscodeActivity) this.f36520c).v.setVisibility(0);
                    return;
                }
                return;
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                return;
            case 5:
                v01 v01Var = (v01) this.f36520c;
                org.telegram.ui.ActionBar.v0 v0Var = v01Var.f41513n.U0;
                if (v0Var != null && !this.f36519b) {
                    v0Var.setClickable(true);
                }
                ProfileActivity profileActivity = v01Var.f41513n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = v01Var.f41513n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = v01Var.f41513n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                v01Var.setVisibility(0);
                v01Var.f41513n.l5(false);
                return;
            case 6:
                y11 y11Var = (y11) this.f36520c;
                if (this.f36519b) {
                    y11Var.f43007f.setAlpha(0.0f);
                    y11Var.f43007f.setVisibility(0);
                    return;
                }
                y11Var.f43005c.setAlpha(0.0f);
                y11Var.f43005c.setVisibility(0);
                return;
        }
    }
}
