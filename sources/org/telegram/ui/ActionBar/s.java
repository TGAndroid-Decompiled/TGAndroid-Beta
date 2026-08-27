package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

public final class s implements Runnable {

    public final boolean f23753a;

    public final boolean f23754b;

    public final boolean f23755c;
    public final ActionBarLayout d;

    public s(ActionBarLayout actionBarLayout, boolean z10, boolean z11, boolean z12) {
        this.d = actionBarLayout;
        this.f23753a = z10;
        this.f23754b = z11;
        this.f23755c = z12;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.d;
        if (actionBarLayout.f22690z0 != this) {
            return;
        }
        actionBarLayout.f22690z0 = null;
        boolean z10 = this.f23753a;
        if (z10) {
            actionBarLayout.f22678r0 = System.currentTimeMillis();
        }
        long jNanoTime = System.nanoTime() / 1000000;
        long j10 = jNanoTime - actionBarLayout.B0;
        if (j10 > 40 && z10) {
            j10 = 0;
        } else if (j10 > 18) {
            j10 = 18;
        }
        actionBarLayout.B0 = jNanoTime;
        boolean z11 = this.f23755c;
        boolean z12 = this.f23754b;
        float f10 = actionBarLayout.A0 + (j10 / ((z12 && z11) ? 190.0f : 150.0f));
        actionBarLayout.A0 = f10;
        if (f10 > 1.0f) {
            actionBarLayout.A0 = 1.0f;
        }
        n2 n2Var = actionBarLayout.D;
        if (n2Var != null) {
            n2Var.onTransitionAnimationProgress(true, actionBarLayout.A0);
        }
        n2 n2Var2 = actionBarLayout.E;
        if (n2Var2 != null) {
            n2Var2.onTransitionAnimationProgress(false, actionBarLayout.A0);
        }
        n2 n2Var3 = actionBarLayout.E;
        Integer numValueOf = n2Var3 != null ? Integer.valueOf(n2Var3.getNavigationBarColor()) : null;
        n2 n2Var4 = actionBarLayout.D;
        Integer numValueOf2 = n2Var4 != null ? Integer.valueOf(n2Var4.getNavigationBarColor()) : null;
        n2 n2Var5 = actionBarLayout.E;
        if (n2Var5 != null && n2Var5.isSupportEdgeToEdge() && numValueOf2 != null) {
            numValueOf = numValueOf2;
        }
        n2 n2Var6 = actionBarLayout.D;
        if (n2Var6 != null && n2Var6.isSupportEdgeToEdge() && numValueOf != null) {
            numValueOf2 = numValueOf;
        }
        if (actionBarLayout.D != null && numValueOf != null && numValueOf2 != null) {
            int iD = i0.b.d(h7.n.a(actionBarLayout.A0 * 4.0f, 0.0f, 1.0f), numValueOf.intValue(), numValueOf2.intValue());
            r rVar = actionBarLayout.C;
            if (rVar != null && rVar.sheetsStack != null) {
                for (int i10 = 0; i10 < actionBarLayout.C.sheetsStack.size(); i10++) {
                    j2 j2Var = actionBarLayout.C.sheetsStack.get(i10);
                    if (j2Var.attachedToParent()) {
                        iD = j2Var.getNavigationBarColor(iD);
                    }
                }
            }
            actionBarLayout.D.setNavigationBarColor(iD);
        }
        float interpolation = z12 ? z11 ? actionBarLayout.I.getInterpolation(actionBarLayout.A0) : er.h.getInterpolation(actionBarLayout.A0) : actionBarLayout.H.getInterpolation(actionBarLayout.A0);
        if (z11) {
            float fA = h7.n.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.f22679s.setAlpha(fA);
            if (z12) {
                float f11 = (0.3f * interpolation) + 0.7f;
                actionBarLayout.f22679s.setScaleX(f11);
                actionBarLayout.f22679s.setScaleY(f11);
                if (actionBarLayout.F != null) {
                    float f12 = 1.0f - interpolation;
                    actionBarLayout.f22679s.setTranslationY(AndroidUtilities.dp(40.0f) * f12);
                    actionBarLayout.F.setTranslationY((-AndroidUtilities.dp(70.0f)) * f12);
                    float f13 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.F.setScaleX(f13);
                    actionBarLayout.F.setScaleY(f13);
                }
                actionBarLayout.f22677r.setAlpha((int) (46.0f * fA));
                g6.f23314s0.setAlpha((int) (fA * 255.0f));
                actionBarLayout.f22679s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.f22679s.setTranslationX((1.0f - interpolation) * AndroidUtilities.dp(48.0f));
            }
        } else {
            float f14 = 1.0f - interpolation;
            float fA2 = h7.n.a(f14, 0.0f, 1.0f);
            actionBarLayout.v.setAlpha(fA2);
            if (z12) {
                float f15 = (f14 * 0.1f) + 0.9f;
                actionBarLayout.v.setScaleX(f15);
                actionBarLayout.v.setScaleY(f15);
                actionBarLayout.f22677r.setAlpha((int) (46.0f * fA2));
                if (actionBarLayout.F == null) {
                    g6.f23314s0.setAlpha((int) (fA2 * 255.0f));
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
