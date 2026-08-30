package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
public final class s implements Runnable {
    public final boolean f20568a;
    public final boolean f20569b;
    public final boolean f20570c;
    public final ActionBarLayout d;

    public s(ActionBarLayout actionBarLayout, boolean z4, boolean z10, boolean z11) {
        this.d = actionBarLayout;
        this.f20568a = z4;
        this.f20569b = z10;
        this.f20570c = z11;
    }

    @Override
    public final void run() {
        float f10;
        Integer num;
        float interpolation;
        ActionBarLayout actionBarLayout = this.d;
        if (actionBarLayout.A0 != this) {
            return;
        }
        Integer num2 = null;
        actionBarLayout.A0 = null;
        boolean z4 = this.f20568a;
        if (z4) {
            actionBarLayout.f19482s0 = System.currentTimeMillis();
        }
        long nanoTime = System.nanoTime() / 1000000;
        long j10 = nanoTime - actionBarLayout.C0;
        if (j10 > 40 && z4) {
            j10 = 0;
        } else if (j10 > 18) {
            j10 = 18;
        }
        actionBarLayout.C0 = nanoTime;
        boolean z10 = this.f20570c;
        boolean z11 = this.f20569b;
        if (z11 && z10) {
            f10 = 190.0f;
        } else {
            f10 = 150.0f;
        }
        float f11 = actionBarLayout.B0 + (((float) j10) / f10);
        actionBarLayout.B0 = f11;
        if (f11 > 1.0f) {
            actionBarLayout.B0 = 1.0f;
        }
        p2 p2Var = actionBarLayout.E;
        if (p2Var != null) {
            p2Var.onTransitionAnimationProgress(true, actionBarLayout.B0);
        }
        p2 p2Var2 = actionBarLayout.F;
        if (p2Var2 != null) {
            p2Var2.onTransitionAnimationProgress(false, actionBarLayout.B0);
        }
        p2 p2Var3 = actionBarLayout.F;
        if (p2Var3 != null) {
            num = Integer.valueOf(p2Var3.getNavigationBarColor());
        } else {
            num = null;
        }
        p2 p2Var4 = actionBarLayout.E;
        if (p2Var4 != null) {
            num2 = Integer.valueOf(p2Var4.getNavigationBarColor());
        }
        p2 p2Var5 = actionBarLayout.F;
        if (p2Var5 != null && p2Var5.isSupportEdgeToEdge() && num2 != null) {
            num = num2;
        }
        p2 p2Var6 = actionBarLayout.E;
        if (p2Var6 != null && p2Var6.isSupportEdgeToEdge() && num != null) {
            num2 = num;
        }
        if (actionBarLayout.E != null && num != null && num2 != null) {
            int d = i0.a.d(k7.n.a(actionBarLayout.B0 * 4.0f, 0.0f, 1.0f), num.intValue(), num2.intValue());
            r rVar = actionBarLayout.D;
            if (rVar != null && rVar.sheetsStack != null) {
                for (int i10 = 0; i10 < actionBarLayout.D.sheetsStack.size(); i10++) {
                    l2 l2Var = actionBarLayout.D.sheetsStack.get(i10);
                    if (l2Var.attachedToParent()) {
                        d = l2Var.getNavigationBarColor(d);
                    }
                }
            }
            actionBarLayout.E.setNavigationBarColor(d);
        }
        if (z11) {
            if (z10) {
                interpolation = actionBarLayout.J.getInterpolation(actionBarLayout.B0);
            } else {
                interpolation = nr.h.getInterpolation(actionBarLayout.B0);
            }
        } else {
            interpolation = actionBarLayout.I.getInterpolation(actionBarLayout.B0);
        }
        if (z10) {
            float a2 = k7.n.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.f19481s.setAlpha(a2);
            if (z11) {
                float f12 = (0.3f * interpolation) + 0.7f;
                actionBarLayout.f19481s.setScaleX(f12);
                actionBarLayout.f19481s.setScaleY(f12);
                if (actionBarLayout.G != null) {
                    float f13 = 1.0f - interpolation;
                    actionBarLayout.f19481s.setTranslationY(AndroidUtilities.dp(40.0f) * f13);
                    actionBarLayout.G.setTranslationY((-AndroidUtilities.dp(70.0f)) * f13);
                    float f14 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.G.setScaleX(f14);
                    actionBarLayout.G.setScaleY(f14);
                }
                actionBarLayout.f19479r.setAlpha((int) (46.0f * a2));
                j6.f20169s0.setAlpha((int) (a2 * 255.0f));
                actionBarLayout.f19481s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.f19481s.setTranslationX((1.0f - interpolation) * AndroidUtilities.dp(48.0f));
            }
        } else {
            float f15 = 1.0f - interpolation;
            float a10 = k7.n.a(f15, 0.0f, 1.0f);
            actionBarLayout.v.setAlpha(a10);
            if (z11) {
                float f16 = (f15 * 0.1f) + 0.9f;
                actionBarLayout.v.setScaleX(f16);
                actionBarLayout.v.setScaleY(f16);
                actionBarLayout.f19479r.setAlpha((int) (46.0f * a10));
                if (actionBarLayout.G == null) {
                    j6.f20169s0.setAlpha((int) (a10 * 255.0f));
                }
                actionBarLayout.f19481s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.v.setTranslationX(AndroidUtilities.dp(48.0f) * interpolation);
            }
        }
        if (actionBarLayout.B0 < 1.0f) {
            actionBarLayout.d0(z10, false, z11);
        } else {
            actionBarLayout.F(false);
        }
    }
}
