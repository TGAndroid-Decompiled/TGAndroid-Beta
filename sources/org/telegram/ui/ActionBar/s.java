package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
public final class s implements Runnable {
    public final boolean f23752a;
    public final boolean f23753b;
    public final boolean f23754c;
    public final ActionBarLayout d;

    public s(ActionBarLayout actionBarLayout, boolean z10, boolean z11, boolean z12) {
        this.d = actionBarLayout;
        this.f23752a = z10;
        this.f23753b = z11;
        this.f23754c = z12;
    }

    @Override
    public final void run() {
        float f10;
        Integer num;
        float interpolation;
        ActionBarLayout actionBarLayout = this.d;
        if (actionBarLayout.f22690z0 != this) {
            return;
        }
        Integer num2 = null;
        actionBarLayout.f22690z0 = null;
        boolean z10 = this.f23752a;
        if (z10) {
            actionBarLayout.f22678r0 = System.currentTimeMillis();
        }
        long nanoTime = System.nanoTime() / 1000000;
        long j10 = nanoTime - actionBarLayout.B0;
        if (j10 > 40 && z10) {
            j10 = 0;
        } else if (j10 > 18) {
            j10 = 18;
        }
        actionBarLayout.B0 = nanoTime;
        boolean z11 = this.f23754c;
        boolean z12 = this.f23753b;
        if (z12 && z11) {
            f10 = 190.0f;
        } else {
            f10 = 150.0f;
        }
        float f11 = actionBarLayout.A0 + (((float) j10) / f10);
        actionBarLayout.A0 = f11;
        if (f11 > 1.0f) {
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
            int d = i0.a.d(g7.n.a(actionBarLayout.A0 * 4.0f, 0.0f, 1.0f), num.intValue(), num2.intValue());
            r rVar = actionBarLayout.C;
            if (rVar != null && rVar.sheetsStack != null) {
                for (int i9 = 0; i9 < actionBarLayout.C.sheetsStack.size(); i9++) {
                    k2 k2Var = actionBarLayout.C.sheetsStack.get(i9);
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
                interpolation = gr.h.getInterpolation(actionBarLayout.A0);
            }
        } else {
            interpolation = actionBarLayout.H.getInterpolation(actionBarLayout.A0);
        }
        if (z11) {
            float a2 = g7.n.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.f22679s.setAlpha(a2);
            if (z12) {
                float f12 = (0.3f * interpolation) + 0.7f;
                actionBarLayout.f22679s.setScaleX(f12);
                actionBarLayout.f22679s.setScaleY(f12);
                if (actionBarLayout.F != null) {
                    float f13 = 1.0f - interpolation;
                    actionBarLayout.f22679s.setTranslationY(AndroidUtilities.dp(40.0f) * f13);
                    actionBarLayout.F.setTranslationY((-AndroidUtilities.dp(70.0f)) * f13);
                    float f14 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.F.setScaleX(f14);
                    actionBarLayout.F.setScaleY(f14);
                }
                actionBarLayout.f22677r.setAlpha((int) (46.0f * a2));
                f6.f23261s0.setAlpha((int) (a2 * 255.0f));
                actionBarLayout.f22679s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.f22679s.setTranslationX((1.0f - interpolation) * AndroidUtilities.dp(48.0f));
            }
        } else {
            float f15 = 1.0f - interpolation;
            float a3 = g7.n.a(f15, 0.0f, 1.0f);
            actionBarLayout.v.setAlpha(a3);
            if (z12) {
                float f16 = (f15 * 0.1f) + 0.9f;
                actionBarLayout.v.setScaleX(f16);
                actionBarLayout.v.setScaleY(f16);
                actionBarLayout.f22677r.setAlpha((int) (46.0f * a3));
                if (actionBarLayout.F == null) {
                    f6.f23261s0.setAlpha((int) (a3 * 255.0f));
                }
                actionBarLayout.f22679s.invalidate();
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
