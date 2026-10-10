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
    public final int f37513a;
    public final boolean f37514b;
    public final Object f37515c;

    public f70(int i10, Object obj, boolean z10) {
        this.f37513a = i10;
        this.f37515c = obj;
        this.f37514b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37513a) {
            case 0:
                ((j70) this.f37515c).h = null;
                return;
            case 3:
                br0 br0Var = (br0) this.f37515c;
                if (animator.equals(br0Var.f36448k0)) {
                    br0Var.f36448k0 = null;
                    return;
                }
                return;
            case 9:
                ((i91) this.f37515c).f38632r = null;
                return;
            case 11:
                ih1 ih1Var = (ih1) this.f37515c;
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
        org.telegram.ui.Cells.z3 z3Var;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        switch (this.f37513a) {
            case 0:
                j70 j70Var = (j70) this.f37515c;
                if (j70Var.h != null && (jdVar = j70Var.f38893f) != null) {
                    if (this.f37514b) {
                        jdVar.setVisibility(4);
                    } else {
                        j70Var.f38894n.setVisibility(4);
                    }
                    j70Var.h = null;
                    return;
                }
                return;
            case 1:
                wg0 wg0Var = (wg0) this.f37515c;
                if (!this.f37514b) {
                    wg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = wg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    wg0Var.L = null;
                    return;
                }
                return;
            case 2:
                if (!this.f37514b) {
                    ((PasscodeActivity) this.f37515c).v.setVisibility(8);
                    return;
                }
                return;
            case 3:
                br0 br0Var = (br0) this.f37515c;
                if (animator.equals(br0Var.f36448k0)) {
                    if (!this.f37514b) {
                        br0Var.Z.setVisibility(4);
                        br0Var.f36434a0.setVisibility(4);
                    }
                    br0Var.f36448k0 = null;
                    return;
                }
                return;
            case 4:
                mw0 mw0Var = (mw0) this.f37515c;
                if (this.f37514b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                mw0Var.E = f7;
                return;
            case 5:
                b11 b11Var = (b11) this.f37515c;
                if (b11Var.h) {
                    org.telegram.ui.ActionBar.v0 v0Var = b11Var.f36139n.U0;
                    if (v0Var != null) {
                        v0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = b11Var.f36139n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = b11Var.f36139n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = b11Var.f36139n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    b11Var.setVisibility(8);
                }
                b11Var.f36139n.l5(false);
                return;
            case 6:
                f21 f21Var = (f21) this.f37515c;
                if (this.f37514b) {
                    f21Var.f37474c.setVisibility(8);
                    return;
                } else {
                    f21Var.f37476f.setVisibility(8);
                    return;
                }
            case 7:
                k51 k51Var = (k51) this.f37515c;
                if (this.f37514b) {
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
                g71 g71Var = (g71) this.f37515c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g71Var.v;
                if (this.f37514b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                g71Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.is.f27444g.getInterpolation(g71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(g71Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                g71Var.N = null;
                return;
            case 9:
                i91 i91Var = (i91) this.f37515c;
                if (i91Var.f38632r != null && (z3Var = i91Var.f38633s) != null) {
                    if (!this.f37514b) {
                        z3Var.setVisibility(4);
                    }
                    i91Var.f38632r = null;
                    return;
                }
                return;
            case 10:
                me1 me1Var = (me1) this.f37515c;
                if (this.f37514b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                me1Var.f39937y = f12;
                return;
            case 11:
                ih1 ih1Var = (ih1) this.f37515c;
                AnimatorSet animatorSet2 = ih1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f37514b) {
                        ih1Var.f38693e.setVisibility(4);
                        return;
                    } else {
                        ih1Var.f38688b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.f37515c;
                fi.o oVar = u1Var.V;
                if (!u1Var.T) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                if (this.f37514b) {
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
                l0 l0Var = (l0) this.f37515c;
                fi.o oVar2 = l0Var.f43523b0;
                if (!l0Var.W) {
                    oVar2.setVisibility(8);
                }
                if (this.f37514b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                l0Var.f43521a0 = f14;
                oVar2.setAlpha(f14);
                l0Var.j(l0Var.f43521a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.f43521a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.f43521a0);
                l0Var.invalidate();
                return;
            case 14:
                qg.z1 z1Var = (qg.z1) this.f37515c;
                ((pg.n) z1Var).f45748y.f45881n.d();
                if (this.f37514b) {
                    z1Var.f46696w.accept(Integer.valueOf(z1Var.f46695s));
                }
                if (z1Var.getParent() != null) {
                    ((ViewGroup) z1Var.getParent()).removeView(z1Var);
                    return;
                }
                return;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f37515c;
                if (this.f37514b) {
                    limitPreviewView.f24253j0 = false;
                }
                Runnable runnable = limitPreviewView.f24254k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f24254k0.run();
                    return;
                }
                return;
            case 16:
                rg.p0 p0Var = (rg.p0) this.f37515c;
                if (this.f37514b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                p0Var.M = f15;
                p0Var.d.invalidate();
                rg.o0 o0Var = p0Var.f47426e;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
            default:
                zg.a0 a0Var = (zg.a0) this.f37515c;
                org.telegram.ui.Components.ll0 ll0Var = a0Var.f54504n;
                a0Var.k();
                a0Var.l();
                boolean z10 = this.f37514b;
                zg.a0.a(a0Var, z10);
                a0Var.f54503m.invalidateOutline();
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                a0Var.f54500j = f16;
                boolean z11 = true;
                if (z10) {
                    a0Var.f54501k = true;
                    a0Var.f54493a.invalidate();
                }
                ll0Var.setCustomEmojiEnterProgress(Utilities.clamp(a0Var.f54500j, 1.0f, 0.0f));
                if (!z10) {
                    ll0Var.setImportantForAccessibility(0);
                    ll0Var.setSkipDraw(false);
                    a0Var.f();
                    Runtime.getRuntime().gc();
                    int i11 = a0Var.f54514y;
                    ll0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : false);
                }
                a0Var.C = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37513a) {
            case 1:
                if (this.f37514b) {
                    ((wg0) this.f37515c).V.setVisibility(0);
                    return;
                }
                return;
            case 2:
                if (this.f37514b) {
                    ((PasscodeActivity) this.f37515c).v.setVisibility(0);
                    return;
                }
                return;
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                return;
            case 5:
                b11 b11Var = (b11) this.f37515c;
                org.telegram.ui.ActionBar.v0 v0Var = b11Var.f36139n.U0;
                if (v0Var != null && !this.f37514b) {
                    v0Var.setClickable(true);
                }
                ProfileActivity profileActivity = b11Var.f36139n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = b11Var.f36139n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = b11Var.f36139n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                b11Var.setVisibility(0);
                b11Var.f36139n.l5(false);
                return;
            case 6:
                f21 f21Var = (f21) this.f37515c;
                if (this.f37514b) {
                    f21Var.f37476f.setAlpha(0.0f);
                    f21Var.f37476f.setVisibility(0);
                    return;
                }
                f21Var.f37474c.setAlpha(0.0f);
                f21Var.f37474c.setVisibility(0);
                return;
        }
    }
}
