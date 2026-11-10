package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class c50 extends AnimatorListenerAdapter {
    public final int f44243a;
    public final boolean f44244b;
    public final Object f44245c;

    public c50(int i7, Object obj, boolean z9) {
        this.f44243a = i7;
        this.f44245c = obj;
        this.f44244b = z9;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f44243a) {
            case 0:
                ((g50) this.f44245c).h = null;
                return;
            case 3:
                an0 an0Var = (an0) this.f44245c;
                if (animator.equals(an0Var.f43763k0)) {
                    an0Var.f43763k0 = null;
                    return;
                }
                return;
            case 9:
                ((o31) this.f44245c).f48419n = null;
                return;
            case 11:
                cb1 cb1Var = (cb1) this.f44245c;
                AnimatorSet animatorSet = cb1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    cb1Var.I = null;
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
        yc ycVar;
        org.telegram.ui.Cells.b4 b4Var;
        int i7 = this.f44243a;
        float f10 = 0.0f;
        boolean z9 = this.f44244b;
        Object obj = this.f44245c;
        switch (i7) {
            case 0:
                g50 g50Var = (g50) obj;
                if (g50Var.h != null && (ycVar = g50Var.f45982f) != null) {
                    if (z9) {
                        ycVar.setVisibility(4);
                    } else {
                        g50Var.f45983n.setVisibility(4);
                    }
                    g50Var.h = null;
                    return;
                }
                return;
            case 1:
                fe0 fe0Var = (fe0) obj;
                if (!z9) {
                    fe0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = fe0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fe0Var.L = null;
                    return;
                }
                return;
            case 2:
                if (!z9) {
                    ((PasscodeActivity) obj).f41331w.setVisibility(8);
                    return;
                }
                return;
            case 3:
                an0 an0Var = (an0) obj;
                if (animator.equals(an0Var.f43763k0)) {
                    if (!z9) {
                        an0Var.Z.setVisibility(4);
                        an0Var.f43749a0.setVisibility(4);
                    }
                    an0Var.f43763k0 = null;
                    return;
                }
                return;
            case 4:
                cs0 cs0Var = (cs0) obj;
                if (z9) {
                    f10 = 1.0f;
                }
                cs0Var.E = f10;
                return;
            case 5:
                pw0 pw0Var = (pw0) obj;
                ProfileActivity profileActivity = pw0Var.f48849n;
                if (pw0Var.h) {
                    org.telegram.ui.ActionBar.g5 g5Var = profileActivity.T0;
                    if (g5Var != null) {
                        g5Var.setClickable(false);
                    }
                } else {
                    pw0Var.setVisibility(8);
                }
                RectF rectF = ProfileActivity.V6;
                profileActivity.O5(false);
                return;
            case 6:
                sx0 sx0Var = (sx0) obj;
                if (z9) {
                    sx0Var.f49981c.setVisibility(8);
                    return;
                } else {
                    sx0Var.f49983f.setVisibility(8);
                    return;
                }
            case 7:
                vz0 vz0Var = (vz0) obj;
                if (z9) {
                    f10 = 1.0f;
                }
                vz0Var.f50842w = f10;
                if (vz0Var.S) {
                    vz0Var.N.invalidate();
                    return;
                }
                return;
            case 8:
                p11 p11Var = (p11) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = p11Var.f48625w;
                if (z9) {
                    f10 = 1.0f;
                }
                p11Var.L = f10;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.wq.f40047g.getInterpolation(p11Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float s5 = org.telegram.messenger.g0.s(p11Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(s5);
                }
                p11Var.N = null;
                return;
            case 9:
                o31 o31Var = (o31) obj;
                if (o31Var.f48419n != null && (b4Var = o31Var.f48420r) != null) {
                    if (!z9) {
                        b4Var.setVisibility(4);
                    }
                    o31Var.f48419n = null;
                    return;
                }
                return;
            case 10:
                i81 i81Var = (i81) obj;
                if (z9) {
                    f10 = 1.0f;
                }
                i81Var.D = f10;
                return;
            case 11:
                cb1 cb1Var = (cb1) obj;
                AnimatorSet animatorSet2 = cb1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (z9) {
                        cb1Var.f44299e.setVisibility(4);
                        return;
                    } else {
                        cb1Var.f44294b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.k1 k1Var = (org.telegram.ui.web.k1) obj;
                bi.v vVar = k1Var.V;
                if (!k1Var.T) {
                    vVar.setVisibility(8);
                    vVar.setText("");
                }
                if (z9) {
                    f10 = 1.0f;
                }
                k1Var.U = f10;
                vVar.setAlpha(f10);
                k1Var.invalidate();
                if (k1Var.T) {
                    vVar.requestFocus();
                    org.telegram.messenger.g0.K3(vVar);
                    return;
                }
                vVar.clearFocus();
                org.telegram.messenger.g0.v1(vVar);
                return;
            case 13:
                l0 l0Var = (l0) obj;
                bi.v vVar2 = l0Var.f51124b0;
                if (!l0Var.W) {
                    vVar2.setVisibility(8);
                }
                if (z9) {
                    f10 = 1.0f;
                }
                l0Var.f51122a0 = f10;
                vVar2.setAlpha(f10);
                l0Var.j(l0Var.f51122a0);
                l0Var.R.setTranslationX(org.telegram.messenger.g0.L(56.0f) * l0Var.f51122a0);
                l0Var.O.setTranslationX(org.telegram.messenger.g0.L(112.0f) * l0Var.f51122a0);
                l0Var.invalidate();
                return;
            case 14:
                tg.o1 o1Var = (tg.o1) obj;
                ((sg.i) o1Var).D.f55195r1.c();
                if (z9) {
                    o1Var.f55903x.accept(Integer.valueOf(o1Var.f55901s));
                }
                if (o1Var.getParent() != null) {
                    ((ViewGroup) o1Var.getParent()).removeView(o1Var);
                    return;
                }
                return;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                if (z9) {
                    limitPreviewView.f31479j0 = false;
                }
                Runnable runnable = limitPreviewView.f31480k0;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                    limitPreviewView.f31480k0.run();
                    return;
                }
                return;
            case 16:
                ug.p0 p0Var = (ug.p0) obj;
                if (z9) {
                    f10 = 1.0f;
                }
                p0Var.O = f10;
                p0Var.f56768f.invalidate();
                ug.o0 o0Var = p0Var.h;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
            default:
                if (!z9) {
                    ((zh.m3) obj).f60484w.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f44243a) {
            case 1:
                if (this.f44244b) {
                    ((fe0) this.f44245c).V.setVisibility(0);
                    return;
                }
                return;
            case 2:
                if (this.f44244b) {
                    ((PasscodeActivity) this.f44245c).f41331w.setVisibility(0);
                    return;
                }
                return;
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                return;
            case 5:
                pw0 pw0Var = (pw0) this.f44245c;
                ProfileActivity profileActivity = pw0Var.f48849n;
                org.telegram.ui.ActionBar.g5 g5Var = profileActivity.T0;
                if (g5Var != null && !this.f44244b) {
                    g5Var.setClickable(true);
                }
                profileActivity.E5(true);
                pw0Var.setVisibility(0);
                profileActivity.O5(false);
                return;
            case 6:
                sx0 sx0Var = (sx0) this.f44245c;
                if (this.f44244b) {
                    sx0Var.f49983f.setAlpha(0.0f);
                    sx0Var.f49983f.setVisibility(0);
                    return;
                }
                sx0Var.f49981c.setAlpha(0.0f);
                sx0Var.f49981c.setVisibility(0);
                return;
        }
    }
}
