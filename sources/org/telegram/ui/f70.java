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
    public final int f33446a;
    public final boolean f33447b;
    public final Object f33448c;

    public f70(int i10, Object obj, boolean z10) {
        this.f33446a = i10;
        this.f33448c = obj;
        this.f33447b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33446a) {
            case 0:
                ((j70) this.f33448c).h = null;
                return;
            case 3:
                wq0 wq0Var = (wq0) this.f33448c;
                if (animator.equals(wq0Var.f39425k0)) {
                    wq0Var.f39425k0 = null;
                    return;
                }
                return;
            case 9:
                ((a91) this.f33448c).f32017r = null;
                return;
            case 11:
                zg1 zg1Var = (zg1) this.f33448c;
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
        switch (this.f33446a) {
            case 0:
                j70 j70Var = (j70) this.f33448c;
                if (j70Var.h != null && (kdVar = j70Var.f34647f) != null) {
                    if (this.f33447b) {
                        kdVar.setVisibility(4);
                    } else {
                        j70Var.f34648n.setVisibility(4);
                    }
                    j70Var.h = null;
                    return;
                }
                return;
            case 1:
                tg0 tg0Var = (tg0) this.f33448c;
                if (!this.f33447b) {
                    tg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = tg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    tg0Var.L = null;
                    return;
                }
                return;
            case 2:
                if (!this.f33447b) {
                    ((PasscodeActivity) this.f33448c).v.setVisibility(8);
                    return;
                }
                return;
            case 3:
                wq0 wq0Var = (wq0) this.f33448c;
                if (animator.equals(wq0Var.f39425k0)) {
                    if (!this.f33447b) {
                        wq0Var.Z.setVisibility(4);
                        wq0Var.f39412a0.setVisibility(4);
                    }
                    wq0Var.f39425k0 = null;
                    return;
                }
                return;
            case 4:
                gw0 gw0Var = (gw0) this.f33448c;
                if (this.f33447b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                gw0Var.E = f7;
                return;
            case 5:
                v01 v01Var = (v01) this.f33448c;
                if (v01Var.h) {
                    org.telegram.ui.ActionBar.w0 w0Var = v01Var.f38409n.U0;
                    if (w0Var != null) {
                        w0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = v01Var.f38409n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = v01Var.f38409n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = v01Var.f38409n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    v01Var.setVisibility(8);
                }
                v01Var.f38409n.l5(false);
                return;
            case 6:
                y11 y11Var = (y11) this.f33448c;
                if (this.f33447b) {
                    y11Var.f40094c.setVisibility(8);
                    return;
                } else {
                    y11Var.f40095f.setVisibility(8);
                    return;
                }
            case 7:
                e51 e51Var = (e51) this.f33448c;
                if (this.f33447b) {
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
                y61 y61Var = (y61) this.f33448c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = y61Var.v;
                if (this.f33447b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                y61Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.sr.f28360g.getInterpolation(y61Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(y61Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                y61Var.N = null;
                return;
            case 9:
                a91 a91Var = (a91) this.f33448c;
                if (a91Var.f32017r != null && (z3Var = a91Var.f32018s) != null) {
                    if (!this.f33447b) {
                        z3Var.setVisibility(4);
                    }
                    a91Var.f32017r = null;
                    return;
                }
                return;
            case 10:
                ee1 ee1Var = (ee1) this.f33448c;
                if (this.f33447b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ee1Var.f33245y = f12;
                return;
            case 11:
                zg1 zg1Var = (zg1) this.f33448c;
                AnimatorSet animatorSet2 = zg1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f33447b) {
                        zg1Var.e.setVisibility(4);
                        return;
                    } else {
                        zg1Var.f40506b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.f33448c;
                fi.o oVar = v1Var.V;
                if (!v1Var.T) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                if (this.f33447b) {
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
                m0 m0Var = (m0) this.f33448c;
                fi.o oVar2 = m0Var.f39184b0;
                if (!m0Var.W) {
                    oVar2.setVisibility(8);
                }
                if (this.f33447b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                m0Var.f39182a0 = f14;
                oVar2.setAlpha(f14);
                m0Var.j(m0Var.f39182a0);
                m0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * m0Var.f39182a0);
                m0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * m0Var.f39182a0);
                m0Var.invalidate();
                return;
            case 14:
                qg.y1 y1Var = (qg.y1) this.f33448c;
                ((pg.n) y1Var).f41174y.f41306n.d();
                if (this.f33447b) {
                    y1Var.f42054w.accept(Integer.valueOf(y1Var.f42053s));
                }
                if (y1Var.getParent() != null) {
                    ((ViewGroup) y1Var.getParent()).removeView(y1Var);
                    return;
                }
                return;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f33448c;
                if (this.f33447b) {
                    limitPreviewView.f22339j0 = false;
                }
                Runnable runnable = limitPreviewView.f22340k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f22340k0.run();
                    return;
                }
                return;
            case 16:
                rg.p0 p0Var = (rg.p0) this.f33448c;
                if (this.f33447b) {
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
                zg.c0 c0Var = (zg.c0) this.f33448c;
                org.telegram.ui.Components.sk0 sk0Var = c0Var.f49309n;
                c0Var.k();
                c0Var.l();
                boolean z10 = this.f33447b;
                zg.c0.a(c0Var, z10);
                c0Var.f49308m.invalidateOutline();
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                c0Var.f49305j = f16;
                boolean z11 = true;
                if (z10) {
                    c0Var.f49306k = true;
                    c0Var.f49299a.invalidate();
                }
                sk0Var.setCustomEmojiEnterProgress(Utilities.clamp(c0Var.f49305j, 1.0f, 0.0f));
                if (!z10) {
                    sk0Var.setImportantForAccessibility(0);
                    sk0Var.setSkipDraw(false);
                    c0Var.f();
                    Runtime.getRuntime().gc();
                    int i11 = c0Var.f49319y;
                    sk0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : false);
                }
                c0Var.C = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33446a) {
            case 1:
                if (this.f33447b) {
                    ((tg0) this.f33448c).V.setVisibility(0);
                    return;
                }
                return;
            case 2:
                if (this.f33447b) {
                    ((PasscodeActivity) this.f33448c).v.setVisibility(0);
                    return;
                }
                return;
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                return;
            case 5:
                v01 v01Var = (v01) this.f33448c;
                org.telegram.ui.ActionBar.w0 w0Var = v01Var.f38409n.U0;
                if (w0Var != null && !this.f33447b) {
                    w0Var.setClickable(true);
                }
                ProfileActivity profileActivity = v01Var.f38409n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = v01Var.f38409n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = v01Var.f38409n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                v01Var.setVisibility(0);
                v01Var.f38409n.l5(false);
                return;
            case 6:
                y11 y11Var = (y11) this.f33448c;
                if (this.f33447b) {
                    y11Var.f40095f.setAlpha(0.0f);
                    y11Var.f40095f.setVisibility(0);
                    return;
                }
                y11Var.f40094c.setAlpha(0.0f);
                y11Var.f40094c.setVisibility(0);
                return;
        }
    }
}
