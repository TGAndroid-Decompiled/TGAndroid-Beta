package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class jm extends org.telegram.ui.ActionBar.o1 {
    public final km f38600x;

    public jm(km kmVar, km kmVar2) {
        super(kmVar2);
        this.f38600x = kmVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        sn snVar = this.f38600x.J0;
        org.telegram.ui.ActionBar.h5 parentLayout = snVar.getParentLayout();
        if (!snVar.f41472bb) {
            z10 = ((org.telegram.ui.ActionBar.o2) snVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.o2) snVar).inBubbleMode;
                if (!z11 && !AndroidUtilities.isInMultiwindow && parentLayout != null && snVar.Ba <= 0 && System.currentTimeMillis() - snVar.Q9 >= 250) {
                    if ((snVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).A()) && !((ActionBarLayout) parentLayout).f20641n) {
                        z12 = ((org.telegram.ui.ActionBar.o2) snVar).isPaused;
                        if (!z12 && snVar.Z5) {
                            ci.a3 a3Var = snVar.V1;
                            if (a3Var == null || !a3Var.isShowing()) {
                                gk gkVar = snVar.Y;
                                if (gkVar == null || gkVar.getTrendingStickersAlert() == null || !snVar.Y.getTrendingStickersAlert().isShowing()) {
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e(float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        org.telegram.ui.Components.c20 c20Var;
        km kmVar = this.f38600x;
        sn snVar = kmVar.J0;
        if (snVar.getParentLayout() == null || !((ActionBarLayout) snVar.getParentLayout()).f20641n) {
            snVar.I9 = f7;
            snVar.J9 = f10;
            ci.a3 a3Var = snVar.V1;
            if (a3Var == null || !a3Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                kVar.setTranslationY(f7);
                wk wkVar = snVar.f41621nb;
                if (wkVar != null) {
                    float f11 = snVar.I9;
                    rk rkVar = snVar.A1;
                    if (rkVar != null) {
                        i10 = rkVar.getCurrentHeight();
                    } else {
                        i10 = 0;
                    }
                    wkVar.setTranslationY(f11 + i10);
                }
                ei.x3 x3Var = snVar.I1;
                if (x3Var != null) {
                    x3Var.setTranslationY(f7);
                }
                ei.x3 x3Var2 = snVar.H1;
                if (x3Var2 != null) {
                    x3Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = snVar.f41476c1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                snVar.P.setTranslationY(f7 / 2.0f);
                int i11 = (int) f7;
                snVar.f41561j1.setBackgroundTranslation(i11);
                org.telegram.ui.Components.s60 s60Var = snVar.f41613n3;
                if (s60Var != null) {
                    s60Var.e(f7);
                }
                ei.g6 g6Var = snVar.K2;
                if (g6Var != null) {
                    org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) g6Var.f9079b;
                    faVar.f26259u = f7;
                    faVar.d.invalidate();
                }
                snVar.setFragmentPanTranslationOffset(i11);
                snVar.t9();
                snVar.w9();
            } else {
                kmVar.setNonNoveTranslation(f7);
            }
            snVar.f41737x0.invalidate();
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29825w;
            if (qcVar != null && snVar.f41608mc != null) {
                qcVar.l();
            }
            if (AndroidUtilities.isTablet() && (snVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.o2 lastFragment = ((LaunchActivity) snVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof ey) {
                    ey eyVar = (ey) lastFragment;
                    eyVar.f37146v1 = f7;
                    eyVar.W4();
                }
            }
            org.telegram.ui.Components.r40 r40Var = snVar.E2;
            if (r40Var != null && r40Var.getVisibility() == 0) {
                snVar.E2.f(snVar.Y.getAudioVideoButtonContainer(), false);
            }
            ak akVar = snVar.f41562j2;
            if (akVar != null && (c20Var = akVar.B0) != null) {
                c20Var.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.ie ieVar;
        sn snVar = this.f38600x.J0;
        gk gkVar = snVar.Y;
        if (gkVar != null && (ieVar = gkVar.f24170u0) != null) {
            ieVar.run();
            gkVar.f24170u0 = null;
        }
        org.telegram.ui.Components.r40 r40Var = snVar.E2;
        if (r40Var != null && r40Var.getVisibility() == 0) {
            snVar.E2.f(snVar.Y.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.rd rdVar;
        sn snVar = this.f38600x.J0;
        snVar.P4 = true;
        gk gkVar = snVar.Y;
        if (gkVar != null) {
            if (z10 && (rdVar = gkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(rdVar);
                gkVar.V.run();
            }
            org.telegram.ui.Components.ee eeVar = gkVar.W;
            if (eeVar != null) {
                AndroidUtilities.cancelRunOnUIThread(eeVar);
                gkVar.W.run();
            }
        }
        org.telegram.ui.Components.r40 r40Var = snVar.f41660r2;
        if (r40Var != null) {
            r40Var.b(false);
        }
        ei.x3 x3Var = snVar.M1;
        if (x3Var != null) {
            x3Var.e(true);
        }
    }

    @Override
    public final int i() {
        km kmVar = this.f38600x;
        sn snVar = kmVar.J0;
        if (kmVar.getKeyboardHeight() <= AndroidUtilities.dp(20.0f) && snVar.Y.q0()) {
            return snVar.Y.getEmojiPadding();
        }
        return 0;
    }
}
