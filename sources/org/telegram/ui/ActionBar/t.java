package org.telegram.ui.ActionBar;

import a8.ee;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
public final class t implements Runnable {
    public final boolean f23091a;
    public final boolean f23092b;
    public final boolean f23093c;
    public final ActionBarLayout d;

    public t(ActionBarLayout actionBarLayout, boolean z10, boolean z11, boolean z12) {
        this.d = actionBarLayout;
        this.f23091a = z10;
        this.f23092b = z11;
        this.f23093c = z12;
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
        boolean z10 = this.f23091a;
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
        boolean z11 = this.f23093c;
        boolean z12 = this.f23092b;
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
        r2 r2Var = actionBarLayout.H;
        if (r2Var != null) {
            r2Var.onTransitionAnimationProgress(true, actionBarLayout.K0);
        }
        r2 r2Var2 = actionBarLayout.I;
        if (r2Var2 != null) {
            r2Var2.onTransitionAnimationProgress(false, actionBarLayout.K0);
        }
        r2 r2Var3 = actionBarLayout.I;
        if (r2Var3 != null) {
            num = Integer.valueOf(r2Var3.getNavigationBarColor());
        } else {
            num = null;
        }
        r2 r2Var4 = actionBarLayout.H;
        if (r2Var4 != null) {
            num2 = Integer.valueOf(r2Var4.getNavigationBarColor());
        }
        r2 r2Var5 = actionBarLayout.I;
        if (r2Var5 != null && r2Var5.isSupportEdgeToEdge() && num2 != null) {
            num = num2;
        }
        r2 r2Var6 = actionBarLayout.H;
        if (r2Var6 != null && r2Var6.isSupportEdgeToEdge() && num != null) {
            num2 = num;
        }
        if (actionBarLayout.H != null && num != null && num2 != null) {
            int f11 = i0.a.f(ee.a(actionBarLayout.K0 * 4.0f, 0.0f, 1.0f), num.intValue(), num2.intValue());
            s sVar = actionBarLayout.G;
            if (sVar != null && sVar.sheetsStack != null) {
                for (int i10 = 0; i10 < actionBarLayout.G.sheetsStack.size(); i10++) {
                    n2 n2Var = actionBarLayout.G.sheetsStack.get(i10);
                    if (n2Var.attachedToParent()) {
                        f11 = n2Var.getNavigationBarColor(f11);
                    }
                }
            }
            actionBarLayout.H.setNavigationBarColor(f11);
        }
        if (z12) {
            if (z11) {
                interpolation = actionBarLayout.M.getInterpolation(actionBarLayout.K0);
            } else {
                interpolation = ds.h.getInterpolation(actionBarLayout.K0);
            }
        } else {
            interpolation = actionBarLayout.L.getInterpolation(actionBarLayout.K0);
        }
        if (z11) {
            float a2 = ee.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.f22344s.setAlpha(a2);
            if (z12) {
                float f12 = (0.3f * interpolation) + 0.7f;
                actionBarLayout.f22344s.setScaleX(f12);
                actionBarLayout.f22344s.setScaleY(f12);
                if (actionBarLayout.J != null) {
                    float f13 = 1.0f - interpolation;
                    actionBarLayout.f22344s.setTranslationY(AndroidUtilities.dp(40.0f) * f13);
                    actionBarLayout.J.setTranslationY((-AndroidUtilities.dp(70.0f)) * f13);
                    float f14 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.J.setScaleX(f14);
                    actionBarLayout.J.setScaleY(f14);
                }
                actionBarLayout.f22341r.setAlpha((int) (46.0f * a2));
                y6.f23629s0.setAlpha((int) (a2 * 255.0f));
                actionBarLayout.f22344s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.f22344s.setTranslationX((1.0f - interpolation) * AndroidUtilities.dp(48.0f));
            }
        } else {
            float f15 = 1.0f - interpolation;
            float a10 = ee.a(f15, 0.0f, 1.0f);
            actionBarLayout.v.setAlpha(a10);
            if (z12) {
                float f16 = (f15 * 0.1f) + 0.9f;
                actionBarLayout.v.setScaleX(f16);
                actionBarLayout.v.setScaleY(f16);
                actionBarLayout.f22341r.setAlpha((int) (46.0f * a10));
                if (actionBarLayout.J == null) {
                    y6.f23629s0.setAlpha((int) (a10 * 255.0f));
                }
                actionBarLayout.f22344s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.v.setTranslationX(AndroidUtilities.dp(48.0f) * interpolation);
            }
        }
        if (actionBarLayout.K0 < 1.0f) {
            actionBarLayout.g0(z11, false, z12);
        } else {
            actionBarLayout.G(false);
        }
    }
}
