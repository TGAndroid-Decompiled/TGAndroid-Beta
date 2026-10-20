package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
public final class s implements Runnable {
    public final boolean f21690a;
    public final boolean f21691b;
    public final boolean f21692c;
    public final ActionBarLayout d;

    public s(ActionBarLayout actionBarLayout, boolean z10, boolean z11, boolean z12) {
        this.d = actionBarLayout;
        this.f21690a = z10;
        this.f21691b = z11;
        this.f21692c = z12;
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
        boolean z10 = this.f21690a;
        if (z10) {
            actionBarLayout.f20587v0 = System.currentTimeMillis();
        }
        long nanoTime = System.nanoTime() / 1000000;
        long j10 = nanoTime - actionBarLayout.F0;
        if (j10 > 40 && z10) {
            j10 = 0;
        } else if (j10 > 18) {
            j10 = 18;
        }
        actionBarLayout.F0 = nanoTime;
        boolean z11 = this.f21692c;
        boolean z12 = this.f21691b;
        if (z12 && z11) {
            f7 = 190.0f;
        } else {
            f7 = 150.0f;
        }
        float f10 = actionBarLayout.E0 + (((float) j10) / f7);
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
            int f11 = i0.a.f(w7.r.a(actionBarLayout.E0 * 4.0f, 0.0f, 1.0f), num.intValue(), num2.intValue());
            r rVar = actionBarLayout.G;
            if (rVar != null && rVar.sheetsStack != null) {
                for (int i10 = 0; i10 < actionBarLayout.G.sheetsStack.size(); i10++) {
                    j2 j2Var = actionBarLayout.G.sheetsStack.get(i10);
                    if (j2Var.attachedToParent()) {
                        f11 = j2Var.getNavigationBarColor(f11);
                    }
                }
            }
            actionBarLayout.H.setNavigationBarColor(f11);
        }
        if (z12) {
            if (z11) {
                interpolation = actionBarLayout.M.getInterpolation(actionBarLayout.E0);
            } else {
                interpolation = bs.h.getInterpolation(actionBarLayout.E0);
            }
        } else {
            interpolation = actionBarLayout.L.getInterpolation(actionBarLayout.E0);
        }
        if (z11) {
            float a2 = w7.r.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.f20583s.setAlpha(a2);
            if (z12) {
                float f12 = (0.3f * interpolation) + 0.7f;
                actionBarLayout.f20583s.setScaleX(f12);
                actionBarLayout.f20583s.setScaleY(f12);
                if (actionBarLayout.J != null) {
                    float f13 = 1.0f - interpolation;
                    actionBarLayout.f20583s.setTranslationY(AndroidUtilities.dp(40.0f) * f13);
                    actionBarLayout.J.setTranslationY((-AndroidUtilities.dp(70.0f)) * f13);
                    float f14 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.J.setScaleX(f14);
                    actionBarLayout.J.setScaleY(f14);
                }
                actionBarLayout.f20581r.setAlpha((int) (46.0f * a2));
                h6.f21261s0.setAlpha((int) (a2 * 255.0f));
                actionBarLayout.f20583s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.f20583s.setTranslationX((1.0f - interpolation) * AndroidUtilities.dp(48.0f));
            }
        } else {
            float f15 = 1.0f - interpolation;
            float a10 = w7.r.a(f15, 0.0f, 1.0f);
            actionBarLayout.v.setAlpha(a10);
            if (z12) {
                float f16 = (f15 * 0.1f) + 0.9f;
                actionBarLayout.v.setScaleX(f16);
                actionBarLayout.v.setScaleY(f16);
                actionBarLayout.f20581r.setAlpha((int) (46.0f * a10));
                if (actionBarLayout.J == null) {
                    h6.f21261s0.setAlpha((int) (a10 * 255.0f));
                }
                actionBarLayout.f20583s.invalidate();
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
