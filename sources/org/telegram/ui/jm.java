package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class jm extends org.telegram.ui.ActionBar.o1 {
    public final km f38587x;

    public jm(km kmVar, km kmVar2) {
        super(kmVar2);
        this.f38587x = kmVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        sn snVar = this.f38587x.J0;
        org.telegram.ui.ActionBar.h5 parentLayout = snVar.getParentLayout();
        if (!snVar.f41469bb) {
            z10 = ((org.telegram.ui.ActionBar.o2) snVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.o2) snVar).inBubbleMode;
                if (!z11 && !AndroidUtilities.isInMultiwindow && parentLayout != null && snVar.Ba <= 0 && System.currentTimeMillis() - snVar.Q9 >= 250) {
                    if ((snVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).A()) && !((ActionBarLayout) parentLayout).f20642n) {
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
        org.telegram.ui.Components.a20 a20Var;
        km kmVar = this.f38587x;
        sn snVar = kmVar.J0;
        if (snVar.getParentLayout() == null || !((ActionBarLayout) snVar.getParentLayout()).f20642n) {
            snVar.I9 = f7;
            snVar.J9 = f10;
            ci.a3 a3Var = snVar.V1;
            if (a3Var == null || !a3Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                kVar.setTranslationY(f7);
                wk wkVar = snVar.f41618nb;
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
                FrameLayout frameLayout = snVar.f41473c1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                snVar.P.setTranslationY(f7 / 2.0f);
                int i11 = (int) f7;
                snVar.f41558j1.setBackgroundTranslation(i11);
                org.telegram.ui.Components.q60 q60Var = snVar.f41610n3;
                if (q60Var != null) {
                    q60Var.e(f7);
                }
                ei.g6 g6Var = snVar.K2;
                if (g6Var != null) {
                    org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) g6Var.f9079b;
                    daVar.f25648u = f7;
                    daVar.d.invalidate();
                }
                snVar.setFragmentPanTranslationOffset(i11);
                snVar.t9();
                snVar.w9();
            } else {
                kmVar.setNonNoveTranslation(f7);
            }
            snVar.f41734x0.invalidate();
            org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.f29196w;
            if (ocVar != null && snVar.f41605mc != null) {
                ocVar.l();
            }
            if (AndroidUtilities.isTablet() && (snVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.o2 lastFragment = ((LaunchActivity) snVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof ey) {
                    ey eyVar = (ey) lastFragment;
                    eyVar.f37121v1 = f7;
                    eyVar.W4();
                }
            }
            org.telegram.ui.Components.p40 p40Var = snVar.E2;
            if (p40Var != null && p40Var.getVisibility() == 0) {
                snVar.E2.f(snVar.Y.getAudioVideoButtonContainer(), false);
            }
            ak akVar = snVar.f41559j2;
            if (akVar != null && (a20Var = akVar.B0) != null) {
                a20Var.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.ge geVar;
        sn snVar = this.f38587x.J0;
        gk gkVar = snVar.Y;
        if (gkVar != null && (geVar = gkVar.f24171u0) != null) {
            geVar.run();
            gkVar.f24171u0 = null;
        }
        org.telegram.ui.Components.p40 p40Var = snVar.E2;
        if (p40Var != null && p40Var.getVisibility() == 0) {
            snVar.E2.f(snVar.Y.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.pd pdVar;
        sn snVar = this.f38587x.J0;
        snVar.P4 = true;
        gk gkVar = snVar.Y;
        if (gkVar != null) {
            if (z10 && (pdVar = gkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(pdVar);
                gkVar.V.run();
            }
            org.telegram.ui.Components.ce ceVar = gkVar.W;
            if (ceVar != null) {
                AndroidUtilities.cancelRunOnUIThread(ceVar);
                gkVar.W.run();
            }
        }
        org.telegram.ui.Components.p40 p40Var = snVar.f41657r2;
        if (p40Var != null) {
            p40Var.b(false);
        }
        ei.x3 x3Var = snVar.M1;
        if (x3Var != null) {
            x3Var.e(true);
        }
    }

    @Override
    public final int i() {
        km kmVar = this.f38587x;
        sn snVar = kmVar.J0;
        if (kmVar.getKeyboardHeight() <= AndroidUtilities.dp(20.0f) && snVar.Y.q0()) {
            return snVar.Y.getEmojiPadding();
        }
        return 0;
    }
}
