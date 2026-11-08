package org.telegram.ui.ActionBar;

import c8.j9;
import org.telegram.ui.Components.xq;
public final class t implements Runnable {
    public final boolean f28498a;
    public final boolean f28499b;
    public final boolean f28500c;
    public final ActionBarLayout d;

    public t(ActionBarLayout actionBarLayout, boolean z9, boolean z10, boolean z11) {
        this.d = actionBarLayout;
        this.f28498a = z9;
        this.f28499b = z10;
        this.f28500c = z11;
    }

    @Override
    public final void run() {
        float f10;
        Integer num;
        float interpolation;
        ActionBarLayout actionBarLayout = this.d;
        if (actionBarLayout.J0 != this) {
            return;
        }
        Integer num2 = null;
        actionBarLayout.J0 = null;
        boolean z9 = this.f28498a;
        if (z9) {
            actionBarLayout.B0 = System.currentTimeMillis();
        }
        long nanoTime = System.nanoTime() / 1000000;
        long j3 = nanoTime - actionBarLayout.L0;
        if (j3 > 40 && z9) {
            j3 = 0;
        } else if (j3 > 18) {
            j3 = 18;
        }
        actionBarLayout.L0 = nanoTime;
        boolean z10 = this.f28500c;
        boolean z11 = this.f28499b;
        if (z11 && z10) {
            f10 = 190.0f;
        } else {
            f10 = 150.0f;
        }
        float f11 = actionBarLayout.K0 + (((float) j3) / f10);
        actionBarLayout.K0 = f11;
        if (f11 > 1.0f) {
            actionBarLayout.K0 = 1.0f;
        }
        f2 f2Var = actionBarLayout.H;
        if (f2Var != null) {
            f2Var.onTransitionAnimationProgress(true, actionBarLayout.K0);
        }
        f2 f2Var2 = actionBarLayout.I;
        if (f2Var2 != null) {
            f2Var2.onTransitionAnimationProgress(false, actionBarLayout.K0);
        }
        f2 f2Var3 = actionBarLayout.I;
        if (f2Var3 != null) {
            num = Integer.valueOf(f2Var3.getNavigationBarColor());
        } else {
            num = null;
        }
        f2 f2Var4 = actionBarLayout.H;
        if (f2Var4 != null) {
            num2 = Integer.valueOf(f2Var4.getNavigationBarColor());
        }
        f2 f2Var5 = actionBarLayout.I;
        if (f2Var5 != null && f2Var5.isSupportEdgeToEdge() && num2 != null) {
            num = num2;
        }
        f2 f2Var6 = actionBarLayout.H;
        if (f2Var6 != null && f2Var6.isSupportEdgeToEdge() && num != null) {
            num2 = num;
        }
        if (actionBarLayout.H != null && num != null && num2 != null) {
            int f12 = i0.a.f(j9.a(actionBarLayout.K0 * 4.0f, 0.0f, 1.0f), num.intValue(), num2.intValue());
            s sVar = actionBarLayout.G;
            if (sVar != null && sVar.sheetsStack != null) {
                for (int i7 = 0; i7 < actionBarLayout.G.sheetsStack.size(); i7++) {
                    b2 b2Var = actionBarLayout.G.sheetsStack.get(i7);
                    if (b2Var.y()) {
                        f12 = b2Var.e(f12);
                    }
                }
            }
            actionBarLayout.H.setNavigationBarColor(f12);
        }
        if (z11) {
            if (z10) {
                interpolation = actionBarLayout.M.getInterpolation(actionBarLayout.K0);
            } else {
                interpolation = xq.h.getInterpolation(actionBarLayout.K0);
            }
        } else {
            interpolation = actionBarLayout.L.getInterpolation(actionBarLayout.K0);
        }
        if (z10) {
            float a10 = j9.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.f27270s.setAlpha(a10);
            if (z11) {
                float f13 = (0.3f * interpolation) + 0.7f;
                actionBarLayout.f27270s.setScaleX(f13);
                actionBarLayout.f27270s.setScaleY(f13);
                if (actionBarLayout.J != null) {
                    float f14 = 1.0f - interpolation;
                    actionBarLayout.f27270s.setTranslationY(org.telegram.messenger.g0.L(40.0f) * f14);
                    actionBarLayout.J.setTranslationY((-org.telegram.messenger.g0.L(70.0f)) * f14);
                    float f15 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.J.setScaleX(f15);
                    actionBarLayout.J.setScaleY(f15);
                }
                actionBarLayout.f27267r.setAlpha((int) (46.0f * a10));
                k6.f28125s0.setAlpha((int) (a10 * 255.0f));
                actionBarLayout.f27270s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.f27270s.setTranslationX((1.0f - interpolation) * org.telegram.messenger.g0.L(48.0f));
            }
        } else {
            float f16 = 1.0f - interpolation;
            float a11 = j9.a(f16, 0.0f, 1.0f);
            actionBarLayout.f27278w.setAlpha(a11);
            if (z11) {
                float f17 = (f16 * 0.1f) + 0.9f;
                actionBarLayout.f27278w.setScaleX(f17);
                actionBarLayout.f27278w.setScaleY(f17);
                actionBarLayout.f27267r.setAlpha((int) (46.0f * a11));
                if (actionBarLayout.J == null) {
                    k6.f28125s0.setAlpha((int) (a11 * 255.0f));
                }
                actionBarLayout.f27270s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.f27278w.setTranslationX(org.telegram.messenger.g0.L(48.0f) * interpolation);
            }
        }
        if (actionBarLayout.K0 < 1.0f) {
            actionBarLayout.h0(z10, false, z11);
        } else {
            actionBarLayout.H(false);
        }
    }
}
