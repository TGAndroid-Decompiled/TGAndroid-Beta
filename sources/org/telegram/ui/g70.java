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
    public final int f36519a;
    public final boolean f36520b;
    public final Object f36521c;

    public g70(int i10, Object obj, boolean z10) {
        this.f36519a = i10;
        this.f36521c = obj;
        this.f36520b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36519a) {
            case 0:
                ((k70) this.f36521c).h = null;
                return;
            case 3:
                wq0 wq0Var = (wq0) this.f36521c;
                if (animator.equals(wq0Var.f42608k0)) {
                    wq0Var.f42608k0 = null;
                    return;
                }
                return;
            case 9:
                ((a91) this.f36521c).f34742n = null;
                return;
            case 11:
                bh1 bh1Var = (bh1) this.f36521c;
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
        switch (this.f36519a) {
            case 0:
                k70 k70Var = (k70) this.f36521c;
                if (k70Var.h != null && (kdVar = k70Var.f37844f) != null) {
                    if (this.f36520b) {
                        kdVar.setVisibility(4);
                    } else {
                        k70Var.f37845n.setVisibility(4);
                    }
                    k70Var.h = null;
                    return;
                }
                return;
            case 1:
                ug0 ug0Var = (ug0) this.f36521c;
                if (!this.f36520b) {
                    ug0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = ug0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ug0Var.L = null;
                    return;
                }
                return;
            case 2:
                if (!this.f36520b) {
                    ((PasscodeActivity) this.f36521c).v.setVisibility(8);
                    return;
                }
                return;
            case 3:
                wq0 wq0Var = (wq0) this.f36521c;
                if (animator.equals(wq0Var.f42608k0)) {
                    if (!this.f36520b) {
                        wq0Var.Z.setVisibility(4);
                        wq0Var.f42594a0.setVisibility(4);
                    }
                    wq0Var.f42608k0 = null;
                    return;
                }
                return;
            case 4:
                gw0 gw0Var = (gw0) this.f36521c;
                if (this.f36520b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                gw0Var.E = f7;
                return;
            case 5:
                v01 v01Var = (v01) this.f36521c;
                if (v01Var.h) {
                    org.telegram.ui.ActionBar.v0 v0Var = v01Var.f41514n.U0;
                    if (v0Var != null) {
                        v0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = v01Var.f41514n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = v01Var.f41514n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = v01Var.f41514n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    v01Var.setVisibility(8);
                }
                v01Var.f41514n.l5(false);
                return;
            case 6:
                y11 y11Var = (y11) this.f36521c;
                if (this.f36520b) {
                    y11Var.f43006c.setVisibility(8);
                    return;
                } else {
                    y11Var.f43008f.setVisibility(8);
                    return;
                }
            case 7:
                e51 e51Var = (e51) this.f36521c;
                if (this.f36520b) {
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
                y61 y61Var = (y61) this.f36521c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = y61Var.v;
                if (this.f36520b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                y61Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.tr.f31142g.getInterpolation(y61Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(y61Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                y61Var.N = null;
                return;
            case 9:
                a91 a91Var = (a91) this.f36521c;
                if (a91Var.f34742n != null && (z3Var = a91Var.f34743r) != null) {
                    if (!this.f36520b) {
                        z3Var.setVisibility(4);
                    }
                    a91Var.f34742n = null;
                    return;
                }
                return;
            case 10:
                ge1 ge1Var = (ge1) this.f36521c;
                if (this.f36520b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ge1Var.f36620y = f12;
                return;
            case 11:
                bh1 bh1Var = (bh1) this.f36521c;
                AnimatorSet animatorSet2 = bh1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f36520b) {
                        bh1Var.f35096e.setVisibility(4);
                        return;
                    } else {
                        bh1Var.f35091b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.f36521c;
                fi.o oVar = v1Var.V;
                if (!v1Var.T) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                if (this.f36520b) {
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
                l0 l0Var = (l0) this.f36521c;
                fi.o oVar2 = l0Var.f42368b0;
                if (!l0Var.W) {
                    oVar2.setVisibility(8);
                }
                if (this.f36520b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                l0Var.f42366a0 = f14;
                oVar2.setAlpha(f14);
                l0Var.j(l0Var.f42366a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.f42366a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.f42366a0);
                l0Var.invalidate();
                return;
            case 14:
                qg.y1 y1Var = (qg.y1) this.f36521c;
                ((pg.n) y1Var).f44534y.f44679n.d();
                if (this.f36520b) {
                    y1Var.f45431w.accept(Integer.valueOf(y1Var.f45430s));
                }
                if (y1Var.getParent() != null) {
                    ((ViewGroup) y1Var.getParent()).removeView(y1Var);
                    return;
                }
                return;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f36521c;
                if (this.f36520b) {
                    limitPreviewView.f24246j0 = false;
                }
                Runnable runnable = limitPreviewView.f24247k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f24247k0.run();
                    return;
                }
                return;
            case 16:
                rg.q0 q0Var = (rg.q0) this.f36521c;
                if (this.f36520b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                q0Var.M = f15;
                q0Var.d.invalidate();
                rg.p0 p0Var = q0Var.f46249e;
                if (p0Var != null) {
                    p0Var.invalidate();
                    return;
                }
                return;
            default:
                zg.b0 b0Var = (zg.b0) this.f36521c;
                org.telegram.ui.Components.sk0 sk0Var = b0Var.f53328n;
                b0Var.k();
                b0Var.l();
                boolean z10 = this.f36520b;
                zg.b0.a(b0Var, z10);
                b0Var.f53327m.invalidateOutline();
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                b0Var.f53324j = f16;
                boolean z11 = true;
                if (z10) {
                    b0Var.f53325k = true;
                    b0Var.f53317a.invalidate();
                }
                sk0Var.setCustomEmojiEnterProgress(Utilities.clamp(b0Var.f53324j, 1.0f, 0.0f));
                if (!z10) {
                    sk0Var.setImportantForAccessibility(0);
                    sk0Var.setSkipDraw(false);
                    b0Var.f();
                    Runtime.getRuntime().gc();
                    int i11 = b0Var.f53338y;
                    sk0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : false);
                }
                b0Var.C = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36519a) {
            case 1:
                if (this.f36520b) {
                    ((ug0) this.f36521c).V.setVisibility(0);
                    return;
                }
                return;
            case 2:
                if (this.f36520b) {
                    ((PasscodeActivity) this.f36521c).v.setVisibility(0);
                    return;
                }
                return;
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                return;
            case 5:
                v01 v01Var = (v01) this.f36521c;
                org.telegram.ui.ActionBar.v0 v0Var = v01Var.f41514n.U0;
                if (v0Var != null && !this.f36520b) {
                    v0Var.setClickable(true);
                }
                ProfileActivity profileActivity = v01Var.f41514n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = v01Var.f41514n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = v01Var.f41514n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                v01Var.setVisibility(0);
                v01Var.f41514n.l5(false);
                return;
            case 6:
                y11 y11Var = (y11) this.f36521c;
                if (this.f36520b) {
                    y11Var.f43008f.setAlpha(0.0f);
                    y11Var.f43008f.setVisibility(0);
                    return;
                }
                y11Var.f43006c.setAlpha(0.0f);
                y11Var.f43006c.setVisibility(0);
                return;
        }
    }
}
