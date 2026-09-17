package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
public final class u implements Runnable {
    public final boolean f19562a;
    public final boolean f19563b;
    public final boolean f19564c;
    public final ActionBarLayout d;

    public u(ActionBarLayout actionBarLayout, boolean z10, boolean z11, boolean z12) {
        this.d = actionBarLayout;
        this.f19562a = z10;
        this.f19563b = z11;
        this.f19564c = z12;
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
        boolean z10 = this.f19562a;
        if (z10) {
            actionBarLayout.f18428v0 = System.currentTimeMillis();
        }
        long nanoTime = System.nanoTime() / 1000000;
        long j3 = nanoTime - actionBarLayout.F0;
        if (j3 > 40 && z10) {
            j3 = 0;
        } else if (j3 > 18) {
            j3 = 18;
        }
        actionBarLayout.F0 = nanoTime;
        boolean z11 = this.f19564c;
        boolean z12 = this.f19563b;
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
        o2 o2Var = actionBarLayout.H;
        if (o2Var != null) {
            o2Var.onTransitionAnimationProgress(true, actionBarLayout.E0);
        }
        o2 o2Var2 = actionBarLayout.I;
        if (o2Var2 != null) {
            o2Var2.onTransitionAnimationProgress(false, actionBarLayout.E0);
        }
        o2 o2Var3 = actionBarLayout.I;
        if (o2Var3 != null) {
            num = Integer.valueOf(o2Var3.getNavigationBarColor());
        } else {
            num = null;
        }
        o2 o2Var4 = actionBarLayout.H;
        if (o2Var4 != null) {
            num2 = Integer.valueOf(o2Var4.getNavigationBarColor());
        }
        o2 o2Var5 = actionBarLayout.I;
        if (o2Var5 != null && o2Var5.isSupportEdgeToEdge() && num2 != null) {
            num = num2;
        }
        o2 o2Var6 = actionBarLayout.H;
        if (o2Var6 != null && o2Var6.isSupportEdgeToEdge() && num != null) {
            num2 = num;
        }
        if (actionBarLayout.H != null && num != null && num2 != null) {
            int d = i0.a.d(w7.p.a(actionBarLayout.E0 * 4.0f, 0.0f, 1.0f), num.intValue(), num2.intValue());
            t tVar = actionBarLayout.G;
            if (tVar != null && tVar.sheetsStack != null) {
                for (int i10 = 0; i10 < actionBarLayout.G.sheetsStack.size(); i10++) {
                    k2 k2Var = actionBarLayout.G.sheetsStack.get(i10);
                    if (k2Var.attachedToParent()) {
                        d = k2Var.getNavigationBarColor(d);
                    }
                }
            }
            actionBarLayout.H.setNavigationBarColor(d);
        }
        if (z12) {
            if (z11) {
                interpolation = actionBarLayout.M.getInterpolation(actionBarLayout.E0);
            } else {
                interpolation = qr.h.getInterpolation(actionBarLayout.E0);
            }
        } else {
            interpolation = actionBarLayout.L.getInterpolation(actionBarLayout.E0);
        }
        if (z11) {
            float a2 = w7.p.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.f18424s.setAlpha(a2);
            if (z12) {
                float f11 = (0.3f * interpolation) + 0.7f;
                actionBarLayout.f18424s.setScaleX(f11);
                actionBarLayout.f18424s.setScaleY(f11);
                if (actionBarLayout.J != null) {
                    float f12 = 1.0f - interpolation;
                    actionBarLayout.f18424s.setTranslationY(AndroidUtilities.dp(40.0f) * f12);
                    actionBarLayout.J.setTranslationY((-AndroidUtilities.dp(70.0f)) * f12);
                    float f13 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.J.setScaleX(f13);
                    actionBarLayout.J.setScaleY(f13);
                }
                actionBarLayout.f18422r.setAlpha((int) (46.0f * a2));
                j6.f19131s0.setAlpha((int) (a2 * 255.0f));
                actionBarLayout.f18424s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.f18424s.setTranslationX((1.0f - interpolation) * AndroidUtilities.dp(48.0f));
            }
        } else {
            float f14 = 1.0f - interpolation;
            float a10 = w7.p.a(f14, 0.0f, 1.0f);
            actionBarLayout.v.setAlpha(a10);
            if (z12) {
                float f15 = (f14 * 0.1f) + 0.9f;
                actionBarLayout.v.setScaleX(f15);
                actionBarLayout.v.setScaleY(f15);
                actionBarLayout.f18422r.setAlpha((int) (46.0f * a10));
                if (actionBarLayout.J == null) {
                    j6.f19131s0.setAlpha((int) (a10 * 255.0f));
                }
                actionBarLayout.f18424s.invalidate();
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
