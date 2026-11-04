package org.telegram.ui.ActionBar;

import b8.be;
import org.telegram.ui.Components.xq;
public final class s implements Runnable {
    public final boolean f28517a;
    public final boolean f28518b;
    public final boolean f28519c;
    public final ActionBarLayout d;

    public s(ActionBarLayout actionBarLayout, boolean z10, boolean z11, boolean z12) {
        this.d = actionBarLayout;
        this.f28517a = z10;
        this.f28518b = z11;
        this.f28519c = z12;
    }

    @Override
    public final void run() {
        float f10;
        Integer num;
        float interpolation;
        ActionBarLayout actionBarLayout = this.d;
        if (actionBarLayout.K0 != this) {
            return;
        }
        Integer num2 = null;
        actionBarLayout.K0 = null;
        boolean z10 = this.f28517a;
        if (z10) {
            actionBarLayout.C0 = System.currentTimeMillis();
        }
        long nanoTime = System.nanoTime() / 1000000;
        long j10 = nanoTime - actionBarLayout.M0;
        if (j10 > 40 && z10) {
            j10 = 0;
        } else if (j10 > 18) {
            j10 = 18;
        }
        actionBarLayout.M0 = nanoTime;
        boolean z11 = this.f28519c;
        boolean z12 = this.f28518b;
        if (z12 && z11) {
            f10 = 190.0f;
        } else {
            f10 = 150.0f;
        }
        float f11 = actionBarLayout.L0 + (((float) j10) / f10);
        actionBarLayout.L0 = f11;
        if (f11 > 1.0f) {
            actionBarLayout.L0 = 1.0f;
        }
        d2 d2Var = actionBarLayout.I;
        if (d2Var != null) {
            d2Var.onTransitionAnimationProgress(true, actionBarLayout.L0);
        }
        d2 d2Var2 = actionBarLayout.J;
        if (d2Var2 != null) {
            d2Var2.onTransitionAnimationProgress(false, actionBarLayout.L0);
        }
        d2 d2Var3 = actionBarLayout.J;
        if (d2Var3 != null) {
            num = Integer.valueOf(d2Var3.getNavigationBarColor());
        } else {
            num = null;
        }
        d2 d2Var4 = actionBarLayout.I;
        if (d2Var4 != null) {
            num2 = Integer.valueOf(d2Var4.getNavigationBarColor());
        }
        d2 d2Var5 = actionBarLayout.J;
        if (d2Var5 != null && d2Var5.isSupportEdgeToEdge() && num2 != null) {
            num = num2;
        }
        d2 d2Var6 = actionBarLayout.I;
        if (d2Var6 != null && d2Var6.isSupportEdgeToEdge() && num != null) {
            num2 = num;
        }
        if (actionBarLayout.I != null && num != null && num2 != null) {
            int f12 = i0.a.f(be.a(actionBarLayout.L0 * 4.0f, 0.0f, 1.0f), num.intValue(), num2.intValue());
            r rVar = actionBarLayout.H;
            if (rVar != null && rVar.sheetsStack != null) {
                for (int i3 = 0; i3 < actionBarLayout.H.sheetsStack.size(); i3++) {
                    z1 z1Var = actionBarLayout.H.sheetsStack.get(i3);
                    if (z1Var.y()) {
                        f12 = z1Var.e(f12);
                    }
                }
            }
            actionBarLayout.I.setNavigationBarColor(f12);
        }
        if (z12) {
            if (z11) {
                interpolation = actionBarLayout.N.getInterpolation(actionBarLayout.L0);
            } else {
                interpolation = xq.h.getInterpolation(actionBarLayout.L0);
            }
        } else {
            interpolation = actionBarLayout.M.getInterpolation(actionBarLayout.L0);
        }
        if (z11) {
            float a10 = be.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.f27316s.setAlpha(a10);
            if (z12) {
                float f13 = (0.3f * interpolation) + 0.7f;
                actionBarLayout.f27316s.setScaleX(f13);
                actionBarLayout.f27316s.setScaleY(f13);
                if (actionBarLayout.K != null) {
                    float f14 = 1.0f - interpolation;
                    actionBarLayout.f27316s.setTranslationY(org.telegram.messenger.g0.L(40.0f) * f14);
                    actionBarLayout.K.setTranslationY((-org.telegram.messenger.g0.L(70.0f)) * f14);
                    float f15 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.K.setScaleX(f15);
                    actionBarLayout.K.setScaleY(f15);
                }
                actionBarLayout.f27313r.setAlpha((int) (46.0f * a10));
                k6.f28153s0.setAlpha((int) (a10 * 255.0f));
                actionBarLayout.f27316s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.f27316s.setTranslationX((1.0f - interpolation) * org.telegram.messenger.g0.L(48.0f));
            }
        } else {
            float f16 = 1.0f - interpolation;
            float a11 = be.a(f16, 0.0f, 1.0f);
            actionBarLayout.f27325w.setAlpha(a11);
            if (z12) {
                float f17 = (f16 * 0.1f) + 0.9f;
                actionBarLayout.f27325w.setScaleX(f17);
                actionBarLayout.f27325w.setScaleY(f17);
                actionBarLayout.f27313r.setAlpha((int) (46.0f * a11));
                if (actionBarLayout.K == null) {
                    k6.f28153s0.setAlpha((int) (a11 * 255.0f));
                }
                actionBarLayout.f27316s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.f27325w.setTranslationX(org.telegram.messenger.g0.L(48.0f) * interpolation);
            }
        }
        if (actionBarLayout.L0 < 1.0f) {
            actionBarLayout.h0(z11, false, z12);
        } else {
            actionBarLayout.H(false);
        }
    }
}
