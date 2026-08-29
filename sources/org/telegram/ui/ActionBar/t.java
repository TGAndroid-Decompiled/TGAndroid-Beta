package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
public final class t implements Runnable {
    public final boolean f23785a;
    public final boolean f23786b;
    public final boolean f23787c;
    public final ActionBarLayout d;

    public t(ActionBarLayout actionBarLayout, boolean z10, boolean z11, boolean z12) {
        this.d = actionBarLayout;
        this.f23785a = z10;
        this.f23786b = z11;
        this.f23787c = z12;
    }

    @Override
    public final void run() {
        float f9;
        Integer num;
        float interpolation;
        ActionBarLayout actionBarLayout = this.d;
        if (actionBarLayout.f22702z0 != this) {
            return;
        }
        Integer num2 = null;
        actionBarLayout.f22702z0 = null;
        boolean z10 = this.f23785a;
        if (z10) {
            actionBarLayout.f22690r0 = System.currentTimeMillis();
        }
        long nanoTime = System.nanoTime() / 1000000;
        long j10 = nanoTime - actionBarLayout.B0;
        if (j10 > 40 && z10) {
            j10 = 0;
        } else if (j10 > 18) {
            j10 = 18;
        }
        actionBarLayout.B0 = nanoTime;
        boolean z11 = this.f23787c;
        boolean z12 = this.f23786b;
        if (z12 && z11) {
            f9 = 190.0f;
        } else {
            f9 = 150.0f;
        }
        float f10 = actionBarLayout.A0 + (((float) j10) / f9);
        actionBarLayout.A0 = f10;
        if (f10 > 1.0f) {
            actionBarLayout.A0 = 1.0f;
        }
        o2 o2Var = actionBarLayout.D;
        if (o2Var != null) {
            o2Var.onTransitionAnimationProgress(true, actionBarLayout.A0);
        }
        o2 o2Var2 = actionBarLayout.E;
        if (o2Var2 != null) {
            o2Var2.onTransitionAnimationProgress(false, actionBarLayout.A0);
        }
        o2 o2Var3 = actionBarLayout.E;
        if (o2Var3 != null) {
            num = Integer.valueOf(o2Var3.getNavigationBarColor());
        } else {
            num = null;
        }
        o2 o2Var4 = actionBarLayout.D;
        if (o2Var4 != null) {
            num2 = Integer.valueOf(o2Var4.getNavigationBarColor());
        }
        o2 o2Var5 = actionBarLayout.E;
        if (o2Var5 != null && o2Var5.isSupportEdgeToEdge() && num2 != null) {
            num = num2;
        }
        o2 o2Var6 = actionBarLayout.D;
        if (o2Var6 != null && o2Var6.isSupportEdgeToEdge() && num != null) {
            num2 = num;
        }
        if (actionBarLayout.D != null && num != null && num2 != null) {
            int d = i0.a.d(i7.w.a(actionBarLayout.A0 * 4.0f, 0.0f, 1.0f), num.intValue(), num2.intValue());
            s sVar = actionBarLayout.C;
            if (sVar != null && sVar.sheetsStack != null) {
                for (int i10 = 0; i10 < actionBarLayout.C.sheetsStack.size(); i10++) {
                    k2 k2Var = actionBarLayout.C.sheetsStack.get(i10);
                    if (k2Var.attachedToParent()) {
                        d = k2Var.getNavigationBarColor(d);
                    }
                }
            }
            actionBarLayout.D.setNavigationBarColor(d);
        }
        if (z12) {
            if (z11) {
                interpolation = actionBarLayout.I.getInterpolation(actionBarLayout.A0);
            } else {
                interpolation = jr.h.getInterpolation(actionBarLayout.A0);
            }
        } else {
            interpolation = actionBarLayout.H.getInterpolation(actionBarLayout.A0);
        }
        if (z11) {
            float a2 = i7.w.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.f22691s.setAlpha(a2);
            if (z12) {
                float f11 = (0.3f * interpolation) + 0.7f;
                actionBarLayout.f22691s.setScaleX(f11);
                actionBarLayout.f22691s.setScaleY(f11);
                if (actionBarLayout.F != null) {
                    float f12 = 1.0f - interpolation;
                    actionBarLayout.f22691s.setTranslationY(AndroidUtilities.dp(40.0f) * f12);
                    actionBarLayout.F.setTranslationY((-AndroidUtilities.dp(70.0f)) * f12);
                    float f13 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.F.setScaleX(f13);
                    actionBarLayout.F.setScaleY(f13);
                }
                actionBarLayout.f22689r.setAlpha((int) (46.0f * a2));
                g6.f23321s0.setAlpha((int) (a2 * 255.0f));
                actionBarLayout.f22691s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.f22691s.setTranslationX((1.0f - interpolation) * AndroidUtilities.dp(48.0f));
            }
        } else {
            float f14 = 1.0f - interpolation;
            float a10 = i7.w.a(f14, 0.0f, 1.0f);
            actionBarLayout.v.setAlpha(a10);
            if (z12) {
                float f15 = (f14 * 0.1f) + 0.9f;
                actionBarLayout.v.setScaleX(f15);
                actionBarLayout.v.setScaleY(f15);
                actionBarLayout.f22689r.setAlpha((int) (46.0f * a10));
                if (actionBarLayout.F == null) {
                    g6.f23321s0.setAlpha((int) (a10 * 255.0f));
                }
                actionBarLayout.f22691s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.v.setTranslationX(AndroidUtilities.dp(48.0f) * interpolation);
            }
        }
        if (actionBarLayout.A0 < 1.0f) {
            actionBarLayout.d0(z11, false, z12);
        } else {
            actionBarLayout.F(false);
        }
    }
}
