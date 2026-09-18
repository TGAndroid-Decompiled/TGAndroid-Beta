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
    public final int f34090a;
    public final boolean f34091b;
    public final Object f34092c;

    public h70(int i10, Object obj, boolean z10) {
        this.f34090a = i10;
        this.f34092c = obj;
        this.f34091b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f34090a) {
            case 0:
                ((l70) this.f34092c).h = null;
                return;
            case 3:
                cr0 cr0Var = (cr0) this.f34092c;
                if (animator.equals(cr0Var.f32774k0)) {
                    cr0Var.f32774k0 = null;
                    return;
                }
                return;
            case 9:
                ((f91) this.f34092c).f33486r = null;
                return;
            case 11:
                gh1 gh1Var = (gh1) this.f34092c;
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
        switch (this.f34090a) {
            case 0:
                l70 l70Var = (l70) this.f34092c;
                if (l70Var.h != null && (jdVar = l70Var.f35270f) != null) {
                    if (this.f34091b) {
                        jdVar.setVisibility(4);
                    } else {
                        l70Var.f35271n.setVisibility(4);
                    }
                    l70Var.h = null;
                    return;
                }
                return;
            case 1:
                xg0 xg0Var = (xg0) this.f34092c;
                if (!this.f34091b) {
                    xg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = xg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    xg0Var.L = null;
                    return;
                }
                return;
            case 2:
                if (!this.f34091b) {
                    ((PasscodeActivity) this.f34092c).v.setVisibility(8);
                    return;
                }
                return;
            case 3:
                cr0 cr0Var = (cr0) this.f34092c;
                if (animator.equals(cr0Var.f32774k0)) {
                    if (!this.f34091b) {
                        cr0Var.Z.setVisibility(4);
                        cr0Var.f32761a0.setVisibility(4);
                    }
                    cr0Var.f32774k0 = null;
                    return;
                }
                return;
            case 4:
                mw0 mw0Var = (mw0) this.f34092c;
                if (this.f34091b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                mw0Var.E = f7;
                return;
            case 5:
                c11 c11Var = (c11) this.f34092c;
                if (c11Var.h) {
                    org.telegram.ui.ActionBar.v0 v0Var = c11Var.f32504n.U0;
                    if (v0Var != null) {
                        v0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = c11Var.f32504n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = c11Var.f32504n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = c11Var.f32504n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    c11Var.setVisibility(8);
                }
                c11Var.f32504n.l5(false);
                return;
            case 6:
                f21 f21Var = (f21) this.f34092c;
                if (this.f34091b) {
                    f21Var.f33412c.setVisibility(8);
                    return;
                } else {
                    f21Var.f33413f.setVisibility(8);
                    return;
                }
            case 7:
                i51 i51Var = (i51) this.f34092c;
                if (this.f34091b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                i51Var.v = f10;
                if (i51Var.S) {
                    i51Var.N.invalidate();
                    return;
                }
                return;
            case 8:
                c71 c71Var = (c71) this.f34092c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c71Var.v;
                if (this.f34091b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                c71Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.qr.f27716g.getInterpolation(c71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(c71Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                c71Var.N = null;
                return;
            case 9:
                f91 f91Var = (f91) this.f34092c;
                if (f91Var.f33486r != null && (z3Var = f91Var.f33487s) != null) {
                    if (!this.f34091b) {
                        z3Var.setVisibility(4);
                    }
                    f91Var.f33486r = null;
                    return;
                }
                return;
            case 10:
                ke1 ke1Var = (ke1) this.f34092c;
                if (this.f34091b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ke1Var.f35083y = f12;
                return;
            case 11:
                gh1 gh1Var = (gh1) this.f34092c;
                AnimatorSet animatorSet2 = gh1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f34091b) {
                        gh1Var.e.setVisibility(4);
                        return;
                    } else {
                        gh1Var.f33848b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) this.f34092c;
                fi.o oVar = w1Var.V;
                if (!w1Var.T) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                if (this.f34091b) {
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
                k0 k0Var = (k0) this.f34092c;
                fi.o oVar2 = k0Var.f39077b0;
                if (!k0Var.W) {
                    oVar2.setVisibility(8);
                }
                if (this.f34091b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                k0Var.f39075a0 = f14;
                oVar2.setAlpha(f14);
                k0Var.j(k0Var.f39075a0);
                k0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * k0Var.f39075a0);
                k0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * k0Var.f39075a0);
                k0Var.invalidate();
                return;
            case 14:
                qg.y1 y1Var = (qg.y1) this.f34092c;
                ((pg.n) y1Var).f41173y.f41294n.d();
                if (this.f34091b) {
                    y1Var.f41993w.accept(Integer.valueOf(y1Var.f41992s));
                }
                if (y1Var.getParent() != null) {
                    ((ViewGroup) y1Var.getParent()).removeView(y1Var);
                    return;
                }
                return;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f34092c;
                if (this.f34091b) {
                    limitPreviewView.f22300j0 = false;
                }
                Runnable runnable = limitPreviewView.f22301k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f22301k0.run();
                    return;
                }
                return;
            case 16:
                rg.p0 p0Var = (rg.p0) this.f34092c;
                if (this.f34091b) {
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
                zg.b0 b0Var = (zg.b0) this.f34092c;
                org.telegram.ui.Components.qk0 qk0Var = b0Var.f49236n;
                b0Var.k();
                b0Var.l();
                boolean z10 = this.f34091b;
                zg.b0.a(b0Var, z10);
                b0Var.f49235m.invalidateOutline();
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                b0Var.f49232j = f16;
                boolean z11 = true;
                if (z10) {
                    b0Var.f49233k = true;
                    b0Var.f49226a.invalidate();
                }
                qk0Var.setCustomEmojiEnterProgress(Utilities.clamp(b0Var.f49232j, 1.0f, 0.0f));
                if (!z10) {
                    qk0Var.setImportantForAccessibility(0);
                    qk0Var.setSkipDraw(false);
                    b0Var.f();
                    Runtime.getRuntime().gc();
                    int i11 = b0Var.f49246y;
                    qk0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : false);
                }
                b0Var.C = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f34090a) {
            case 1:
                if (this.f34091b) {
                    ((xg0) this.f34092c).V.setVisibility(0);
                    return;
                }
                return;
            case 2:
                if (this.f34091b) {
                    ((PasscodeActivity) this.f34092c).v.setVisibility(0);
                    return;
                }
                return;
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                return;
            case 5:
                c11 c11Var = (c11) this.f34092c;
                org.telegram.ui.ActionBar.v0 v0Var = c11Var.f32504n.U0;
                if (v0Var != null && !this.f34091b) {
                    v0Var.setClickable(true);
                }
                ProfileActivity profileActivity = c11Var.f32504n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = c11Var.f32504n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = c11Var.f32504n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                c11Var.setVisibility(0);
                c11Var.f32504n.l5(false);
                return;
            case 6:
                f21 f21Var = (f21) this.f34092c;
                if (this.f34091b) {
                    f21Var.f33413f.setAlpha(0.0f);
                    f21Var.f33413f.setVisibility(0);
                    return;
                }
                f21Var.f33412c.setAlpha(0.0f);
                f21Var.f33412c.setVisibility(0);
                return;
        }
    }
}
