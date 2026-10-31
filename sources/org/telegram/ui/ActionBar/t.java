package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.gr;
public final class t implements Runnable {
    public final boolean f20821a;
    public final boolean f20822b;
    public final boolean f20823c;
    public final ActionBarLayout d;

    public t(ActionBarLayout actionBarLayout, boolean z10, boolean z11, boolean z12) {
        this.d = actionBarLayout;
        this.f20821a = z10;
        this.f20822b = z11;
        this.f20823c = z12;
    }

    @Override
    public final void run() {
        float f7;
        Integer num;
        float interpolation;
        ActionBarLayout actionBarLayout = this.d;
        if (actionBarLayout.J0 != this) {
            return;
        }
        Integer num2 = null;
        actionBarLayout.J0 = null;
        boolean z10 = this.f20821a;
        if (z10) {
            actionBarLayout.B0 = System.currentTimeMillis();
        }
        long nanoTime = System.nanoTime() / 1000000;
        long j10 = nanoTime - actionBarLayout.L0;
        if (j10 > 40 && z10) {
            j10 = 0;
        } else if (j10 > 18) {
            j10 = 18;
        }
        actionBarLayout.L0 = nanoTime;
        boolean z11 = this.f20823c;
        boolean z12 = this.f20822b;
        if (z12 && z11) {
            f7 = 190.0f;
        } else {
            f7 = 150.0f;
        }
        float f10 = actionBarLayout.K0 + (((float) j10) / f7);
        actionBarLayout.K0 = f10;
        if (f10 > 1.0f) {
            actionBarLayout.K0 = 1.0f;
        }
        k2 k2Var = actionBarLayout.H;
        if (k2Var != null) {
            k2Var.onTransitionAnimationProgress(true, actionBarLayout.K0);
        }
        k2 k2Var2 = actionBarLayout.I;
        if (k2Var2 != null) {
            k2Var2.onTransitionAnimationProgress(false, actionBarLayout.K0);
        }
        k2 k2Var3 = actionBarLayout.I;
        if (k2Var3 != null) {
            num = Integer.valueOf(k2Var3.getNavigationBarColor());
        } else {
            num = null;
        }
        k2 k2Var4 = actionBarLayout.H;
        if (k2Var4 != null) {
            num2 = Integer.valueOf(k2Var4.getNavigationBarColor());
        }
        k2 k2Var5 = actionBarLayout.I;
        if (k2Var5 != null && k2Var5.isSupportEdgeToEdge() && num2 != null) {
            num = num2;
        }
        k2 k2Var6 = actionBarLayout.H;
        if (k2Var6 != null && k2Var6.isSupportEdgeToEdge() && num != null) {
            num2 = num;
        }
        if (actionBarLayout.H != null && num != null && num2 != null) {
            int f11 = i0.b.f(w7.u.a(actionBarLayout.K0 * 4.0f, 0.0f, 1.0f), num.intValue(), num2.intValue());
            s sVar = actionBarLayout.G;
            if (sVar != null && sVar.sheetsStack != null) {
                for (int i10 = 0; i10 < actionBarLayout.G.sheetsStack.size(); i10++) {
                    g2 g2Var = actionBarLayout.G.sheetsStack.get(i10);
                    if (g2Var.z()) {
                        f11 = g2Var.e(f11);
                    }
                }
            }
            actionBarLayout.H.setNavigationBarColor(f11);
        }
        if (z12) {
            if (z11) {
                interpolation = actionBarLayout.M.getInterpolation(actionBarLayout.K0);
            } else {
                interpolation = gr.h.getInterpolation(actionBarLayout.K0);
            }
        } else {
            interpolation = actionBarLayout.L.getInterpolation(actionBarLayout.K0);
        }
        if (z11) {
            float a2 = w7.u.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.f20109s.setAlpha(a2);
            if (z12) {
                float f12 = (0.3f * interpolation) + 0.7f;
                actionBarLayout.f20109s.setScaleX(f12);
                actionBarLayout.f20109s.setScaleY(f12);
                if (actionBarLayout.J != null) {
                    float f13 = 1.0f - interpolation;
                    actionBarLayout.f20109s.setTranslationY(org.telegram.messenger.i0.L(40.0f) * f13);
                    actionBarLayout.J.setTranslationY((-org.telegram.messenger.i0.L(70.0f)) * f13);
                    float f14 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.J.setScaleX(f14);
                    actionBarLayout.J.setScaleY(f14);
                }
                actionBarLayout.f20106r.setAlpha((int) (46.0f * a2));
                t6.f21198s0.setAlpha((int) (a2 * 255.0f));
                actionBarLayout.f20109s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.f20109s.setTranslationX((1.0f - interpolation) * org.telegram.messenger.i0.L(48.0f));
            }
        } else {
            float f15 = 1.0f - interpolation;
            float a10 = w7.u.a(f15, 0.0f, 1.0f);
            actionBarLayout.f20117w.setAlpha(a10);
            if (z12) {
                float f16 = (f15 * 0.1f) + 0.9f;
                actionBarLayout.f20117w.setScaleX(f16);
                actionBarLayout.f20117w.setScaleY(f16);
                actionBarLayout.f20106r.setAlpha((int) (46.0f * a10));
                if (actionBarLayout.J == null) {
                    t6.f21198s0.setAlpha((int) (a10 * 255.0f));
                }
                actionBarLayout.f20109s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.f20117w.setTranslationX(org.telegram.messenger.i0.L(48.0f) * interpolation);
            }
        }
        if (actionBarLayout.K0 < 1.0f) {
            actionBarLayout.g0(z11, false, z12);
        } else {
            actionBarLayout.G(false);
        }
    }
}
