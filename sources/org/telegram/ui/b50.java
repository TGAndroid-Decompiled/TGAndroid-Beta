package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class b50 extends AnimatorListenerAdapter {
    public final int f43900a;
    public final boolean f43901b;
    public final Object f43902c;

    public b50(int i7, Object obj, boolean z9) {
        this.f43900a = i7;
        this.f43902c = obj;
        this.f43901b = z9;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f43900a) {
            case 0:
                ((f50) this.f43902c).h = null;
                return;
            case 3:
                zm0 zm0Var = (zm0) this.f43902c;
                if (animator.equals(zm0Var.f52613k0)) {
                    zm0Var.f52613k0 = null;
                    return;
                }
                return;
            case 9:
                ((n31) this.f43902c).f48085n = null;
                return;
            case 11:
                bb1 bb1Var = (bb1) this.f43902c;
                AnimatorSet animatorSet = bb1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    bb1Var.I = null;
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
        int i7 = this.f43900a;
        float f10 = 0.0f;
        boolean z9 = this.f43901b;
        Object obj = this.f43902c;
        switch (i7) {
            case 0:
                f50 f50Var = (f50) obj;
                if (f50Var.h != null && (ycVar = f50Var.f45588f) != null) {
                    if (z9) {
                        ycVar.setVisibility(4);
                    } else {
                        f50Var.f45589n.setVisibility(4);
                    }
                    f50Var.h = null;
                    return;
                }
                return;
            case 1:
                ee0 ee0Var = (ee0) obj;
                if (!z9) {
                    ee0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = ee0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ee0Var.L = null;
                    return;
                }
                return;
            case 2:
                if (!z9) {
                    ((PasscodeActivity) obj).f41340w.setVisibility(8);
                    return;
                }
                return;
            case 3:
                zm0 zm0Var = (zm0) obj;
                if (animator.equals(zm0Var.f52613k0)) {
                    if (!z9) {
                        zm0Var.Z.setVisibility(4);
                        zm0Var.f52599a0.setVisibility(4);
                    }
                    zm0Var.f52613k0 = null;
                    return;
                }
                return;
            case 4:
                bs0 bs0Var = (bs0) obj;
                if (z9) {
                    f10 = 1.0f;
                }
                bs0Var.E = f10;
                return;
            case 5:
                ow0 ow0Var = (ow0) obj;
                ProfileActivity profileActivity = ow0Var.f48533n;
                if (ow0Var.h) {
                    org.telegram.ui.ActionBar.f5 f5Var = profileActivity.T0;
                    if (f5Var != null) {
                        f5Var.setClickable(false);
                    }
                } else {
                    ow0Var.setVisibility(8);
                }
                RectF rectF = ProfileActivity.V6;
                profileActivity.O5(false);
                return;
            case 6:
                rx0 rx0Var = (rx0) obj;
                if (z9) {
                    rx0Var.f49624c.setVisibility(8);
                    return;
                } else {
                    rx0Var.f49626f.setVisibility(8);
                    return;
                }
            case 7:
                uz0 uz0Var = (uz0) obj;
                if (z9) {
                    f10 = 1.0f;
                }
                uz0Var.f50513w = f10;
                if (uz0Var.S) {
                    uz0Var.N.invalidate();
                    return;
                }
                return;
            case 8:
                o11 o11Var = (o11) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = o11Var.f48290w;
                if (z9) {
                    f10 = 1.0f;
                }
                o11Var.L = f10;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.xq.f40459g.getInterpolation(o11Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float s5 = org.telegram.messenger.g0.s(o11Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(s5);
                }
                o11Var.N = null;
                return;
            case 9:
                n31 n31Var = (n31) obj;
                if (n31Var.f48085n != null && (b4Var = n31Var.f48086r) != null) {
                    if (!z9) {
                        b4Var.setVisibility(4);
                    }
                    n31Var.f48085n = null;
                    return;
                }
                return;
            case 10:
                h81 h81Var = (h81) obj;
                if (z9) {
                    f10 = 1.0f;
                }
                h81Var.D = f10;
                return;
            case 11:
                bb1 bb1Var = (bb1) obj;
                AnimatorSet animatorSet2 = bb1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (z9) {
                        bb1Var.f43957e.setVisibility(4);
                        return;
                    } else {
                        bb1Var.f43952b.setVisibility(4);
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
                bi.v vVar2 = l0Var.f51170b0;
                if (!l0Var.W) {
                    vVar2.setVisibility(8);
                }
                if (z9) {
                    f10 = 1.0f;
                }
                l0Var.f51168a0 = f10;
                vVar2.setAlpha(f10);
                l0Var.j(l0Var.f51168a0);
                l0Var.R.setTranslationX(org.telegram.messenger.g0.L(56.0f) * l0Var.f51168a0);
                l0Var.O.setTranslationX(org.telegram.messenger.g0.L(112.0f) * l0Var.f51168a0);
                l0Var.invalidate();
                return;
            case 14:
                tg.o1 o1Var = (tg.o1) obj;
                ((sg.i) o1Var).D.f55196o1.c();
                if (z9) {
                    o1Var.f55904x.accept(Integer.valueOf(o1Var.f55902s));
                }
                if (o1Var.getParent() != null) {
                    ((ViewGroup) o1Var.getParent()).removeView(o1Var);
                    return;
                }
                return;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                if (z9) {
                    limitPreviewView.f31468j0 = false;
                }
                Runnable runnable = limitPreviewView.f31469k0;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                    limitPreviewView.f31469k0.run();
                    return;
                }
                return;
            case 16:
                ug.p0 p0Var = (ug.p0) obj;
                if (z9) {
                    f10 = 1.0f;
                }
                p0Var.O = f10;
                p0Var.f56769f.invalidate();
                ug.o0 o0Var = p0Var.h;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
            default:
                if (!z9) {
                    ((zh.m3) obj).f60477w.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f43900a) {
            case 1:
                if (this.f43901b) {
                    ((ee0) this.f43902c).V.setVisibility(0);
                    return;
                }
                return;
            case 2:
                if (this.f43901b) {
                    ((PasscodeActivity) this.f43902c).f41340w.setVisibility(0);
                    return;
                }
                return;
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                return;
            case 5:
                ow0 ow0Var = (ow0) this.f43902c;
                ProfileActivity profileActivity = ow0Var.f48533n;
                org.telegram.ui.ActionBar.f5 f5Var = profileActivity.T0;
                if (f5Var != null && !this.f43901b) {
                    f5Var.setClickable(true);
                }
                profileActivity.E5(true);
                ow0Var.setVisibility(0);
                profileActivity.O5(false);
                return;
            case 6:
                rx0 rx0Var = (rx0) this.f43902c;
                if (this.f43901b) {
                    rx0Var.f49626f.setAlpha(0.0f);
                    rx0Var.f49626f.setVisibility(0);
                    return;
                }
                rx0Var.f49624c.setAlpha(0.0f);
                rx0Var.f49624c.setVisibility(0);
                return;
        }
    }
}
