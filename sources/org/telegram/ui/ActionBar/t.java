package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class t implements Runnable {
    public final boolean f21331a;
    public final boolean f21332b;
    public final boolean f21333c;
    public final ActionBarLayout d;

    public t(ActionBarLayout actionBarLayout, boolean z10, boolean z11, boolean z12) {
        this.d = actionBarLayout;
        this.f21331a = z10;
        this.f21332b = z11;
        this.f21333c = z12;
    }

    @Override
    public final void run() {
        float f7;
        Integer num;
        float interpolation;
        ActionBarLayout actionBarLayout = this.d;
        if (actionBarLayout.D0 != this) {
            return;
        }
        Integer num2 = null;
        actionBarLayout.D0 = null;
        boolean z10 = this.f21331a;
        if (z10) {
            actionBarLayout.f20179v0 = System.currentTimeMillis();
        }
        long nanoTime = System.nanoTime() / 1000000;
        long j3 = nanoTime - actionBarLayout.F0;
        if (j3 > 40 && z10) {
            j3 = 0;
        } else if (j3 > 18) {
            j3 = 18;
        }
        actionBarLayout.F0 = nanoTime;
        boolean z11 = this.f21333c;
        boolean z12 = this.f21332b;
        if (z12 && z11) {
            f7 = 190.0f;
        } else {
            f7 = 150.0f;
        }
        float f10 = actionBarLayout.E0 + (((float) j3) / f7);
        actionBarLayout.E0 = f10;
        if (f10 > 1.0f) {
            actionBarLayout.E0 = 1.0f;
        }
        n2 n2Var = actionBarLayout.H;
        if (n2Var != null) {
            n2Var.onTransitionAnimationProgress(true, actionBarLayout.E0);
        }
        n2 n2Var2 = actionBarLayout.I;
        if (n2Var2 != null) {
            n2Var2.onTransitionAnimationProgress(false, actionBarLayout.E0);
        }
        n2 n2Var3 = actionBarLayout.I;
        if (n2Var3 != null) {
            num = Integer.valueOf(n2Var3.getNavigationBarColor());
        } else {
            num = null;
        }
        n2 n2Var4 = actionBarLayout.H;
        if (n2Var4 != null) {
            num2 = Integer.valueOf(n2Var4.getNavigationBarColor());
        }
        n2 n2Var5 = actionBarLayout.I;
        if (n2Var5 != null && n2Var5.isSupportEdgeToEdge() && num2 != null) {
            num = num2;
        }
        n2 n2Var6 = actionBarLayout.H;
        if (n2Var6 != null && n2Var6.isSupportEdgeToEdge() && num != null) {
            num2 = num;
        }
        if (actionBarLayout.H != null && num != null && num2 != null) {
            int d = i0.a.d(w7.p.a(actionBarLayout.E0 * 4.0f, 0.0f, 1.0f), num.intValue(), num2.intValue());
            s sVar = actionBarLayout.G;
            if (sVar != null && sVar.sheetsStack != null) {
                for (int i10 = 0; i10 < actionBarLayout.G.sheetsStack.size(); i10++) {
                    j2 j2Var = actionBarLayout.G.sheetsStack.get(i10);
                    if (j2Var.attachedToParent()) {
                        d = j2Var.getNavigationBarColor(d);
                    }
                }
            }
            actionBarLayout.H.setNavigationBarColor(d);
        }
        if (z12) {
            if (z11) {
                interpolation = actionBarLayout.M.getInterpolation(actionBarLayout.E0);
            } else {
                interpolation = pr.h.getInterpolation(actionBarLayout.E0);
            }
        } else {
            interpolation = actionBarLayout.L.getInterpolation(actionBarLayout.E0);
        }
        if (z11) {
            float a2 = w7.p.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.f20175s.setAlpha(a2);
            if (z12) {
                float f11 = (0.3f * interpolation) + 0.7f;
                actionBarLayout.f20175s.setScaleX(f11);
                actionBarLayout.f20175s.setScaleY(f11);
                if (actionBarLayout.J != null) {
                    float f12 = 1.0f - interpolation;
                    actionBarLayout.f20175s.setTranslationY(AndroidUtilities.dp(40.0f) * f12);
                    actionBarLayout.J.setTranslationY((-AndroidUtilities.dp(70.0f)) * f12);
                    float f13 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.J.setScaleX(f13);
                    actionBarLayout.J.setScaleY(f13);
                }
                actionBarLayout.f20173r.setAlpha((int) (46.0f * a2));
                j6.f20929s0.setAlpha((int) (a2 * 255.0f));
                actionBarLayout.f20175s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.f20175s.setTranslationX((1.0f - interpolation) * AndroidUtilities.dp(48.0f));
            }
        } else {
            float f14 = 1.0f - interpolation;
            float a10 = w7.p.a(f14, 0.0f, 1.0f);
            actionBarLayout.v.setAlpha(a10);
            if (z12) {
                float f15 = (f14 * 0.1f) + 0.9f;
                actionBarLayout.v.setScaleX(f15);
                actionBarLayout.v.setScaleY(f15);
                actionBarLayout.f20173r.setAlpha((int) (46.0f * a10));
                if (actionBarLayout.J == null) {
                    j6.f20929s0.setAlpha((int) (a10 * 255.0f));
                }
                actionBarLayout.f20175s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.v.setTranslationX(AndroidUtilities.dp(48.0f) * interpolation);
            }
        }
        if (actionBarLayout.E0 < 1.0f) {
            actionBarLayout.d0(z11, false, z12);
        } else {
            actionBarLayout.F(false);
        }
    }
}
