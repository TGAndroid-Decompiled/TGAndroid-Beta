package org.telegram.ui.ActionBar;

import c8.i9;
import org.telegram.ui.Components.er;
public final class s implements Runnable {
    public final boolean f29577a;
    public final boolean f29578b;
    public final boolean f29579c;
    public final ActionBarLayout d;

    public s(ActionBarLayout actionBarLayout, boolean z10, boolean z11, boolean z12) {
        this.d = actionBarLayout;
        this.f29577a = z10;
        this.f29578b = z11;
        this.f29579c = z12;
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
        boolean z10 = this.f29577a;
        if (z10) {
            actionBarLayout.C0 = System.currentTimeMillis();
        }
        long nanoTime = System.nanoTime() / 1000000;
        long j3 = nanoTime - actionBarLayout.M0;
        if (j3 > 40 && z10) {
            j3 = 0;
        } else if (j3 > 18) {
            j3 = 18;
        }
        actionBarLayout.M0 = nanoTime;
        boolean z11 = this.f29579c;
        boolean z12 = this.f29578b;
        if (z12 && z11) {
            f10 = 190.0f;
        } else {
            f10 = 150.0f;
        }
        float f11 = actionBarLayout.L0 + (((float) j3) / f10);
        actionBarLayout.L0 = f11;
        if (f11 > 1.0f) {
            actionBarLayout.L0 = 1.0f;
        }
        e2 e2Var = actionBarLayout.I;
        if (e2Var != null) {
            e2Var.onTransitionAnimationProgress(true, actionBarLayout.L0);
        }
        e2 e2Var2 = actionBarLayout.J;
        if (e2Var2 != null) {
            e2Var2.onTransitionAnimationProgress(false, actionBarLayout.L0);
        }
        e2 e2Var3 = actionBarLayout.J;
        if (e2Var3 != null) {
            num = Integer.valueOf(e2Var3.getNavigationBarColor());
        } else {
            num = null;
        }
        e2 e2Var4 = actionBarLayout.I;
        if (e2Var4 != null) {
            num2 = Integer.valueOf(e2Var4.getNavigationBarColor());
        }
        e2 e2Var5 = actionBarLayout.J;
        if (e2Var5 != null && e2Var5.isSupportEdgeToEdge() && num2 != null) {
            num = num2;
        }
        e2 e2Var6 = actionBarLayout.I;
        if (e2Var6 != null && e2Var6.isSupportEdgeToEdge() && num != null) {
            num2 = num;
        }
        if (actionBarLayout.I != null && num != null && num2 != null) {
            int f12 = i0.a.f(i9.a(actionBarLayout.L0 * 4.0f, 0.0f, 1.0f), num.intValue(), num2.intValue());
            r rVar = actionBarLayout.H;
            if (rVar != null && rVar.sheetsStack != null) {
                for (int i7 = 0; i7 < actionBarLayout.H.sheetsStack.size(); i7++) {
                    a2 a2Var = actionBarLayout.H.sheetsStack.get(i7);
                    if (a2Var.y()) {
                        f12 = a2Var.e(f12);
                    }
                }
            }
            actionBarLayout.I.setNavigationBarColor(f12);
        }
        if (z12) {
            if (z11) {
                interpolation = actionBarLayout.N.getInterpolation(actionBarLayout.L0);
            } else {
                interpolation = er.h.getInterpolation(actionBarLayout.L0);
            }
        } else {
            interpolation = actionBarLayout.M.getInterpolation(actionBarLayout.L0);
        }
        if (z11) {
            float a10 = i9.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.f28365s.setAlpha(a10);
            if (z12) {
                float f13 = (0.3f * interpolation) + 0.7f;
                actionBarLayout.f28365s.setScaleX(f13);
                actionBarLayout.f28365s.setScaleY(f13);
                if (actionBarLayout.K != null) {
                    float f14 = 1.0f - interpolation;
                    actionBarLayout.f28365s.setTranslationY(org.telegram.messenger.g0.L(40.0f) * f14);
                    actionBarLayout.K.setTranslationY((-org.telegram.messenger.g0.L(70.0f)) * f14);
                    float f15 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.K.setScaleX(f15);
                    actionBarLayout.K.setScaleY(f15);
                }
                actionBarLayout.f28362r.setAlpha((int) (46.0f * a10));
                j6.f29122s0.setAlpha((int) (a10 * 255.0f));
                actionBarLayout.f28365s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.f28365s.setTranslationX((1.0f - interpolation) * org.telegram.messenger.g0.L(48.0f));
            }
        } else {
            float f16 = 1.0f - interpolation;
            float a11 = i9.a(f16, 0.0f, 1.0f);
            actionBarLayout.f28374w.setAlpha(a11);
            if (z12) {
                float f17 = (f16 * 0.1f) + 0.9f;
                actionBarLayout.f28374w.setScaleX(f17);
                actionBarLayout.f28374w.setScaleY(f17);
                actionBarLayout.f28362r.setAlpha((int) (46.0f * a11));
                if (actionBarLayout.K == null) {
                    j6.f29122s0.setAlpha((int) (a11 * 255.0f));
                }
                actionBarLayout.f28365s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.f28374w.setTranslationX(org.telegram.messenger.g0.L(48.0f) * interpolation);
            }
        }
        if (actionBarLayout.L0 < 1.0f) {
            actionBarLayout.h0(z11, false, z12);
        } else {
            actionBarLayout.H(false);
        }
    }
}
