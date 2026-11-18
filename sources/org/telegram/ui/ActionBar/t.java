package org.telegram.ui.ActionBar;

import c8.l9;
import org.telegram.ui.Components.lr;
public final class t implements Runnable {
    public final boolean f29987a;
    public final boolean f29988b;
    public final boolean f29989c;
    public final ActionBarLayout d;

    public t(ActionBarLayout actionBarLayout, boolean z10, boolean z11, boolean z12) {
        this.d = actionBarLayout;
        this.f29987a = z10;
        this.f29988b = z11;
        this.f29989c = z12;
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
        boolean z10 = this.f29987a;
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
        boolean z11 = this.f29989c;
        boolean z12 = this.f29988b;
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
        h2 h2Var = actionBarLayout.I;
        if (h2Var != null) {
            h2Var.onTransitionAnimationProgress(true, actionBarLayout.L0);
        }
        h2 h2Var2 = actionBarLayout.J;
        if (h2Var2 != null) {
            h2Var2.onTransitionAnimationProgress(false, actionBarLayout.L0);
        }
        h2 h2Var3 = actionBarLayout.J;
        if (h2Var3 != null) {
            num = Integer.valueOf(h2Var3.getNavigationBarColor());
        } else {
            num = null;
        }
        h2 h2Var4 = actionBarLayout.I;
        if (h2Var4 != null) {
            num2 = Integer.valueOf(h2Var4.getNavigationBarColor());
        }
        h2 h2Var5 = actionBarLayout.J;
        if (h2Var5 != null && h2Var5.isSupportEdgeToEdge() && num2 != null) {
            num = num2;
        }
        h2 h2Var6 = actionBarLayout.I;
        if (h2Var6 != null && h2Var6.isSupportEdgeToEdge() && num != null) {
            num2 = num;
        }
        if (actionBarLayout.I != null && num != null && num2 != null) {
            int f12 = i0.a.f(l9.a(actionBarLayout.L0 * 4.0f, 0.0f, 1.0f), num.intValue(), num2.intValue());
            s sVar = actionBarLayout.H;
            if (sVar != null && sVar.sheetsStack != null) {
                for (int i7 = 0; i7 < actionBarLayout.H.sheetsStack.size(); i7++) {
                    d2 d2Var = actionBarLayout.H.sheetsStack.get(i7);
                    if (d2Var.y()) {
                        f12 = d2Var.e(f12);
                    }
                }
            }
            actionBarLayout.I.setNavigationBarColor(f12);
        }
        if (z12) {
            if (z11) {
                interpolation = actionBarLayout.N.getInterpolation(actionBarLayout.L0);
            } else {
                interpolation = lr.h.getInterpolation(actionBarLayout.L0);
            }
        } else {
            interpolation = actionBarLayout.M.getInterpolation(actionBarLayout.L0);
        }
        if (z11) {
            float a10 = l9.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.f28719s.setAlpha(a10);
            if (z12) {
                float f13 = (0.3f * interpolation) + 0.7f;
                actionBarLayout.f28719s.setScaleX(f13);
                actionBarLayout.f28719s.setScaleY(f13);
                if (actionBarLayout.K != null) {
                    float f14 = 1.0f - interpolation;
                    actionBarLayout.f28719s.setTranslationY(org.telegram.messenger.g0.L(40.0f) * f14);
                    actionBarLayout.K.setTranslationY((-org.telegram.messenger.g0.L(70.0f)) * f14);
                    float f15 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.K.setScaleX(f15);
                    actionBarLayout.K.setScaleY(f15);
                }
                actionBarLayout.f28716r.setAlpha((int) (46.0f * a10));
                n6.f29669s0.setAlpha((int) (a10 * 255.0f));
                actionBarLayout.f28719s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.f28719s.setTranslationX((1.0f - interpolation) * org.telegram.messenger.g0.L(48.0f));
            }
        } else {
            float f16 = 1.0f - interpolation;
            float a11 = l9.a(f16, 0.0f, 1.0f);
            actionBarLayout.f28728w.setAlpha(a11);
            if (z12) {
                float f17 = (f16 * 0.1f) + 0.9f;
                actionBarLayout.f28728w.setScaleX(f17);
                actionBarLayout.f28728w.setScaleY(f17);
                actionBarLayout.f28716r.setAlpha((int) (46.0f * a11));
                if (actionBarLayout.K == null) {
                    n6.f29669s0.setAlpha((int) (a11 * 255.0f));
                }
                actionBarLayout.f28719s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.f28728w.setTranslationX(org.telegram.messenger.g0.L(48.0f) * interpolation);
            }
        }
        if (actionBarLayout.L0 < 1.0f) {
            actionBarLayout.h0(z11, false, z12);
        } else {
            actionBarLayout.H(false);
        }
    }
}
